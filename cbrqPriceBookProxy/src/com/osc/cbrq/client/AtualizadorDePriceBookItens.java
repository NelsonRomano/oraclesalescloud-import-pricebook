package com.osc.cbrq.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.osc.cbrq.producao.pricebook.Conjunction;
import com.osc.cbrq.producao.pricebook.ObjectFactory;
import com.osc.cbrq.producao.pricebook.PriceBookHeader;
import com.osc.cbrq.producao.pricebook.PriceBookItem;

public class AtualizadorDePriceBookItens {
	private static String nomeArquivo;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		if (args == null || args.length == 0 || args[0] == null) {
			args = new String[1];
			System.out.println("Insira o local do arquivo CSV a ser carregado:");
			args[0] = scanner.nextLine();
		}

		nomeArquivo = args[0];
		scanner.close();
		PriceBookHeader priceBookHeader = new PriceBookHeader();
		PriceBookItem pricebookItem = new PriceBookItem();
		List<String[]> lista = new ArrayList<String[]>();

		if ((lista = lerArquivoCSV()) != null) {
			System.out.println(lista.size() + " Itens de PriceBook encontrados para processar.");

			int i = 0;

			for (String[] priceBookLinhaCSV : lista) {

				if (!isPrecoNegociacao2Preenchido(priceBookLinhaCSV[0], priceBookLinhaCSV[1])) {
					System.out.println("\nAtualizando " + (i + 1) + "º PricebookItem de " + lista.size());
					System.out.println("Atribuindo valores ao Item do PriceBook...");
					priceBookHeader.setPricebookId(Long.parseLong(priceBookLinhaCSV[0]));
					pricebookItem.setPricebookItemId(Long.parseLong(priceBookLinhaCSV[1]));
					pricebookItem.setPrecoNegociado2C(new ObjectFactory().createPriceBookItemPrecoNegociado2C(
							new BigDecimal(priceBookLinhaCSV[2])));
					priceBookHeader.getPriceBookItem().add(pricebookItem);

					try {
						new PriceBookClientProducao("usuario", "senha").updatePriceBook(priceBookHeader);
						Logger.gerarEntradaEmLogEExibir("PriceBook " + priceBookHeader.getPricebookId()
						    + " atualizado com sucesso. (PriceBookItem atualizado: " + pricebookItem.getPricebookItemId() + ")",
						    nomeArquivo, TipoLogEnum.INFO);
					}

					catch (Exception e) {
						Logger.gerarEntradaEmLogEExibir(
						    "Erro ao atualizar PriceBook. (PriceBook: " + priceBookHeader.getPricebookId() + "/PriceBookItem: "
						        + pricebookItem.getPricebookItemId() + " Motivo: " + e.getMessage() + ")",
						    nomeArquivo, TipoLogEnum.ERRO);
					}

				}

				i++;
			}

		}

	}

	public static List<String[]> lerArquivoCSV() {
		List<String[]> nomes = new ArrayList<String[]>();

		try {
			BufferedReader br = new BufferedReader(new FileReader(new File(nomeArquivo)));
			String linha = "";

			try {

				while ((linha = br.readLine()) != null) {
					nomes.add(linha.split(";", -1));
				}

				System.out.println("lendo arquivo CSV...");
				br.close();
				return nomes;
			}

			catch (IOException e) {
				e.printStackTrace();
			}

		}

		catch (FileNotFoundException e) {
			Logger.gerarEntradaEmLogEExibir("O sistema não pôde encontrar o arquivo especificado.", nomeArquivo, TipoLogEnum.ERRO);
		}

		return null;
	}

	private static boolean isPrecoNegociacao2Preenchido(String idPriceBook, String idPriceBookItem) {
		boolean ehPreenchido = false;

		try {
			PriceBookItem priceBookItem = new PriceBookClientProducao("usuario", "senha") .buscarPriceBookItemPorId(
					PriceBookClientProducao.criarFindCriteriaComChildFindCriteria(1, 0, Conjunction.AND,
			    "PricebookId", "=", idPriceBook, "PriceBookItem", 1, 0, Conjunction.AND, "PricebookItemId", "=",
			    idPriceBookItem), idPriceBook, idPriceBookItem, nomeArquivo);

			if (priceBookItem != null) {
				System.out.println("Verificando se o campo PrecoNegociado2_c do Item " + idPriceBookItem + " do PriceBook "
				    + idPriceBook + " já está preenchido...");

				if (priceBookItem.getPricebookItemId().toString().equals(idPriceBookItem)
				    && (priceBookItem.getPrecoNegociado2C() == null || priceBookItem.getPrecoNegociado2C().getValue() == null
				    || priceBookItem.getPrecoNegociado2C().equals(BigDecimal.ZERO))) {
					ehPreenchido = false;
				}

				else {
					Logger.gerarEntradaEmLogEExibir("O campo PrecoNegociado2_c do Item " + idPriceBookItem + " (PriceBook "
					    + idPriceBook + ") já está preenchido.", nomeArquivo, TipoLogEnum.INFO);
					ehPreenchido = true;
				}

				return ehPreenchido;
			}

			else {
				System.out.println("O PriceBook " + idPriceBook + " não existe.");
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

}
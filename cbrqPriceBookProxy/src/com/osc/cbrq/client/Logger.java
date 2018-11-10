package com.osc.cbrq.client;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
	private String nomeArquivo;
	
	public Logger(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	
	private void gravarEntradaEmLog(String mensagem) {

		try {
			BufferedWriter bw = new BufferedWriter(
			    new OutputStreamWriter(new FileOutputStream(new File(this.nomeArquivo + ".log"), true), "UTF-8"));
			bw.append(mensagem);
			bw.newLine();
			bw.flush();
			bw.close();
		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static void gerarEntradaEmLogEExibir(String mensagem, String nomeArquivo, TipoLogEnum tipoLogEnum) {
		
		if(tipoLogEnum.equals(TipoLogEnum.ERRO)) {
			mensagem = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()) + TipoLogEnum.ERRO.valor() + mensagem;
			new Logger(nomeArquivo).gravarEntradaEmLog(mensagem);	
			System.err.println(mensagem);
		}
		
		else {
			mensagem = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()) + TipoLogEnum.INFO.valor() + mensagem;
			new Logger(nomeArquivo).gravarEntradaEmLog(mensagem);	
			System.out.println(mensagem);
		}		
	
	}
	
}
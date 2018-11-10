package com.osc.cbrq.client;

import java.util.List;
import java.util.Map;
import javax.xml.ws.BindingProvider;
import com.osc.cbrq.producao.pricebook.Conjunction;
import com.osc.cbrq.producao.pricebook.FindControl;
import com.osc.cbrq.producao.pricebook.FindCriteria;
import com.osc.cbrq.producao.pricebook.ObjectFactory;
import com.osc.cbrq.producao.pricebook.PriceBookHeader;
import com.osc.cbrq.producao.pricebook.PriceBookItem;
import com.osc.cbrq.producao.pricebook.PriceBookService;
import com.osc.cbrq.producao.pricebook.PriceBookService_Service;
import com.osc.cbrq.producao.pricebook.ServiceException;
import weblogic.wsee.jws.jaxws.owsm.SecurityPoliciesFeature;

class PriceBookClientProducao {
	private static PriceBookService_Service priceBookService_Service = new PriceBookService_Service();
	private PriceBookService priceBookService;
	protected static ObjectFactory of = new ObjectFactory();

	public PriceBookClientProducao(String usuario, String senha) {
		System.setProperty("javax.xml.transform.TransformerFactory",
				"com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl");
		SecurityPoliciesFeature securityFeatures = new SecurityPoliciesFeature(
		    new String[] { "oracle/wss_username_token_over_ssl_client_policy" });
		this.priceBookService = priceBookService_Service.getPriceBookServiceSoapHttpPort(securityFeatures);
		Map<String, Object> reqContext = ((BindingProvider) priceBookService).getRequestContext();
		reqContext.put(BindingProvider.USERNAME_PROPERTY, usuario);
		reqContext.put(BindingProvider.PASSWORD_PROPERTY, senha);
	}

	public PriceBookHeader updatePriceBook(PriceBookHeader priceBook) throws Exception {
		return (PriceBookHeader) this.priceBookService.updatePriceBook(priceBook);
	}

	public PriceBookHeader mergePriceBook(PriceBookHeader priceBook) throws Exception {
		return (PriceBookHeader) this.priceBookService.mergePriceBook(priceBook);
	}

	public PriceBookHeader buscarPriceBookHeaderPorId(FindCriteria findCriteria, String idPriceBook, 
			String idPriceBookItem, String nomeArquivo) {
		FindControl findControl = of.createFindControl();
		findControl.setRetrieveAllTranslations(false);

		try {

			if (this.priceBookService.findPriceBook(findCriteria, findControl).size() > 0) {
				return this.priceBookService.findPriceBook(findCriteria, findControl).get(0);
			}

			return null;
		}

		catch (ServiceException e) {
			Logger.gerarEntradaEmLogEExibir("Erro ao atualizar o Item " + idPriceBookItem
					+ " do PriceBook " + idPriceBook + " devido ao fato de o mesmo conter mais de 500 registros de Itens.",
					nomeArquivo, TipoLogEnum.ERRO);
		}

		return null;
	}
	
	public PriceBookItem buscarPriceBookItemPorId(FindCriteria findCriteria, String idPriceBook, 
			String idPriceBookItem, String nomeArquivo) {
		FindControl findControl = of.createFindControl();
		findControl.setRetrieveAllTranslations(false);

		try {

			if (this.priceBookService.findPriceBook(findCriteria, findControl).get(0).getPriceBookItem().size() > 0) {
				return this.priceBookService.findPriceBook(findCriteria, findControl).get(0).getPriceBookItem().get(0);
			}

			return null;
		}

		catch (ServiceException e) {
			Logger.gerarEntradaEmLogEExibir("Erro ao atualizar o Item " + idPriceBookItem
					+ " do PriceBook " + idPriceBook + " devido ao fato de o mesmo conter mais de 500 registros de Itens.",
					nomeArquivo, TipoLogEnum.ERRO);
		}

		return null;
	}
	
	public List<PriceBookItem> getPriceBookItens(FindCriteria findCriteria) {
		FindControl findControl = of.createFindControl();
		findControl.setRetrieveAllTranslations(false);

		try {

			if (this.priceBookService.findPriceBook(findCriteria, findControl).size() > 0) {
				List<PriceBookItem> priceBookItens = this.priceBookService.findPriceBook(findCriteria, findControl).get(0)
				    .getPriceBookItem();

				if (priceBookItens.size() > 0) {
					System.out.println(priceBookItens.size() + " PriceBookItens encontrados no PriceBook "
					    + priceBookItens.get(0).getPricebookId());
				}

				if (priceBookItens != null && priceBookItens.size() > 0) {
					return priceBookItens;
				}

			}

			return null;
		}

		catch (ServiceException e) {
			e.printStackTrace();
		}

		return null;
	}
	
	public static FindCriteria criarFindCriteria(int fetchSize, int fetchStart, int i, Conjunction conjunction,
	    String attribute, String operator, String value) {
		ObjectFactory of = new ObjectFactory();
		FindCriteria fc = new FindCriteria();		
		
		fc.setFetchSize(fetchSize);
		fc.setFetchStart(fetchStart);
		
		fc.setFilter(of.createViewCriteria());
		fc.getFilter().getGroup().add(of.createViewCriteriaRow());
		fc.getFilter().getGroup().get(0).getItem().add(of.createViewCriteriaItem());
		fc.getFilter().getGroup().get(0).getItem().get(i).setConjunction(conjunction);
		fc.getFilter().getGroup().get(0).getItem().get(i).setAttribute(attribute);
		fc.getFilter().getGroup().get(0).getItem().get(i).setOperator(operator);
		fc.getFilter().getGroup().get(0).getItem().get(i).getValue().add(value);
		
		return fc;
	}
	
	public static FindCriteria criarFindCriteriaComChildFindCriteria(int fetchSize,	int fetchStart,	Conjunction conjunction,
	    String attribute, String operator, String value, String childAttrName, int fetchSizeChildFindCriteria,
	    int fetchStartChildFindCriteria, Conjunction conjunctionChildFindCriteria, String attributeChildFindCriteria,
	    String operatorChildFindCriteria, String valueChildFindCriteria) {
		ObjectFactory of = new ObjectFactory();
		FindCriteria fc = new FindCriteria();	
		
		fc.setFetchSize(fetchSize);
		fc.setFetchStart(fetchStart);
		
		fc.setFilter(of.createViewCriteria());
		fc.getFilter().getGroup().add(of.createViewCriteriaRow());
		fc.getFilter().getGroup().get(0).getItem().add(of.createViewCriteriaItem());
		fc.getFilter().getGroup().get(0).getItem().get(0).setConjunction(conjunction);
		fc.getFilter().getGroup().get(0).getItem().get(0).setAttribute(attribute);
		fc.getFilter().getGroup().get(0).getItem().get(0).setOperator(operator);
		fc.getFilter().getGroup().get(0).getItem().get(0).getValue().add(value);

		fc.getChildFindCriteria().add(of.createChildFindCriteria());
		fc.getChildFindCriteria().get(0).setChildAttrName(childAttrName);
		fc.getChildFindCriteria().get(0).setFetchSize(fetchSizeChildFindCriteria);
		fc.getChildFindCriteria().get(0).setFetchStart(fetchStartChildFindCriteria);
		
		fc.getChildFindCriteria().get(0).setFilter(of.createViewCriteria());
		fc.getChildFindCriteria().get(0).getFilter().getGroup().add(of.createViewCriteriaRow());
		fc.getChildFindCriteria().get(0).getFilter().getGroup().get(0).getItem().add(of.createViewCriteriaItem());
		fc.getChildFindCriteria().get(0).getFilter().getGroup().get(0).getItem().get(0).setConjunction(conjunctionChildFindCriteria);
		fc.getChildFindCriteria().get(0).getFilter().getGroup().get(0).getItem().get(0).setAttribute(attributeChildFindCriteria);
		fc.getChildFindCriteria().get(0).getFilter().getGroup().get(0).getItem().get(0).setOperator(operatorChildFindCriteria);		
		fc.getChildFindCriteria().get(0).getFilter().getGroup().get(0).getItem().get(0).getValue().add(valueChildFindCriteria);
		
		return fc;
	}

	public static FindCriteria criarFindCriteria(int fetchSize, int fetchStart, List<String> findAttributes) {
		FindCriteria fc = new FindCriteria();
		fc.setFetchSize(fetchSize);
		fc.setFetchStart(fetchStart);

		for (String findAttribute : findAttributes) {
			fc.getFindAttribute().add(findAttribute);
		}

		return fc;
	}

	public void deletarPriceBookItem(PriceBookItem priceBookItem) {

		try {
			this.priceBookService.deletePriceBookItem(priceBookItem);
			System.out.println("PriceBookItem " + priceBookItem.getPricebookItemId() + " excluído com sucesso do PriceBook "
			    + priceBookItem.getPricebookId());
		}

		catch (ServiceException e) {
			System.err.println("Houve um erro ao tentar excluir PriceBookItem " + priceBookItem.getPricebookItemId() + ":");
			System.err.println(e.getMessage());
		}

	}

}
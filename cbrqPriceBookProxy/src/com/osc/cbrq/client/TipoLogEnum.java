package com.osc.cbrq.client;

public enum TipoLogEnum {
	ERRO(" ERRO: "),
	INFO(" INFO: ");
	
	private final String valor;

	TipoLogEnum(String v) {
		valor = v;
	}

	public String valor() {
		return valor;
	}

}
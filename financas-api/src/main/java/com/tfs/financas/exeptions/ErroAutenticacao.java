package com.tfs.financas.exeptions;

public class ErroAutenticacao extends RuntimeException{
	
	public ErroAutenticacao(String mensagem) {
		super(mensagem);
	}

}

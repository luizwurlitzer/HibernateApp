package com.abctreinamentos2;
// Generated 03/03/2020 15:48:14 by Hibernate Tools 4.3.1


/**
 * PagamentoId generated by hbm2java
 */
public class PagamentoId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long cpf;
	private long cdCurso;

	public PagamentoId() {
	}

	public PagamentoId(long cpf, long cdCurso) {
		this.cpf = cpf;
		this.cdCurso = cdCurso;
	}

	public long getCpf() {
		return this.cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public long getCdCurso() {
		return this.cdCurso;
	}

	public void setCdCurso(long cdCurso) {
		this.cdCurso = cdCurso;
	}

	
}
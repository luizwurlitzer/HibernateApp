package com.abctreinamentos2;
// Generated 03/03/2020 15:48:14 by Hibernate Tools 4.3.1

/**
 * Pagamento generated by hbm2java
 */
public class Pagamento implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PagamentoId id;
	private String dtInscricao;

	public Pagamento() {
	}

	public Pagamento(PagamentoId id, String dtInscricao) {
		this.id = id;
		this.dtInscricao = dtInscricao;
	}

	public PagamentoId getId() {
		return this.id;
	}

	public void setId(PagamentoId id) {
		this.id = id;
	}

	public String getDtInscricao() {
		return this.dtInscricao;
	}

	public void setDtInscricao(String dtInscricao) {
		this.dtInscricao = dtInscricao;
	}

	@Override
	public String toString() {
		return "Pagamento [Codigo="+id.getCdCurso()+"CPF="+id.getCpf()+" Data Inscri��o="+dtInscricao+"]";
	}
}

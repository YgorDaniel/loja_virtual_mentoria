package jdev.mentoria.lojavirtual.enums;

public enum StatusContaPagar {
	
	
	COBRACA("Pagar"),
	VENCIDA("Vencida"),
	ABERTA("Aberta"),
	NEGOCIADA("Renegociada"),
	ALUGUEL("Aluguel"),
	FUNCIONARIO("Funcionário"),
	QUITADA("Quitada");
	
	private String descricao;
	
	private StatusContaPagar(String descricao) {
		this.descricao = descricao;
	
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {		
		return this.descricao;
	}
}

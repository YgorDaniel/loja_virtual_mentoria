package jdev.mentoria.lojavirtual.enums;

public enum TipoEndereco {

	COBRANCA("Cobraça"), ENTRAGA("Entrega");

	private String descricao;

	private TipoEndereco(String descricao) {
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

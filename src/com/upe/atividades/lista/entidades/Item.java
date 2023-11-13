package com.upe.atividades.lista.entidades;

import java.util.Objects;

public class Item {
	
	private String nomeItem;
	private Integer quantidadeItem;
	
	public Item(String nomeItem, Integer quantidadeItem) {
		this.nomeItem = nomeItem;
		this.quantidadeItem = quantidadeItem;
	}

	public String getNomeItem() {
		return nomeItem;
	}

	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}

	public Integer getQuantidadeItem() {
		return quantidadeItem;
	}

	public void setQuantidadeItem(Integer quantidadeItem) {
		this.quantidadeItem = quantidadeItem;
	}

	@Override
	public String toString() {
		return "Item [nomeItem=" + nomeItem + ", quantidadeItem=" + quantidadeItem + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(nomeItem, other.nomeItem) && Objects.equals(quantidadeItem, other.quantidadeItem);
	}
	
	
	
}

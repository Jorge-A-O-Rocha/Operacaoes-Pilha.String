package model;

public class Pilha {
	No topo;
	public Pilha() {
		topo = null;
	}	
	public boolean isEmpty() {
		if (topo == null) {
			return true;
		} else {
				return false;
			}
		}
		
	public void push (String e) {
		No elemento = new No();
		elemento.dado = e;
		if (isEmpty()) {
			topo = elemento;
		} else {
			elemento.proximo = topo;
			topo = elemento;
		}
	}
		
	public String pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Pilha vazia");
		}
		
		String valor = topo.dado;
		topo = topo.proximo;	
		return valor;
	}	
	public String top() throws Exception {
		if (isEmpty()) {
			throw new Exception("Pilha vazia");
		}
			return topo.dado;
		}

	public int size() {
		int cta = 0;
		if (!isEmpty()) {
			No auxiliar = topo;
			cta = 1;
			while (auxiliar.proximo != null) {
				cta++;
				auxiliar = auxiliar.proximo;
			}
		}
		return cta;
	}
}

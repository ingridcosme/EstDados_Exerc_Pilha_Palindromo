/*
 * Criar  um  projeto  Java  (Palindromos)  e  importe  a  biblioteca  PilhaStrings.  
 * Esse  novo  projeto irá  receber  uma  cadeia  de  Strings  do  usuário  e  de_
 * monstrar  para  ele  se  essa  palavra se trata ou não de um Palíndromo. Palín_
 * dromo  é  uma  cadeia  de  caracteres  que  se  lê  da  direita  para  a  esquer_
 * da  e  da  esquerda para a direita e a sequência de caracteres é a mesma, como 
 * em arara, ovo, subinoonibus, por exemplo.
 * A classe PalindromoController no package controller deve ter 2 métodos:
 * •O método invertePalavra que recebe um String e retorna o String invertido. Os 
 * métodos push(), pop(), isEmpty() devem ser usados para esse fim;
 * •O método comparaPalavras, que recebe o String, o String já invertido e retorna 
 * um boolean (True para Palíndromo e False para Não Palíndromo).
 * A classe Principal, no package view, no seu método Main, deve inicializar uma pilha 
 * e exibir a possibilidade de o usuário inserir uma cadeia de Strings e retornar a 
 * ele se é ou não um palíndromo. Todos os métodos devem receber a pilha criada no 
 * método Main como parâmetro.
 */

package controller;

import br.edu.fateczl.ingridcosme.pilhastring.Pilha;

public class PalindromoController {

	public PalindromoController() {
		super();
	}

	public String invertePalavra(Pilha p, String palavra) throws Exception {
		String pInvertida = "";
		
		while(palavra.length() > 0) {
			p.push(palavra.substring(0, 1));  //Empilha a primeira letra
			palavra = palavra.substring(1);  //palavra recebe uma substring de palavra sem a primeira letra
		}
		
		while(!p.isEmpty()) {
			pInvertida += p.pop();  //Desempilhando e compondo a palavra invertida
		}
		return pInvertida;
	}
	
	public boolean comparaPalavras(String palavra, String pInvertida) {
		if(palavra.equals(pInvertida)) {
			return true;  //Caso as strings sejam iguais
		} else {
			return false;  //Caso as strings sejam diferentes
		}
	}
}

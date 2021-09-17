/*
 * Criar  um  projeto  Java  (Palindromos)  e  importe  a  biblioteca  PilhaStrings.  
 * Esse  novo  projeto ir�  receber  uma  cadeia  de  Strings  do  usu�rio  e  de_
 * monstrar  para  ele  se  essa  palavra se trata ou n�o de um Pal�ndromo. Pal�n_
 * dromo  �  uma  cadeia  de  caracteres  que  se  l�  da  direita  para  a  esquer_
 * da  e  da  esquerda para a direita e a sequ�ncia de caracteres � a mesma, como 
 * em arara, ovo, subinoonibus, por exemplo.
 * A classe PalindromoController no package controller deve ter 2 m�todos:
 * �O m�todo invertePalavra que recebe um String e retorna o String invertido. Os 
 * m�todos push(), pop(), isEmpty() devem ser usados para esse fim;
 * �O m�todo comparaPalavras, que recebe o String, o String j� invertido e retorna 
 * um boolean (True para Pal�ndromo e False para N�o Pal�ndromo).
 * A classe Principal, no package view, no seu m�todo Main, deve inicializar uma pilha 
 * e exibir a possibilidade de o usu�rio inserir uma cadeia de Strings e retornar a 
 * ele se � ou n�o um pal�ndromo. Todos os m�todos devem receber a pilha criada no 
 * m�todo Main como par�metro.
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

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

package view;

import javax.swing.JOptionPane;
import br.edu.fateczl.ingridcosme.pilhastring.Pilha;
import controller.PalindromoController;

public class Principal {

	public static void main(String[] args) {
		Pilha pilhaP = new Pilha();
		PalindromoController pCont = new PalindromoController();
		
		String entrada = "";
		String eInvertida = "";
		
		int opc=0;
        do{
        	StringBuffer buffer = new StringBuffer();
        	buffer.append("Palindromo\n");
        	buffer.append("O que voc� gostaria de fazer?");
        	buffer.append("\n------------------------------------------------");
        	buffer.append("\n1 - Inserir uma palavra ou frase");
        	buffer.append("\n2 - Verificar se � pal�ndromo");
        	buffer.append("\n9 - Finalizar a aplica��o");
        	String opcStr = JOptionPane.showInputDialog(buffer.toString());
        	opc = Integer.parseInt(opcStr);
        	
            switch(opc){
                case 1: entrada = JOptionPane.showInputDialog("Digite uma palavra"
                		+ " ou cadeia de caracteres: ");
                		
                		try {
                			eInvertida = pCont.invertePalavra(pilhaP, entrada);
                		} catch (Exception e) {
                			e.printStackTrace();
                		}
                        break;
                case 2: if(pCont.comparaPalavras(entrada, eInvertida)) {
                			JOptionPane.showMessageDialog(null, "� pal�ndromo!\n"
                					+"Entrada: "+entrada+"\nInvertido: "+eInvertida);
                		} else {
                			JOptionPane.showMessageDialog(null, "N�o � pal�ndromo!\n"
                					+"Entrada: "+entrada+"\nInvertido: "+eInvertida);
                		}
                        break;
                case 9: System.out.print("\n\nAplica��o Finalizada!");
                        break;
                default: JOptionPane.showMessageDialog(null, "Op��o inv�lida!");
            }
        }
        while(opc != 9);
	}

}

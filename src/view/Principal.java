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
        	buffer.append("O que você gostaria de fazer?");
        	buffer.append("\n------------------------------------------------");
        	buffer.append("\n1 - Inserir uma palavra ou frase");
        	buffer.append("\n2 - Verificar se é palíndromo");
        	buffer.append("\n9 - Finalizar a aplicação");
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
                			JOptionPane.showMessageDialog(null, "É palíndromo!\n"
                					+"Entrada: "+entrada+"\nInvertido: "+eInvertida);
                		} else {
                			JOptionPane.showMessageDialog(null, "Não é palíndromo!\n"
                					+"Entrada: "+entrada+"\nInvertido: "+eInvertida);
                		}
                        break;
                case 9: System.out.print("\n\nAplicação Finalizada!");
                        break;
                default: JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
        while(opc != 9);
	}

}

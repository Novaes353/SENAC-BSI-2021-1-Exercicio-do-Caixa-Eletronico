/* Crie um algoritmo de caixa eletrônico que dispense o menor número de notas para um dado valor solicitado.

Notas disponíveis: R$ 100,00 R$ 50,00 R$ 20,00 R$ 10,00 R$ 5,00 R$ 2,00 R$ 1,00
Enviar a resposta via Pull Request! 
 */
package senac.bsi;
import java.util.Scanner;


/**
 *
 * Gabriel Novaes 
 */
public class NewClass {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    
    double n100, n50, n20, n10, n5, n2, n1, r;
    int saq;
    
    System.out.print("Digite aqui o valor do saque:");
    saq=leitor.nextInt();
    
    n100= saq / 100;
    
    n50= saq / 50;
    
    n20= saq / 20;
    
    n10= saq / 10;
    
    n5= saq / 5;
    
    n2= saq / 2;
    
    n1= saq / 1;
    
    System.out.print("");
    
    }
}
    
   
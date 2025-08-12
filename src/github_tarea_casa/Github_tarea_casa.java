
package github_tarea_casa;
import java.util.Scanner;

/**
 *
 * @author Jonatan
 */
public class Github_tarea_casa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num1, num2, tot;
        System.out.println("Suma dos numeros");
        System.out.println("Ingrese dos numeros: ");
        Scanner lectura = new Scanner(System.in);
        num1 = lectura.nextDouble();
        num2 = lectura.nextDouble();
        tot = num1 + num2;
        System.out.println("El resultado es: " + tot);
    }
    
}

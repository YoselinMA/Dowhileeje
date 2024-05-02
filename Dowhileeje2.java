import java.util.Scanner;
public class Dowhileeje2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero: ");
        numero = sc.nextInt();

        do {
              
            System.out.println("El cuadrado de "+ numero +" es "+ numero * numero);
            numero ++;

        } while (numero <= 10); 
        
    } 
}

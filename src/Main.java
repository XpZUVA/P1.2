import java.math.BigInteger;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        String digitosControl;
        BigInteger ccc;
        Scanner scanner = new Scanner(System.in);
        char cont = 's';



        do{
            digitosControl = "";
            ccc = BigInteger.ZERO;

            System.out.println("Introduce los dígitos (4) de control para identificar el país:");
            digitosControl = scanner.nextLine();
            System.out.println("Introduce el número de cuenta:");
            ccc = scanner.nextBigInteger();
            ccc = ccc.multiply(BigInteger.valueOf(1000000));
            int aux1 = (int) (digitosControl.charAt(0) - 55) * 10000 + (digitosControl.charAt(1) - 55) * 100 + digitosControl.charAt(2) * 10 + digitosControl.charAt(3);
            ccc = ccc.add(BigInteger.valueOf(aux1));

            IBAN cuenta1 = new IBAN(ccc);
            cuenta1.crearIBAN();
            System.out.println("El IBAN de la cuenta es: " + cuenta1.getIbanCod());

            System.out.println("¿Quieres introducir otra cuenta? (s/n)");
            cont = scanner.next().charAt(0);


        }while(cont == 's' || cont == 'S');
    }


    public static void transformarDC(String digitosControl){






    }
}
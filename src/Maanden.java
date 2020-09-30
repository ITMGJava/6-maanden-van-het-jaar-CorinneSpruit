import java.util.Scanner;

public class Maanden {
    public static void main(String[] args) {


        System.out.println("Kies een getal tussen de 1 en 12");

        var x = new Scanner(System.in);

        var invoer = x.nextInt();

        switch (invoer){

            case 1:
            System.out.println(invoer+" is de maand januari");
            break;

            case 2:
                System.out.println(invoer+" is de maand februari");
                break;

            case 3:
                System.out.println(invoer+" is de maand maart");
                break;

            case 4:
                System.out.println(invoer+" is de maand april");
                break;

            case 5:
            System.out.println(invoer+" is de maand mei");
                break;

            case 6:
                System.out.println(invoer+" is de maand juni");
                break;

            case 7:
                System.out.println(invoer+" is de maand juli");
                break;

            case 8:
                System.out.println(invoer+" is de maand augustus");
                break;

            case 9:
                System.out.println(invoer+" is de maand september");
                break;

            case 10:
                System.out.println(invoer+" is de maand oktober");
                break;

            case 11:
                System.out.println(invoer+" is de maand november");
                break;

            case 12:
                System.out.println(invoer+" is de maand december");
                break;

            default:

System.out.println(invoer+" is geen geldige invoer");

        }





    }
}

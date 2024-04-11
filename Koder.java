import java.util.Scanner;

public class Koder {
    public static void main(String[] args) {

        System.out.println("Vvedi parolj для регистрации : ");
        String registrationPassword = new Scanner(System.in).nextLine();

//        while (true) {
        {
            System.out.println("Hotitew podskazku? da или net");
            String choice = new Scanner(System.in).nextLine();

            if (choice.equals("da")) {
                System.out.println("Vvedi togda ee: ");
                String podskazka = new Scanner(System.in).nextLine();
                System.out.println(podskazka);
                vhod(registrationPassword);

            } else if (choice.equals("net")) {
                vhod(registrationPassword);
            }
            else {

            }
        }
    }


    public static void vhod(String registrationPassword) {


        while (true) {
            System.out.println("Vvedi parolj для входа : ");
            String password = new Scanner(System.in).nextLine();
            if (registrationPassword.equals(password)) {
                break;
            } else {
                System.out.println("Parolj ne verni");
            }

        }
    }

}

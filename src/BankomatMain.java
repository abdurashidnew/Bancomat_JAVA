import java.util.Scanner;

public class BankomatMain {
    public static void main(String[] args) {
        int a = 0;
        BancomatLOGIC bankomat = new BancomatLOGIC();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add money");
            System.out.println("2. Cash withdrawal");
            System.out.println("3. View balance");
            System.out.println("4. Change sms number");
            System.out.println("5. View sms number");
            System.out.println("6. Change pin code");
            System.out.println("7. Exit bancomat");
            int buyruq = scanner.nextInt();

            switch (buyruq) {
                case 1 -> {
                    bankomat.addPayments();
                }
                case 2 -> {
                    bankomat.withdrawalCash();
                }
                case 3 -> {
                    bankomat.viewBalance();
                }
                case 4 -> {
                    bankomat.setSmsMessage();
                }
                case 5 -> {
                    bankomat.currentSms();
                }
                case 6 -> {
                    bankomat.setPinCode();
                }
                case 7 -> {
                    a = 1;
                }

            }
            if (a == 1) {
                System.out.println("Exiting successful");
                break;
            }
        }

    }
}

import java.util.Scanner;

public class BancomatLOGIC {
    Scanner scanner = new Scanner(System.in);
    BankomatFIELD bankomat = new BankomatFIELD();

    public void addPayments() {
        System.out.print("Enter pin code: ");
        Integer userPinCode = scanner.nextInt();
        if (userPinCode.equals(bankomat.getPinCode())) {
            System.out.print("Write amount: ");
            bankomat.addCash();
            System.out.println("Dear customer, your money has been received");
        } else {
            System.out.println("Pin code you entered is incorrect");
        }
    }


    public void withdrawalCash() {
        System.out.print("Enter pin code: ");
        Integer userPinCode = scanner.nextInt();
        if (userPinCode.equals(bankomat.getPinCode())) {
            if (!(bankomat.getBalance() < 0)) {
                bankomat.withdrawalCash();
            } else {
                System.out.println("Insufficient funds");
            }
        } else {
            System.out.println("Pin code incorrect!");
        }
    }


    public void viewBalance() {
        System.out.println("Your balance: " + bankomat.getBalance() + " UZS");
    }


    public String setSmsMessage() {
        System.out.print("Enter pin code: ");
        Integer userPinCode = scanner.nextInt();
        if (userPinCode.equals(bankomat.getPinCode())) {
            System.out.println("Enter phone number: ");
            Long number = scanner.nextLong();
            bankomat.setSmsMessage(number);
            System.out.println("Completed successfully");
        } else {
            System.out.println("Pin code incorrect!");
        }
        return "";
    }

    public String setPinCode() {
        System.out.print("Enter pin code: ");
        Integer userPinCode = scanner.nextInt();
        if (userPinCode.equals(bankomat.getPinCode())) {
            System.out.println("Enter new pin code");
            Integer newPin = scanner.nextInt();
            System.out.println("Enter retry new pin code");
            Integer newPin2 = scanner.nextInt();
            if (newPin.equals(newPin2)) {
                bankomat.setPinCode(newPin2);
                System.out.println("Pin code change successful");
            } else {

                System.out.println("Dear customer try again!");
            }
        }
        return "";
    }

    public String currentSms() {
        System.out.print("Enter pin code: ");
        Integer userPinCode = scanner.nextInt();
        if (userPinCode.equals(bankomat.getPinCode())) {
            System.out.println("Your balance: " + bankomat.getSmsMessage());
        }
        return "";
    }


}

import java.util.Scanner;

public class BankomatFIELD {
    Scanner scanner = new Scanner(System.in);
    private Long balance = 1000000L;
    private Integer pinCode = 7787;
    private Long smsMessage = 7077787L;

    public BankomatFIELD(Long balance) {
        this.balance = balance;
    }

    public BankomatFIELD() {
    }


    public void withdrawalCash() {

        System.out.print("Enter amount: ");
        long sum = scanner.nextLong();
        long foiz = sum + (sum / 100);
        if (foiz <= balance) {
            balance -= foiz;
            System.out.println("******************************************************************");
            System.out.println("Dear from your card " + foiz + " UZS removed");
            System.out.println("Dear customer, Your application is successfully completed");
            System.out.println("******************************************************************");
        } else {
            System.out.println("Insufficient funds");
        }

    }

    public void addCash() {

        long sum = scanner.nextLong();
        balance += sum;
    }

    public Long getBalance() {
        return balance;
    }


    public Integer getPinCode() {
        return pinCode;
    }

    public void setPinCode(Integer pinCode) {
        this.pinCode = pinCode;
    }

    public Long getSmsMessage() {
        return smsMessage;
    }

    public void setSmsMessage(Long smsMessage) {
        this.smsMessage = smsMessage;
    }
}

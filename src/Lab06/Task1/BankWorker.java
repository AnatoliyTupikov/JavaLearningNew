package Lab06.Task1;

public class BankWorker extends Human implements CanChangeBank {
    private String bankName;

    public BankWorker(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public void print() {
        System.out.println("Bank worker:" + "\n First Name: " + this.getFirstName() + "\n Last Name: " + this.getLastName() + "\n Bank Name: " + this.bankName);
    }

    @Override
    public void changeBank(String newBankName) {
        bankName = newBankName;
    }
}

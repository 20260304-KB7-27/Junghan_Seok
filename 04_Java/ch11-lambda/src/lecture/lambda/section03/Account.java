package lecture.lambda.section03;

public class Account {
    private String ownername;
    private int balance;

    public Account(String ownername) {
        this.ownername = ownername;
    }

    @ Override
    public String toString() {
        return "Account {ownername=" + ownername + ", balance=" + balance + "}";
    }
}

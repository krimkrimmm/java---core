package interface_lesson.bvn2.entities;

public class Account {
    private String name;
    private int accountNumber;
    private String email;

    private float accountBalance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Account(String name, int accountNumber, String email, float accountBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.email = email;
        this.accountBalance = accountBalance;

    }
    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", accountNumber=" + accountNumber +
                ", email='" + email + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}

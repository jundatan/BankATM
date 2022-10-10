//Account class for the Banking ATM
public class Account {
    private String name;
    private int curr_savings;
    private int total_withdrawn;

    /**
     * Constructor for the class Account.
     */
    public Account(String name) {
        this.name = name;
        this.curr_savings = 0;
        this.total_withdrawn = 0;
    }


    /**
     * Withdrawing of amount from this bank account.
     * @param amt
     */
    public void withdraw(int amt) {
        if (this.curr_savings - amt > 0) {
            this.curr_savings = this.curr_savings - amt;
            this.total_withdrawn = this.total_withdrawn + amt;
        } else {
            System.out.println("------------------------");
            System.out.println("Insufficient Amount.");
        }
    }

    /**
     * Depositing of money into this bank account.
     * @param amt
     */
    public void deposit(int amt) {
        this.curr_savings = this.curr_savings + amt;
    }

    /**
     * Return the name of the person for this bank instance.
     * @return The name of this instance.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Override toString method.
     */
    @Override
    public String toString() {
        return "Amount savings: " + curr_savings + "\n" + "Total withdrawn: " + total_withdrawn;
    }
}

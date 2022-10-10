import java.util.HashMap;

public class DataStorage {
    private HashMap<String, Account> bank_acc = new HashMap<String, Account>();
    
    /**
     * Returns the bank account of the name. Returns null if there is none.
     * @param name
     * @return The bank account instance of the name.
     */
    public Account searchBank(String name) {
        return bank_acc.get(name);
    }

    /**
     * Input the new acc (value) and name (key).
     * @param acc
     * @param name
     */
    public void input(Account acc, String name) {
        bank_acc.put(name, acc);
    }
}

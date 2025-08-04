
package banking;


public class bankapp {

    int accountNo = 000025;
    String name;
    float initialBalance = 0;
    int pin = 12345;

    public boolean verifyAccount(int acc, int pn) {

        if (acc == accountNo && pn == pin) {
            return true;
        } else {
            return false;
        }
    }

    public int setAccount() {
        return accountNo;
    }

    public void viewBalance() {

    }

}

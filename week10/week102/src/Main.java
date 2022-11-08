
public class Main {

    public static void main(String[] args) {
        CheckingAccount acct1 = new CheckingAccount(1000, "A0001", 500);
        Customer cust = new Customer("Sompong", "Sookjai", acct1);
        try {
            cust.getAcct().deposit(500);
//            System.out.println(cust.getAcct());
            cust.getAcct().withdraw(1800);
//            System.out.println(cust.getAcct());
            cust.getAcct().withdraw(300);
            cust.getAcct().deposit(1000);
            cust.getAcct().withdraw(200);
        } catch (WithdrawException ex) { // catche withdraw exception user doesn't has enogh money.
            System.out.println(ex);
        } finally{
            System.out.println("Thak you.");
        }

    }
}

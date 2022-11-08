
public class CheckingAccount extends Account {

    private double credit;

    public CheckingAccount() {
        super(0, "");
        this.credit = 0;
    }

    // Overload
    public CheckingAccount(double balance, String name, double credit) {
        super(balance, name);
        this.credit = credit;
    }

    public void setCredit(double credit) {
        if (credit > 0) {
            this.credit = credit;
        } else {
            System.out.println("Input number must be a positive integer.");
        }
    }

    public double getCredit() {
        return this.credit;
    }

    @Override
    public void withdraw(double a) throws WithdrawException {
        if (a > 0) {
            boolean condition1 = getBalance() - a >= 0;
            boolean condition2 = (getBalance() - a < 0) && (getBalance() - a + getCredit() >= 0);
            boolean condition3 = (getBalance() - a < 0) && (getBalance() - a + getCredit() < 0);

            if (condition1) {
                setBalance(getBalance() - a);
                System.out.println(a + " baht is withdrawn from " + getName() + " and your credit balance is " + getCredit() + ".");
            } else if (condition2) {
                setCredit(getCredit() + (getBalance() - a));
                setBalance(0);
                System.out.println(a + " baht is withdrawn from " + getName() + " and your credit balance is " + getCredit() + ".");
            } else if (condition3) {
//                System.out.println("Not enough money!");
                throw new WithdrawException("Account " + this.getName() + " has not enough money!");

            }
        }

    }

    //overload
//    public void withdraw(String a) {
//        try {
//            withdraw(Double.parseDouble(a));
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//    }

    @Override
    public String toString() {
        return "The " + getName() + " account has " + getBalance() + " baht and " + getCredit() + " credits.";
    }
}

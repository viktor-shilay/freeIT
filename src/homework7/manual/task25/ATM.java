package homework7.manual.task25;

public class ATM {
    private int quantity100;
    private int quantity50;
    private int quantity20;

    public ATM(int quantity100, int quantity50, int quantity20) {
        this.quantity100 = quantity100;
        this.quantity50 = quantity50;
        this.quantity20 = quantity20;
    }

    public int ATMBalance() {
        return quantity100 * 100 + quantity50 * 50 + quantity20 * 20;
    }

    public void addBanknotes(int quantity100, int quantity50, int quantity20) {
        this.quantity100 += quantity100;
        this.quantity50 += quantity50;
        this.quantity20 += quantity20;
    }

    public boolean cashWithdraw(int cashSum) {                //Топорное решение)
        if (cashSum <= ATMBalance()) {
            if (cashSum % 100 != 10 & cashSum % 100 != 30) {
                int q100 = cashSum / 100;
                int q50 = (cashSum - q100 * 100) / 50;
                if (cashSum % 100 == 60 | cashSum % 100 == 80) {
                    q50 = ((cashSum - q100 * 100) / 50) - 1;
                }
                int q20 = (cashSum - q100 * 100 - q50 * 50) / 20;
                if (checkBanknotes(q100, q50, q20)) {
                    quantity100 -= q100;
                    quantity50 -= q50;
                    quantity20 -= q20;
                    System.out.println("Take your money: " + q100 + "x100 BYN, " + q50 + "x50 BYN, " + q20 + "x20 BYN.");
                    System.out.println("Operation completed!");
                    return true;
                } else {
                    System.out.println("Not enough banknotes in the ATM!");
                    return false;
                }
            } else {
                System.out.println("Enter another amount of money! (multiply 20, 50, 100)");
                return false;
            }
        } else {
            System.out.println("There is not enough money in the ATM!");
            return false;
        }
    }

    private boolean checkBanknotes(int q100, int q50, int q20) {
        return quantity100 > q100 && quantity50 > q50 && quantity20 > q20;
    }
}

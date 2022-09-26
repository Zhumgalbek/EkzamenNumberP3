public class BankAccount {
    private double amount;

    public double getAmount() {// возвращает текущий остаток на счете
        System.out.println("your card balance :");
        return amount;
    }

    public void desposit(double sum) throws LimintExcoption {  // положить деньги на счет
        if (sum > 60000) {
            throw new LimintExcoption("Above 60000 can not be set ", amount);
        } else if (amount <= 60000) {
            amount += sum;
        }
    }

    public void withDraw(int sum) throws LimintExcoption {    // cнимает указанную сумму со счета.
        if (sum <= 55000) {
            amount -= sum;
        } else {
            System.out.println("You can withdraw maximum 55000 !! ");
        }
    }
}

public class LimintExcoption extends Exception{
    private String message;
    private double remainingAmount;

    public LimintExcoption(String message, double remainingAmount) {
        this.message = message;
        this.remainingAmount = remainingAmount;
    }

    public void getRemainingAmout() {
        System.out.println(message);
        System.out.println(remainingAmount);

    }
}

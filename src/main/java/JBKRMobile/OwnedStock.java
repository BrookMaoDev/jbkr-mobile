package JBKRMobile;

public class OwnedStock {
    private String ticker;
    private int quantity;

    public OwnedStock(String ticker, int quantity) {
        this.ticker = ticker;
        this.quantity = quantity;
    }

    // Accessors
    public String getTicker() {
        return ticker;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int amount) {
        quantity += amount;
    }

    /**
     * Subtracts an int from quantity. If amount is greater than quantity, then
     * returns false before subtracting.
     * Otherwise, returns true
     * 
     * @param amount int
     */
    public boolean subtractQuantity(int amount) {
        if (quantity - amount < 0) {
            return false;
        }
        quantity -= quantity;
        return true;
    }

    public String toString() {
        return ticker + ": " + quantity;
    }
}

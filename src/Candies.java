public class Candies {
    int price;
    int sugar;

    public Candies() {
    }

    public Candies(int price, int sugar) {
        this.price = price;
        this.sugar = sugar;
    }

    public void inflation(int withHowMuch){
        this.price += withHowMuch;
    }


}

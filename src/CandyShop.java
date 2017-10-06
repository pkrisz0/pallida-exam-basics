import java.util.ArrayList;
import java.util.List;

public class CandyShop extends ArrayList<Candies> {

    int sugarStore;
    int money;
    Candy candy;
    Lollipop lollipop;


    public CandyShop(int sugarStore) {
        this.sugarStore = sugarStore;
        this.money = 0;
        candy = new Candy();
        lollipop = new Lollipop();
    }

    public static final Candies LOLLIPOP = new Lollipop(); //stg like this??
    public static final Candies CANDY = new Candy(); //probably not a new instance idk

    public void createSweets(Object object){
        if (object == CandyShop.CANDY){
            this.add(new Candy());
            this.sugarStore -= candy.sugar;
        } else {
            this.add(new Lollipop());
            this.sugarStore -= lollipop.sugar;
        }
    }

    public int count(String input){
        int candieCount = 0;
        if (input.equals("Lollipop")){
            for (int i = 0; i < this.size(); i++) {
                if (this.get(i) instanceof Lollipop){
                    candieCount++;
                }
            }
        } else if (input.equals("Candy")){
            for (int i = 0; i < this.size(); i++) {
                if (this.get(i) instanceof Candy){
                    candieCount++;
                }
            }
        }
        return candieCount;
    }

    public List<Integer> candiesPlaces(String input){
        List<Integer> candiePlaces= new ArrayList<>();
        if (input.equals("Candy")) {
            for (int i = 0; i < this.size(); i++) {
                if (this.get(i) instanceof Candy) {
                    candiePlaces.add(i);
                }
            }
        } else {
            for (int i = 0; i < this.size(); i++) {
                if (this.get(i) instanceof Lollipop) {
                    candiePlaces.add(i);
                }
            }
        }
        return candiePlaces;
    }


    public void sell(Object object, int amount){
        if (object == CandyShop.CANDY) {
            this.money += candy.price;
            for (int i = 0; i < amount; i++) {
                int n = candiesPlaces("Candy").get(i);
                this.remove(n);
            }
        } else {
            this.money += lollipop.price;
            for (int i = 0; i < amount; i++) {
                int n = candiesPlaces("Anything").get(i);
                this.remove(n);
            }
        }
    }


    public void buySugar(int howMuch){
        this.sugarStore += howMuch;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Inventory: ");
        sb.append(count("Candy"));
        sb.append(" candies, ");
        sb.append(count("Lollipop"));
        sb.append(" lollipops,");
        sb.append(" Income: ");
        sb.append(this.money);
        sb.append("$, Sugar: ");
        sb.append(this.sugarStore);
        sb.append("gr");
        return sb.toString();
    }

    //"Invetory: 1 candies, 2 lollipops, Income: 20$, Sugar: 285gr"

}

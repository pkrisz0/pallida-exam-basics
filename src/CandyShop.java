import java.util.ArrayList;

public class CandyShop extends ArrayList<Candies> {

    int sugarStore;
    int money;

    public CandyShop(int sugarStore) {
        this.sugarStore = sugarStore;
        this.money = 0;
    }

    public void createSweets(String input){
        if (input.equals("CandyShop.CANDY")){
            this.add(new Candy());
        } else {
            this.add(new Lollipop());
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

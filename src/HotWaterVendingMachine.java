import java.util.LinkedList;

public class HotWaterVendingMachine implements VendingMachine{
    private LinkedList<Product> hotWaters;
    @Override
    public void putProduct(LinkedList<Product> item) {this.hotWaters = item;}

    @Override
    public Product getProduct() {
        return hotWaters.pollLast();
    }

    @Override
    public Product getProduct(String name, int volume, int temper) {
        for(Product hotWater: hotWaters){
            if(hotWater.name.equals(name)){
                return hotWater;
            }
        }
        return null;
    }
}

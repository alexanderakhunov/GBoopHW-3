import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        HotWaterVendingMachine hWvM = new HotWaterVendingMachine();
        hotWater tea = new hotWater("tea", 75, 500, 10011);
        hotWater coffe = new hotWater("coffe", 80, 100, 200);
        hotWater burnoff = new hotWater("burnoff", 80, 350, 115);
        LinkedList<Product> hotProducts = new LinkedList<>();
        hotProducts.add(tea);
        hotProducts.add(coffe);
        hotProducts.add(burnoff);
        hWvM.putProduct(hotProducts);
        List<hotWater> list = new ArrayList<>();
        list.add(tea);
        list.add(coffe);
        list.add(burnoff);
        System.out.println(list.toString());
        Collections.sort(list);
        for(hotWater Hotwater:list){
            System.out.println(Hotwater);
        }



    }
}

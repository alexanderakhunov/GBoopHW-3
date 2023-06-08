import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public interface VendingMachine {

public void putProduct(LinkedList<Product> item);

public Product getProduct();

    Product getProduct(String name, int volume, int temper);
}

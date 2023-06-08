public class hotWater extends Product implements Comparable<hotWater>{
    private int temper;
    private Long price;

    hotWater(String name, int temper, int volume, long price){
        super.name = name;
        this.temper = temper;
        this.price = price;
        super.volume = volume;
    }

    @Override
    public String toString() {
        return "hotWater{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", volume=" + volume +
                ", temper=" + temper +
                '}';
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public void setPrice(int price) {

    }

    @Override
    public int compareTo(hotWater o) {
      return this.price.compareTo(o.price);
    }
}

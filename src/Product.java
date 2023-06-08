public abstract class Product {

    protected String name;
    protected int price;
    protected int volume;
    public abstract String getName();

    public abstract void setName(String name);

    public abstract int getPrice();

    public abstract void setPrice(int price);
}

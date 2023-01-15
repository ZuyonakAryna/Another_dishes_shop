class Saucer extends Plate implements Dishes, Object
{
    Saucer(String producer, double price, String style, int newDiameter)
    {
        super(producer, price, style, newDiameter);
    }
    String getProducer()
    {
        return producer;
    }
    double getPrice()
    {
        return price;
    }
    String getStyle()
    {
        return style;
    }
    int getDiameter()
    {
        return diameter;
    }
    public String name()
    {
        return "Saucer";
    }
    public void print()
    {
        System.out.println(name()+": producer " + getProducer() + ", price " +
                getPrice() + ", style " + getStyle() + ", diameter " + getDiameter());
    }
}

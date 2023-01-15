class SaladPlate extends Plate implements Dishes, Object
{
    SaladPlate(String producer, double price, String style, int newDiameter)
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
        return "Salad plate";
    }
    public void print()
    {
        System.out.println(name()+": producer " + getProducer() + ", price " +
                getPrice() + ", style " + getStyle() + ", diameter " + getDiameter());
    }
}


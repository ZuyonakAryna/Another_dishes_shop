class Pot implements Dishes, Object
{
    private final int volume;
    private final boolean lid;
    private final String producer;
    private final double price;
    private final String style;

    Pot(String producer, double price, String style, int volume, boolean lid)
    {
        this.producer=producer;
        this.price=price;
        this.style=style;
        this.volume=volume;
        this.lid=lid;
    }
    public static void IsThereLid(Pot numberOfPot) {
        if (numberOfPot.getLid())
        {
            System.out.println("there is lid");

        }
        else
        {
            System.out.println("there is no lid");
        }
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
    int getVolume()
    {
        return volume;
    }
    boolean getLid()
    {
        return lid;
    }
    public String name()
    {
        return "Pot";
    }
    public void print()
    {
        System.out.print(name()+": producer " + getProducer() + ", price " +
                getPrice() + ", style " + getStyle() + ", volume " + getVolume() + ", ");
    }
}


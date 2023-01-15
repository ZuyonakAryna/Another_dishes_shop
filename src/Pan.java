public class Pan implements Dishes, Object
{
    private final String producer;
    private final double price;
    private final String style;
    private final double handleLength;
    private final String coating;
    Pan(String producer, double price, String style, double handleLength, String coating)
    {
        this.producer=producer;
        this.price=price;
        this.style=style;
        this.handleLength=handleLength;
        this.coating=coating;
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
    double getHandleLength()
    {
        return handleLength;
    }
    String getCoating()
    {
        return coating;
    }
    public String name()
    {
        return "Pan";
    }
    public void print()
    {
        System.out.println(name()+": producer " + getProducer() + ", price " +
                getPrice() + ", style " + getStyle() + ", the length of handle "
                + getHandleLength() + ", coating " + getCoating());
    }
}

abstract class Plate implements Dishes, Object
{
    protected int diameter;
    protected String producer;
    protected double price;
    protected String style;
    Plate(String producer, double price, String style, int newDiameter)
    {
        this.producer=producer;
        this.price=price;
        this.style=style;
        diameter=newDiameter;
    }
}

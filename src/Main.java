public class Main
{
    public static void main(String[] args)
    {
        SaladPlate saladPlate = new SaladPlate("China", 10.90, "Loft", 10);
        saladPlate.print();
        Saucer saucer = new Saucer("Japan", 15.57, "Japanese", 27);
        saucer.print();
        Pot pot = new Pot("Poland", 37.97,  "Art-deco", 10, true);
        pot.print();
        Pot.IsThereLid(pot);
        Pan pan = new Pan("Slovakia", 27.07, "Country", 10.50, "teflon");
        pan.print();
    }
}

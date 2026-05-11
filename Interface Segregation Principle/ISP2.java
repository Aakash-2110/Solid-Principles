import java.util.*;

interface VegetarianMenu
{
    public List<String> VegetarainItems();
}
interface NonVegetarainMenu
{
    public List<String> NonVegetarianItems();
}
class Veg implements VegetarianMenu
{
    public List<String> VegetarainItems()
    {
        return Arrays.asList("Veg Biryani","Butter Naan", "Veg Curry");
    }
}
class NonVeg implements NonVegetarainMenu
{
    public List<String> NonVegetarianItems()
    {
        return Arrays.asList("Mutton Biryani","Chicken Fry","Fish Finger");
    }
}
class VegMenu
{
    public static void displayVeg(VegetarianMenu menu)
    {
        System.out.println("Veg Dish");
        for (String item : menu.VegetarainItems()) 
        {
            System.out.println(" "+item);            
        }
    }
}
class NonVegMenu
{
    public static void displayNonVeg(NonVegetarainMenu menu)
    {
        System.out.println("Non Veg Dish");
        for (String item : menu.NonVegetarianItems()) 
        {
            System.out.println(" "+item);            
        }
    }
}
class ISP2
{
    public static void main(String[] args) {
        Veg v = new Veg();
        NonVeg nv = new NonVeg();
        VegMenu.displayVeg(v);
        NonVegMenu.displayNonVeg(nv);
    }
}
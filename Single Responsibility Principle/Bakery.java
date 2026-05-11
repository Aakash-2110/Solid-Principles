class Baker
{
    public void baking()
    {
        System.out.println("Baking High Quality Bread");
    }
}
class InventoryManager
{
    public void inventorymanaging()
    {
        System.out.println("Managing the Stock");
    }
}
class Customerservice
{
    public void customerservicing()
    {
        System.out.println("Servicing Customer");
    }
}
public class Bakery
{
    public static void main(String[] args) 
    {
        InventoryManager im = new InventoryManager();
        Baker bk = new Baker();
        Customerservice cs = new Customerservice();
        bk.baking();
        im.inventorymanaging();
        cs.customerservicing(); 
    }
}
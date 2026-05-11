interface Keyboard
{
    void connect();
}
class WiredKeyboard implements Keyboard
{
    public void connect()
    {
        System.out.println("Wired connected successfully");
    }
}
class WirelessKeyboard implements Keyboard
{
    public void connect()
    {
        System.out.println("Wireless connected successfully");
    }
}
class Computer
{
    private Keyboard keyboard;

    public Computer(Keyboard ky)
    {
        this.keyboard = ky;
    }
    public void connect()
    {
        keyboard.connect();
    } 
}
class DIP2
{
    public static void main(String[] args) 
    {
        WiredKeyboard wk = new WiredKeyboard();
        WirelessKeyboard wlk = new WirelessKeyboard();
        Computer c1 = new Computer(wk);
        c1.connect();
        Computer c2 = new Computer(wlk);
        c2.connect();
    }
}
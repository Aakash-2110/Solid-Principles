abstract class PaymentProcess
{
    public abstract void makepayment(double amount);
}
class CreditCard extends PaymentProcess{

    public void makepayment(double amount)
    {
        System.out.println("Payment done successfully via creditcard "+ amount);
    }
}
class PayPal extends PaymentProcess{
    public void makepayment(double amount)
    {
        System.out.println("Payment done successfully via PayPal " + amount);
    }
}
class Payment{
    public static void main(String[] args) {
        CreditCard cc = new CreditCard();
        PayPal pp = new PayPal();
        makepayment(cc, 1500);
        makepayment(pp,1000);
    }
    public static void makepayment(PaymentProcess pay, double amount)
    {
        pay.makepayment(amount);
    }
}  
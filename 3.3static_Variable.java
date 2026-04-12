class Mobile
{
    String brand;
    int price;
    static String name;

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    } 
}
class Demo {
    
    public static void main(String args[])
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 15000;
        Mobile.name = "smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "samsung";
        obj2.price = 89000;
        Mobile.name = "xiphone";

        obj1.show();
        obj2.show();
    }
}

class Mobile{
    String brand;
	int price;
	String network;
	static String name;

    static{
        name = "Phone";
        System.out.println("in static block!");
    }

    public Mobile(){
         brand = "";
         price = 5200;
         System.out.println("in comstructor!");
    }

    public void show(){
         System.out.println(brand + " : " + price + " : " + name);
    }
}

 class Demo {
     public static void main(String [] args) throws ClassNotFoundException{

          Class.forName("Mobile");
          //to load a class
     }
}

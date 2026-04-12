class Human
{
    private int age;
    private String name;

    public Human()    //default constructor
    {
         this.age = 20;
         this.name = "smith";
    }

    public Human(int age, String name) {  //parametrized costructor
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
  
}

 class Demo{
    public static void main(String args[])
    {
          Human obj = new Human();
          Human obj1 = new Human(18 , "John");

          System.out.println(obj.getName() + ":" +obj.getAge());
 
           System.out.println(obj1.getName() + ":" + obj1.getAge());
               
    }
}

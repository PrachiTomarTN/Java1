public class Employee {
    String First_Name,Last_Name,Designation;
    int age;
    // ParameterisedConstructor
    Employee(String First_Name,String Last_Name,String Designation,int age)
    {
        this.First_Name=First_Name;
        this.Last_Name=Last_Name;
        this.Designation=Designation;
        this.age=age;

        System.out.println("This is Parametrised Constructor");
        System.out.println(First_Name+" "+Last_Name+" "+Designation+" "+age);

    }
    // DefaultConstructor
    Employee()
    {
        this.First_Name=null;
        this.Last_Name=null;
        this.Designation=null;
        this.age=0;
        System.out.println("This is Default Constructor");
        System.out.println(First_Name+" "+Last_Name+" "+Designation+" "+age);
    }

    public void set(String First_Name,String Last_Name,String Designation ,int age){
          this.First_Name=First_Name;
          this.Last_Name=Last_Name;
          this.Designation=Designation;
          this.age=age;

        }
    public String toString()
    {
        System.out.println("This is toString");
        return First_Name+" "+Last_Name+" "+Designation+" "+age;
    }

}

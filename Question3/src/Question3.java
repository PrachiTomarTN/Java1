import java.util.*;

public class Question3 {
    static void areaofcircle()
    {
        Scanner sc =new Scanner(System.in);
        int r=sc.nextInt();
         double area=3.14*r*r;
         System.out.print("area of circle:"+ area);
    }
    static void circumofcircle()
    {
        Scanner sc=new Scanner((System.in));
        int r=sc.nextInt();
        double circumfrence=2*3.14*r;
        System.out.print("Area of Circumfrence:"+ circumfrence);
    }
    public void Mymethodswitch(){
        int num;
        Scanner sc =new Scanner(System.in);
        num=sc.nextInt();
        switch (num){
            case 1:
                areaofcircle();
               break;
            case 2:
                circumofcircle();
                break;
            case 3:
                System.out.print("Exit");
            default:
                System.out.println("Invalidinput");
        }
    }
}

import java.util.*;
public class Question2 {
     public void user ()
     {
         Scanner sc= new Scanner(System.in);
         String input;
         input= sc.nextLine();
         while (!input.equals("XDONE"))
         {
             System.out.println(input);
             input=sc.nextLine();
         }
     }
}

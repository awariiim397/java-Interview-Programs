import java.util.*;

public class Main {
   public static void main(String[] args) {
      List list = Arrays.asList(1,2,3,4,5,6);
      System.out.println(list);
      System.out.println("max: " + Collections.max(list));
      System.out.println("min: " + Collections.min(list));
   }
}
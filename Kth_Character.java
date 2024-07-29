import java.util.Scanner;

public class Kth_Character {
    public static void main(String[] args) {
        //Scanner class
        Scanner scanner=new Scanner(System.in);
  
        //size
        int size=scanner.nextInt();
  
    
  
        //position
        int position=scanner.nextInt();
        
  
        //remove left-over
        scanner.nextLine();
  
        //String input
       String input = scanner.nextLine();
        
      size-=position; 
  System.out.println(input.charAt(size));
        //scanner class close to prevent source leak
        scanner.close();
      }
}

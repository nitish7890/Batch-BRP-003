import java.util.*;
class EvenAndOdd{
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=in.nextInt();
    if(n%2==0){
      System.out.println("Number is even");
      else {
        System.out.println("Number is odd");
      }
    }
  }

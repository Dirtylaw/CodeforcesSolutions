import java.util.Scanner;
class Watermelon{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your first number");
    int num = input.nextInt();
    if(num>100){
      System.out.println("Number too big");
      System.exit(0);
    }
    if(num<0){
      System.out.println("Number too small");
      System.exit(0);
    }
    if(num%2!=1){
      System.out.println("YES");
    }
    else{
      System.out.println("NO");
    }
  }

}

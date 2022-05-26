import java.util.*;

class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String inputStr = sc.nextLine();

    sc.close();
    
    inputStr = inputStr.trim();
    String[] str = inputStr.split(" ");

    if(inputStr.isEmpty()) System.out.println(0);
    else System.out.println(str.length);
  }
}

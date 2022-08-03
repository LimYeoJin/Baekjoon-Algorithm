import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();

    Stack<Integer> stack = new Stack<>();
    

    for (int i=0;i<k;i++) {
      int n = sc.nextInt();
      if (n  == 0) stack.pop();
      else stack.push(n);
    }

    
    int result = 0;
    for (int i : stack) {
      result += i;
    }

    System.out.println(result);
  }
}
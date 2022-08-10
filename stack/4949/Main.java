import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
        
    while(true) {
      Stack<Character> stack = new Stack<>();
      String str = sc.nextLine();


      if(str.equals(".")) break;
      
      
      for(char s : str.toCharArray()) {
        if (s == '(' || s == '[') {
          stack.push(s);
        } else if (s == ')' && !stack.isEmpty() && stack.peek() == '('){
          stack.pop();
        } else if (s == ']' && !stack.isEmpty() && stack.peek() == '['){
          stack.pop();
        } else if (s == ')' || s == ']') stack.push(s);
      }

      if (stack.isEmpty()) System.out.println("yes");
      else System.out.println("no");
    }
  }
}
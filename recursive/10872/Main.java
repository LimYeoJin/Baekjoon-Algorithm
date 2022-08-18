import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    System.out.println(factorial(N));
    
  }

  public static int factorial(int k) {
    if (k <= 1) return 1;
    else return k * factorial(k-1);
  }
}
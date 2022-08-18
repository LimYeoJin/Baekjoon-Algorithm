import java.util.*;
import java.io.*;

class Main {
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    System.out.println(fibo(n));
  }

  public static int fibo(int n) {
    if ( n <= 1 ) return n;  
    else return fibo(n-1) + fibo(n-2);
  }
}
import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    int change = 1000 - N;

    int count = 0;

    int[] money = {500, 100, 50, 10, 5, 1};
    
    for(int i=0;i<money.length;i++) {
      if(change == 0) break;
      count += change/money[i];
      change = change%money[i];
    }

    System.out.println(count);
  }
}
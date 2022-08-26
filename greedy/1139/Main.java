import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st ;
  
    int N = Integer.parseInt(br.readLine());

    st = new StringTokenizer(br.readLine());
    ArrayList<Integer> A = new ArrayList<>();
    for (int i=0;i<N;i++) {
      A.add(Integer.parseInt(st.nextToken()));
    }
    Collections.sort(A);

    st = new StringTokenizer(br.readLine());
    ArrayList<Integer> B = new ArrayList<>();
    for(int i=0;i<N;i++) {
      B.add(Integer.parseInt(st.nextToken()));
    }
    Collections.sort(B, Comparator.reverseOrder());

    int sum = 0;
    for (int k=0;k < N ;k ++) {
      sum += (A.get(k) * B.get(k));
      }
    System.out.println(sum);
    
  }
}
import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    ArrayList<Integer> list = new ArrayList<>();
    
    for (int i=0;i<N;i++) {
      list.add(Integer.parseInt(st.nextToken()));
    }

    Collections.sort(list);
    int result = 0, sum = 0;
    for (int k : list ) {
      sum += k;
      result += sum;
    }

    System.out.println(result);
  }
}
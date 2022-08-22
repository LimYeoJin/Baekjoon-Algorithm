import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();

    int count = 0;
    
    ArrayList<Integer> list = new ArrayList<>();
    
    for (int i=0;i<N;i++) {
      list.add(sc.nextInt());
    }

    Collections.sort(list, Collections.reverseOrder());
    for (int i : list) {
      if (i <= K) {
      count += K/i;
      K = K%i;    
      }   
    }

    System.out.println(count);
  }
}
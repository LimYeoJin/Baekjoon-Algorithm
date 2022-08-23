import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    int count = 0;
    int prev_end_time = 0;

    int [][] time = new int[N][2];
    
    for(int i=0;i<N;i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      time[i][0] = Integer.parseInt(st.nextToken()); //시작시간
      time[i][1] = Integer.parseInt(st.nextToken()); //종료시간 
    }

    // 종료 시간 기준으로 배열 정렬    
    Arrays.sort(time, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {        
        if(o1[1] == o2[1]) { //종료 시간이 같을 경우 시작 시간을 기준으로 정렬
          return o1[0] - o2[0];
      } 
        return o1[1] - o2[1];
      }
    });

    for (int i=0;i<N;i++) {
      if (prev_end_time <= time[i][0]) {
        prev_end_time = time[i][1];
        count+=1;
      } 
    }
    System.out.println(count);
  }
} 
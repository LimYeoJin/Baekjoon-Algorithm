import java.util.*;

class Main {

    public String solution(String s) {
        String[] list = s.split(" ");
        String answer = "";

        for (int i = 0; i < list.length; i++) {
            answer += (new StringBuilder(list[i]).reverse()) + " ";
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        String[] str = new String[t];
        for (int i = 0; i < t; i++) {
            str[i] = sc.nextLine();
        }

        for (String n : str) {
            System.out.println(T.solution(n));
        }
    }
}
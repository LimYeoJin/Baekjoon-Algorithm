import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String answer = "", chg = "";;

        int lTag=0, rTag=0;
        for(int i=0;i<str.length();i++){
            if (str.charAt(i) == '<' ) {
                if(!chg.isEmpty()) {
                    answer += new StringBuilder(chg).reverse();
                }
                answer += str.charAt(i);
                lTag++;
            }else if (str.charAt(i) == '>' ) {
                chg = "";
                answer += str.charAt(i);
                rTag++;
            }else {
                if(rTag == lTag) {
                    if(str.charAt(i) == ' ' ) {
                        answer = answer + new StringBuilder(chg).reverse() + " ";
                        chg = "";
                    } else if(i == str.length()-1) {
                        chg += str.charAt(i);
                        answer = answer + new StringBuilder(chg).reverse() + " ";
                    }
                    else {
                        chg += str.charAt(i);
                    }
                }else {
                    answer += str.charAt(i);
                }
            }
        }
        System.out.println(answer);
    }
}
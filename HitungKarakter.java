import java.util.*;
public class HitungKarakter{

     public static void main(String []args){
        String a = "abcdhacckl";
        String temp = "";
        List<String> result = new ArrayList<String>();
        List<Integer> resultAngka = new ArrayList<Integer>();
        int hitung = 0;
        for(int i = 0; i < a.length(); i++) {
            if(!temp.contains(Character.toString(a.charAt(i)))){
               
                temp += a.charAt(i);
                hitung++;
                if (a.length()-1 == i) {
                    result.add(temp);
                    resultAngka.add(hitung);
                }
            } else {
                result.add(temp);
                temp = "";
                temp += a.charAt(i);
                resultAngka.add(hitung);
                hitung = 0;
                hitung++;
            }
        }
        System.out.println(result);
        System.out.println(resultAngka);
     }
}
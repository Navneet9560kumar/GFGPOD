package ExtralogicinPOD;
import java.util.*;
public class countaString {
      public static void main(String[] args) {
            String s = "xyyz";

            HashMap<Character,Integer> freq = new HashMap<>();
//toCharArray = iska kaam hota hai ke ham string ko arrya  mai convert karta hai bro ok 
            for(char ch: s.toCharArray()){
                  // agr ab  exites karta to count inc kar dete hai 
                  if(freq.containsKey(ch)){
                        freq.put(ch, freq.get(ch) +1);
                  }else{
                        freq.put(ch,1);
                  }
            }

            // print karege ham 
            for(char ch: freq.keySet()){
                  System.out.println("Character" + ch  + " occurred" + " "+ freq.get(ch) + "time");
            }
      }
}

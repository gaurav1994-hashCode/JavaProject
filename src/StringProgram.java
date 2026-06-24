import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class StringProgram {
    public static void main(String[] args) {


        String str = "GAUREVA";

        //find non repeated character



        //occurance of character

       /* Map<Character, Integer> map = new HashMap<>();
        char[] charArray = str.toCharArray();
        for (char ch : charArray) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                int count = map.get(ch);
                map.put(ch, count + 1);
            }
        }
        System.out.println(map);*/






/*
// reverse on there position

        String[] words = str.split(" ");
        String outWord = "";
        for (String word : words) {
            String revWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                revWord = revWord + word.charAt(i);

            }
            // System.out.println(revWord);
            outWord = outWord + revWord + " ";

        }

        System.out.println(outWord);*/


//remoce repeted
     /* char [] charArray = str.toCharArray();
      StringBuilder stringBuilder= new StringBuilder();
      Set<Character> characterSet= new LinkedHashSet<>();
      for (int i=0;i<charArray.length;i++){
          characterSet.add(charArray[i]);
      }
      for(Character ch :characterSet){

          stringBuilder.append(ch);
      }
        System.out.println(stringBuilder);*/


        //find repeted

        /*  char [] charArray=str.toCharArray();
          StringBuilder stringBuilder= new StringBuilder();
          for (int i=0;i<charArray.length;i++){
              boolean repeated =false;
              for (int j=i+1;j<charArray.length;j++) {
                  if (charArray[i] == charArray[j]) {
                      repeated = true;
                      break;
                  }
              }if (repeated){
                  System.out.println(stringBuilder.append(charArray[i]));
              }

          }*/


/*//Not repeated
        char[] charArray = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            boolean repeated = false;
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
                stringBuilder.append(charArray[i]);
            }
        }
        System.out.print(stringBuilder);*/


        //distinct
       /* StringBuilder stringBuilder= new StringBuilder();

        for(int i=0;i<str.length();i++){
                     char ch=str.charAt(i);
           // System.out.print(ch);
                   int idx = str.indexOf(ch,i+1);//seraching

            if(idx==-1){
                stringBuilder.append(ch);
            }

        }
        System.out.print(stringBuilder);*/

        //distinct
       /* StringBuilder stringBuilder= new StringBuilder();
        str.chars().distinct().forEach(c->stringBuilder.append((char)c));

        System.out.print(stringBuilder);*/

//Reverse String
        /*char[] charArray = str.toCharArray();*/
/*

        StringBuffer stringBuffer= new StringBuffer(str);
        System.out.println(stringBuffer.reverse());

        StringBuilder stringBuilder= new StringBuilder(str);
        System.out.println(stringBuilder.reverse());
*/

        /* for (int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }*/


       /* for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
            // System.out.println(charArray[i]);

        }*/

       /* System.out.println(" ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
*/


    }


}

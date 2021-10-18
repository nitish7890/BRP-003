

import java.lang.String;
import java.util.Scanner;
public class Day7 {

    public static void main(String args[]) {

             System.out.println("Enter a sentence :");
             Scanner in = new Scanner(System.in);
             String str = in.nextLine();
             in.close();
             System.out.println(find(str));
    }
        public static String find(String str){
        int count=0;
            for (int i=0 ; i<str.length(); i++){
                char ch = str.charAt(i);
                if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
                    count ++;
                }
            }
            System.out.println("total number of vowel=>" +count);
            String str1 = str;
            return str1;
        }

    }


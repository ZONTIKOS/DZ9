//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------1");
        System.out.println(palindrome("abcd"));
        System.out.println(palindrome("anna"));
        System.out.println(palindrome("siis"));
        System.out.println(palindrome("ryr"));
        System.out.println("------------------------------2");
        System.out.println(countGol("dedde"));
        System.out.println(countGol("deeee"));
        System.out.println(countGol("eedde"));
        System.out.println(countGol("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeee"));
        System.out.println("------------------------------3");
        System.out.println(reverse("abcd"));
        System.out.println("------------------------------4");
        System.out.println(puSto("anna"));
        System.out.println(puSto("               "));
        System.out.println(puSto("       f        "));
        System.out.println("------------------------------5");
        System.out.println(countAbc("d2hjk4,4"));
        System.out.println("------------------------------6");
        System.out.println(concat("Hi",4));
        System.out.println("------------------------------7");
        System.out.println(DaNet("America",'A','a'));
        System.out.println("------------------------------8");
        System.out.println(newTrim(" Hello    World "));
        System.out.println("------------------------------9");
        System.out.println(duplicate("abc"));
        System.out.println("------------------------------10");
        System.out.println(zirochka("Hello1234"));
        System.out.println("------------------------------11");
        System.out.println(anagramma("qwerty","tyrewq"));
        System.out.println(anagramma("qwerty","tyrgwq"));
        System.out.println("------------------------------12");
        System.out.println(rem("gggsssnnngrrr"));
        System.out.println("------------------------------13");
        System.out.println(podstr("hello", "yellow"));

    }

    private static boolean palindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i )) {
                return false;
            }
        }
        return true;
    }
    private static int countGol(String s) {
        int count = 0;
        String[]  gol = {"a", "e", "i", "o", "u"};
        String[] x = s.split("");

        for (int i = 0; i < x.length; i++) {
            for(int j = 0; j < gol.length; j++) {
                if (x[i].equals(gol[j])){
                    count++;
                }
            }
        }
        return count;
    }
    private static String reverse(String s) {
        String result = "";
        String[]  s1= s.split("");
        for (int i = s1.length-1; i >=0; i--) {
            result += s1[i];
        }
        return result;
    }
    private static boolean puSto(String s) {
        return s.trim().isEmpty();
    }
    private static int countAbc(String s) {
        int count = 0;
        String[] alphabet = {
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
        };
        String[] x = s.split("");

        for (int i = 0; i < x.length; i++) {
            for(int j = 0; j < alphabet.length; j++) {
                if (x[i].equals(alphabet[j])){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    private static String concat(String s, int count) {
        String s1 = "";
        for (int i = 0; i < count; i++) {
            s1 += s;
        }
        return s1;
    }
    private static boolean DaNet(String str,char poch, char end) {
       if(str.charAt(0)==poch && str.charAt(str.length()-1)==end){
           return true;
       }
       return false;
    }
    private static String newTrim(String str) {
        String result = "";
        String [] s1 = str.trim().split(" ");
        for (int i = 0; i < s1.length; i++) {
            result += s1[i];
        }
        return result;
    }
    private static String duplicate(String s) {
        String result = "";
        String[]  s1= s.split("");
        for (int i = 0; i <s1.length; i++) {
            result += s1[i]+s1[i];
        }
        return result;
    }
    private static String  zirochka(String s) {
        int count = 0;
        String[]  digits = {"0","1","2","3","4","5","6","7","8","9"};
        String[] x = s.split("");
        String result = "";
        for (int i = 0; i < x.length; i++) {
            for(int j = 0; j < digits.length; j++) {
                if (x[i].equals(digits[j])){
                    x[i]="*";
                }
            }
            result+=x[i];
        }
        return result;
    }
    private static boolean anagramma(String s1, String s2) {
        String [] arr1 = s1.toLowerCase().split("");
        String [] arr2 = s2.toLowerCase().split("");
        for (int i = 0; i < arr1.length; i++) {
            boolean result = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {
                    result = true;
                    break;
                }
            }
            if (!result) {
                return false;
            }
        }
        return true;
    }
    private static String  rem(String s) {
        String[] x = s.split("");
        String result = "";
        String c = x[0];
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if(!c.equals(x[i])){
                result+=c+count;
                c = x[i];
                count = 1;
            }else{
                count++;
            }
        }
        result+=c+count;
        return result;
    }
    private static String podstr(String s1, String s2) {
        String result = "";
        String [] arr1 = s1.toLowerCase().split("");
        String result1 = "";
        for (int i = 0; i < arr1.length; i++) {
            result1+=arr1[i];
            if(!s2.contains(result1)){
                if(result1.length()>result.length()){
                    result=result1;
                }
                result1="";
            }
        }
        if(result1.length()>result.length()){
            result=result1;
        }
        return result;
    }
}
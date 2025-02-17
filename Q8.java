public class Q8 {
    public static void main(String[] args) {
         String str = "LeveL";

         String reversedStr = "";

         for( int i = str.length()-1; i >= 0; i--){
             reversedStr += str.charAt(i);
        }
        if (str.equalsIgnoreCase(reversedStr)){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome ");
        }
    }
}

public class App {

    public static void main(String[] args) {
        String s1 = new String("Madam, I'm Adam!");
        isPalindrome(s1);
    }

    public static boolean isPalindrome(String text) {
        boolean isPalindrome = false;
        String text2 = text.replaceAll(  "[^A-Za-z0-9]+" , "");
        //System.out.println(text2);
        String text3 = text2.toLowerCase();
        //System.out.println(text3);
        StringBuilder text4 = new StringBuilder(text3);
        text4.reverse();
        //"^[A-Z]"
        //"^.*[A-Z]"
        //"[A-Z]+"
        //"[^A-Za-z0-9]+"
        //System.out.println(text4);
        if(text4.toString().equals(text3)){
            isPalindrome = true;
        }
        return isPalindrome; // your implementation here
    }

}

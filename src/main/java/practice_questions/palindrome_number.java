package practice_questions;

public class palindrome_number {

    public int pal(int p){
        int h = p;
        int palindrome = 0;
        while(p>0){
             int b = p%10;
             palindrome = palindrome*10+b;
             p = p/10;

        } if(h==palindrome){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        return palindrome;

    }

    public static void main(String[] args) {
        palindrome_number pn = new palindrome_number();
        int y = pn.pal(127);

    }
}

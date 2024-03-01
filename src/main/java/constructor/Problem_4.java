package constructor;

import java.util.Scanner;

public class Problem_4 {

    String book;
    String author;
    int age;

    Problem_4(String book, String author, int age){
        this.book = book;
        this.author = author;
        this.age = age;
    }

    public void displayDeatails(){
        System.out.println("book Name = "+book+"\n"+"author Name = "+author+"\n"+"Age of the Author = "+age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("fill details");
        System.out.println("book name = ");
        String a = sc.next();
        System.out.println("author name = ");
        String b = sc.next();
        System.out.println("age = ");
        int c = sc.nextInt();

        Problem_4 p = new Problem_4(a, b, c);
        p.displayDeatails();
    }
}

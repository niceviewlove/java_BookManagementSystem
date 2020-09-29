package study.bookmanagement;

public class BookRunner {
    public static void main(String[] args) {
   	 System.out.println("0번쨰: "+args[0]);
   	 System.out.println("1번쨰: "+args[1]);
   	 System.out.println("2번쨰: "+args[2]);
   	 System.out.println("3번쨰: "+args[3]);
   	 System.out.println("4번쨰: "+args[4]);
   	 Book book = new Book(args[0], args[1], args[2], args[3], args[4]);
    }
}    

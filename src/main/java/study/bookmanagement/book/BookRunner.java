package study.bookmanagement.book;

public class BookRunner {
    public static void main(String[] args) {
   	 BookController controller = new BookController();
   	 controller.register(args[0], args[1], args[2], args[3], args[4]);
//   	 controller.registerCheck(args[0], args[1], args[2], args[3], args[4]);
//   	 controller.updateCheck(args[0], args[1], args[2]);
//   	 controller.removeCheck(args[0]);
//   	 controller.showBookList();
    }
}    

// 현재문제 
// 1. 글자 정규식 
// 2. removeList 할 때 보여줄 리스트가 없을 때 아무것도 표시 안 함 
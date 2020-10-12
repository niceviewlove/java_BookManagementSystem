package study.bookmanagement;

import java.util.Map;

import study.bookmanagement.controller.BookCreateController;
import study.bookmanagement.controller.BookInfoController;
import study.bookmanagement.controller.BookListController;
import study.bookmanagement.controller.BookRemoveController;
import study.bookmanagement.controller.BookUpdateController;
import study.bookmanagement.controller.MemberCreateController;
import study.bookmanagement.controller.MemberListController;
import study.bookmanagement.controller.MemberRemoveController;
import study.bookmanagement.controller.MemberUpdateController;

public class Dispatcher {
	
	public HttpResponse<?> dispatch(HttpRequest httpRequest) {
		// request에 있는 정보를 바탕으로 controller 실행하기
		// url과 method 패턴에 맞는 controller를 찾아서 thread 생성
		
		//book..?
		if (httpRequest.getUrl().equals("/books/create") && httpRequest.getMethod().equals("POST")) {
			BookCreateController controller = new BookCreateController();
			return controller.command(httpRequest);
		} else if (httpRequest.getUrl().equals("/books/update") && httpRequest.getMethod().equals("PUT")) {
			BookUpdateController controller = new BookUpdateController();
			return controller.command(httpRequest);
		} else if(httpRequest.getUrl().equals("/books/remove/아이디값") && httpRequest.getMethod().equals("DELETE")) {
			BookRemoveController controller = new BookRemoveController();
			return controller.command(httpRequest);
		} else if(httpRequest.getUrl().equals("/books") && httpRequest.getMethod().equals("GET")) {
			BookListController controller = new BookListController();
			return controller.command(httpRequest);
		} else if(httpRequest.getUrl().equals("/book") && httpRequest.getMethod().equals("GET")) {
			BookInfoController controller = new BookInfoController();
			return controller.command(httpRequest);
		}
		
		if (httpRequest.getUrl().equals("/members/create") && httpRequest.getMethod().equals("POST")) {
			MemberCreateController controller = new MemberCreateController();
			return controller.command(httpRequest);
		} else if (httpRequest.getUrl().equals("/members/update/아이디값") && httpRequest.getMethod().equals("PUT")) {
			MemberUpdateController controller = new MemberUpdateController();
			return controller.command(httpRequest);
		} else if(httpRequest.getUrl().equals("/members/remove/아이디값") && httpRequest.getMethod().equals("DELETE")) {
			MemberRemoveController controller = new MemberRemoveController();
			return controller.command(httpRequest);
		} else if(httpRequest.getUrl().equals("/members") && httpRequest.getMethod().equals("GET")) {
			MemberListController controller = new MemberListController();
			return controller.command(httpRequest);
		}
		
		throw new RuntimeException();
	}
}

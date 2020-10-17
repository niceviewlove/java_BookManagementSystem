package study.bookmanagement;

import study.bookmanagement.controller.Controller;
import study.bookmanagement.controller.ControllerFactory;


public class Dispatcher {
	private static Dispatcher dispatcher = new Dispatcher();
	
	private ControllerFactory controllerFactory;
	
	private Dispatcher() {
		controllerFactory = new ControllerFactory();
	}
	
	public static void main(String[] args) {
		HttpRequest htttpRequest = new HttpRequest("/books/create", "POST", null, null);
		Dispatcher dispatcher = new Dispatcher();
		dispatcher.dispatch(htttpRequest);
		dispatcher.dispatch(htttpRequest);
	}

	public HttpResponse<?> dispatch(HttpRequest httpRequest) {
		Controller controller = controllerFactory.getInstance(ControllerFactory.getKey(httpRequest));
		return controller.command(httpRequest);
//		
//		if (httpRequest.getUrl().equals("/books/create") && httpRequest.getMethod().equals("POST")) {
//			BookCreateController controller = new BookCreateController();
//			System.out.println("controller: "+controller);
//			return controller.command(httpRequest);
//		} else if (httpRequest.getUrl().equals("/books/update") && httpRequest.getMethod().equals("PUT")) {
//			BookUpdateController controller = new BookUpdateController();
//			return controller.command(httpRequest);
//		} else if(httpRequest.getUrl().equals("/books/remove") && httpRequest.getMethod().equals("DELETE")) {
//			BookRemoveController controller = new BookRemoveController();
//			return controller.command(httpRequest);
//		} else if(httpRequest.getUrl().equals("/books/list") && httpRequest.getMethod().equals("GET")) {
//			BookListController controller = new BookListController();
//			return controller.command(httpRequest);
//		} else if(httpRequest.getUrl().equals("/book/info") && httpRequest.getMethod().equals("GET")) {
//			BookInfoController controller = new BookInfoController();
//			return controller.command(httpRequest);
//		}
//		
//		if (httpRequest.getUrl().equals("/members/create") && httpRequest.getMethod().equals("POST")) {
//			MemberCreateController controller = new MemberCreateController();
//			return controller.command(httpRequest);
//		} else if (httpRequest.getUrl().equals("/members/update") && httpRequest.getMethod().equals("PUT")) {
//			MemberUpdateController controller = new MemberUpdateController();
//			return controller.command(httpRequest);
//		} else if(httpRequest.getUrl().equals("/members/remove") && httpRequest.getMethod().equals("DELETE")) {
//			MemberRemoveController controller = new MemberRemoveController();
//			return controller.command(httpRequest);
//		} else if(httpRequest.getUrl().equals("/members") && httpRequest.getMethod().equals("GET")) {
//			MemberListController controller = new MemberListController();
//			return controller.command(httpRequest);
//		}
//		
//		return null;
	}

	public static Dispatcher getInstance() {
		return dispatcher;
	}

}

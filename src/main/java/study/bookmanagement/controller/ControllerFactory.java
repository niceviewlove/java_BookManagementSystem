package study.bookmanagement.controller;

import java.util.HashMap;
import java.util.Map;

import study.bookmanagement.HttpRequest;

public class ControllerFactory {
	Map<String, Controller> controllers = new HashMap<>();
	
	public ControllerFactory() {
		controllers.put("/books/create&POST", new BookCreateController());
		controllers.put("/books/update&PUT", new BookUpdateController());
		controllers.put("/books/remove&DELETE", new BookRemoveController());
		controllers.put("/books/list&GET", new BookListController());
		controllers.put("/books/info&GET", new BookInfoController());
		
		controllers.put("/members/form&GET", new MemberFormController());
		controllers.put("/members/create&POST", new MemberCreateController());
		controllers.put("/members/update&PUT", new MemberUpdateController());
		controllers.put("/members/remove&DELETE", new MemberRemoveController());
		controllers.put("/members/list&GET", new MemberListController());
	}
	
	public Controller getInstance(String key) {
		Controller controller = controllers.get(key);
		
		if (controller == null) {
			throw new RuntimeException("해당하는 " + key +" controller가 없습니다.");
		}
		
		return controllers.get(key);
	}
	

	public static String getKey(HttpRequest httpRequest) {
		return httpRequest.getUrl() + "&" + httpRequest.getMethod();
	}
}

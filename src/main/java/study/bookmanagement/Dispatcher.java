package study.bookmanagement;

public class Dispatcher {
	
	public void dispatch(HttpRequest httpRequest) {
		// request에 있는 정보를 바탕으로 controller 실행하기
		// url과 method 패턴에 맞는 controller를 찾아서 thread 생성
		
		if (httpRequest.getUrl().equals("/books") && httpRequest.getMethod().equals("POST")) {
			BookCreateController controller = new BookCreateController();
			HttpResponse httpResponse = controller.command(httpRequest);
		} else if ( ) {
			
		}
		
	}
}

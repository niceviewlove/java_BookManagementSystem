package study.bookmanagement;

public class HttpResponse<T> {
	private String statusCode;
	private T body;//json이 될 수도 있고, html이 될 수도 있음
	
	public HttpResponse(String statusCode, T body) {
		if(statusCode == null || statusCode.length() == 0) {
			throw new RuntimeException("statusCode 값이 없습니다.");
		}
		
		this.statusCode = statusCode;
		this.body = body;
	} 
	
	
}

package study.bookmanagement;

public class HttpResponse {
	private String statusCode;
	private String body;//json이 될 수도 있고, html이 될 수도 있음
	
	public HttpResponse(String statusCode, String body) {
		if(statusCode == null || statusCode.length() == 0) {
			throw new RuntimeException("statusCode 값이 없습니다.");
		}
		
		this.statusCode = statusCode;
		this.body = body;
	} 
	
	
}

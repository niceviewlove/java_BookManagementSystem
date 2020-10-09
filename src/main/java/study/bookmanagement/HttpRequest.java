package study.bookmanagement;

public class HttpRequest {
	private String url;
	private String method;
	
	public HttpRequest(String url, String method) {
		if(url == null || url.length() == 0) {
			throw new RuntimeException("url 값이 없습니다.");
		}
		
		if(method == null || method.length() == 0) {
			throw new RuntimeException("method 값이 없습니다.");
		}
		
		this.url = url;
		this.method = method;
	}
	
	public String getUrl() {
		return url;
	}

	public String getMethod() {
		return method;
	}
}

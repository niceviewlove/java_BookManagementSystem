package study.bookmanagement.controller;

import study.bookmanagement.HttpRequest;
import study.bookmanagement.HttpResponse;

public class MemberIntroController implements Controller {

	@Override
	public HttpResponse<Integer> command(HttpRequest httpRequest) {
		return new HttpResponse<>("200", null, "member_intro");
	}

}

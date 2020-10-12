package study.bookmanagement.controller;

import study.bookmanagement.HttpRequest;
import study.bookmanagement.HttpResponse;
import study.bookmanagement.servicce.MemberService;
import study.bookmanagement.util.NumberUtils;
import study.bookmanagement.util.validator.PlusNumberValidator;
import study.bookmanagement.util.validator.Validator;

public class MemberRemoveController implements Controller{
	private MemberService memberService = new MemberService();
	
	@Override
	public HttpResponse<Integer> command(HttpRequest httpRequest) {
		int id = NumberUtils.parseInt(httpRequest.getAttribute("memberId"));
		
		Validator<Integer> plusNumberValidater = new PlusNumberValidator();
		plusNumberValidater.validate(id);
		memberService.removeMember(id);
		
		return new HttpResponse<>("200", id);
	}
	
}

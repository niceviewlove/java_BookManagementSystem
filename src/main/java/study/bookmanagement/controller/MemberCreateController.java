package study.bookmanagement.controller;

import study.bookmanagement.HttpRequest;
import study.bookmanagement.HttpResponse;
import study.bookmanagement.servicce.Member;
import study.bookmanagement.servicce.MemberService;
import study.bookmanagement.util.NumberUtils;
import study.bookmanagement.util.StringUtils;

public class MemberCreateController implements Controller {
	private MemberValidator memberValidator = new MemberValidator();
	private MemberService memberService = new MemberService();
	
	@Override
	public HttpResponse<Integer> command(HttpRequest httpRequest) {
		String trimedName = StringUtils.trim(httpRequest.getAttribute("name"));
		String trimedGender = StringUtils.trim(httpRequest.getAttribute("gender"));
		String email = httpRequest.getAttribute("gender");
		String phone = httpRequest.getAttribute("phone");
		int ageNumber = NumberUtils.parseInt(httpRequest.getAttribute("ageNumber"));
		
		Member member = new Member(trimedName, trimedGender, email, ageNumber, phone);
		memberValidator.validate(member);
		memberService.registerMember(member);
		
		return new HttpResponse<>("200", member.getId());
	}
	
}

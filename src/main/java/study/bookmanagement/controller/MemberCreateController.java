package study.bookmanagement.controller;

import study.bookmanagement.HttpRequest;
import study.bookmanagement.HttpResponse;
import study.bookmanagement.service.Member;
import study.bookmanagement.service.MemberService;
import study.bookmanagement.util.NumberUtils;
import study.bookmanagement.util.StringUtils;

public class MemberCreateController implements Controller {
	private MemberValidator memberValidator = new MemberValidator();
	private MemberService memberService = MemberService.getInstance();
	
	@Override
	public HttpResponse<Integer> command(HttpRequest httpRequest) {
		String trimedName = StringUtils.trim((String)httpRequest.getAttribute("name"));
		String trimedGender = StringUtils.trim((String)httpRequest.getAttribute("gender"));
		String email = (String)httpRequest.getAttribute("gender");
		String phone = (String)httpRequest.getAttribute("phone");
		int ageNumber = NumberUtils.parseInt((String)httpRequest.getAttribute("ageNumber"));
		
		Member member = new Member(trimedName, trimedGender, email, ageNumber, phone);
		memberValidator.validate(member);
		memberService.registerMember(member);
		
		return new HttpResponse<>("200", member.getId());
	}
	
}

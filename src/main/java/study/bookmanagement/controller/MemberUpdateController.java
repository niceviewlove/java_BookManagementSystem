package study.bookmanagement.controller;

import study.bookmanagement.HttpRequest;
import study.bookmanagement.HttpResponse;
import study.bookmanagement.service.Member;
import study.bookmanagement.service.MemberService;
import study.bookmanagement.util.NumberUtils;
import study.bookmanagement.util.StringUtils;

public class MemberUpdateController implements Controller {
	private MemberValidator memberValidator = new MemberValidator();
	private MemberService memberService = new MemberService();

	@Override
	public HttpResponse<Integer> command(HttpRequest httpRequest) {
		String trimedName = StringUtils.trim(httpRequest.getAttribute("name"));
		String gender = httpRequest.getAttribute("gender");
		String email = httpRequest.getAttribute("gender");
		String phone = httpRequest.getAttribute("phone");
		int age = NumberUtils.parseInt(httpRequest.getAttribute("age"));
		int memberId = NumberUtils.parseInt(httpRequest.getAttribute("memberId"));
		
		Member member = new Member(trimedName, gender, email, age, phone);
		member.setId(memberId);
		memberValidator.validate(member);
		memberService.updateMember(member);
		
		return new HttpResponse<>("200", member.getId());
	}

}

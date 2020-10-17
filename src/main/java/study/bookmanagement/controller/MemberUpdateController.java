package study.bookmanagement.controller;

import study.bookmanagement.HttpRequest;
import study.bookmanagement.HttpResponse;
import study.bookmanagement.service.Member;
import study.bookmanagement.service.MemberService;
import study.bookmanagement.util.NumberUtils;
import study.bookmanagement.util.StringUtils;

public class MemberUpdateController implements Controller {
	private MemberValidator memberValidator = new MemberValidator();
	private MemberService memberService = MemberService.getInstance();

	@Override
	public HttpResponse<Integer> command(HttpRequest httpRequest) {
		String trimedName = StringUtils.trim((String)httpRequest.getAttribute("name"));
		String gender = (String)httpRequest.getAttribute("gender");
		String email = (String)httpRequest.getAttribute("gender");
		String phone = (String)httpRequest.getAttribute("phone");
		int age = NumberUtils.parseInt((String)httpRequest.getAttribute("age"));
		int memberId = NumberUtils.parseInt((String)httpRequest.getAttribute("memberId"));
		
		Member member = new Member(trimedName, gender, email, age, phone);
		member.setId(memberId);
		memberValidator.validate(member);
		memberService.updateMember(member);
		
		return new HttpResponse<>("200", member.getId());
	}

}

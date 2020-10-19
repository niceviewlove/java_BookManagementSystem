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
		String emailFront = (String)httpRequest.getAttribute("email-front");
		String emailEnd = (String)httpRequest.getAttribute("form-email-select");
		String phone = (String)httpRequest.getAttribute("phone");
		int ageNumber = NumberUtils.parseInt((String)httpRequest.getAttribute("age"));
		
		String emailAddress = emailFront + "@" + emailEnd;
		Member member = new Member(trimedName, trimedGender, emailAddress, ageNumber, phone);
		System.out.println("컨트롤러에서 member를 생성했고 나이는요: "+ member.getAge());
		memberValidator.validate(member);
		memberService.registerMember(member);
		
//		return new HttpResponse<>("200", member.getId());
		return new HttpResponse<>("200", member.getId(), "member_success");
	}
	
}

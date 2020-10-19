package study.bookmanagement.controller;

import java.util.List;

import study.bookmanagement.HttpRequest;
import study.bookmanagement.HttpResponse;
import study.bookmanagement.service.Member;
import study.bookmanagement.service.MemberService;

public class MemberListController implements Controller{
	private MemberService memberService = MemberService.getInstance();

	@Override
	public HttpResponse<?> command(HttpRequest httpRequest) {
		List<Member> memberList = memberService.showMemberList();
		
//		for(Member member : memberList) {
//			System.out.println("이름\t\t성별\t\t이메일\t\t\t나이\t\t휴대폰 번호");
//			System.out.println(member.getName() + "\t\t" + member.getGender() +  "\t\t" + member.getEmail() 
//			+"\t" + member.getAge() + "\t\t" + member.getPhone());
//		}
		return new HttpResponse<List<Member>>("200", memberList, "member_list");
	}
	
}

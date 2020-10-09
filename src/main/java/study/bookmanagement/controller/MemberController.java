package study.bookmanagement.controller;
import java.util.List;

import study.bookmanagement.servicce.Member;
import study.bookmanagement.servicce.MemberService;
import study.bookmanagement.util.validator.PlusNumberValidator;
import study.bookmanagement.util.validator.Validator;

public class MemberController {
	private MemberValidator memberValidator = new MemberValidator();
	private MemberService memberService = new MemberService();
	
	public void register(String name, String gender, String email, String age, String phone) {
		String trimedName = name.trim();
		String trimedGender = gender.trim();
		int ageNumber = Integer.parseInt(age);
		
		Member member = new Member(trimedName, trimedGender, email, ageNumber, phone);
		memberValidator.validate(member);
		memberService.registerMember(member);
	};
	
	public void update(String memberId, String name, String gender, String email, String age, String phone) {
		int memberIdNumber = Integer.parseInt(memberId);
		int ageNumber = Integer.parseInt(age);
		
		Member member = new Member(name, gender, email, ageNumber, phone);
		member.setId(memberIdNumber);
		memberValidator.validate(member);
		memberService.updateMember(member);
	};
	
	public void remove(String memberId) {
		Integer id = Integer.parseInt(memberId);
		Validator<Integer> plusNumberValidater = new PlusNumberValidator();
		plusNumberValidater.validate(id);
		memberService.removeMember(id);
	};
	
	public void showMemberList() {
		List<Member> memberList = memberService.showMemberList();
		
		for(Member member : memberList) {
			System.out.println("이름\t\t성별\t\t이메일\t\t\t나이\t\t휴대폰 번호");
			System.out.println(member.getName() + "\t\t" + member.getGender() +  "\t\t" + member.getEmail() 
			+"\t" + member.getAge() + "\t\t" + member.getPhone());
		}
	}
	
}
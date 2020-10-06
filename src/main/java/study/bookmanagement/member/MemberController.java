package study.bookmanagement.member;
import study.bookmanagement.validator.MemberValidator;

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
}
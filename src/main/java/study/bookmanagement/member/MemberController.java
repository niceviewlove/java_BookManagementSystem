package study.bookmanagement.member;

public class MemberController {
	// MemberValidator 생성
	// MemberService 생성
	
	public void register(String name, String gender, String email, String age, String phone) {
		String trimedName = name.trim();
		String trimedEmail = email.trim();
		int ageNumber = Integer.parseInt(age);
		
		Member member = new Member(trimedName, gender, trimedEmail, ageNumber, phone);
		// 유효성검사 
		// 서비스 등록 메소드 호출 
		
	}
}

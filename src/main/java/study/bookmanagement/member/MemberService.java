package study.bookmanagement.member;

public class MemberService {
	MemberRepository memberRepository = new MemberRepository();
	
	public void registerMember(Member member) {
		memberRepository.create(member);
	}
}

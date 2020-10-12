package study.bookmanagement.service;

import java.util.List;

import study.bookmanagement.repository.MemberRepository;

public class MemberService {
	MemberRepository memberRepository = new MemberRepository();
	
	public void registerMember(Member member) {
		memberRepository.create(member);
	};
	
	public void updateMember(Member member) {
		memberRepository.update(member);
	}
	
	public void removeMember(Integer memberId) {
		Member member = memberRepository.findOneById(memberId);
		
		if(member == null) {
			throw new RuntimeException("존재하지 않는 멤버");
		}
		
		memberRepository.deleteById(memberId);
	};
	
	public List<Member> showMemberList() {
		List<Member> memberList = memberRepository.findByAll();
		return memberList;
	}
	
}

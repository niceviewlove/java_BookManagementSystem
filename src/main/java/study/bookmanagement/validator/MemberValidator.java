package study.bookmanagement.validator;

import study.bookmanagement.member.Member;

public class MemberValidator implements Validator<Member>{
	private NameValidator nameValidator = new NameValidator();
	private GenderValidator genderValidator = new GenderValidator();
	private EmailValidator emailValidator = new EmailValidator();
	private PlusNumberValidator plusNumberValidator = new PlusNumberValidator();
	private PhoneNumberValidator phoneNumberValidator = new PhoneNumberValidator();
	
	@Override
	public void validate(Member member) {
		nameValidator.validate(member.getName());
		genderValidator.validate(member.getGender());
		emailValidator.validate(member.getEmail());
		plusNumberValidator.validate(member.getAge());
		phoneNumberValidator.validate(member.getPhone());
	}
	

}

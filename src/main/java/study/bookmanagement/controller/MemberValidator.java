package study.bookmanagement.controller;
import study.bookmanagement.service.Member;
import study.bookmanagement.util.validator.EmailValidator;
import study.bookmanagement.util.validator.GenderValidator;
import study.bookmanagement.util.validator.NameValidator;
import study.bookmanagement.util.validator.PhoneNumberValidator;
import study.bookmanagement.util.validator.PlusNumberValidator;
import study.bookmanagement.util.validator.Validator;

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

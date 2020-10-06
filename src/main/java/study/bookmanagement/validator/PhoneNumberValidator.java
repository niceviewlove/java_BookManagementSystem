package study.bookmanagement.validator;

import java.util.regex.Pattern;

/**
 * 휴대폰 번호가 맞는지 확인한다(구분자 없이 번호만 받아온다) 
 * @author Sion
 */
public class PhoneNumberValidator implements Validator<String>{

	@Override
	public void validate(String content) {
		try {
			if(!Pattern.matches("^01(?:0|1|[6-9])(?:\\d{3}|\\d{4})\\d{4}$", content)) {
				throw new ValidateException("올바르지 않은 휴대폰 입력 형식");
			}
		} catch(Exception e) {
			throw new ValidateException("Exception 발생! 이유는 찾아봐", e);
		}
		
	}
}

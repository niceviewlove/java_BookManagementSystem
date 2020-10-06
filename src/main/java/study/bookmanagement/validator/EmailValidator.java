package study.bookmanagement.validator;

import java.util.regex.Pattern;

public class EmailValidator implements Validator<String> {

	@Override
	public void validate(String content) {
		try {
			if(!Pattern.matches("^[0-9a-zA-Z][0-9a-zA-Z\\_\\-\\.\\+]+[0-9a-zA-Z]@[0-9a-zA-Z][0-9a-zA-Z\\_\\-]*[0-9a-zA-Z](\\.[a-zA-Z]{2,6}){1,2}$\r\n" + "\r\n", content)) {
				throw new ValidateException("올바르지 않은 이메일 형식");
			}
		} catch(Exception e) {
			throw new ValidateException("Exception 발생! 이유는 찾아봐", e);
		}
	}

}

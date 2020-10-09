package study.bookmanagement.util.validator;

import java.util.regex.Pattern;

/**
 * 공백이 아닌 문자값이 하나라도 있는 지 확인
 * @author Sion
 */
public class HasValueValidator {

	public void validate(String content, String type) {
		try {
			if(!Pattern.matches("^\\S+", content)) {
				throw new ValidateException(type +": 입력된 값이 없음");
			} else {
				System.out.println(content+" 통과");
			}
		} catch(Exception e) {
			throw new ValidateException("Exceptionk 발생! 이유는 찾아봐", e);
		}
	}
}

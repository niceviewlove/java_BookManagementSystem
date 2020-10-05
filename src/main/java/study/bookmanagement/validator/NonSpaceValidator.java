package study.bookmanagement.validator;

import java.util.regex.Pattern;

/**
 * 공백이 아닌 문자로 시작하는지 확인
 * @author Sion
 */
public class NonSpaceValidator implements Validator<String> {

	@Override
	public void validate(String content) {
		System.out.println("검사하기 위해 들어온 것은.."+content);
		try {
			// 올바른 제목인지 체크
			if(!Pattern.matches("^\\S+", content)) {
				System.out.println(content);
				throw new ValidateException("올바르지 않은 입력");
			}
		} catch(Exception e) {
			throw new ValidateException("Exceptionk 발생! 이유는 찾아봐", e);
		}
	}
}

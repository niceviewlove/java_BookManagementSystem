package study.bookmanagement.validator;

public class PlusNumberValidator implements Validator<Integer> {

	@Override
	public void validate(Integer content) {
		try {
			if(content < 0) {
				throw new ValidateException("올바르지 않은 숫자 입력");
			}
		} catch(Exception e) {
			throw new ValidateException("Exceptionk 발생! 이유는 찾아봐", e);
		}
	}

}

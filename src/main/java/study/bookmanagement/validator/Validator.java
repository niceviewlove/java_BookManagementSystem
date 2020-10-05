package study.bookmanagement.validator;

public interface Validator<T> {
	public void validate(T content);
}

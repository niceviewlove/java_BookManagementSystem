package study.bookmanagement.member;

public class MemberRunner {
	public static void main(String[] args) {
		MemberController controller = new MemberController();
		controller.register(args[0], args[1], args[2], args[3], args[4]);
	}
}

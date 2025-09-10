package git_test2;

public class Hello {
	String message;
<<<<<<< HEAD

	public Hello() {
		this("안녕하세요");
	}

	public Hello(String message) {
		this.message = message;
	}

	public void say() {
		System.out.println("안녕하세요." + message + "반갑습니다.");
=======
	
	public Hello() {
		this("안녕하세요");
	}
	
	public Hello(String message) {
		this.message = message;
	}
	public void say() {
		System.out.println("반갑습니다." + message + "잘부탁드려요.");
>>>>>>> 15533a5e0f02c8ba2ff8205adcdd6ed8e30e2912
	}

}


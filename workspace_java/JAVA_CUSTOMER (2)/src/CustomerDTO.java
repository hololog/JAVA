
/*
 * DTO(Data Transfer Object) = 데이터 전송 객체 (VO, Bean, JSON) 
 * - 사용되는 데이터를 전달하기 위해 데이터를 저장하는 객체
 *   => JSP에서 사용하는 JavaBean 객체와 동일한 역할
 * - 테이블 당 1개의 DTO 객체 사용됨
 * - 테이블의 컬럼에 대한 멤버변수, 생성자, Getter/Setter 로 구성됨  
 * */
public class CustomerDTO {
	// 멤버변수 5개 선언
	private String idx;
	private String name;
	private int age;
	private String email;
	private String jumin;
	
	// 기본 생성자, 파라미터 5개 초기화 생성자 정의
	public CustomerDTO() {}

	// Alt + Shift + S -> O
	public CustomerDTO(String idx, String name, int age, String email, String jumin) {
		this.idx = idx;
		this.name = name;
		this.age = age;
		this.email = email;
		this.jumin = jumin;
	}
	
	// Getter / Setter 정의 (Alt + Shift + S -> R)
	public String getIdx() {
		return idx;
	}

	public void setIdx(String idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	
}

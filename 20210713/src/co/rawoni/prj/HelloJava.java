package co.rawoni.prj;

public class HelloJava {
	private String str; //멤버변수 
	
	public HelloJava() {
     //기본생성자
	}
	
	public HelloJava(String str) {  //생성자 오버로딩
		this.str =str;  
	}

	public String getStr() {  //return타입필요  기억된 값을 가져온다
		return str;
	}

	public void setStr(String str) { //전달인자가 필요함 / 값을 기억시킨다
		this.str = str;
	}
	
	@Override  //메소드 본체를 만드는것 
	public String toString() { //Object 객체로 상속받은 toString 메소드에 재정의함
		System.out.println(str);
		return null;
	}
	

}

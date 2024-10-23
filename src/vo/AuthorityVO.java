package vo;

public class AuthorityVO {
	
	String a_cate, a_name;
	
	
	public AuthorityVO(String a_cate, String a_name) {
		super();
		this.a_cate = a_cate;
		this.a_name = a_name;
	}

	public AuthorityVO() {
		// TODO Auto-generated constructor stub
	}

	public String getA_cate() {
		return a_cate;
	}

	public void setA_cate(String a_cate) {
		this.a_cate = a_cate;
	}

	public String getA_name() {
		return a_name;
	}

	public void setA_name(String a_name) {
		this.a_name = a_name;
	}
	
	

}

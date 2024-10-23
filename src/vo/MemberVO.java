package vo;

public class MemberVO {
	private int empno, a_cate, deptno;
	private String id, pw, ename;
	AuthorityVO avo;
	
	public MemberVO(){}
	
	public MemberVO(int empno, int a_cate, int deptno, String id, String pw) {
		super();
		this.empno = empno;
		this.a_cate = a_cate;
		this.deptno = deptno;
		this.id = id;
		this.pw = pw;
	}
	
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public AuthorityVO getAvo() {
		return avo;
	}

	public void setAvo(AuthorityVO avo) {
		this.avo = avo;
	}

	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public int getA_cate() {
		return a_cate;
	}
	public void setA_cate(int a_cate) {
		this.a_cate = a_cate;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
}

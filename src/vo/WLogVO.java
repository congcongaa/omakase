package vo;

public class WLogVO {
	private int w_idx, deptno, empno, w_check;
	private String w_name, w_content, w_date;
	private String ename;
	
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getW_idx() {
		return w_idx;
	}
	public void setW_idx(int w_idx) {
		this.w_idx = w_idx;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public int getW_check() {
		return w_check;
	}
	public void setW_check(int w_check) {
		this.w_check = w_check;
	}
	public String getW_name() {
		return w_name;
	}
	public void setW_name(String w_name) {
		this.w_name = w_name;
	}
	public String getW_content() {
		return w_content;
	}
	public void setW_content(String w_content) {
		this.w_content = w_content;
	}
	public String getW_date() {
		return w_date;
	}
	public void setW_date(String w_date) {
		this.w_date = w_date;
	}
	
}

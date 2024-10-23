package vo;

public class FileVO {
	private int t_idx, empno, deptno, w_idx;
	private String cate, file_name, file_date, file_url, ename;
	EmpVO evo;
	
	public FileVO() {}

	public int getW_idx() {
		return w_idx;
	}

	public void setW_idx(int w_idx) {
		this.w_idx = w_idx;
	}

	public int getT_idx() {
		return t_idx;
	}

	public void setT_idx(int t_idx) {
		this.t_idx = t_idx;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getCate() {
		return cate;
	}

	public void setCate(String cate) {
		this.cate = cate;
	}

	public String getFile_name() {
		return file_name;
	}

	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	public String getFile_date() {
		return file_date;
	}

	public void setFile_date(String file_date) {
		this.file_date = file_date;
	}

	public String getFile_url() {
		return file_url;
	}

	public void setFile_url(String file_url) {
		this.file_url = file_url;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
}

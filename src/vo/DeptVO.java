package vo;

import java.util.List;

public class DeptVO {
	private int deptno;
	private String dname, d_number;
	List<VacationVO> v_list;
	List<EmpVO> e_list;
	
	public DeptVO() {}

	
	
	public List<VacationVO> getV_list() {
		return v_list;
	}

	public void setV_list(List<VacationVO> v_list) {
		this.v_list = v_list;
	}

	public List<EmpVO> getE_list() {
		return e_list;
	}

	public void setE_list(List<EmpVO> e_list) {
		this.e_list = e_list;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getD_number() {
		return d_number;
	}

	public void setD_number(String d_number) {
		this.d_number = d_number;
	}
	
	
}

package vo;

public class VacationVO {
	//v_period DB에 없음
	String v_cate, start_date, end_date, v_period, v_date, v_content;
	int idx, v_check, empno, deptno;
	private EmpVO evo;
    private DeptVO dvo;
    
	
	public VacationVO(String v_cate, String start_date, String end_date, String v_period, String v_date,
			String v_content, int v_check, int empno, int deptno) {
		super();
		this.v_cate = v_cate;
		this.start_date = start_date;
		this.end_date = end_date;
		this.v_period = v_period;
		this.v_date = v_date;
		this.v_content = v_content;
		this.v_check = v_check;
		this.empno = empno;
		this.deptno = deptno;
	}
	
	
	
	public int getIdx() {
		return idx;
	}



	public void setIdx(int idx) {
		this.idx = idx;
	}



	public EmpVO getEvo() {
		return evo;
	}



	public void setEvo(EmpVO evo) {
		this.evo = evo;
	}



	public DeptVO getDvo() {
		return dvo;
	}



	public void setDvo(DeptVO dvo) {
		this.dvo = dvo;
	}



	public String getV_period() {
		return v_period;
	}
	public void setV_period(String v_period) {
		this.v_period = v_period;
	}
	public String getV_cate() {
		return v_cate;
	}
	public void setV_cate(String v_cate) {
		this.v_cate = v_cate;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public String getV_date() {
		return v_date;
	}
	public void setV_date(String v_date) {
		this.v_date = v_date;
	}
	public String getV_content() {
		return v_content;
	}
	public void setV_content(String v_content) {
		this.v_content = v_content;
	}
	public int getV_check() {
		return v_check;
	}
	public void setV_check(int v_check) {
		this.v_check = v_check;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
}

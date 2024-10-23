package vo;

public class AttendanceVO {
    private int deptno, empno;
    private String go_work, leave_work, work_status, date;
    EmpVO evo;
    
    
    
    public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public EmpVO getEvo() {
		return evo;
	}

	public void setEvo(EmpVO evo) {
		this.evo = evo;
	}

	public String getWork_status() {
		return work_status;
	}

	public void setWork_status(String work_status) {
		this.work_status = work_status;
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

    public String getGo_work() {
        return go_work;
    }

    public void setGo_work(String go_work) {
        this.go_work = go_work;
    }

    public String getLeave_work() {
        return leave_work;
    }

    public void setLeave_work(String leave_work) {
        this.leave_work = leave_work;
    }
}

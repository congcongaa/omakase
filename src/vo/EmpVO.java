package vo;

import java.util.List;

public class EmpVO {
	private int empno, deptno, verterans, obstacle, v_count;
	
	private String ename, job, employment, belong, hiredate, fire_date,
	join_status, position, hobby, birth, specialty, account_number, bank_info, 
	gender, phone, address;
	
	MemberVO mvo;
	DeptVO dvo;
	AttendanceVO avo;
	List<WLogVO> w_list;
	List<AttendanceVO> a_list;

	List<VacationVO> v_list;
	List<DeptVO> d_list;
	
	
	
	
	public AttendanceVO getAvo() {
		return avo;
	}

	public void setAvo(AttendanceVO avo) {
		this.avo = avo;
	}

	public List<VacationVO> getV_list() {
		return v_list;
	}

	public void setV_list(List<VacationVO> v_list) {
		this.v_list = v_list;
	}

	public List<DeptVO> getD_list() {
		return d_list;
	}

	public void setD_list(List<DeptVO> d_list) {
		this.d_list = d_list;
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


	public int getVerterans() {
		return verterans;
	}

	public void setVerterans(int verterans) {
		this.verterans = verterans;
	}

	public int getObstacle() {
		return obstacle;
	}

	public void setObstacle(int obstacle) {
		this.obstacle = obstacle;
	}

	public int getV_count() {
		return v_count;
	}

	public void setV_count(int v_count) {
		this.v_count = v_count;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getEmployment() {
		return employment;
	}

	public void setEmployment(String employment) {
		this.employment = employment;
	}

	public String getBelong() {
		return belong;
	}

	public void setBelong(String belong) {
		this.belong = belong;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public String getFire_date() {
		return fire_date;
	}

	public void setFire_date(String fire_date) {
		this.fire_date = fire_date;
	}

	public String getJoin_status() {
		return join_status;
	}

	public void setJoin_status(String join_status) {
		this.join_status = join_status;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public String getBank_info() {
		return bank_info;
	}

	public void setBank_info(String bank_info) {
		this.bank_info = bank_info;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public DeptVO getDvo() {
		return dvo;
	}

	public void setDvo(DeptVO dvo) {
		this.dvo = dvo;
	}

	public List<WLogVO> getW_list() {
		return w_list;
	}

	public void setW_list(List<WLogVO> w_list) {
		this.w_list = w_list;
	}

	public List<AttendanceVO> getA_list() {
		return a_list;
	}

	public void setA_list(List<AttendanceVO> a_list) {
		this.a_list = a_list;
	}

	public MemberVO getMvo() {
		return mvo;
	}

	public void setMvo(MemberVO mvo) {
		this.mvo = mvo;
	}
	
	
}

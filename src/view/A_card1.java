/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import org.apache.ibatis.session.SqlSession;

import factory.Factory;
import vo.*;

public class A_card1 extends javax.swing.JPanel {

	public static EmpVO evo; // 내 정보
	List<EmpVO> e_list; // 정보창 세팅 리스트
	List<EmpVO> e_list_c; // 업무일지 세팅 리스트
	List<EmpVO> e_list_a; // 근태 세팅 리스트
	
    public A_card1() {
    	getEmp();
        getWlog();
        getAttendance();
         
        initComponents();
        
        viewInfo();
        setWorkLogTable();
        setAttendanceTable();
        
    }
    
    //empvo객체를 불러오는 함수
    private void getEmp(){
        SqlSession ss = Factory.getFactory().openSession();
        //empno가 인트타입이여서 스트링으로 변환 후 ss에 집어넣어야함
        String empno = String.valueOf(Login.mvo.getEmpno()); 
        evo = ss.selectOne("emp.findEmp", empno);// static evo <- empno 를 인자로 받아서 empVO 객체 + deptVO를 찾음
        if(ss!=null)
        	ss.close();
    }

    //자신에 대한 WLog를 얻는 매서드
    private void getWlog(){
        SqlSession ss = Factory.getFactory().openSession();
        String empno = String.valueOf(Login.mvo.getEmpno());
        e_list_c = ss.selectList("emp.findWLog", empno);
        if(ss!=null)
        	ss.close();
    }

    //자신에 대한 근태정보를 얻는 메소드
    private void getAttendance(){
        SqlSession ss = Factory.getFactory().openSession();
        String empno = String.valueOf(Login.mvo.getEmpno());
        e_list_a = ss.selectList("emp.findAttendance", empno);
        if(ss!=null)
        	ss.close();
    }

    //메인에 내 정보 띄우는 함수
    private void viewInfo(){
        String empno = String.valueOf(Login.mvo.getEmpno());
        DeptVO dvo = evo.getDvo();
        AttendanceVO avo = evo.getAvo();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        Date hiredate = null;

        try {
            hiredate = format.parse(evo.getHiredate());
        } catch (Exception e) {
            e.printStackTrace();
        }

        A_1_tf_company.setText(evo.getBelong());
        A_1_tf_job.setText(evo.getJob());
        A_1_tf_hiredate.setText(evo.getHiredate());
        A_1_tf_empno.setText(empno);
        A_1_tf_dept.setText(dvo.getDname());
        if("정규직".equals(evo.getEmployment())){
            A_1_cb_employment.setSelectedItem("정규직");
        }else {
            A_1_cb_employment.setSelectedItem("비정규직");
        }
        A_1_tf_ename.setText(evo.getEname());
        A_1_tf_d_number.setText(dvo.getD_number());
        A_1_tf_hiredate.setText(format.format(hiredate));
        A_1_tf_position.setText(evo.getPosition());
        A_1_tf_phone.setText(evo.getPhone());
        A_1_tf_add.setText(evo.getAddress());
        A_1_tf_account.setText(evo.getAccount_number());
        A_1_tf_hobby.setText(evo.getHobby());
        A_1_tf_speciality.setText(evo.getSpecialty());
        A_1_tf_birth.setText(evo.getBirth());
        if(avo!=null)
        	A_1_tf_state.setText(avo.getWork_status());

        if(evo.getVerterans() == 0){
            A_1_cb_venter.setSelectedItem("N");
        }
        else {
            A_1_cb_venter.setSelectedItem("Y");
        }

        if(evo.getObstacle() == 0) {
            A_1_cb_obstacle.setSelectedItem("N");
        }
        else {
            A_1_cb_obstacle.setSelectedItem("Y");
        }

        switch (evo.getBank_info()){
            case "KEB하나은행":
                A_1_cb_bank.setSelectedItem("KEB하나은행");
                break;
            case "SC제일은행":
                A_1_cb_bank.setSelectedItem("SC제일은행");
                break;
            case "국민은행":
                A_1_cb_bank.setSelectedItem("국민은행");
                break;
            case "신한은행":
                A_1_cb_bank.setSelectedItem("신한은행");
                break;
            case "외환은행":
                A_1_cb_bank.setSelectedItem("외환은행");
                break;
            case "우리은행":
                A_1_cb_bank.setSelectedItem("우리은행");
                break;
            case "농협":
                A_1_cb_bank.setSelectedItem("농협");
                break;
            case "한국시티은행":
                A_1_cb_bank.setSelectedItem("한국시티은행");
                break;
            case "카카오뱅크":
                A_1_cb_bank.setSelectedItem("카카오뱅크");
                break;
            case "토스":
                A_1_cb_bank.setSelectedItem("토스");
                break;
            case "기업은행":
                A_1_cb_bank.setSelectedItem("기업은행");
                break;
            case "신협":
                A_1_cb_bank.setSelectedItem("신협");
                break;
        }
    }
    
    // 메인 화면 근태 테이블에 내 근태 정보 띄우는 함수
    private void setAttendanceTable() {
    	/* 방법 1
    	String[] c_name = {"이름", "출근시간", "퇴근시간", "근무상태"};
		String[][] data = new String[a_list.size()][c_name.length];
		int count = 0;
		
		for (int i = 0; i < list.size(); i++) {
		    VacationVO vo = list.get(i);

		    data[i][0] = vo.getV_date(); 
		    data[i][1] = vo.getStart_date(); 
		    data[i][2] = vo.getEnd_date();
		    data[i][3] = vo.getV_period();
		    data[i][4] = vo.getV_cate(); 
		    if (vo.getV_check() == 0) {
		    	 data[i][5] = "미승인";
		    	 count++;
		    }else if (vo.getV_check() == 1) {
		        data[i][5] = "승인";   
		    }

		}

		A_3_tb_content.setModel(new DefaultTableModel(data, c_name));
		A_3_tf_vacation_un.setText(Integer.toString(count)); 
    	*/
    	
    	//방법 2
    	 DefaultTableModel model_att = new DefaultTableModel(
                 new Object [][] {},
                 new String [] {
                          "이름", "근무날짜", "출근시간", "퇴근시간", "근무상태"
                 }
         );
        DefaultRowSorter sorter = new TableRowSorter(model_att);
    	 A_1_tb_attendance.setModel(model_att);
         A_1_tb_attendance.setRowSorter(sorter);
         //근태 태이블 리스트 불러오기

         for (EmpVO evo : e_list_a) {
             List<AttendanceVO> a_list = evo.getA_list();

             for (AttendanceVO avo : a_list) {
                 String name = evo.getEname();
                 String date = avo.getDate();
                 String gowork = avo.getGo_work();
                 String leavework = avo.getLeave_work();
                 String status = avo.getWork_status();

                 model_att.addRow(new Object[]{name, date, gowork, leavework, status});
             }
         }
    }
    
    //업무 일지 테이블
    private void setWorkLogTable() {
    	DefaultTableModel model_log = new DefaultTableModel(
                new Object [][] {},
                new String [] {
                        "날짜", "제목", "본문", "작성자"
                }
        );
        DefaultRowSorter sorter = new TableRowSorter(model_log);
        A_1_tb_log.setModel(model_log);
        A_1_tb_log.setRowSorter(sorter);

        //모델의 날짜 제목 본문 작성자를 채우는 문장
        for (EmpVO evo : e_list_c) {
        	List<WLogVO> w_list = evo.getW_list();

            for (WLogVO wvo : w_list) {
            	String W_date = wvo.getW_date().toString();
            	int indexOfSpace = W_date.indexOf(' ');
            	String formattedW_date = W_date.substring(0, indexOfSpace);
            	String date = formattedW_date;
                String title = wvo.getW_name();
                String content = wvo.getW_content();
                String name = evo.getEname();

                model_log.addRow(new Object[]{date, title, content, name});
            }
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() { //화면 구성 함수

        A_card1 = new javax.swing.JPanel();
        A_1_panel = new javax.swing.JPanel();
        A_1_lb_img = new javax.swing.JLabel();
        A_1_sp1 = new javax.swing.JScrollPane();
        A_1_sp1_ta = new javax.swing.JTextArea();
        A_1_lb_company = new javax.swing.JLabel();
        A_1_lb_empno = new javax.swing.JLabel();
        A_1_lb_ename = new javax.swing.JLabel();
        A_1_lb_position = new javax.swing.JLabel();
        A_1_lb_job = new javax.swing.JLabel();
        A_1_lb_dept = new javax.swing.JLabel();
        A_1_lb_d_number = new javax.swing.JLabel();
        A_1_lb_hiredate = new javax.swing.JLabel();
        A_1_lb_employment = new javax.swing.JLabel();
        A_1_lb_birth = new javax.swing.JLabel();
        A_1_lb_add = new javax.swing.JLabel();
        A_1_lb_hobby = new javax.swing.JLabel();
        A_1_lb_obstacle = new javax.swing.JLabel();
        A_1_lb_phone = new javax.swing.JLabel();
        A_1_lb_speciality = new javax.swing.JLabel();
        A_1_lb_account = new javax.swing.JLabel();
        A_1_lb_venter = new javax.swing.JLabel();
        A_1_lb_bank = new javax.swing.JLabel();
        A_1_lb_state = new javax.swing.JLabel();
        A_1_tf_company = new javax.swing.JTextField();
        A_1_tf_empno = new javax.swing.JTextField();
        A_1_tf_position = new javax.swing.JTextField();
        A_1_tf_ename = new javax.swing.JTextField();
        A_1_tf_dept = new javax.swing.JTextField();
        A_1_tf_d_number = new javax.swing.JTextField();
        A_1_tf_state = new javax.swing.JTextField();
        A_1_tf_add = new javax.swing.JTextField();
        A_1_tf_hiredate = new javax.swing.JTextField();
        A_1_tf_hobby = new javax.swing.JTextField();
        A_1_cb_employment = new javax.swing.JComboBox<>();
        A_1_tf_phone = new javax.swing.JTextField();
        A_1_tf_speciality = new javax.swing.JTextField();
        A_1_tf_birth = new javax.swing.JTextField();
        A_1_cb_venter = new javax.swing.JComboBox<>();
        A_1_cb_obstacle = new javax.swing.JComboBox<>();
        A_1_tf_account = new javax.swing.JTextField();
        A_1_cb_bank = new javax.swing.JComboBox<>();
        A_1_tf_job = new javax.swing.JTextField();
        A_1_lb_attendance = new javax.swing.JLabel();
        A_1_lb_log = new javax.swing.JLabel();
        A_1_sp_log = new javax.swing.JScrollPane();
        A_1_tb_log = new javax.swing.JTable();
        A_1_pl_title = new javax.swing.JPanel();
        A_1_lb_title = new javax.swing.JLabel();
        A_1_sp_attendance = new javax.swing.JScrollPane();
        A_1_tb_attendance = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(1100, 700));
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setPreferredSize(new java.awt.Dimension(1100, 700));

        A_card1.setBackground(new java.awt.Color(233, 240, 248));
        A_card1.setMaximumSize(new java.awt.Dimension(1100, 700));
        A_card1.setMinimumSize(new java.awt.Dimension(1100, 700));

        A_1_panel.setBackground(new java.awt.Color(233, 240, 248));
        A_1_panel.setToolTipText("");
        A_1_panel.setMaximumSize(new java.awt.Dimension(1100, 700));
        A_1_panel.setMinimumSize(new java.awt.Dimension(1100, 700));

        A_1_lb_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A_1_lb_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/profile.jpg"))); // NOI18N

        A_1_sp1_ta.setColumns(20);
        A_1_sp1_ta.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        A_1_sp1_ta.setRows(5);
        A_1_sp1_ta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        A_1_sp1_ta.setFocusCycleRoot(true);
        A_1_sp1_ta.setFocusable(false);
        A_1_sp1.setViewportView(A_1_sp1_ta);

        A_1_lb_company.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A_1_lb_company.setText("소속");

        A_1_lb_empno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A_1_lb_empno.setText("사번");

        A_1_lb_ename.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A_1_lb_ename.setText("이름");

        A_1_lb_position.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A_1_lb_position.setText("직위");

        A_1_lb_job.setText("직종");

        A_1_lb_dept.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        A_1_lb_dept.setText("부서명");

        A_1_lb_d_number.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A_1_lb_d_number.setText("내선번호");

        A_1_lb_hiredate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A_1_lb_hiredate.setText("입사일");

        A_1_lb_employment.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        A_1_lb_employment.setText("직원구분");

        A_1_lb_birth.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        A_1_lb_birth.setText("생년월일");

        A_1_lb_add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A_1_lb_add.setText("주소");

        A_1_lb_hobby.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A_1_lb_hobby.setText("취미");

        A_1_lb_obstacle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A_1_lb_obstacle.setText("장애여부");

        A_1_lb_phone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A_1_lb_phone.setText("휴대번호");

        A_1_lb_speciality.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A_1_lb_speciality.setText("특기");

        A_1_lb_account.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A_1_lb_account.setText("계좌번호");

        A_1_lb_venter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A_1_lb_venter.setText("보훈여부");

        A_1_lb_bank.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A_1_lb_bank.setText("은행정보");

        A_1_lb_state.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A_1_lb_state.setText("출근상태");

        A_1_cb_employment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "정규직", "비정규직" }));
        A_1_cb_employment.setToolTipText("");
      
        A_1_cb_venter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Y", "N" }));

        A_1_cb_obstacle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Y", "N" }));
        
        A_1_cb_bank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KEB하나은행", "SC제일은행", "국민은행", "신한은행", "외환은행", "우리은행", "농협", "한국시티은행", "카카오뱅크", "토스", "기업은행", "신협" }));
        A_1_cb_bank.setToolTipText("");
        
        A_1_lb_attendance.setText("근태 정보");

        javax.swing.GroupLayout A_1_panelLayout = new javax.swing.GroupLayout(A_1_panel);
        A_1_panel.setLayout(A_1_panelLayout);
        A_1_panelLayout.setHorizontalGroup(
            A_1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_1_panelLayout.createSequentialGroup()
                .addGroup(A_1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(A_1_panelLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(A_1_lb_img, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A_1_sp1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(A_1_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(A_1_lb_state, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A_1_tf_state, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(A_1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(A_1_panelLayout.createSequentialGroup()
                        .addGroup(A_1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(A_1_lb_position, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A_1_lb_add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A_1_lb_hobby, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(A_1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(A_1_tf_add, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(A_1_tf_hobby))
                        .addGap(18, 18, 18)
                        .addGroup(A_1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A_1_lb_obstacle)
                            .addComponent(A_1_lb_speciality, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(A_1_tf_speciality, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(A_1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(A_1_panelLayout.createSequentialGroup()
                                .addGroup(A_1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(A_1_lb_account, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(A_1_lb_venter)
                                    .addComponent(A_1_lb_birth)
                                    .addComponent(A_1_lb_employment, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(A_1_lb_hiredate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(A_1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(A_1_cb_venter, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(A_1_tf_account, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(A_1_tf_birth, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(A_1_cb_employment, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(A_1_tf_hiredate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(A_1_panelLayout.createSequentialGroup()
                                .addComponent(A_1_lb_bank)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(A_1_cb_bank, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12))
                    .addGroup(A_1_panelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(A_1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A_1_lb_company, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A_1_lb_empno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A_1_lb_ename, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(A_1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(A_1_tf_ename, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(A_1_tf_empno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A_1_tf_company, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A_1_tf_position))
                        .addGap(21, 21, 21)
                        .addGroup(A_1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(A_1_lb_dept)
                            .addComponent(A_1_lb_d_number, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A_1_lb_job)
                            .addComponent(A_1_lb_phone))
                        .addGap(18, 18, 18)
                        .addGroup(A_1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A_1_tf_dept, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A_1_tf_d_number, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A_1_tf_job, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A_1_tf_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A_1_cb_obstacle, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(A_1_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(A_1_lb_attendance)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        A_1_panelLayout.setVerticalGroup(
            A_1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_1_panelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(A_1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(A_1_panelLayout.createSequentialGroup()
                        .addGroup(A_1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(A_1_tf_company, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A_1_lb_job)
                            .addComponent(A_1_tf_job, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A_1_lb_company, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(A_1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(A_1_lb_empno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A_1_tf_empno, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A_1_lb_dept, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A_1_tf_dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(A_1_panelLayout.createSequentialGroup()
                        .addGroup(A_1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(A_1_lb_hiredate)
                            .addComponent(A_1_tf_hiredate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(A_1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(A_1_cb_employment)
                            .addComponent(A_1_lb_employment))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(A_1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(A_1_panelLayout.createSequentialGroup()
                        .addGroup(A_1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(A_1_lb_d_number, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A_1_tf_d_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A_1_tf_ename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A_1_lb_ename, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(A_1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(A_1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(A_1_tf_position, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(A_1_lb_position)
                                .addComponent(A_1_lb_phone))
                            .addComponent(A_1_tf_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(A_1_panelLayout.createSequentialGroup()
                        .addGroup(A_1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(A_1_lb_birth)
                            .addComponent(A_1_tf_birth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(A_1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(A_1_cb_venter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A_1_lb_venter, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(A_1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A_1_lb_add, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_1_tf_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_1_cb_obstacle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_1_lb_obstacle)
                    .addComponent(A_1_lb_account)
                    .addComponent(A_1_tf_account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(A_1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A_1_lb_hobby)
                    .addComponent(A_1_tf_hobby, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_1_lb_speciality, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_1_tf_speciality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_1_lb_bank, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_1_cb_bank, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(476, 476, 476))
            .addGroup(A_1_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(A_1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(A_1_lb_img, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_1_sp1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(A_1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A_1_lb_state, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_1_tf_state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(A_1_lb_attendance)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        A_1_lb_log.setText("업무 일지");

        A_1_sp_log.setViewportView(A_1_tb_log);

        A_1_pl_title.setBackground(new java.awt.Color(52, 73, 102));
        A_1_pl_title.setPreferredSize(new java.awt.Dimension(90, 30));

        A_1_lb_title.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        A_1_lb_title.setForeground(new java.awt.Color(255, 255, 255));
        A_1_lb_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A_1_lb_title.setText("자기소개");

        javax.swing.GroupLayout A_1_pl_titleLayout = new javax.swing.GroupLayout(A_1_pl_title);
        A_1_pl_title.setLayout(A_1_pl_titleLayout);
        A_1_pl_titleLayout.setHorizontalGroup(
            A_1_pl_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_1_pl_titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(A_1_lb_title, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        A_1_pl_titleLayout.setVerticalGroup(
            A_1_pl_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_1_pl_titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(A_1_lb_title)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        
        A_1_sp_attendance.setViewportView(A_1_tb_attendance);

        javax.swing.GroupLayout A_card1Layout = new javax.swing.GroupLayout(A_card1);
        A_card1.setLayout(A_card1Layout);
        A_card1Layout.setHorizontalGroup(
            A_card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_card1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(A_card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(A_1_lb_log)
                    .addComponent(A_1_sp_log, javax.swing.GroupLayout.DEFAULT_SIZE, 1075, Short.MAX_VALUE)
                    .addComponent(A_1_sp_attendance))
                .addGap(0, 19, Short.MAX_VALUE))
            .addGroup(A_card1Layout.createSequentialGroup()
                .addComponent(A_1_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1094, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(A_1_pl_title, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        A_card1Layout.setVerticalGroup(
            A_card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_card1Layout.createSequentialGroup()
                .addComponent(A_1_pl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A_1_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A_1_sp_attendance, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A_1_lb_log)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A_1_sp_log, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(A_card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(A_card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> A_1_cb_bank;
    private javax.swing.JComboBox<String> A_1_cb_employment;
    private javax.swing.JComboBox<String> A_1_cb_obstacle;
    private javax.swing.JComboBox<String> A_1_cb_venter;
    private javax.swing.JLabel A_1_lb_account;
    private javax.swing.JLabel A_1_lb_add;
    private javax.swing.JLabel A_1_lb_attendance;
    private javax.swing.JLabel A_1_lb_bank;
    private javax.swing.JLabel A_1_lb_birth;
    private javax.swing.JLabel A_1_lb_company;
    private javax.swing.JLabel A_1_lb_d_number;
    private javax.swing.JLabel A_1_lb_dept;
    private javax.swing.JLabel A_1_lb_employment;
    private javax.swing.JLabel A_1_lb_empno;
    private javax.swing.JLabel A_1_lb_ename;
    private javax.swing.JLabel A_1_lb_hiredate;
    private javax.swing.JLabel A_1_lb_hobby;
    private javax.swing.JLabel A_1_lb_img;
    private javax.swing.JLabel A_1_lb_job;
    private javax.swing.JLabel A_1_lb_log;
    private javax.swing.JLabel A_1_lb_obstacle;
    private javax.swing.JLabel A_1_lb_phone;
    private javax.swing.JLabel A_1_lb_position;
    private javax.swing.JLabel A_1_lb_speciality;
    private javax.swing.JLabel A_1_lb_state;
    private javax.swing.JLabel A_1_lb_title;
    private javax.swing.JLabel A_1_lb_venter;
    private javax.swing.JPanel A_1_panel;
    private javax.swing.JPanel A_1_pl_title;
    private javax.swing.JScrollPane A_1_sp1;
    private javax.swing.JTextArea A_1_sp1_ta;
    private javax.swing.JScrollPane A_1_sp_attendance;
    private javax.swing.JScrollPane A_1_sp_log;
    private javax.swing.JTable A_1_tb_attendance;
    private javax.swing.JTable A_1_tb_log;
    private javax.swing.JTextField A_1_tf_account;
    private javax.swing.JTextField A_1_tf_add;
    private javax.swing.JTextField A_1_tf_birth;
    private javax.swing.JTextField A_1_tf_company;
    private javax.swing.JTextField A_1_tf_d_number;
    private javax.swing.JTextField A_1_tf_dept;
    private javax.swing.JTextField A_1_tf_empno;
    private javax.swing.JTextField A_1_tf_ename;
    private javax.swing.JTextField A_1_tf_hiredate;
    private javax.swing.JTextField A_1_tf_hobby;
    private javax.swing.JTextField A_1_tf_job;
    private javax.swing.JTextField A_1_tf_phone;
    private javax.swing.JTextField A_1_tf_position;
    private javax.swing.JTextField A_1_tf_speciality;
    private javax.swing.JTextField A_1_tf_state;
    private javax.swing.JPanel A_card1;
    // End of variables declaration//GEN-END:variables
}

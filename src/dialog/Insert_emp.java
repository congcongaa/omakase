/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package dialog;

import java.util.List;

import javax.swing.JOptionPane;

import org.apache.ibatis.session.SqlSession;

import factory.Factory;
import view.C_card1;
import vo.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Insert_emp extends javax.swing.JDialog {
	
    /**
     * @wbp.parser.constructor
     */
    public Insert_emp(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public Insert_emp(C_card1 c1) {
    	this.c1 = c1;
    	initComponents();
    	this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        D_insert_emp_jp = new javax.swing.JPanel();
        D_insert_emp_lb_title = new javax.swing.JLabel();
        D_insert_js_line1 = new javax.swing.JSeparator();
        D_insert_emp_lb_ename = new javax.swing.JLabel();
        D_insert_emp_lb_empno = new javax.swing.JLabel();
        D_insert_emp_lb_employment = new javax.swing.JLabel();
        D_insert_emp_lb_auth = new javax.swing.JLabel();
        D_insert_js_line2 = new javax.swing.JSeparator();
        D_insert_emp_lb_title2 = new javax.swing.JLabel();
        D_insert_emp_lb_account = new javax.swing.JLabel();
        D_insert_emp_tf_empno = new javax.swing.JTextField();
        D_insert_emp_tf_id = new javax.swing.JTextField();
        D_insert_emp_tf_password = new javax.swing.JTextField();
        D_insert_emp_tf_account = new javax.swing.JTextField();
        D_insert_emp_bt_save = new javax.swing.JButton();
        D_insert_emp_bt_cancel = new javax.swing.JButton();
        D_insert_emp_lb_id = new javax.swing.JLabel();
        D_insert_emp_lb_dept = new javax.swing.JLabel();
        D_insert_emp_lb_job = new javax.swing.JLabel();
        D_insert_emp_tf_job = new javax.swing.JTextField();
        D_insert_emp_tf_ename = new javax.swing.JTextField();
        D_insert_emp_lb_bank = new javax.swing.JLabel();
        D_insert_emp_lb_password = new javax.swing.JLabel();
        D_insert_emp_lb_position = new javax.swing.JLabel();
        D_insert_emp_lb_phone = new javax.swing.JLabel();
        D_insert_emp_tf_phone = new javax.swing.JTextField();
        D_insert_emp_lb_birth = new javax.swing.JLabel();
        D_insert_emp_lb_hiredate = new javax.swing.JLabel();
        D_insert_emp_tf_hiredate = new javax.swing.JTextField();
        D_insert_emp_lb_hobby = new javax.swing.JLabel();
        D_insert_emp_tf_hobby = new javax.swing.JTextField();
        D_insert_emp_lb_speciality = new javax.swing.JLabel();
        D_insert_emp_tf_speciality = new javax.swing.JTextField();
        D_insert_emp_lb_venter = new javax.swing.JLabel();
        D_insert_emp_lb_obstacle = new javax.swing.JLabel();
        D_insert_emp_tf_birth = new javax.swing.JTextField();
        D_insert_emp_lb_company = new javax.swing.JLabel();
        D_insert_emp_tf_company = new javax.swing.JTextField();
        D_insert_emp_cb_bank = new javax.swing.JComboBox<>();
        D_insert_emp_cb_employment = new javax.swing.JComboBox<>();
        D_insert_emp_cb_obstacle = new javax.swing.JComboBox<>();
        D_insert_emp_cb_venter = new javax.swing.JComboBox<>();
        D_insert_emp_lb_address = new javax.swing.JLabel();
        D_insert_emp_tf_add = new javax.swing.JTextField();
        D_insert_emp_cb_auth = new javax.swing.JComboBox<>();
        D_insert_emp_lb_gender = new javax.swing.JLabel();
        D_insert_emp_cb_gender = new javax.swing.JComboBox<>();
        D_insert_emp_cb_position = new javax.swing.JComboBox<>();
        D_insert_emp_cb_dept = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 650));
        setMinimumSize(new java.awt.Dimension(1000, 650));

        D_insert_emp_jp.setBackground(new java.awt.Color(255, 255, 255));
        D_insert_emp_jp.setMaximumSize(new java.awt.Dimension(800, 550));

        D_insert_emp_lb_title.setFont(new java.awt.Font("맑은 고딕", 1, 22)); // NOI18N
        D_insert_emp_lb_title.setText("구성원 등록");

        D_insert_emp_lb_ename.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        D_insert_emp_lb_ename.setText("이름*");

        D_insert_emp_lb_empno.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        D_insert_emp_lb_empno.setText("사번*");

        D_insert_emp_lb_employment.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        D_insert_emp_lb_employment.setText("직원구분");

        D_insert_emp_lb_auth.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        D_insert_emp_lb_auth.setText("권한");

        D_insert_emp_lb_title2.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        D_insert_emp_lb_title2.setForeground(new java.awt.Color(51, 153, 255));
        D_insert_emp_lb_title2.setText("계좌정보");

        D_insert_emp_lb_account.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        D_insert_emp_lb_account.setText("계좌번호*");

        D_insert_emp_bt_save.setBackground(new java.awt.Color(0, 153, 255));
        D_insert_emp_bt_save.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        D_insert_emp_bt_save.setForeground(new java.awt.Color(255, 255, 255));
        D_insert_emp_bt_save.setText("저장");
        D_insert_emp_bt_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_insert_emp_bt_saveActionPerformed(evt);
            }
        });

        D_insert_emp_bt_cancel.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        D_insert_emp_bt_cancel.setText("취소");
        D_insert_emp_bt_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_insert_emp_bt_cancelActionPerformed(evt);
            }
        });

        D_insert_emp_lb_id.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        D_insert_emp_lb_id.setText("아이디*");

        D_insert_emp_lb_dept.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        D_insert_emp_lb_dept.setText("부서명");

        D_insert_emp_lb_job.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        D_insert_emp_lb_job.setText("직종");

        D_insert_emp_lb_bank.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        D_insert_emp_lb_bank.setText("은행정보");

        D_insert_emp_lb_password.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        D_insert_emp_lb_password.setText("비밀번호");

        D_insert_emp_lb_position.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        D_insert_emp_lb_position.setText("직책");

        D_insert_emp_lb_phone.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        D_insert_emp_lb_phone.setText("휴대폰번호");

        D_insert_emp_lb_birth.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        D_insert_emp_lb_birth.setText("생년월일*");

        D_insert_emp_lb_hiredate.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        D_insert_emp_lb_hiredate.setText("입사일*");

        D_insert_emp_lb_hobby.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        D_insert_emp_lb_hobby.setText("취미");

        D_insert_emp_lb_speciality.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        D_insert_emp_lb_speciality.setText("특기");

        D_insert_emp_lb_venter.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        D_insert_emp_lb_venter.setText("보훈여부");

        D_insert_emp_lb_obstacle.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        D_insert_emp_lb_obstacle.setText("장애여부");

        D_insert_emp_lb_company.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        D_insert_emp_lb_company.setText("소속");

        D_insert_emp_cb_bank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KEB하나은행", "SC제일은행", "국민은행", "신한은행", "외환은행", "우리은행", "농협", "한국시티은행", "카카오뱅크", "토스", "기업은행", "신협" }));
        D_insert_emp_cb_bank.setToolTipText("");

        D_insert_emp_cb_employment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "정규직", "비정규직" }));

        D_insert_emp_cb_obstacle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Y", "N" }));
        

        D_insert_emp_cb_venter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Y", "N" }));

        D_insert_emp_lb_address.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        D_insert_emp_lb_address.setText("주소");

        D_insert_emp_cb_auth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "사원", "팀장", "관리자" }));

        D_insert_emp_lb_gender.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        D_insert_emp_lb_gender.setText("성별");

        D_insert_emp_cb_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "남", "여" }));

        D_insert_emp_cb_position.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "사원", "주임", "대리", "과장", "부장" }));

        D_insert_emp_cb_dept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "영업팀", "기획팀", "개발1팀", "개발2팀" }));

        javax.swing.GroupLayout D_insert_emp_jpLayout = new javax.swing.GroupLayout(D_insert_emp_jp);
        D_insert_emp_jpLayout.setHorizontalGroup(
        	D_insert_emp_jpLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(D_insert_emp_jpLayout.createSequentialGroup()
        			.addGap(38)
        			.addGroup(D_insert_emp_jpLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(D_insert_emp_jpLayout.createSequentialGroup()
        					.addGap(38)
        					.addGroup(D_insert_emp_jpLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(D_insert_emp_lb_empno)
        						.addComponent(D_insert_emp_lb_auth)
        						.addComponent(D_insert_emp_lb_id)
        						.addComponent(D_insert_emp_lb_password)
        						.addComponent(D_insert_emp_lb_position)
        						.addComponent(D_insert_emp_lb_employment)
        						.addComponent(D_insert_emp_lb_hobby)
        						.addComponent(D_insert_emp_lb_venter)
        						.addComponent(D_insert_emp_lb_address)
        						.addComponent(D_insert_emp_lb_birth, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
        					.addGap(72)
        					.addGroup(D_insert_emp_jpLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(D_insert_emp_jpLayout.createSequentialGroup()
        							.addGroup(D_insert_emp_jpLayout.createParallelGroup(Alignment.TRAILING)
        								.addGroup(D_insert_emp_jpLayout.createParallelGroup(Alignment.LEADING)
        									.addComponent(D_insert_emp_tf_hobby, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
        									.addComponent(D_insert_emp_tf_id, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
        									.addComponent(D_insert_emp_tf_empno, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
        									.addGroup(D_insert_emp_jpLayout.createParallelGroup(Alignment.TRAILING, false)
        										.addComponent(D_insert_emp_cb_auth, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        										.addComponent(D_insert_emp_tf_birth, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
        									.addGroup(D_insert_emp_jpLayout.createParallelGroup(Alignment.TRAILING, false)
        										.addComponent(D_insert_emp_cb_position, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        										.addComponent(D_insert_emp_tf_password, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
        								.addGroup(D_insert_emp_jpLayout.createSequentialGroup()
        									.addGroup(D_insert_emp_jpLayout.createParallelGroup(Alignment.TRAILING)
        										.addComponent(D_insert_emp_cb_venter, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
        										.addComponent(D_insert_emp_cb_employment, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
        									.addGap(3)))
        							.addGap(87)
        							.addGroup(D_insert_emp_jpLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(D_insert_emp_lb_hiredate)
        								.addComponent(D_insert_emp_lb_speciality)
        								.addComponent(D_insert_emp_lb_dept)
        								.addComponent(D_insert_emp_lb_job)
        								.addComponent(D_insert_emp_lb_ename)
        								.addComponent(D_insert_emp_lb_obstacle)
        								.addComponent(D_insert_emp_lb_phone)
        								.addComponent(D_insert_emp_lb_company)
        								.addComponent(D_insert_emp_lb_gender))
        							.addGap(18)
        							.addGroup(D_insert_emp_jpLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(D_insert_emp_tf_company, 141, 141, 141)
        								.addGroup(D_insert_emp_jpLayout.createParallelGroup(Alignment.LEADING, false)
        									.addComponent(D_insert_emp_tf_speciality)
        									.addComponent(D_insert_emp_cb_obstacle, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        									.addComponent(D_insert_emp_tf_hiredate)
        									.addComponent(D_insert_emp_tf_job)
        									.addComponent(D_insert_emp_tf_phone)
        									.addComponent(D_insert_emp_tf_ename)
        									.addComponent(D_insert_emp_cb_dept, 0, 141, Short.MAX_VALUE)
        									.addComponent(D_insert_emp_cb_gender, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        						.addComponent(D_insert_emp_tf_add, Alignment.TRAILING, 454, 454, 454)))
        				.addGroup(D_insert_emp_jpLayout.createParallelGroup(Alignment.LEADING, false)
        					.addComponent(D_insert_emp_lb_title)
        					.addComponent(D_insert_js_line1, GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        					.addComponent(D_insert_js_line2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addGap(48))
        		.addGroup(D_insert_emp_jpLayout.createSequentialGroup()
        			.addGap(48)
        			.addGroup(D_insert_emp_jpLayout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(D_insert_emp_jpLayout.createSequentialGroup()
        					.addGroup(D_insert_emp_jpLayout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(D_insert_emp_jpLayout.createSequentialGroup()
        							.addComponent(D_insert_emp_lb_title2)
        							.addGap(373))
        						.addGroup(D_insert_emp_jpLayout.createSequentialGroup()
        							.addComponent(D_insert_emp_lb_account)
        							.addGap(18)
        							.addComponent(D_insert_emp_tf_account, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
        							.addGap(79)
        							.addComponent(D_insert_emp_lb_bank)))
        					.addGap(18)
        					.addComponent(D_insert_emp_cb_bank, 0, 220, Short.MAX_VALUE)
        					.addGap(83))
        				.addGroup(D_insert_emp_jpLayout.createSequentialGroup()
        					.addComponent(D_insert_emp_bt_save, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
        					.addGap(64)
        					.addComponent(D_insert_emp_bt_cancel, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
        					.addGap(287))))
        );
        D_insert_emp_jpLayout.setVerticalGroup(
        	D_insert_emp_jpLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(D_insert_emp_jpLayout.createSequentialGroup()
        			.addGap(14)
        			.addComponent(D_insert_emp_lb_title)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(D_insert_js_line1, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(D_insert_emp_jpLayout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(D_insert_emp_jpLayout.createSequentialGroup()
        					.addGroup(D_insert_emp_jpLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(D_insert_emp_tf_empno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(D_insert_emp_lb_empno)
        						.addComponent(D_insert_emp_lb_company))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(D_insert_emp_jpLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(D_insert_emp_jpLayout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(D_insert_emp_tf_id, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addComponent(D_insert_emp_lb_ename))
        						.addComponent(D_insert_emp_lb_id, Alignment.TRAILING))
        					.addGroup(D_insert_emp_jpLayout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(D_insert_emp_jpLayout.createSequentialGroup()
        							.addGap(11)
        							.addGroup(D_insert_emp_jpLayout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(D_insert_emp_lb_password)
        								.addComponent(D_insert_emp_tf_password, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(D_insert_emp_jpLayout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(D_insert_emp_lb_position)
        								.addComponent(D_insert_emp_cb_position, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addGroup(D_insert_emp_jpLayout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(D_insert_emp_lb_auth)
        								.addComponent(D_insert_emp_cb_auth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(D_insert_emp_jpLayout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(D_insert_emp_tf_birth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        								.addComponent(D_insert_emp_lb_birth))
        							.addPreferredGap(ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
        							.addGroup(D_insert_emp_jpLayout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(D_insert_emp_lb_employment)
        								.addComponent(D_insert_emp_cb_employment, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        							.addGap(16)
        							.addComponent(D_insert_emp_lb_venter)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(D_insert_emp_lb_hobby))
        						.addGroup(D_insert_emp_jpLayout.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(D_insert_emp_lb_dept)
        							.addGroup(D_insert_emp_jpLayout.createParallelGroup(Alignment.LEADING)
        								.addGroup(D_insert_emp_jpLayout.createSequentialGroup()
        									.addGap(71)
        									.addComponent(D_insert_emp_lb_hiredate)
        									.addPreferredGap(ComponentPlacement.UNRELATED)
        									.addComponent(D_insert_emp_lb_obstacle)
        									.addPreferredGap(ComponentPlacement.UNRELATED)
        									.addComponent(D_insert_emp_lb_speciality))
        								.addGroup(D_insert_emp_jpLayout.createSequentialGroup()
        									.addPreferredGap(ComponentPlacement.UNRELATED)
        									.addGroup(D_insert_emp_jpLayout.createParallelGroup(Alignment.BASELINE)
        										.addComponent(D_insert_emp_lb_phone)
        										.addComponent(D_insert_emp_tf_phone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(D_insert_emp_lb_job)))
        							.addPreferredGap(ComponentPlacement.RELATED, 42, Short.MAX_VALUE))))
        				.addGroup(D_insert_emp_jpLayout.createSequentialGroup()
        					.addComponent(D_insert_emp_cb_venter, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(D_insert_emp_jpLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(D_insert_emp_jpLayout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(D_insert_emp_cb_gender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addComponent(D_insert_emp_lb_gender))
        						.addComponent(D_insert_emp_tf_hobby, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(D_insert_emp_jpLayout.createSequentialGroup()
        					.addComponent(D_insert_emp_tf_company, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(D_insert_emp_tf_ename, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(D_insert_emp_cb_dept, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(39)
        					.addComponent(D_insert_emp_tf_job, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(D_insert_emp_tf_hiredate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(D_insert_emp_cb_obstacle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(D_insert_emp_tf_speciality, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(0, 47, Short.MAX_VALUE)))
        			.addGap(18)
        			.addGroup(D_insert_emp_jpLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(D_insert_emp_lb_address)
        				.addComponent(D_insert_emp_tf_add, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(25)
        			.addComponent(D_insert_js_line2, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(D_insert_emp_lb_title2)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(D_insert_emp_jpLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(D_insert_emp_lb_account)
        				.addComponent(D_insert_emp_tf_account, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(D_insert_emp_lb_bank)
        				.addComponent(D_insert_emp_cb_bank, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(D_insert_emp_jpLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(D_insert_emp_bt_save)
        				.addComponent(D_insert_emp_bt_cancel))
        			.addGap(14))
        );
        D_insert_emp_jp.setLayout(D_insert_emp_jpLayout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(D_insert_emp_jp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(D_insert_emp_jp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void D_insert_emp_bt_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_insert_emp_bt_saveActionPerformed
        // 텍스트필드에 입력한 값을 empVO로 만들어 저장하는 함수
       EmpVO evo = new EmpVO();
        
       String empno = D_insert_emp_tf_empno.getText().trim();
       if(empno.length() == 0) 
          empno = null;
       
       SqlSession ss = Factory.getFactory().openSession();
       
       EmpVO vo = ss.selectOne("emp.searchEmp", empno);
       
       String id = D_insert_emp_tf_id.getText().trim();
       if(id.length() == 0)
    	   id = null;
       
       MemberVO mvo = ss.selectOne("member.get_id", id);
       
       if (vo != null && vo.getEmpno() > 0) {
           JOptionPane.showMessageDialog(Insert_emp.this, "중복된 사번입니다! 사번: " + vo.getEmpno());
       }else if(mvo != null && mvo.getId().length() > 0) {
    	   JOptionPane.showMessageDialog(Insert_emp.this, "중복된 ID입니다! ID: " + mvo.getId());
       }else { //null일때
     	  evo.setEmpno(Integer.parseInt(empno));
     	  String dept = D_insert_emp_cb_dept.getSelectedItem().toString().trim(); //부서명
          System.out.println(dept);
     	  DeptVO dvo = ss.selectOne("dept.dept", dept);
          evo.setDvo(dvo);
          evo.setDeptno(dvo.getDeptno());
          System.out.println(dvo.getDeptno());

      
       if(ss != null)
           ss.close();
       
       String company = D_insert_emp_tf_company.getText().trim();
       if(company.length() == 0)
          company = null;
       evo.setBelong(company);
       
       String ename = D_insert_emp_tf_ename.getText().trim();
       if(ename.length() == 0)
          ename = null;
       evo.setEname(ename);
       
       String position = D_insert_emp_cb_position.getSelectedItem().toString();
       if(position.length() == 0)
          position = null;
       evo.setPosition(position);
       
       String phone = D_insert_emp_tf_phone.getText().trim();
       if(phone.length() == 0)
          phone = null;
       evo.setPhone(phone);
       
       String birth = D_insert_emp_tf_birth.getText().trim();
       if(birth.length() == 0)
          birth= null;
       evo.setBirth(birth);
       
       String job = D_insert_emp_tf_job.getText().trim();
       if(job.length() == 0)
          job = null;
       evo.setJob(job);
       
       String hiredate = D_insert_emp_tf_hiredate.getText().trim();
       if(hiredate.length() == 0)
          hiredate = null;
       evo.setHiredate(hiredate);
       
       String hobby = D_insert_emp_tf_hobby.getText().trim();
       if(hobby.length() == 0)
          hobby = null;
       evo.setHobby(hobby);
       
       String speciality = D_insert_emp_tf_speciality.getText().trim();
       if(speciality.length() == 0)
          speciality = null;
       evo.setSpecialty(speciality);
       
       String add = D_insert_emp_tf_add.getText().trim();
       if(add.length() == 0)
          add = null;
       evo.setAddress(add);
       
       String account = D_insert_emp_tf_account.getText().trim();
       if(account.length() == 0)
          account = null;
       evo.setAccount_number(account);
       
       String venter = D_insert_emp_cb_venter.getSelectedItem().toString();
       int v_value = venter.equals("Y")?1:0;
       evo.setVerterans(v_value);
       
       String obstacle = D_insert_emp_cb_obstacle.getSelectedItem().toString();
       int o_value = obstacle.equals("Y")?1:0;
       evo.setObstacle(o_value);
       
       String bank = D_insert_emp_cb_bank.getSelectedItem().toString();
       evo.setBank_info(bank);
       
       String employment = D_insert_emp_cb_employment.getSelectedItem().toString();
       evo.setEmployment(employment);
       
       String gender = D_insert_emp_cb_gender.getSelectedItem().toString();
       evo.setGender(gender);
       
       
       //public MemberVO(int empno, int a_cate, int deptno, String id, String pw)
       String password = D_insert_emp_tf_password.getText().trim();
       if(password.length() == 0)
          password = null;
       
       int auth = D_insert_emp_cb_auth.getSelectedIndex();
       
       System.out.println(evo.getDvo().getDeptno());
       mvo = new MemberVO(Integer.parseInt(empno), auth, evo.getDvo().getDeptno(), id, password);
       mvo.getDeptno();
       evo.setMvo(mvo);
       evo.setJoin_status("0");
    
       int cnt= c1.addEmp(evo);
       int cnt2= c1.addMember(mvo);
       if(cnt>0 && cnt2>0 ) {
          JOptionPane.showMessageDialog(Insert_emp.this, "저장완료!");
       }
       
       c1.settable();
       dispose();
       }
     }//GEN-LAST:event_D_insert_emp_bt_saveActionPerformed

    private void D_insert_emp_bt_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_insert_emp_bt_cancelActionPerformed
        dispose();
    }//GEN-LAST:event_D_insert_emp_bt_cancelActionPerformed

    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Insert_emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert_emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert_emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert_emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Insert_emp dialog = new Insert_emp(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    */
    
	C_card1 c1;
	//List<MemberVO> mvo;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton D_insert_emp_bt_cancel;
    private javax.swing.JButton D_insert_emp_bt_save;
    private javax.swing.JComboBox<String> D_insert_emp_cb_auth;
    private javax.swing.JComboBox<String> D_insert_emp_cb_bank;
    private javax.swing.JComboBox<String> D_insert_emp_cb_dept;
    private javax.swing.JComboBox<String> D_insert_emp_cb_employment;
    private javax.swing.JComboBox<String> D_insert_emp_cb_gender;
    private javax.swing.JComboBox<String> D_insert_emp_cb_obstacle;
    private javax.swing.JComboBox<String> D_insert_emp_cb_position;
    private javax.swing.JComboBox<String> D_insert_emp_cb_venter;
    private javax.swing.JPanel D_insert_emp_jp;
    private javax.swing.JLabel D_insert_emp_lb_account;
    private javax.swing.JLabel D_insert_emp_lb_address;
    private javax.swing.JLabel D_insert_emp_lb_auth;
    private javax.swing.JLabel D_insert_emp_lb_bank;
    private javax.swing.JLabel D_insert_emp_lb_birth;
    private javax.swing.JLabel D_insert_emp_lb_company;
    private javax.swing.JLabel D_insert_emp_lb_dept;
    private javax.swing.JLabel D_insert_emp_lb_employment;
    private javax.swing.JLabel D_insert_emp_lb_empno;
    private javax.swing.JLabel D_insert_emp_lb_ename;
    private javax.swing.JLabel D_insert_emp_lb_gender;
    private javax.swing.JLabel D_insert_emp_lb_hiredate;
    private javax.swing.JLabel D_insert_emp_lb_hobby;
    private javax.swing.JLabel D_insert_emp_lb_id;
    private javax.swing.JLabel D_insert_emp_lb_job;
    private javax.swing.JLabel D_insert_emp_lb_obstacle;
    private javax.swing.JLabel D_insert_emp_lb_password;
    private javax.swing.JLabel D_insert_emp_lb_phone;
    private javax.swing.JLabel D_insert_emp_lb_position;
    private javax.swing.JLabel D_insert_emp_lb_speciality;
    private javax.swing.JLabel D_insert_emp_lb_title;
    private javax.swing.JLabel D_insert_emp_lb_title2;
    private javax.swing.JLabel D_insert_emp_lb_venter;
    private javax.swing.JTextField D_insert_emp_tf_account;
    private javax.swing.JTextField D_insert_emp_tf_add;
    private javax.swing.JTextField D_insert_emp_tf_birth;
    private javax.swing.JTextField D_insert_emp_tf_company;
    private javax.swing.JTextField D_insert_emp_tf_empno;
    private javax.swing.JTextField D_insert_emp_tf_ename;
    private javax.swing.JTextField D_insert_emp_tf_hiredate;
    private javax.swing.JTextField D_insert_emp_tf_hobby;
    private javax.swing.JTextField D_insert_emp_tf_id;
    private javax.swing.JTextField D_insert_emp_tf_job;
    private javax.swing.JTextField D_insert_emp_tf_password;
    private javax.swing.JTextField D_insert_emp_tf_phone;
    private javax.swing.JTextField D_insert_emp_tf_speciality;
    private javax.swing.JSeparator D_insert_js_line1;
    private javax.swing.JSeparator D_insert_js_line2;
    // End of variables declaration//GEN-END:variables
}

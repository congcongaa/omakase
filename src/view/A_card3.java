/*


 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import org.apache.ibatis.session.SqlSession;

import dialog.calendarFrame;
import dialog.vacation;
import factory.Factory;
import vo.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.TableRowSorter;

public class A_card3 extends javax.swing.JPanel {
	List<VacationVO> list;
	JComboBox A_3_cb_date;
	
	Map<String , Object> map2;
	
    public A_card3() {
        initComponents();
        
        viewInfo();
        defaultList();
        setVacationTable();
    }
    
    //
    private void viewInfo() { //휴가개수, 사원이름, 날짜 설정
    	SqlSession ss= Factory.getFactory().openSession();
    	
    	int vacationCount = ss.selectOne("getVacationCount", Login.mvo.getEmpno());
    	//int vacationCount = A_card1.evo.getV_count();
    	
    	if(ss!=null)
    		ss.close();
    			
        A_3_tf_vacation_count.setText(String.valueOf(vacationCount));
        A_3_tf_emp.setText(String.valueOf(A_card1.evo.getEname()));
        A_3_tf_startdate.setText(A_3_tf_startdate2.getText());
        A_3_tf_enddate.setText(A_3_tf_enddate2.getText());
    }
    
    public void defaultList() { //empno로 vacationVO를 찾는 함수
    	SqlSession ss = Factory.getFactory().openSession();
        
        map2 = new HashMap<>();
    	map2.put("empno", Login.mvo.getEmpno());
    	
    	// empno 와 맞는 VacationVO 객체 찾기
		list = ss.selectList("vacation.search", map2);
		
		if(ss!=null)
			ss.close();
    }
    
    public void setVacationTable()  { //vacationVO list를 테이블에 띄우는 함수
		
		String[] c_name = {"신청일","근태시작일","근태종료일","근태시간","근태유형","승인상태"};
		String[][] data = new String[list.size()][c_name.length];
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
		    }else if (vo.getV_check() == 2) {
		    	data[i][5] = "반려";   
		    }

		}
		DefaultTableModel model = new DefaultTableModel(data, c_name);
		A_3_tb_content.setModel(model);
		DefaultRowSorter sorter = new TableRowSorter<DefaultTableModel>(model);
		A_3_tb_content.setRowSorter(sorter);
		A_3_tf_vacation_un.setText(Integer.toString(count));
		A_3_tf_startdate.setText(A_3_tf_startdate2.getText());
		A_3_tf_enddate.setText(A_3_tf_enddate2.getText());
    }
    
    private void searchData() { //날짜, 키워드로 휴가를 검색하는 함수
		SqlSession ss =Factory.getFactory().openSession();
		
		
		int c = A_3_cb_reason.getSelectedIndex(); //근태기간
		int c2 = A_3_cb_date.getSelectedIndex(); //신청일
		
		Map<String , Object> map = new HashMap<>();
		
		switch(c) {
			case 0:
			    map.put("v_cate", "외근");
			    break;
			case 1:
			    map.put("v_cate", "출장");
			    break;
			case 2:
			    map.put("v_cate", "연장근무");
			    break;
			case 3:
			    map.put("v_cate", "연차");
			    break;
			case 4:
			    map.put("v_cate", null); // 근태유형 전체보기
			    break;
			}
		
		switch(c2) {
		case 0: // 신청일
			if (A_3_tf_startdate2.getText().trim().length() > 0) {
		    	map.put("start_date2", A_3_tf_startdate2.getText());
		    }
		    if(A_3_tf_enddate2.getText().trim().length() > 0) {
		    	  map.put("end_date2", A_3_tf_enddate2.getText());
		    }
		    break;
		case 1: // 근태기간
			if (A_3_tf_startdate2.getText().trim().length() > 0) {
		    	map.put("start_date", A_3_tf_startdate2.getText());
		    }
		    if(A_3_tf_enddate2.getText().trim().length() > 0) {
		    	  map.put("end_date", A_3_tf_enddate2.getText());
		    }
		    break;
		}
		
	    map.put("empno", Login.mvo.getEmpno());
	    
	    list = ss.selectList("vacation.search", map);
	   
		if(ss != null)
			ss.close();
	}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        A_card3 = new javax.swing.JPanel();
        A_3_jp1 = new javax.swing.JPanel();
        A_3_lb_title = new javax.swing.JLabel();
        A_3_jp2 = new javax.swing.JPanel();
        A_3_lb_vacation_count = new javax.swing.JLabel();
        A_3_lb_seperation = new javax.swing.JLabel();
        A_3_lb_vacation_un = new javax.swing.JLabel();
        A_3_bt_request = new javax.swing.JButton();
        A_3_tf_vacation_count = new javax.swing.JTextField();
        A_3_tf_vacation_un = new javax.swing.JTextField();
        A_3_jp3 = new javax.swing.JPanel();
        A_3_lb_req_mng = new javax.swing.JLabel();
        A_3_tf_emp = new javax.swing.JTextField();
        A_3_lb_string = new javax.swing.JLabel();
        A_3_tf_startdate = new javax.swing.JTextField();
        A_3_lb_string2 = new javax.swing.JLabel();
        A_3_tf_enddate = new javax.swing.JTextField();
        A_3_lb_string3 = new javax.swing.JLabel();
        A_3_tf_startdate2 = new javax.swing.JTextField();
        A_3_lb_string5 = new javax.swing.JLabel();
        A_3_tf_enddate2 = new javax.swing.JTextField();
        A_3_lb_string6 = new javax.swing.JLabel();
        A_3_cb_reason = new javax.swing.JComboBox<>();
        A_3_bt_search = new javax.swing.JButton();
        A_3_sc_content = new javax.swing.JScrollPane();
        A_3_tb_content = new javax.swing.JTable();
        A_3_bt_startcalendar = new javax.swing.JButton();
        A_3_bt_endcalendar = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1100, 700));
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setPreferredSize(new java.awt.Dimension(1100, 700));

        A_card3.setBackground(new java.awt.Color(209, 220, 232));
        A_card3.setMaximumSize(new java.awt.Dimension(1100, 700));
        A_card3.setMinimumSize(new java.awt.Dimension(1100, 700));
        A_card3.setPreferredSize(new java.awt.Dimension(1100, 700));

        A_3_jp1.setBackground(new java.awt.Color(52, 73, 102));

        A_3_lb_title.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        A_3_lb_title.setForeground(new java.awt.Color(255, 255, 255));
        A_3_lb_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        A_3_lb_title.setText("나의 근태관리");

        javax.swing.GroupLayout A_3_jp1Layout = new javax.swing.GroupLayout(A_3_jp1);
        A_3_jp1.setLayout(A_3_jp1Layout);
        A_3_jp1Layout.setHorizontalGroup(
            A_3_jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_3_jp1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(A_3_lb_title, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        A_3_jp1Layout.setVerticalGroup(
            A_3_jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_3_jp1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(A_3_lb_title)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        A_3_jp2.setBackground(new java.awt.Color(209, 220, 232));

        A_3_lb_vacation_count.setFont(new java.awt.Font("굴림체", 1, 14)); // NOI18N
        A_3_lb_vacation_count.setText("휴가개수");

        A_3_lb_seperation.setFont(new java.awt.Font("굴림체", 1, 18)); // NOI18N
        A_3_lb_seperation.setText("|");

        A_3_lb_vacation_un.setFont(new java.awt.Font("굴림체", 1, 14)); // NOI18N
        A_3_lb_vacation_un.setText("미처리");

        A_3_bt_request.setBackground(new java.awt.Color(102, 132, 193));
        A_3_bt_request.setFont(new java.awt.Font("굴림체", 1, 22)); // NOI18N
        A_3_bt_request.setForeground(new java.awt.Color(255, 255, 255));
        A_3_bt_request.setText("신청하기");
        A_3_bt_request.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_3_bt_requestActionPerformed(evt);
            }
        });

        A_3_jp3.setBackground(new java.awt.Color(233, 240, 248));

        A_3_lb_req_mng.setFont(new java.awt.Font("굴림체", 1, 14)); // NOI18N
        A_3_lb_req_mng.setText("근태신청관리");

        A_3_lb_string.setFont(new java.awt.Font("굴림체", 1, 14)); // NOI18N
        A_3_lb_string.setText("의");

        A_3_lb_string2.setText("~");

        A_3_lb_string3.setFont(new java.awt.Font("굴림체", 1, 14)); // NOI18N
        A_3_lb_string3.setText("근태신청기록");

        A_3_lb_string5.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        A_3_lb_string5.setText("-");

        A_3_lb_string6.setText("근태신청항목");

        A_3_cb_reason.setModel(new DefaultComboBoxModel(new String[] {"외근", "출장", "연장근무", "연차", "전체"}));

        A_3_bt_search.setText("검색");
        A_3_bt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_3_bt_searchActionPerformed(evt);
            }
        });
        A_3_sc_content.setViewportView(A_3_tb_content);

        A_3_bt_startcalendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/celendar_1.png"))); // NOI18N
        A_3_bt_startcalendar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        A_3_bt_startcalendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_3_bt_startcalendarActionPerformed(evt);
            }
        });

        A_3_bt_endcalendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/celendar_1.png"))); // NOI18N
        A_3_bt_endcalendar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        A_3_bt_endcalendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_3_bt_endcalendarActionPerformed(evt);
            }
        });
        
        A_3_cb_date = new JComboBox();
        A_3_cb_date.setModel(new DefaultComboBoxModel(new String[] {"신청일", "근태기간"}));

        javax.swing.GroupLayout A_3_jp3Layout = new javax.swing.GroupLayout(A_3_jp3);
        A_3_jp3Layout.setHorizontalGroup(
        	A_3_jp3Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(A_3_jp3Layout.createSequentialGroup()
        			.addGroup(A_3_jp3Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(A_3_jp3Layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(A_3_sc_content, GroupLayout.DEFAULT_SIZE, 1028, Short.MAX_VALUE))
        				.addGroup(A_3_jp3Layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(A_3_jp3Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(A_3_jp3Layout.createSequentialGroup()
        							.addComponent(A_3_tf_emp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(A_3_lb_string)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(A_3_tf_startdate, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
        							.addGap(4)
        							.addComponent(A_3_lb_string2)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(A_3_tf_enddate, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(A_3_lb_string3)
        							.addPreferredGap(ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
        							.addComponent(A_3_cb_date, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(A_3_tf_startdate2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(A_3_bt_startcalendar, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(A_3_lb_string5, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(A_3_tf_enddate2, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(A_3_bt_endcalendar, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
        						.addComponent(A_3_lb_req_mng))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(A_3_jp3Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(A_3_cb_reason, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(A_3_lb_string6, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(A_3_bt_search, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        A_3_jp3Layout.setVerticalGroup(
        	A_3_jp3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(A_3_jp3Layout.createSequentialGroup()
        			.addGroup(A_3_jp3Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(A_3_jp3Layout.createSequentialGroup()
        					.addGap(12)
        					.addGroup(A_3_jp3Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(A_3_lb_string6)
        						.addComponent(A_3_lb_req_mng))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(A_3_jp3Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(A_3_jp3Layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(A_3_lb_string3)
        							.addComponent(A_3_tf_enddate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addComponent(A_3_lb_string2)
        							.addComponent(A_3_tf_startdate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addComponent(A_3_lb_string)
        							.addComponent(A_3_tf_emp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        						.addGroup(A_3_jp3Layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(A_3_cb_reason, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addComponent(A_3_bt_search))
        						.addGroup(A_3_jp3Layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(A_3_tf_startdate2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addComponent(A_3_cb_date, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        						.addGroup(A_3_jp3Layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(A_3_tf_enddate2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addComponent(A_3_lb_string5, 0, 0, Short.MAX_VALUE))
        						.addComponent(A_3_bt_startcalendar)))
        				.addGroup(A_3_jp3Layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(A_3_bt_endcalendar)))
        			.addGap(14)
        			.addComponent(A_3_sc_content, GroupLayout.PREFERRED_SIZE, 486, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        A_3_jp3.setLayout(A_3_jp3Layout);

        javax.swing.GroupLayout A_3_jp2Layout = new javax.swing.GroupLayout(A_3_jp2);
        A_3_jp2Layout.setHorizontalGroup(
        	A_3_jp2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(A_3_jp2Layout.createSequentialGroup()
        			.addGroup(A_3_jp2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(A_3_jp2Layout.createSequentialGroup()
        					.addGap(14)
        					.addComponent(A_3_lb_vacation_count)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(A_3_tf_vacation_count, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(A_3_lb_seperation)
        					.addGap(6)
        					.addComponent(A_3_lb_vacation_un)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(A_3_tf_vacation_un, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 659, Short.MAX_VALUE)
        					.addComponent(A_3_bt_request, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE))
        				.addGroup(A_3_jp2Layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(A_3_jp3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        			.addContainerGap())
        );
        A_3_jp2Layout.setVerticalGroup(
        	A_3_jp2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(A_3_jp2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(A_3_jp2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(A_3_jp2Layout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(A_3_tf_vacation_un, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addComponent(A_3_lb_vacation_count)
        					.addComponent(A_3_tf_vacation_count, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addComponent(A_3_lb_seperation)
        					.addComponent(A_3_lb_vacation_un))
        				.addComponent(A_3_bt_request))
        			.addPreferredGap(ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
        			.addComponent(A_3_jp3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        A_3_jp2.setLayout(A_3_jp2Layout);

        javax.swing.GroupLayout A_card3Layout = new javax.swing.GroupLayout(A_card3);
        A_card3Layout.setHorizontalGroup(
        	A_card3Layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(A_3_jp1, GroupLayout.DEFAULT_SIZE, 1112, Short.MAX_VALUE)
        		.addGroup(A_card3Layout.createSequentialGroup()
        			.addGap(12)
        			.addComponent(A_3_jp2, GroupLayout.PREFERRED_SIZE, 1076, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        A_card3Layout.setVerticalGroup(
        	A_card3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(A_card3Layout.createSequentialGroup()
        			.addComponent(A_3_jp1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(A_3_jp2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(12, Short.MAX_VALUE))
        );
        A_card3.setLayout(A_card3Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(A_card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(A_card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void A_3_bt_startcalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_3_bt_startcalendarActionPerformed
    	new calendarFrame(A_3_tf_startdate2);
    }//GEN-LAST:event_A_3_bt_startcalendarActionPerformed
    
    private void A_3_bt_endcalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_3_bt_endcalendarActionPerformed
    	new calendarFrame(A_3_tf_enddate2);
    }//GEN-LAST:event_A_3_bt_endcalendarActionPerformed
    
    private void A_3_bt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_3_bt_searchActionPerformed
    	searchData();
	    setVacationTable();
    }//GEN-LAST:event_A_3_bt_searchActionPerformed
    private void A_3_bt_requestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_3_bt_requestActionPerformed
       new vacation(A_card3.this);
    }//GEN-LAST:event_A_3_bt_requestActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A_3_bt_endcalendar;
    private javax.swing.JButton A_3_bt_request;
    private javax.swing.JButton A_3_bt_search;
    private javax.swing.JButton A_3_bt_startcalendar;
    private javax.swing.JComboBox<String> A_3_cb_reason;
    private javax.swing.JPanel A_3_jp1;
    private javax.swing.JPanel A_3_jp2;
    private javax.swing.JPanel A_3_jp3;
    private javax.swing.JLabel A_3_lb_req_mng;
    private javax.swing.JLabel A_3_lb_seperation;
    private javax.swing.JLabel A_3_lb_string;
    private javax.swing.JLabel A_3_lb_string2;
    private javax.swing.JLabel A_3_lb_string3;
    private javax.swing.JLabel A_3_lb_string5;
    private javax.swing.JLabel A_3_lb_string6;
    private javax.swing.JLabel A_3_lb_title;
    private javax.swing.JLabel A_3_lb_vacation_count;
    private javax.swing.JLabel A_3_lb_vacation_un;
    private javax.swing.JScrollPane A_3_sc_content;
    private javax.swing.JTable A_3_tb_content;
    private javax.swing.JTextField A_3_tf_emp;
    private javax.swing.JTextField A_3_tf_enddate;
    private javax.swing.JTextField A_3_tf_enddate2;
    private javax.swing.JTextField A_3_tf_startdate;
    private javax.swing.JTextField A_3_tf_startdate2;
    private javax.swing.JTextField A_3_tf_vacation_count;
    private javax.swing.JTextField A_3_tf_vacation_un;
    private javax.swing.JPanel A_card3;
}

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
import javax.swing.table.TableRowSorter;

import org.apache.ibatis.session.SqlSession;

import dialog.calendarFrame;
import factory.Factory;
import vo.AttendanceVO;
import vo.EmpVO;
import vo.WLogVO;

public class B_card2 extends javax.swing.JPanel {
	
	List<AttendanceVO> list;
	String dname;

    public B_card2() {
        initComponents();
        getList();
        setmodel();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        B_card2 = new javax.swing.JPanel();
        B_2_Panel1 = new javax.swing.JPanel();
        B_2_Panel2 = new javax.swing.JPanel();
        B_2_Label1 = new javax.swing.JLabel();
        B_2_Panel3 = new javax.swing.JPanel();
        B_2_Label2 = new javax.swing.JLabel();
        B_2_tf_dept = new javax.swing.JTextField();
        B_2_Panel4 = new javax.swing.JPanel();
        B_2_Label3 = new javax.swing.JLabel();
        javax.swing.JPanel B_2_jp_startdate = new javax.swing.JPanel();
        B_2_tf_startdate = new javax.swing.JTextField();
        B_2_bt_startcalendar = new javax.swing.JButton();
        javax.swing.JPanel B_2_jp_enddate = new javax.swing.JPanel();
        B_2_tf_enddate = new javax.swing.JTextField();
        B_2_bt_endcalendar = new javax.swing.JButton();
        B_2_bt_search = new javax.swing.JButton();
        B_2_scrollPane = new javax.swing.JScrollPane();
        B_2_tb_tableRecord = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(1100, 700));
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setPreferredSize(new java.awt.Dimension(1100, 700));

        B_card2.setMaximumSize(new java.awt.Dimension(1100, 700));
        B_card2.setMinimumSize(new java.awt.Dimension(1100, 700));
        B_card2.setPreferredSize(new java.awt.Dimension(1100, 700));

        B_2_Panel1.setBackground(new java.awt.Color(234, 242, 249));
        B_2_Panel1.setMaximumSize(new java.awt.Dimension(1100, 700));
        B_2_Panel1.setMinimumSize(new java.awt.Dimension(1100, 700));
        B_2_Panel1.setPreferredSize(new java.awt.Dimension(1100, 700));

        B_2_Panel2.setBackground(new java.awt.Color(52, 73, 102));
        B_2_Panel2.setPreferredSize(new java.awt.Dimension(1100, 43));

        B_2_Label1.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        B_2_Label1.setForeground(new java.awt.Color(255, 255, 255));
        B_2_Label1.setText("출퇴근기록관리");

        javax.swing.GroupLayout B_2_Panel2Layout = new javax.swing.GroupLayout(B_2_Panel2);
        B_2_Panel2.setLayout(B_2_Panel2Layout);
        B_2_Panel2Layout.setHorizontalGroup(
            B_2_Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_2_Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B_2_Label1)
                .addContainerGap(993, Short.MAX_VALUE))
        );
        B_2_Panel2Layout.setVerticalGroup(
            B_2_Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_2_Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B_2_Label1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        B_2_Panel3.setBackground(new java.awt.Color(115, 170, 220));

        B_2_Label2.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        B_2_Label2.setText("부서");

        javax.swing.GroupLayout B_2_Panel3Layout = new javax.swing.GroupLayout(B_2_Panel3);
        B_2_Panel3.setLayout(B_2_Panel3Layout);
        B_2_Panel3Layout.setHorizontalGroup(
            B_2_Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, B_2_Panel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(B_2_Label2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B_2_tf_dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        B_2_Panel3Layout.setVerticalGroup(
            B_2_Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_2_Panel3Layout.createSequentialGroup()
                .addGroup(B_2_Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_2_Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_2_tf_dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        B_2_Panel4.setBackground(new java.awt.Color(172, 205, 235));

        B_2_Label3.setText("~");

        B_2_jp_startdate.setBackground(new java.awt.Color(255, 255, 255));

        B_2_tf_startdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        B_2_bt_startcalendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/celendar_1.png"))); // NOI18N
        B_2_bt_startcalendar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B_2_bt_startcalendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_2_bt_startcalendarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout B_2_jp_startdateLayout = new javax.swing.GroupLayout(B_2_jp_startdate);
        B_2_jp_startdate.setLayout(B_2_jp_startdateLayout);
        B_2_jp_startdateLayout.setHorizontalGroup(
            B_2_jp_startdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_2_jp_startdateLayout.createSequentialGroup()
                .addComponent(B_2_tf_startdate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(B_2_bt_startcalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        B_2_jp_startdateLayout.setVerticalGroup(
            B_2_jp_startdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_2_jp_startdateLayout.createSequentialGroup()
                .addComponent(B_2_bt_startcalendar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(B_2_tf_startdate)
        );

        B_2_jp_enddate.setBackground(new java.awt.Color(255, 255, 255));

        B_2_tf_enddate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        B_2_bt_endcalendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/celendar_1.png"))); // NOI18N
        B_2_bt_endcalendar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B_2_bt_endcalendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_2_bt_endcalendarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout B_2_jp_enddateLayout = new javax.swing.GroupLayout(B_2_jp_enddate);
        B_2_jp_enddate.setLayout(B_2_jp_enddateLayout);
        B_2_jp_enddateLayout.setHorizontalGroup(
            B_2_jp_enddateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_2_jp_enddateLayout.createSequentialGroup()
                .addComponent(B_2_tf_enddate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(B_2_bt_endcalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        B_2_jp_enddateLayout.setVerticalGroup(
            B_2_jp_enddateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(B_2_tf_enddate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(B_2_bt_endcalendar)
        );

        B_2_bt_search.setText("조회");
        B_2_bt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_2_bt_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout B_2_Panel4Layout = new javax.swing.GroupLayout(B_2_Panel4);
        B_2_Panel4.setLayout(B_2_Panel4Layout);
        B_2_Panel4Layout.setHorizontalGroup(
            B_2_Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, B_2_Panel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(B_2_jp_startdate, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B_2_Label3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B_2_jp_enddate, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(B_2_bt_search)
                .addGap(18, 18, 18))
        );
        B_2_Panel4Layout.setVerticalGroup(
            B_2_Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, B_2_Panel4Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(B_2_Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B_2_bt_search)
                    .addGroup(B_2_Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(B_2_jp_enddate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B_2_Label3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B_2_jp_startdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );

        B_2_scrollPane.setPreferredSize(new java.awt.Dimension(1100, 402));

      
        B_2_scrollPane.setViewportView(B_2_tb_tableRecord);

        javax.swing.GroupLayout B_2_Panel1Layout = new javax.swing.GroupLayout(B_2_Panel1);
        B_2_Panel1.setLayout(B_2_Panel1Layout);
        B_2_Panel1Layout.setHorizontalGroup(
            B_2_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(B_2_scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(B_2_Panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(B_2_Panel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, B_2_Panel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(B_2_Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        B_2_Panel1Layout.setVerticalGroup(
            B_2_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_2_Panel1Layout.createSequentialGroup()
                .addComponent(B_2_Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(B_2_Panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B_2_Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B_2_scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout B_card2Layout = new javax.swing.GroupLayout(B_card2);
        B_card2.setLayout(B_card2Layout);
        B_card2Layout.setHorizontalGroup(
            B_card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(B_2_Panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        B_card2Layout.setVerticalGroup(
            B_card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_card2Layout.createSequentialGroup()
                .addComponent(B_2_Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(B_card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 739, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(B_card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void B_2_bt_startcalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_2_bt_startcalendarActionPerformed
    	new calendarFrame(B_2_tf_startdate);
    }//GEN-LAST:event_B_2_bt_startcalendarActionPerformed

    private void B_2_bt_endcalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_2_bt_endcalendarActionPerformed
    	new calendarFrame(B_2_tf_enddate);
    }//GEN-LAST:event_B_2_bt_endcalendarActionPerformed

    private void B_2_bt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_2_bt_searchActionPerformed
    	searchData();
    	setmodel();
    }//GEN-LAST:event_B_2_bt_searchActionPerformed

    private void getList() {
    	SqlSession ss = Factory.getFactory().openSession();
        list = ss.selectList("attendance.deptAttendance", String.valueOf(Login.mvo.getDeptno()));
        dname = ss.selectOne("dept.getDname", String.valueOf(Login.mvo.getDeptno()));
        if(ss!=null)
        	ss.close();
    }
    
    private void searchData() {
    	Map<String, String> map = new HashMap<String, String>();
    	
    	String start_day = B_2_tf_startdate.getText().trim();
    	if (!start_day.isEmpty()) {
    	    map.put("start_date", start_day); 
    	}

    	String end_day = B_2_tf_enddate.getText().trim();
    	if (!end_day.isEmpty()) {
    	    map.put("end_date", end_day);
    	}
		
		map.put("deptno", String.valueOf(Login.mvo.getDeptno()));
    	
    	SqlSession ss = Factory.getFactory().openSession();
    	list = ss.selectList("attendance.deptAndDate", map);
    	
    	if(ss!=null)
			ss.close();
    }
    
    
    //모델 셋팅하는 함수
    private void setmodel(){
    	SqlSession ss = Factory.getFactory().openSession();
        // jtable의 컬럼명
     	String[] c_name = {"이름", "날짜", "출근 시간", "퇴근 시간", "상태"};
     		
     	//인자로 받은 List를 2차원배열로 만들어보자!
     	String[][] data = new String[list.size()][c_name.length];
     	
        for (int i = 0; i < list.size(); i++) {
			//list로부터 EmpVO를 하나 얻어낸다.
        	AttendanceVO avo = list.get(i);
        	String empno = String.valueOf(avo.getEmpno());
        	EmpVO evo = ss.selectOne("emp.searchEmp", empno);
        	String ename = evo.getEname();       
			//얻어낸 사원 정보를 JTable에 하나의 행으로 표현하기
			//	위해 1차원배열에 채워 넣는다.
			// 2차원 배열 안에 데이터 넣기
			data[i][0] = ename;
			data[i][1] = avo.getDate();
			data[i][2] = avo.getGo_work();
			data[i][3] = avo.getLeave_work();
			data[i][4] = avo.getWork_status();
        }
        DefaultTableModel model = new DefaultTableModel(data, c_name);
        B_2_tb_tableRecord.setModel(model);
        DefaultRowSorter sorter = new TableRowSorter<DefaultTableModel>(model);
        B_2_tb_tableRecord.setRowSorter(sorter);
        B_2_tf_dept.setText(dname);
        
        if(ss != null)
        	ss.close();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel B_2_Label1;
    private javax.swing.JLabel B_2_Label2;
    private javax.swing.JLabel B_2_Label3;
    private javax.swing.JPanel B_2_Panel1;
    private javax.swing.JPanel B_2_Panel2;
    private javax.swing.JPanel B_2_Panel3;
    private javax.swing.JPanel B_2_Panel4;
    private javax.swing.JButton B_2_bt_endcalendar;
    private javax.swing.JButton B_2_bt_search;
    private javax.swing.JButton B_2_bt_startcalendar;
    private javax.swing.JScrollPane B_2_scrollPane;
    private javax.swing.JTable B_2_tb_tableRecord;
    private javax.swing.JTextField B_2_tf_dept;
    private javax.swing.JTextField B_2_tf_enddate;
    private javax.swing.JTextField B_2_tf_startdate;
    private javax.swing.JPanel B_card2;
    private DefaultTableModel model;
    // End of variables declaration//GEN-END:variables
}

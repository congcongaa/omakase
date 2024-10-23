/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.Timestamp;
import java.time.LocalTime;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import dialog.calendarFrame;
import factory.Factory;
import vo.AttendanceVO;
import vo.EmpVO;
import vo.WLogVO;

//import java.sql.Timestamp;
import java.lang.System;

public class A_card5 extends javax.swing.JPanel {
	List<AttendanceVO> list;
	
    public A_card5() {
        initComponents();
        getList();
        setmodel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        A_card5 = new javax.swing.JPanel();
        A_5_pl = new javax.swing.JPanel();
        A_5_pl2 = new javax.swing.JPanel();
        A_5_title = new javax.swing.JLabel();
        A_5_pl3 = new javax.swing.JPanel();
        A_5_bt_att = new javax.swing.JButton();
        A_5_bt_leave = new javax.swing.JButton();
        A_5_lb_string = new javax.swing.JLabel();
        A_5_jp_startdate = new javax.swing.JPanel();
        A_5_tf_startdate = new javax.swing.JTextField();
        A_5_bt_startcalendar = new javax.swing.JButton();
        A_5_jp_enddate = new javax.swing.JPanel();
        A_5_tf_enddate = new javax.swing.JTextField();
        A_5_bt_endcalendar = new javax.swing.JButton();
        A_5_bt_search = new javax.swing.JButton();
        A_5_sp_content = new javax.swing.JScrollPane();
        A_5_tb_content = new javax.swing.JTable();

        A_5_bt_att.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_5_bt_attActionPerformed(evt);
                getList();
                setmodel();
            }
        });
        
        A_5_bt_leave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A_5_bt_leaveActionPerformed(e);
				getList();
				setmodel();
			}
		});
        
        setMaximumSize(new java.awt.Dimension(1100, 700));
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setPreferredSize(new java.awt.Dimension(1100, 700));
        setRequestFocusEnabled(false);

        A_card5.setMaximumSize(new java.awt.Dimension(1100, 700));
        A_card5.setMinimumSize(new java.awt.Dimension(1100, 700));
        A_card5.setPreferredSize(new java.awt.Dimension(1100, 700));

        A_5_pl.setBackground(new java.awt.Color(234, 242, 249));
        A_5_pl.setMaximumSize(new java.awt.Dimension(1100, 700));
        A_5_pl.setMinimumSize(new java.awt.Dimension(1100, 700));

        A_5_pl2.setBackground(new java.awt.Color(52, 73, 102));
        A_5_pl2.setPreferredSize(new java.awt.Dimension(90, 30));

        A_5_title.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        A_5_title.setForeground(new java.awt.Color(255, 255, 255));
        A_5_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        A_5_title.setText("나의 출퇴근 기록관리");

        javax.swing.GroupLayout A_5_pl2Layout = new javax.swing.GroupLayout(A_5_pl2);
        A_5_pl2.setLayout(A_5_pl2Layout);
        A_5_pl2Layout.setHorizontalGroup(
            A_5_pl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_5_pl2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(A_5_title, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        A_5_pl2Layout.setVerticalGroup(
            A_5_pl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_5_pl2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(A_5_title)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        A_5_pl3.setBackground(new java.awt.Color(233, 240, 248));

        A_5_bt_att.setText("출근");

        A_5_bt_leave.setText("퇴근");

        A_5_lb_string.setText("~");

        A_5_jp_startdate.setBackground(new java.awt.Color(255, 255, 255));

        A_5_tf_startdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        A_5_bt_startcalendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/celendar_1.png"))); // NOI18N
        A_5_bt_startcalendar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        A_5_bt_startcalendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_5_bt_startcalendarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout A_5_jp_startdateLayout = new javax.swing.GroupLayout(A_5_jp_startdate);
        A_5_jp_startdate.setLayout(A_5_jp_startdateLayout);
        A_5_jp_startdateLayout.setHorizontalGroup(
            A_5_jp_startdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_5_jp_startdateLayout.createSequentialGroup()
                .addComponent(A_5_tf_startdate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(A_5_bt_startcalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        A_5_jp_startdateLayout.setVerticalGroup(
            A_5_jp_startdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_5_jp_startdateLayout.createSequentialGroup()
                .addGroup(A_5_jp_startdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(A_5_tf_startdate, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(A_5_bt_startcalendar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        A_5_jp_enddate.setBackground(new java.awt.Color(255, 255, 255));

        A_5_tf_enddate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        A_5_bt_endcalendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/celendar_1.png"))); // NOI18N
        A_5_bt_endcalendar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        A_5_bt_endcalendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_5_bt_endcalendarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout A_5_jp_enddateLayout = new javax.swing.GroupLayout(A_5_jp_enddate);
        A_5_jp_enddate.setLayout(A_5_jp_enddateLayout);
        A_5_jp_enddateLayout.setHorizontalGroup(
            A_5_jp_enddateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_5_jp_enddateLayout.createSequentialGroup()
                .addComponent(A_5_tf_enddate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A_5_bt_endcalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        A_5_jp_enddateLayout.setVerticalGroup(
            A_5_jp_enddateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_5_jp_enddateLayout.createSequentialGroup()
                .addComponent(A_5_bt_endcalendar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(A_5_tf_enddate)
        );

        A_5_bt_search.setText("조회");
        A_5_bt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_5_bt_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout A_5_pl3Layout = new javax.swing.GroupLayout(A_5_pl3);
        A_5_pl3.setLayout(A_5_pl3Layout);
        A_5_pl3Layout.setHorizontalGroup(
            A_5_pl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, A_5_pl3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(A_5_jp_startdate, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(A_5_lb_string)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A_5_jp_enddate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(A_5_bt_search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 519, Short.MAX_VALUE)
                .addComponent(A_5_bt_att)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(A_5_bt_leave)
                .addGap(18, 18, 18))
        );
        A_5_pl3Layout.setVerticalGroup(
            A_5_pl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_5_pl3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(A_5_pl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(A_5_pl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(A_5_lb_string, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(A_5_jp_startdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(A_5_jp_enddate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(A_5_pl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(A_5_bt_leave)
                        .addComponent(A_5_bt_att)
                        .addComponent(A_5_bt_search)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        A_5_sp_content.setPreferredSize(new java.awt.Dimension(1100, 402));

        A_5_sp_content.setViewportView(A_5_tb_content);

        javax.swing.GroupLayout A_5_plLayout = new javax.swing.GroupLayout(A_5_pl);
        A_5_pl.setLayout(A_5_plLayout);
        A_5_plLayout.setHorizontalGroup(
            A_5_plLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(A_5_pl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(A_5_pl2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
            .addGroup(A_5_plLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(A_5_sp_content, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        A_5_plLayout.setVerticalGroup(
            A_5_plLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_5_plLayout.createSequentialGroup()
                .addComponent(A_5_pl2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A_5_pl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A_5_sp_content, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout A_card5Layout = new javax.swing.GroupLayout(A_card5);
        A_card5.setLayout(A_card5Layout);
        A_card5Layout.setHorizontalGroup(
            A_card5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(A_5_pl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        A_card5Layout.setVerticalGroup(
            A_card5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, A_card5Layout.createSequentialGroup()
                .addComponent(A_5_pl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(A_card5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 712, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(A_card5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void getList() {
    	SqlSession ss = Factory.getFactory().openSession();
        list = ss.selectList("attendance.getAttendanceInfo", String.valueOf(Login.mvo.getEmpno())); 
        
        if(ss!=null)
        	ss.close();
    }
    
   //모델 셋팅하는 함수
    private void setmodel(){
    	
    	//jtable의 컬럼명
		String[] c_name = {"이름", "날짜", "출근 시간", "퇴근 시간", "상태"};
		
		//인자로 받은 List를 2차원배열로 만들어보자!
		String[][] data = new String[list.size()][c_name.length];
		
		for (int i = 0; i < list.size(); i++) {
			//list로부터 EmpVO를 하나 얻어낸다.
			AttendanceVO vo = list.get(i);
			EmpVO evo = vo.getEvo();
			//얻어낸 사원 정보를 JTable에 하나의 행으로 표현하기
			//	위해 1차원배열에 채워 넣는다.
			// 2차원 배열 안에 데이터 넣기
			data[i][0] = evo.getEname();
			data[i][1] = vo.getDate();
			data[i][2] = vo.getGo_work();
			data[i][3] = vo.getLeave_work();
			data[i][4] = vo.getWork_status();
		}
		DefaultTableModel model = new DefaultTableModel(data, c_name);
        A_5_tb_content.setModel(model);
        DefaultRowSorter sorter = new TableRowSorter<DefaultTableModel>(model);
        A_5_tb_content.setRowSorter(sorter);
        A_5_tb_content.repaint();
        
    }
    
    private void A_5_bt_attActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_5_bt_attActionPerformed
    	SqlSession ss = Factory.getFactory().openSession();
    	
        Map<String, Object> attendanceMap = new HashMap<>();
        attendanceMap.put("deptno", Login.mvo.getDeptno()); 
        attendanceMap.put("empno", Login.mvo.getEmpno());
        attendanceMap.put("date", new Date());
        attendanceMap.put("go_work", LocalTime.now());
        attendanceMap.put("leave_work", null);
        attendanceMap.put("work_status", "출근");

        try {
            int cnt = ss.insert("attendance.A_card5_attendance", attendanceMap);
            if(cnt>0)
            	ss.commit();
            else
            	ss.rollback();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ss.close();
        }
        
    }//GEN-LAST:event_A_5_bt_attActionPerformed

    private void A_5_bt_leaveActionPerformed(java.awt.event.ActionEvent evt) {
    	SqlSession ss = Factory.getFactory().openSession();
    	
        Map<String, Object> leaveMap = new HashMap<>();
        //sql 문장에서 수정해야될것은 leave_work와 work_status이고 empno와 date를 비교해야하기에 이4개의 값을 map에 넣어야함
        leaveMap.put("empno", Login.mvo.getEmpno());
        leaveMap.put("date", new Date());
        leaveMap.put("leave_work", LocalTime.now());
        leaveMap.put("work_status", "퇴근");

        try {
        	int cnt = ss.update("attendance.A_card5_leave", leaveMap);
        	if(cnt>0)
            	ss.commit();
            else
            	ss.rollback();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ss.close();
        }
    	
    }
    
    private void A_5_bt_startcalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_5_bt_startcalendarActionPerformed
    	new calendarFrame(A_5_tf_startdate);
    }//GEN-LAST:event_A_5_bt_startcalendarActionPerformed

    private void A_5_bt_endcalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_5_bt_endcalendarActionPerformed
    	new calendarFrame(A_5_tf_enddate);
    }//GEN-LAST:event_A_5_bt_endcalendarActionPerformed

    private void A_5_bt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_5_bt_searchActionPerformed
    	Map<String, Object> map = new HashMap<String, Object>();

        String start_date = A_5_tf_startdate.getText().trim();
        String end_date = A_5_tf_enddate.getText().trim();

        //스타트 앤드 텍스트 필드 중 하나라도 빈것이 있으면 쿼리를 통해 전부 호출하기 위해
        if (!start_date.isEmpty()) {
        	map.put("start_date", start_date);
        }
        if (!end_date.isEmpty()) {
        	map.put("end_date", end_date);
        }
        
        map.put("empno", Login.mvo.getEmpno());
        
        SqlSession ss = Factory.getFactory().openSession();

        list = ss.selectList("attendance.A_card5_searchdate", map);
        
        if(ss!=null)
        	ss.close();

        setmodel();
    }//GEN-LAST:event_A_5_bt_searchActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A_5_bt_att;
    private javax.swing.JButton A_5_bt_endcalendar;
    private javax.swing.JButton A_5_bt_leave;
    private javax.swing.JButton A_5_bt_search;
    private javax.swing.JButton A_5_bt_startcalendar;
    private javax.swing.JPanel A_5_jp_enddate;
    private javax.swing.JPanel A_5_jp_startdate;
    private javax.swing.JLabel A_5_lb_string;
    private javax.swing.JPanel A_5_pl;
    private javax.swing.JPanel A_5_pl2;
    private javax.swing.JPanel A_5_pl3;
    private javax.swing.JScrollPane A_5_sp_content;
    private javax.swing.JTable A_5_tb_content;
    private javax.swing.JTextField A_5_tf_enddate;
    private javax.swing.JTextField A_5_tf_startdate;
    private javax.swing.JLabel A_5_title;
    private javax.swing.JPanel A_card5;
    private DefaultTableModel model;
    // End of variables declaration//GEN-END:variables
}

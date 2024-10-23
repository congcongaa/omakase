/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import org.apache.ibatis.session.SqlSession;

import dialog.calendarFrame;
import factory.Factory;
import vo.EmpVO;
import vo.WLogVO;

/**
 *
 * @author 20191
 */
public class B_card1 extends javax.swing.JPanel {
	List<WLogVO> list;
	String selectData;
    
    public B_card1() {
        initComponents();
        searchList();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        B_card1 = new javax.swing.JPanel();
        B_1_Label1 = new javax.swing.JLabel();
        B_1_tf_totalLog = new javax.swing.JTextField();
        B_1_cb_registrant = new javax.swing.JComboBox<>();
        B_1_tf_inputLog = new javax.swing.JTextField();
        B_1_bt_searchLog = new javax.swing.JButton();
        B_1_lb_total = new javax.swing.JLabel();
        B_1_scrollPane = new javax.swing.JScrollPane();
        B_1_tb_tableLog = new javax.swing.JTable();
        B_1_tb_tableLog.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				B_1_tb_tableLogMouseClicked(e);
			}
        	
        });
        B_1_jp_1 = new javax.swing.JPanel();
        B_1_Label2 = new javax.swing.JLabel();
        B_1_jp_2 = new javax.swing.JPanel();
        B_1_tf_startdate = new javax.swing.JTextField();
        B_1_bt_startCalender = new javax.swing.JButton();
        B_1_jp_3 = new javax.swing.JPanel();
        B_1_tf_enddate = new javax.swing.JTextField();
        B_1_bt_endCalender = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1100, 700));
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setPreferredSize(new java.awt.Dimension(1100, 700));

        B_card1.setBackground(new java.awt.Color(215, 225, 234));
        B_card1.setMaximumSize(new java.awt.Dimension(1100, 700));
        B_card1.setMinimumSize(new java.awt.Dimension(1100, 700));
        B_card1.setPreferredSize(new java.awt.Dimension(1100, 700));

        B_1_Label1.setText("~");

        B_1_tf_totalLog.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
   
        B_1_cb_registrant.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "등록자", "제목", "번호" }));

        B_1_bt_searchLog.setText("검색");
        B_1_bt_searchLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_1_bt_searchLogActionPerformed(evt);
            }
        });

        B_1_lb_total.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        B_1_lb_total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B_1_lb_total.setText("전체");
        B_1_lb_total.setFocusable(false);
        B_1_lb_total.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        B_1_scrollPane.setViewportView(B_1_tb_tableLog);

        B_1_jp_1.setBackground(new java.awt.Color(52, 73, 102));
        B_1_jp_1.setPreferredSize(new java.awt.Dimension(90, 30));

        B_1_Label2.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        B_1_Label2.setForeground(new java.awt.Color(255, 255, 255));
        B_1_Label2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        B_1_Label2.setText("부서 내 업무일지");

        javax.swing.GroupLayout B_1_jp_1Layout = new javax.swing.GroupLayout(B_1_jp_1);
        B_1_jp_1.setLayout(B_1_jp_1Layout);
        B_1_jp_1Layout.setHorizontalGroup(
            B_1_jp_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_1_jp_1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(B_1_Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        B_1_jp_1Layout.setVerticalGroup(
            B_1_jp_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_1_jp_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B_1_Label2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        B_1_jp_2.setBackground(new java.awt.Color(255, 255, 255));
        B_1_jp_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        B_1_jp_2.setToolTipText("");

        B_1_tf_startdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        B_1_bt_startCalender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendar.png"))); // NOI18N
        B_1_bt_startCalender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B_1_bt_startCalender.setPreferredSize(new java.awt.Dimension(29, 29));
        B_1_bt_startCalender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_1_bt_startCalenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout B_1_jp_2Layout = new javax.swing.GroupLayout(B_1_jp_2);
        B_1_jp_2.setLayout(B_1_jp_2Layout);
        B_1_jp_2Layout.setHorizontalGroup(
            B_1_jp_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_1_jp_2Layout.createSequentialGroup()
                .addComponent(B_1_tf_startdate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(B_1_bt_startCalender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        B_1_jp_2Layout.setVerticalGroup(
            B_1_jp_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_1_jp_2Layout.createSequentialGroup()
                .addGroup(B_1_jp_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B_1_tf_startdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_1_bt_startCalender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        B_1_jp_3.setBackground(new java.awt.Color(255, 255, 255));
        B_1_jp_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        B_1_jp_3.setToolTipText("");

        B_1_tf_enddate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        B_1_bt_endCalender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendar.png"))); // NOI18N
        B_1_bt_endCalender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B_1_bt_endCalender.setPreferredSize(new java.awt.Dimension(29, 29));
        B_1_bt_endCalender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_1_bt_endCalenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout B_1_jp_3Layout = new javax.swing.GroupLayout(B_1_jp_3);
        B_1_jp_3.setLayout(B_1_jp_3Layout);
        B_1_jp_3Layout.setHorizontalGroup(
            B_1_jp_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_1_jp_3Layout.createSequentialGroup()
                .addComponent(B_1_tf_enddate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(B_1_bt_endCalender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        B_1_jp_3Layout.setVerticalGroup(
            B_1_jp_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_1_jp_3Layout.createSequentialGroup()
                .addComponent(B_1_bt_endCalender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(B_1_tf_enddate)
        );

        javax.swing.GroupLayout B_card1Layout = new javax.swing.GroupLayout(B_card1);
        B_card1.setLayout(B_card1Layout);
        B_card1Layout.setHorizontalGroup(
            B_card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(B_1_jp_1, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
            .addGroup(B_card1Layout.createSequentialGroup()
                .addGroup(B_card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(B_card1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(B_1_lb_total, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B_1_tf_totalLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132)
                        .addComponent(B_1_jp_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B_1_Label1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B_1_jp_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(B_1_cb_registrant, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B_1_tf_inputLog, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B_1_bt_searchLog, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(B_card1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(B_1_scrollPane)))
                .addContainerGap())
        );
        B_card1Layout.setVerticalGroup(
            B_card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_card1Layout.createSequentialGroup()
                .addComponent(B_1_jp_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(B_card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(B_card1Layout.createSequentialGroup()
                        .addGroup(B_card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B_1_lb_total, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B_1_tf_totalLog))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE))
                    .addGroup(B_card1Layout.createSequentialGroup()
                        .addGroup(B_card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(B_card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(B_1_jp_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(B_1_jp_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(B_1_Label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(B_card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(B_1_bt_searchLog, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(B_1_tf_inputLog, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(B_1_cb_registrant, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(B_1_scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(B_card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(B_card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void B_1_bt_searchLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_1_bt_searchLogActionPerformed
    	searchList();
    }//GEN-LAST:event_B_1_bt_searchLogActionPerformed

    private void B_1_bt_startCalenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_1_bt_startCalenderActionPerformed
    	new calendarFrame(B_1_tf_startdate);
    }//GEN-LAST:event_B_1_bt_startCalenderActionPerformed

    private void B_1_bt_endCalenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_1_bt_endCalenderActionPerformed
    	new calendarFrame(B_1_tf_enddate);
    }//GEN-LAST:event_B_1_bt_endCalenderActionPerformed

    private void B_1_tb_tableLogMouseClicked(MouseEvent evt) {
    	checkWlog();
    }
    
    public void searchList() {
    	Map<String, String> map = new HashMap<String, String>();
    	
    	String start_day = B_1_tf_startdate.getText().trim();
    	if (!start_day.isEmpty()) {
    	    map.put("w_start_date", start_day); 
    	}

    	String end_day = B_1_tf_enddate.getText().trim();
    	if (!end_day.isEmpty()) {
    	    map.put("w_end_date", end_day);
    	}
    	
    	int idx = B_1_cb_registrant.getSelectedIndex(); //콤보박스 내용 확인
		String key = null; 
		switch (idx) {
			case 0:
				key = "ename";
				break;
			case 1:
				key = "w_title";
				break;
			case 2:
				key = "w_idx";
				break;
		}
		String str = B_1_tf_inputLog.getText().trim();
		if(str != null) {
			str = B_1_tf_inputLog.getText().trim();
			map.put(key, str);
		}
		map.put("deptno", String.valueOf(Login.mvo.getDeptno()));
		
		SqlSession ss = Factory.getFactory().openSession();
    	list = ss.selectList("w_log.searchAll", map);
    	
    	if(ss!=null)
    		ss.close();
    	
    	viewTable();
    }
    
    public void viewTable() {
    	SqlSession ss = Factory.getFactory().openSession();
		// jtable의 컬럼명
		String[] c_name = {"번호", "제목", "등록자", "등록일", "확인"};
		
		//인자로 받은 List를 2차원배열로 만들어보자!
		String[][] data = new String[list.size()][c_name.length];
		
		for (int i = 0; i < list.size(); i++) {
			//list로부터 EmpVO를 하나 얻어낸다.
			WLogVO vo = list.get(i);
			String W_date = vo.getW_date().toString();
			int indexOfSpace = W_date.indexOf(' ');
			String formattedW_date = W_date.substring(0, indexOfSpace);
			
			//얻어낸 사원 정보를 JTable에 하나의 행으로 표현하기
			//	위해 1차원배열에 채워 넣는다.
			// 2차원 배열 안에 데이터 넣기
			data[i][0] = String.valueOf(vo.getW_idx());
			data[i][1] = vo.getW_name();
			
			String empno = String.valueOf(vo.getEmpno());
			EmpVO evo = ss.selectOne("emp.searchEmp", empno);
			String ename = evo.getEname();
			
			data[i][2] = ename;
			
			W_date = vo.getW_date().toString();
			indexOfSpace = W_date.indexOf(' ');
			formattedW_date = W_date.substring(0, indexOfSpace);
			data[i][3] = formattedW_date;
			if(vo.getW_check()==1)
				data[i][4] = "확인";
			else
				data[i][4] = "미확인";
		}
        DefaultTableModel model = new DefaultTableModel(data, c_name);
		B_1_tb_tableLog.setModel(model);
        DefaultRowSorter sorter = new TableRowSorter<DefaultTableModel>(model);
        B_1_tb_tableLog.setRowSorter(sorter);
		B_1_tf_totalLog.setText(String.valueOf(list.size()));
		
		if(ss != null)
			ss.close();
	}
    
    private void checkWlog() {
		SqlSession ss = Factory.getFactory().openSession();
		int selectRow = B_1_tb_tableLog.getSelectedRow();
    	
    	if( selectRow != -1 ) {
    		selectData = B_1_tb_tableLog.getValueAt(selectRow, 0).toString();
    		System.out.println(selectData);
    		
    		int cnt = ss.update("w_log.updateWlogCheck", selectData);
        	if(cnt >0) ss.commit();
        	else ss.rollback();
    		
        	A_card2_3 card2_3 = new A_card2_3(selectData);
        	Background.content_card.add(card2_3, "A_card2_3");
        	CardLayout card = (CardLayout)Background.content_card.getLayout();
        	card.show(Background.content_card, "A_card2_3");
        	
    	}
		if(ss!=null)
			ss.close();
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel B_1_Label1;
    private javax.swing.JLabel B_1_Label2;
    private javax.swing.JButton B_1_bt_endCalender;
    private javax.swing.JButton B_1_bt_searchLog;
    private javax.swing.JButton B_1_bt_startCalender;
    private javax.swing.JComboBox<String> B_1_cb_registrant;
    private javax.swing.JPanel B_1_jp_1;
    private javax.swing.JPanel B_1_jp_2;
    private javax.swing.JPanel B_1_jp_3;
    private javax.swing.JLabel B_1_lb_total;
    private javax.swing.JScrollPane B_1_scrollPane;
    private javax.swing.JTable B_1_tb_tableLog;
    private javax.swing.JTextField B_1_tf_enddate;
    private javax.swing.JTextField B_1_tf_inputLog;
    private javax.swing.JTextField B_1_tf_startdate;
    private javax.swing.JTextField B_1_tf_totalLog;
    private javax.swing.JPanel B_card1;
    // End of variables declaration//GEN-END:variables
}

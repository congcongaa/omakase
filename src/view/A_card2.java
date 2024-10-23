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

import org.apache.ibatis.session.SqlSession;

import dialog.calendarFrame;
import factory.Factory;
import vo.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.TableRowSorter;

public class A_card2 extends javax.swing.JPanel {
	List<WLogVO> list; //현재 창에 보여질 업무일지 리스트
	
    public A_card2() {
        initComponents();
        searchList();
        viewTable();
    }

    public void searchList() { //지역 변수 list를 찾는 함수
    	
    	Map<String, String> map = new HashMap<String, String>();
    	
    	String start_day = A_2_tf_startdate.getText().trim();
    	if (!start_day.isEmpty()) {
    	    map.put("w_start_date", start_day); 
    	}

    	String end_day = A_2_tf_enddate.getText().trim();
    	if (!end_day.isEmpty()) {
    	    map.put("w_end_date", end_day);
    	}
		
    	int idx = A_2_cb_search.getSelectedIndex(); //콤보박스 내용 확인
		String key = null; 
		switch (idx) {
			case 0:
				key = "w_title";
				break;
			case 1:
				key = "w_idx";
				break;
		}
		
		String str = A_2_tf_search.getText().trim();
		if(!str.isEmpty()) {
			map.put(key, str);
		}
		
		map.put("empno", String.valueOf(Login.mvo.getEmpno()));
    	
    	SqlSession ss = Factory.getFactory().openSession();
    	list = ss.selectList("w_log.myWlog", map); //내 업무 일지 중 검색어 or 검색어 없이 찾음
    	
    	if(ss!=null)
			ss.close();
    }
    
    public void viewTable() { //지역 변수 list를 화면에 띄우는 함수
    	
		// jtable의 컬럼명
		String[] c_name = {"번호", "제목", "등록자", "등록일", "확인"};
		
		//인자로 받은 List를 2차원배열로 만들어보자!
		String[][] data = new String[list.size()][c_name.length];
		
		for (int i = 0; i < list.size(); i++) {
			//list로부터 EmpVO를 하나 얻어낸다.
			WLogVO vo = list.get(i);
			
			//얻어낸 사원 정보를 JTable에 하나의 행으로 표현하기
			//	위해 1차원배열에 채워 넣는다.
			// 2차원 배열 안에 데이터 넣기
			data[i][0] = String.valueOf(vo.getW_idx());
			data[i][1] = vo.getW_name();
			data[i][2] = vo.getEname();
			String W_date = vo.getW_date().toString();
			int indexOfSpace = W_date.indexOf(' ');
			String formattedW_date = W_date.substring(0, indexOfSpace);
			data[i][3] = formattedW_date;
			if(vo.getW_check()==1)
				data[i][4] = "확인";
			else
				data[i][4] = "미확인";
        }
        DefaultTableModel model = new DefaultTableModel(data, c_name);
        A_2_tb_log.setModel(model);
        DefaultRowSorter sorter = new TableRowSorter<DefaultTableModel>(model);
        A_2_tb_log.setRowSorter(sorter);
		A_2_tf_total.setText(String.valueOf(list.size()));
    }
    
    private void viewWlog() {
		SqlSession ss = Factory.getFactory().openSession();
		int selectRow = A_2_tb_log.getSelectedRow();
    	
    	if( selectRow != -1 ) {
    		String selectData = A_2_tb_log.getValueAt(selectRow, 0).toString();
    		//System.out.println(selectData);
    		viewWlog(selectData);
    	}
		if(ss!=null)
			ss.close();
	}
    
    private void viewWlog(String selectData) {
    	A_card2_1 card2_1 = new A_card2_1(selectData);
    	Background.content_card.add(card2_1, "A_card2_1");
    	CardLayout card = (CardLayout)Background.content_card.getLayout();
    	card.show(Background.content_card, "A_card2_1");
    }
    
    private void initComponents() {
        A_card2 = new javax.swing.JPanel();
        A_2_lb_total = new javax.swing.JLabel();
        A_2_tf_total = new javax.swing.JTextField();
        A_2_lb_middle = new javax.swing.JLabel();
        A_2_cb_search = new javax.swing.JComboBox<>();
        A_2_tf_search = new javax.swing.JTextField();
        A_2_bt_search = new javax.swing.JButton();
        A_2_bt_add = new javax.swing.JButton();
        A_2_sp_log = new javax.swing.JScrollPane();
        A_2_tb_log = new javax.swing.JTable();
        A_2_tb_log.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		A_2_tb_logMouseClicked(e);
        	}
        });
        A_2_pl_title = new javax.swing.JPanel();
        A_2_lb_title = new javax.swing.JLabel();
        A_2_jp_startdate = new javax.swing.JPanel();
        A_2_tf_startdate = new javax.swing.JTextField();
        A_2_bt_startcalendar = new javax.swing.JButton();
        A_2_jp_enddate = new javax.swing.JPanel();
        A_2_tf_enddate = new javax.swing.JTextField();
        A_2_bt_endcalendar = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1100, 700));
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setPreferredSize(new java.awt.Dimension(1100, 700));

        A_card2.setBackground(new java.awt.Color(233, 240, 248));
        A_card2.setMaximumSize(new java.awt.Dimension(1100, 700));
        A_card2.setMinimumSize(new java.awt.Dimension(1100, 700));
        A_card2.setPreferredSize(new java.awt.Dimension(1100, 700));

        A_2_lb_total.setText("전체");

        A_2_lb_middle.setText("~");

        A_2_cb_search.setModel(new DefaultComboBoxModel(new String[] {"제목", "번호"}));

        A_2_tf_search.setText("");

        A_2_bt_search.setText("검색");
        A_2_bt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_2_bt_searchActionPerformed(evt);
            }
        });

        A_2_bt_add.setText("등록");
        A_2_bt_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_2_bt_addActionPerformed(evt);
            }
        });

        A_2_sp_log.setViewportView(A_2_tb_log);

        A_2_pl_title.setBackground(new java.awt.Color(52, 73, 102));
        A_2_pl_title.setPreferredSize(new java.awt.Dimension(90, 30));

        A_2_lb_title.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        A_2_lb_title.setForeground(new java.awt.Color(255, 255, 255));
        A_2_lb_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A_2_lb_title.setText("나의 업무일지");

        javax.swing.GroupLayout A_2_pl_titleLayout = new javax.swing.GroupLayout(A_2_pl_title);
        A_2_pl_titleLayout.setHorizontalGroup(
        	A_2_pl_titleLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(A_2_pl_titleLayout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(A_2_lb_title, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(947, Short.MAX_VALUE))
        );
        A_2_pl_titleLayout.setVerticalGroup(
        	A_2_pl_titleLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(A_2_pl_titleLayout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(A_2_lb_title, GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        			.addContainerGap())
        );
        A_2_pl_title.setLayout(A_2_pl_titleLayout);

        A_2_jp_startdate.setBackground(new java.awt.Color(255, 255, 255));

        A_2_tf_startdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        A_2_bt_startcalendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/celendar_1.png"))); // NOI18N
        A_2_bt_startcalendar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        A_2_bt_startcalendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_2_bt_startcalendarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout A_2_jp_startdateLayout = new javax.swing.GroupLayout(A_2_jp_startdate);
        A_2_jp_startdate.setLayout(A_2_jp_startdateLayout);
        A_2_jp_startdateLayout.setHorizontalGroup(
            A_2_jp_startdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_2_jp_startdateLayout.createSequentialGroup()
                .addComponent(A_2_tf_startdate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(A_2_bt_startcalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        A_2_jp_startdateLayout.setVerticalGroup(
            A_2_jp_startdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_2_jp_startdateLayout.createSequentialGroup()
                .addGroup(A_2_jp_startdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(A_2_tf_startdate, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(A_2_bt_startcalendar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        A_2_jp_enddate.setBackground(new java.awt.Color(255, 255, 255));

        A_2_tf_enddate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        A_2_bt_endcalendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/celendar_1.png"))); // NOI18N
        A_2_bt_endcalendar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        A_2_bt_endcalendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_2_bt_endcalendarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout A_2_jp_enddateLayout = new javax.swing.GroupLayout(A_2_jp_enddate);
        A_2_jp_enddate.setLayout(A_2_jp_enddateLayout);
        A_2_jp_enddateLayout.setHorizontalGroup(
            A_2_jp_enddateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_2_jp_enddateLayout.createSequentialGroup()
                .addComponent(A_2_tf_enddate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(A_2_bt_endcalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        A_2_jp_enddateLayout.setVerticalGroup(
            A_2_jp_enddateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(A_2_bt_endcalendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(A_2_tf_enddate)
        );

        javax.swing.GroupLayout A_card2Layout = new javax.swing.GroupLayout(A_card2);
        A_card2.setLayout(A_card2Layout);
        A_card2Layout.setHorizontalGroup(
            A_card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(A_2_pl_title, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, A_card2Layout.createSequentialGroup()
                .addGroup(A_card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(A_card2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(A_2_lb_total, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A_2_tf_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(A_2_jp_startdate, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A_2_lb_middle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A_2_jp_enddate, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(A_2_cb_search, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A_2_tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A_2_bt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(A_card2Layout.createSequentialGroup()
                        .addContainerGap(16, Short.MAX_VALUE)
                        .addGroup(A_card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(A_2_bt_add)
                            .addComponent(A_2_sp_log, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21))
        );
        A_card2Layout.setVerticalGroup(
            A_card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_card2Layout.createSequentialGroup()
                .addComponent(A_2_pl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(A_card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(A_card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(A_2_lb_middle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(A_card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(A_2_jp_enddate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(A_card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(A_2_cb_search)
                                .addComponent(A_2_tf_search)
                                .addComponent(A_2_bt_search)))
                        .addComponent(A_2_jp_startdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(A_card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(A_2_lb_total, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(A_2_tf_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A_2_sp_log, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A_2_bt_add)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(A_card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(A_card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void A_2_bt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_2_bt_searchActionPerformed
    	searchList();
        viewTable();
    }//GEN-LAST:event_A_2_bt_searchActionPerformed

    private void A_2_bt_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_2_bt_addActionPerformed
    	A_card2_2 card2_2 = new A_card2_2();
    	Background.content_card.add(card2_2, "A_card2_2");
    	CardLayout card = (CardLayout)Background.content_card.getLayout();
    	card.show(Background.content_card, "A_card2_2");
    }//GEN-LAST:event_A_2_bt_addActionPerformed

    private void A_2_bt_startcalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_2_bt_startcalendarActionPerformed
    	new calendarFrame(A_2_tf_startdate);
    }//GEN-LAST:event_A_2_bt_startcalendarActionPerformed

    private void A_2_bt_endcalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_2_bt_endcalendarActionPerformed
    	new calendarFrame(A_2_tf_enddate);
    }//GEN-LAST:event_A_2_bt_endcalendarActionPerformed
    
    private void A_2_tb_logMouseClicked(MouseEvent evt) {
    	viewWlog();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A_2_bt_add;
    private javax.swing.JButton A_2_bt_endcalendar;
    private javax.swing.JButton A_2_bt_search;
    private javax.swing.JButton A_2_bt_startcalendar;
    private javax.swing.JComboBox<String> A_2_cb_search;
    private javax.swing.JPanel A_2_jp_enddate;
    private javax.swing.JPanel A_2_jp_startdate;
    private javax.swing.JLabel A_2_lb_middle;
    private javax.swing.JLabel A_2_lb_title;
    private javax.swing.JLabel A_2_lb_total;
    private javax.swing.JPanel A_2_pl_title;
    private javax.swing.JScrollPane A_2_sp_log;
    javax.swing.JTable A_2_tb_log;
    private javax.swing.JTextField A_2_tf_enddate;
    private javax.swing.JTextField A_2_tf_search;
    javax.swing.JTextField A_2_tf_startdate;
    javax.swing.JTextField A_2_tf_total;
    private javax.swing.JPanel A_card2;
    // End of variables declaration//GEN-END:variables
}

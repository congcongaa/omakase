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

import factory.Factory;
import vo.DeptVO;
import vo.*;

public class B_card4 extends javax.swing.JPanel {
	List<EmpVO> list;
    
    public B_card4() {
        initComponents();
        searchList();
        viewTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        B_card4 = new javax.swing.JPanel();
        B_4_scrollPane = new javax.swing.JScrollPane();
        B_4_tb_tableTeam = new javax.swing.JTable();
        B_4_Panel1 = new javax.swing.JPanel();
        B_3_Label6 = new javax.swing.JLabel();
        B_4_Panel2 = new javax.swing.JPanel();
        B_4_Label2 = new javax.swing.JLabel();
        B_4_tf_totalMem = new javax.swing.JTextField();
        B_4_cb_number = new javax.swing.JComboBox<>();
        B_4_tf_inputnum = new javax.swing.JTextField();
        B_4_bt_searchMem = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1100, 700));
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setPreferredSize(new java.awt.Dimension(1100, 700));
        setRequestFocusEnabled(false);

        B_card4.setBackground(new java.awt.Color(215, 225, 234));
        B_card4.setMaximumSize(new java.awt.Dimension(1100, 700));
        B_card4.setMinimumSize(new java.awt.Dimension(1100, 700));
        B_card4.setPreferredSize(new java.awt.Dimension(1100, 700));

        B_4_scrollPane.setViewportView(B_4_tb_tableTeam);

        B_4_Panel1.setBackground(new java.awt.Color(52, 73, 102));

        B_3_Label6.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        B_3_Label6.setForeground(new java.awt.Color(255, 255, 255));
        B_3_Label6.setText("부서원 관리");

        javax.swing.GroupLayout B_4_Panel1Layout = new javax.swing.GroupLayout(B_4_Panel1);
        B_4_Panel1.setLayout(B_4_Panel1Layout);
        B_4_Panel1Layout.setHorizontalGroup(
            B_4_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_4_Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B_3_Label6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        B_4_Panel1Layout.setVerticalGroup(
            B_4_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_4_Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B_3_Label6)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        B_4_Panel2.setBackground(new java.awt.Color(175, 209, 235));

        B_4_Label2.setFont(new java.awt.Font("맑은 고딕", 0, 13)); // NOI18N
        B_4_Label2.setText("전체");

        B_4_cb_number.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "이름", "전화번호"}));

        B_4_bt_searchMem.setText("검색");
        B_4_bt_searchMem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_4_bt_searchMemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout B_4_Panel2Layout = new javax.swing.GroupLayout(B_4_Panel2);
        B_4_Panel2.setLayout(B_4_Panel2Layout);
        B_4_Panel2Layout.setHorizontalGroup(
            B_4_Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, B_4_Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B_4_Label2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B_4_tf_totalMem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(B_4_cb_number, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B_4_tf_inputnum, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B_4_bt_searchMem)
                .addContainerGap())
        );
        B_4_Panel2Layout.setVerticalGroup(
            B_4_Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_4_Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(B_4_Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_4_Label2)
                    .addComponent(B_4_tf_totalMem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_4_cb_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_4_tf_inputnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_4_bt_searchMem))
                .addContainerGap())
        );

        javax.swing.GroupLayout B_card4Layout = new javax.swing.GroupLayout(B_card4);
        B_card4.setLayout(B_card4Layout);
        B_card4Layout.setHorizontalGroup(
            B_card4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_card4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B_4_scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1088, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(B_4_Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(B_4_Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        B_card4Layout.setVerticalGroup(
            B_card4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_card4Layout.createSequentialGroup()
                .addComponent(B_4_Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(B_4_Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B_4_scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
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
                    .addComponent(B_card4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(B_card4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void B_4_bt_searchMemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_4_bt_searchMemActionPerformed
        searchList();
        viewTable();
    }//GEN-LAST:event_B_4_bt_searchMemActionPerformed

    private void searchList() {
    	Map<String, String> map = new HashMap<String, String>();
    	
		// 1)콤보박스에 선택된 index값 얻기
		int idx = B_4_cb_number.getSelectedIndex();
		String key = null;
		switch(idx) {
			case 0:
				key = "ename";
				break;
			case 1:
				key = "phone";
				break;
		}//switch의 끝
		
		// 2)텍스트필드에서 사용자가 입력한 검색어를 얻기
		String str = B_4_tf_inputnum.getText().trim();
		if(str!=null) {
			// 3)emp.search에 전달할 인자 Map객체 준비
			map.put(key, str);
		}
		map.put("deptno", String.valueOf(Login.mvo.getDeptno()));
		
		SqlSession ss = Factory.getFactory().openSession();
		
		list = ss.selectList("emp.myDeptEmp", map);
		System.out.println(list.size());
		
		if(ss!=null)
			ss.close();
	}
    
    public void viewTable() {
    	String[] e_table = {"이름","부서","내선번호","전화번호"};
    	String[][] data = new String[list.size()][e_table.length];
    	
    	for(int i=0; i<list.size();i++) {
    		EmpVO evo = list.get(i);
    		DeptVO dvo = evo.getDvo();
    		
    		data[i][0] = evo.getEname();//이름
			data[i][1] = dvo.getDname(); //부서코드
			data[i][2] = dvo.getD_number(); //내선번호
			data[i][3] = evo.getPhone();//전화번호
            
        }
    	// 검색 결과로 테이블 업데이트
        DefaultTableModel model = new DefaultTableModel(data, e_table);
        B_4_tb_tableTeam.setModel(model);
        DefaultRowSorter sorter = new TableRowSorter<DefaultTableModel>(model);
        B_4_tb_tableTeam.setRowSorter(sorter);
        
        // 검색 결과의 행 수를 텍스트 필드에 표시
        int rowCount = model.getRowCount();
        B_4_tf_totalMem.setText(String.valueOf(rowCount));
	}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel B_3_Label6;
    private javax.swing.JLabel B_4_Label2;
    private javax.swing.JPanel B_4_Panel1;
    private javax.swing.JPanel B_4_Panel2;
    private javax.swing.JButton B_4_bt_searchMem;
    private javax.swing.JComboBox<String> B_4_cb_number;
    private javax.swing.JScrollPane B_4_scrollPane;
    private javax.swing.JTable B_4_tb_tableTeam;
    private javax.swing.JTextField B_4_tf_inputnum;
    private javax.swing.JTextField B_4_tf_totalMem;
    private javax.swing.JPanel B_card4;
    // End of variables declaration//GEN-END:variables
}

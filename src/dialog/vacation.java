
package dialog;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.swing.JOptionPane;

import org.apache.ibatis.session.SqlSession;

import factory.Factory;
import view.*;
import vo.EmpVO;
import vo.VacationVO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class vacation extends javax.swing.JDialog {
	A_card3 a3;
    
	public vacation(A_card3 a3) {
		this.a3 = a3;
		initComponents();
		this.setVisible(true);
	}
	
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        D_vacation_jp = new javax.swing.JPanel();
        D_vacation_lb_title = new javax.swing.JLabel();
        D_vacation_js_line = new javax.swing.JSeparator();
        D_vacation_lb_vdate = new javax.swing.JLabel();
        D_vacation_lb_vtime = new javax.swing.JLabel();
        D_vacation_lb_vcate = new javax.swing.JLabel();
        D_vacation_lb_vcontent = new javax.swing.JLabel();
        D_vacation_bt_request = new javax.swing.JButton();
        D_vacation_bt_close = new javax.swing.JButton();
        D_vacation_lb_wave = new javax.swing.JLabel();
        D_vacation_lb_il = new javax.swing.JLabel();
        D_vacation_jscroll = new javax.swing.JScrollPane();
        D_vacation_ta_vcontent = new javax.swing.JTextArea();
        D_vacation_cb_vcate = new javax.swing.JComboBox<>();
        D_vacation_pl_v_sdate1 = new javax.swing.JPanel();
        D_vacation_tf_v_sdate1 = new javax.swing.JTextField();
        D_vacation_bt_start_calendar1 = new javax.swing.JButton();
        D_vacation_pl_v_sdate = new javax.swing.JPanel();
        D_vacation_tf_v_sdate = new javax.swing.JTextField();
        D_vacation_bt_start_calendar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 650));
        setMinimumSize(new java.awt.Dimension(1000, 650));

        D_vacation_jp.setBackground(new java.awt.Color(255, 255, 255));

        D_vacation_lb_title.setFont(new java.awt.Font("맑은 고딕", 1, 22)); // NOI18N
        D_vacation_lb_title.setText("근태 신청");

        D_vacation_lb_vdate.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        D_vacation_lb_vdate.setText("근태 신청일");

        D_vacation_lb_vtime.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        D_vacation_lb_vtime.setText("근태시간");

        D_vacation_lb_vcate.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        D_vacation_lb_vcate.setText("근태 유형");

        D_vacation_lb_vcontent.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        D_vacation_lb_vcontent.setText("휴가 사유");

        D_vacation_bt_request.setBackground(new java.awt.Color(0, 153, 255));
        D_vacation_bt_request.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        D_vacation_bt_request.setForeground(new java.awt.Color(255, 255, 255));
        D_vacation_bt_request.setText("상신");
        D_vacation_bt_request.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_vacation_bt_requestActionPerformed(evt);
            }
        });

        D_vacation_bt_close.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        D_vacation_bt_close.setText("닫기");
        D_vacation_bt_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_vacation_bt_closeActionPerformed(evt);
            }
        });

        D_vacation_lb_wave.setText("~");

        D_vacation_lb_il.setText("일");

        D_vacation_ta_vcontent.setColumns(20);
        D_vacation_ta_vcontent.setRows(5);
        D_vacation_jscroll.setViewportView(D_vacation_ta_vcontent);

        D_vacation_cb_vcate.setModel(new DefaultComboBoxModel(new String[] {"외근", "출장", "연장근무", "연차"}));

        D_vacation_pl_v_sdate1.setBackground(new java.awt.Color(255, 255, 255));
        D_vacation_pl_v_sdate1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        D_vacation_pl_v_sdate1.setToolTipText("");

        D_vacation_tf_v_sdate1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        D_vacation_bt_start_calendar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendar.png"))); // NOI18N
        D_vacation_bt_start_calendar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        D_vacation_bt_start_calendar1.setPreferredSize(new java.awt.Dimension(29, 29));
        D_vacation_bt_start_calendar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_vacation_bt_start_calendar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout D_vacation_pl_v_sdate1Layout = new javax.swing.GroupLayout(D_vacation_pl_v_sdate1);
        D_vacation_pl_v_sdate1.setLayout(D_vacation_pl_v_sdate1Layout);
        D_vacation_pl_v_sdate1Layout.setHorizontalGroup(
            D_vacation_pl_v_sdate1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(D_vacation_pl_v_sdate1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(D_vacation_tf_v_sdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(D_vacation_bt_start_calendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        D_vacation_pl_v_sdate1Layout.setVerticalGroup(
            D_vacation_pl_v_sdate1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(D_vacation_bt_start_calendar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(D_vacation_tf_v_sdate1)
        );

        D_vacation_pl_v_sdate.setBackground(new java.awt.Color(255, 255, 255));
        D_vacation_pl_v_sdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        D_vacation_pl_v_sdate.setToolTipText("");

        D_vacation_tf_v_sdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        D_vacation_bt_start_calendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendar.png"))); // NOI18N
        D_vacation_bt_start_calendar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        D_vacation_bt_start_calendar.setPreferredSize(new java.awt.Dimension(29, 29));
        D_vacation_bt_start_calendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_vacation_bt_start_calendarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout D_vacation_pl_v_sdateLayout = new javax.swing.GroupLayout(D_vacation_pl_v_sdate);
        D_vacation_pl_v_sdate.setLayout(D_vacation_pl_v_sdateLayout);
        D_vacation_pl_v_sdateLayout.setHorizontalGroup(
            D_vacation_pl_v_sdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(D_vacation_pl_v_sdateLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(D_vacation_tf_v_sdate, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(D_vacation_bt_start_calendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        D_vacation_pl_v_sdateLayout.setVerticalGroup(
            D_vacation_pl_v_sdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(D_vacation_bt_start_calendar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(D_vacation_tf_v_sdate)
        );
        
        D_vacation_cb_vtime = new JTextField();
        D_vacation_cb_vtime.setColumns(10);
        
        JButton D_vacation_bt_count = new JButton("확인");
        D_vacation_bt_count.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		 // 텍스트 필드에서 날짜 값 추출
                String startDate1Str = D_vacation_tf_v_sdate1.getText();
                String startDateStr = D_vacation_tf_v_sdate.getText();

                // 문자열 값을 Date 객체로 변환
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    Date date1 = dateFormat.parse(startDate1Str);
                    Date date = dateFormat.parse(startDateStr);

                    // 날짜 차이 계산 (일수)
                    long diffInMillisec = Math.abs(date1.getTime() - date.getTime());
                    long diffInDays = diffInMillisec / (1000 * 60 * 60 * 24); // (1000 * 60 * 60 * 24) 하루계산
                    
                    diffInDays += 1;
                    String formattedDiff = String.valueOf(diffInDays);
                    

                    D_vacation_cb_vtime.setText(formattedDiff);
                } catch (Exception ex) {
                    // 파싱 예외 처리
                    ex.printStackTrace();
                }
            }
        	
        });

        javax.swing.GroupLayout D_vacation_jpLayout = new javax.swing.GroupLayout(D_vacation_jp);
        D_vacation_jpLayout.setHorizontalGroup(
        	D_vacation_jpLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(D_vacation_jpLayout.createSequentialGroup()
        			.addGroup(D_vacation_jpLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(D_vacation_jpLayout.createSequentialGroup()
        					.addGap(38)
        					.addGroup(D_vacation_jpLayout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(D_vacation_lb_title, Alignment.LEADING)
        						.addComponent(D_vacation_js_line, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 696, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(D_vacation_jpLayout.createSequentialGroup()
        					.addGap(275)
        					.addComponent(D_vacation_bt_request, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
        					.addGap(40)
        					.addComponent(D_vacation_bt_close, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
        				.addGroup(D_vacation_jpLayout.createSequentialGroup()
        					.addGap(64)
        					.addGroup(D_vacation_jpLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(D_vacation_jpLayout.createSequentialGroup()
        							.addGroup(D_vacation_jpLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(D_vacation_lb_vcate)
        								.addComponent(D_vacation_lb_vcontent))
        							.addGap(43)
        							.addGroup(D_vacation_jpLayout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(D_vacation_jscroll, GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
        								.addComponent(D_vacation_cb_vcate, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        						.addGroup(D_vacation_jpLayout.createSequentialGroup()
        							.addGroup(D_vacation_jpLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(D_vacation_lb_vdate)
        								.addComponent(D_vacation_lb_vtime))
        							.addGap(28)
        							.addGroup(D_vacation_jpLayout.createParallelGroup(Alignment.LEADING)
        								.addGroup(D_vacation_jpLayout.createSequentialGroup()
        									.addComponent(D_vacation_pl_v_sdate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.UNRELATED)
        									.addComponent(D_vacation_lb_wave, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.UNRELATED)
        									.addComponent(D_vacation_pl_v_sdate1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(D_vacation_bt_count, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
        								.addGroup(D_vacation_jpLayout.createSequentialGroup()
        									.addComponent(D_vacation_cb_vtime, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.UNRELATED)
        									.addComponent(D_vacation_lb_il)))))))
        			.addContainerGap(66, Short.MAX_VALUE))
        );
        D_vacation_jpLayout.setVerticalGroup(
        	D_vacation_jpLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(D_vacation_jpLayout.createSequentialGroup()
        			.addGap(44)
        			.addComponent(D_vacation_lb_title)
        			.addGap(41)
        			.addGroup(D_vacation_jpLayout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(D_vacation_jpLayout.createSequentialGroup()
        					.addComponent(D_vacation_js_line, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
        					.addGap(33)
        					.addGroup(D_vacation_jpLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(D_vacation_bt_count, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        						.addGroup(D_vacation_jpLayout.createParallelGroup(Alignment.TRAILING, false)
        							.addComponent(D_vacation_pl_v_sdate1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(D_vacation_lb_wave, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(D_vacation_lb_vdate, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))))
        				.addComponent(D_vacation_pl_v_sdate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(D_vacation_jpLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(D_vacation_lb_vtime, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        				.addComponent(D_vacation_cb_vtime, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(D_vacation_lb_il))
        			.addGap(18)
        			.addGroup(D_vacation_jpLayout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(D_vacation_cb_vcate, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        				.addComponent(D_vacation_lb_vcate, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addGap(18)
        			.addGroup(D_vacation_jpLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(D_vacation_jscroll, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
        				.addComponent(D_vacation_lb_vcontent))
        			.addPreferredGap(ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
        			.addGroup(D_vacation_jpLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(D_vacation_bt_request, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        				.addComponent(D_vacation_bt_close, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(36, Short.MAX_VALUE))
        );
        D_vacation_jp.setLayout(D_vacation_jpLayout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(D_vacation_jp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(D_vacation_jp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void D_vacation_bt_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_vacation_bt_closeActionPerformed
    	dispose();
    }//GEN-LAST:event_D_vacation_bt_closeActionPerformed

    private void D_vacation_bt_requestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_vacation_bt_requestActionPerformed
    	
        String v_cate = D_vacation_cb_vcate.getSelectedItem().toString();
		if(v_cate.length() == 0)
			v_cate = null;
		
		String start_date = D_vacation_tf_v_sdate.getText().trim();
		if(start_date.length() == 0)
			start_date = null;
		
		String end_date = D_vacation_tf_v_sdate1.getText().trim();
		if(end_date.length() == 0)
			end_date = null;
		
		String v_period = D_vacation_cb_vtime.getText().trim();
		if(v_period.length() == 0)
			v_period = null;
		
		String v_content = D_vacation_ta_vcontent.getText().trim();
		if(v_content .length() == 0)
			v_content  = null;
		
		LocalDate currentDate = LocalDate.now();
		String v_date = currentDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		
		SqlSession ss = Factory.getFactory().openSession();
		
		EmpVO evo = ss.selectOne("emp.searchEmp", String.valueOf(Login.mvo.getEmpno()));
		int empno = evo.getEmpno();
		int deptno = evo.getDeptno();
		
		VacationVO vo = new VacationVO(v_cate, start_date, end_date, v_period, v_date, v_content, 0, empno, deptno);
		int cnt= ss.insert("vacation.add", vo);
		if(cnt>0) {
			ss.commit();
			a3.defaultList();
			a3.setVacationTable();
			JOptionPane.showMessageDialog(vacation.this, "상신완료!");
			dispose();
		}
		else {
			JOptionPane.showMessageDialog(vacation.this, "상신실패!");
			ss.rollback();
		}
		
		if(ss!=null)
			ss.close();
    }//GEN-LAST:event_D_vacation_bt_requestActionPerformed
    
    private void D_vacation_bt_start_calendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_vacation_bt_start_calendarActionPerformed
    	new calendarFrame(D_vacation_tf_v_sdate);
    }//GEN-LAST:event_D_vacation_bt_start_calendarActionPerformed

    private void D_vacation_bt_start_calendar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_vacation_bt_start_calendar1ActionPerformed
    	new calendarFrame(D_vacation_tf_v_sdate1);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton D_vacation_bt_close;
    private javax.swing.JButton D_vacation_bt_request;
    private javax.swing.JButton D_vacation_bt_start_calendar;
    private javax.swing.JButton D_vacation_bt_start_calendar1;
    private javax.swing.JComboBox<String> D_vacation_cb_vcate;
    private javax.swing.JPanel D_vacation_jp;
    private javax.swing.JSeparator D_vacation_js_line;
    private javax.swing.JScrollPane D_vacation_jscroll;
    private javax.swing.JLabel D_vacation_lb_il;
    private javax.swing.JLabel D_vacation_lb_title;
    private javax.swing.JLabel D_vacation_lb_vcate;
    private javax.swing.JLabel D_vacation_lb_vcontent;
    private javax.swing.JLabel D_vacation_lb_vdate;
    private javax.swing.JLabel D_vacation_lb_vtime;
    private javax.swing.JLabel D_vacation_lb_wave;
    private javax.swing.JPanel D_vacation_pl_v_sdate;
    private javax.swing.JPanel D_vacation_pl_v_sdate1;
    private javax.swing.JTextArea D_vacation_ta_vcontent;
    javax.swing.JTextField D_vacation_tf_v_sdate;
    javax.swing.JTextField D_vacation_tf_v_sdate1;
    private JTextField D_vacation_cb_vtime;
}

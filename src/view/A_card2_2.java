/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.CardLayout;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.apache.ibatis.session.SqlSession;

import factory.Factory;
import vo.*;

/**
 *
 * @author 20191
 */
public class A_card2_2 extends javax.swing.JPanel {
	File selectedFile; //파일 첨부에서 선택된 파일
    String fileName; //파일 첨부에서 선택된 파일 이름
	
    public A_card2_2() {
        initComponents();
        A_2_2_tf_writer.enable();
        A_2_2_tf_add_date.enable();
        A_2_2_tf_writer.setText(Login.mvo.getEname());
        LocalDate today = LocalDate.now();
        A_2_2_tf_add_date.setText(String.valueOf(today));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        A_card2_2 = new javax.swing.JPanel();
        A_2_2_jp = new javax.swing.JPanel();
        A_2_2_lb_title3 = new javax.swing.JLabel();
        A_2_2_lb_writer = new javax.swing.JLabel();
        A_2_2_lb_add_date = new javax.swing.JLabel();
        A_2_2_lb_category = new javax.swing.JLabel();
        A_2_2_lb_file = new javax.swing.JLabel();
        A_2_2_tf_title = new java.awt.TextField();
        A_2_2_tf_writer = new java.awt.TextField();
        A_2_2_tf_add_date = new java.awt.TextField();
        A_2_2_tf_file = new java.awt.TextField();
        A_2_2_bt_addfile1 = new javax.swing.JButton();
        A_2_2_cb_file = new javax.swing.JComboBox<>();
        A_2_2_sp_content = new javax.swing.JScrollPane();
        A_2_2_ta_content = new javax.swing.JTextArea();
        A_2_2_bt_save = new javax.swing.JButton();
        A_2_2_pl_title2 = new javax.swing.JPanel();
        A_2_2_lb_title1 = new javax.swing.JLabel();
        A_2_2_lb_content = new javax.swing.JLabel();
        A_2_2_bt_back = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1100, 700));
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setPreferredSize(new java.awt.Dimension(1100, 700));

        A_card2_2.setBackground(new java.awt.Color(233, 240, 248));
        A_card2_2.setMaximumSize(new java.awt.Dimension(1100, 700));
        A_card2_2.setMinimumSize(new java.awt.Dimension(1100, 700));
        A_card2_2.setPreferredSize(new java.awt.Dimension(1100, 700));

        A_2_2_jp.setBackground(new java.awt.Color(233, 240, 248));
        A_2_2_jp.setPreferredSize(new java.awt.Dimension(1100, 222));

        A_2_2_lb_title3.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        A_2_2_lb_title3.setText("제목");

        A_2_2_lb_writer.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        A_2_2_lb_writer.setText("작성자");

        A_2_2_lb_add_date.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        A_2_2_lb_add_date.setText("등록일");

        A_2_2_lb_category.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        A_2_2_lb_category.setText("첨부파일 유형");

        A_2_2_lb_file.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        A_2_2_lb_file.setText("첨부파일");

        A_2_2_tf_file.setText("");

        A_2_2_bt_addfile1.setText("파일 추가");
        A_2_2_bt_addfile1.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent e) {
        		A_2_2_bt_addfile1ActionPerformed(e);
        	}
        });

        A_2_2_cb_file.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "없음", "세금계산서", "기안서", "제안서", "보고서"}));

        javax.swing.GroupLayout A_2_2_jpLayout = new javax.swing.GroupLayout(A_2_2_jp);
        A_2_2_jp.setLayout(A_2_2_jpLayout);
        A_2_2_jpLayout.setHorizontalGroup(
            A_2_2_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_2_2_jpLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(A_2_2_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(A_2_2_jpLayout.createSequentialGroup()
                        .addGroup(A_2_2_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A_2_2_lb_add_date)
                            .addComponent(A_2_2_lb_writer)
                            .addComponent(A_2_2_lb_title3))
                        .addGap(30, 30, 30)
                        .addGroup(A_2_2_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A_2_2_tf_title, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(A_2_2_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(A_2_2_tf_add_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(A_2_2_tf_writer, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))))
                    .addGroup(A_2_2_jpLayout.createSequentialGroup()
                        .addGroup(A_2_2_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A_2_2_lb_category)
                            .addComponent(A_2_2_lb_file))
                        .addGroup(A_2_2_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(A_2_2_jpLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(A_2_2_tf_file, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(A_2_2_bt_addfile1))
                            .addGroup(A_2_2_jpLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(A_2_2_cb_file, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(384, Short.MAX_VALUE))
        );
        A_2_2_jpLayout.setVerticalGroup(
            A_2_2_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_2_2_jpLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(A_2_2_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(A_2_2_lb_title3)
                    .addComponent(A_2_2_tf_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(A_2_2_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(A_2_2_lb_writer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(A_2_2_tf_writer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(A_2_2_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(A_2_2_lb_add_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(A_2_2_tf_add_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(A_2_2_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A_2_2_lb_category)
                    .addComponent(A_2_2_cb_file, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(A_2_2_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(A_2_2_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(A_2_2_lb_file, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(A_2_2_tf_file, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(A_2_2_bt_addfile1))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        A_2_2_sp_content.setMaximumSize(new java.awt.Dimension(1100, 700));

        A_2_2_ta_content.setColumns(20);
        A_2_2_ta_content.setRows(5);
        A_2_2_sp_content.setViewportView(A_2_2_ta_content);

        A_2_2_bt_save.setText("저장");
        A_2_2_bt_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_2_2_bt_saveActionPerformed(evt);
            }
        });

        A_2_2_pl_title2.setBackground(new java.awt.Color(52, 73, 102));
        A_2_2_pl_title2.setPreferredSize(new java.awt.Dimension(90, 30));

        A_2_2_lb_title1.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        A_2_2_lb_title1.setForeground(new java.awt.Color(255, 255, 255));
        A_2_2_lb_title1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        A_2_2_lb_title1.setText("업무일지 작성");

        javax.swing.GroupLayout A_2_2_pl_title2Layout = new javax.swing.GroupLayout(A_2_2_pl_title2);
        A_2_2_pl_title2.setLayout(A_2_2_pl_title2Layout);
        A_2_2_pl_title2Layout.setHorizontalGroup(
            A_2_2_pl_title2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_2_2_pl_title2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(A_2_2_lb_title1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        A_2_2_pl_title2Layout.setVerticalGroup(
            A_2_2_pl_title2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, A_2_2_pl_title2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(A_2_2_lb_title1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        A_2_2_lb_content.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        A_2_2_lb_content.setText("내용");

        A_2_2_bt_back.setText("뒤로가기");
        A_2_2_bt_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_2_2_bt_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout A_card2_2Layout = new javax.swing.GroupLayout(A_card2_2);
        A_card2_2.setLayout(A_card2_2Layout);
        A_card2_2Layout.setHorizontalGroup(
            A_card2_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_card2_2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(A_card2_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(A_card2_2Layout.createSequentialGroup()
                        .addComponent(A_2_2_bt_back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(A_2_2_bt_save, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(A_card2_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(A_2_2_lb_content)
                        .addComponent(A_2_2_sp_content, javax.swing.GroupLayout.PREFERRED_SIZE, 1057, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, A_card2_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(A_2_2_jp, javax.swing.GroupLayout.DEFAULT_SIZE, 1088, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(A_2_2_pl_title2, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        A_card2_2Layout.setVerticalGroup(
            A_card2_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_card2_2Layout.createSequentialGroup()
                .addComponent(A_2_2_pl_title2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(A_2_2_jp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A_2_2_lb_content)
                .addGap(18, 18, 18)
                .addComponent(A_2_2_sp_content, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(A_card2_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A_2_2_bt_save, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_2_2_bt_back))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(A_card2_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(A_card2_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void A_2_2_bt_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_2_2_bt_saveActionPerformed
    	SqlSession ss = Factory.getFactory().openSession();
    	
    	WLogVO wl = new WLogVO();
    	wl.setW_name(A_2_2_tf_title.getText());
    	wl.setW_content(A_2_2_ta_content.getText());
    	wl.setW_date(A_2_2_tf_add_date.getText());
    	wl.setEmpno(Login.mvo.getEmpno());
    	wl.setDeptno(Login.mvo.getDeptno());
    	
    	//업무 일지 저장
    	int insertWlog = ss.insert("w_log.insertWlog", wl);
    	if( insertWlog > 0) {
    		System.out.println("성공");
    		ss.commit();
    	} else {
    		System.out.println("실패");
    		ss.rollback();
    	}
    	
    	if( fileName!=null) {
    		//파일을 지정된 경로에 저장하기
        	StringBuilder sb = new StringBuilder();
        	sb.append("C:/emp/file/" + fileName); //파일을 저장할 경로 지정
        	
    		String save_path = sb.toString();
    		
    		File f = new File(selectedFile.getAbsolutePath());
    		
    		if (f.exists()) {
    			BufferedInputStream bis = null; //읽기를 위한 스트림
    			
    			BufferedOutputStream fos = null; //출력을 위한 스트림
    			try {
    				//읽기를 위한 스트림 생성
    				bis = new BufferedInputStream(new FileInputStream(f));
    				// 쓰기를 위한 스트림 생성
    				fos = new BufferedOutputStream(new FileOutputStream(save_path));
    				
    				//반복문을 이용하여 읽고 쓰기를 동시에 하자!
    				byte[] buf = new byte[2048];
    				int size = -1;
    				
    				while((size = bis.read(buf)) != -1) {
    					//반복문으로 읽으면서 바로 방출
    					fos.write(buf,0,size);
    					fos.flush();
    					
    				}// while문의 끝
    				
    			} catch (FileNotFoundException e) {
    				e.printStackTrace();
    			} catch (IOException e) {
    				e.printStackTrace();
    			} finally {
    				try {
    					if( bis != null) {
    						bis.close();
    					}
    					if( fos != null) {
    						fos.close();
    					}
    				} catch (Exception e2) {
    					
    				}
    			}
    			//파일 정보를 DB에 저장하기
        		FileVO file = new FileVO();
        		file.setEmpno(Login.mvo.getEmpno());
        		file.setFile_name(fileName);
        		file.setCate(String.valueOf(A_2_2_cb_file.getSelectedIndex()));
        		file.setFile_url(selectedFile.getAbsolutePath());
        		
        		int num = ss.selectOne("w_log.getW_Idx", wl); //아까 저장한 wlog의 idx값을 찾기
        		file.setW_idx(num); //파일 db에 wlog의 idx값 저장하기
           
            	//파일 정보 저장
            	int insertFile = ss.insert("file.insertFile", file); 
            	if( insertFile > 0) {
        			JOptionPane.showMessageDialog(A_card2_2.this, "파일 저장 성공");
        			ss.commit();
        			
        		}else {
        			JOptionPane.showMessageDialog(A_card2_2.this, "파일 저장 실패");
        			ss.rollback();
        		}
    		}
        } 
    	
    	//뒤로가기
		A_card2 card2 = new A_card2();
    	Background.content_card.add(card2, "A_card2");
    	CardLayout card = (CardLayout)Background.content_card.getLayout();
    	card.show(Background.content_card, "A_card2");
    	
    	if(ss!=null)
    		ss.close();
    	
    	
    }//GEN-LAST:event_A_2_2_bt_saveActionPerformed

    private void A_2_2_bt_addfile1ActionPerformed(java.awt.event.ActionEvent evt) {
    	JFileChooser chooser = new JFileChooser();
		int returnValue = chooser.showOpenDialog(null); // 파일 선택 대화 상자를 띄움

        if (returnValue == JFileChooser.APPROVE_OPTION) { // 사용자가 파일을 선택했을 때
            selectedFile = chooser.getSelectedFile();
            fileName = selectedFile.getName();
            // 선택한 파일에 대한 처리를 수행 (예: 파일 경로 출력)
            //System.out.println("선택한 파일: " + selectedFile.getAbsolutePath());
            //System.out.println("선택된 파일 : " + fileName);
            A_2_2_tf_file.setText(selectedFile.getAbsolutePath());
            
        } else {
            // 사용자가 파일을 선택하지 않았거나 취소했을 때
            System.out.println("파일 선택이 취소되었습니다.");
        }
    }
    
    private void A_2_2_bt_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_2_2_bt_backActionPerformed
    	A_card2 card2 = new A_card2();
    	Background.content_card.add(card2, "A_card2");
    	CardLayout card = (CardLayout)Background.content_card.getLayout();
    	card.show(Background.content_card, "A_card2");
    }//GEN-LAST:event_A_2_2_bt_backActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A_2_2_bt_addfile1;
    private javax.swing.JButton A_2_2_bt_back;
    private javax.swing.JButton A_2_2_bt_save;
    private javax.swing.JComboBox<String> A_2_2_cb_file;
    private javax.swing.JPanel A_2_2_jp;
    private javax.swing.JLabel A_2_2_lb_add_date;
    private javax.swing.JLabel A_2_2_lb_category;
    private javax.swing.JLabel A_2_2_lb_content;
    private javax.swing.JLabel A_2_2_lb_file;
    private javax.swing.JLabel A_2_2_lb_title1;
    private javax.swing.JLabel A_2_2_lb_title3;
    private javax.swing.JLabel A_2_2_lb_writer;
    private javax.swing.JPanel A_2_2_pl_title2;
    private javax.swing.JScrollPane A_2_2_sp_content;
    private javax.swing.JTextArea A_2_2_ta_content;
    private java.awt.TextField A_2_2_tf_add_date;
    private java.awt.TextField A_2_2_tf_file;
    private java.awt.TextField A_2_2_tf_title;
    private java.awt.TextField A_2_2_tf_writer;
    private javax.swing.JPanel A_card2_2;
    // End of variables declaration//GEN-END:variables
}

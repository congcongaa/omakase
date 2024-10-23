/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import org.apache.ibatis.session.SqlSession;

import dialog.Search_file;
import dialog.calendarFrame;
import factory.Factory;
import vo.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.TableRowSorter;

public class A_card4 extends javax.swing.JPanel {
	List<FileVO> fileList;
	MemberVO member;
	List<WLogVO> list;
	JTable table;
	String fileUrl;
    /**
     * Creates new form A_card4
     */
    public A_card4() {
        initComponents();
        viewFileTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        A_card4 = new javax.swing.JPanel();
        A_4_jp_1 = new javax.swing.JPanel();
        A_4_pl_tilte = new javax.swing.JLabel();
        A_4_jp_2 = new javax.swing.JPanel();
        A_4_cb_search = new javax.swing.JComboBox<>();
        A_4_tf_search = new javax.swing.JTextField();
        A_4_lb_date = new javax.swing.JLabel();
        A_4_lb_string = new javax.swing.JLabel();
        A_4_bt_search = new javax.swing.JButton();
        A_4_jp_3 = new javax.swing.JPanel();
        A_4_tf_startdate = new javax.swing.JTextField();
        A_4_bt_calendar1 = new javax.swing.JButton();
        A_4_jp_4 = new javax.swing.JPanel();
        A_4_tf_enddate = new javax.swing.JTextField();
        A_4_bt_calendar2 = new javax.swing.JButton();
        A_4_sp_content = new javax.swing.JScrollPane();
        A_4_tb_content = new javax.swing.JTable();
        A_4_bt_add = new javax.swing.JButton();
        A_4_bt_delete = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1100, 700));
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setPreferredSize(new java.awt.Dimension(1100, 700));

        A_card4.setBackground(new java.awt.Color(233, 240, 248));
        A_card4.setMaximumSize(new java.awt.Dimension(1100, 700));
        A_card4.setMinimumSize(new java.awt.Dimension(1100, 700));
        A_card4.setPreferredSize(new java.awt.Dimension(1100, 700));

        A_4_jp_1.setBackground(new java.awt.Color(52, 73, 102));
        A_4_jp_1.setPreferredSize(new java.awt.Dimension(90, 30));

        A_4_pl_tilte.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        A_4_pl_tilte.setForeground(new java.awt.Color(255, 255, 255));
        A_4_pl_tilte.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        A_4_pl_tilte.setText("부서 문서함");

        javax.swing.GroupLayout A_4_jp_1Layout = new javax.swing.GroupLayout(A_4_jp_1);
        A_4_jp_1.setLayout(A_4_jp_1Layout);
        A_4_jp_1Layout.setHorizontalGroup(
            A_4_jp_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_4_jp_1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(A_4_pl_tilte, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        A_4_jp_1Layout.setVerticalGroup(
            A_4_jp_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_4_jp_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(A_4_pl_tilte)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        A_4_jp_2.setBackground(new java.awt.Color(233, 240, 248));
        A_4_jp_2.setForeground(new java.awt.Color(204, 204, 204));

        A_4_cb_search.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        A_4_cb_search.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "문서제목", "등록자" }));

        A_4_lb_date.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        A_4_lb_date.setText("등록일");

        A_4_lb_string.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        A_4_lb_string.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A_4_lb_string.setText("~");

        A_4_bt_search.setText("검색");
        A_4_bt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_4_bt_searchActionPerformed(evt);
            }
        });

        A_4_jp_3.setBackground(new java.awt.Color(255, 255, 255));
        A_4_jp_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        A_4_jp_3.setToolTipText("");

        A_4_tf_startdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        A_4_bt_calendar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendar.png"))); // NOI18N
        A_4_bt_calendar1.setBorder(null);
        A_4_bt_calendar1.setPreferredSize(new java.awt.Dimension(29, 29));
        A_4_bt_calendar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_4_bt_calendar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout A_4_jp_3Layout = new javax.swing.GroupLayout(A_4_jp_3);
        A_4_jp_3.setLayout(A_4_jp_3Layout);
        A_4_jp_3Layout.setHorizontalGroup(
            A_4_jp_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_4_jp_3Layout.createSequentialGroup()
                .addComponent(A_4_tf_startdate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(A_4_bt_calendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        A_4_jp_3Layout.setVerticalGroup(
            A_4_jp_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(A_4_bt_calendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(A_4_tf_startdate)
        );

        A_4_jp_4.setBackground(new java.awt.Color(255, 255, 255));
        A_4_jp_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        A_4_tf_enddate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        A_4_bt_calendar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendar.png"))); // NOI18N
        A_4_bt_calendar2.setBorder(null);
        A_4_bt_calendar2.setPreferredSize(new java.awt.Dimension(29, 29));
        A_4_bt_calendar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_4_bt_calendar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout A_4_jp_4Layout = new javax.swing.GroupLayout(A_4_jp_4);
        A_4_jp_4.setLayout(A_4_jp_4Layout);
        A_4_jp_4Layout.setHorizontalGroup(
            A_4_jp_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_4_jp_4Layout.createSequentialGroup()
                .addComponent(A_4_tf_enddate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(A_4_bt_calendar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        A_4_jp_4Layout.setVerticalGroup(
            A_4_jp_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(A_4_bt_calendar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(A_4_tf_enddate)
        );

        javax.swing.GroupLayout A_4_jp_2Layout = new javax.swing.GroupLayout(A_4_jp_2);
        A_4_jp_2.setLayout(A_4_jp_2Layout);
        A_4_jp_2Layout.setHorizontalGroup(
            A_4_jp_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_4_jp_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(A_4_cb_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A_4_tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(A_4_lb_date)
                .addGap(18, 18, 18)
                .addComponent(A_4_jp_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A_4_lb_string, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A_4_jp_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(A_4_bt_search)
                .addContainerGap())
        );
        A_4_jp_2Layout.setVerticalGroup(
            A_4_jp_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, A_4_jp_2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(A_4_jp_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(A_4_bt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(A_4_jp_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(A_4_tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(A_4_cb_search, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(A_4_lb_date, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(A_4_lb_string, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_4_jp_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_4_jp_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
       
        A_4_tb_content.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		A_4_tb_contentActionPerformed(e);
        	}
        });
        A_4_sp_content.setViewportView(A_4_tb_content);

        A_4_bt_add.setText("등록");
        A_4_bt_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_4_bt_addActionPerformed(evt);
            }
        });

        A_4_bt_delete.setText("삭제");
        A_4_bt_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_4_bt_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout A_card4Layout = new javax.swing.GroupLayout(A_card4);
        A_card4Layout.setHorizontalGroup(
        	A_card4Layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(A_4_jp_1, GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        		.addGroup(A_card4Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(A_card4Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(A_card4Layout.createSequentialGroup()
        					.addComponent(A_4_jp_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addContainerGap())
        				.addGroup(A_card4Layout.createSequentialGroup()
        					.addComponent(A_4_bt_add)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(A_4_bt_delete)
        					.addGap(23))))
        		.addGroup(Alignment.TRAILING, A_card4Layout.createSequentialGroup()
        			.addContainerGap(22, Short.MAX_VALUE)
        			.addComponent(A_4_sp_content, GroupLayout.PREFERRED_SIZE, 1058, GroupLayout.PREFERRED_SIZE)
        			.addGap(20))
        );
        A_card4Layout.setVerticalGroup(
        	A_card4Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(A_card4Layout.createSequentialGroup()
        			.addComponent(A_4_jp_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        			.addGap(12)
        			.addComponent(A_4_jp_2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(A_4_sp_content, GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(A_card4Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(A_4_bt_delete, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        				.addComponent(A_4_bt_add, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
        			.addGap(10))
        );
        A_card4.setLayout(A_card4Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(A_card4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(A_card4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void A_4_bt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_4_bt_searchActionPerformed
    	searchList();
    	viewTable();
    }//GEN-LAST:event_A_4_bt_searchActionPerformed

    private void A_4_bt_calendar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_4_bt_calendar1ActionPerformed
    	new calendarFrame(A_4_tf_startdate);
    }//GEN-LAST:event_A_4_bt_calendar1ActionPerformed

    private void A_4_bt_calendar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_4_bt_calendar2ActionPerformed
    	new calendarFrame(A_4_tf_enddate);
    }//GEN-LAST:event_A_4_bt_calendar2ActionPerformed

    private void A_4_bt_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_4_bt_addActionPerformed
    	File selectedFile=null; //파일 첨부에서 선택된 파일
        String fileName=""; //파일 첨부에서 선택된 파일 이름
    	
    	JFileChooser chooser = new JFileChooser();
		int returnValue = chooser.showOpenDialog(null); // 파일 선택 대화 상자를 띄움

        if (returnValue == JFileChooser.APPROVE_OPTION) { // 사용자가 파일을 선택했을 때
            selectedFile = chooser.getSelectedFile();
            fileName = selectedFile.getName();
            // 선택한 파일에 대한 처리를 수행 (예: 파일 경로 출력)
            System.out.println("선택한 파일: " + selectedFile.getAbsolutePath());
            System.out.println("선택된 파일 : " + fileName);
        } else {
            // 사용자가 파일을 선택하지 않았거나 취소했을 때
            System.out.println("파일 선택이 취소되었습니다.");
        }
        
        if( fileName!=null) {
    		//파일을 지정된 경로에 저장하기
        	StringBuilder sb = new StringBuilder();
        	sb.append("C:/emp/file/" + fileName); //파일을 저장할 경로 지정
        	
    		String save_path = sb.toString();
    		
    		File f = new File(selectedFile.getAbsolutePath());//파일 가져오기
    		
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
        		file.setCate("0"); //파일함에서 추가하는 파일은 다 "없음"처리 레츠고
        		file.setFile_url(selectedFile.getAbsolutePath());
        		
        		//file.setW_idx(null); //파일 db에 wlog의 idx값 저장하기
           
        		SqlSession ss = Factory.getFactory().openSession();
        		
            	//파일 정보 저장
            	int insertFile = ss.insert("file.insertFile", file); 
            	
            	
            	if( insertFile > 0) {
        			JOptionPane.showMessageDialog(A_card4.this, "파일 저장 성공");
        			ss.commit();
        			
        		}else {
        			JOptionPane.showMessageDialog(A_card4.this, "파일 저장 실패");
        			ss.rollback();
        		}
            	
            	if(ss!=null)
            		ss.close();
            	
            	viewFileTable();
    		}
        } 
    }//GEN-LAST:event_A_4_bt_addActionPerformed

    private void A_4_bt_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_4_bt_deleteActionPerformed
    	int selectRow = A_4_tb_content.getSelectedRow();
		int selectColumn = A_4_tb_content.getSelectedColumn();
		
		String deletedName = (String) A_4_tb_content.getValueAt(selectRow, 2);//테이블에서 선택
		String deletedNum = (String)A_4_tb_content.getValueAt(selectRow, 0);
		
		StringBuilder sb = new StringBuilder();
    	sb.append("C:/emp/file/" + deletedName);
    	
    	File file = new File(sb.toString());
		
    	// 파일이 존재하는지 확인
        if (file.exists()) {
            // 파일 삭제 시도
            if (file.delete()) { //경로에서 삭제
                System.out.println("파일이 성공적으로 삭제되었습니다.");
            } else {
                System.out.println("파일을 삭제하는 데 문제가 발생했습니다.");
            }
        } else {
            System.out.println("해당 파일이 존재하지 않습니다.");
        }
    	
		SqlSession ss = Factory.getFactory().openSession();
		
		int cnt = ss.delete("deleteFile", deletedNum);

		if(cnt>0) {
			System.out.println("파일이 db에서 삭제!");
			int a = JOptionPane.showConfirmDialog(A_card4, "삭제 하시겠습니까?", "삭제 확인",
					JOptionPane.YES_NO_OPTION);
			if(a == JOptionPane.YES_OPTION) {
				ss.commit();
			} else {
				// 아니오 선택 시 롤백 이후 종료
				ss.rollback();
				return;
			}
		} else {
			ss.rollback();
		}
		
		searchList();
    	viewTable();
		
    }//GEN-LAST:event_A_4_bt_deleteActionPerformed

    //리스트의 파일을 불러오는 함수
    private void A_4_tb_contentActionPerformed(MouseEvent e) { //안뜨는데..
    	int selectRow = A_4_tb_content.getSelectedRow();
		FileVO vo = new FileVO();
		String ename = A_4_tb_content.getValueAt(selectRow, 1).toString();
		fileUrl = A_4_tb_content.getValueAt(selectRow, 3).toString();
		String checkFile = fileUrl.substring(fileUrl.lastIndexOf('.') + 1);
		
		File f = new File(fileUrl);
		
		if( checkFile.equals("txt")) {
			
    		if( selectRow != -1) {
    			
    			if (f.exists()) {
    				//읽기를 위한 스트림
    				BufferedInputStream bis = null;
    				
    				try {
    					//읽기를 위한 스트림 생성
    					bis = new BufferedInputStream(new FileInputStream(f));
    					
    					//반복문을 이용하여 읽고 쓰기를 동시에 하자!
    					byte[] buf = new byte[2048];
    					int size = -1;
    					
    					while((size= bis.read(buf)) != -1) {
    						//여기와서 읽은 자원들은 모두 buf에 존재하며
    						// 읽은 수는 size가 기억하고 있다.
    						String str = new String(buf,0,size);
    						vo.setFile_url(str);
    					}// while문의 끝
    					
    				} catch (IOException ea) {
    					ea.printStackTrace();
    				} finally {
    					try {
    						if( bis != null) {
    							bis.close();
    						}
    					} catch (Exception e2) {
    						
    					}
    				}
    			}
    			vo.setDeptno(Login.mvo.getDeptno());
    			vo.setEname(Login.mvo.getEname());
    		}
    		new Search_file(vo, ename);
		} else {
			JOptionPane.showMessageDialog(A_card4.this, "txt 파일만 확인할 수 있습니다.");
		}
	}


    public void viewFileTable() { //자신의 deptno -> fileList 띄우기
    	// 리스트 띄우기
    	SqlSession ss = Factory.getFactory().openSession();
    	System.out.println(Login.mvo.getDeptno());
    	fileList = ss.selectList("file.selectFileList", Login.mvo.getDeptno());
    	
    	if(ss!=null)
			ss.close();
    	
    	viewTable();
	}
    
    public void viewTable() {
    	// jtable의 컬럼명
    	
    	SqlSession ss = Factory.getFactory().openSession();
    	String[] c_name1 = {"번호","등록이름","제목","경로","등록일"};
		
		//인자로 받은 List를 2차원배열로 만들어보자!
		String[][] data1 = new String[fileList.size()][c_name1.length];
		
		for (int i = 0; i < fileList.size(); i++) {
			//list로부터 EmpVO를 하나 얻어낸다.
			FileVO vo = fileList.get(i);
			
			//얻어낸 사원 정보를 JTable에 하나의 행으로 표현하기
			//	위해 1차원배열에 채워 넣는다.
			// 2차원 배열 안에 데이터 넣기
			data1[i][0] = String.valueOf(vo.getT_idx());
			
			
			String empno = String.valueOf(vo.getEmpno());
			EmpVO evo = ss.selectOne("emp.searchEmp", empno);
	    	String ename = evo.getEname();
			
			data1[i][1] = ename;//이름   
			data1[i][2] = String.valueOf(vo.getFile_name());
			data1[i][3] = vo.getFile_url();
			String f_date = vo.getFile_date().toString();
			int indexOfSpace = f_date.indexOf(' ');
			String formattedf_date = f_date.substring(0, indexOfSpace);
			data1[i][4] = String.valueOf(formattedf_date);
		}
		DefaultTableModel model = new DefaultTableModel(data1, c_name1);
		A_4_tb_content.setModel(model);
		DefaultRowSorter sorter = new TableRowSorter<DefaultTableModel>(model);
		A_4_tb_content.setRowSorter(sorter);
    
		if(ss != null)
			ss.close();
    }
    
    public void searchList() { //지역 변수 list를 찾는 함수
    	
    	Map<String, String> map = new HashMap<String, String>();
    	
    	String start_day = A_4_tf_startdate.getText().trim();
    	if (!start_day.isEmpty()) {
    	    map.put("start_date", start_day); 
    	}

    	String end_day = A_4_tf_enddate.getText().trim();
    	if (!end_day.isEmpty()) {
    	    map.put("end_date", end_day+" 23:59:59");
    	}
		
    	int idx = A_4_cb_search.getSelectedIndex(); //콤보박스 내용 확인
		String key = null; 
		switch (idx) {
			case 0:
				key = "f_title";
				break;
			case 1:
				key = "f_writer";
				break;
		}
		
		String str = A_4_tf_search.getText().trim();
		if(!str.isEmpty()) {
			map.put(key, str);
		}
		
		map.put("deptno", String.valueOf(Login.mvo.getDeptno()));
    	
    	SqlSession ss = Factory.getFactory().openSession();
    	fileList = ss.selectList("file.selectedDeptFile", map); //내 업무 일지 중 검색어 or 검색어 없이 찾음
    	
    	if(ss!=null)
			ss.close();
    	
    	viewTable();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A_4_bt_add;
    private javax.swing.JButton A_4_bt_calendar1;
    private javax.swing.JButton A_4_bt_calendar2;
    private javax.swing.JButton A_4_bt_delete;
    private javax.swing.JButton A_4_bt_search;
    private javax.swing.JComboBox<String> A_4_cb_search;
    private javax.swing.JPanel A_4_jp_1;
    private javax.swing.JPanel A_4_jp_2;
    private javax.swing.JPanel A_4_jp_3;
    private javax.swing.JPanel A_4_jp_4;
    private javax.swing.JLabel A_4_lb_date;
    private javax.swing.JLabel A_4_lb_string;
    private javax.swing.JLabel A_4_pl_tilte;
    private javax.swing.JScrollPane A_4_sp_content;
    private javax.swing.JTextField A_4_tf_enddate;
    private javax.swing.JTextField A_4_tf_search;
    private javax.swing.JTextField A_4_tf_startdate;
    private javax.swing.JPanel A_card4;
    javax.swing.JTable A_4_tb_content;
    // End of variables declaration//GEN-END:variables
}

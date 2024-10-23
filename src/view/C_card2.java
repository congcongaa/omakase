/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import dialog.calendarFrame;
import dialog.vacation;
import factory.Factory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import vo.DeptVO;
import vo.EmpVO;
import vo.VacationVO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.tree.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

public class C_card2 extends JPanel {

    public C_card2() {
        setlist();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        C_card2 = new javax.swing.JPanel();
        C_2_Panel = new javax.swing.JPanel();
        C_2_Label1 = new javax.swing.JLabel();
        C_2_Panel2 = new javax.swing.JPanel();
        C_2_Panel2_1 = new javax.swing.JPanel();
        C_2_Panel16 = new javax.swing.JPanel();
        C_2_Panel17 = new javax.swing.JPanel();
        C_2_Label8 = new javax.swing.JLabel();
        C_2_tf_outside = new javax.swing.JTextField();
        C_2_lb_outside = new javax.swing.JLabel();
        C_2_Panel18 = new javax.swing.JPanel();
        C_2_Label9 = new javax.swing.JLabel();
        C_2_tf_business = new javax.swing.JTextField();
        C_2_lb_business = new javax.swing.JLabel();
        C_2_Panel19 = new javax.swing.JPanel();
        C_2_Label10 = new javax.swing.JLabel();
        C_2_tf_overtime = new javax.swing.JTextField();
        C_2_lb_overtime = new javax.swing.JLabel();
        C_2_Panel24 = new javax.swing.JPanel();
        C_2_Label11 = new javax.swing.JLabel();
        C_2_tf_substitute = new javax.swing.JTextField();
        C_2_lb_substitute = new javax.swing.JLabel();
        C_2_scrollPane2 = new javax.swing.JScrollPane();
        C_2_tb_tableAttend = new javax.swing.JTable();
        C_2_Label6 = new javax.swing.JLabel();
        C_2_tf_totalAttend = new javax.swing.JTextField();
        C_2_Label7 = new javax.swing.JLabel();
        C_2_Label4 = new javax.swing.JLabel();
        C_2_Label5 = new javax.swing.JLabel();
        C_2_Panel2_2 = new javax.swing.JPanel();
        C_2_tf_startdate = new javax.swing.JTextField();
        C_2_bt_startCalender = new javax.swing.JButton();
        c_2_Panel2_3 = new javax.swing.JPanel();
        C_2_tf_enddate = new javax.swing.JTextField();
        C_2_bt_endCalender = new javax.swing.JButton();
        C_2_bt_search1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        C_2_Separator1 = new javax.swing.JSeparator();
        C_2_Panel3 = new javax.swing.JPanel();
        C_2_Panel3_1 = new javax.swing.JPanel();
        C_2_Panel7 = new javax.swing.JPanel();
        C_2_cb_team = new javax.swing.JComboBox<>();
        C_2_tf_input = new javax.swing.JTextField();
        C_2_bt_search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree(new DefaultTreeModel(new DefaultMutableTreeNode()));
        C_2_Label2 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1100, 700));
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setPreferredSize(new java.awt.Dimension(1100, 700));

        C_card2.setBackground(new java.awt.Color(204, 204, 204));
        C_card2.setMaximumSize(new java.awt.Dimension(1100, 700));
        C_card2.setMinimumSize(new java.awt.Dimension(1100, 700));
        C_card2.setPreferredSize(new java.awt.Dimension(1100, 700));

        C_2_Panel.setBackground(new java.awt.Color(0, 0, 0));
        C_2_Panel.setMaximumSize(new java.awt.Dimension(1100, 70));
        C_2_Panel.setPreferredSize(new java.awt.Dimension(1100, 70));

        C_2_Label1.setBackground(new java.awt.Color(0, 102, 255));
        C_2_Label1.setFont(new java.awt.Font("맑은 고딕 Semilight", 1, 14)); // NOI18N
        C_2_Label1.setForeground(new java.awt.Color(255, 255, 255));
        C_2_Label1.setText("근태관리");
        C_2_Label1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0));

        javax.swing.GroupLayout C_2_PanelLayout = new javax.swing.GroupLayout(C_2_Panel);
        C_2_Panel.setLayout(C_2_PanelLayout);
        C_2_PanelLayout.setHorizontalGroup(
                C_2_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(C_2_PanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(C_2_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        C_2_PanelLayout.setVerticalGroup(
                C_2_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(C_2_PanelLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(C_2_Label1)
                                .addContainerGap(19, Short.MAX_VALUE))
        );

        C_2_Panel2.setBackground(new java.awt.Color(204, 204, 204));
        C_2_Panel2.setPreferredSize(new java.awt.Dimension(1100, 613));

        C_2_Panel2_1.setPreferredSize(new java.awt.Dimension(1200, 498));

        C_2_Panel17.setBackground(new java.awt.Color(255, 255, 255));
        C_2_Panel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        C_2_Panel17.setPreferredSize(new java.awt.Dimension(170, 100));

        C_2_Label8.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 18)); // NOI18N
        C_2_Label8.setText("외근");

        C_2_tf_outside.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_2_tf_outsideActionPerformed(evt);
            }
        });

        C_2_lb_outside.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/outside.png"))); // NOI18N

        javax.swing.GroupLayout C_2_Panel17Layout = new javax.swing.GroupLayout(C_2_Panel17);
        C_2_Panel17.setLayout(C_2_Panel17Layout);
        C_2_Panel17Layout.setHorizontalGroup(
                C_2_Panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(C_2_Panel17Layout.createSequentialGroup()
                                .addContainerGap(16, Short.MAX_VALUE)
                                .addComponent(C_2_lb_outside)
                                .addGap(18, 18, 18)
                                .addGroup(C_2_Panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(C_2_tf_outside, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(C_2_Label8))
                                .addContainerGap())
        );
        C_2_Panel17Layout.setVerticalGroup(
                C_2_Panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, C_2_Panel17Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(C_2_Panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(C_2_Panel17Layout.createSequentialGroup()
                                                .addComponent(C_2_Label8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(C_2_tf_outside, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(C_2_lb_outside))
                                .addGap(15, 15, 15))
        );

        C_2_Panel18.setBackground(new java.awt.Color(255, 255, 255));
        C_2_Panel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        C_2_Panel18.setPreferredSize(new java.awt.Dimension(170, 100));

        C_2_Label9.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 18)); // NOI18N
        C_2_Label9.setText("출장");

        C_2_tf_business.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_2_tf_businessActionPerformed(evt);
            }
        });

        C_2_lb_business.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/business.png"))); // NOI18N

        javax.swing.GroupLayout C_2_Panel18Layout = new javax.swing.GroupLayout(C_2_Panel18);
        C_2_Panel18.setLayout(C_2_Panel18Layout);
        C_2_Panel18Layout.setHorizontalGroup(
                C_2_Panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(C_2_Panel18Layout.createSequentialGroup()
                                .addContainerGap(16, Short.MAX_VALUE)
                                .addComponent(C_2_lb_business, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(C_2_Panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(C_2_tf_business, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(C_2_Label9))
                                .addContainerGap())
        );
        C_2_Panel18Layout.setVerticalGroup(
                C_2_Panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(C_2_Panel18Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(C_2_Panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(C_2_lb_business)
                                        .addGroup(C_2_Panel18Layout.createSequentialGroup()
                                                .addComponent(C_2_Label9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(C_2_tf_business, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(15, Short.MAX_VALUE))
        );

        C_2_Panel19.setBackground(new java.awt.Color(255, 255, 255));
        C_2_Panel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        C_2_Panel19.setPreferredSize(new java.awt.Dimension(170, 100));

        C_2_Label10.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 18)); // NOI18N
        C_2_Label10.setText("연장근무");

        C_2_tf_overtime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_2_tf_overtimeActionPerformed(evt);
            }
        });

        C_2_lb_overtime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/overtime.png"))); // NOI18N

        javax.swing.GroupLayout C_2_Panel19Layout = new javax.swing.GroupLayout(C_2_Panel19);
        C_2_Panel19.setLayout(C_2_Panel19Layout);
        C_2_Panel19Layout.setHorizontalGroup(
                C_2_Panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(C_2_Panel19Layout.createSequentialGroup()
                                .addContainerGap(16, Short.MAX_VALUE)
                                .addComponent(C_2_lb_overtime, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(C_2_Panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(C_2_tf_overtime, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(C_2_Label10))
                                .addContainerGap())
        );
        C_2_Panel19Layout.setVerticalGroup(
                C_2_Panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, C_2_Panel19Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(C_2_Panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(C_2_Panel19Layout.createSequentialGroup()
                                                .addComponent(C_2_Label10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(C_2_tf_overtime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6))
                                        .addComponent(C_2_lb_overtime))
                                .addGap(15, 15, 15))
        );

        C_2_Panel24.setBackground(new java.awt.Color(255, 255, 255));
        C_2_Panel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        C_2_Panel24.setPreferredSize(new java.awt.Dimension(170, 100));

        C_2_Label11.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 18)); // NOI18N
        C_2_Label11.setText("연차");

        C_2_tf_substitute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_2_tf_substituteActionPerformed(evt);
            }
        });

        C_2_lb_substitute.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/substitute.png"))); // NOI18N

        javax.swing.GroupLayout C_2_Panel24Layout = new javax.swing.GroupLayout(C_2_Panel24);
        C_2_Panel24.setLayout(C_2_Panel24Layout);
        C_2_Panel24Layout.setHorizontalGroup(
                C_2_Panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(C_2_Panel24Layout.createSequentialGroup()
                                .addContainerGap(22, Short.MAX_VALUE)
                                .addComponent(C_2_lb_substitute, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(C_2_Panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(C_2_Label11)
                                        .addComponent(C_2_tf_substitute, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        C_2_Panel24Layout.setVerticalGroup(
                C_2_Panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, C_2_Panel24Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(C_2_Panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(C_2_lb_substitute)
                                        .addGroup(C_2_Panel24Layout.createSequentialGroup()
                                                .addComponent(C_2_Label11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(C_2_tf_substitute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout C_2_Panel16Layout = new javax.swing.GroupLayout(C_2_Panel16);
        C_2_Panel16.setLayout(C_2_Panel16Layout);
        C_2_Panel16Layout.setHorizontalGroup(
                C_2_Panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(C_2_Panel16Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(C_2_Panel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(C_2_Panel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(C_2_Panel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(C_2_Panel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        C_2_Panel16Layout.setVerticalGroup(
                C_2_Panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(C_2_Panel16Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(C_2_Panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(C_2_Panel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(C_2_Panel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(C_2_Panel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(C_2_Panel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        //이거 원래 코드 바꿈
        //기존있던 테이블 지우고
        model_att = new DefaultTableModel(
                new Object[][]{
                },
                new Object[]{
                        "일자", "이름", "부서", "직급", "근태유형", "시작일", "종료일", "소요기간", "상태"
                }
        );

        //modell_att를 테이블에 집어 넣음
        DefaultRowSorter sorter = new TableRowSorter<DefaultTableModel>(model_att);
        C_2_tb_tableAttend.setModel(model_att);
        C_2_tb_tableAttend.setRowSorter(sorter);

        C_2_scrollPane2.setViewportView(C_2_tb_tableAttend);

        javax.swing.GroupLayout C_2_Panel2_1Layout = new javax.swing.GroupLayout(C_2_Panel2_1);
        C_2_Panel2_1.setLayout(C_2_Panel2_1Layout);
        C_2_Panel2_1Layout.setHorizontalGroup(
                C_2_Panel2_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(C_2_Panel2_1Layout.createSequentialGroup()
                                .addGroup(C_2_Panel2_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(C_2_scrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(C_2_Panel2_1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(C_2_Panel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        C_2_Panel2_1Layout.setVerticalGroup(
                C_2_Panel2_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(C_2_Panel2_1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(C_2_Panel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(C_2_scrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        C_2_Label6.setText("총");

        C_2_tf_totalAttend.setColumns(5);
        C_2_tf_totalAttend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_2_tf_totalAttendActionPerformed(evt);
            }
        });

        C_2_Label7.setText("건");

        C_2_Label4.setText("~");

        C_2_Label5.setFont(new java.awt.Font("맑은 고딕 Semilight", 1, 17)); // NOI18N
        C_2_Label5.setText("근태신청내역");

        C_2_Panel2_2.setBackground(new java.awt.Color(255, 255, 255));
        C_2_Panel2_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        C_2_Panel2_2.setToolTipText("");

        C_2_tf_startdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        C_2_bt_startCalender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendar.png"))); // NOI18N
        C_2_bt_startCalender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        C_2_bt_startCalender.setPreferredSize(new java.awt.Dimension(29, 29));
        C_2_bt_startCalender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_2_bt_startCalenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout C_2_Panel2_2Layout = new javax.swing.GroupLayout(C_2_Panel2_2);
        C_2_Panel2_2.setLayout(C_2_Panel2_2Layout);
        C_2_Panel2_2Layout.setHorizontalGroup(
                C_2_Panel2_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(C_2_Panel2_2Layout.createSequentialGroup()
                                .addComponent(C_2_tf_startdate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(C_2_bt_startCalender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        C_2_Panel2_2Layout.setVerticalGroup(
                C_2_Panel2_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(C_2_bt_startCalender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(C_2_tf_startdate)
        );

        c_2_Panel2_3.setBackground(new java.awt.Color(255, 255, 255));
        c_2_Panel2_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        c_2_Panel2_3.setToolTipText("");

        C_2_tf_enddate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        C_2_bt_endCalender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendar.png"))); // NOI18N
        C_2_bt_endCalender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        C_2_bt_endCalender.setPreferredSize(new java.awt.Dimension(29, 29));
        C_2_bt_endCalender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_2_bt_endCalenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout c_2_Panel2_3Layout = new javax.swing.GroupLayout(c_2_Panel2_3);
        c_2_Panel2_3.setLayout(c_2_Panel2_3Layout);
        c_2_Panel2_3Layout.setHorizontalGroup(
                c_2_Panel2_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(c_2_Panel2_3Layout.createSequentialGroup()
                                .addComponent(C_2_tf_enddate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(C_2_bt_endCalender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        c_2_Panel2_3Layout.setVerticalGroup(
                c_2_Panel2_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(C_2_bt_endCalender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(C_2_tf_enddate)
        );

        C_2_bt_search1.setText("검색");
        C_2_bt_search1.setPreferredSize(new java.awt.Dimension(55, 25));
        C_2_bt_search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_2_bt_search1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "신청 날짜", "기간" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout C_2_Panel2Layout = new javax.swing.GroupLayout(C_2_Panel2);
        C_2_Panel2.setLayout(C_2_Panel2Layout);
        C_2_Panel2Layout.setHorizontalGroup(
                C_2_Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(C_2_Panel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(C_2_Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(C_2_Panel2Layout.createSequentialGroup()
                                                .addComponent(C_2_Label6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(C_2_tf_totalAttend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(C_2_Label7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(C_2_Panel2_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(C_2_Label4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(c_2_Panel2_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(C_2_bt_search1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(14, 14, 14))
                                        .addComponent(C_2_Panel2_1, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, C_2_Panel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(C_2_Label5)
                                .addGap(680, 680, 680))
        );
        C_2_Panel2Layout.setVerticalGroup(
                C_2_Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(C_2_Panel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(C_2_Label5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(C_2_Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, C_2_Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(C_2_Label7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(C_2_tf_totalAttend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(C_2_Label6))
                                        .addComponent(C_2_Panel2_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(c_2_Panel2_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(C_2_bt_search1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBox1)
                                        .addComponent(C_2_Label4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addComponent(C_2_Panel2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        C_2_Separator1.setBackground(new java.awt.Color(255, 255, 255));
        C_2_Separator1.setForeground(new java.awt.Color(153, 153, 153));

        C_2_Panel3.setBackground(new java.awt.Color(204, 204, 204));

        C_2_Panel3_1.setBackground(new java.awt.Color(204, 204, 204));

        C_2_Panel7.setBackground(new java.awt.Color(204, 204, 204));

        C_2_cb_team.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "부서", "이름" }));
        C_2_cb_team.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_2_cb_teamActionPerformed(evt);
            }
        });

        C_2_tf_input.setPreferredSize(new java.awt.Dimension(94, 25));
        C_2_tf_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_2_tf_inputActionPerformed(evt);
            }
        });

        C_2_bt_search.setText("검색");
        C_2_bt_search.setPreferredSize(new java.awt.Dimension(61, 25));
        C_2_bt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_2_bt_searchActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTree1);

        javax.swing.GroupLayout C_2_Panel7Layout = new javax.swing.GroupLayout(C_2_Panel7);
        C_2_Panel7.setLayout(C_2_Panel7Layout);
        C_2_Panel7Layout.setHorizontalGroup(
                C_2_Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(C_2_Panel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(C_2_Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane1)
                                        .addGroup(C_2_Panel7Layout.createSequentialGroup()
                                                .addComponent(C_2_cb_team, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(5, 5, 5)
                                                .addComponent(C_2_tf_input, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(C_2_bt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(36, Short.MAX_VALUE))
        );
        C_2_Panel7Layout.setVerticalGroup(
                C_2_Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(C_2_Panel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(C_2_Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(C_2_Panel7Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(C_2_cb_team, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(C_2_Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(C_2_tf_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(C_2_bt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout C_2_Panel3_1Layout = new javax.swing.GroupLayout(C_2_Panel3_1);
        C_2_Panel3_1.setLayout(C_2_Panel3_1Layout);
        C_2_Panel3_1Layout.setHorizontalGroup(
                C_2_Panel3_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(C_2_Panel3_1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(C_2_Panel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        C_2_Panel3_1Layout.setVerticalGroup(
                C_2_Panel3_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(C_2_Panel3_1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(C_2_Panel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(28, Short.MAX_VALUE))
        );

        C_2_Label2.setBackground(new java.awt.Color(204, 204, 204));
        C_2_Label2.setFont(new java.awt.Font("맑은 고딕 Semilight", 1, 15)); // NOI18N
        C_2_Label2.setText("근태신청조회");
        C_2_Label2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 0));

        javax.swing.GroupLayout C_2_Panel3Layout = new javax.swing.GroupLayout(C_2_Panel3);
        C_2_Panel3.setLayout(C_2_Panel3Layout);
        C_2_Panel3Layout.setHorizontalGroup(
                C_2_Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(C_2_Panel3_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(C_2_Panel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(C_2_Label2))
        );
        C_2_Panel3Layout.setVerticalGroup(
                C_2_Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(C_2_Panel3Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(C_2_Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C_2_Panel3_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout C_card2Layout = new javax.swing.GroupLayout(C_card2);
        C_card2.setLayout(C_card2Layout);
        C_card2Layout.setHorizontalGroup(
                C_card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(C_card2Layout.createSequentialGroup()
                                .addContainerGap(10, Short.MAX_VALUE)
                                .addGroup(C_card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(C_card2Layout.createSequentialGroup()
                                                .addComponent(C_2_Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(C_2_Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(C_2_Separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(C_2_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        C_card2Layout.setVerticalGroup(
                C_card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(C_card2Layout.createSequentialGroup()
                                .addComponent(C_2_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(C_2_Separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(C_card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(C_card2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(C_2_Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(C_card2Layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(C_2_Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1100, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(C_card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 700, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(C_card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        settree(); //트리 불러오는 쿼리

        //jtree를 클릭할 때 그 값을 emp라는 객체로 받아와서 그 값을 sql문장을 통해 테이블에 출력한다
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
    }

    //tree만드는 함수
    private void settree() {
        DefaultMutableTreeNode root =  (DefaultMutableTreeNode)jTree1.getModel().getRoot();

        List<List<EmpVO>> list = Arrays.asList(e_list_1, e_list_2, e_list_3, e_list_4);
        String[] name = new String[]{"영업팀", "기획팀", "개발1팀", "개발2팀"};

        for(int i = 0; i < list.size(); i++) {
            List<EmpVO> e_list = list.get(i);

            // 각 부서에 해당하는 노드 생성
            DefaultMutableTreeNode deptNode = new DefaultMutableTreeNode(name[i]);
            root.add(deptNode);  // 부서 노드를 루트에 추가

            // 각 부서의 사원을 부서 노드에 추가
            for (EmpVO evo : e_list) {
                DefaultMutableTreeNode empNode = new DefaultMutableTreeNode(evo.getEname());
                deptNode.add(empNode);
            }
        }

        ((DefaultTreeModel) jTree1.getModel()).reload();
        // 결론적으로 트리 구조는 root라는 노드가 있고
        // root밑에 자식 노드로 부서가 있고
        // 부서 밑에 사원 노드가 있다.
    }

    //tree에 리스트 추가하려고 만든 함수
    private void setlist(){
        SqlSession ss = Factory.getFactory().openSession();
        e_list_1 = ss.selectList("emp.dept10");
        e_list_2 = ss.selectList("emp.dept20");
        e_list_3 = ss.selectList("emp.dept30");
        e_list_4 = ss.selectList("emp.dept40");
    }

    //기존에 있던 트리를 뽑아 find노드 함수로로 보내는 매서드
    //부분 검색을 허용해야 되기에 list구조 사용
    private List<TreePath> findTree(JTree tree, String text) {

        DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) model.getRoot();

        List<TreePath> result = new ArrayList<>();

        if("부서".equals(C_2_cb_team.getSelectedItem())) {
            result = findParentNode(node, text);
        }else if("이름".equals(C_2_cb_team.getSelectedItem())){
            result = findChildNode(node, text);
        }

        return result;
    }

    private List<TreePath> findParentNode(DefaultMutableTreeNode node, String text){
        List<TreePath> result = new ArrayList<>();

        // 자식 노드들을 순회하면서 검색
        Enumeration<TreeNode> children = node.children();
        while (children.hasMoreElements()) {
            //child에 자식 노드
            DefaultMutableTreeNode child = (DefaultMutableTreeNode) children.nextElement();

            // 자식 노드가 검색 텍스트를 포함하는지 확인
            if (child.toString().contains(text)) { // 부분 일치 확인
                result.add(new TreePath(child.getPath())); // 결과 리스트에 추가
            }
        }
        return result; // 결과 리스트 반환
    }

    private List<TreePath> findChildNode(DefaultMutableTreeNode node, String text){
        List<TreePath> result = new ArrayList<>();

        // 자식 노드들을 순회
        Enumeration<TreeNode> children = node.children();

        // 여기서 자식 노드는 부서
        while (children.hasMoreElements()) {
            //자식 노드에서 자식 노드값 추출
            DefaultMutableTreeNode child = (DefaultMutableTreeNode) children.nextElement();
            //자식의 자식(손자)값 추출
            Enumeration grandChildren =  child.children();
            //이중 반복문 재귀적으로 순회
            while (grandChildren.hasMoreElements()) {
                DefaultMutableTreeNode grandChild = (DefaultMutableTreeNode) grandChildren.nextElement();
                if (grandChild.toString().contains(text)) {
                    result.add(new TreePath(child.getPath())); // 조건에 맞는 경로 추가
                }
                result.addAll(findChildNode(child, text)); // 자식 노드의 자식도 탐색
            }
        }
        return result; // 결과 리스트 반환
    }

    //검색했을 때 테이블 업데이트 부서명을 기준으로 emp와 vacation불러오기
    private void updateTable_dept(String text) {
        SqlSession ss = Factory.getFactory().openSession();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); //sql에서 데이트 타입이 저거datetime이어서 시간 안보이게하려고 포맷설정

        List<DeptVO> deptlist = ss.selectList("dept.Dept_emp", text);

        if (ss != null) {
            ss.close();
        }

        DefaultTableModel model_att = (DefaultTableModel) C_2_tb_tableAttend.getModel();
        model_att.setRowCount(0); // 테이블 초기화
        // 이거 쿼리가 dept에서 emp 컬렉션 해서 dept에 있는
        // emp맴버들 불러오고 그 이후 각 emp맴버들을 또 컬랙션에서
        // 각 emp맴버의 휴가목록 값을 불러온다
        Map<String, Integer> v_cate_count = new HashMap<>();
        v_cate_count.put("외근", 0);
        v_cate_count.put("출장", 0);
        v_cate_count.put("연장근무", 0);
        v_cate_count.put("연차", 0);

        for (DeptVO dvo : deptlist) {
            List<EmpVO> e_list = dvo.getE_list();
            for (EmpVO evo : e_list) {
                List<VacationVO> v_list = evo.getV_list();
                getV_cate(v_list, v_cate_count);
                for (VacationVO vvo : v_list) {
                    String vdate = vvo.getV_date();
                    Date v_date = null;
                    try {
                        v_date = format.parse(vdate);
                    } catch (ParseException pe) {
                        // 입력된 문자열이 예상한 형식과 다른 경우 에러 처리가 필요합니다.
                        // 에러 처리 방식은 여러분의 응용 프로그램에 따라 다를 수 있습니다.
                        pe.printStackTrace();
                    }
                    String vcheck = null;
                    switch (vvo.getV_check()) {
                        case 0:
                            vcheck = "미확인";
                            break;
                        case 1:
                            vcheck = "승인";
                            break;
                        case 2:
                            vcheck = "반려";
                            break;
                    }
                    model_att.addRow(new Object[]{
                            format.format(v_date), evo.getEname(), dvo.getDname(), evo.getPosition(),
                            vvo.getV_cate(), vvo.getStart_date(), vvo.getEnd_date(),
                            vvo.getV_period(), vcheck
                    });
                }

            }
        }

        C_2_tf_totalAttend.setText(String.valueOf(C_2_tb_tableAttend.getRowCount()));  // 총 건수 업데이트

        if(ss!=null)
            ss.close();
    }

    //검색했을 때 테이블 업데이트
    // 이름을 기준으로 휴가 정보 불러오기
    private void updateTable_emp(String text){
        SqlSession ss = Factory.getFactory().openSession();

        List<EmpVO> empList = ss.selectList("emp.vac_select", text);

        if (ss != null) {
            ss.close();
        }

        DefaultTableModel model_att = (DefaultTableModel) C_2_tb_tableAttend.getModel();
        model_att.setRowCount(0); // 테이블 초기화

        Map<String, Integer> v_cate_count = new HashMap<>();
        v_cate_count.put("외근", 0);
        v_cate_count.put("출장", 0);
        v_cate_count.put("연장근무", 0);
        v_cate_count.put("연차", 0);

        for (EmpVO evo : empList) {
            List<VacationVO> v_list = evo.getV_list();
            DeptVO dvo = evo.getDvo();
            getV_cate(v_list, v_cate_count);
            for (VacationVO vvo : v_list) {
                String vchek = "";
                switch (vvo.getV_check()) {
                    case 0:
                        vchek = "미확인";
                        break;
                    case 1:
                        vchek = "승인";
                        break;
                    case 2:
                        vchek = "반려";
                        break;
                }

                model_att.addRow(new Object[]{
                        vvo.getV_date(), evo.getEname(), dvo.getDname(), evo.getPosition(),
                        vvo.getV_cate(), vvo.getStart_date(), vvo.getEnd_date(),
                        vvo.getV_period() + "일", vchek
                });
            }
        }


        C_2_tf_totalAttend.setText(String.valueOf(C_2_tb_tableAttend.getRowCount()));  // 총 건수 업데이트
    }

    // 맵퍼를 통해 각각 외근 출장 연장근무 연차 횟수 구해서 각 텍스트 필드에 셋팅하기

    private void getV_cate (List<VacationVO> v_list, Map<String, Integer> v_cate_count) {

        for (VacationVO vvo : v_list) {
            String workType = vvo.getV_cate();
            if (v_cate_count.containsKey(workType)) {
                v_cate_count.put(workType, v_cate_count.get(workType) + 1);
            }
        }

        C_2_tf_outside.setText(v_cate_count.get("외근") + "건");
        C_2_tf_business.setText(v_cate_count.get("출장") + "건");
        C_2_tf_overtime.setText(v_cate_count.get("연장근무") + "건");
        C_2_tf_substitute.setText(v_cate_count.get("연차") + "건");
    }

    private void C_2_bt_searchActionPerformed(ActionEvent evt) {
        //텍스트필드에서 텍스트를 받아온다
        String text = C_2_tf_input.getText();

        //findtree 함수를 통해 내가 검색한 값 list에 담는다.
        List<TreePath> p_list = findTree(jTree1, text);

        if(p_list != null && !p_list.isEmpty()) {
            for (TreePath path : p_list) {
                jTree1.setSelectionPath(path);
                jTree1.scrollPathToVisible(path);
            }
            switch (C_2_cb_team.getSelectedItem().toString()) {
                case "부서":
                    updateTable_dept(text);
                    break;
                case "이름":
                    updateTable_emp(text);
                    break;
            }
        }
    }

    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {
        TreePath path = jTree1.getPathForLocation(evt.getX(), evt.getY()); //노드의 좌표얻기

        if (path != null) {
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) path.getLastPathComponent();
            String text = node.toString();

            //노드가 리프인지 즉 차일드가 없는 노드인지 판별해서 emp를 호출할지 dept를 호출할지 결정
            if(node.isLeaf()) {
                updateTable_emp(text);
            }else {
                updateTable_dept(text);
            }

            //테이블 행의 수로 총 건수를 계산함
            int totalAttend = model_att.getRowCount();
            C_2_tf_totalAttend.setText(String.valueOf(totalAttend));
            C_2_tf_totalAttend.repaint();
        }
    }

    private void C_2_bt_search1ActionPerformed(java.awt.event.ActionEvent evt) {
        Map<String, Object> date = new HashMap<String, Object>();

        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        String start_date = C_2_tf_startdate.getText().trim();
        String end_date = C_2_tf_enddate.getText().trim();
        if (start_date.isEmpty()) {
            start_date = null;
        }
        if (end_date.isEmpty()) {
            end_date = null;
        }

        date.put("start_date", start_date);
        date.put("end_date", end_date);

        SqlSession ss = Factory.getFactory().openSession();

        List<VacationVO> v_list = ss.selectList("vacation.C_card2_searchdate", date);

        model_att.setRowCount(0); // 테이블 초기화

        for (VacationVO vvo : v_list) {
            EmpVO evo = vvo.getEvo();
            DeptVO dvo = vvo.getDvo();
            DefaultTableModel model_att = (DefaultTableModel) C_2_tb_tableAttend.getModel();

            String vcheck = null;
            switch (vvo.getV_check()) {
                case 0:
                    vcheck = "미확인";
                    break;
                case 1:
                    vcheck = "승인";
                    break;
                case 2:
                    vcheck = "반려";
                    break;
            }

            model_att.addRow(new Object[]{vvo.getV_date(), evo.getEname(), dvo.getDname(), evo.getPosition(),
                    vvo.getV_cate(), vvo.getStart_date(), vvo.getEnd_date(), vvo.getV_period() + "일", vcheck});
        }

        if(ss!=null)
            ss.close();
    }

    private void C_2_tf_outsideActionPerformed(ActionEvent evt) {//GEN-FIRST:event_C_2_tf_outsideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_2_tf_outsideActionPerformed

    private void C_2_tf_businessActionPerformed(ActionEvent evt) {//GEN-FIRST:event_C_2_tf_businessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_2_tf_businessActionPerformed

    private void C_2_tf_overtimeActionPerformed(ActionEvent evt) {//GEN-FIRST:event_C_2_tf_overtimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_2_tf_overtimeActionPerformed

    private void C_2_tf_substituteActionPerformed(ActionEvent evt) {//GEN-FIRST:event_C_2_tf_substituteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_2_tf_substituteActionPerformed

    private void C_2_tf_totalAttendActionPerformed(ActionEvent evt) {//GEN-FIRST:event_C_2_tf_totalAttendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_2_tf_totalAttendActionPerformed

    private void C_2_bt_startCalenderActionPerformed(ActionEvent evt) {//GEN-FIRST:event_C_2_bt_startCalenderActionPerformed
        new calendarFrame(C_2_tf_startdate);
    }//GEN-LAST:event_C_2_bt_startCalenderActionPerformed

    private void C_2_bt_endCalenderActionPerformed(ActionEvent evt) {//GEN-FIRST:event_C_2_bt_endCalenderActionPerformed
        new calendarFrame(C_2_tf_enddate);
    }//GEN-LAST:event_C_2_bt_endCalenderActionPerformed

    private void C_2_cb_teamActionPerformed(ActionEvent evt) {//GEN-FIRST:event_C_2_cb_teamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_2_cb_teamActionPerformed

    private void C_2_tf_inputActionPerformed(ActionEvent evt) {//GEN-FIRST:event_C_2_tf_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_2_tf_inputActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel C_2_Label1;
    private JLabel C_2_Label10;
    private JLabel C_2_Label11;
    private JLabel C_2_Label2;
    private JLabel C_2_Label4;
    private JLabel C_2_Label5;
    private JLabel C_2_Label6;
    private JLabel C_2_Label7;
    private JLabel C_2_Label8;
    private JLabel C_2_Label9;
    private JPanel C_2_Panel;
    private JPanel C_2_Panel16;
    private JPanel C_2_Panel17;
    private JPanel C_2_Panel18;
    private JPanel C_2_Panel19;
    private JPanel C_2_Panel2;
    private JPanel C_2_Panel24;
    private JPanel C_2_Panel2_1;
    private JPanel C_2_Panel2_2;
    private JPanel C_2_Panel3;
    private JPanel C_2_Panel3_1;
    private JPanel C_2_Panel7;
    private JSeparator C_2_Separator1;
    private JButton C_2_bt_endCalender;
    private JButton C_2_bt_search;
    private JButton C_2_bt_search1;
    private JButton C_2_bt_startCalender;
    private JLabel C_2_lb_business;
    private JLabel C_2_lb_outside;
    private JLabel C_2_lb_overtime;
    private JLabel C_2_lb_substitute;
    private JScrollPane C_2_scrollPane2;
    private JTable C_2_tb_tableAttend;
    private JTextField C_2_tf_business;
    private JTextField C_2_tf_enddate;
    private JTextField C_2_tf_input;
    private JTextField C_2_tf_outside;
    private JTextField C_2_tf_overtime;
    private JTextField C_2_tf_startdate;
    private javax.swing.JComboBox<String> C_2_cb_team;
    private JTextField C_2_tf_substitute;
    private JTextField C_2_tf_totalAttend;
    private JPanel C_card2;
    private JPanel c_2_Panel2_3;
    private javax.swing.JComboBox<String> jComboBox1;
    private JScrollPane jScrollPane1;
    private JTree jTree1;
    private List<EmpVO> e_list_1;
    private List<EmpVO> e_list_2;
    private List<EmpVO> e_list_3;
    private List<EmpVO> e_list_4;
    private DefaultTableModel model_att;
    private Map<String, Integer> v_cate_count;

    // End of variables declaration//GEN-END:variables
}

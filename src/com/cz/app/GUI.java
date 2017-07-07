/*
 * Created by JFormDesigner on Wed Jul 05 20:34:08 EDT 2017
 */

package com.cz.app;

import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author zhichai
 */
public class GUI extends JFrame {
    public GUI() {
        initComponents();
        initControllers();
        this.setVisible(true);
    }

    private void cbx_optionItemStateChanged(ItemEvent e) {
        // TODO add your code here
        if(e.getStateChange() == ItemEvent.SELECTED){
            txt_start.setEnabled(true);
            txt_end.setEnabled(true);
        }
        else{
            txt_start.setEnabled(false);
            txt_end.setEnabled(false);
        }
    }

    private Object makeObj(final String item){
        return new Object(){public String toString(){
            return item;
        }};
    }

    private void initControllers(){
        cbx_user.addItem(makeObj("Customer"));
        cbx_user.addItem(makeObj("Product"));
        cbx_user.addActionListener(new ComboBoxController(cbx_user));
        UrlController url_controller = new UrlController(txt_url, "http://");
        txt_url.addFocusListener(url_controller);
        txt_url.addPropertyChangeListener(url_controller);
        txt_url.getDocument().addDocumentListener(url_controller);

        cbx_option.addItemListener(e -> cbx_optionItemStateChanged(e));
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Yishuo Wang
        cbx_user = new JComboBox();
        txt_url = new JTextField();
        btn_submit = new JButton();
        lbl_end = new JLabel();
        lbl_start = new JLabel();
        txt_start = new JTextField();
        txt_end = new JTextField();
        scrollPane1 = new JScrollPane();
        list_results = new JList();
        cbx_option = new JCheckBox();
        btn_open = new JButton();
        btn_export = new JButton();
        lbl_logo2 = new JLabel();
        lbl_logo1 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();

        //---- txt_url ----

        //---- btn_submit ----
        btn_submit.setText("SUBMIT");

        //---- lbl_end ----
        lbl_end.setText("End Date");

        //---- lbl_start ----
        lbl_start.setText("Start Date");

        //---- txt_start ----
        txt_start.setEnabled(false);

        //---- txt_end ----
        txt_end.setEnabled(false);

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(list_results);
        }

        //---- cbx_option ----
        cbx_option.setText("Advanced Options");
        cbx_option.addItemListener(e -> cbx_optionItemStateChanged(e));

        //---- btn_open ----
        btn_open.setText("OPEN");

        //---- btn_export ----
        btn_export.setText("EXPORT");

        //---- lbl_logo2 ----
        lbl_logo2.setForeground(Color.lightGray);
        lbl_logo2.setIcon(new ImageIcon("/Users/zhichai/HC/SAS/resources/logo_2.png"));
        lbl_logo2.setHorizontalAlignment(SwingConstants.CENTER);

        //---- lbl_logo1 ----
        lbl_logo1.setText("LOGO!");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(scrollPane1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                        .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                            .addComponent(cbx_user, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                            .addComponent(lbl_logo1, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE))
                        .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                            .addComponent(txt_url, GroupLayout.PREFERRED_SIZE, 316, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                            .addComponent(btn_submit, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(cbx_option)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(lbl_end, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(lbl_start, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(txt_end, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_start, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(btn_export, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addComponent(btn_open, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
                                .addComponent(lbl_logo2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGap(18, 18, 18))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_logo1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbx_user, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_url, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_submit))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(cbx_option)
                        .addComponent(btn_open)
                        .addComponent(btn_export))
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_start, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_start, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(txt_end, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_end, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(lbl_logo2, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Yishuo Wang
    private JComboBox cbx_user;
    private JTextField txt_url;
    private JButton btn_submit;
    private JLabel lbl_end;
    private JLabel lbl_start;
    private JTextField txt_start;
    private JTextField txt_end;
    private JScrollPane scrollPane1;
    private JList list_results;
    private JCheckBox cbx_option;
    private JButton btn_open;
    private JButton btn_export;
    private JLabel lbl_logo2;
    private JLabel lbl_logo1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

}

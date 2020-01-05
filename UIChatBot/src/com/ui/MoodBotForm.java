package com.ui;

import java.io.IOException;
import com.model.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Erica Moisei
 * @date 21/10/2019
 * @project Java Moody Chat Bot
 */
public class MoodBotForm extends javax.swing.JFrame {

    /**
     * Creates new form MoodBotForm
     */
    public MoodBotForm() {
        initComponents();
    }

    //Private variables
    private static int saveCount = 0; //coutn that triggers sendong the mesage to the server
    private MoodyBot mb = new MoodyBot();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelBotConfigs = new javax.swing.JPanel();
        lblActivity = new javax.swing.JLabel();
        txtActivity = new javax.swing.JTextField();
        chkStatistics = new javax.swing.JCheckBox();
        chkAnnonimusLog = new javax.swing.JCheckBox();
        btnSaveBotSettings1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnConfigHist = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtNumConfig = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNumLogs = new javax.swing.JTextField();
        txtLogHist = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtConfigs = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtLogs = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        lblChatMoodLvl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Moody Bot UI");
        setBackground(new java.awt.Color(168, 211, 255));
        setPreferredSize(new java.awt.Dimension(1220, 680));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ui/MoodyBotSmall.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 34)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Moody Bot");

        panelBotConfigs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        lblActivity.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblActivity.setText("Activity Status: Watching");

        txtActivity.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        chkStatistics.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        chkStatistics.setText("Track Statistics");

        chkAnnonimusLog.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        chkAnnonimusLog.setText("Annonimus Log");

        btnSaveBotSettings1.setBackground(new java.awt.Color(153, 0, 51));
        btnSaveBotSettings1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnSaveBotSettings1.setForeground(new java.awt.Color(153, 0, 51));
        btnSaveBotSettings1.setText("Save Configuration");
        btnSaveBotSettings1.setBorder(null);
        btnSaveBotSettings1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveBotSettings1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel3.setText("Status won't changed while the server is up.");

        javax.swing.GroupLayout panelBotConfigsLayout = new javax.swing.GroupLayout(panelBotConfigs);
        panelBotConfigs.setLayout(panelBotConfigsLayout);
        panelBotConfigsLayout.setHorizontalGroup(
            panelBotConfigsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotConfigsLayout.createSequentialGroup()
                .addGroup(panelBotConfigsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBotConfigsLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnSaveBotSettings1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBotConfigsLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panelBotConfigsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblActivity)
                            .addGroup(panelBotConfigsLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3))
                            .addComponent(txtActivity, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelBotConfigsLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(panelBotConfigsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chkAnnonimusLog)
                            .addComponent(chkStatistics))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panelBotConfigsLayout.setVerticalGroup(
            panelBotConfigsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotConfigsLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblActivity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtActivity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addComponent(chkStatistics)
                .addGap(23, 23, 23)
                .addComponent(chkAnnonimusLog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnSaveBotSettings1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.setPreferredSize(new java.awt.Dimension(573, 574));

        btnConfigHist.setBackground(new java.awt.Color(61, 61, 61));
        btnConfigHist.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnConfigHist.setForeground(new java.awt.Color(0, 153, 153));
        btnConfigHist.setText("Show History");
        btnConfigHist.setBorder(null);
        btnConfigHist.setPreferredSize(new java.awt.Dimension(124, 19));
        btnConfigHist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigHistActionPerformed(evt);
            }
        });

        jLabel4.setText("Maximum number of confugurations:");

        txtNumConfig.setText("10");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Bot Configuration History");

        jLabel6.setText("Maximum number of Logs:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Analyzer Logs");

        txtNumLogs.setText("10");

        txtLogHist.setBackground(new java.awt.Color(61, 61, 61));
        txtLogHist.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtLogHist.setForeground(new java.awt.Color(0, 153, 153));
        txtLogHist.setText("Show Logs");
        txtLogHist.setBorder(null);
        txtLogHist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLogHistActionPerformed(evt);
            }
        });

        jtConfigs.setBackground(new java.awt.Color(243, 243, 243));
        jtConfigs.setForeground(new java.awt.Color(0, 0, 0));
        jtConfigs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Watching Activity", "Tracking Statistics", "Annonimus Log"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtConfigs);
        if (jtConfigs.getColumnModel().getColumnCount() > 0) {
            jtConfigs.getColumnModel().getColumn(0).setMinWidth(150);
            jtConfigs.getColumnModel().getColumn(0).setMaxWidth(170);
            jtConfigs.getColumnModel().getColumn(1).setMinWidth(190);
            jtConfigs.getColumnModel().getColumn(1).setMaxWidth(250);
            jtConfigs.getColumnModel().getColumn(2).setMinWidth(120);
            jtConfigs.getColumnModel().getColumn(2).setMaxWidth(140);
            jtConfigs.getColumnModel().getColumn(3).setMinWidth(120);
            jtConfigs.getColumnModel().getColumn(3).setMaxWidth(140);
        }

        jtLogs.setAutoCreateRowSorter(true);
        jtLogs.setBackground(new java.awt.Color(243, 243, 243));
        jtLogs.setForeground(new java.awt.Color(0, 0, 0));
        jtLogs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "User Id", "Message", "Mood", "Value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtLogs);
        if (jtLogs.getColumnModel().getColumnCount() > 0) {
            jtLogs.getColumnModel().getColumn(0).setMinWidth(150);
            jtLogs.getColumnModel().getColumn(0).setMaxWidth(170);
            jtLogs.getColumnModel().getColumn(1).setMinWidth(150);
            jtLogs.getColumnModel().getColumn(1).setMaxWidth(180);
            jtLogs.getColumnModel().getColumn(2).setMinWidth(240);
            jtLogs.getColumnModel().getColumn(2).setMaxWidth(800);
        }

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Overall messages mood:");

        lblChatMoodLvl.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblChatMoodLvl.setText("jLabel9");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblChatMoodLvl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtNumLogs, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(30, 30, 30)
                                            .addComponent(txtLogHist, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtNumConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(29, 29, 29)
                                            .addComponent(btnConfigHist, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(43, 43, 43)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfigHist, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtNumConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNumLogs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLogHist, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblChatMoodLvl))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(panelBotConfigs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(73, 73, 73)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelBotConfigs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Saving bot configs to the db and notify the Server about new
     * configuration
     *
     * @param evt
     */
    private void btnSaveBotSettings1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveBotSettings1ActionPerformed
        //Writing settings to db
        populateBotConfigs();

        if (mb.saveNewConfiguration(mb)) {
            // will trigger our connection with the server to send a message about new configuration.
            saveCount++;
            //UI success message
            JOptionPane.showMessageDialog(this, "New Configuration is saved and the Server has been notified.");
        } else {
            JOptionPane.showMessageDialog(this, "Saving Configuration Failed.");
        }
    }//GEN-LAST:event_btnSaveBotSettings1ActionPerformed

    /**
     * Loading bots settings from db Opening TCP connection with the Server
     *
     * @param evt
     */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //load bot settings
        mb = mb.getLastConfiguration();
        populateControls(mb);

        //get overall chat mood
        lblChatMoodLvl.setText(mb.getChatOverallMood());

        //launching the client connection with the server on post 4444
        try {
            launchClient(new Socket("localhost", 4444));
        } catch (IOException ex) {
            Logger.getLogger(MoodBotForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    /**
     * The connection with the Server Will be opened until the App is opened.
     * Sends a message about new bot configurations to the Bot App ()Server
     *
     * @param s
     */
    static void launchClient(Socket s) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                String msgFromServer;
                String msgFromUser = "MoodyBot:NewConfig"; //message for the server
                int counter = 0; // second counter for the loop

                try (Socket client = s) {
                    p("*** Connected with the Server on port 44444 ***");
                    p("------------------------------------------------");

                    try (PrintWriter out = new PrintWriter(client.getOutputStream(), true)) {
                        try (BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()))) {
                            // value -2 after the connection has been closed
                            while (saveCount != -2) {
                                // true agter the button click (save config) 
                                if (saveCount > counter) {

                                    //console message
                                    System.out.println("--> Sending message to check new bot configuration...");

                                    //Sending message to the Server
                                    out.println(msgFromUser);
                                    out.flush();

                                    //Getting Server response
                                    msgFromServer = in.readLine();
                                    System.out.println("Server response: " + msgFromServer); //console log Server msg

                                    counter++; //our local couter
                                } else if (saveCount == -1) {

                                    //send closing connection command to the Server
                                    out.println("bye");
                                    out.flush();

                                    //closing the connection by exitting the loop                                                   
                                    saveCount = -2;
                                }
                                Thread.sleep(1000);
                            }
                        }
                    }

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                p("-------------------------------------------------------------------");
                p("*** The connection with the Server has been closed successfully ***");
            }
        });
        thread.start();
    }

    /**
     * Retrieving Logs History from db limiting by max number
     *
     * @param evt
     */
    private void txtLogHistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLogHistActionPerformed
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //date time formatter
            // get logs history by max num
            DatabaseLogger db = new DatabaseLogger();
            int num = Integer.parseInt(txtNumLogs.getText());
            if (num < 1 || num > 100) {
                JOptionPane.showMessageDialog(this, "Please select a range between 1 and 100");
                return;
            }
            //get logs from db
            List<AnalyzerLog> logsList = db.getAnalyzerLogs(num);

            //prepare the model
            DefaultTableModel model = (DefaultTableModel) jtLogs.getModel();
            Object rowData[] = new Object[6];
            //add rows
            for (AnalyzerLog al : logsList) {
                rowData[0] = simpleDateFormat.format(al.getDateTime());
                rowData[1] = al.getUserId();
                rowData[2] = al.getMessage();
                rowData[3] = al.getMood();
                rowData[4] = al.getValue();
                model.addRow(rowData);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_txtLogHistActionPerformed

    /**
     * Retrieving Configurations History from db limiting by max number
     *
     * @param evt
     */
    private void btnConfigHistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigHistActionPerformed
        try {
            //datetime formatter
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            List<MoodyBot> configs = new ArrayList();
            //num of records
            int num = Integer.parseInt(txtNumConfig.getText());
            if (num < 1 || num > 100) {
                JOptionPane.showMessageDialog(this, "Please select a range between 1 and 100");
                return;
            }

            //get the configs
            configs = mb.getBotConfigurations(num);

            //prepare the model
            DefaultTableModel model = (DefaultTableModel) jtConfigs.getModel();
            Object rowData[] = new Object[5];
            //add rows
            for (MoodyBot mb : configs) {
                rowData[0] = simpleDateFormat.format(mb.getDate());
                rowData[1] = mb.getActivity();
                rowData[2] = mb.isTrackSettings();
                rowData[3] = mb.isAnnonimusLog();
                model.addRow(rowData);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnConfigHistActionPerformed

    /**
     * Closing the connection with the Server before closing the form
     *
     * @param evt
     */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //trigger TCP connection closing
        saveCount = -1;
        try {
            //waiting for connection to be closed properly
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
            Logger.getLogger(MoodBotForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MoodBotForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MoodBotForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MoodBotForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MoodBotForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

            javax.swing.UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.windows.WindowsLookAndFeel"
            );

        } catch (Exception e) {

        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoodBotForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfigHist;
    private javax.swing.JButton btnSaveBotSettings1;
    private javax.swing.JCheckBox chkAnnonimusLog;
    private javax.swing.JCheckBox chkStatistics;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jtConfigs;
    private javax.swing.JTable jtLogs;
    private javax.swing.JLabel lblActivity;
    private javax.swing.JLabel lblChatMoodLvl;
    private javax.swing.JPanel panelBotConfigs;
    private javax.swing.JTextField txtActivity;
    private javax.swing.JButton txtLogHist;
    private javax.swing.JTextField txtNumConfig;
    private javax.swing.JTextField txtNumLogs;
    // End of variables declaration//GEN-END:variables

    /**
     * populating bot class with the settings from UI
     *
     * @return bot with new settings
     */
    private void populateBotConfigs() {
        mb.setActivity(txtActivity.getText());
        mb.setAnnonimusLog(chkAnnonimusLog.isSelected());
        mb.setTrackSettings(chkStatistics.isSelected());
    }

    /**
     * Populating controls from bot class values
     *
     * @param mb
     */
    private void populateControls(MoodyBot mb) {
        txtActivity.setText(mb.getActivity());
        chkStatistics.setSelected(mb.isTrackSettings());
        chkAnnonimusLog.setSelected(mb.isAnnonimusLog());
    }

    static void p(String msg) {
        System.out.println(msg);
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deamonclient;

import com.qut.deamonwarehouse.DeamonWarehouse;
import com.qut.deamonwarehouse.DeamonWarehouseservice;
import java.awt.Color;
import org.tempuri.DeamonInsurance;
import org.tempuri.DeamonSupplier;
import org.tempuri.IDeamonInsurance;
import org.tempuri.IDeamonSupplier;

/**
 *
 * @author Damon
 */
public class ClientGUI extends javax.swing.JFrame {

    boolean p1;
    boolean p2;
    boolean p3;
    boolean p4;
    boolean p5;
    String name;
    int id;
    String date;
    
    DeamonInsurance insure = new DeamonInsurance();
    IDeamonInsurance rance = insure.getBasicHttpBindingIDeamonInsurance();
    DeamonWarehouseservice warehouse = new DeamonWarehouseservice();
    DeamonWarehouse wares = warehouse.getDeamonWarehousePort();
    DeamonSupplier supplier = new DeamonSupplier();
    IDeamonSupplier supply = supplier.getBasicHttpBindingIDeamonSupplier();
    Rest Garage = new Rest("http://fastws.qut.edu.au:8080/n8857954DeamonGarage/webresources/booking");

    
    /**
     * Creates new form ClientGUI
     */
    public ClientGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        customer = new javax.swing.JComboBox();
        request = new javax.swing.JButton();
        part1 = new javax.swing.JCheckBox();
        part2 = new javax.swing.JCheckBox();
        part3 = new javax.swing.JCheckBox();
        part4 = new javax.swing.JCheckBox();
        part5 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cost = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        costi = new javax.swing.JTextField();
        acceptcost = new javax.swing.JButton();
        rejectcost = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        partstat = new javax.swing.JTextField();
        partstat2 = new javax.swing.JTextField();
        partstat3 = new javax.swing.JTextField();
        partstat5 = new javax.swing.JTextField();
        partstat4 = new javax.swing.JTextField();
        acceptdelay = new javax.swing.JButton();
        rejectdelay = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        day = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        month = new javax.swing.JSpinner();
        year = new javax.swing.JSpinner();
        bookcheck = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        bookstatus = new javax.swing.JLabel();
        book = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textout = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Servicing Our Autos");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(600, 550));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        customer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "John", "Damon", "Dog", "Bob", "Bruce Wayne" }));

        request.setText("Request Work");
        request.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestActionPerformed(evt);
            }
        });

        part1.setText("Engine");

        part2.setText("Door");

        part3.setText("Wheel");

        part4.setText("Radio");

        part5.setText("Axel");

        jLabel1.setText("Needs work on:");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(part5)
                    .addComponent(part3)
                    .addComponent(part1)
                    .addComponent(customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(request)
                    .addComponent(part2)
                    .addComponent(part4)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(part1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(part2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(part3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(part4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(part5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(request)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Cost: $");

        cost.setText("0");
        cost.setEnabled(false);

        jLabel3.setText("After Insurance: $");

        costi.setText("0");
        costi.setEnabled(false);

        acceptcost.setText("Accept");
        acceptcost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptcostActionPerformed(evt);
            }
        });

        rejectcost.setText("Reject");
        rejectcost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectcostActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(costi)
                            .addComponent(cost, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rejectcost)
                    .addComponent(acceptcost))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(costi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(acceptcost)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rejectcost)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("Parts - Ready?");

        jLabel5.setText("Engine");

        jLabel6.setText("Door");

        jLabel7.setText("Wheel");

        jLabel8.setText("Radio");

        jLabel9.setText("Axel");

        partstat.setText("N/A");
        partstat.setEnabled(false);

        partstat2.setText("N/A");
        partstat2.setEnabled(false);

        partstat3.setText("N/A");
        partstat3.setEnabled(false);

        partstat5.setText("N/A");
        partstat5.setEnabled(false);

        partstat4.setText("N/A");
        partstat4.setEnabled(false);

        acceptdelay.setText("Accept");
        acceptdelay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptdelayActionPerformed(evt);
            }
        });

        rejectdelay.setText("Reject");
        rejectdelay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectdelayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(partstat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(partstat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(partstat5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(partstat4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(partstat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rejectdelay)
                            .addComponent(acceptdelay))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(partstat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(partstat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(partstat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(partstat4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(partstat5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(acceptdelay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rejectdelay)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setText("Garage Booking");

        day.setValue(24);

        jLabel11.setText("Day");

        jLabel12.setText("Month");

        jLabel13.setText("Year");

        month.setValue(10);

        year.setValue(2014);

        bookcheck.setText("Check Avalibility");
        bookcheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookcheckActionPerformed(evt);
            }
        });

        jLabel14.setText("Status");

        bookstatus.setForeground(new java.awt.Color(102, 102, 102));
        bookstatus.setText("unknown");

        book.setText("Book");
        book.setEnabled(false);
        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bookstatus))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(bookcheck))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(book)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookcheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(bookstatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(book)
                .addContainerGap())
        );

        textout.setColumns(20);
        textout.setLineWrap(true);
        textout.setRows(5);
        textout.setText("___Servicing Our Autos___");
        textout.setMinimumSize(new java.awt.Dimension(400, 25));
        textout.setPreferredSize(new java.awt.Dimension(200, 94));
        jScrollPane1.setViewportView(textout);

        jLabel16.setText("Messages:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void msg(String who,String message){
        textout.setText(textout.getText()+"\n"+who+": "+message);
    }
    
    private void requestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestActionPerformed
        // TODO add your handling code here:
        p1 = part1.isSelected();
        p2 = part2.isSelected();
        p3 = part3.isSelected();
        p4 = part4.isSelected();
        p5 = part5.isSelected();
        
        name = customer.getSelectedItem().toString();
        msg("Sales","Hi "+name+"!");
        msg("You","Hey, I need some work done on my car.");
        id = customer.getSelectedIndex() + 1;
        
        
        runcosts();
    }//GEN-LAST:event_requestActionPerformed

    private void rejected(){
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        msg("Sales","Ok, your Work Order has been canceled.");
        msg("Sales","We Hope to See You Again Soon!");
    }
    
    private void rejectcostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectcostActionPerformed
        rejected();
    }//GEN-LAST:event_rejectcostActionPerformed

    private void rejectdelayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectdelayActionPerformed
        rejected();
    }//GEN-LAST:event_rejectdelayActionPerformed

    private void acceptcostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptcostActionPerformed
        msg("You","Those costs are acceptable.");
        msg("Sales","Ok Great!");
        checkstock();
    }//GEN-LAST:event_acceptcostActionPerformed

    private void acceptdelayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptdelayActionPerformed
        msg("You","I'll wait for those parts.");
        msg("Sales","Great!");
        showBookings();
    }//GEN-LAST:event_acceptdelayActionPerformed

    private void bookcheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookcheckActionPerformed
        checkBooking();
    }//GEN-LAST:event_bookcheckActionPerformed

    private void bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookActionPerformed
        makeBooking();
    }//GEN-LAST:event_bookActionPerformed

    private void runcosts(){
        int mycost = 0;
        if(p1){
            mycost += 500;//engine
        }
        if(p2){
            mycost += 100;//door
        }
        if(p3){
            mycost += 90;//wheel
        }
        if(p4){
            mycost += 120;//radio
        }
        if(p5){
            mycost += 430;//axel
        }
        mycost *= 1.2;//labour
        cost.setText(""+mycost);
        int covered = mycost * (100 - rance.coverage(id))/100;
        costi.setText(""+covered);
        msg("Sales","Here's a Quote for the cost, is it acceptable?");
        showCosts();
    }
    
    private int parttime(String pt){
        int i = 0;
        if(wares.stock(pt) <= 0){
            i = supply.delay(pt);
        }
        return i;
    }
    
    private void checkstock(){
        boolean say = true;
        
        int t;
        if(p1){
            t = parttime("engine");
            if (t > 0){
                partstat.setText(""+t);
                say = false;
            }else{
                partstat.setText("Now");
            }
        }
        if(p2){
            t = parttime("door");
            if (t > 0){
                partstat2.setText(""+t);
                say = false;
            }else{
                partstat2.setText("Now");
            } 
        }
        if(p3){
            t = parttime("wheel");
            if (t > 0){
                partstat3.setText(""+t);
                say = false;
            }else{
                partstat3.setText("Now");
            } 
        }
        if(p4){
            t = parttime("radio");
            if (t > 0){
                partstat4.setText(""+t);
                say = false;
            }else{
                partstat4.setText("Now");
            } 
        }
        if(p5){
            t = parttime("axel");
            if (t > 0){
                partstat5.setText(""+t);
                say = false;
            }else{
                partstat5.setText("Now");
            } 
        }
        showStock();
        if(!say){
            msg("Sales","We need to order some parts, Are the Displayed waiting times ok?");
        }else{
            showBookings();
        }
    }
    
    private void runBookings(){
        msg("Sales","Which day would you like to Bring your Vehicle in?");
    }
    
    private void checkBooking(){
        date = "" + year.getValue() + "-" + month.getValue() + "-" + day.getValue();
        String response = Garage.GET("check/"+date);
        response = Garage.extractResponse(response);
        msg("You","Is this day available?");
        if (!response.matches("1")){
            bookstatus.setForeground(Color.red);
            bookstatus.setText("Unavailable");
            book.setEnabled(false);
            msg("Sales","Sorry but it appears we're already booked that day. How about another?");
        }else{
            bookstatus.setForeground(Color.green);
            bookstatus.setText("Available");
            book.setEnabled(true);
            msg("Sales","Yes, The Garage is Available then, Shall I book it for you?");
        }
    }
    
    private void makeBooking(){
        String response = Garage.GET("make/"+date+"/"+id);
        response = Garage.extractResponse(response);
        msg("You","Book me in please.");
        msg("Garage",response);
        book.setEnabled(false);
        bookcheck.setEnabled(false);
        day.setEnabled(false);
        month.setEnabled(false);
        year.setEnabled(false);
    }
    
    private void showCosts(){
        jPanel2.setVisible(true);
        request.setEnabled(false);
        part1.setEnabled(false);
        part2.setEnabled(false);
        part3.setEnabled(false);
        part4.setEnabled(false);
        part5.setEnabled(false);
        customer.setEnabled(false);
    }
    private void showStock(){
        jPanel3.setVisible(true);
        acceptcost.setEnabled(false);
        rejectcost.setEnabled(false);
    }
    private void showBookings(){
        runBookings();
        jPanel4.setVisible(true);
        acceptdelay.setEnabled(false);
        rejectdelay.setEnabled(false);
    }
    
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptcost;
    private javax.swing.JButton acceptdelay;
    private javax.swing.JButton book;
    private javax.swing.JButton bookcheck;
    private javax.swing.JLabel bookstatus;
    private javax.swing.JTextField cost;
    private javax.swing.JTextField costi;
    private javax.swing.JComboBox customer;
    private javax.swing.JSpinner day;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner month;
    private javax.swing.JCheckBox part1;
    private javax.swing.JCheckBox part2;
    private javax.swing.JCheckBox part3;
    private javax.swing.JCheckBox part4;
    private javax.swing.JCheckBox part5;
    private javax.swing.JTextField partstat;
    private javax.swing.JTextField partstat2;
    private javax.swing.JTextField partstat3;
    private javax.swing.JTextField partstat4;
    private javax.swing.JTextField partstat5;
    private javax.swing.JButton rejectcost;
    private javax.swing.JButton rejectdelay;
    private javax.swing.JButton request;
    private javax.swing.JTextArea textout;
    private javax.swing.JSpinner year;
    // End of variables declaration//GEN-END:variables
}

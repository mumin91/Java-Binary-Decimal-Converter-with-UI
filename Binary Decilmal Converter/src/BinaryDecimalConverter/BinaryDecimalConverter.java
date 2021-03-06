/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryDecimalConverter;

import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class BinaryDecimalConverter extends javax.swing.JFrame {

    /**
     * Creates new form BinaryDecimalConverter
     */
    public BinaryDecimalConverter() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    class Binary{
        String DecToBinary(int num){
            String binaryNumber;
            int decimalNumber;
            binaryNumber = "";
            decimalNumber = num;
              // algorithm step by step
              // initial: binaryNumber = "", decimalNumber = 123
              // step 1 : binaryNumber = "1 ", decimalNumber = 61
              // step 2 : binaryNumber = "11 ", decimalNumber = 30
              // step 3 : binaryNumber = "011 ", decimalNumber = 15
              // step 4 : binaryNumber = "1011 ", decimalNumber = 7
              // step 5 : binaryNumber = "1 1011 ", decimalNumber = 3
              // step 6 : binaryNumber = "11 1011 ", decimalNumber = 1
              // step 6 : binaryNumber = "111 1011 ", decimalNumber = 0
              // stop   : (decimalNumber != 0)
              while (decimalNumber != 0) {
                    // add spaces to separate 4-digit groups
                    if (binaryNumber.length() % 5 == 0)
                         binaryNumber = " " + binaryNumber;
                    // extract last digit in binary representation
                    // and add it to binaryNumber
                    binaryNumber = (decimalNumber % 2) + binaryNumber;
                    // cut last digit in binary representation
                    decimalNumber /= 2;
            }
            return binaryNumber;
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        
        input = new javax.swing.JTextField(); 
        bnTodec = new javax.swing.JButton();
        decTobn = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        output = new javax.swing.JTextField();
        exit = new javax.swing.JButton();
        header = new java.awt.Label();
        minimize = new javax.swing.JButton();

        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        input.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        input.setToolTipText("Enter a 10-digit binary or decimal number");
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        bnTodec.setText("Binary >> Decimal");
        bnTodec.setToolTipText("Click to convert to Decimal");
        bnTodec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnTodecActionPerformed(evt);
            }
        });

        decTobn.setText("Decimal >> Binary");
        decTobn.setToolTipText("Click to convert to Binary");
        decTobn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decTobnActionPerformed(evt);
            }
        });

        clear.setText("Clear");
        clear.setToolTipText("Click to clear fields");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        output.setEditable(false);
        output.setBackground(new java.awt.Color(255, 255, 255));
        output.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        output.setToolTipText("See the result here");
        output.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.setToolTipText("Click to close the program");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        header.setAlignment(java.awt.Label.CENTER);
        header.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        header.setText("Decimal-Binary Converter");

        minimize.setText("Minimize");
        minimize.setToolTipText("Click to minimize the program");
        minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bnTodec)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(decTobn))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(106, 106, 106)
                                            .addComponent(clear))))
                                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnTodec)
                    .addComponent(decTobn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clear)
                .addGap(18, 18, 18)
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit)
                    .addComponent(minimize))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(397, 368));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {                                      
       //clearing the fields
        input.setText("");
       output.setText("");
    }                                     

    private void bnTodecActionPerformed(java.awt.event.ActionEvent evt) {                                        
     try{   
        //getting inpute from user
        String s =   input.getText();
        //converting the string to integer 
        int num = Integer.parseInt(s);
        int decimalNew = 0;
        int p =1;
        while(num > 0){
            int decimal = num%10;
            if(decimal != 0 && decimal != 1){
     JOptionPane.showMessageDialog(null, "Please, Enter a binary number", "Wrong Input!!!",
                                    JOptionPane.ERROR_MESSAGE);
                                    break;
        }
            else{
                decimalNew +=decimal * p;
                p *= 2;
                num /= 10;
            }
     }
        output.setText(""+decimalNew);
        }
     catch(NumberFormatException e){
         JOptionPane.showMessageDialog(null, "Please, Enter a binary number", "Wrong Input!!!",
                                    JOptionPane.ERROR_MESSAGE);
     }
    }                                       

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {                                      
       
    }                                     

    private void outputActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void decTobnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        try{
        String s = input.getText();
        int num = Integer.parseInt(s);
        if (num < 0){
            throw new IllegalArgumentException();
        }
        else if (num == 0){
            output.setText("0");
        }
        else{
            Binary binary = new Binary();
            String b = binary.DecToBinary(num);
            output.setText(""+b);
        }
        
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please, Enter a decimal number", "Wrong Input!!!",
                                    JOptionPane.ERROR_MESSAGE);
        }
       catch (IllegalArgumentException e){
           JOptionPane.showMessageDialog(null, "Please, Enter a positive number", "Wrong Input!!!",
                                    JOptionPane.ERROR_MESSAGE);
       }
    }                                       

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {                                     
        System.exit(0);
    }                                    

    private void minimizeActionPerformed(java.awt.event.ActionEvent evt) {                                         
        setState(ICONIFIED);
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
            java.util.logging.Logger.getLogger(BinaryDecimalConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BinaryDecimalConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BinaryDecimalConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BinaryDecimalConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BinaryDecimalConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton bnTodec;
    private javax.swing.JButton clear;
    private javax.swing.JButton decTobn;
    private javax.swing.JButton exit;
    private java.awt.Label header;
    private javax.swing.JTextField input;
    private javax.swing.JButton minimize;
    private javax.swing.JTextField output;
    // End of variables declaration                   
}

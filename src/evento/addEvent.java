/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evento;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

/**
 *
 * @author daboy
 */
public class addEvent extends javax.swing.JDialog {
        
    /**
     * Creates new form addEventDialog
     */
    public addEvent(EventManager em, boolean modal) {
        super(em, modal);
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        coloredPanel = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        addEventLabel = new javax.swing.JLabel();
        eventNameText = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        placeLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        eventPlaceText = new javax.swing.JTextField();
        eventDateText = new com.toedter.calendar.JDateChooser();
        Date date = new Date();
        SpinnerDateModel sm = new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        eventTimeText = new javax.swing.JSpinner(sm);
        addButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        coloredPanel.setBackground(new java.awt.Color(205, 205, 235));

        titlePanel.setBackground(new java.awt.Color(0, 51, 51));

        addEventLabel.setBackground(new java.awt.Color(0, 0, 123));
        addEventLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addEventLabel.setForeground(new java.awt.Color(255, 255, 255));
        addEventLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addEventLabel.setText("ADD EVENT");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addEventLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addEventLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        eventNameText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        nameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nameLabel.setText("Name");

        placeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        placeLabel.setText("Place");

        dateLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dateLabel.setText("Date");

        timeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        timeLabel.setText("Time");

        eventPlaceText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        eventPlaceText.setPreferredSize(new java.awt.Dimension(6, 29));

        eventDateText.setDateFormatString("dd-MM-yyyy");
        eventDateText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        eventDateText.setMinSelectableDate(new Date());

        JSpinner.DateEditor de = new JSpinner.DateEditor(eventTimeText, "HH:mm");
        eventTimeText.setEditor(de);
        eventTimeText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        eventTimeText.setPreferredSize(new java.awt.Dimension(33, 30));

        addButton.setBackground(new java.awt.Color(0, 51, 51));
        addButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("ADD");
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout coloredPanelLayout = new javax.swing.GroupLayout(coloredPanel);
        coloredPanel.setLayout(coloredPanelLayout);
        coloredPanelLayout.setHorizontalGroup(
            coloredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, coloredPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(coloredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, coloredPanelLayout.createSequentialGroup()
                        .addGroup(coloredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, coloredPanelLayout.createSequentialGroup()
                                .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(eventTimeText, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 80, Short.MAX_VALUE))
                    .addGroup(coloredPanelLayout.createSequentialGroup()
                        .addGroup(coloredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(placeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(coloredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(coloredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(eventNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                .addComponent(eventPlaceText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(eventDateText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(34, 34, 34))
        );
        coloredPanelLayout.setVerticalGroup(
            coloredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coloredPanelLayout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(coloredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eventNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(coloredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(placeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(coloredPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(eventPlaceText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(coloredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(eventDateText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(coloredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(timeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(eventTimeText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(coloredPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(coloredPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        if (validateAddEventForm() == true){  
            // converting the date selected to string before send it to db
            Date eventDate = eventDateText.getDate();
            SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
            String stringFormattedDate = sdf1.format(eventDate);
            
         
            // converting the time selected to string before send it to db^
            Date spinnerTimeValue = (Date) eventTimeText.getValue();
            SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm");
            String readableTime =  sdf2.format(spinnerTimeValue);
            
            
            /* Instanciate my DatabaseConnection class to use to method addEvent(Event e) 
            that add Event to the corresponding table in the db*/
            DatabaseConnection db = new DatabaseConnection();
            
            // Create the expected the event with filled details to be passed to addEvent as parameter
            Event e = new Event(eventNameText.getText(), eventPlaceText.getText(), stringFormattedDate , readableTime);
            try {
                db.addEvent(e); // Adding a event to my db
                db.printEventsDetails(); // Printing my database events details on the console
                JOptionPane.showMessageDialog(null, "Event added succesfully !");
                String[] options = {"Yes", "No"}; // Initializing options parameters for the showOptionDialog() method
                int yesNo = JOptionPane.showOptionDialog(null,"Do you want to add another event ?","Add another event", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, options, null);
                addAnotherEvent(yesNo);   
            } catch (SQLException ex) {
                System.out.println("Unexpected Error\nError Details: "+ex);
                Logger.getLogger(addEvent.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
        
    }//GEN-LAST:event_addButtonMouseClicked


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
            java.util.logging.Logger.getLogger(addEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            private EventManager EventManager;
            @Override
            public void run() {
                addEvent dialog = new addEvent(EventManager , true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    // Method to validate the data filling
    public boolean validateAddEventForm(){
        boolean b;
        if (eventNameText.getText().isEmpty() || eventPlaceText.getText().isEmpty() || eventDateText.getDate().toString() == null){
            b = false;
            JOptionPane.showMessageDialog(null, "Please fill all you event details to add it");       
        }
        else{b=true;}
        return b;
    }

    // Method to check if the user want to add another event
    public boolean addAnotherEvent(int yesNo){
        boolean b;
        if (yesNo == 0){
           b = true;
           clear(); 
        }else{
           b = false;
           clear();
           addEvent.super.dispose();
        }
        return b;
    }
    
    
    

    // Method to free fields when the user want to add another event
    public void clear(){
        eventNameText.setText("");
        eventPlaceText.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel addEventLabel;
    private javax.swing.JPanel coloredPanel;
    private javax.swing.JLabel dateLabel;
    private com.toedter.calendar.JDateChooser eventDateText;
    private javax.swing.JTextField eventNameText;
    private javax.swing.JTextField eventPlaceText;
    private javax.swing.JSpinner eventTimeText;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel placeLabel;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}

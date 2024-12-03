import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class MemberD extends javax.swing.JFrame {

String url = "jdbc:mysql://localhost:3306/maringo_database";
    String username = "root";
    String password = "12345678";
    //Statement 
    public MemberD() {
        initComponents();
        editLabel();
        loadData();
        getContentPane().setBackground(Color.black);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public void loadData(){
        try(
                Connection conn = DriverManager.getConnection(url,username,password);
                Statement stmt = conn.createStatement();
             ){
            try{
               ResultSet rset = stmt.executeQuery("select * from club_membership_table");
               while(rset.next()){
                   
               String memno = rset.getString("Member_No");
               String memName = rset.getString("Member_full_name");
               String gender = rset.getString("gender");
               String nok  = rset.getString("Next_of_kin");
               String Dob = rset.getString("Date_of_birth");
               String cont = rset.getString("contact");
               String subc = rset.getString("subcounty");
               String scorc = rset.getString("School_or_college");
               String Weight = rset.getString("Weight_in_kg");
               String height = rset.getString("Height_in_cm");
               String special = rset.getString("Special_needs");
               String cat = rset.getString("Category");
               String enrol = rset.getString("Enroled_as");
               String ps = rset.getString("Password");
               String reg = rset.getString("Registration_fee");
               String Age = rset.getString("Age");
               String[] data = {memno,memName,gender,nok,Dob,cont,subc,scorc,Weight,height,special,cat,enrol,ps,reg,Age};
               
               DefaultTableModel model =  (DefaultTableModel)jTable1.getModel();
               
               model.addRow(data);
               
                
                       }
                
            }catch(SQLException e){
                System.out.println(e);
            }
    }
        catch(SQLException e){
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Member Number", "Member full name", "Gender", "Next of Kin", "Date of birth", "Contact", "Subcounty", "School/College", "Weight in kgs", "Height in cm", "Special needs", "Category", "Enroled as", "Password", "Registration fee", "Age"
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Remove Member");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(278, 278, 278)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(51, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String number =JOptionPane.showInputDialog("Enter the member_number of the member to be removed");
        try(
                Connection conn = DriverManager.getConnection(url,username,password);
                Statement stmt = conn.createStatement();
             ){
        stmt.executeUpdate("Delete from club_membership_table where Member_No='"+number+"'");
        JOptionPane.showMessageDialog(null,"Successfully removed a player from the club","Player removal",JOptionPane.INFORMATION_MESSAGE);
        this.repaint();
        }catch(SQLException e){
            System.out.println(e);
        }
        
    }                                        

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {                                     
       this.dispose();
    }                                    
public void editLabel(){
       ImageIcon icon = new ImageIcon("Images\\Asset 2.png");
       jLabel1.setIcon(icon);
   }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration                   
}

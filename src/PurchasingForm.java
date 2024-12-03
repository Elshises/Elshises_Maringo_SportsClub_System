import javax.swing.*;
import java.sql.*;
import java.time.LocalDate;




public class PurchasingForm extends javax.swing.JFrame {
    String url ="jdbc:mysql://localhost:3306/maringo_database";
    String username = "root";
    String password ="12345678";
    
    
    
    
    private double TotalCost ;
    private double bloomerCost;
     private  double gameShortCost;
    private double hockeyStickCost;
    private double socksCost;
    private double sportShoesCost;
    private double tracksuitCost;
    private double tshirtCost;
    private double wrapperCost;
    private double discount;
    private double FinalCost;
    private String items = "";
    

     String MemNo;
    public PurchasingForm() {
  MemNo = JOptionPane.showInputDialog("Enter your Member_No");
        
        
        
        
        initComponents();
        editLabel();
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        ButtonGroup group = new ButtonGroup();
        group.add(jRadioButton2);
        group.add(jRadioButton1);
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        label1 = new java.awt.Label();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Bloomer = new javax.swing.JRadioButton();
        Gameshort = new javax.swing.JRadioButton();
        HockeyStick = new javax.swing.JRadioButton();
        Socks = new javax.swing.JRadioButton();
        SportShoes = new javax.swing.JRadioButton();
        TrackSuit = new javax.swing.JRadioButton();
        TShirt = new javax.swing.JRadioButton();
        Wrapper = new javax.swing.JRadioButton();
        Bloomerlabel = new javax.swing.JLabel();
        Hockeysticklabel = new javax.swing.JLabel();
        Gameshortlabel = new javax.swing.JLabel();
        Sockslabel = new javax.swing.JLabel();
        Tracksuitlabel = new javax.swing.JLabel();
        Tshirtlabel = new javax.swing.JLabel();
        Wrapperlabel = new javax.swing.JLabel();
        BloomerSpinner = new javax.swing.JSpinner();
        GSpinner = new javax.swing.JSpinner();
        SocksSpinner = new javax.swing.JSpinner();
        HockeyStickSpinner = new javax.swing.JSpinner();
        SportshoesSpinner = new javax.swing.JSpinner();
        TracksuitSpinner = new javax.swing.JSpinner();
        TShirtSpinner = new javax.swing.JSpinner();
        WrapperSpinner = new javax.swing.JSpinner();
        shoeslabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TCLabel = new javax.swing.JLabel();
        DiscountLabel = new javax.swing.JLabel();
        FCostlabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 255, 255));
        jPanel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(373, 623));

        Bloomer.setBackground(new java.awt.Color(0, 0, 0));
        Bloomer.setForeground(new java.awt.Color(0, 255, 255));
        Bloomer.setText("Bloomer");
        Bloomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloomerActionPerformed(evt);
            }
        });

        Gameshort.setBackground(new java.awt.Color(0, 0, 0));
        Gameshort.setForeground(new java.awt.Color(0, 255, 255));
        Gameshort.setText("Games Short");
        Gameshort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GameshortActionPerformed(evt);
            }
        });

        HockeyStick.setBackground(new java.awt.Color(0, 0, 0));
        HockeyStick.setForeground(new java.awt.Color(0, 255, 255));
        HockeyStick.setText("HockeyStick");
        HockeyStick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HockeyStickActionPerformed(evt);
            }
        });

        Socks.setBackground(new java.awt.Color(0, 0, 0));
        Socks.setForeground(new java.awt.Color(0, 255, 255));
        Socks.setText("Socks");
        Socks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SocksActionPerformed(evt);
            }
        });

        SportShoes.setBackground(new java.awt.Color(0, 0, 0));
        SportShoes.setForeground(new java.awt.Color(0, 255, 255));
        SportShoes.setText("Sport Shoes");
        SportShoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SportShoesActionPerformed(evt);
            }
        });

        TrackSuit.setBackground(new java.awt.Color(0, 0, 0));
        TrackSuit.setForeground(new java.awt.Color(0, 255, 255));
        TrackSuit.setText("TrackSuit");
        TrackSuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrackSuitActionPerformed(evt);
            }
        });

        TShirt.setBackground(new java.awt.Color(0, 0, 0));
        TShirt.setForeground(new java.awt.Color(0, 255, 255));
        TShirt.setText("T-Shirt");
        TShirt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TShirtActionPerformed(evt);
            }
        });

        Wrapper.setBackground(new java.awt.Color(0, 0, 0));
        Wrapper.setForeground(new java.awt.Color(0, 255, 255));
        Wrapper.setText("Wrapper");
        Wrapper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WrapperActionPerformed(evt);
            }
        });

        Bloomerlabel.setForeground(new java.awt.Color(0, 255, 255));
        Bloomerlabel.setText("Ksh 250");

        Hockeysticklabel.setForeground(new java.awt.Color(0, 255, 255));
        Hockeysticklabel.setText("Ksh 2000");

        Gameshortlabel.setForeground(new java.awt.Color(0, 255, 255));
        Gameshortlabel.setText("Ksh 750");

        Sockslabel.setForeground(new java.awt.Color(0, 255, 255));
        Sockslabel.setText("Ksh 350");

        Tracksuitlabel.setForeground(new java.awt.Color(0, 255, 255));
        Tracksuitlabel.setText("Ksh 1000");

        Tshirtlabel.setForeground(new java.awt.Color(0, 255, 255));
        Tshirtlabel.setText("Ksh 800");

        Wrapperlabel.setForeground(new java.awt.Color(0, 255, 255));
        Wrapperlabel.setText("Ksh 450");

        BloomerSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        BloomerSpinner.setEnabled(false);
        BloomerSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BloomerSpinnerStateChanged(evt);
            }
        });

        GSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        GSpinner.setEnabled(false);
        GSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                GSpinnerStateChanged(evt);
            }
        });

        SocksSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        SocksSpinner.setEnabled(false);
        SocksSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SocksSpinnerStateChanged(evt);
            }
        });

        HockeyStickSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        HockeyStickSpinner.setEnabled(false);
        HockeyStickSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                HockeyStickSpinnerStateChanged(evt);
            }
        });

        SportshoesSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        SportshoesSpinner.setEnabled(false);
        SportshoesSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SportshoesSpinnerStateChanged(evt);
            }
        });

        TracksuitSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        TracksuitSpinner.setEnabled(false);
        TracksuitSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                TracksuitSpinnerStateChanged(evt);
            }
        });

        TShirtSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        TShirtSpinner.setEnabled(false);
        TShirtSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                TShirtSpinnerStateChanged(evt);
            }
        });

        WrapperSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        WrapperSpinner.setEnabled(false);
        WrapperSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                WrapperSpinnerStateChanged(evt);
            }
        });

        shoeslabel1.setForeground(new java.awt.Color(0, 255, 255));
        shoeslabel1.setText("Ksh 1500");

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Cost per item");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("Item");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("Item Count");

        jLabel13.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 0));
        jLabel13.setText("item Purchasing form");

        jLabel4.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("MARINGO SPORTS CLUB SYSTEM");

        TCLabel.setForeground(new java.awt.Color(0, 255, 0));
        TCLabel.setText("Total Cost : ");

        DiscountLabel.setForeground(new java.awt.Color(51, 255, 0));
        DiscountLabel.setText("Discount :");

        FCostlabel.setForeground(new java.awt.Color(51, 255, 0));
        FCostlabel.setText("Final Cost :");

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Purchase");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 0));
        jRadioButton1.setText("Cash");
        jRadioButton1.setEnabled(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 51));
        jRadioButton2.setText("Mpesa");
        jRadioButton2.setEnabled(false);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 255));
        jLabel5.setText("Pay Via");

        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Wrapper)
                    .addComponent(TShirt)
                    .addComponent(TrackSuit)
                    .addComponent(SportShoes)
                    .addComponent(Socks)
                    .addComponent(HockeyStick)
                    .addComponent(Gameshort)
                    .addComponent(Bloomer)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(FCostlabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Bloomerlabel)
                                    .addComponent(Gameshortlabel)
                                    .addComponent(Hockeysticklabel)
                                    .addComponent(Sockslabel)
                                    .addComponent(Tracksuitlabel)
                                    .addComponent(Tshirtlabel)
                                    .addComponent(shoeslabel1)
                                    .addComponent(Wrapperlabel)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DiscountLabel)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(73, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(GSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BloomerSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(HockeyStickSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SocksSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SportshoesSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TracksuitSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TShirtSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(WrapperSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(53, 53, 53))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33))))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addGap(110, 110, 110))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(TCLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bloomer)
                    .addComponent(Bloomerlabel)
                    .addComponent(BloomerSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gameshort)
                    .addComponent(Gameshortlabel)
                    .addComponent(GSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HockeyStick)
                    .addComponent(Hockeysticklabel)
                    .addComponent(HockeyStickSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Socks)
                    .addComponent(Sockslabel)
                    .addComponent(SocksSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SportShoes)
                    .addComponent(shoeslabel1)
                    .addComponent(SportshoesSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TrackSuit)
                    .addComponent(Tracksuitlabel)
                    .addComponent(TracksuitSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TShirt)
                    .addComponent(Tshirtlabel)
                    .addComponent(TShirtSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Wrapper)
                    .addComponent(Wrapperlabel)
                    .addComponent(WrapperSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TCLabel)
                    .addComponent(DiscountLabel))
                .addGap(18, 18, 18)
                .addComponent(FCostlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void BloomerActionPerformed(java.awt.event.ActionEvent evt) {                                        
     jRadioButton1.setEnabled(true);
     jRadioButton2.setEnabled(true);
        if(Bloomer.isSelected()){
        BloomerSpinner.setEnabled(true);
        items = "Bloomers";
        
     }else 
         BloomerSpinner.setEnabled(false);
    }                                       

    private void GameshortActionPerformed(java.awt.event.ActionEvent evt) {                                          
       jRadioButton1.setEnabled(true);
     jRadioButton2.setEnabled(true);
        if(Gameshort.isSelected())
     GSpinner.setEnabled(true);
    else 
         GSpinner.setEnabled(false);
           
    }                                         

    private void HockeyStickActionPerformed(java.awt.event.ActionEvent evt) {                                            
      jRadioButton1.setEnabled(true);
     jRadioButton2.setEnabled(true);
        if(HockeyStick.isSelected())
     HockeyStickSpinner.setEnabled(true);
    else 
         HockeyStickSpinner.setEnabled(false);
    }                                           

    private void SocksActionPerformed(java.awt.event.ActionEvent evt) {                                      
        jRadioButton1.setEnabled(true);
     jRadioButton2.setEnabled(true);
        if(Socks.isSelected())
     SocksSpinner.setEnabled(true);
    else 
         SocksSpinner.setEnabled(false);
    }                                     

    private void SportShoesActionPerformed(java.awt.event.ActionEvent evt) {                                           
        jRadioButton1.setEnabled(true);
     jRadioButton2.setEnabled(true);
        if(SportShoes.isSelected())
     SportshoesSpinner.setEnabled(true);
    else 
         SportshoesSpinner.setEnabled(false);
    }                                          

    private void TrackSuitActionPerformed(java.awt.event.ActionEvent evt) {                                          
       jRadioButton1.setEnabled(true);
     jRadioButton2.setEnabled(true);
        if(TrackSuit.isSelected())
     TracksuitSpinner.setEnabled(true);
    else 
        TracksuitSpinner.setEnabled(false);
    }                                         

    private void TShirtActionPerformed(java.awt.event.ActionEvent evt) {                                       
        jRadioButton1.setEnabled(true);
     jRadioButton2.setEnabled(true);
        if(TShirt.isSelected())
     TShirtSpinner.setEnabled(true);
    else 
        TShirtSpinner.setEnabled(false);
    }                                      

    private void WrapperActionPerformed(java.awt.event.ActionEvent evt) {                                        
       jRadioButton1.setEnabled(true);
     jRadioButton2.setEnabled(true);
        if(Wrapper.isSelected())
     WrapperSpinner.setEnabled(true);
    else 
         WrapperSpinner.setEnabled(false);
    }                                       

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
     try(
           Connection conn = DriverManager.getConnection(url,username,password);
             Statement stmt = conn.createStatement();
             
             ){
         try{
             
             
             PreparedStatement pst = conn.prepareCall("insert into item_purchase_table (Purchaser_No,Purchase_date,Total_cost,Discount,Final_cost,Paid_by) values (?,?,?,?,?,?)");
             pst.setString(1,MemNo);
             
             LocalDate date = LocalDate.now();
             pst.setString(2,date.toString() );
             pst.setDouble(3,TotalCost);
             pst.setDouble(4, discount);
             pst.setDouble(5,FinalCost);
             if(jRadioButton2.isSelected()){
                 
             pst.setString(6, "M-Pesa");
             }
           
             pst.setString(6,"Cash");
         
             pst.executeUpdate();
             stmt.executeUpdate("update store_items_table set item_level_percentage = item_level_percentage - 5");
             JOptionPane.showMessageDialog(null,"You have successfully purchased items worth Ksh "+FinalCost,"Purchase Confirmation",JOptionPane.INFORMATION_MESSAGE);
             this.dispose();
         }
         catch(SQLException e){
             System.out.println(e);
             
         }
     }
     catch(SQLException e){
         System.out.println(e);
     }
    }                                        

    private void BloomerSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {                                            
        bloomerCost = (250.0*(Double.parseDouble(BloomerSpinner.getValue().toString())));
        TotalCost+=bloomerCost;
        TCLabel.setText("Total Cost : Ksh "+(TotalCost));
         Calc();
         
         
                 
    }                                           

    private void GSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {                                      
      gameShortCost = (750.0*(Double.parseDouble(GSpinner.getValue().toString())));
      TotalCost+=gameShortCost;
        TCLabel.setText("Total Cost : Ksh "+(TotalCost));
        Calc();
    }                                     

    private void HockeyStickSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {                                                
        hockeyStickCost = (2000.0*(Double.parseDouble(HockeyStickSpinner.getValue().toString())));
      TotalCost+=hockeyStickCost;
        TCLabel.setText("Total Cost : Ksh "+(TotalCost));
         Calc();
         items = items + HockeyStickSpinner.getValue().toString()+"HockeySticks";
    }                                               

    private void SocksSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {                                          
       socksCost = (350.0*(Double.parseDouble(SocksSpinner.getValue().toString())));
      TotalCost+=socksCost;
        TCLabel.setText("Total Cost : Ksh "+(TotalCost));
        Calc();
        items = items + SocksSpinner.getValue().toString()+"Socks";
         
    }                                         

    private void SportshoesSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {                                               
        sportShoesCost = (1500.0*(Double.parseDouble(SportshoesSpinner.getValue().toString())));
      TotalCost+=sportShoesCost;
        TCLabel.setText("Total Cost : Ksh "+(TotalCost));
         Calc();
         items = items + SportshoesSpinner.getValue().toString()+"Sportshoes";
    }                                              

    private void TracksuitSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {                                              
        tracksuitCost = (1000.0*(Double.parseDouble(TracksuitSpinner.getValue().toString())));
      TotalCost+=tracksuitCost;
        TCLabel.setText("Total Cost : Ksh "+(TotalCost));
        Calc();
        items = items + TracksuitSpinner.getValue().toString()+"Tracksuits";
         
    }                                             

    private void TShirtSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {                                           
        tshirtCost = (800.0*(Double.parseDouble(TShirtSpinner.getValue().toString())));
      TotalCost+=tshirtCost;
        TCLabel.setText("Total Cost : Ksh "+(TotalCost));
         Calc();
         items = items + TShirtSpinner.getValue().toString()+"TShirts";
    }                                          

    private void WrapperSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {                                            
       wrapperCost = (450.0*(Double.parseDouble(WrapperSpinner.getValue().toString())));
      TotalCost+=wrapperCost;
        TCLabel.setText("Total Cost : Ksh "+(TotalCost));
         Calc();
         items = items + WrapperSpinner.getValue().toString()+"Wrappers";
    }                                           

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
 jButton1.setEnabled(true);
    }                                             

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                              
       jButton1.setEnabled(true);
    }                                             

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {                                     
       this.dispose();
    }                                    
       public void Calc(){
           if(TotalCost>=10000)
            discount = TotalCost*0.05; 
            FinalCost= TotalCost-discount;
            FCostlabel.setText("Final Cost : Ksh "+FinalCost);
            DiscountLabel.setText("Discount : Ksh "+discount);
           
       }
    public void editLabel(){
       ImageIcon icon = new ImageIcon("Images\\Asset 2.png");
       jLabel6.setIcon(icon);
   }
    
    public static void main(String args[]){
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PurchasingForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JRadioButton Bloomer;
    private javax.swing.JSpinner BloomerSpinner;
    private javax.swing.JLabel Bloomerlabel;
    private javax.swing.JLabel DiscountLabel;
    private javax.swing.JLabel FCostlabel;
    private javax.swing.JSpinner GSpinner;
    private javax.swing.JRadioButton Gameshort;
    private javax.swing.JLabel Gameshortlabel;
    private javax.swing.JRadioButton HockeyStick;
    private javax.swing.JSpinner HockeyStickSpinner;
    private javax.swing.JLabel Hockeysticklabel;
    private javax.swing.JRadioButton Socks;
    private javax.swing.JSpinner SocksSpinner;
    private javax.swing.JLabel Sockslabel;
    private javax.swing.JRadioButton SportShoes;
    private javax.swing.JSpinner SportshoesSpinner;
    private javax.swing.JLabel TCLabel;
    private javax.swing.JRadioButton TShirt;
    private javax.swing.JSpinner TShirtSpinner;
    private javax.swing.JRadioButton TrackSuit;
    private javax.swing.JSpinner TracksuitSpinner;
    private javax.swing.JLabel Tracksuitlabel;
    private javax.swing.JLabel Tshirtlabel;
    private javax.swing.JRadioButton Wrapper;
    private javax.swing.JSpinner WrapperSpinner;
    private javax.swing.JLabel Wrapperlabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private java.awt.Label label1;
    private javax.swing.JLabel shoeslabel1;
    // End of variables declaration                   
}

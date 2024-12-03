import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class TerminalClass extends JFrame implements ActionListener{
    
    
    JMenuBar bar ;
    JMenu playermenu ;
    JMenu clerkmenu;
    JMenu patronmenu;
    JMenu managermenu;
    JMenuItem [] playeritems ;
    JMenuItem [] patronitems;
    JMenuItem [] clerkitems;
    JMenuItem [] manageritems;
    JLabel maringolabel;
    JLabel wellabel;
    JLabel sterling_label;
    JLabel shacslabel;
    JLabel omanyalabel;
    JLabel sakalabel;
    
     Random random = new Random();
    
   
    
    
    public TerminalClass(){
        
        ImageIcon icon = new ImageIcon("Images\\sterling-ph.png");
        ImageIcon icon2 = new ImageIcon("Images\\sala-ph.png");
        ImageIcon icon3 = new ImageIcon("Images\\images (1)-ph.png");
        ImageIcon icon4 = new ImageIcon("\\Images\\haaland-ph.png");
        ImageIcon icon5 = new ImageIcon("Images\\mylabel.png");
        ImageIcon icon6 = new ImageIcon("Images\\kip-ph.png");
        ImageIcon icon7 = new ImageIcon("Images\\saika-ph.png");
        ImageIcon icon8 = new ImageIcon("Images\\games2-ph.png");
        
        
        sterling_label = new JLabel();
        sterling_label.setBounds(220,450,220,350);
        sterling_label.setIconTextGap(0);
        sterling_label.setBackground(Color.red);
        sterling_label.setIcon(icon);
        
        shacslabel = new JLabel();
        shacslabel.setBounds(420,500, 250, 250);
        shacslabel.setBackground(Color.red);
       shacslabel.setIcon(icon4);
        
        omanyalabel = new JLabel();
        omanyalabel.setBounds(680,520,250,250);
        omanyalabel.setBackground(Color.red);
        omanyalabel.setIcon(icon2);
                
       JLabel mylabel= new JLabel();
        mylabel.setBounds(850,500,300,250);
        mylabel.setBackground(Color.red);
        mylabel.setIcon(icon5);
        
        
        JLabel kiplabel= new JLabel();
        kiplabel.setBounds(1100,500,300,250);
        kiplabel.setBackground(Color.red);
        kiplabel.setIcon(icon6);
        
       
        JLabel saikalabel= new JLabel();
        saikalabel.setBounds(5,500,300,250);
        saikalabel.setBackground(Color.red);
        saikalabel.setIcon(icon7);
        
         JLabel gameslabel= new JLabel();
        gameslabel.setBounds(580,200,500,350);
        gameslabel.setBackground(Color.red);
        gameslabel.setIcon(icon8);
        
        
        
        maringolabel = new JLabel("MARINGO SPORTS CLUB SYSTEM");
        maringolabel.setBounds(400, 70, 550, 100);
        maringolabel.setFont(new Font("Algerian",Font.BOLD,35));
        maringolabel.setForeground(Color.yellow);
        
        wellabel = new JLabel("WELCOME TO - - -");
        wellabel.setFont(new Font("Algerian",Font.BOLD,25));
        wellabel.setBounds(500, 20, 400, 100);
        wellabel.setForeground(Color.red);
        
        
        
        playeritems = new JMenuItem[2];
        playeritems[0]= new JMenuItem("View My Details");
        playeritems[0].addActionListener(this);
        playeritems[1]= new JMenuItem("Purchase Items");
        playeritems[1].addActionListener(this);
        
        patronitems = new JMenuItem[3];
        patronitems[0]= new JMenuItem("Log in");
        patronitems[0].addActionListener(this);
        patronitems[1]= new JMenuItem("Facilitate External Game");
        patronitems[1].addActionListener(this);
        
        clerkitems = new JMenuItem[4];
        clerkitems[0] = new JMenuItem("View Player Details");
        clerkitems[0].addActionListener(this);
        clerkitems[1] = new JMenuItem("View Store Items");
        clerkitems[1].addActionListener(this);
        clerkitems[2] = new JMenuItem("Edit Players Details");
        clerkitems[2].addActionListener(this);
        clerkitems[3] = new JMenuItem("Make an Order");
        clerkitems[3].addActionListener(this);
        
        manageritems = new JMenuItem[6];
        manageritems[0]=new JMenuItem("View Facilitation Details");
        manageritems[1]=new JMenuItem("View Player Details");
        manageritems[2]=new JMenuItem("View Revenue Details");
        manageritems[3]=new JMenuItem("View Expense Details");
        manageritems[4]=new JMenuItem("Process Order");
        manageritems[5]=new JMenuItem("View Total Company Revenue");
        
        playermenu = new JMenu("Player");
        playermenu.setForeground(Color.green);
        playermenu.add(playeritems[0]);
        playermenu.add(new JSeparator());
        playermenu.add(playeritems[1]);
        
        
        
        
        
        
        clerkmenu = new JMenu("Clerk");
        clerkmenu.setForeground(Color.green);
        for(int i=0; i<4;i++){
            clerkmenu.add(clerkitems[i]);
            clerkitems[i].addActionListener(this);
            clerkmenu.add(new JSeparator());
        }
        
        patronmenu = new JMenu("Patron");
        patronmenu.setForeground(Color.green);
        patronmenu.add(patronitems[0]);
        patronmenu.add(new JSeparator());
        patronmenu.add(patronitems[1]);
        
        managermenu = new JMenu("Manager");
        managermenu.setForeground(Color.green);
        for(int i = 0; i<6;i++){
            managermenu.add(manageritems[i]);
            manageritems[i].addActionListener(this);
            managermenu.add(new JSeparator());
        }
        
        
         bar = new JMenuBar();
         bar.add(managermenu);
         bar.add(clerkmenu);
         bar.add(patronmenu);
         bar.add(playermenu);
         bar.setBackground(Color.BLUE);
         bar.setBounds(0,0,5000,30);
        
        
        
        
        
   
        
        
        
        
        
        add(bar);
       
        add(maringolabel);
        add(wellabel);
        add(sterling_label);
        add(shacslabel);
        add(omanyalabel);
        add(mylabel);
        add(kiplabel);
        add(saikalabel);
        add(gameslabel);
        setTitle("MARINGO SPORTS CLUB COMPUTERIZED SYSTEM");
        setSize(1510,800);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        getContentPane().setBackground(Color.black);
        setLocationRelativeTo(null);
        //setExtendedState(MAXIMIZED_BOTH);
        setLayout(null);
       
        setVisible(true);
        setIconImage(icon8.getImage());
       
        
       
       
        
        
    
    
        
        
    }

    
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand()=="View My Details")
        {
           new Log_In_Form().show();
        }else if(e.getActionCommand()=="Purchase Items"){
            new Log_In_Form().show();
        }else if(e.getActionCommand()=="Log in"){
            new PatronLogin().show();
        }else if(e.getActionCommand()=="Facilitate External Game"){
           new PatronLogin().show();
        }else if(e.getActionCommand()=="View Player Details"){
          new ClerkLogin().show();
        }else if(e.getActionCommand()=="View Store Items"){
            new ClerkLogin().show();
        }else if(e.getActionCommand()=="Edit Players Details"){
            new ClerkLogin().show();
        }else if(e.getActionCommand()=="Make an Order"){
            new ClerkLogin().show();
        }else if(e.getActionCommand()=="View Facilitation Details"){
           new AdminLogin().show();
        }else if(e.getActionCommand()=="View Player Details"){
           new AdminLogin().show();
        }else if(e.getActionCommand()=="View Revenue Details"){
        new AdminLogin().show();
        }else if(e.getActionCommand()=="View Expense Details"){
       new AdminLogin().show();
       }else if(e.getActionCommand()=="Process Order"){
        new AdminLogin().show();
       }else if(e.getActionCommand()=="View Total Company Revenue"){
        new AdminLogin().show();
    }
        
    }
    
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TerminalClass().setVisible(true);
            }
        });
    }
    
    
            
        
    }
    
    
    


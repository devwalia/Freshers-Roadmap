import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Test extends JFrame implements ActionListener {

    JButton jb1,jb2,jb3,jb4;
    JLabel l1,l2;

    Test() {

        l1 = new JLabel("STUDENTS ROADMAP");
        l1.setBounds(100, 10, 300, 50);
        l1.setFont(new Font("Serif", Font.PLAIN, 23));
        l1.setForeground(Color.green);

        add(l1);
            l2 = new JLabel("PLEASE SELECT YOUR AREA OF INTEREST!!");
        l2.setBounds(100, 50, 300, 50);
        l2.setFont(new Font("Serif", Font.PLAIN, 14));
        l2.setForeground(Color.green);

        add(l2);

        jb1 = new JButton("MACHINE LEARNING");
         jb2 = new JButton("WEB DEVLOPMENT");
          jb3 = new JButton("APP DEVLOPMENT");
           jb4 = new JButton("BLOCKCHAIN");
        jb1.setBounds(50, 110, 300, 50);
        add(jb1);
        
        jb2.setBounds(50, 170, 300, 50);
        add(jb2);
        
        jb3.setBounds(50, 240, 300, 50);
        add(jb3);
        
        jb4.setBounds(50, 300, 300, 50);
        add(jb4);

        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);

        setLayout(null);
        setSize(600, 500);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(jb1)) {
            this.dispose();
            Hello h = new Hello();
            h.setVisible(true);

        }
        
         if (e.getSource().equals(jb2)) {
            this.dispose();
            web hh = new web();
            hh.setVisible(true);

        }
          if (e.getSource().equals(jb3)) {
            this.dispose();
            app hhh = new app();
            hhh.setVisible(true);

        }
           if (e.getSource().equals(jb4)) {
            this.dispose();
            chain hhh = new chain();
            hhh.setVisible(true);

        }
    }

    public static void main(String args[]) {
        Test t = new Test();
        t.setSize(600,500);
        t.setVisible(true);
        t.getContentPane().setBackground(Color.black);
    
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}



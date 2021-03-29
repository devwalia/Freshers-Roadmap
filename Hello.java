import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.ImageIcon.*;



class Hello extends JFrame implements ActionListener{

    JButton jb1;
    JLabel l1,l2;

    Hello() {

        ImageIcon icon = new ImageIcon("machinelearning.png");
        JLabel label = new JLabel(icon);
        label.setBounds(100, 10, 300, 50);
        add(label);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

        jb1 = new JButton("Back");
        jb1.setBounds(50, 400, 200, 50);
        add(jb1);
        jb1.addActionListener(this);

         

        l1 = new JLabel("ML");
        l1.setBounds(30, 50, 300, 50);
        l1.setFont(new Font("Serif", Font.PLAIN, 24));
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setForeground(Color.green);

        add(l1);
        
        setLayout(null);
        setSize(600, 500);
        setVisible(true);
        getContentPane().setBackground(Color.black);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(jb1)) {
            this.dispose();
            Test t = new Test();
            t.setVisible(true);
            t.getContentPane().setBackground(Color.black);}

        
		      
      
	}
}

        

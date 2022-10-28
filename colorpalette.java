package project_24;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
public class colorpalette {

    public static void main(String[] args) {
       new griddemo();
    }
   
}
class griddemo
{
    JFrame f;
    JButton b,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;
    griddemo()
    {
        //JLabel l1=new JLabel("BACK GROUND");
        //l1.setBounds(5,5,15,15);
        //f.add(l1);
        f = new JFrame("");
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(400,400);
        b=new JButton("Java programs");
        f.add(b);
                
        b1=new JButton("");
         b1.setBackground(Color.red);
        f.add(b1);
        b2=new JButton("");
        b2.setBackground(Color.blue);
        f.add(b2);
        b3=new JButton("");
         b3.setBackground(Color.green);
        f.add(b3);
        b4=new JButton("");
         b4.setBackground(Color.black);
        f.add(b4);
        b5=new JButton("");
         b5.setBackground(Color.yellow);
        f.add(b5);
        b6=new JButton("");
         b6.setBackground(Color.orange);
        f.add(b6);
        b.setBounds(150,150,200,100);
        b1.setBounds(10,50,15,15);
        b2.setBounds(25,50,15,15);
        b3.setBounds(40,50,15,15);
        b4.setBounds(55,50,15,15);
        b5.setBounds(70,50,15,15);
        b6.setBounds(85,50,15,15);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.getContentPane().setBackground(Color.red);
            }});
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.getContentPane().setBackground(Color.blue);
            }});
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.getContentPane().setBackground(Color.green);
            }});
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.getContentPane().setBackground(Color.black);
            }});
        b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.getContentPane().setBackground(Color.yellow);
            }});
        b6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.getContentPane().setBackground(Color.orange);
            }});
       
       
       
       
       
        b7=new JButton("");
         b7.setBackground(Color.red);
        f.add(b7);
        b8=new JButton("");
        b8.setBackground(Color.blue);
        f.add(b8);
        b9=new JButton("");
         b9.setBackground(Color.green);
        f.add(b9);
        b10=new JButton("");
         b10.setBackground(Color.black);
        f.add(b10);
        b11=new JButton("");
         b11.setBackground(Color.yellow);
        f.add(b11);
        b12=new JButton("");
         b12.setBackground(Color.orange);
        f.add(b12);
        b7.setBounds(2100,500,150,150);
        b8.setBounds(2250,500,150,150);
        b9.setBounds(2400,500,150,150);
        b10.setBounds(2550,500,150,150);
        b11.setBounds(2700,500,150,150);
        b12.setBounds(2850,500,150,150);
       
       
       
       
        b7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               b.setBackground(Color.red);
            }});
        b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                b.setBackground(Color.blue);
            }});
        b9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                b.setBackground(Color.green);
            }});
        b10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                b.setBackground(Color.black);
            }});
        b11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                b.setBackground(Color.yellow);
            }});
        b12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                b.setBackground(Color.orange);
            }});
      
       
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
       
       
       
    }
}



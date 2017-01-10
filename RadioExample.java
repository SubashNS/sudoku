package sudoku;
import javax.swing.*;  
import java.awt.event.*;  
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;


class RadioExample extends JFrame implements ActionListener{
JRadioButton rb1,rb2,rb3,rb4,rb5,rb6,rb7,rb8,rb9,rb10,rbh1,rbh2,rbh3,rbh4,rbh5,rbh6,rbh7,rbh8,rbh9,rbh10,rbe1,rbe2,rbe3,rbe4,rbe5,rbe6,rbe7,rbe8,rbe9,rbe10;  
JButton b;  
RadioExample(){  
	
// This section is for making RadioButtons for Easy Puzzles
	
rb1=new JRadioButton("Easy 1");  
rb1.setBounds(150,50,100,30);  
rb2=new JRadioButton("Easy 2");  
rb2.setBounds(150,80,100,30);  
rb3=new JRadioButton("Easy 3");  
rb3.setBounds(150,110,100,30);  
rb4=new JRadioButton("Easy 4");  
rb4.setBounds(150,140,100,30);  
rb5=new JRadioButton("Easy 5");  
rb5.setBounds(150,170,100,30);  
rb6=new JRadioButton("Easy 6");  
rb6.setBounds(150,200,100,30);  
rb7=new JRadioButton("Easy 7");  
rb7.setBounds(150,230,100,30);  
rb8=new JRadioButton("Easy 8");  
rb8.setBounds(150,260,100,30);  
rb9=new JRadioButton("Easy 9");  
rb9.setBounds(150,290,100,30);  
rb10=new JRadioButton("Easy 10");  
rb10.setBounds(150,320,100,30);  


//This section is for making RadioButtons for Hard Puzzles

rbh1=new JRadioButton("Hard 1");  
rbh1.setBounds(350,50,100,30);  
rbh2=new JRadioButton("Hard 2");  
rbh2.setBounds(350,80,100,30);  
rbh3=new JRadioButton("Hard 3");  
rbh3.setBounds(350,110,100,30);  
rbh4=new JRadioButton("Hard 4");  
rbh4.setBounds(350,140,100,30);  
rbh5=new JRadioButton("Hard 5");  
rbh5.setBounds(350,170,100,30);  
rbh6=new JRadioButton("Hard 6");  
rbh6.setBounds(350,200,100,30);  
rbh7=new JRadioButton("Hard 7");  
rbh7.setBounds(350,230,100,30);  
rbh8=new JRadioButton("Hard 8");  
rbh8.setBounds(350,260,100,30);  
rbh9=new JRadioButton("Hard 9");  
rbh9.setBounds(350,290,100,30);  
rbh10=new JRadioButton("Hard 10");  
rbh10.setBounds(350,320,100,30);  



rbe1=new JRadioButton("Extreme 1");  
rbe1.setBounds(550,50,100,30);  
rbe2=new JRadioButton("Extreme 2");  
rbe2.setBounds(550,80,100,30);  
rbe3=new JRadioButton("Extreme 3");  
rbe3.setBounds(550,110,100,30);  
rbe4=new JRadioButton("Extreme 4");  
rbe4.setBounds(550,140,100,30);  
rbe5=new JRadioButton("Extreme 5");  
rbe5.setBounds(550,170,100,30);  
rbe6=new JRadioButton("Extreme 6");  
rbe6.setBounds(550,200,100,30);  
rbe7=new JRadioButton("Extreme 7");  
rbe7.setBounds(550,230,100,30);  
rbe8=new JRadioButton("Extreme 8");  
rbe8.setBounds(550,260,100,30);  
rbe9=new JRadioButton("Extreme 9");  
rbe9.setBounds(550,290,100,30);  
rbe10=new JRadioButton("Extreme 10");  
rbe10.setBounds(550,320,100,30);  

ButtonGroup bg=new ButtonGroup();  
bg.add(rb1);
bg.add(rb2);
bg.add(rb3);
bg.add(rb4);
bg.add(rb5);
bg.add(rb6);
bg.add(rb7);
bg.add(rb8);
bg.add(rb9);
bg.add(rb10);

bg.add(rbh1);
bg.add(rbh2);
bg.add(rbh3);
bg.add(rbh4);
bg.add(rbh5);
bg.add(rbh6);
bg.add(rbh7);
bg.add(rbh8);
bg.add(rbh9);
bg.add(rbh10);

bg.add(rbe1);
bg.add(rbe2);
bg.add(rbe3);
bg.add(rbe4);
bg.add(rbe5);
bg.add(rbe6);
bg.add(rbe7);
bg.add(rbe8);
bg.add(rbe9);
bg.add(rbe10);

JButton b=new JButton("OK");  
JButton b2=new JButton("HELP!");
b.setBounds(350,370,80,30);  
b.addActionListener(this);
b.setActionCommand("Button1");
b2.setBounds(340, 450, 100, 30);
b2.addActionListener(this);
b2.setActionCommand("HELP");

add(rb1);
add(rb2);
add(rb3);
add(rb4);
add(rb5);
add(rb6);
add(rb7);
add(rb8);
add(rb9);
add(rb10);

add(rbh1);
add(rbh2);
add(rbh3);
add(rbh4);
add(rbh5);
add(rbh6);
add(rbh7);
add(rbh8);
add(rbh9);
add(rbh10);


add(rbe1);
add(rbe2);
add(rbe3);
add(rbe4);
add(rbe5);
add(rbe6);
add(rbe7);
add(rbe8);
add(rbe9);
add(rbe10);

add(b);  
add(b2);
setSize(800,600);  
setLayout(null);  
setVisible(true);  
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
setTitle("Sudoku 1.0");

//JOptionPane.showMessageDialog(null, "Welcome To Sudoku 1.0 ! If this is your first time, Then Please Read the Instreuctions !","Message", JOptionPane.ERROR_MESSAGE);

}  
public void actionPerformed(ActionEvent e){  
if(e.getActionCommand()=="Button1"){

	if(rb1.isSelected()){  
	Sudoku2 s = new Sudoku2(1);
	}  
	if(rb2.isSelected()){  
	Sudoku2 s = new Sudoku2(2);
	}}
	else {
//JOptionPane.showMessageDialog(null, "Welcome To Sudoku 1.0 ! If this is your first time, Then Please Read the Instreuctions !","Message", JOptionPane.ERROR_MESSAGE);

		TabsHere b = new TabsHere();
	
		
		
		
		
		

	    }
}





public static void main(String args[]){  
	
new RadioExample();
}}  
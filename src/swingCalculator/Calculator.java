package swingCalculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
	boolean isOperatedClicked=false;
	
	int choice = 0;
	float oldvalueF;
	float newvalueF;
	float Result;
	
	String oldvalue;
	String newvalue;
	JFrame jf;
	JLabel displaylabel;
	JButton sevenbutton;
	JButton eightbutton;
	JButton NInebutton;
	JButton fourbutton;
	JButton fivetbutton;
	JButton sixbutton;
	JButton onebutton;
	JButton twobutton;
	JButton threebutton;
	JButton dotbutton;
	JButton zerobutton;
	JButton equaltbutton;
	JButton Divisionbutton;
	JButton Multiplebutton;
	JButton Substractionbutton;
	JButton Additionnbutton,ClearButton;
	public Calculator() {
		
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(300,150);
		
		displaylabel=new JLabel();
		displaylabel.setBounds(30,50,540,40);
		displaylabel.setBackground(Color.gray);
		displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displaylabel.setForeground(Color.white);
		displaylabel.setOpaque(true);
		jf.add(displaylabel);
		
		sevenbutton=new JButton("7");
		sevenbutton.setBounds(30,130,80,80);
		sevenbutton.setFont(new Font("Arial", Font.PLAIN, 40));
		sevenbutton.addActionListener(this);
		jf.add(sevenbutton);
		
		
		eightbutton=new JButton("8");
		eightbutton.setBounds(130,130,80,80);
		eightbutton.setFont(new Font("Arial", Font.PLAIN, 40));
		eightbutton.addActionListener(this);
		jf.add(eightbutton);
		
		NInebutton=new JButton("9");
		NInebutton.setBounds(230,130,80,80);
		NInebutton.setFont(new Font("Arial", Font.PLAIN, 40));
		NInebutton.addActionListener(this);
		jf.add(NInebutton);
		
		
		fourbutton=new JButton("4");
		fourbutton.setBounds(30,230,80,80);
		fourbutton.setFont(new Font("Arial", Font.PLAIN, 40));
		fourbutton.addActionListener(this);
		jf.add(fourbutton);
		
		
		fivetbutton=new JButton("5");
		fivetbutton.setBounds(130,230,80,80);
		fivetbutton.setFont(new Font("Arial", Font.PLAIN, 40));
		fivetbutton.addActionListener(this);
		jf.add(fivetbutton);
		
		sixbutton=new JButton("6");
		sixbutton.setBounds(230,230,80,80);
		sixbutton.setFont(new Font("Arial", Font.PLAIN, 40));
		sixbutton.addActionListener(this);
		jf.add(sixbutton);
		
		
		onebutton=new JButton("1");
		onebutton.setBounds(30,330,80,80);
		onebutton.setFont(new Font("Arial", Font.PLAIN, 40));
		onebutton.addActionListener(this);
		jf.add(onebutton);
		
		
		twobutton=new JButton("2");
		twobutton.setBounds(130,330,80,80);
		twobutton.setFont(new Font("Arial", Font.PLAIN, 40));
		twobutton.addActionListener(this);
		jf.add(twobutton);
		
		threebutton=new JButton("3");
		threebutton.setBounds(230,330,80,80);
		threebutton.setFont(new Font("Arial", Font.PLAIN, 40));
		threebutton.addActionListener(this);
		jf.add(threebutton);
		
		
		dotbutton=new JButton(".");
		dotbutton.setBounds(30,430,80,80);
		dotbutton.setFont(new Font("Arial", Font.PLAIN, 40));
		dotbutton.addActionListener(this);
		jf.add(dotbutton);
		
		zerobutton=new JButton("0");
		zerobutton.setBounds(130,430,80,80);
		zerobutton.setFont(new Font("Arial", Font.PLAIN, 40));
		zerobutton.addActionListener(this);
		jf.add(zerobutton);
		
		
		equaltbutton=new JButton("=");
		equaltbutton.setBounds(230,430,80,80);
		equaltbutton.setFont(new Font("Arial", Font.PLAIN, 40));
		equaltbutton.addActionListener(this);
		jf.add(equaltbutton);
		
		Divisionbutton=new JButton("/");
		Divisionbutton.setBounds(330,130,80,80);
		Divisionbutton.setFont(new Font("Arial", Font.PLAIN, 40));
		Divisionbutton.addActionListener(this);
		jf.add(Divisionbutton);
		
		
		Multiplebutton=new JButton("x");
		Multiplebutton.setBounds(330,230,80,80);
		Multiplebutton.setFont(new Font("Arial", Font.PLAIN, 40));
		Multiplebutton.addActionListener(this);
		jf.add(Multiplebutton);
		
		
		Substractionbutton=new JButton("-");
		Substractionbutton.setBounds(330,330,80,80);
		Substractionbutton.setFont(new Font("Arial", Font.PLAIN, 40));
		Substractionbutton.addActionListener(this);
		jf.add(Substractionbutton);
		
		
		Additionnbutton=new JButton("+");
		Additionnbutton.setBounds(330,430,80,80);
		Additionnbutton.setFont(new Font("Arial", Font.PLAIN, 40));
		Additionnbutton.addActionListener(this);
		jf.add(Additionnbutton);
		
		ClearButton=new JButton("Clear");
		ClearButton.setBounds(430,430,80,80);
		ClearButton.setFont(new Font("Arial", Font.PLAIN, 12));
		ClearButton.addActionListener(this);
		jf.add(ClearButton);
		
		
		
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== sevenbutton) {
			if(isOperatedClicked) {
				displaylabel.setText("7");
				isOperatedClicked=false;
			}else{
				displaylabel.setText(displaylabel.getText()+"7");
			}}
		
		else if(e.getSource()== eightbutton) {
			if(isOperatedClicked) {
				displaylabel.setText("8");
				isOperatedClicked=false;
			}else{
				displaylabel.setText(displaylabel.getText()+"8");
			}
		}
		else if(e.getSource()== NInebutton) {
			if(isOperatedClicked) {
				displaylabel.setText("9");
				isOperatedClicked=false;
			}else{
				displaylabel.setText(displaylabel.getText()+"9");
			}}
		else if(e.getSource()== fourbutton) {
			if(isOperatedClicked) {
				displaylabel.setText("4");
				isOperatedClicked=false;
			}else{
				displaylabel.setText(displaylabel.getText()+"4");
			}
		}
		else if(e.getSource()== fivetbutton) {
			if(isOperatedClicked) {
				displaylabel.setText("5");
				isOperatedClicked=false;
			}else{
				displaylabel.setText(displaylabel.getText()+"5");
			}
		}
		else if(e.getSource()== sixbutton) {
			if(isOperatedClicked) {
				displaylabel.setText("6");
				isOperatedClicked=false;
			}else{
				displaylabel.setText(displaylabel.getText()+"6");
			}
		}
		else if(e.getSource()== onebutton) {
			if(isOperatedClicked) {
				displaylabel.setText("1");
				isOperatedClicked=false;
			}else{
				displaylabel.setText(displaylabel.getText()+"1");
			}
		}
		else if(e.getSource()== twobutton){
			if(isOperatedClicked) {
				displaylabel.setText("2");
				isOperatedClicked=false;
			}else{
				displaylabel.setText(displaylabel.getText()+"2");
			}
			}
		else if(e.getSource()== threebutton) {
			if(isOperatedClicked) {
				displaylabel.setText("3");
				isOperatedClicked=false;
			}else{
				displaylabel.setText(displaylabel.getText()+"3");
			}
		}
		else if(e.getSource()== dotbutton) {
			if(isOperatedClicked) {
				displaylabel.setText(".");
				isOperatedClicked=false;
			}else{
				displaylabel.setText(displaylabel.getText()+".");
			}
		}
		else if(e.getSource()== zerobutton) {
			if(isOperatedClicked) {
				displaylabel.setText("0");
				isOperatedClicked=false;
			}else{
				displaylabel.setText(displaylabel.getText()+"0");
			}
		}
		
		else if(e.getSource()== Divisionbutton) {
			result();
			isOperatedClicked=true;
			choice=4;
			oldvalue=displaylabel.getText();
			displaylabel.setText("/");
		}
		else if (e.getSource()== Multiplebutton){
			result();
			isOperatedClicked=true;
			choice=3;
			oldvalue=displaylabel.getText();
			displaylabel.setText("x");
		}
		else if (e.getSource()== Substractionbutton) {
			result();
			isOperatedClicked=true;
			choice=1;
			oldvalue=displaylabel.getText();
			displaylabel.setText("-");
		}
		else if (e.getSource()== Additionnbutton) {
			result();
			isOperatedClicked=true;
			choice=2;
			oldvalue=displaylabel.getText();
			displaylabel.setText("+");
		}
		else if(e.getSource()== equaltbutton) {
			result();}
			
		else if (e.getSource()== ClearButton) {
			displaylabel.setText("");
		}
		
		
		//displaylabel.setText("7");
		//jf.getContentPane().setBackground(Color.blue);
		
	}




 void result() {
	 switch(choice){
		
		case 1:newvalue= displaylabel.getText();
		oldvalueF=Float.parseFloat(oldvalue);
		newvalueF=Float.parseFloat(newvalue);
		Result=oldvalueF-newvalueF;
		displaylabel.setText(Result+"");
		choice=0;break;
		
		case 2:newvalue= displaylabel.getText();
		oldvalueF=Float.parseFloat(oldvalue);
		newvalueF=Float.parseFloat(newvalue);
		Result=oldvalueF+newvalueF;
		displaylabel.setText(Result+"");
		choice=0;break;
		
		case 3:newvalue= displaylabel.getText();
		oldvalueF=Float.parseFloat(oldvalue);
		newvalueF=Float.parseFloat(newvalue);
		Result=oldvalueF*newvalueF;
		displaylabel.setText(Result+"");
		choice=0;break;
		
		case 4:newvalue= displaylabel.getText();
		oldvalueF=Float.parseFloat(oldvalue);
		newvalueF=Float.parseFloat(newvalue);
		Result=oldvalueF/newvalueF;
		displaylabel.setText(Result+"");
		choice=0;break;
	}
}
 }


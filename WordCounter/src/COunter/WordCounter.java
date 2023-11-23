package COunter;

import javax.swing.*;
import java.awt.event.*;
import java.util.Iterator;
import java.awt.Font;

public class WordCounter {

	public static void main(String[] args) {
		JFrame f = new JFrame("Character Count");
		JLabel l1, l2, l3, l4;
		JTextArea text;
		JButton submit, clear;

		text = new JTextArea("");
		submit = new JButton("SUBMIT");
		clear = new JButton("CLEAR");

		l1 = new JLabel("Enter your String here:-  ");
		l2 = new JLabel("Character with WhiteSpaces:- ");
		l3 = new JLabel("Character without whitespaces:- ");
		l4 = new JLabel("Words:- ");

		Font txtFont = new Font(Font.SERIF, Font.PLAIN, 18);
		text.setFont(txtFont);
		l1.setFont(txtFont);
		l2.setFont(txtFont);
		l3.setFont(txtFont);
		l4.setFont(txtFont);

		l1.setBounds(10, 25, 200, 30);
		text.setBounds(18, 60, 450, 300);
		l2.setBounds(10, 370, 400, 30);
		l3.setBounds(10, 400, 400, 30);
		l4.setBounds(10, 430, 400, 30);
		submit.setBounds(100, 470, 100, 50);
		clear.setBounds(275, 470, 100, 50);

		text.setLineWrap(true);
		text.setWrapStyleWord(true);

		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String str = text.getText().strip();
				int count = 0;
				int word = 0;

				for (int i = 0; i < str.length(); i++) {
					if (str.charAt(i) !=' ') {
						count++;
					}
					else {
						word++;
					}
				}

				l2.setText("Character with WhiteSpaces:  " + str.length());
				l3.setText("Character without WhiteSpaces: " + count);
				l4.setText("Total number of words is equal to " + (word + 1));

			}
		});
		clear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				l2.setText("Character with WhiteSpaces:  ");
				l3.setText("Character without WhiteSpaces: ");
				l4.setText("Total number of words is equal to: ");
				
			}
			
		});
		f.add(l1);
		f.add(text);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(submit);
		f.add(clear);
		
		f.setSize(500,570);
		f.setResizable(true);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	


}

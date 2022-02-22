package gui_Solve_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Encrypting_Decrypting_10 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	JLabel OUTPUT = new JLabel("");
	JLabel OUTPUT_ = new JLabel("");
	static String str,Newstr=" ";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Encrypting_Decrypting_10 frame = new Encrypting_Decrypting_10();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Encrypting_Decrypting_10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 766, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("ENTER STTRING");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel.setBounds(10, 25, 213, 66);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField.setBounds(233, 25, 378, 66);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("ENCRYPT");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{	
				Encryption();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton.setBounds(621, 21, 119, 70);
		contentPane.add(btnNewButton);

		OUTPUT.setHorizontalAlignment(SwingConstants.CENTER);
		OUTPUT.setBounds(20, 100, 701, 188);
		contentPane.add(OUTPUT);

		OUTPUT_.setHorizontalAlignment(SwingConstants.CENTER);
		OUTPUT_.setFont(new Font("Times New Roman", Font.BOLD, 19));
		OUTPUT_.setBounds(10, 346, 601, 66);
		contentPane.add(OUTPUT_);

		JButton btnDecrypt = new JButton("DECRYPT");
		btnDecrypt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				Decryption();
			}
		});
		btnDecrypt.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnDecrypt.setBounds(621, 342, 119, 70);
		contentPane.add(btnDecrypt);
	}
	public void Encryption() 
	{
		  
		str=textField.getText();  
		Newstr = "";
		for (int i=0;i<str.length();i++)  
        {  
            char ch=Character.toLowerCase(str.charAt(i));  
            switch (ch)  
            {  
                case 'a':  
                    Newstr=Newstr+"{";  
                    break;  
                case 'b':  
                    Newstr=Newstr+"}";  
                    break;  
                case 'c':  
                    Newstr=Newstr+"#";  
                    break;  
                case 'd':  
                    Newstr=Newstr+"~";  
                    break;  
                case 'e':  
                    Newstr=Newstr+"+";  
                    break;  
                case 'f':  
                    Newstr=Newstr+"-";  
                    break;  
                case 'g':  
                    Newstr=Newstr+"*";  
                    break;  
                case 'h':  
                    Newstr=Newstr+"@";  
                    break;  
                case 'i':  
                    Newstr=Newstr+"/";  
                    break;  
                case 'j':  
                    Newstr=Newstr+"\\";  
                    break;  
                case 'k':  
                    Newstr=Newstr+"?";  
                    break;  
                case 'l':  
                    Newstr=Newstr+"$";  
                    break;  
                case 'm':  
                    Newstr=Newstr+"!";  
                    break;  
                case 'n':  
                    Newstr=Newstr+"^";  
                    break;  
                case 'o':  
                    Newstr=Newstr+"(";  
                    break;  
                case 'p':  
                    Newstr=Newstr+")";  
                    break;  
                case 'q':  
                    Newstr=Newstr+"<";  
                    break;  
                case 'r':  
                    Newstr=Newstr+">";  
                    break;  
                case 's' :  
                    Newstr=Newstr+"=";  
                    break;  
                case 't':  
                    Newstr=Newstr+";";  
                    break;  
                case 'u':  
                    Newstr=Newstr+",";  
                    break;  
                case 'v' :  
                    Newstr=Newstr+"_";  
                    break;  
                case 'w':  
                    Newstr=Newstr+"[";  
                    break;  
                case 'x' :  
                    Newstr=Newstr+"]";  
                    break;  
                case 'y':  
                    Newstr=Newstr+":";  
                    break;  
                case 'z' :  
                    Newstr=Newstr+"\"";  
                    break;  
                case ' ' :  
                    Newstr=Newstr+" ";  
                    break;  
                case '.':  
                    Newstr=Newstr+'3';  
                    break;  
                case ',':  
                    Newstr=Newstr+"1";  
                    break;  
                case '(':  
                    Newstr=Newstr+'4';  
                    break;  
                case '\"':  
                    Newstr=Newstr+'5';  
                    break;  
                case ')' :  
                    Newstr=Newstr+"7";  
                    break;  
                case '?' :  
                    Newstr= Newstr+"2";  
                    break;  
                case '!':  
                    Newstr= Newstr+"8";  
                    break;  
                case '-' :  
                    Newstr= Newstr+"6";  
                    break;  
                case '%' :  
                    Newstr = Newstr+"9";  
                    break;  
                case '1':  
                    Newstr=Newstr+"r";  
                    break;  
                case '2':  
                    Newstr=Newstr+"k";  
                    break;  
                case '3':  
                    Newstr=Newstr+"b";  
                    break;  
                case '4':  
                    Newstr = Newstr+"e";  
                    break;  
                case '5':  
                    Newstr = Newstr+"q";  
                    break;  
                case '6':  
                    Newstr = Newstr+"h";  
                    break;  
                case '7':  
                    Newstr = Newstr+"u";  
                    break;  
                case '8' :  
                    Newstr= Newstr+"y";  
                    break;  
                case '9':  
                    Newstr = Newstr+"w";  
                    break;  
                case '0':  
                    Newstr = Newstr+"z";  
                    break;  
                 default:  
                    Newstr=Newstr+"0";  
                    break;  
            }  
        }
		System.out.println("The encrypted string is: \n" +Newstr);
		
	}
	public void Decryption()
	{
		str = Newstr;
		Newstr = "";
		for (int i=0;i<str.length();i++)  
        {  
            char ch=Character.toLowerCase(str.charAt(i));  
            switch (ch)  
            {  
                case '{':  
                    Newstr=Newstr+"A";  
                    break;  
                case '}':  
                    Newstr=Newstr+"B";  
                    break;  
                case '#':  
                    Newstr=Newstr+"C";  
                    break;  
                case '~':  
                    Newstr=Newstr+"D";  
                    break;  
                case '+':  
                    Newstr=Newstr+"E";  
                    break;  
                case '-':  
                    Newstr=Newstr+"F";  
                    break;  
                case '*':  
                    Newstr=Newstr+"G";  
                    break;  
                case '@':  
                    Newstr=Newstr+"H";  
                    break;  
                case '/':  
                    Newstr=Newstr+"I";  
                    break;  
                case '\\':  
                    Newstr=Newstr+"J";  
                    break;  
                case '?':  
                    Newstr=Newstr+"K";  
                    break;  
                case '$':  
                    Newstr=Newstr+"L";  
                    break;  
                case '!':  
                    Newstr=Newstr+"M";  
                    break;  
                case '^':  
                    Newstr=Newstr+"N";  
                    break;  
                case '(':  
                    Newstr=Newstr+"O";  
                    break;  
                case ')':  
                    Newstr=Newstr+"P";  
                    break;  
                case '<':  
                    Newstr=Newstr+"Q";  
                    break;  
                case '>':  
                    Newstr=Newstr+"R";  
                    break;  
                case '=' :  
                    Newstr=Newstr+"S";  
                    break;  
                case ';':  
                    Newstr=Newstr+"T";  
                    break;  
                case ',':  
                    Newstr=Newstr+"U";  
                    break;  
                case '_' :  
                    Newstr=Newstr+"V";  
                    break;  
                case '[':  
                    Newstr=Newstr+"W";  
                    break;  
                case ']' :  
                    Newstr=Newstr+"X";  
                    break;  
                case ':':  
                    Newstr=Newstr+"Y";  
                    break;  
                case '\"' :  
                    Newstr=Newstr+"Z";  
                    break;       
                case '1':  
                    Newstr=Newstr+"r";  
                    break;  
                case '2':  
                    Newstr=Newstr+"k";  
                    break;  
                case '3':  
                    Newstr=Newstr+"b";  
                    break;  
                case '4':  
                    Newstr = Newstr+"e";  
                    break;  
                case '5':  
                    Newstr = Newstr+"q";  
                    break;  
                case '6':  
                    Newstr = Newstr+"h";  
                    break;  
                case '7':  
                    Newstr = Newstr+"u";  
                    break;  
                case '8' :  
                    Newstr= Newstr+"y";  
                    break;  
                case '9':  
                    Newstr = Newstr+"w";  
                    break;  
                case '0':  
                    Newstr = Newstr+"z";  
                    break;  
                 default:  
                    Newstr=Newstr+"0";  
                    break;  
            }  
        }
		System.out.println("The encrypted string is: \n" +Newstr);
	}
}
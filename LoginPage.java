import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.text.*;

public class LoginPage extends JFrame
{
	Container c = getContentPane();
	JPanel PBusTypes = new JPanel(null);
	JPanel PLogin = new JPanel(null);
	JPanel PFlightDetails = new JPanel(null);

	public boolean bCheck=true;

	JLabel LFromVaranasi = new JLabel("<html><B>Buses From Varanasi</B></html>");
	JLabel LToVaranasi = new JLabel("<html><B>Buses To Varanasi</B></html>");

	JLabel LUserName, LPassword;

	JLabel LFromVaranasi1 = new JLabel("<html><B>Buses From Varanasi Booking</B></html>");
	JLabel LToVaranasi1 = new JLabel("<html><B>Buses To Varanasi Booking</B></html>");

	JTextField TFUserName;
	JPasswordField TPPassword;

	JButton BLogin;

	final Object[] col1 ={ "From", "To", "Price", "Time" };
	final Object[] col2 = { "From", "To", "Price", "Time" };
	final Object[] col3 = { "From", "To", "Price", "Time" };

	final Object[][] row1 = { { "Varanasi", "Mirzapur", "1312", "16:30" }, { "Varanasi", "Junapur ", "1322", "19:00" }, { "Varanasi", "Delhi", "1242", "08:30" }, { "Varanasi", "Rewa", "1025 ", "09:50" }, { "Varanasi", "Allahabad", "1525", "11:00" }, { "Varanasi", "Kanpur", "1825 ", "05:30" }, { "Varanasi", "Lucknow", "1025 ", "05:30" }, { "Varanasi", "Kannauj", "1725", "12:00" }, { "Varanasi", "Etah", "1175", "19:00" } };
	final Object[][] row2 = { { "Aligarh", "Varanasi", "1485", "06:20" }, { "Khurja", "Varanasi", "1000", "20:45" }, { "Bulandshahr", "Varanasi", "1975", "10:25" }, { "Ghaziabad", "Varanasi", "1500", "16:45" }, { "Bewar", "Varanasi", "1100", "06:30" }, { "Patna", "Varanasi", "2000", "08:15" }, { "Ranchi", "Varanasi", "1500", "06:50" }, { "Mirzapur", "Varanasi", "1312", "16:30" }, { "Junapur", "Varanasi", "1322", "19:00" }, { "Delhi", "Varanasi", "1242", "08:30" }, { "Rewa", "Varanasi", "1025 ", "09:50" }, { "Allahabad", "Varanasi", "1525", "11:00" }, { "Kanpur", "Varanasi", "1825 ", "05:30" }, { "Lucknow", "Varanasi", "1025 ", "05:30" }, { "Kannauj", "Varanasi", "1725", "12:00" }, { "Etah", "Varanasi", "1175", "19:00" }};
	final Object[][] row3 = { { "Varanasi", "Mirzapur", "2375", "16:30" }, { "Varanasi", "Junapur ", "2675", "19:00" }, { "Varanasi", "Delhi", "2275", "08:30" }, { "Varanasi", "Rewa", "2075", "09:50" }, { "Varanasi", "Allahabad", "2575", "11:00" }, { "Varanasi", "Kanpur", "2475", "05:30" }, { "Varanasi", "Lucknow", "2075", "05:30" }, { "Varanasi", "Kannauj", "2175", "12:00" }, { "Varanasi", "Etah", "2175", "19:00" } };
	final Object[][] row4 = { { "Aligarh", "Varanasi", "2485", "06:20" }, { "Khurja", "Varanasi", "2000", "20:45" }, { "Bulandshahr", "Varanasi", "2975", "10:25" }, { "Ghaziabad", "Varanasi", "2500", "16:45" }, { "Bewar", "Varanasi", "2300", "06:30" }, { "Patna", "Varanasi", "2600", "08:15" }, { "Ranchi", "Varanasi", "2500", "06:50" }, { "Mirzapur", "Varanasi", "2375", "16:30" }, { "Junapur", "Varanasi", "2675", "19:00" }, { "Delhi", "Varanasi", "2275", "08:30" }, { "Rewa", "Varanasi", "2075", "09:50" }, { "Allahabad", "Varanasi", "2575", "11:00" }, { "Kanpur", "Varanasi", "2475", "05:30" }, { "Lucknow", "Varanasi", "2075", "05:30" }, { "Kannauj", "Varanasi", "1725", "12:00" }, { "Etah", "Varanasi", "2175", "19:00" }};

	JTable TFromVaranasi = new JTable(row1, col1);
	JTable TToVaranasi = new JTable(row2, col2);
	JTable TFromVaranasi1 = new JTable(row3, col3);
	JTable TToVaranasi1 = new JTable(row4, col2);

	JScrollPane JSP1 = new JScrollPane(TFromVaranasi, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	JScrollPane JSP2 = new JScrollPane(TToVaranasi, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	JScrollPane JSP3 = new JScrollPane(TFromVaranasi1, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	JScrollPane JSP4 = new JScrollPane(TToVaranasi1, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

	Icon img1 = new ImageIcon("img/economic.png");
	Icon img2 = new ImageIcon("img/business.png");
	Icon img3 = new ImageIcon("img/economic1.jpg");
	Icon img4 = new ImageIcon("img/business1.png");

	JLabel LEconomic = new JLabel("Non Ac Seater", img1, SwingConstants.LEFT);
	JLabel LBusiness = new JLabel("Ac Seater", img2, SwingConstants.LEFT);
	JLabel LEconomic1 = new JLabel("Non Ac Seater", img3, SwingConstants.LEFT);
	JLabel LBusiness1 = new JLabel("Ac Seater", img4, SwingConstants.LEFT);

	public LoginPage()
	{
		WindowUtilities.setNativeLookAndFeel();
		setPreferredSize(new Dimension(796,572));

		PBusTypes.setBackground(Color.white);
		PLogin.setBackground(Color.white);
		PFlightDetails.setBackground(Color.white);

		JSP1.setBounds(0, 340, 790, 200);
		JSP2.setBounds(0, 340, 790, 200);
		JSP3.setBounds(0, 340, 790, 200);
		JSP4.setBounds(0, 340, 790, 200);

		PBusTypes.setBounds(0,0,500, 340);
		PLogin.setBounds(500,0,350, 340);
		PFlightDetails.setBounds(0,340,790,200);


		LUserName = new JLabel("         User Name ");
		LPassword = new JLabel("         Password ");
		TFUserName = new JTextField(10);
		TPPassword = new JPasswordField(10);
		BLogin = new JButton("Sign In");

		LUserName.setBounds(40, 100, 100, 21);
		LPassword.setBounds(40, 140, 100, 21);
		TFUserName.setBounds(160, 100, 100, 21);
		TPPassword.setBounds(160, 140, 100, 21);
		BLogin.setBounds(160, 200, 100,25);

		LFromVaranasi1.setBounds(60, 60, 138, 30);
		LToVaranasi1.setBounds(60, 100, 153, 30);

		PLogin.add(LUserName);
		PLogin.add(TFUserName);
		PLogin.add(LPassword);
		PLogin.add(TPPassword);
		PLogin.add(BLogin);

		PFlightDetails.add(JSP1);
		PFlightDetails.add(JSP2);
		PFlightDetails.add(JSP3);
		PFlightDetails.add(JSP4);

		JSP1.setVisible(true);
		JSP2.setVisible(false);
		JSP3.setVisible(false);
		JSP4.setVisible(false);

		LBusiness.setBounds(265, 170, 300, 125);
		LEconomic.setBounds(0, 170, 250, 125);
		LBusiness1.setBounds(280, 200, 135, 60);
		LEconomic1.setBounds(50, 200, 147, 60);

		PBusTypes.add(LEconomic);
		PBusTypes.add(LBusiness);
		PBusTypes.add(LEconomic1);
		PBusTypes.add(LBusiness1);

		LBusiness.setVisible(false);
		LEconomic1.setVisible(false);
		LBusiness1.setVisible(true);
		LEconomic.setVisible(true);


		LFromVaranasi.setBounds(60, 60, 100, 25);
		LToVaranasi.setBounds(60, 100, 120, 25);

		c.add(PBusTypes);
		c.add(PLogin);
		c.add(PFlightDetails);

		PBusTypes.add(LFromVaranasi);
		PBusTypes.add(LToVaranasi);

		pack();
		setVisible(true);

		addWindowListener(new ExitListener());

		LFromVaranasi.addMouseListener(new mouse1(this, true));
		LToVaranasi.addMouseListener(new mouse1(this, false));

		LFromVaranasi1.addMouseListener(new mouse3(this, true));
		LToVaranasi1.addMouseListener(new mouse3(this, false));

		LBusiness1.addMouseListener(new mouse2(this, true));
		LEconomic1.addMouseListener(new mouse2(this, false));

		BLogin.addActionListener(new button1(this));
	}

	public static void main(String args[])
	{
		new LoginPage();
	}
}


class button1 implements ActionListener
{
	LoginPage type;
	char[] cCheck, cPassword={'a','d','m','i','n','\0'};
	JFrame f;
	String sCheck,sCheck1="admin";

	public button1(LoginPage type)
	{
		this.type = type;
	}
	public void actionPerformed(ActionEvent e)
	{
		cCheck=type.TPPassword.getPassword();
		sCheck = type.TFUserName.getText();
		if ((sCheck1.equals(sCheck)) && check())
		{
			type.PLogin.add(type.LFromVaranasi1);
			type.PLogin.add(type.LToVaranasi1);

			type.PLogin.remove(type.LUserName);
			type.PLogin.remove(type.TFUserName);
			type.PLogin.remove(type.LPassword);
			type.PLogin.remove(type.TPPassword);
			type.PLogin.remove(type.BLogin);

			type.c.repaint();
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Invalid username or password. Try again");
		}
	}
	public boolean check()
	{
		if (cCheck.length >= 6 || cCheck.length < 4)
			return false;
		for(int i=0;i<=4;i++)
		{
			if(cCheck[i]!=cPassword[i])
				return false;
		}
		return true;
	}
}

class mouse1 extends MouseAdapter
{
	LoginPage type;
	boolean bCheck;

	public mouse1(LoginPage type, boolean bCheck)
	{
		this.type = type;
		this.bCheck = bCheck;
	}
	public void mouseEntered(MouseEvent e)
	{
		type.LFromVaranasi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		type.LToVaranasi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}
	public void mouseClicked(MouseEvent e)
	{
		if(bCheck)
			type.bCheck = true;
		else
			type.bCheck = false;
		type.LEconomic.setVisible(true);
		type.LBusiness1.setVisible(true);
		type.LEconomic1.setVisible(false);
		type.LBusiness.setVisible(false);

		type.JSP1.setVisible(false);
		type.JSP2.setVisible(false);
		type.JSP3.setVisible(false);
		type.JSP4.setVisible(false);
		if(bCheck)
			type.JSP1.setVisible(true);
		else
			type.JSP2.setVisible(true);
	}
}



class mouse3 extends MouseAdapter
{
	LoginPage type;
	boolean bCheck;

	public mouse3(LoginPage type, boolean bCheck)
	{
		this.type = type;
		this.bCheck = bCheck;
	}
	public void mouseEntered(MouseEvent e)
	{
		type.LFromVaranasi1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		type.LToVaranasi1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}
	public void mouseClicked(MouseEvent e)
	{
		if (bCheck)
			new FromVaranasi(type);
		else
			new ToVaranasi(type);
	}
}


class mouse2 extends MouseAdapter
{
	LoginPage type;
	boolean bCheck;

	public mouse2(LoginPage type, boolean bCheck)
	{
		this.type = type;
		this.bCheck = bCheck;
	}
	public void mouseEntered(MouseEvent e)
	{
		type.LEconomic1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		type.LBusiness1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}
	public void mouseClicked(MouseEvent e)
	{
		if(type.bCheck)
		{
			if (bCheck)
			{
				type.LBusiness1.setVisible(false);
				type.LBusiness.setVisible(true);
				type.LEconomic.setVisible(false);
				type.LEconomic1.setVisible(true);
				type.JSP1.setVisible(false);
				type.JSP2.setVisible(false);
				type.JSP3.setVisible(true);
				type.JSP4.setVisible(false);
			}
			else
			{
				type.LEconomic1.setVisible(false);
				type.LBusiness.setVisible(false);
				type.LBusiness1.setVisible(true);
				type.LEconomic.setVisible(true);
				type.JSP1.setVisible(true);
				type.JSP2.setVisible(false);
				type.JSP3.setVisible(true);
				type.JSP4.setVisible(false);
			}
		}
		else
		{
			if (bCheck)
			{
				type.LBusiness1.setVisible(false);
				type.LBusiness.setVisible(true);
				type.LEconomic.setVisible(false);
				type.LEconomic1.setVisible(true);
				type.JSP1.setVisible(false);
				type.JSP2.setVisible(false);
				type.JSP3.setVisible(false);
				type.JSP4.setVisible(true);
			}
			else
			{
				type.LEconomic1.setVisible(false);
				type.LBusiness.setVisible(false);
				type.LBusiness1.setVisible(true);
				type.LEconomic.setVisible(true);
				type.JSP1.setVisible(false);
				type.JSP2.setVisible(true);
				type.JSP3.setVisible(false);
				type.JSP4.setVisible(false);
			}
		}
	}
}


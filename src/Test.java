		import javax.swing.*;
		import java.sql.*;
		import java.awt.*;
		import java.util.* ;
		import java.io.* ;
		import java.awt.event.*;
		class GUI implements ActionListener
		{
			
			JFrame myFrame; 
			Container c;
			JPanel myPanel,rPanel,addPanel,addTPanel,addOSPanel,sSearDel,tSearDel,searP,delP,searTP,delTP,delOSP,searOSP;
			JPanel sTPanel,sSTPanel,osTPanel,osSTPanel,tTPanel,tSTPanel;
			
			JButton sAdd,tAdd,osAdd,sDel,tDel,osDel,sSear,tSear,osSear, sShow,tShow,osShow, go;
			JTextField line1,line2,line3, sL1,sL2,sL3,sL4,sL5,sL0;
			JButton sHome,tHome,osHome,searHome;
		
		// Labels for adding the data of Student , Teacher and Other Staff
			JLabel sName,sFName,sType, sSection, sAddress, sId, sContact, sFContact, stdYear, studentL,stdRImg;
			JLabel tName, tId, tSubject , tQualification, tContact, tAddress, teacherL,tRImg;
			JLabel osName, osId, osType, osContact, osAddress,osL,osRImg;
			JLabel sIdSD,tIdSD,osIdSD,SibaImg;
			
			JLabel stdR,teacherR,otherSR,stdResR, goL, goL1 ,logo, sYear;
		
			//TextFields for adding the data Student , Teacher and Other Staff
			JTextField sNameT, sFNameT,sTypeT, sSectionT, sAddressT, sIdT, sContactT, sFContactT, sYearT,sLine; 
			JTextField tNameT, tIdT, tSubjectT , tQualificationT, tContactT, tAddressT, tLine;
			JTextField osNameT, osIdT, osTypeT, osContactT, osAddressT, osLine;
			JTextField sIdST,sIdDT,tIdST,tIdDT,osIdST,osIdDT;
			
			JButton resultSubmit, resultReset,sSubmit, sReset,tSubmit,tReset,osSubmit, osReset,sear, del,searT,delT,searOS,delOS;
		
			ImageIcon i = new ImageIcon("F:\\BS-SE\\BSSE-2\\OOP\\FinalProjectOriginal\\back.jpg");
			
			public void draw()
			{
				JFrame myFrame = new JFrame();
				myFrame.setContentPane(new JLabel(i));
				c = myFrame.getContentPane();
				
						searHome = new JButton("Home");
						searHome.setBounds(630,1,120,50);
						searHome.setBackground(Color.black);
						searHome.setForeground(Color.orange);
						searHome.setFont(new Font("Courier",Font.BOLD,30));
						c.add(searHome);
						searHome.addActionListener(this);
							
							//line 229 to line 370  is all about the home page....
		
							rPanel = new JPanel();
							rPanel.setLayout(null);
							rPanel.setBackground(new Color(0,0,0,120));
							rPanel.setBounds(50,50,1260,630);
					//	line 58 to 88 : These are textField for table shown on search or show all buttons
							
							sTPanel = new JPanel();
							sTPanel.setLayout(null);
							sTPanel.setBackground(new Color(0,0,0,120));
							sTPanel.setBounds(50,50,1260,630);
							
							sSTPanel = new JPanel();
							sSTPanel.setLayout(null);
							sSTPanel.setBackground(new Color(0,0,0,120));
							sSTPanel.setBounds(50,50,1260,630);
							
							tTPanel = new JPanel();
							tTPanel.setLayout(null);
							tTPanel.setBackground(new Color(0,0,0,120));
							tTPanel.setBounds(50,50,1260,630);
							
							tSTPanel = new JPanel();
							tSTPanel.setLayout(null);
							tSTPanel.setBackground(new Color(0,0,0,120));
							tSTPanel.setBounds(50,50,1260,630);
							
							osTPanel = new JPanel();
							osTPanel.setLayout(null);
							osTPanel.setBackground(new Color(0,0,0,120));
							osTPanel.setBounds(50,50,1260,630);
							
							osSTPanel = new JPanel();
							osSTPanel.setLayout(null);
							osSTPanel.setBackground(new Color(0,0,0,120));
							osSTPanel.setBounds(50,50,1260,630);
		
					// line 89-114 : these for beautification lines on the home screen. which are basically textfields...		
							sL1 = new JTextField();
							sL1.setBounds(25,580,1200,1);
							sL1.setBackground(Color.white);
							rPanel.add(sL1);
		
							sL2 = new JTextField();
							sL2.setBounds(25,400,1200,1);
							sL2.setBackground(Color.white);
							rPanel.add(sL2);
		
							sL0 = new JTextField();
							sL0.setBounds(25,70,1200,1);
							sL0.setBackground(Color.white);
							rPanel.add(sL0);
		
		
							sL3 = new JTextField();
							sL3.setBounds(390,30,1,370);
							sL3.setBackground(Color.white);
							rPanel.add(sL3);
		
							sL4 = new JTextField();
							sL4.setBounds(865,30,1,370);
							sL4.setBackground(Color.white);
							rPanel.add(sL4);
		
							stdR = new JLabel("Student Record");
							stdR.setBounds(130,15,185,50);
							stdR.setForeground(Color.white);
							stdR.setFont(new Font("Courier", Font.BOLD, 22));
							rPanel.add(stdR);
							
							ImageIcon iS = new ImageIcon("F:\\BS-SE\\BSSE-2\\OOP\\FinalProjectOriginal\\std.png");
							stdRImg = new JLabel(iS);
							stdRImg.setBounds(40,15,80,50);
							rPanel.add(stdRImg);
							
						
		
							teacherR = new JLabel("Teacher Record");
							teacherR.setBounds(955,15,185,50);
							teacherR.setForeground(Color.white);
							teacherR.setFont(new Font("Courier", Font.BOLD, 22));
							rPanel.add(teacherR);
							
							ImageIcon iT = new ImageIcon("F:\\\\BS-SE\\\\BSSE-2\\\\OOP\\\\FinalProjectOriginal\\teach.png");
							tRImg = new JLabel(iT);
							tRImg.setBounds(880,15,80,50);
							rPanel.add(tRImg);
		
							otherSR = new JLabel("Other-Staff Record");
							otherSR.setBounds(525,15,250,50);
							otherSR.setForeground(Color.white);
							otherSR.setFont(new Font("Courier", Font.BOLD, 22));
							rPanel.add(otherSR);
							
		
							ImageIcon iOS = new ImageIcon("F:\\\\BS-SE\\\\BSSE-2\\\\OOP\\\\FinalProjectOriginal\\os.png");
							osRImg = new JLabel(iOS);
							osRImg.setBounds(440,15,100,50);
							rPanel.add(osRImg);
		
		
								sAdd = new JButton("Add");
								sAdd.setBounds(150,150,100,50);
								sAdd.setBackground(Color.white);
								rPanel.add(sAdd);
								sAdd.addActionListener(this);
		
								sDel = new JButton("Delete");
								sDel.setBounds(205,240,100,50);
								sDel.setBackground(Color.red);
								sDel.setForeground(Color.white);
								sDel.setFont(new Font("Courier",Font.BOLD,16));
								rPanel.add(sDel);
								sDel.addActionListener(this);
								
		
								sSear = new JButton("Search");
								sSear.setBounds(100,240,100,50);
								sSear.setBackground(new Color(0,0,153));
								sSear.setForeground(Color.white);
								sSear.setFont(new Font("Courier",Font.BOLD,16));
								rPanel.add(sSear);
								sSear.addActionListener(this);
								
								sIdST = new JTextField();
								sIdST.setBounds(55,205,280,30);
								sIdST.setBackground(Color.black);
								sIdST.setForeground(Color.red);
								sIdST.setFont(new Font("Courier", Font.BOLD, 24));
								rPanel.add(sIdST);
		
								sShow = new JButton("Show All");
								sShow.setBounds(150,300,100,50);
								sShow.setBackground(Color.white);
								rPanel.add(sShow);
								sShow.addActionListener(this);
		
								osAdd = new JButton("Add");
								osAdd.setBounds(570,150,100,50);
								osAdd.setBackground(Color.white);
								rPanel.add(osAdd);
								osAdd.addActionListener(this);
		
								osDel = new JButton("Delete");
								osDel.setBounds(510,240,100,50);
								osDel.setBackground(Color.red);
								osDel.setForeground(Color.white);
								osDel.setFont(new Font("Courier",Font.BOLD,16));
								rPanel.add(osDel);
								osDel.addActionListener(this);
		
								osSear = new JButton("Search");
								osSear.setBounds(620,240,100,50);
								osSear.setBackground(new Color(0,0,153));
								osSear.setForeground(Color.white);
								osSear.setFont(new Font("Courier",Font.BOLD,16));
								rPanel.add(osSear);
								osSear.addActionListener(this);
								
								
								osIdST = new JTextField();
								osIdST.setBounds(450,205,330,30);
								osIdST.setBackground(Color.black);
								osIdST.setForeground(Color.red);
								osIdST.setFont(new Font("Courier", Font.BOLD, 24));
								rPanel.add(osIdST);
							
							
		
								osShow = new JButton("Show All");
								osShow.setBounds(570,300,100,50);
								osShow.setBackground(Color.white);
								rPanel.add(osShow);
								osShow.addActionListener(this);
		
		
								tAdd = new JButton("Add");
								tAdd.setBounds(1010,152,100,50);
								tAdd.setBackground(Color.white);
								rPanel.add(tAdd);
								tAdd.addActionListener(this);
		
								tDel = new JButton("Delete");
								tDel.setBounds(1070,240,100,50);
								tDel.setBackground(Color.red);
								tDel.setForeground(Color.white);
								tDel.setFont(new Font("Courier",Font.BOLD,16));
								rPanel.add(tDel);
								tDel.addActionListener(this);
		
								tSear = new JButton("Search");
								tSear.setBounds(960,240,100,50);
								tSear.setBackground(new Color(0,0,153));
								tSear.setForeground(Color.white);
								tSear.setFont(new Font("Courier",Font.BOLD,16));
								rPanel.add(tSear);
								tSear.addActionListener(this);
								
		
								tIdST = new JTextField();
								tIdST.setBounds(915,205,290,30);
								tIdST.setBackground(Color.black);
								tIdST.setForeground(Color.red);
								tIdST.setFont(new Font("Courier", Font.BOLD, 24));
								rPanel.add(tIdST);
		
								tShow = new JButton("Show All");
								tShow.setBounds(1010,300,100,50);
								tShow.setBackground(Color.white);
								rPanel.add(tShow);
								tShow.addActionListener(this);
		
		
								logo = new JLabel("SIBA Community CMS");
								logo.setBounds(410,500,700,50);
								logo.setForeground(Color.green);
								logo.setFont(new Font("Courier", Font.BOLD, 36));
								rPanel.add(logo);
								
								ImageIcon iSiba = new ImageIcon("F:\\\\BS-SE\\\\BSSE-2\\\\OOP\\\\FinalProjectOriginal\\siba.png");
								SibaImg = new JLabel(iSiba);
								SibaImg.setBounds(570,440,120,70);
								rPanel.add(SibaImg);
								
								
		
				c.add(rPanel);
		
		//This panel is all about students Data adding data
								addPanel = new JPanel();
								addPanel.setLayout(null);
								addPanel.setBackground(new Color(0,0,0,120));
								addPanel.setBounds(50,50,1260,650);
		
								studentL = new JLabel("Student Record");
								studentL.setFont(new Font("Courier", Font.BOLD, 40));
								studentL.setForeground(Color.yellow);
								studentL.setBounds(500,15,400,50);
								addPanel.add(studentL);
		
								sLine = new JTextField();
								sLine.setBounds(100,70,1100,1);
								sLine.setBackground(Color.white);
								addPanel.add(sLine);
		
		
									sName = new JLabel("Enter Name : ");
									sName.setBounds(120,90,500,50);
									sName.setFont(new Font("Courier", Font.BOLD, 32));
									sName.setForeground(Color.white);
									addPanel.add(sName);
		
									sNameT = new JTextField();
									sNameT.setBounds(600,100,500,30);
									sNameT.setBackground(Color.white);
									sNameT.setForeground(Color.black);
									sNameT.setFont(new Font("Courier", Font.BOLD, 24));
									addPanel.add(sNameT);
		
									sFName = new JLabel("Enter Father Name : ");
									sFName.setBounds(120,150,550,50);
									sFName.setFont(new Font("Courier", Font.BOLD, 32));
									sFName.setForeground(Color.white);
									addPanel.add(sFName);
		
									sFNameT = new JTextField();
									sFNameT.setBounds(600,160,500,30);
									sFNameT.setBackground(Color.white);
									sFNameT.setForeground(Color.black);
									sFNameT.setFont(new Font("Courier", Font.BOLD, 24));
									addPanel.add(sFNameT);
		
									sId = new JLabel("Enter ID : ");
									sId.setBounds(120,210,550,50);
									sId.setFont(new Font("Courier", Font.BOLD, 32));
									sId.setForeground(Color.white);
									addPanel.add(sId);
		
									sIdT = new JTextField();
									sIdT.setBounds(600,220,500,30);
									sIdT.setBackground(Color.white);
									sIdT.setForeground(Color.black);
									sIdT.setFont(new Font("Courier", Font.BOLD, 24));
									addPanel.add(sIdT);
		
									sSection = new JLabel("Enter Section : ");
									sSection.setBounds(120,270,550,50);
									sSection.setFont(new Font("Courier", Font.BOLD, 32));
									sSection.setForeground(Color.white);
									addPanel.add(sSection);
		
									sSectionT = new JTextField();
									sSectionT.setBounds(600,280,500,30);
									sSectionT.setBackground(Color.white);
									sSectionT.setForeground(Color.black);
									sSectionT.setFont(new Font("Courier", Font.BOLD, 24));
									addPanel.add(sSectionT);
		
									sType = new JLabel("Enter Type : ");
									sType.setBounds(120,330,550,50);
									sType.setFont(new Font("Courier", Font.BOLD, 32));
									sType.setForeground(Color.white);
									addPanel.add(sType);
		
									sTypeT = new JTextField();
									sTypeT.setBounds(600,340,500,30);
									sTypeT.setBackground(Color.white);
									sTypeT.setForeground(Color.black);
									sTypeT.setFont(new Font("Courier", Font.BOLD, 24));
									addPanel.add(sTypeT);
		
									sYear = new JLabel("Enter Year : ");
									sYear.setBounds(120,390,550,50);
									sYear.setFont(new Font("Courier", Font.BOLD, 32));
									sYear.setForeground(Color.white);
									addPanel.add(sYear);
		
									sYearT = new JTextField();
									sYearT.setBounds(600,400,500,30);
									sYearT.setBackground(Color.white);
									sYearT.setForeground(Color.black);
									sYearT.setFont(new Font("Courier", Font.BOLD, 24));
									addPanel.add(sYearT);
		
									sContact = new JLabel("Enter Contact : ");
									sContact.setBounds(120,450,550,50);
									sContact.setFont(new Font("Courier", Font.BOLD, 32));
									sContact.setForeground(Color.white);
									addPanel.add(sContact);
		
									sContactT = new JTextField();
									sContactT.setBounds(600,460,500,30);
									sContactT.setBackground(Color.white);
									sContactT.setForeground(Color.black);
									sContactT.setFont(new Font("Courier", Font.BOLD, 24));
									addPanel.add(sContactT);
		
									sFContact = new JLabel("Enter Father Contact : ");
									sFContact.setBounds(120,510,550,50);
									sFContact.setFont(new Font("Courier", Font.BOLD, 32));
									sFContact.setForeground(Color.white);
									addPanel.add(sFContact);
		
									sFContactT = new JTextField();
									sFContactT.setBounds(600,520,500,30);
									sFContactT.setBackground(Color.white);
									sFContactT.setForeground(Color.black);
									sFContactT.setFont(new Font("Courier", Font.BOLD, 24));
									addPanel.add(sFContactT);
		
									sAddress = new JLabel("Enter Address : ");
									sAddress.setBounds(120,570,550,50);
									sAddress.setFont(new Font("Courier", Font.BOLD, 32));
									sAddress.setForeground(Color.white);
									addPanel.add(sAddress);
		
									sAddressT = new JTextField();
									sAddressT.setBounds(600,580,500,30);
									sAddressT.setBackground(Color.white);
									sAddressT.setForeground(Color.black);
									sAddressT.setFont(new Font("Courier", Font.BOLD, 24));
									addPanel.add(sAddressT);
		
									sReset = new JButton("Reset");
									sReset.setBounds(1115,430,120,80);
									sReset.setBackground(new Color(0,0,153));
									sReset.setForeground(Color.white);
									sReset.setFont(new Font("Courier",Font.BOLD,25));
									addPanel.add(sReset);
									sReset.addActionListener(this);
		
									sSubmit = new JButton("Submit");
									sSubmit.setBounds(1115,520,120,90);
									sSubmit.setBackground(Color.red);
									sSubmit.setForeground(Color.white);
									sSubmit.setFont(new Font("Courier",Font.BOLD,23));
									addPanel.add(sSubmit);
									sSubmit.addActionListener(this);
									
									sHome = new JButton("Home");
									sHome.setBounds(1115,340,120,80);
									sHome.setBackground(Color.black);
									sHome.setForeground(Color.white);
									sHome.setFont(new Font("Courier",Font.BOLD,25));
									addPanel.add(sHome);
									sHome.addActionListener(this);
				//c.add(addPanel);
		
		//This panel is about Teacher data Adding							
		
									addTPanel = new JPanel();
								addTPanel.setLayout(null);
								addTPanel.setBackground(new Color(0,0,0,120));
								addTPanel.setBounds(50,50,1260,650);
		
								teacherL = new JLabel("Teacher Record");
								teacherL.setFont(new Font("Courier", Font.BOLD, 40));
								teacherL.setForeground(Color.yellow);
								teacherL.setBounds(500,15,400,50);
								addTPanel.add(teacherL);
		
								tLine = new JTextField();
								tLine.setBounds(100,70,1100,1);
								tLine.setBackground(Color.white);
								addTPanel.add(tLine);
		
		
									tName = new JLabel("Enter Name : ");
									tName.setBounds(120,90,500,50);
									tName.setFont(new Font("Courier", Font.BOLD, 32));
									tName.setForeground(Color.white);
									addTPanel.add(tName);
		
									tNameT = new JTextField();
									tNameT.setBounds(600,100,500,30);
									tNameT.setBackground(Color.white);
									tNameT.setForeground(Color.black);
									tNameT.setFont(new Font("Courier", Font.BOLD, 24));
									addTPanel.add(tNameT);
		
									tId = new JLabel("Enter ID : ");
									tId.setBounds(120,160,550,50);
									tId.setFont(new Font("Courier", Font.BOLD, 32));
									tId.setForeground(Color.white);
									addTPanel.add(tId);
		
									tIdT = new JTextField();
									tIdT.setBounds(600,170,500,30);
									tIdT.setBackground(Color.white);
									tIdT.setForeground(Color.black);
									tIdT.setFont(new Font("Courier", Font.BOLD, 24));
									addTPanel.add(tIdT);
		
									tSubject = new JLabel("Enter Subject : ");
									tSubject.setBounds(120,230,550,50);
									tSubject.setFont(new Font("Courier", Font.BOLD, 32));
									tSubject.setForeground(Color.white);
									addTPanel.add(tSubject);
		
									tSubjectT = new JTextField();
									tSubjectT.setBounds(600,240,500,30);
									tSubjectT.setBackground(Color.white);
									tSubjectT.setForeground(Color.black);
									tSubjectT.setFont(new Font("Courier", Font.BOLD, 24));
									addTPanel.add(tSubjectT);
		
									tQualification = new JLabel("Enter Qualification : ");
									tQualification.setBounds(120,300,550,50);
									tQualification.setFont(new Font("Courier", Font.BOLD, 32));
									tQualification.setForeground(Color.white);
									addTPanel.add(tQualification);
		
									tQualificationT = new JTextField();
									tQualificationT.setBounds(600,310,500,30);
									tQualificationT.setBackground(Color.white);
									tQualificationT.setForeground(Color.black);
									tQualificationT.setFont(new Font("Courier", Font.BOLD, 24));
									addTPanel.add(tQualificationT);
		
									tContact = new JLabel("Enter Contact : ");
									tContact.setBounds(120,380,550,50);
									tContact.setFont(new Font("Courier", Font.BOLD, 32));
									tContact.setForeground(Color.white);
									addTPanel.add(tContact);
		
									tContactT = new JTextField();
									tContactT.setBounds(600,390,500,30);
									tContactT.setBackground(Color.white);
									tContactT.setForeground(Color.black);
									tContactT.setFont(new Font("Courier", Font.BOLD, 24));
									addTPanel.add(tContactT);
		
									tAddress = new JLabel("Enter Address : ");
									tAddress.setBounds(120,450,550,50);
									tAddress.setFont(new Font("Courier", Font.BOLD, 32));
									tAddress.setForeground(Color.white);
									addTPanel.add(tAddress);
		
									tAddressT = new JTextField();
									tAddressT.setBounds(600,460,500,30);
									tAddressT.setBackground(Color.white);
									tAddressT.setForeground(Color.black);
									tAddressT.setFont(new Font("Courier", Font.BOLD, 24));
									addTPanel.add(tAddressT);
		
									tReset = new JButton("Reset");
									tReset.setBounds(400,550,160,80);
									tReset.setBackground(new Color(0,0,153));
									tReset.setForeground(Color.white);
									tReset.setFont(new Font("Courier", Font.BOLD, 30));
									addTPanel.add(tReset);
									tReset.addActionListener(this);
		
									tSubmit = new JButton("Submit");
									tSubmit.setBounds(570,550,160,80);
									tSubmit.setBackground(Color.red);
									tSubmit.setForeground(Color.white);
									tSubmit.setFont(new Font("Courier", Font.BOLD, 30));
									addTPanel.add(tSubmit);
									tSubmit.addActionListener(this);
									
									tHome = new JButton("Home");
									tHome.setBounds(740,550,160,80);
									tHome.setBackground(Color.black);
									tHome.setForeground(Color.white);
									tHome.setFont(new Font("Courier",Font.BOLD,30));
									addTPanel.add(tHome);
									tHome.addActionListener(this);
		
				//c.add(addTPanel);
		//This Panel is about other staff data adding
										addOSPanel = new JPanel();
									addOSPanel.setLayout(null);
									addOSPanel.setBackground(new Color(0,0,0,120));
									addOSPanel.setBounds(50,50,1260,650);
		
									osL = new JLabel("Other Staff Record");
									osL.setFont(new Font("Courier", Font.BOLD, 40));
									osL.setForeground(Color.yellow);
									osL.setBounds(480,15,500,50);
									addOSPanel.add(osL);
		
									osLine = new JTextField();
									osLine.setBounds(100,70,1100,1);
									osLine.setBackground(Color.white);
									addOSPanel.add(osLine);
		
		
									osName = new JLabel("Enter Name : ");
									osName.setBounds(120,90,500,50);
									osName.setFont(new Font("Courier", Font.BOLD, 32));
									osName.setForeground(Color.white);
									addOSPanel.add(osName);
		
									osNameT = new JTextField();
									osNameT.setBounds(600,100,500,30);
									osNameT.setBackground(Color.white);
									osNameT.setForeground(Color.black);
									osNameT.setFont(new Font("Courier", Font.BOLD, 24));
									addOSPanel.add(osNameT);
		
									osId = new JLabel("Enter ID : ");
									osId.setBounds(120,160,550,50);
									osId.setFont(new Font("Courier", Font.BOLD, 32));
									osId.setForeground(Color.white);
									addOSPanel.add(osId);
									
									osIdT = new JTextField();
									osIdT.setBounds(600,170,500,30);
									osIdT.setFont(new Font("Courier", Font.BOLD, 32));
									osIdT.setBackground(Color.white);
									osIdT.setForeground(Color.black);
									addOSPanel.add(osIdT);
		
									
		
									osType = new JLabel("Enter Type : ");
									osType.setBounds(120,230,550,50);
									osType.setFont(new Font("Courier", Font.BOLD, 32));
									osType.setForeground(Color.white);
									addOSPanel.add(osType);
		
									osTypeT = new JTextField();
									osTypeT.setBounds(600,240,500,30);
									osTypeT.setBackground(Color.white);
									osTypeT.setForeground(Color.black);
									osTypeT.setFont(new Font("Courier", Font.BOLD, 24));
									addOSPanel.add(osTypeT);
		
									osContact = new JLabel("Enter Contact : ");
									osContact.setBounds(120,300,550,50);
									osContact.setFont(new Font("Courier", Font.BOLD, 32));
									osContact.setForeground(Color.white);
									addOSPanel.add(osContact);
		
									osContactT = new JTextField();
									osContactT.setBounds(600,310,500,30);
									osContactT.setBackground(Color.white);
									osContactT.setForeground(Color.black);
									osContactT.setFont(new Font("Courier", Font.BOLD, 24));
									addOSPanel.add(osContactT);
		
									osAddress = new JLabel("Enter Address : ");
									osAddress.setBounds(120,370,550,50);
									osAddress.setFont(new Font("Courier", Font.BOLD, 32));
									osAddress.setForeground(Color.white);
									addOSPanel.add(osAddress);
		
									osAddressT = new JTextField();
									osAddressT.setBounds(600,380,500,30);
									osAddressT.setBackground(Color.white);
									osAddressT.setForeground(Color.black);
									osAddressT.setFont(new Font("Courier", Font.BOLD, 24));
									addOSPanel.add(osAddressT);
		
									osReset = new JButton("Reset");
									osReset.setBounds(400,550,160,80);
									osReset.setBackground(new Color(0,0,153));
									osReset.setForeground(Color.white);
									osReset.setFont(new Font("Courier", Font.BOLD, 30));
									addOSPanel.add(osReset);
									osReset.addActionListener(this);
		
									osSubmit = new JButton("Submit");
									osSubmit.setBounds(570,550,160,80);
									osSubmit.setBackground(Color.red);
									osSubmit.setForeground(Color.white);
									osSubmit.setFont(new Font("Courier", Font.BOLD, 30));
									addOSPanel.add(osSubmit);
									osSubmit.addActionListener(this);
									
									osHome = new JButton("Home");
									osHome.setBounds(740,550,160,80);
									osHome.setBackground(Color.black);
									osHome.setForeground(Color.white);
									osHome.setFont(new Font("Courier",Font.BOLD,30));
									addOSPanel.add(osHome);
									osHome.addActionListener(this);
		
				//c.add(addOSPanel);
																														
				myFrame.setSize(1000,1000);
				myFrame.setVisible(true);
				myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			}
				  @SuppressWarnings("unused")
				public void actionPerformed(ActionEvent ae)
				  {
					  
					  
					if(ae.getSource()==sAdd)
					{
						addPanel.setVisible(true);
						rPanel.setVisible(false);
						c.repaint();
						c.add(addPanel);
						
					}
					
					else if(ae.getSource()==sSear)
					{
						rPanel.setVisible(true);
						
						if(sIdST.getText().equals(""))
						{
							
							JOptionPane.showMessageDialog(null, "Please Enter value");
						}
						else
						{
							boolean flag = false;
								try
								{
									Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\BS-SE\\BSSE-2\\OOP\\FinalProjectOriginal\\Database3.accdb");
									String sql = "SELECT * FROM Student";
									PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
									ResultSet rs = ps.executeQuery();
									rs.last();
									int count = rs.getRow();
									rs.first();
									
									String search = sIdST.getText();
									sIdST.setText("");
									
										int i=0;
										//String rows[][]=new String[rs.getRow()][9];
										JTable table;
										JScrollPane ips;
										
										
										while(rs!=null)
										{
											
											if(sIdST.getText()==null)
											{
												JOptionPane.showMessageDialog(null,"Please Enter ID");
												break;
												
											}
											else if(rs.getString("sID").equals(search))
											{
												
												String [][] rows = new String[1][9];
												
												rPanel.setOpaque(false);
												rPanel.setVisible(false);
												sTPanel.setVisible(true);
												
												
													flag=true;
												String id = rs.getString("sID");
												String name = rs.getString("Name");
												String fName = rs.getString("Father_Name");
												String type = rs.getString("Type");
												String address = rs.getString("Address"); 
												String contact = rs.getString("Contact");
												String section = rs.getString("Section");
												String year = rs.getString("Student_Year");
												String fContact = rs.getString("Father_Contact");
												
							
													rows[0][0] = id;
													rows[0][1] = name;
													rows[0][2] = fName;
													rows[0][3] = section;
													rows[0][4] = type;
													rows[0][5] = year; 
													rows[0][6] = contact;
													rows[0][7] = fContact;
													rows[0][8] = address;
														
													i++;
													
													String column [] = {"ID","Name","Father Name","Section","Type","Year","Contact","Father Contact","Address"};
													table = new JTable(rows,column) ;
													table.setPreferredScrollableViewportSize(new Dimension(500,400));
													table.setFillsViewportHeight(true);
													ips = new JScrollPane(table) ;
													ips.setVisible(true);
													c.add(ips) ;
													sTPanel.setOpaque(true);
													sTPanel.add(ips) ;
													c.add(sTPanel);
													ips.setBounds(0,0,1260,630);
											
													
													
											}
											else if(rs.getRow()==count && flag==false)
											{
												JOptionPane.showMessageDialog(null, "Record Not Found");
												sIdST.setText("");
												c.repaint();
												rPanel.setVisible(true);
												con.close();
												break;
											}
													rs.next();

													if(rs.next()==false)
													{
														rs.first();
														break;
													}
													
											
										}
										
										con.close();
										
								}
									catch(Exception ex)
									{
										System.out.println(ex);
									}
								}
						
							}
		
						
					
					else if(ae.getSource()==sDel)
					{
						boolean test = false;
						if(sIdST.getText().equals(""))
						{
							
							JOptionPane.showMessageDialog(null, "Please Enter value");
						}
						
						else
						{
							try
							{
								Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\BS-SE\\BSSE-2\\OOP\\FinalProjectOriginal\\Database3.accdb");
								String sql = "SELECT * FROM Student";
								PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
								ResultSet rs = ps.executeQuery();
								if(ae.getSource()==sDel)
								{
									String check = sIdST.getText();
									sIdST.setText("");
									while(rs.next())
									{
										String id = rs.getString("sID");
										if(check.equals(id))
										{
											rs.deleteRow();
											JOptionPane.showMessageDialog(null,"Deleted Successfully");
											test = true;
											
										}
										else if(rs.next()==rs.last() && test ==false)
										{
											JOptionPane.showMessageDialog(null, "Record Not Found");
											sIdST.setText("");
											c.repaint();
											rPanel.setVisible(true);
											con.close();
											break;
										}
										
									}
									
									
								}
								con.close();
								
							}
							catch(Exception ex)
							{
								System.out.println(ex);
							}
						}
					}
		
		
					else if(ae.getSource()==sSubmit)
					{
							
						if(sIdT.getText().equals("") || sNameT.getText().equals("") || sFNameT.getText().equals("") || sTypeT.getText().equals("") 
							|| sSectionT.getText().equals("") || sAddressT.getText().equals("") || sContactT.getText().equals("") ||
							sFContactT.getText().equals("") || sYearT.getText().equals(""))
						{
							JOptionPane.showMessageDialog(null, "Please Fill all Fields");
						}
						else
						{
								addPanel.setVisible(false);
							try
							{
								Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\BS-SE\\BSSE-2\\OOP\\FinalProjectOriginal\\Database3.accdb");
							String sql = "SELECT * FROM Student";
							PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
							ResultSet rs = ps.executeQuery();
							
							String id = sIdT.getText();
							String name = sNameT.getText();
							String fName = sFNameT.getText();
							String type = sTypeT.getText();
							String section = sSectionT.getText();
							String address = sAddressT.getText(); 
							String contact = sContactT.getText() ;
							String fContact = sFContactT.getText(); 
							String year = sYearT.getText();
							
							
							rs.moveToInsertRow();
							
							rs.updateString("sID" , id);
							rs.updateString("Name" , name);
							rs.updateString("Father_Name" , fName);
							rs.updateString("Section" , section);
							rs.updateString("Type" , type);
							rs.updateString("Student_Year" , year);
							rs.updateString("Contact" , contact);
							rs.updateString("Father_Contact" , fContact);
							rs.updateString("Address" , address);
							
							rs.insertRow();
							con.close();
							JOptionPane.showMessageDialog(null,"Added Data Successfully");
							c.repaint();
							addPanel.setVisible(true);
							}
							catch(Exception ex)
							{
								System.out.println(ex);
							}
						}
					}
						else if(ae.getSource()==sReset)
						{
							sIdT.setText("");
							sNameT.setText("");
							sFNameT.setText("");
							sTypeT.setText("");
							sSectionT.setText("");
							sAddressT.setText("");
							sContactT.setText("");
							sFContactT.setText("");
							sYearT.setText("");
						}
						else if(ae.getSource() == sShow)
						{
							rPanel.setOpaque(true);
							rPanel.setVisible(false);
							sSTPanel.setVisible(true);
							sSTPanel.setVisible(true);
							c.repaint();
						
							try
							{
								Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\BS-SE\\BSSE-2\\OOP\\FinalProjectOriginal\\Database3.accdb");
								String sql = "SELECT * FROM Student";
								PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
								ResultSet rs = ps.executeQuery();
								rs.last();
								int count = rs.getRow();
								rs.first();
		
								if(rs==null)
								{
									JOptionPane.showMessageDialog(null,"There is no data to show");
									rPanel.setOpaque(true);
									rPanel.setVisible(true);
									
								}
								else
								{
									int i=0;
									//String rows[][]=new String[rs.getRow()][9];
									JTable table;
									JScrollPane ips;
									String [][] rows = new String[count+1][9];
									
									while(rs!=null)
									{
										
											String id = rs.getString("sID");
											String name = rs.getString("Name");
											String fName = rs.getString("Father_Name");
											String type =  rs.getString("Type");
											String section = rs.getString("Section");
											String address = rs.getString("Address"); 
											String contact = rs.getString("Contact");
											String fContact = rs.getString("Father_Contact");
											String year =  rs.getString("Student_Year");
											
												rows[i][0] = id;
												rows[i][1] = name;
												rows[i][2] = fName;
												rows[i][3] = section;
												rows[i][4] = type;
												rows[i][5] = year;
												rows[i][6] = contact;
												rows[i][7] = fContact;
												rows[i][8] = address; 
													
												i++;
												
												String column [] = {"ID","Name","Father Name","Type","Section","Year", "Contact","Father Contact","Address"};
												table = new JTable(rows,column) ;
												table.setPreferredScrollableViewportSize(new Dimension(500,400));
												table.setFillsViewportHeight(true);
												ips = new JScrollPane(table) ;
												ips.setVisible(true);
												sSTPanel.setOpaque(true);
												sSTPanel.add(ips) ;
												c.add(sSTPanel);
												ips.setBounds(0,0,1260,630);
											
												rs.next();
												if(rs.next()==false)
												{
													rs.first();
													break;
												}
									}
								}
								con.close();
							}
								catch(Exception ex)
								{
									System.out.println(ex);
								}
							
						}
						
		
					else if(ae.getSource()==tAdd)
					{
						addTPanel.setVisible(true);
						rPanel.setVisible(false);
						c.repaint();
						c.add(addTPanel);
					}
					
					else if(ae.getSource()==tSear)
					{
						rPanel.setVisible(true);
						if(tIdST.getText().equals(""))
						{
							
							JOptionPane.showMessageDialog(null, "Please Enter value");
						}
						else
						{
							boolean flag = false;
								try
								{
									Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\BS-SE\\BSSE-2\\OOP\\FinalProjectOriginal\\Database3.accdb");
									String sql = "SELECT * FROM Teacher";
									PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
									ResultSet rs = ps.executeQuery();
									rs.last();
									int count = rs.getRow();
									rs.first();
									
									String search = tIdST.getText();
									tIdST.setText("");
									
										int i=0;
										//String rows[][]=new String[rs.getRow()][9];
										JTable table;
										JScrollPane ips;
										String [][] rows = new String[1][6];
										
										while(rs!=null)
										{
											
											if(tIdST.getText()==null)
											{
												JOptionPane.showMessageDialog(null,"Please Enter ID");
												break;
												
											}
											else if(rs.getString("tID").equals(search))
											{
												
												rPanel.setOpaque(false);
												rPanel.setVisible(false);
												tTPanel.setVisible(true);
												
													flag=true;
												String id = rs.getString("tID");
												String name = rs.getString("Name");
												String address = rs.getString("Address"); 
												String contact = rs.getString("Contact");
												String subject = rs.getString("Subject");
												String qualification = rs.getString("Qualification");
												
							
													rows[0][0] = id;
													rows[0][1] = name;
													rows[0][2] = subject;
													rows[0][3] = qualification;
													rows[0][4] = contact;
													rows[0][5] = address;
														
													i++;
													
													String column [] = {"ID","Name","Subject","Qualification","Contact","Address"};
													table = new JTable(rows,column) ;
													table.setPreferredScrollableViewportSize(new Dimension(500,400));
													table.setFillsViewportHeight(true);
													ips = new JScrollPane(table) ;
													ips.setVisible(true);
													tTPanel.setOpaque(true);
													tTPanel.add(ips) ;
													c.add(tTPanel);
													ips.setBounds(0,0,1260,630);
													rPanel.setVisible(false);
													
											}
											else if(rs.getRow()==count && flag==false)
											{
													
													rPanel.setVisible(true);
													JOptionPane.showMessageDialog(null, "Record Not Found");
													tIdST.setText("");
													c.repaint();
													con.close();
													break;
											}
													rs.next();
													
													if(rs.next()==false)
													{
														rs.first();
														break;
													}
													
										
										}
										
										
										con.close();
										
								}
									catch(Exception ex)
									{
										System.out.println(ex);
									}
								}
						
					}
		
					
		
					
					else if(ae.getSource()==tDel)
					{
						boolean test = false;
						if(tIdST.getText().equals(""))
						{
							
							JOptionPane.showMessageDialog(null, "Please Enter value");
						}
						else
						{
							try
							{
								Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\BS-SE\\BSSE-2\\OOP\\FinalProjectOriginal\\Database3.accdb");
								String sql = "SELECT * FROM Teacher";
								PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
								ResultSet rs = ps.executeQuery();
								if(ae.getSource()==tDel)
								{
									String check = tIdST.getText();
									while(rs.next())
									{
										String id = rs.getString("tID");
										
										if(check.equals(id))
										{
											rs.deleteRow();
											JOptionPane.showMessageDialog(null,"Deleted Successfully");
											test=true;
											
										}
										else if(rs.next()==rs.last() && test ==false)
										{
											JOptionPane.showMessageDialog(null, "Record Not Found");
											tIdST.setText("");
											c.repaint();
											rPanel.setVisible(true);
											con.close();
											break;
										}
										rs.next();
									}
									tIdST.setText("");
									
								}
								con.close();
						}
						catch(Exception ex)
						{
							System.out.println(ex);
						}
					}
				}
		
		
					else if(ae.getSource() == tShow)
					{
						
						rPanel.setOpaque(true);
						rPanel.setVisible(false);
						tSTPanel.setVisible(true);
						tSTPanel.setVisible(true);
						c.repaint();
						try
						{
							Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\BS-SE\\BSSE-2\\OOP\\FinalProjectOriginal\\Database3.accdb");
							String sql = "SELECT * FROM Teacher";
							PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
							ResultSet rs = ps.executeQuery();
							rs.last();
							int count = rs.getRow();
							rs.first();
							
		
							if(rs.first()==false)
							{
								JOptionPane.showMessageDialog(null,"There is no data to show");
								rPanel.setVisible(true);
								
							}
							else
							{
								int i=0;
								//String rows[][]=new String[rs.getRow()][9];
								JTable table;
								JScrollPane ips;
								String [][] rows = new String[count+1][6];
								
								while(rs!=null)
								{
									
								
										String id = rs.getString("tID");
										String name = rs.getString("Name");
										String subject = rs.getString("Subject");
										String address = rs.getString("Address"); 
										String contact = rs.getString("Contact");
										String qualification = rs.getString("Qualification");
										
										 
										
											rows[i][0] = id;
											rows[i][1] = name;
											rows[i][2] = subject;
											rows[i][3] = qualification;
											rows[i][4] = contact;
											rows[i][5] = address; 
												
											i++;
											
											String column [] = {"ID","Name","Subject","Qualification","Contact","Address"};
											table = new JTable(rows,column) ;
											table.setPreferredScrollableViewportSize(new Dimension(500,400));
											table.setFillsViewportHeight(true);
											ips = new JScrollPane(table) ;
											ips.setVisible(true);
											tSTPanel.setOpaque(true);
											tSTPanel.add(ips) ;
											c.add(tSTPanel);
											ips.setBounds(0,0,1260,630);
											rs.next();
											
											if(rs.next()==false)
											{
												rs.first();
												break;
											}
											
									
								}
								
							}
							con.close();
						}
							catch(Exception ex)
							{
								System.out.println(ex);
							}
						
					}
					
		
					else if(ae.getSource()==tSubmit)
					{
						if(tIdT.getText().equals("") || tNameT.getText().equals("") || tSubjectT.getText().equals("") 
								|| tAddressT.getText().equals("") || tQualificationT.getText().equals("") ||
								tContactT.getText().equals(""))
							{
								JOptionPane.showMessageDialog(null, "Please Fill all Fields");
							}
						
						else
						{
							addTPanel.setVisible(false);
							try
							{
								Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\BS-SE\\BSSE-2\\OOP\\FinalProjectOriginal\\Database3.accdb");
							String sql = "SELECT * FROM Teacher";
							PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
							ResultSet rs = ps.executeQuery();
							
							String id = tIdT.getText();
							String name = tNameT.getText();
							String subject = tSubjectT.getText();
							String contact = tContactT.getText();
							String address = tAddressT.getText();
							String qualification = tQualificationT.getText();
							
							
							rs.moveToInsertRow();
							
							rs.updateString("tID" , id);
							rs.updateString("Name" , name);
							rs.updateString("Subject" , subject);
							rs.updateString("Qualification" , qualification);
							rs.updateString("Contact" , contact);
							rs.updateString("Address" , address);
							
							rs.insertRow();
							con.close();
							JOptionPane.showMessageDialog(null, "Added Successfully");
							c.repaint();
							addTPanel.setVisible(true);
							}
							catch(Exception ex)
							{
								System.out.println(ex);
							}
					   }
					}
						else if(ae.getSource()==tReset)
						{
							tIdT.setText("");
							tNameT.setText("");
							tSubjectT.setText("");
							tAddressT.setText("");
							tContactT.setText("");
							tQualificationT.setText("");
						}
		
					
					else if(ae.getSource()==osAdd)
					{
						addOSPanel.setVisible(true);
						rPanel.setVisible(false);
						c.repaint();
						c.add(addOSPanel);
					}
					
					else if(ae.getSource()==osSear)
					{
						rPanel.setVisible(true);
						if(osIdST.getText().equals(""))
						{
							
							JOptionPane.showMessageDialog(null, "Please Enter value");
						}
						else
						{
							boolean flag = false;
								try
								{
									Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\BS-SE\\BSSE-2\\OOP\\FinalProjectOriginal\\Database3.accdb");
									String sql = "SELECT * FROM Other_Staff";
									PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
									ResultSet rs = ps.executeQuery();
									rs.last();
									int count = rs.getRow();
									rs.first();
									
									String search = osIdST.getText();
									osIdST.setText("");
									
										int i=0;
										//String rows[][]=new String[rs.getRow()][9];
										JTable table;
										JScrollPane ips;
										String [][] rows = new String[1][5];
										
										while(rs!=null)
										{
											
											if(osIdST.getText()==null)
											{
												JOptionPane.showMessageDialog(null,"Please Enter ID");
												break;
												
											}
											else if(rs.getString("osID").equals(search))
											{
												
												rPanel.setOpaque(false);
												rPanel.setVisible(false);
												osTPanel.setVisible(true);
												
													flag=true;
												String id = rs.getString("osID");
												String name = rs.getString("Name");
												String address = rs.getString("Address"); 
												String contact = rs.getString("Contact");
												String type = rs.getString("Type");
												
							
													rows[0][0] = id;
													rows[0][1] = name;
													rows[0][2] = type;
													rows[0][3] = contact;
													rows[0][4] = address;
														
													i++;
													
													String column [] = {"ID","Name","Type","Contact","Address"};
													table = new JTable(rows,column) ;
													table.setPreferredScrollableViewportSize(new Dimension(500,400));
													table.setFillsViewportHeight(true);
													ips = new JScrollPane(table) ;
													ips.setVisible(true);
													osTPanel.setOpaque(true);
													osTPanel.add(ips) ;
													c.add(osTPanel);
													ips.setBounds(0,0,1260,630);
													rPanel.setVisible(false);
													
											}
											else if(rs.getRow()==count && flag==false)
											{
													
													rPanel.setVisible(true);
													JOptionPane.showMessageDialog(null, "Record Not Found");
													osIdST.setText("");
													c.repaint();
													con.close();
													break;
											}
													rs.next();
													
													if(rs.next()==false)
													{
														rs.first();
														break;
													}
													
										
										}
										
										
										con.close();
										
								}
									catch(Exception ex)
									{
										System.out.println(ex);
									}
								}
						
					}
		
					
				
		
		
					else if(ae.getSource()==osDel)
					{
						boolean test = false;
						if(osIdST.getText().equals(""))
						{
							
							JOptionPane.showMessageDialog(null, "Please Enter value");
						}
						else
						{
							try
							{
								Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\BS-SE\\BSSE-2\\OOP\\FinalProjectOriginal\\Database3.accdb");
								String sql = "SELECT * FROM Other_Staff";
								PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
								ResultSet rs = ps.executeQuery();
								if(ae.getSource()==osDel)
								{
									String check = osIdST.getText();
									osIdST.setText("");
									while(rs.next())
									{
										String id = rs.getString("osID");
										if(check.equals(id))
										{
											rs.deleteRow();
											JOptionPane.showMessageDialog(null,"Deleted Successfully");
											
										}
										else if(rs.next()==rs.last() && test ==false)
										{
											rPanel.setVisible(true);
											JOptionPane.showMessageDialog(null, "Record Not Found");
											osIdST.setText("");
											c.repaint();
											con.close();
											break;
										}
									
									}
									
								}
									
							}
							catch(Exception ex)
							{
								System.out.println(ex);
							}
						}
					}
		
					else if(ae.getSource()==osSubmit)
					{
						if(osIdT.getText().equals("") || osNameT.getText().equals("") || osTypeT.getText().equals("") 
								|| osAddressT.getText().equals("") || osContactT.getText().equals(""))
							{
								JOptionPane.showMessageDialog(null, "Please Fill all Fields");
							}
						else
						{
							addOSPanel.setVisible(false);
							try
							{
								Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\BS-SE\\BSSE-2\\OOP\\FinalProjectOriginal\\Database3.accdb");
							String sql = "SELECT * FROM Other_Staff";
							PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
							ResultSet rs = ps.executeQuery();
							
							String id = osIdT.getText();
							String name = osNameT.getText();
							String type = osTypeT.getText();
							String contact = osContactT.getText();
							String address = osAddressT.getText();
							
							
							rs.moveToInsertRow();
							
							rs.updateString("osID" , id);
							rs.updateString("Name" , name);
							rs.updateString("Type" , type);
							rs.updateString("Contact" , contact);
							rs.updateString("Address" , address);
							
							rs.insertRow();
							con.close();
							JOptionPane.showMessageDialog(null, "Added Successfully");
							c.repaint();
							addOSPanel.setVisible(true);
							}
							catch(Exception ex)
							{
								System.out.println(ex);
							}
						}
					}
						else if(ae.getSource()==osReset)
						{
							osIdT.setText("");
							osNameT.setText("");
							osAddressT.setText("");
							osContactT.setText("");
							osTypeT.setText("");
						}
						else if(ae.getSource() == osShow)
						{
							
							rPanel.setOpaque(true);
							rPanel.setVisible(false);
							osSTPanel.setVisible(true);
							osSTPanel.setVisible(true);
							c.repaint();
							try
							{
								Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\BS-SE\\BSSE-2\\OOP\\FinalProjectOriginal\\Database3.accdb");
								String sql = "SELECT * FROM Other_Staff";
								PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
								ResultSet rs = ps.executeQuery();
								rs.last();
								int count = rs.getRow();
								rs.first();
								
								if(rs.first()==false)
								{
									JOptionPane.showMessageDialog(null,"There is no data to show");
									rPanel.setVisible(true);
									
								}
								else
								{
									int i=0;
									//String rows[][]=new String[rs.getRow()][9];
									JTable table;
									JScrollPane ips;
									String [][] rows = new String[count+1][5];
									
									while(rs!=null)
									{
										
									
											String id = rs.getString("osID");
											String name = rs.getString("Name");
											String type = rs.getString("Type");
											String contact = rs.getString("Contact");
											String address = rs.getString("Address"); 
											
											
											 
											
												rows[i][0] = id;
												rows[i][1] = name;
												rows[i][2] = type;
												rows[i][3] = contact;
												rows[i][4] = address; 
													
												i++;
												
												String column [] = {"ID","Name","Type","Contact","Address"};
												table = new JTable(rows,column) ;
												table.setPreferredScrollableViewportSize(new Dimension(500,400));
												table.setFillsViewportHeight(true);
												ips = new JScrollPane(table) ;
												ips.setVisible(true);
												osSTPanel.setOpaque(true);
												osSTPanel.add(ips) ;
												c.add(osSTPanel);
												ips.setBounds(0,0,1260,630);
												
												rs.next();
												
												if(rs.next()==false)
												{
													rs.first();
													break;
												}
			
												
									}
								}
								con.close();
							}
								catch(Exception ex)
								{
									System.out.println(ex);
								}
							
						}
						else if(ae.getSource()==sHome)
						{
							addPanel.setOpaque(true);
							addPanel.setVisible(false);
							c.repaint();
							rPanel.setVisible(true);
							
							sIdST.setText("");
							
						}
						else if(ae.getSource()== tHome)
						{
							addTPanel.setOpaque(true);
							addTPanel.setVisible(false);
							c.repaint();
							rPanel.setVisible(true);
							
							tIdST.setText("");
						}
						else if(ae.getSource()== osHome)
						{
							addOSPanel.setOpaque(true);
							addOSPanel.setVisible(false);
							c.repaint();
							rPanel.setVisible(true);
							
							osIdST.setText("");
							
						}
				
						else if(ae.getSource()==searHome)
						{
							sIdST.setText("");
							tIdST.setText("");
							osIdST.setText("");
							
							addPanel.setOpaque(true);
							addPanel.setVisible(false);
							c.repaint();
							
							
							addTPanel.setOpaque(true);
							addTPanel.setVisible(false);
							c.repaint();
							
						
							addOSPanel.setOpaque(true);
							addOSPanel.setVisible(false);
							c.repaint();
							
							
							sTPanel.setOpaque(true);
							sTPanel.setVisible(false);
							c.repaint();
							
							sSTPanel.setOpaque(true);
							sSTPanel.setVisible(false);
							c.repaint();
							
							osTPanel.setOpaque(true);
							osTPanel.setVisible(false);
							c.repaint();
							
							osSTPanel.setOpaque(true);
							osSTPanel.setVisible(false);
							c.repaint();
							
							tTPanel.setOpaque(true);
							tTPanel.setVisible(false);
							c.repaint();
							
							tSTPanel.setOpaque(true);
							tSTPanel.setVisible(false);
							
							rPanel.setOpaque(true);
							rPanel.setVisible(true);
						}
						
				}
				
		}
		public class Test
		{
			public static void main(String [] args)
			{
				GUI g = new GUI();
				g.draw();
			}
		}

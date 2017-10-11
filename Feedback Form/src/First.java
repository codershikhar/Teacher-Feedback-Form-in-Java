import java.awt.*;
import java.awt.event.*;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.*;

public class First extends JFrame
{   
    First()
    {
    	JPanel container = new JPanel();
    	JScrollPane jsp = new JScrollPane();
    	this.add(jsp);
    	
        setLayout(new FlowLayout());
        this.setLayout(null);
        
        // ALL JLabelS
        JLabel nameJLabel = new JLabel("Name : ",JLabel.LEFT);
        JLabel rollNoJLabel = new JLabel("Roll No. : ",JLabel.LEFT);
        JLabel subjectJLabel = new JLabel("Subject : ",JLabel.LEFT);
        JLabel explicitCurriculumJLabel = new JLabel("EXPLICIT CURRICULUM",JLabel.LEFT);
        JLabel eJLabel1 = new JLabel("1. Teacher is prepared for class : ",JLabel.LEFT);
        JLabel eJLabel2 = new JLabel("2. Teacher knows His/Her Subject : ",JLabel.LEFT);
        JLabel eJLabel3 = new JLabel("3. Teacher is Organised and neet : ",JLabel.LEFT);
        JLabel eJLabel4 = new JLabel("4. Teacher Plans class time and Assignments : ",JLabel.LEFT);
        JLabel eJLabel5 = new JLabel("5. Teacher is flexible : ",JLabel.LEFT);
        JLabel eJLabel6 = new JLabel("6. Teacher is clear about assignments and test : ",JLabel.LEFT);
        JLabel eJLabel7 = new JLabel("7. Teacher allows you to be active in the classroom : ",JLabel.LEFT);
        JLabel eJLabel8 = new JLabel("8. Teacher manages the time well : ",JLabel.LEFT);
        JLabel eJLabel9 = new JLabel("9. Teacher returns homework in a timely manner : ",JLabel.LEFT);
        JLabel eJLabel10 = new JLabel("10. Teacher grades Fairly : ",JLabel.LEFT);
        JLabel eJLabel11 = new JLabel("11. I have learned a lot from the teacher about this subject : ",JLabel.LEFT);
        JLabel eJLabel12 = new JLabel("12. Teacher gives good feedback on projects : ",JLabel.LEFT);
        JLabel eJLabel13 = new JLabel("13. Teacher is creative in developing lesson plans : ",JLabel.LEFT);
        JLabel eJLabel14 = new JLabel("14. Teacher encorages students to speak up : ",JLabel.LEFT);
        
        JLabel implicitCurriculumJLabel = new JLabel("IMPLICIT CURRICULUM",JLabel.LEFT);
        JLabel iJLabel1 = new JLabel("15. Teacher follows through on what he/she says : ",JLabel.LEFT);
        JLabel iJLabel2 = new JLabel("16. Teacher listens student's point of view : ",JLabel.LEFT);
        JLabel iJLabel3 = new JLabel("17. Teacher respects the opinions and decision of students : ",JLabel.LEFT);
        JLabel iJLabel4 = new JLabel("18. Teacher accepts responcibility for his/her own mistakes : ",JLabel.LEFT);
        JLabel iJLabel5 = new JLabel("19. Teacher is willing to learn from students : ",JLabel.LEFT);
        JLabel iJLabel6 = new JLabel("20. Teacher is sensitive to the needs of students : ",JLabel.LEFT);
        JLabel iJLabel7 = new JLabel("21. Teacher's words and actions match : ",JLabel.LEFT);
        JLabel iJLabel8 = new JLabel("22. Teacher is fun to be with : ",JLabel.LEFT);
        JLabel iJLabel9 = new JLabel("23. Teacher likes and respects students : ",JLabel.LEFT);
        JLabel iJLabel10 = new JLabel("24. Teacher helps when you ask for help : ",JLabel.LEFT);
        JLabel iJLabel11 = new JLabel("25. Tecaher is consistent and fair in discipline : ",JLabel.LEFT);
        JLabel iJLabel12 = new JLabel("26. I trust this teacher : ",JLabel.LEFT);
        JLabel iJLabel13 = new JLabel("27. Teacher tries to model student's expectations : ",JLabel.LEFT);
        JLabel iJLabel14 = new JLabel("28. Teacher is firm in discipline without being too strict : ",JLabel.LEFT);
        
        this.add(nameJLabel);
        this.add(rollNoJLabel);
        this.add(subjectJLabel);
        this.add(explicitCurriculumJLabel);
        this.add(eJLabel1);
        this.add(eJLabel2);
        this.add(eJLabel3);
        this.add(eJLabel4);
        this.add(eJLabel5);
        this.add(eJLabel6);
        this.add(eJLabel7);
        this.add(eJLabel8);
        this.add(eJLabel9);
        this.add(eJLabel10);
        this.add(eJLabel11);
        this.add(eJLabel12);
        this.add(eJLabel13);
        this.add(eJLabel14);
        this.add(implicitCurriculumJLabel);
        this.add(iJLabel1);
        this.add(iJLabel2);
        this.add(iJLabel3);
        this.add(iJLabel4);
        this.add(iJLabel5);
        this.add(iJLabel6);
        this.add(iJLabel7);
        this.add(iJLabel8);
        this.add(iJLabel9);
        this.add(iJLabel10);
        this.add(iJLabel11);
        this.add(iJLabel12);
        this.add(iJLabel13);
        this.add(iJLabel14);
        
        nameJLabel.setBounds(70,0,350,20);
        rollNoJLabel.setBounds(70,20,350,20);
        subjectJLabel.setBounds(70,40,350,20);
        explicitCurriculumJLabel.setBounds(70, 60, 350, 20);
        eJLabel1.setBounds(70, 80, 350, 20);
        eJLabel2.setBounds(70, 100, 350, 20);
        eJLabel3.setBounds(70, 120, 350, 20);
        eJLabel4.setBounds(70, 140, 350, 20);
        eJLabel5.setBounds(70, 160, 350, 20);
        eJLabel6.setBounds(70, 180, 350, 20);
        eJLabel7.setBounds(70, 200, 350, 20);
        eJLabel8.setBounds(70, 220, 350, 20);
        eJLabel9.setBounds(70, 240, 350, 20);
        eJLabel10.setBounds(70, 260, 350, 20);
        eJLabel11.setBounds(70, 280, 350, 20);
        eJLabel12.setBounds(70, 300, 350, 20);
        eJLabel13.setBounds(70, 320, 350, 20);
        eJLabel14.setBounds(70, 340, 350, 20);
        implicitCurriculumJLabel.setBounds(70, 360, 350, 20);
        iJLabel1.setBounds(70, 380, 350, 20);
        iJLabel2.setBounds(70, 400, 350, 20);
        iJLabel3.setBounds(70, 420, 350, 20);
        iJLabel4.setBounds(70, 440, 350, 20);
        iJLabel5.setBounds(70, 460, 350, 20);
        iJLabel6.setBounds(70, 480, 350, 20);
        iJLabel7.setBounds(70, 500, 350, 20);
        iJLabel8.setBounds(70, 520, 350, 20);
        iJLabel9.setBounds(70, 540, 350, 20);
        iJLabel10.setBounds(70, 560, 350, 20);
        iJLabel11.setBounds(70, 580, 350, 20);
        iJLabel12.setBounds(70, 600, 350, 20);
        iJLabel13.setBounds(70, 620, 350, 20);
        iJLabel14.setBounds(70, 640, 350, 20);
        

        
        TextField nameTextField = new TextField(20);
        TextField rollNoTextField = new TextField(20);
        
        this.add(nameTextField);
        this.add(rollNoTextField);
        
        nameTextField.setBounds(430,0,100,20);
        rollNoTextField.setBounds(430,20,100,20);
        
        Choice sub = new Choice();
        Choice ec1 = new Choice();
        Choice ec2 = new Choice();
        Choice ec3 = new Choice();
        Choice ec4 = new Choice();
        Choice ec5 = new Choice();
        Choice ec6 = new Choice();
        Choice ec7 = new Choice();
        Choice ec8 = new Choice();
        Choice ec9 = new Choice();
        Choice ec10 = new Choice();
        Choice ec11 = new Choice();
        Choice ec12 = new Choice();
        Choice ec13 = new Choice();
        Choice ec14 = new Choice();
        Choice ic1 = new Choice();
        Choice ic2 = new Choice();
        Choice ic3 = new Choice();
        Choice ic4 = new Choice();
        Choice ic5 = new Choice();
        Choice ic6 = new Choice();
        Choice ic7 = new Choice();
        Choice ic8 = new Choice();
        Choice ic9 = new Choice();
        Choice ic10 = new Choice();
        Choice ic11 = new Choice();
        Choice ic12 = new Choice();
        Choice ic13 = new Choice();
        Choice ic14 = new Choice();
        
        sub.add("TOC"); sub.add("CN"); sub.add(""); sub.add(""); sub.add("");
        ec1.add("Strongly Disagree"); ec1.add("Disagree"); ec1.add("Neutral"); ec1.add("Agree"); ec1.add("Strongly Agree");
        ec2.add("Strongly Disagree"); ec2.add("Disagree"); ec2.add("Neutral"); ec2.add("Agree"); ec2.add("Strongly Agree");
        ec3.add("Strongly Disagree"); ec3.add("Disagree"); ec3.add("Neutral"); ec3.add("Agree"); ec3.add("Strongly Agree");
        ec4.add("Strongly Disagree"); ec4.add("Disagree"); ec4.add("Neutral"); ec4.add("Agree"); ec4.add("Strongly Agree");
        ec5.add("Strongly Disagree"); ec5.add("Disagree"); ec5.add("Neutral"); ec5.add("Agree"); ec5.add("Strongly Agree");
        ec6.add("Strongly Disagree"); ec6.add("Disagree"); ec6.add("Neutral"); ec6.add("Agree"); ec6.add("Strongly Agree");
        ec7.add("Strongly Disagree"); ec7.add("Disagree"); ec7.add("Neutral"); ec7.add("Agree"); ec7.add("Strongly Agree");
        ec8.add("Strongly Disagree"); ec8.add("Disagree"); ec8.add("Neutral"); ec8.add("Agree"); ec8.add("Strongly Agree");
        ec9.add("Strongly Disagree"); ec9.add("Disagree"); ec9.add("Neutral"); ec9.add("Agree"); ec9.add("Strongly Agree");
        ec10.add("Strongly Disagree"); ec10.add("Disagree"); ec10.add("Neutral"); ec10.add("Agree"); ec10.add("Strongly Agree");
        ec11.add("Strongly Disagree"); ec11.add("Disagree"); ec11.add("Neutral"); ec11.add("Agree"); ec11.add("Strongly Agree");
        ec12.add("Strongly Disagree"); ec12.add("Disagree"); ec12.add("Neutral"); ec12.add("Agree"); ec12.add("Strongly Agree");
        ec13.add("Strongly Disagree"); ec13.add("Disagree"); ec13.add("Neutral"); ec13.add("Agree"); ec13.add("Strongly Agree");
        ec14.add("Strongly Disagree"); ec14.add("Disagree"); ec14.add("Neutral"); ec14.add("Agree"); ec14.add("Strongly Agree");
        
        ic1.add("Strongly Disagree"); ic1.add("Disagree"); ic1.add("Neutral"); ic1.add("Agree"); ic1.add("Strongly Agree");
        ic2.add("Strongly Disagree"); ic2.add("Disagree"); ic2.add("Neutral"); ic2.add("Agree"); ic2.add("Strongly Agree");
        ic3.add("Strongly Disagree"); ic3.add("Disagree"); ic3.add("Neutral"); ic3.add("Agree"); ic3.add("Strongly Agree");
        ic4.add("Strongly Disagree"); ic4.add("Disagree"); ic4.add("Neutral"); ic4.add("Agree"); ic4.add("Strongly Agree");
        ic5.add("Strongly Disagree"); ic5.add("Disagree"); ic5.add("Neutral"); ic5.add("Agree"); ic5.add("Strongly Agree");
        ic6.add("Strongly Disagree"); ic6.add("Disagree"); ic6.add("Neutral"); ic6.add("Agree"); ic6.add("Strongly Agree");
        ic7.add("Strongly Disagree"); ic7.add("Disagree"); ic7.add("Neutral"); ic7.add("Agree"); ic7.add("Strongly Agree");
        ic8.add("Strongly Disagree"); ic8.add("Disagree"); ic8.add("Neutral"); ic8.add("Agree"); ic8.add("Strongly Agree");
        ic9.add("Strongly Disagree"); ic9.add("Disagree"); ic9.add("Neutral"); ic9.add("Agree"); ic9.add("Strongly Agree");
        ic10.add("Strongly Disagree"); ic10.add("Disagree"); ic10.add("Neutral"); ic10.add("Agree"); ic10.add("Strongly Agree");
        ic11.add("Strongly Disagree"); ic11.add("Disagree"); ic11.add("Neutral"); ic11.add("Agree"); ic11.add("Strongly Agree");
        ic12.add("Strongly Disagree"); ic12.add("Disagree"); ic12.add("Neutral"); ic12.add("Agree"); ic12.add("Strongly Agree");
        ic13.add("Strongly Disagree"); ic13.add("Disagree"); ic13.add("Neutral"); ic13.add("Agree"); ic13.add("Strongly Agree");
        ic14.add("Strongly Disagree"); ic14.add("Disagree"); ic14.add("Neutral"); ic14.add("Agree"); ic14.add("Strongly Agree");
        
        sub.setBounds(430, 40, 70, 20);
        ec1.setBounds(430, 80, 125, 20);
        ec2.setBounds(430, 100, 125, 20);
        ec3.setBounds(430, 120, 125, 20);
        ec4.setBounds(430, 140, 125, 20);
        ec5.setBounds(430, 160, 125, 20);
        ec6.setBounds(430, 180, 125, 20);
        ec7.setBounds(430, 200, 125, 20);
        ec8.setBounds(430, 220, 125, 20);
        ec9.setBounds(430, 240, 125, 20);
        ec10.setBounds(430, 260, 125, 20);
        ec11.setBounds(430, 280, 125, 20);
        ec12.setBounds(430, 300, 125, 20);
        ec13.setBounds(430, 320, 125, 20);
        ec14.setBounds(430, 340, 125, 20);
        ic1.setBounds(430, 380, 125, 20);
        ic2.setBounds(430, 400, 125, 20);
        ic3.setBounds(430, 420, 125, 20);
        ic4.setBounds(430, 440, 125, 20);
        ic5.setBounds(430, 460, 125, 20);
        ic6.setBounds(430, 480, 125, 20);
        ic7.setBounds(430, 500, 125, 20);
        ic8.setBounds(430, 520, 125, 20);
        ic9.setBounds(430, 540, 125, 20);
        ic10.setBounds(430, 560, 125, 20);
        ic11.setBounds(430, 580, 125, 20);
        ic12.setBounds(430, 600, 125, 20);
        ic13.setBounds(430, 620, 125, 20);
        ic14.setBounds(430, 640, 125, 20);
        
        this.add(sub);
        this.add(ec1);
        this.add(ec2);
        this.add(ec3);
        this.add(ec4);
        this.add(ec5);
        this.add(ec6);
        this.add(ec7);
        this.add(ec8);
        this.add(ec9);
        this.add(ec10);
        this.add(ec11);
        this.add(ec12);
        this.add(ec13);
        this.add(ec14);
        this.add(ic1);
        this.add(ic2);
        this.add(ic3);
        this.add(ic4);
        this.add(ic5);
        this.add(ic6);
        this.add(ic7);
        this.add(ic8);
        this.add(ic9);
        this.add(ic10);
        this.add(ic11);
        this.add(ic12);
        this.add(ic13);
        this.add(ic14);
        
        
        JButton b1 = new JButton("Submit");
        b1.addActionListener(new ActionListener()
        {  
            public void actionPerformed(ActionEvent e)
            {  
            	try 
            	{
					FileOutputStream out = new FileOutputStream("output.txt");
					out.write("Student Name : ".getBytes());
					out.write(nameTextField.getText().getBytes());
					out.write("\n".getBytes());
					out.write("Student Roll No. : ".getBytes());
					out.write(rollNoTextField.getText().getBytes());
					out.write("\n".getBytes());
					out.write("Subject Selected : ".getBytes());
					out.write(sub.getItem(sub.getSelectedIndex()).getBytes());
					out.write("\n".getBytes());
					
					float avg = getAvg();
					out.write("OverAll Feedback : ".getBytes());
					out.write(Float.toString(avg).getBytes());
					out.write("\n".getBytes());
					
					out.write("1. Teacher is prepared for class : ".getBytes());
					out.write(ec1.getItem(ec1.getSelectedIndex()).getBytes());
					out.write("\n".getBytes());
					
					out.write("2. Teacher knows His/Her Subject : ".getBytes());
					out.write(ec2.getItem(ec2.getSelectedIndex()).getBytes());
					out.write("\n".getBytes());
					
					out.write("3. Teacher is Organised and neet : ".getBytes());
					out.write(ec3.getItem(ec3.getSelectedIndex()).getBytes());
					out.write("\n".getBytes());
					
					out.write("4. Teacher Plans class time and Assignments : ".getBytes());
					out.write(ec4.getItem(ec4.getSelectedIndex()).getBytes());
					out.write("\n".getBytes());
					
					out.write("5. Teacher is flexible : ".getBytes());
					out.write(ec5.getItem(ec5.getSelectedIndex()).getBytes());
					out.write("\n".getBytes());
					
					out.write("6. Teacher is clear about assignments and test : ".getBytes());
					out.write(ec6.getItem(ec6.getSelectedIndex()).getBytes());
					out.write("\n".getBytes());
					
					out.write("7. Teacher allows you to be active in the classroom : ".getBytes());
					out.write(ec7.getItem(ec7.getSelectedIndex()).getBytes());
					out.write("\n".getBytes());
					
					out.write("8. Teacher manages the time well : ".getBytes());
					out.write(ec8.getItem(ec8.getSelectedIndex()).getBytes());
					out.write("\n".getBytes());
					
					out.write("9. Teacher returns homework in a timely manner : ".getBytes());
					out.write(ec9.getItem(ec9.getSelectedIndex()).getBytes());
					out.write("\n".getBytes());
					
					out.write("10. Teacher grades Fairly : ".getBytes());
					out.write(ec10.getItem(ec10.getSelectedIndex()).getBytes());
					out.write("\n".getBytes());
					
					out.write("11. I have learned a lot from the teacher about this subject : ".getBytes());
					out.write(ec11.getItem(ec11.getSelectedIndex()).getBytes());
					out.write("\n".getBytes());
					
					out.write("12. Teacher gives good feedback on projects : ".getBytes());
					out.write(ec12.getItem(ec12.getSelectedIndex()).getBytes());
					out.write("\n".getBytes());
					
					out.write("13. Teacher is creative in developing lesson plans : ".getBytes());
					out.write(ec13.getItem(ec13.getSelectedIndex()).getBytes());
					out.write("\n".getBytes());
					
					out.write("14. Teacher encorages students to speak up : ".getBytes());
					out.write(ec14.getItem(ec14.getSelectedIndex()).getBytes());
					out.write("\n".getBytes());
					
					out.write("15. Teacher follows through on what he/she says : ".getBytes());
					out.write(ic1.getItem(ic1.getSelectedIndex()).getBytes());
					out.write("\n".getBytes());
					
					out.write("16. Teacher listens student's point of view : ".getBytes());
					out.write(ic2.getItem(ic2.getSelectedIndex()).getBytes());
					out.write("\n".getBytes());
					
					out.write("17. Teacher respects the opinions and decision of students : ".getBytes());
					out.write(ic3.getItem(ic3.getSelectedIndex()).getBytes());
					out.write("\n".getBytes());
					
					out.write("18. Teacher accepts responcibility for his/her own mistakes : ".getBytes());
					out.write(ic4.getItem(ic4.getSelectedIndex()).getBytes());
					out.write("\n".getBytes());
					
					out.write("19. Teacher is willing to learn from students : ".getBytes());
					out.write(ic5.getItem(ic5.getSelectedIndex()).getBytes());
					out.write("\n".getBytes());
					
					out.write("20. Teacher is sensitive to the needs of students : ".getBytes());
					out.write(ic6.getItem(ic6.getSelectedIndex()).getBytes());
					out.write("\n".getBytes());
					
					out.write("21. Teacher's words and actions match : ".getBytes());
					out.write(ic7.getItem(ic7.getSelectedIndex()).getBytes());
					out.write("\n".getBytes());
					
					out.write("22. Teacher is fun to be with : ".getBytes());
					out.write(ic8.getItem(ic8.getSelectedIndex()).getBytes());
					out.write("\n".getBytes());
					
					out.write("23. Teacher likes and respects students : ".getBytes());
					out.write(ic9.getItem(ic9.getSelectedIndex()).getBytes());
					out.write("\n".getBytes());
					
					out.write("24. Teacher helps when you ask for help : ".getBytes());
					out.write(ic10.getItem(ic10.getSelectedIndex()).getBytes());
					out.write("\n".getBytes());
					
					out.write("25. Tecaher is consistent and fair in discipline : ".getBytes());
					out.write(ic11.getItem(ic11.getSelectedIndex()).getBytes());
					out.write("\n".getBytes());out.write("25. Tecaher is consistent and fair in discipline : ".getBytes());
					
					out.write("26. I trust this teacher : ".getBytes());
					out.write(ic12.getItem(ic12.getSelectedIndex()).getBytes());
					out.write("\n".getBytes());
					
					out.write("27. Teacher tries to model student's expectations : ".getBytes());
					out.write(ic13.getItem(ic13.getSelectedIndex()).getBytes());
					out.write("\n".getBytes());
					
					out.write("28. Teacher is firm in discipline without being too strict : ".getBytes());
					out.write(ic14.getItem(ic14.getSelectedIndex()).getBytes());
					out.write("\n".getBytes());
					
					out.close();
				} catch (IOException e1) 
            	{
					e1.printStackTrace();
				}            	
            }

			public float getAvg() 
			{
				float avg = 0;
				
				Object o[] = {ec1, ec2, ec3, ec4, ec5, ec6, ec7, ec8, ec9, ec10, ec11, ec12, ec13, 
						ec14, ic1, ic2, ic3, ic4, ic5, ic6, ic7, ic8, ic9, ic10, ic11, ic12, 
						ic13, ic14};
				
				for(int i=0; i<28; i++)
				{
					String s = ((Choice) o[i]).getItem(((Choice) o[i]).getSelectedIndex());
					if(s == "Strongly Agree") avg += 5;
					else if(s == "Agree") avg += 4;
					else if(s == "Neutral") avg += 3;
					else if(s == "Disagree") avg += 2;
					else avg += 1;
				}
				
				return avg/28;
			}  
        });
        
        this.add(b1);
        b1.setBounds(270,660,100,40);
    }
    
    public static void main(String[] args) 
    {
    	First ml=new First();
        ml.setVisible(true);
        ml.setSize(600,800);
        ml.setTitle("FeedBack Form");
    }
}

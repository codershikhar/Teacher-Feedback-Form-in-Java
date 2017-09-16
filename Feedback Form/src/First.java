import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class First extends Frame
{   
    First()
    {
        setLayout(new FlowLayout());
        this.setLayout(null);
        
        // ALL LABELS
        Label nameLabel = new Label("Name : ",Label.LEFT);
        Label rollNoLabel = new Label("Roll No. : ",Label.LEFT);
        Label subjectLabel = new Label("Subject : ",Label.LEFT);
        Label explicitCurriculumLabel = new Label("EXPLICIT CURRICULUM",Label.LEFT);
        Label eLabel1 = new Label("1. Teacher is prepared for class : ",Label.LEFT);
        Label eLabel2 = new Label("2. Teacher knows His/Her Subject : ",Label.LEFT);
        Label eLabel3 = new Label("3. Teacher is Organised and neet : ",Label.LEFT);
        Label eLabel4 = new Label("4. Teacher Plans class time and Assignments : ",Label.LEFT);
        Label eLabel5 = new Label("5. Teacher is flexible : ",Label.LEFT);
        Label eLabel6 = new Label("6. Teacher is clear about assignments and test : ",Label.LEFT);
        Label eLabel7 = new Label("7. Teacher allows you to be active in the classroom : ",Label.LEFT);
        Label eLabel8 = new Label("8. Teacher manages the time well : ",Label.LEFT);
        Label eLabel9 = new Label("9. Teacher returns homework in a timely manner : ",Label.LEFT);
        Label eLabel10 = new Label("10. Teacher grades Fairly : ",Label.LEFT);
        Label eLabel11 = new Label("11. I have learned a lot from the teacher about this subject : ",Label.LEFT);
        Label eLabel12 = new Label("12. Teacher gives good feedback on projects : ",Label.LEFT);
        Label eLabel13 = new Label("13. Teacher is creative in developing lesson plans : ",Label.LEFT);
        Label eLabel14 = new Label("14. Teacher encorages students to speak up : ",Label.LEFT);
        
        Label implicitCurriculumLabel = new Label("IMPLICIT CURRICULUM",Label.LEFT);
        Label iLabel1 = new Label("15. Teacher follows through on what he/she says : ",Label.LEFT);
        Label iLabel2 = new Label("16. Teacher listens student's point of view : ",Label.LEFT);
        Label iLabel3 = new Label("17. Teacher respects the opinions and decision of students : ",Label.LEFT);
        Label iLabel4 = new Label("18. Teacher accepts responcibility for his/her own mistakes : ",Label.LEFT);
        Label iLabel5 = new Label("19. Teacher is willing to learn from students : ",Label.LEFT);
        Label iLabel6 = new Label("20. Teacher is sensitive to the needs of students : ",Label.LEFT);
        Label iLabel7 = new Label("21. Teacher's words and actions match : ",Label.LEFT);
        Label iLabel8 = new Label("22. Teacher is fun to be with : ",Label.LEFT);
        Label iLabel9 = new Label("23. Teacher likes and respects students : ",Label.LEFT);
        Label iLabel10 = new Label("24. Teacher helps when you ask for help : ",Label.LEFT);
        Label iLabel11 = new Label("25. Tecaher is consistent and fair in discipline : ",Label.LEFT);
        Label iLabel12 = new Label("26. I trust this teacher : ",Label.LEFT);
        Label iLabel13 = new Label("27. Teacher tries to model student's expectations : ",Label.LEFT);
        Label iLabel14 = new Label("28. Teacher is firm in discipline without being too strict : ",Label.LEFT);
        
        this.add(nameLabel);
        this.add(rollNoLabel);
        this.add(subjectLabel);
        this.add(explicitCurriculumLabel);
        this.add(eLabel1);
        this.add(eLabel2);
        this.add(eLabel3);
        this.add(eLabel4);
        this.add(eLabel5);
        this.add(eLabel6);
        this.add(eLabel7);
        this.add(eLabel8);
        this.add(eLabel9);
        this.add(eLabel10);
        this.add(eLabel11);
        this.add(eLabel12);
        this.add(eLabel13);
        this.add(eLabel14);
        this.add(implicitCurriculumLabel);
        this.add(iLabel1);
        this.add(iLabel2);
        this.add(iLabel3);
        this.add(iLabel4);
        this.add(iLabel5);
        this.add(iLabel6);
        this.add(iLabel7);
        this.add(iLabel8);
        this.add(iLabel9);
        this.add(iLabel10);
        this.add(iLabel11);
        this.add(iLabel12);
        this.add(iLabel13);
        this.add(iLabel14);
        
        nameLabel.setBounds(70,30,350,20);
        rollNoLabel.setBounds(70,50,350,20);
        subjectLabel.setBounds(70,70,350,20);
        explicitCurriculumLabel.setBounds(70, 90, 350, 20);
        eLabel1.setBounds(70, 110, 350, 20);
        eLabel2.setBounds(70, 130, 350, 20);
        eLabel3.setBounds(70, 150, 350, 20);
        eLabel4.setBounds(70, 170, 350, 20);
        eLabel5.setBounds(70, 190, 350, 20);
        eLabel6.setBounds(70, 210, 350, 20);
        eLabel7.setBounds(70, 230, 350, 20);
        eLabel8.setBounds(70, 250, 350, 20);
        eLabel9.setBounds(70, 270, 350, 20);
        eLabel10.setBounds(70, 290, 350, 20);
        eLabel11.setBounds(70, 310, 350, 20);
        eLabel12.setBounds(70, 330, 350, 20);
        eLabel13.setBounds(70, 350, 350, 20);
        eLabel14.setBounds(70, 370, 350, 20);
        implicitCurriculumLabel.setBounds(70, 390, 350, 20);
        iLabel1.setBounds(70, 410, 350, 20);
        iLabel2.setBounds(70, 430, 350, 20);
        iLabel3.setBounds(70, 450, 350, 20);
        iLabel4.setBounds(70, 470, 350, 20);
        iLabel5.setBounds(70, 490, 350, 20);
        iLabel6.setBounds(70, 510, 350, 20);
        iLabel7.setBounds(70, 530, 350, 20);
        iLabel8.setBounds(70, 550, 350, 20);
        iLabel9.setBounds(70, 570, 350, 20);
        iLabel10.setBounds(70, 590, 350, 20);
        iLabel11.setBounds(70, 610, 350, 20);
        iLabel12.setBounds(70, 630, 350, 20);
        iLabel13.setBounds(70, 650, 350, 20);
        iLabel14.setBounds(70, 670, 350, 20);
        

        
        TextField nameTextField = new TextField(20);
        TextField rollNoTextField = new TextField(20);
        
        this.add(nameTextField);
        this.add(rollNoTextField);
        
        nameTextField.setBounds(430,30,100,20);
        rollNoTextField.setBounds(430,50,100,20);
        
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
        ec1.add("1"); ec1.add("2"); ec1.add("3"); ec1.add("4"); ec1.add("5");
        ec2.add("1"); ec2.add("2"); ec2.add("3"); ec2.add("4"); ec2.add("5");
        ec3.add("1"); ec3.add("2"); ec3.add("3"); ec3.add("4"); ec3.add("5");
        ec4.add("1"); ec4.add("2"); ec4.add("3"); ec4.add("4"); ec4.add("5");
        ec5.add("1"); ec5.add("2"); ec5.add("3"); ec5.add("4"); ec5.add("5");
        ec6.add("1"); ec6.add("2"); ec6.add("3"); ec6.add("4"); ec6.add("5");
        ec7.add("1"); ec7.add("2"); ec7.add("3"); ec7.add("4"); ec7.add("5");
        ec8.add("1"); ec8.add("2"); ec8.add("3"); ec8.add("4"); ec8.add("5");
        ec9.add("1"); ec9.add("2"); ec9.add("3"); ec9.add("4"); ec9.add("5");
        ec10.add("1"); ec10.add("2"); ec10.add("3"); ec10.add("4"); ec10.add("5");
        ec11.add("1"); ec11.add("2"); ec11.add("3"); ec11.add("4"); ec11.add("5");
        ec12.add("1"); ec12.add("2"); ec12.add("3"); ec12.add("4"); ec12.add("5");
        ec13.add("1"); ec13.add("2"); ec13.add("3"); ec13.add("4"); ec13.add("5");
        ec14.add("1"); ec14.add("2"); ec14.add("3"); ec14.add("4"); ec14.add("5");
        
        ic1.add("1"); ic1.add("2"); ic1.add("3"); ic1.add("4"); ic1.add("5");
        ic2.add("1"); ic2.add("2"); ic2.add("3"); ic2.add("4"); ic2.add("5");
        ic3.add("1"); ic3.add("2"); ic3.add("3"); ic3.add("4"); ic3.add("5");
        ic4.add("1"); ic4.add("2"); ic4.add("3"); ic4.add("4"); ic4.add("5");
        ic5.add("1"); ic5.add("2"); ic5.add("3"); ic5.add("4"); ic5.add("5");
        ic6.add("1"); ic6.add("2"); ic6.add("3"); ic6.add("4"); ic6.add("5");
        ic7.add("1"); ic7.add("2"); ic7.add("3"); ic7.add("4"); ic7.add("5");
        ic8.add("1"); ic8.add("2"); ic8.add("3"); ic8.add("4"); ic8.add("5");
        ic9.add("1"); ic9.add("2"); ic9.add("3"); ic9.add("4"); ic9.add("5");
        ic10.add("1"); ic10.add("2"); ic10.add("3"); ic10.add("4"); ic10.add("5");
        ic11.add("1"); ic11.add("2"); ic11.add("3"); ic11.add("4"); ic11.add("5");
        ic12.add("1"); ic12.add("2"); ic12.add("3"); ic12.add("4"); ic12.add("5");
        ic13.add("1"); ic13.add("2"); ic13.add("3"); ic13.add("4"); ic13.add("5");
        ic14.add("1"); ic14.add("2"); ic14.add("3"); ic14.add("4"); ic14.add("5");
        
        sub.setBounds(430, 70, 70, 20);
        ec1.setBounds(430, 110, 35, 20);
        ec2.setBounds(430, 130, 35, 20);
        ec3.setBounds(430, 150, 35, 20);
        ec4.setBounds(430, 170, 35, 20);
        ec5.setBounds(430, 190, 35, 20);
        ec6.setBounds(430, 210, 35, 20);
        ec7.setBounds(430, 230, 35, 20);
        ec8.setBounds(430, 250, 35, 20);
        ec9.setBounds(430, 270, 35, 20);
        ec10.setBounds(430, 290, 35, 20);
        ec11.setBounds(430, 310, 35, 20);
        ec12.setBounds(430, 330, 35, 20);
        ec13.setBounds(430, 350, 35, 20);
        ec14.setBounds(430, 370, 35, 20);
        ic1.setBounds(430, 410, 35, 20);
        ic2.setBounds(430, 430, 35, 20);
        ic3.setBounds(430, 450, 35, 20);
        ic4.setBounds(430, 470, 35, 20);
        ic5.setBounds(430, 490, 35, 20);
        ic6.setBounds(430, 510, 35, 20);
        ic7.setBounds(430, 530, 35, 20);
        ic8.setBounds(430, 550, 35, 20);
        ic9.setBounds(430, 570, 35, 20);
        ic10.setBounds(430, 590, 35, 20);
        ic11.setBounds(430, 610, 35, 20);
        ic12.setBounds(430, 630, 35, 20);
        ic13.setBounds(430, 650, 35, 20);
        ic14.setBounds(430, 670, 35, 20);
        
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
        
        
        Button b1 = new Button("Submit");
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
        });
        
        this.add(b1);
        b1.setBounds(300,690,70,40);
    }
    
    public static void main(String[] args) 
    {
    	First ml=new First();
        ml.setVisible(true);
        ml.setSize(600,800);
        ml.setTitle("FeedBack Form");
    }
}
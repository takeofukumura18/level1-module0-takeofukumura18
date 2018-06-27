/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window
                int score = 0;
		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
                String peyton="https://usatftw.files.wordpress.com/2016/02/peyton.jpg?w=1000&h=600&crop=1";
		// 2. create a variable of type "Component" that will hold your image
               Component holder;
		// 3. use the "createImage()" method below to initialize your Component
               holder = createImage(peyton);
               
               holder.setSize(500, 500);
		// 4. add the image to the quiz window
               quizWindow.add(holder);
		// 5. call the pack() method on the quiz window
               quizWindow.pack();
               
              
		// 6. ask a question that relates to the image
   			String theirs= JOptionPane.showInputDialog("Who is this quarterback(He is the G.O.A.T.)");
		// 7. print "CORRECT" if the user gave the right answer
               if(theirs.equals("Peyton Manning")) {
            	   System.out.println("Correct! Go Broncos!");
            	   score++;
               }
		// 8. print "INCORRECT" if the answer is wrong
               if(!theirs.equals("Peyton Manning")) {
            	   System.out.println("WRONG!");
            	   
               }
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
               quizWindow.remove(holder);
		// 10. find another image and create it (might take more than one line of code)
               String tom="https://www.japantimes.co.jp/wp-content/uploads/2015/11/sp-nfl-a-20151201.jpg";
		// 11. add the second image to the quiz window
               Component holder1;
               
               holder1 = createImage(tom);
               
               quizWindow.add(holder1);
		// 12. pack the quiz window
               quizWindow.pack();
		// 13. ask another question
               
               String theirs1=JOptionPane.showInputDialog("Who is this quarterback(he is the worst of all time)");
		// 14+ check answer, say if correct or incorrect, etc.
               if(theirs1.equals("Tom Brady")) {
            	   System.out.println("Correct! BRADY SUCKS!");
            	   
            	   
               }
               if(!theirs1.equals("Tom Brady")) {
            	   System.out.println("WRONG! THIS QUARTEBACK SUCKS!");
            	   score=score+0;
            	  
               }
               
               quizWindow.remove(holder1);
               JOptionPane.showMessageDialog(null, "Your Done!");
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}






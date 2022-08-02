package model;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

	public class SegueMouse extends JFrame implements MouseListener {

		JLabel label;

		ImageIcon nervous;
		ImageIcon a;
		ImageIcon b;	
		ImageIcon c;
		ImageIcon d;
		ImageIcon e;
		ImageIcon f;
		ImageIcon g;
		ImageIcon h;
		ImageIcon i;

		public SegueMouse() {

		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  this.setSize(300,300);

		  this.setLayout(new FlowLayout());

		  nervous = new ImageIcon("images/nervous.png");
		  a = new ImageIcon("images/a.png");
		  b = new ImageIcon("images/b.png");
		  c = new ImageIcon("images/c.png");
		  d = new ImageIcon("images/d.png");
		  e = new ImageIcon("images/e.png");
		  f = new ImageIcon("images/f.png");
		  g = new ImageIcon("images/g.png");
		  h = new ImageIcon("images/h.png");
		  i = new ImageIcon("images/i.png");
		
		  label = new JLabel();
		  label.addMouseListener(this);
		  label.setIcon(e);

		  this.add(label);
		  this.pack();
		  this.setLocationRelativeTo(null);
		  this.setVisible(true);

		}

		@Override
		public void mouseClicked(MouseEvent e) {
  		   label.setIcon(nervous);//nervoso
          
		}

		@Override
		public void mousePressed(MouseEvent e) {
  		    //TODO Auto-generated method stub
	
		}

		@Override
		public void mouseReleased(MouseEvent e) {
  		    //TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
  		    //TODO Auto-generated method stub

			if((e.getX() >= 0 && e.getX() <=90) && (e.getY() >= 0 && e.getY() <=90)){
		 	   label.setIcon(a);//A
			}
			else if((e.getX() >= 0 && e.getX() <=90) && (e.getY() > 90 && e.getY() <=195)){
			  label.setIcon(d);//D
      		        }
			else if((e.getX() >= 0 && e.getX() <=90) && (e.getY() > 195 && e.getY() <=300)){
			  label.setIcon(g);//g
      		        }
			else if((e.getX() > 90 && e.getX() <=205) && (e.getY() >= 0 && e.getY() <=90)){
			  label.setIcon(b);//b
			}
			else if((e.getX() > 90 && e.getX() <=205) && (e.getY() > 195 && e.getY() <=300)){
			  label.setIcon(h);//h
      		        }
			else if((e.getX() > 205 && e.getX() <=300) && (e.getY() >= 0 && e.getY() <=90)){
			  label.setIcon(c);//c
    		        }
			else if((e.getX() > 205 && e.getX() <=300) && (e.getY() > 90 && e.getY() <=195)){
			  label.setIcon(f);//f
			}
 			else{
			   label.setIcon(i);//i
			}

		}

		@Override
		public void mouseExited(MouseEvent e) {
  		    //TODO Auto-generated method stub
	

	 	label.setIcon(this.e);
		

		}
		

	}

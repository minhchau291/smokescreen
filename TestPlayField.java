package SubFolder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.GridLayout;
import java.awt.PopupMenu;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import SubFolder.XOButton;
import SubFolder.XOButton;

/**
 *
 * @author Admin
 */
public class TestPlayField extends JFrame  {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    XOButton btn[] = new XOButton[400];
         
    public TestPlayField(){
    frame.setTitle("CAMPAIGN");
    frame.setSize(800, 800);
    
    frame.add(panel);
    panel.setSize(800, 800);
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    
    panel.setLayout(new GridLayout(20, 20, 0, 0));
    
       
      for (int i=0;i<400;i++){
          btn[i] = new XOButton();
          
          panel.add(btn[i]);
          
      }
      
       
    frame.repaint();
    frame.setVisible(true);
    
    
    
    }
              
    public static void main(String[] args) {
        new TestPlayField();
            
    }   
    }

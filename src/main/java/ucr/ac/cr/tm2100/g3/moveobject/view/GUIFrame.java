/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.moveobject.view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Ricardo
 */
public class GUIFrame extends JFrame{
    private JButton btnMove;
    //private JPanel canvas;
    private PanelCanva panelCanva;
    public GUIFrame(int widght, int height){
        
        this.setSize(widght, height);
        this.setVisible(true);
    }
    
    public GUIFrame(){
        this.btnMove=new JButton("Move object");
        this.panelCanva=new PanelCanva();
        this.add(this.panelCanva, BorderLayout.CENTER);
       // this.canvas=new JPanel();
       // this.canvas.setBackground(Color.red);
        //this.add(this.canvas,BorderLayout.CENTER);
        this.add(this.btnMove,BorderLayout.SOUTH);
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
}
}


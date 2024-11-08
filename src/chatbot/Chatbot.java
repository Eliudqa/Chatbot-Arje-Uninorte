/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chatbot;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author HOLA
 */
public class Chatbot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

   ChatbotFrame frame = new ChatbotFrame ();
   JPanel panel = new JPanel();
   frame.getContentPane().setBackground(Color.GRAY);
   frame.setSize(944, 450);
   frame.setVisible(true);
   
   
    }
    
}

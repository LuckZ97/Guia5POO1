package sv.edu.INIM.guia5poo1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ernesto y Gilmar :D
 */
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame{
    public Main(){
        
        JLabel lblHola = new JLabel("Hola");
        add(lblHola);
        
        this.setSize(200,200);
        this.setTitle("JFrame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Main();
        
        
        }
    
    }

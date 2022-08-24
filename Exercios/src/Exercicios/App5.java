package Exercicios;
import javax.swing.JOptionPane;

public class App5 {
    public static void main(String[] args) {
       
    
        double a, b, m;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite sua 1º nota"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite sua 2º nota"));
     
        
        
        m = a + b / 2;
   
        JOptionPane.showMessageDialog(parentComponent:null, message:"MEDIA = "+m);
   }
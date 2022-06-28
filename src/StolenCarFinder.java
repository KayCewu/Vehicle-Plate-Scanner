
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cewuk
 */
public class StolenCarFinder {
JFrame CarFinder=new JFrame();
JPanel Top=new JPanel(new FlowLayout());
JPanel Middle=new JPanel(new GridLayout(1,1,10,10));
JPanel Bottom=new JPanel (new GridLayout());
JLabel lblHeader=new JLabel("Stolen Vehicle Finder");
JLabel lblRegNo=new JLabel("Vehicle plane number");
JTextField txtNumPlate=new JTextField();





    public static void main(String[] args) {
        
    }

    
}

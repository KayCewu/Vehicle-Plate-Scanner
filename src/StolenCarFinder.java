
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JButton;
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

    JFrame CarFinder = new JFrame();
    JPanel Top = new JPanel(new FlowLayout());
    JPanel Middle = new JPanel(new FlowLayout());
    JPanel Bottom = new JPanel(new FlowLayout());
    JLabel lblHeader = new JLabel("Stolen Vehicle Finder");
    JLabel lblRegNo = new JLabel("Vehicle plane number:");
    JTextField txtNumPlate = new JTextField(20);
    JButton btnVerify = new JButton("Verify");
//Creating user interface

    public void ShowInterface() {
        Top.add(lblHeader);
        Middle.add(lblRegNo);
        Middle.add(txtNumPlate);
        Middle.add(btnVerify);
       // btnVerify.addActionListener(new Verify());
        btnVerify.setToolTipText("Press this button to verify license number");
        //Adding panels to frame
        CarFinder.add(Top, BorderLayout.NORTH);
        CarFinder.add(Middle, BorderLayout.CENTER);
        //Set Frame visibility
        CarFinder.setVisible(true);
        CarFinder.setSize(800,200);
        CarFinder.setLocation(100,100);
        CarFinder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
StolenCarFinder ObjShow=new StolenCarFinder();
ObjShow.ShowInterface();
    }

}

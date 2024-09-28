// Nguyen Trung Kien 20226110
// Nguyen Trung Kien 20226110
// Dua ra man hinh 1 o message thong bao dien va in ra tbao


import javax.swing.JOptionPane;

public class HelloNameDialog {
    public static void main (String [] args)
    {
    String result;
    result = JOptionPane.showInputDialog("Please enter your name:");
    JOptionPane.showMessageDialog(null, "Hi " + result + "!");
    System.exit(0);
    }
}
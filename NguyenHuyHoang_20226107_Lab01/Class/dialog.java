import javax.swing.JOptionPane;

public class dialog{
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog("please enter your name");
        JOptionPane.showMessageDialog(null , "Hi "  + result + "!");
        System.exit(0);
    }
}
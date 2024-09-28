// Nguyen Trung Kien 20226110
// Dua ra man hinh 1 o message thong bao
// Nhap 2 so a,b 
// In ra man hinh ket qua tinh toan pt bac nhat


import javax.swing.*;

public class First_degree1 {
    public static void main(String[] args) {
        double a, b;

        String strNum1 ,strNum2 ;

        strNum1 = JOptionPane.showInputDialog(null,
                " Please input a: ", " Input a",
                JOptionPane.INFORMATION_MESSAGE);
        a = Double.parseDouble(strNum1);


        strNum2 = JOptionPane.showInputDialog(null,
                " Please input b: ", " Input b",
                JOptionPane.INFORMATION_MESSAGE);
        b = Double.parseDouble(strNum2);

        if (a!=0)
        {
        JOptionPane.showMessageDialog(null, "x = "+ -b/a +"\n",
                "Show the result: ", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "a = 0, No solution",
                "No Solution ", JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);

    }
}
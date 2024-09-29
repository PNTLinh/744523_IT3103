// bai 2.2.5

import javax.swing.JOptionPane;

public class tinhtoan {
        public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "Nhap so : ";
        strNum1 = JOptionPane.showInputDialog(null, "Nhap so thu nhat : ", "so thu nhat", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and ";
        strNum2 = JOptionPane.showInputDialog(null, "Nhao so thu hai : ", "so thu hai", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double tong = num1+num2;
        double hieu = num1 - num2;
        double tich = num1 * num2;
        int thuong = (int)(num1/num2);
        JOptionPane.showMessageDialog(null,"Tong : " + tong);
        JOptionPane.showMessageDialog(null,"Hieu: " + hieu);
        JOptionPane.showMessageDialog(null,"Tich: " + tich);
        JOptionPane.showMessageDialog(null,"Thuong: " + thuong);
    }
}

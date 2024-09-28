import javax.swing.JOptionPane;

public class equationsolving {
    public static void main(String[] args) {
        while (true) {
            String[] options = {"First-degree equation", 
                                "System of equations", 
                                "Second-degree equation", 
                                "Cancel"};
            int choice = JOptionPane.showOptionDialog(null,
                    "Choose the type of equation to solve:",
                    "Equation Solver",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null, options, options[0]);

            if (choice == -1 || choice == 3) {
                JOptionPane.showMessageDialog(null, "Exiting the program...");
                break;
            }
            switch (choice) {
                case 0:
                    solveLinearEquation();
                    break;
                case 1:
                    solveLinearSystem();
                    break;
                case 2:
                    solveQuadraticEquation();
                    break;
                default:
                    break;
            }
        }
    }
    private static void solveLinearEquation() {
        String aInput = JOptionPane.showInputDialog("Enter a (a is not equal to 0):");
        double a = Double.parseDouble(aInput);
        if (a == 0) {
            JOptionPane.showMessageDialog(null, "'a' cannot be 0!");
            return;
        }

        String bInput = JOptionPane.showInputDialog("Enter b:");
        double b = Double.parseDouble(bInput);

        double x = -b / a;
        JOptionPane.showMessageDialog(null, "x = " + x);
    }

    private static void solveLinearSystem() {
        double a11 = Double.parseDouble(JOptionPane.showInputDialog("Enter a11:"));
        double a12 = Double.parseDouble(JOptionPane.showInputDialog("Enter a12:"));
        double b1 = Double.parseDouble(JOptionPane.showInputDialog("Enter b1:"));
        double a21 = Double.parseDouble(JOptionPane.showInputDialog("Enter a21:"));
        double a22 = Double.parseDouble(JOptionPane.showInputDialog("Enter a22:"));
        double b2 = Double.parseDouble(JOptionPane.showInputDialog("Enter b2:"));

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                JOptionPane.showMessageDialog(null, "The system has infinitely solutions.");
            } else {
                JOptionPane.showMessageDialog(null, "The system has no solution.");
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            JOptionPane.showMessageDialog(null, "The solutions are x1 = " + x1 + ", x2 = " + x2);
        }
    }

    private static void solveQuadraticEquation() {
        String aInput = JOptionPane.showInputDialog("Enter a (a is not equal to 0):");
        double a = Double.parseDouble(aInput);
        if (a == 0) {
            JOptionPane.showMessageDialog(null, "'a' cannot be 0!");
            return;
        }

        String bInput = JOptionPane.showInputDialog("Enter b:");
        double b = Double.parseDouble(bInput);
        String cInput = JOptionPane.showInputDialog("Enter c:");
        double c = Double.parseDouble(cInput);

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null, "The solutions are x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            JOptionPane.showMessageDialog(null, "The equation has a double root: x = " + x);
        } else {
            JOptionPane.showMessageDialog(null, "The equation has no real roots.");
        }
    }
}

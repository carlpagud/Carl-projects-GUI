import javax.swing.*;

public class gui {
    public static void main(String[] args) {

//        String name = JOptionPane.showInputDialog("Enter your name:");
//        JOptionPane.showMessageDialog(null, "Your name is " + name);

//        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));
//
//        int factorial = 1;
//
//        for (int i = 1; i <= num; i++) {
//            factorial *= i;
//        }
//        JOptionPane.showMessageDialog(null, "Factorial: " + factorial);

//        String name = JOptionPane.showInputDialog("What is your name?");
//        String reversed = new StringBuilder(name).reverse().toString();
//        JOptionPane.showMessageDialog(null, "Reversed name: " + reversed);

        JFrame frame = new JFrame("GUI Program");
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("labels");
        frame.add(label);
    }
}
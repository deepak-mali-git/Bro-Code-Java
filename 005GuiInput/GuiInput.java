import javax.swing.JOptionPane;

public class GuiInput {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter you name");
        JOptionPane.showMessageDialog(null,"Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,"you are " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null,"you are " + height + " cm tall");
        
    }
}
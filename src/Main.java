import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String message = JOptionPane.showInputDialog("Enter message: ");
        int x = Integer.parseInt(JOptionPane.showInputDialog("Enter x coordinate: "));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Enter y coordinate: "));

        Message frame = new Message(message, x, y);
        frame.setVisible(true);

        //System.out.println("Hello world!");
        //System.out.println("Jesus");
    }
}

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class DoIfKeyPress {
    public DoIfKeyPress() {
        JFrame myJFrame = new JFrame();

        JTextField textField = new JTextField();
        textField.addKeyListener(new Keychecker());
        myJFrame.add(textField);
        myJFrame.setVisible(true);

    }

    public static void main(String[] args) {
        new DoIfKeyPress();
    }

    class Keychecker extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent event) {

            char keyCode = event.getKeyChar();

            if (keyCode == KeyEvent.VK_W) {
                System.out.println("Up Arrrow-Key is pressed!");
            }
            else if (keyCode == KeyEvent.VK_S) {
                System.out.println("Down Arrrow-Key is pressed!");
            }
            else if (keyCode == KeyEvent.VK_A) {
                System.out.println("Left Arrrow-Key is pressed!");
            }
            else if (keyCode == KeyEvent.VK_D) {
                System.out.println("Right Arrrow-Key is pressed!");
            }

        }

    }
}

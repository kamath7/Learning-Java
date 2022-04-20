import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Window extends Frame {

    public Window(String title){
        super(title);
        setSize(500,140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Font SansSerifL = new Font("SansSerif", Font.BOLD, 18);
        Font SansSerifS = new Font("SansSerif", Font.BOLD, 12);

        g.setFont(SansSerifL);
        g.drawString("Uncharted 4",60,60);

        g.setFont(SansSerifS);
        g.drawString("By Naugthy Dogs", 60, 100);


    }
}

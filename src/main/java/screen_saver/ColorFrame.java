package screen_saver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */

public class ColorFrame extends JFrame {

    @Autowired
    private Random random;

    @Autowired
    private Color c;

    @PostConstruct
    public void init() {
        setSize(400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void moveToRandomLocation() {
        setLocation(random.nextInt(1600), random.nextInt(1200));
        getContentPane().setBackground(c);
        repaint();
    }


}

package lab8;
import javax.swing.*;
import java.awt.*;

public class Graphic extends JFrame {
    public Graphic(String s) {
        super(s);
        setLayout(new GridLayout(0, 1)); // Удобное расположение кнопок
        setSize(250, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Список заданий
        String[] functions = {"y=kx", "y=3x^2", "y=-x^2+x^3", "y=x^3+x^2+x", "y=x^5", "y=sin(x)", "y=cos(x-1)+x"};

        for (String func : functions) {
            Button btn = new Button(func);
            btn.addActionListener(e -> new PlotFrame(func));
            add(btn);
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        new Graphic("Построитель графиков");
    }
}
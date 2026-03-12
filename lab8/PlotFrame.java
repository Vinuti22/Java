package lab8;
import javax.swing.*;
import java.awt.*;

public class PlotFrame extends JFrame {
    private String funcType;

    public PlotFrame(String funcType) {
        super(funcType);
        this.funcType = funcType;
        setSize(600, 600);
        setVisible(true);
    }

    public void paint(Graphics g) {
        // Отрисовка сетки [cite: 71]
        g.setColor(Color.LIGHT_GRAY);
        for (int i = 0; i < 600; i += 30) {
            g.drawLine(i, 0, i, 600);
            g.drawLine(0, i, 600, i);
        }
        // Оси координат [cite: 72]
        g.setColor(Color.BLACK);
        g.drawLine(300, 0, 300, 600);
        g.drawLine(0, 300, 600, 300);

        // Построение графика [cite: 73]
        g.setColor(Color.RED);
        for (int i = -300; i < 300; i++) {
            double x = i / 30.0;
            double y = calculateY(x);
            int screenX = 300 + (int) (x * 30);
            int screenY = 300 - (int) (y * 30); // Преобразование в int
            g.fillRect(screenX, screenY, 2, 2);
        }
    }

    private double calculateY(double x) {
        switch (funcType) {
            case "y=3x^2": return 3 * Math.pow(x, 2);
            case "y=-x^2+x^3": return -Math.pow(x, 2) + Math.pow(x, 3);
            case "y=x^3+x^2+x": return Math.pow(x, 3) + Math.pow(x, 2) + x;
            case "y=x^5": return Math.pow(x, 5);
            case "y=sin(x)": return Math.sin(x) * 80; // Масштабирование [cite: 75]
            case "y=cos(x-1)+x": return Math.cos(x - 1) + x;
            default: return 0.5 * x; // Для y=kx (k=0.5)
        }
    }
}
package ex16;

import javax.swing.*;
import java.awt.*;

class Ball {
    // 공의 속성(좌표, 크기, 속도)
    private int x = 100;
    private int y = 100;
    private final int size = 30;
    private int xSpeed = 10;
    private int ySpeed = 10;

    // 공을 화면에 그려주는 메소드
    public void draw(Graphics g) {
        // 공의 색깔
        g.setColor(Color.yellow);
        g.fillOval(x, y, size, size);
    }

    //update() 공의 위치를 계산 하는 메소드
    public void update() {
        x += xSpeed;
        y += ySpeed;
        if ((x + size) > MoveBall.BOARD_WIDTH - size || x < 0) {
            xSpeed = -xSpeed;
        }
        if ((y + size) > MoveBall.BOARD_HEIGHT - size || y < 0) {
            ySpeed = -ySpeed;
        }
    }
}

public class MoveBall extends JPanel {
    static final int BOARD_WIDTH = 600;
    static final int BOARD_HEIGHT = 300;
    private final Ball ball = new Ball();

    public MoveBall() {
        // 배경색 노란색으로 지정
        this.setBackground(Color.GRAY);

        // 람다식, Runnable 객체 생성 후
        // 무한루프를 돌면서 공의 위치 update하고 repaint해준다.
        Runnable task = () -> {
            while (true) {
                ball.update();
                repaint();

                try {
                    Thread.sleep(50);
                } catch (InterruptedException ignore) {
                }
            }
        };
        new Thread(task).start();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(MoveBall.BOARD_WIDTH, MoveBall.BOARD_HEIGHT);
        frame.add(new MoveBall());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        ball.draw(g);
    }
}

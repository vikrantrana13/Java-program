import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class stopwatch {
    private static int elapsedTime = 0; // in seconds
    private static boolean running = false;
    private static Timer timer;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Stopwatch");
        JLabel timeLabel = new JLabel("Elapsed Time: 0 seconds");
        JButton startButton = new JButton("Start");
        JButton stopButton = new JButton("Stop");
        JButton resetButton = new JButton("Reset");

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elapsedTime++;
                timeLabel.setText("Elapsed Time: " + elapsedTime + " seconds");
            }
        });

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!running) {
                    running = true;
                    timer.start();
                }
            }
        });

        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (running) {
                    running = false;
                    timer.stop();
                }
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                running = false;
                timer.stop();
                elapsedTime = 0;
                timeLabel.setText("Elapsed Time: 0 seconds");
            }
        });

        JPanel panel = new JPanel();
        panel.add(timeLabel);
        panel.add(startButton);
        panel.add(stopButton);
        panel.add(resetButton);

        frame.add(panel);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
package queue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class QueueFrame extends JFrame {

	private Queue<Integer> queue;

	private JPanel mainPanel = new JPanel(new BorderLayout());

	private JPanel topPanel = new JPanel();

	private JPanel bottomPanel = new JPanel(new GridLayout(30, 1));

	private JPanel sizePanel = new JPanel(new GridLayout(3, 1));

	private JPanel enqueuePanel = new JPanel(new GridLayout(3, 1));

	private JPanel dequeuePanel = new JPanel(new GridLayout(3, 1));

	private JPanel frontPanel = new JPanel(new GridLayout(3, 1));

	private JLabel lblSize = new JLabel("Queue Size: ");

	private JTextField txtSize = new JTextField("10");

	private JButton btnInit = new JButton("Initialize Queue");

	private JLabel lblEnqueue = new JLabel("Value: ");

	private JTextField txtEnqueue = new JTextField("");

	private JButton btnEnqueue = new JButton("Enqueue");

	private JLabel lblDequeue = new JLabel("Value: ");

	private JTextField txtDequeue = new JTextField("");

	private JButton btnDequeue = new JButton("Dequeue");

	private JLabel lblFront = new JLabel("Value: ");

	private JTextField txtFront = new JTextField("");

	private JButton btnFront = new JButton("Front");

	public QueueFrame() {

		topPanel.setPreferredSize(new Dimension(800, 300));

		sizePanel.add(lblSize);
		sizePanel.add(txtSize);
		sizePanel.add(btnInit);

		enqueuePanel.add(lblEnqueue);
		enqueuePanel.add(txtEnqueue);
		enqueuePanel.add(btnEnqueue);

		dequeuePanel.add(lblDequeue);
		dequeuePanel.add(txtDequeue);
		dequeuePanel.add(btnDequeue);

		frontPanel.add(lblFront);
		frontPanel.add(txtFront);
		frontPanel.add(btnFront);

		topPanel.add(sizePanel);
		topPanel.add(enqueuePanel);
		topPanel.add(dequeuePanel);
		topPanel.add(frontPanel);

		bottomPanel.setPreferredSize(new Dimension(800, 300));
		bottomPanel.setBackground(Color.red);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(800, 600);
		mainPanel.add(topPanel, BorderLayout.PAGE_START);
		mainPanel.add(bottomPanel, BorderLayout.PAGE_END);

		getContentPane().add(mainPanel);

		btnInit.addActionListener(e -> {
			bottomPanel.add(new JButton("oi"));
			queue = new ArrayQueue<>(Integer.valueOf(txtSize.getText()));
			Object[] values = queue.getArray();
			for (Object integer : values) {
				bottomPanel.add(new JButton("oi"));
			}
			this.repaint();
		});
	}

}

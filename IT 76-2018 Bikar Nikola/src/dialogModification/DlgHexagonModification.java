package dialogModification;

import java.awt.BorderLayout;
import java.awt.Color;


import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import adapter.HexagonAdapter;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;


public class DlgHexagonModification extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtY;
	private JTextField txtX;
	private JTextField txtRadius;
	private boolean isOk;
	private HexagonAdapter hexAdapter;

	private Color edgeColor = Color.black;
	private Color innerColor = Color.black;
	private JTextField txtInner;
	private JTextField txtEdge;
	private int radius = 0;
	private int x = 0;
	private int y = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgHexagonModification dialog = new DlgHexagonModification();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgHexagonModification() {
		setResizable(false);
		setModal(true);
		setTitle("Hexagon Modification");
		setBackground(Color.WHITE);
		setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(135, 206, 250));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		JLabel lblCenter = new JLabel("Center:");
		lblCenter.setForeground(new Color(255, 0, 0));
		lblCenter.setBackground(new Color(173, 255, 47));
		lblCenter.setFont(new Font("Segoe UI Historic", Font.BOLD, 14));
		JLabel lblX = new JLabel("X:");
		lblX.setForeground(new Color(255, 0, 0));
		lblX.setBackground(new Color(255, 0, 0));
		lblX.setFont(new Font("Segoe UI Historic", Font.BOLD, 14));
		JLabel lblY = new JLabel("Y:");
		lblY.setForeground(new Color(255, 0, 0));
		lblY.setFont(new Font("Segoe UI Historic", Font.BOLD, 14));
		txtY = new JTextField();
		txtY.setForeground(new Color(255, 0, 0));
		txtY.setBackground(new Color(176, 196, 222));
		txtY.setFont(new Font("Segoe UI Historic", Font.PLAIN, 14));
		txtY.setColumns(10);
		txtX = new JTextField();
		txtX.setForeground(new Color(255, 0, 0));
		txtX.setBackground(new Color(176, 196, 222));
		txtX.setFont(new Font("Segoe UI Historic", Font.PLAIN, 14));
		txtX.setColumns(10);
		JLabel lblRadius = new JLabel("Radius:");
		lblRadius.setForeground(new Color(255, 0, 0));
		lblRadius.setFont(new Font("Segoe UI Historic", Font.BOLD, 14));
		txtRadius = new JTextField();
		txtRadius.setForeground(new Color(255, 0, 0));
		txtRadius.setBackground(new Color(176, 196, 222));
		txtRadius.setFont(new Font("Segoe UI Historic", Font.PLAIN, 14));
		txtRadius.setColumns(10);

		JButton btnInnerColor = new JButton("Inner color");
		btnInnerColor.setFont(new Font("Segoe UI Historic", Font.PLAIN, 15));
		btnInnerColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				innerColor = JColorChooser.showDialog(null, "Inner Color", innerColor);
				if (innerColor == null) {
					innerColor = Color.black;
					txtInner.setBackground(Color.black);
				} else {
					txtInner.setBackground(innerColor);
				}
			}
		});

		JLabel lblHexagonModification = new JLabel("Hexagon Modification");
		lblHexagonModification.setForeground(Color.RED);
		lblHexagonModification.setFont(new Font("Segoe UI Historic", Font.BOLD, 20));
		lblHexagonModification.setBackground(new Color(173, 255, 47));

		JButton btnEdgeColor = new JButton("Edge color");
		btnEdgeColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				edgeColor = JColorChooser.showDialog(null, "Edge Color", edgeColor);
				if (edgeColor == null) {
					edgeColor = Color.black;
					txtEdge.setBackground(Color.black);
				} else {
					txtEdge.setBackground(edgeColor);
				}
			}
		});
		btnEdgeColor.setFont(new Font("Segoe UI Historic", Font.PLAIN, 15));

		txtInner = new JTextField();
		txtInner.setEditable(false);
		txtInner.setColumns(10);

		txtEdge = new JTextField();
		txtEdge.setEditable(false);
		txtEdge.setColumns(10);

		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup().addContainerGap().addGroup(gl_contentPanel
						.createParallelGroup(Alignment.TRAILING).addGroup(
								gl_contentPanel
										.createSequentialGroup()
										.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(lblRadius, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblCenter, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
														57, Short.MAX_VALUE))
										.addGap(5)
										.addComponent(lblX, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING, false)
												.addGroup(gl_contentPanel.createSequentialGroup()
														.addComponent(txtX, GroupLayout.PREFERRED_SIZE, 38,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED))
												.addComponent(txtRadius, 0, 0, Short.MAX_VALUE))
										.addGap(53)
										.addComponent(lblY, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(txtY, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
										.addContainerGap(139, Short.MAX_VALUE))
						.addGroup(
								gl_contentPanel.createSequentialGroup()
										.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
												.addComponent(btnInnerColor, GroupLayout.DEFAULT_SIZE, 107,
														Short.MAX_VALUE)
												.addComponent(btnEdgeColor))
										.addGap(45)
										.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
												.addComponent(txtEdge, 0, 0, Short.MAX_VALUE)
												.addComponent(txtInner, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
										.addGap(228))
						.addGroup(Alignment.LEADING,
								gl_contentPanel
										.createSequentialGroup().addComponent(lblHexagonModification,
												GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
										.addContainerGap()))));
		gl_contentPanel
				.setVerticalGroup(
						gl_contentPanel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPanel.createSequentialGroup()
										.addComponent(lblHexagonModification, GroupLayout.DEFAULT_SIZE, 80,
												Short.MAX_VALUE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblCenter, GroupLayout.PREFERRED_SIZE, 19,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(lblX).addComponent(lblY)
												.addComponent(txtX, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(txtY, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblRadius).addComponent(txtRadius,
														GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
												.addComponent(btnInnerColor).addComponent(txtInner,
														GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
										.addGap(8)
										.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
												.addComponent(btnEdgeColor, GroupLayout.PREFERRED_SIZE, 29,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(txtEdge, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addContainerGap()));

		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setForeground(new Color(135, 206, 250));
			buttonPane.setBackground(new Color(135, 206, 250));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(new GridLayout(0, 2, 0, 0));
			{
				JButton btnEdit = new JButton("Edit");
				btnEdit.setFont(new Font("Segoe UI Historic", Font.BOLD, 14));
				btnEdit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							validate(txtRadius.getText(), txtX.getText(), txtY.getText());
						} catch (NumberFormatException ee) {
							JOptionPane.showMessageDialog(null, "Text fields cannot be empty!", "Error",
									JOptionPane.ERROR_MESSAGE, null);
							isOk = false;
							return;
						}
						if (txtRadius.getText().trim().equals("") || txtX.getText().trim().equals("")
								|| txtY.getText().trim().equals("")) {
							JOptionPane.showMessageDialog(null, "Text fields cannot be empty!", "Error",
									JOptionPane.ERROR_MESSAGE, null);
							isOk = false;
						} else if (Integer.parseInt(txtRadius.getText()) < 0) {
							JOptionPane.showMessageDialog(null, "Radius cannot be negative number!", "Error",
									JOptionPane.ERROR_MESSAGE, null);
							isOk = false;
							return;
						} else {
							x = Integer.parseInt(txtX.getText());
							y = Integer.parseInt(txtY.getText());
							radius = Integer.parseInt(txtRadius.getText());
							isOk=true;
							dispose();
						}
					}
				});
				btnEdit.setActionCommand("OK");
				buttonPane.add(btnEdit);
				getRootPane().setDefaultButton(btnEdit);
			}
			{
				JButton btnCancel = new JButton("Cancel");
				btnCancel.setFont(new Font("Segoe UI Historic", Font.PLAIN, 14));
				btnCancel.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnCancel.setActionCommand("Cancel");
				buttonPane.add(btnCancel);
			}
		}
	}

	public void validate(String radius, String x, String y) {
		String exp = "^(([1-9]{1})([0-9]+)?)$";
		if (radius.equals("") || x.equals("") || y.equals(""))
			;
		else if (!radius.matches(exp) || !x.matches(exp) || !y.matches(exp)) {
			throw new NumberFormatException();
		}
	}

	public void fillFields(HexagonAdapter c) {
		this.hexAdapter = c;
		 txtX.setText(String.valueOf(hexAdapter.getHexagon().getX()));
		 txtY.setText(String.valueOf(hexAdapter.getHexagon().getY()));
		 txtRadius.setText(String.valueOf(hexAdapter.getHexagon().getR()));
		 txtEdge.setBackground(hexAdapter.getHexagon().getBorderColor());
		 txtInner.setBackground(hexAdapter.getHexagon().getAreaColor());
		 this.edgeColor = hexAdapter.getHexagon().getBorderColor();
		 this.innerColor = hexAdapter.getHexagon().getAreaColor();
	}

	public boolean isOk() {
		return isOk;
	}

	public void setOk(boolean isOk) {
		this.isOk = isOk;
	}
	
	public HexagonAdapter getHexagon(){
		return this.hexAdapter;
	}
	
	public int getRadius(){
		return radius;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public Color getEdgeColor(){
		return edgeColor;
	}
	
	public Color getInnerColor(){
		return innerColor;
	}
}

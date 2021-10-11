package clases;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;
import javax.swing.JScrollPane;

import java.awt.SystemColor;
import java.util.Calendar;

import javax.swing.JSeparator;

public class principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lbl_estados;
	private JRadioButton rb5Q;
	private JRadioButton rb20Q;
	private JRadioButton rb50Q;
	private JRadioButton rb10Q;

	private JTextArea txtingresos;
	private JTextField txttotal;
	private JLabel lblDisponible;
	private JButton btncancelar;
	private JLabel lblCancelar;
	private JLabel lblFortnite;
	private JLabel l1;
	private JLabel l2;
	private JLabel l3;
	private JLabel l4;
	private JLabel l5;
	private JLabel l6;
	private JLabel l7;
	private JLabel l8;
	private JLabel l9;
	private JLabel l10;
	private JLabel l11;
	private JLabel l12;
	
	private JRadioButton rbshield; //5
	private JRadioButton rbllama; //10
	private JRadioButton rbkevin; //15
	private JRadioButton rbbidon; //20
	private JRadioButton rbscar; //25
	private JRadioButton rbrocket; //30
	private JRadioButton rbpump; //35
	private JRadioButton rbp90;	//40
	private JRadioButton rbbomber; //45
	private JRadioButton rbrex;  //50
	private JRadioButton rbmidas; //55
	private JRadioButton rbderiva; //60


	private JButton btncomprar;

	//// VARIABLES
	int dinero, contador = 1;
	String cantidades_ingresadas = "";
	// Radio
	ButtonGroup monedas = new ButtonGroup();
	ButtonGroup items = new ButtonGroup();

	/// STOCK
	int scar = 10, rocket = 2, pump = 3, p90 = 4, midas = 5, bomber = 3, deriva = 6, rex = 4, llama = 5, kevin = 6,bidon = 5, shield = 6;
	private JLabel lbstock;
	private JLabel lbmensaje;
	private JPanel panel_1;
	private JScrollPane scrollPane;
	private JLabel lbinicio;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal frame = new principal();
					frame.setVisible(true);
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public principal() {

		ventana();
		diseño();
		ingreso_dinero();
		cancelar();
		comprar();


		mostrar_stock();

	}

	public void ventana() {

		setTitle("Maquin\u00E1 Expendedora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 550, 825);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lbl_estados = new JLabel("");
		lbl_estados.setForeground(Color.RED);
		lbl_estados.setBounds(413, 122, 496, 305);
		contentPane.add(lbl_estados);


		JPanel panel = new JPanel();
		panel.setForeground(SystemColor.desktop);
		panel.setBounds(350, 69, 165, 492);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setBackground(Color.white);
		
		
		rb5Q = new JRadioButton("Q.5");
		rb5Q.setBounds(40, 112, 100, 57);
		panel.add(rb5Q);
		rb5Q.setBackground(Color.WHITE);

		//// grupo de radiobuttons

		monedas.add(rb5Q);

		rb10Q = new JRadioButton("Q.10");
		rb10Q.setBounds(36, 47, 104, 61);
		panel.add(rb10Q);
		rb10Q.setBackground(Color.WHITE);
		monedas.add(rb10Q);

		rb20Q = new JRadioButton("Q.20");
		rb20Q.setBounds(40, 173, 100, 76);
		panel.add(rb20Q);
		rb20Q.setBackground(Color.WHITE);
		monedas.add(rb20Q);

		rb50Q = new JRadioButton("Q.50");
		rb50Q.setBounds(40, 247, 97, 66);
		panel.add(rb50Q);
		rb50Q.setBackground(Color.WHITE);
		monedas.add(rb50Q);

		btncancelar = new JButton("New button");
		btncancelar.setBounds(60, 431, 49, 50);
		panel.add(btncancelar);
		btncancelar.setBackground(Color.RED);
		btncancelar.setForeground(Color.RED);
		

		lblCancelar = new JLabel("CANCELAR");
		lblCancelar.setBounds(50, 403, 80, 22);
		panel.add(lblCancelar);
		lblCancelar.setFont(new Font("Comic Sans MS", Font.BOLD, 12));

		btncomprar = new JButton("New button");
		btncomprar.setBounds(60, 342, 49, 50);
		panel.add(btncomprar);

		btncomprar.setForeground(Color.GREEN);
		btncomprar.setBackground(Color.GREEN);

		JLabel lblComprar = new JLabel("COMPRAR");
		lblComprar.setBounds(50, 320, 80, 22);
		panel.add(lblComprar);
		lblComprar.setFont(new Font("Comic Sans MS", Font.BOLD, 12));

		JLabel lblIngresoDinero = new JLabel("INGRESO DINERO");
		lblIngresoDinero.setBounds(10, 11, 158, 22);
		panel.add(lblIngresoDinero);
		lblIngresoDinero.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

		panel_1 = new JPanel();
		panel_1.setBounds(11, 69, 300, 700);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBackground(Color.white);
		lblFortnite = new JLabel("ITEMS FORNITE");
		lblFortnite.setBounds(40, 271, 150, 22);
		panel_1.add(lblFortnite);
		lblFortnite.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

		l1 = new JLabel("");
		l1.setForeground(SystemColor.menu);
		l1.setBounds(35, 307, 33, 50);
		panel_1.add(l1);

		l2 = new JLabel("");
		l2.setForeground(SystemColor.menu);
		l2.setBounds(130, 307, 33, 50);
		panel_1.add(l2);

		l3 = new JLabel("");
		l3.setForeground(SystemColor.menu);
		l3.setBounds(235, 307, 33, 50);
		panel_1.add(l3);

		l6 = new JLabel("");
		l6.setForeground(SystemColor.menu);
		l6.setBounds(235, 393, 33, 50);
		panel_1.add(l6);

		l5 = new JLabel("");
		l5.setForeground(SystemColor.menu);
		l5.setBounds(130, 393, 33, 50);
		panel_1.add(l5);

		l4 = new JLabel("");
		l4.setForeground(SystemColor.menu);
		l4.setBounds(35, 393, 33, 50);
		panel_1.add(l4);

		l7 = new JLabel("");
		l7.setForeground(SystemColor.menu);
		l7.setBounds(35, 490, 33, 50);
		panel_1.add(l7);

		l8 = new JLabel("");
		l8.setForeground(SystemColor.menu);
		l8.setBounds(130, 490, 33, 50);
		panel_1.add(l8);

		l9 = new JLabel("");
		l9.setForeground(SystemColor.menu);
		l9.setBounds(235, 490, 33, 50);
		panel_1.add(l9);
		
		l10 = new JLabel("");
		l10.setForeground(SystemColor.menu);
		l10.setBounds(35, 585, 33, 50);
		panel_1.add(l10);

		l11 = new JLabel("");
		l11.setForeground(SystemColor.menu);
		l11.setBounds(130, 585, 33, 50);
		panel_1.add(l11);

		l12 = new JLabel("");
		l12.setForeground(SystemColor.menu);
		l12.setBounds(235, 585, 33, 50);
		panel_1.add(l12);

		/// Grupo Radio Buton Bebidas

		//// grupo de radiobuttons

		rbshield = new JRadioButton("LL1 - Q.5");
		rbshield.setBounds(6, 364, 85, 23);
		panel_1.add(rbshield);
		rbshield.setBackground(Color.WHITE);
		items.add(rbshield);

		rbllama = new JRadioButton("LL2 - Q.10");
		rbllama.setBounds(100, 364, 85, 23);
		panel_1.add(rbllama);
		rbllama.setBackground(Color.WHITE);
		items.add(rbllama);

		rbkevin = new JRadioButton("LL3 - Q.15");
		rbkevin.setBounds(200, 364, 85, 23);
		panel_1.add(rbkevin);
		rbkevin.setBackground(Color.WHITE);
		items.add(rbkevin);

		rbbidon = new JRadioButton("LL4 - Q.20");
		rbbidon.setBounds(6, 455, 85, 23);
		panel_1.add(rbbidon);
		rbbidon.setBackground(Color.WHITE);
		items.add(rbbidon);

		rbscar = new JRadioButton("J1 - Q.25");
		rbscar.setBounds(100, 455, 85, 23);
		panel_1.add(rbscar);
		rbscar.setBackground(Color.WHITE);
		items.add(rbscar);

		rbrocket = new JRadioButton("J2 - Q.30");
		rbrocket.setBounds(200, 455, 85, 23);
		panel_1.add(rbrocket);
		rbrocket.setBackground(Color.WHITE);
		items.add(rbrocket);

		rbpump = new JRadioButton("J3 - Q.35");
		rbpump.setBounds(6, 545, 85, 23);
		panel_1.add(rbpump);
		rbpump.setBackground(Color.WHITE);
		items.add(rbpump);

		rbp90 = new JRadioButton("J4 - Q.40");
		rbp90.setBounds(100, 545, 85, 23);
		panel_1.add(rbp90);
		rbp90.setBackground(Color.WHITE);
		items.add(rbp90);

		rbbomber = new JRadioButton("S1 - Q.45");
		rbbomber.setBounds(200, 545, 85, 23);
		panel_1.add(rbbomber);
		rbbomber.setBackground(Color.WHITE);
		items.add(rbbomber);

		rbrex = new JRadioButton("S2 - Q.50");
		rbrex.setBounds(6, 635, 85, 23);
		panel_1.add(rbrex);
		rbrex.setBackground(Color.WHITE);
		items.add(rbrex);

		rbmidas = new JRadioButton("S3 - Q.55");
		rbmidas.setBounds(100, 635, 85, 23);
		panel_1.add(rbmidas);
		rbmidas.setBackground(Color.WHITE);
		items.add(rbmidas);

		rbderiva = new JRadioButton("S4- Q.60");
		rbderiva.setBounds(200, 635, 85, 23);
		panel_1.add(rbderiva);
		rbderiva.setBackground(Color.WHITE);
		items.add(rbderiva);

		JLabel lblTuEfectivo = new JLabel("TU EFECTIVO ");
		lblTuEfectivo.setBounds(10, 13, 158, 22);
		panel_1.add(lblTuEfectivo);
		lblTuEfectivo.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

		txttotal = new JTextField();
		txttotal.setForeground(new Color(124, 252, 0));
		txttotal.setBackground(Color.BLACK);
		txttotal.setFont(new Font("Digital Counter 7", Font.BOLD, 16));
		txttotal.setBounds(10, 225, 275, 35);
		panel_1.add(txttotal);
		txttotal.setEditable(false);
		txttotal.setColumns(10);

		lblDisponible = new JLabel("DISPONIBLE");
		lblDisponible.setBounds(10, 192, 80, 22);
		panel_1.add(lblDisponible);
		lblDisponible.setFont(new Font("Comic Sans MS", Font.BOLD, 12));

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 46, 275, 133);
		panel_1.add(scrollPane);

		txtingresos = new JTextArea();
		scrollPane.setViewportView(txtingresos);
		txtingresos.setBackground(Color.BLACK);
		txtingresos.setFont(new Font("Digital Counter 7", Font.BOLD, 22));
		txtingresos.setForeground(Color.GREEN);
		txtingresos.setEditable(false);

		lbstock = new JLabel("");
		lbstock.setBounds(10, 660, 250, 23);
		panel_1.add(lbstock);
		lbstock.setFont(new Font("Comic Sans MS", Font.BOLD, 12));

		Border raisedbevel;
		raisedbevel = BorderFactory.createEtchedBorder();
		panel.setBorder(raisedbevel);
		panel_1.setBorder(raisedbevel);

		lbmensaje = new JLabel("");
		lbmensaje.setBounds(535, 515, 285, 28);
		contentPane.add(lbmensaje);

		/// Hora en el mensaje
		Calendar calendario = Calendar.getInstance();
		int hora, minutos, segundos;
		hora = calendario.get(Calendar.HOUR_OF_DAY);
		minutos = calendario.get(Calendar.MINUTE);
		segundos = calendario.get(Calendar.SECOND);

		lbinicio = new JLabel("BIENVENIDO " + hora + ":" + minutos + ":" + segundos + "");
		lbinicio.setFont(new Font("Comic Sans MS", Font.PLAIN, 22));
		lbinicio.setBounds(79, 11, 271, 42);
		contentPane.add(lbinicio);


	}

	public void diseño() {
		////////////// MONEDAS/////////////////

		/////// 5 quetzales
		String path = "/billetes/5.jpg";
		java.net.URL url = this.getClass().getResource(path);
		ImageIcon icon = new ImageIcon(url);
		rb5Q.setIcon(icon);

		/////// 10 quetzales
		String path2 = "/billetes/10.jpg";
		java.net.URL url2 = this.getClass().getResource(path2);
		ImageIcon icon2 = new ImageIcon(url2);
		rb10Q.setIcon(icon2);

		/////// 20 quetzales
		String path3 = "/billetes/20.jpg";
		java.net.URL url3 = this.getClass().getResource(path3);
		ImageIcon icon3 = new ImageIcon(url3);
		rb20Q.setIcon(icon3);

		/////// 50 quetzales
		String path4 = "/billetes/50.jpg";
		java.net.URL url4 = this.getClass().getResource(path4);
		ImageIcon icon4 = new ImageIcon(url4);
		rb50Q.setIcon(icon4);

		////////////// ITEMS /////////////////

		String path5 = "/fortnite/Imagen1.png";
		java.net.URL url5 = this.getClass().getResource(path5);
		ImageIcon icon5 = new ImageIcon(url5);

		String path6 = "/fortnite/Imagen2.png";
		java.net.URL url6 = this.getClass().getResource(path6);
		ImageIcon icon6 = new ImageIcon(url6);
	

		String path7 = "/fortnite/Imagen3.png";
		java.net.URL url7 = this.getClass().getResource(path7);
		ImageIcon icon7 = new ImageIcon(url7);


		String path8 = "/fortnite/Imagen4.jpg";
		java.net.URL url8 = this.getClass().getResource(path8);
		ImageIcon icon8 = new ImageIcon(url8);

		String path9 = "/fortnite/Imagen5.png";
		java.net.URL url9 = this.getClass().getResource(path9);
		ImageIcon icon9 = new ImageIcon(url9);

		String path10 = "/fortnite/Imagen6.png";
		java.net.URL url10 = this.getClass().getResource(path10);
		ImageIcon icon10 = new ImageIcon(url10);

		String path11 = "/fortnite/Imagen7.png";
		java.net.URL url11 = this.getClass().getResource(path11);
		ImageIcon icon11 = new ImageIcon(url11);

		String path12 = "/fortnite/Imagen8.png";
		java.net.URL url12 = this.getClass().getResource(path12);
		ImageIcon icon12 = new ImageIcon(url12);

		String path13 = "/fortnite/Imagen9.png";
		java.net.URL url13 = this.getClass().getResource(path13);
		ImageIcon icon13 = new ImageIcon(url13);

		String path14 = "/fortnite/Imagen10.png";
		java.net.URL url14 = this.getClass().getResource(path14);
		ImageIcon icon14 = new ImageIcon(url14);

		String path15 = "/fortnite/Imagen11.png";
		java.net.URL url15 = this.getClass().getResource(path15);
		ImageIcon icon15 = new ImageIcon(url15);

		String path16 = "/fortnite/Imagen12.png";
		java.net.URL url16 = this.getClass().getResource(path16);
		ImageIcon icon16 = new ImageIcon(url16);
		l1.setIcon(icon16);
		l2.setIcon(icon14);
		l3.setIcon(icon15);
		l4.setIcon(icon13);
		l5.setIcon(icon5);
		l6.setIcon(icon6);
		l7.setIcon(icon7);
		l8.setIcon(icon8);
		l9.setIcon(icon9);
		l10.setIcon(icon12);
		l11.setIcon(icon10);
		l12.setIcon(icon11);
	}

	public void ingreso_dinero() {
		// contados para enumerar las lineas del txt area y el orden del vuelto
		// ingresado

		//////////

		rb5Q.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				dinero = dinero + 5;
				cantidades_ingresadas = cantidades_ingresadas + "Q.5 \n";
				// Imprimir en el text Area las cantidades ingresadas
				txtingresos.append("" + contador + ".- Q.5");
				txtingresos.append(System.getProperty("line.separator"));
				txttotal.setText("" + dinero + " Q");
				contador++;
				// desaparecer msj
				lbinicio.setVisible(false);

			}
		});

		///////
		rb10Q.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dinero = dinero + 10;
				cantidades_ingresadas = cantidades_ingresadas + "Q.10 \n";
				// Imprimir en el text Area las cantidades ingresadas
				txtingresos.append("" + contador + ".- Q.10");
				txtingresos.append(System.getProperty("line.separator"));
				txttotal.setText("" + dinero + " Q.");
				contador++;
				// desaparecer msj
				lbinicio.setVisible(false);

			}
		});

		///////
		rb20Q.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dinero = dinero + 20;
				cantidades_ingresadas = cantidades_ingresadas + "Q.20 \n";
				// Imprimir en el text Area las cantidades ingresadas
				txtingresos.append("" + contador + ".- Q.20");
				txtingresos.append(System.getProperty("line.separator"));
				txttotal.setText("" + dinero + " Q.");
				contador++;

				// desaparecer msj
				lbinicio.setVisible(false);

			}
		});

		///////
		rb50Q.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dinero = dinero + 50;
				cantidades_ingresadas = cantidades_ingresadas + "Q.50 \n";
				// Imprimir en el text Area las cantidades ingresadas
				txtingresos.append("" + contador + ".- Q.50");
				txtingresos.append(System.getProperty("line.separator"));
				txttotal.setText("" + dinero + " Q");
				contador++;

				// desaparecer msj
				lbinicio.setVisible(false);
			}
		});

	}

	public void cancelar() {
		btncancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (contador >= 2) {
					System.out.println("---TU DINERO---\n" + cantidades_ingresadas + "");
					cantidades_ingresadas = "";
					dinero = 0;
					txttotal.setText("");
					contador = 1;
					txtingresos.setText("");
					lbstock.setText("");

					// llamar metodo limpiar rb
					limpiar_rb();

					lbinicio.setVisible(true);

				}
			}
		});

	}

	public void comprar() {

		btncomprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje = "";

				if (contador >= 2) {
					if (rbshield.isSelected() == true) {
						if (shield > 0) {
							if (dinero >= 5) {
								int aux = dinero - 5;

								if (aux > 0) {
									mensaje = "Su cambio " + aux + " Q.";
								}
					

								JOptionPane.showMessageDialog(null,
										"Usted compro\nLlavero Escudo\n" + mensaje + " Gracias\nVuelta pronto");
								shield = shield - 1;
								//// reinicar maquina
								cantidades_ingresadas = "";
								dinero = 0;
								txttotal.setText("");
								contador = 1;
								txtingresos.setText("");
								lbstock.setText("");
								limpiar_rb();
								lbinicio.setVisible(true);

							}

							else {
								JOptionPane.showMessageDialog(null, "Revisé su bolsillo por favor");
							}
						} else {
							JOptionPane.showMessageDialog(null, "Lo sentimos no disponible en stock");
						}

					}

					if (rbllama.isSelected() == true) {
						if (llama > 0) {
							if (dinero >= 10) {
								int aux = dinero - 10;

								if (aux > 0) {
									mensaje = "Su cambio " + aux + " Q.";
								}

						
								JOptionPane.showMessageDialog(null,
										"Usted compro\nLlavero Llama\n" + mensaje + " Gracias\nVuelta pronto");
								llama = llama - 1;
								//// reinicar maquina
								cantidades_ingresadas = "";
								dinero = 0;
								txttotal.setText("");
								contador = 1;
								txtingresos.setText("");
								lbstock.setText("");
								limpiar_rb();
								lbinicio.setVisible(true);

							}

							else {
								JOptionPane.showMessageDialog(null, "Revisé su bolsillo por favor");
							}
						} else {
							JOptionPane.showMessageDialog(null, "Lo sentimos no disponible en stock");
						}

					}

					if (rbkevin.isSelected() == true) {
						if (kevin > 0) {
							if (dinero >= 15) {
								int aux = dinero - 15;

								if (aux > 0) {
									mensaje = "Su cambio " + aux + " Q.";
								}
						

								JOptionPane.showMessageDialog(null,
										"Usted compro\nLlavero Cubo Kevin\n" + mensaje + " Gracias\nVuelta pronto");
								kevin = kevin - 1;
								//// reinicar maquina
								cantidades_ingresadas = "";
								dinero = 0;
								txttotal.setText("");
								contador = 1;
								txtingresos.setText("");
								lbstock.setText("");
								limpiar_rb();
								lbinicio.setVisible(true);
							}

							else {
								JOptionPane.showMessageDialog(null, "Revisé su bolsillo por favor");
							}
						} else {
							JOptionPane.showMessageDialog(null, "Lo sentimos no disponible en stock");
						}

					}

					if (rbbidon.isSelected() == true) {
						if (bidon > 0) {
							if (dinero >= 20) {
								int aux = dinero - 20;

								if (aux > 0) {
									mensaje = "Su cambio " + aux + " Q.";
								}

						
								JOptionPane.showMessageDialog(null,
										"Usted compro\nLlavero Bidon\n" + mensaje + " Gracias\nVuelta pronto");
								bidon = bidon - 1;
								//// reinicar maquina
								cantidades_ingresadas = "";
								dinero = 0;
								txttotal.setText("");
								contador = 1;
								txtingresos.setText("");
								lbstock.setText("");
								limpiar_rb();
								lbinicio.setVisible(true);

							}

							else {
								JOptionPane.showMessageDialog(null, "Revisé su bolsillo por favor");
							}
						} else {
							JOptionPane.showMessageDialog(null, "Lo sentimos no disponible en stock");
						}

					}

					if (rbscar.isSelected() == true) {
						if (scar > 0) {
							if (dinero >= 25) {
								int aux = dinero - 25;

								if (aux > 0) {
									mensaje = "Su cambio " + aux + " Q.";
								}
					

								JOptionPane.showMessageDialog(null,
										"Usted compro\nJuguete Scar\n" + mensaje + " Gracias\nVuelta pronto");
								scar = scar - 1;
								//// reinicar maquina
								cantidades_ingresadas = "";
								dinero = 0;
								txttotal.setText("");
								contador = 1;
								txtingresos.setText("");
								lbstock.setText("");
								limpiar_rb();
								lbinicio.setVisible(true);
							}

							else {
								JOptionPane.showMessageDialog(null, "Revisé su bolsillo por favor");
							}
						} else {
							JOptionPane.showMessageDialog(null, "Lo sentimos no disponible en stock");
						}

					}

					if (rbrocket.isSelected() == true) {
						if (rocket > 0) {
							if (dinero >= 30) {
								int aux = dinero - 30;

								if (aux > 0) {
									mensaje = "Su cambio " + aux + " Q.";
								}
						

								JOptionPane.showMessageDialog(null,
										"Usted compro\nJuguete Rocket\n" + mensaje + " Gracias\nVuelta pronto");
								rocket = rocket - 1;
								//// reinicar maquina
								cantidades_ingresadas = "";
								dinero = 0;
								txttotal.setText("");
								contador = 1;
								txtingresos.setText("");
								lbstock.setText("");
								limpiar_rb();
								lbinicio.setVisible(true);

							}

							else {
								JOptionPane.showMessageDialog(null, "Revisé su bolsillo por favor");
							}
						} else {
							JOptionPane.showMessageDialog(null, "Lo sentimos no disponible en stock");
						}

					}
					if (rbpump.isSelected() == true) {
						if (pump > 0) {
							if (dinero >= 35) {
								int aux = dinero - 35;

								if (aux > 0) {
									mensaje = "Su cambio " + aux + " Q.";
								}
						

								JOptionPane.showMessageDialog(null,
										"Usted compro\nJuguete Pump\n" + mensaje + " Gracias\nVuelta pronto");
								pump = pump - 1;
								//// reinicar maquina
								cantidades_ingresadas = "";
								dinero = 0;
								txttotal.setText("");
								contador = 1;
								txtingresos.setText("");
								lbstock.setText("");
								limpiar_rb();
								lbinicio.setVisible(true);

							}

							else {
								JOptionPane.showMessageDialog(null, "Revisé su bolsillo por favor");
							}
						} else {
							JOptionPane.showMessageDialog(null, "Lo sentimos no disponible en stock");
						}

					}

					if (rbp90.isSelected() == true) {
						if (p90 > 0) {
							if (dinero >= 40) {
								int aux = dinero - 40;

								if (aux > 0) {
									mensaje = "Su cambio " + aux + " Q.";
								}

						

								JOptionPane.showMessageDialog(null,
										"Usted compro\nJuguete P90\n" + mensaje + " Gracias\nVuelta pronto");
								p90 = p90 - 1;
								//// reinicar maquina
								cantidades_ingresadas = "";
								dinero = 0;
								txttotal.setText("");
								contador = 1;
								txtingresos.setText("");
								lbstock.setText("");
								limpiar_rb();
								lbinicio.setVisible(true);

							}

							else {
								JOptionPane.showMessageDialog(null, "Revisé su bolsillo por favor");
							}
						} else {
							JOptionPane.showMessageDialog(null, "Lo sentimos no disponible en stock");
						}

					}

					if (rbbomber.isSelected() == true) {
						if (bomber > 0) {
							if (dinero >= 45) {
								int aux = dinero - 45;

								if (aux > 0) {
									mensaje = "Su cambio " + aux + " Q.";
								}
							

								JOptionPane.showMessageDialog(null,
										"Usted compro\nPeluche Bomber\n" + mensaje + " Gracias\nVuelta pronto");
								bomber = bomber - 1;
								//// reinicar maquina
								cantidades_ingresadas = "";
								dinero = 0;
								txttotal.setText("");
								contador = 1;
								txtingresos.setText("");
								lbstock.setText("");
								limpiar_rb();
								lbinicio.setVisible(true);
							}

							else {
								JOptionPane.showMessageDialog(null, "Revisé su bolsillo por favor");
							}
						} else {
							JOptionPane.showMessageDialog(null, "Lo sentimos no disponible en stock");
						}

					}

					if (rbrex.isSelected() == true) {
						if (rex > 0) {
							if (dinero >= 50) {
								int aux = rex - 50;

								if (aux > 0) {
									mensaje = "Su cambio " + aux + " Q.";
								}

								JOptionPane.showMessageDialog(null,
										"Usted compro\nPeluche Rex\n" + mensaje + " Gracias\nVuelta pronto");
								rex = rex - 1;
								//// reinicar maquina
								cantidades_ingresadas = "";
								dinero = 0;
								txttotal.setText("");
								contador = 1;
								txtingresos.setText("");
								lbstock.setText("");
								limpiar_rb();
								lbinicio.setVisible(true);

							}

							else {
								JOptionPane.showMessageDialog(null, "Revisé su bolsillo por favor");
							}
						} else {
							JOptionPane.showMessageDialog(null, "Lo sentimos no disponible en stock");
						}

					}

					if (rbmidas.isSelected() == true) {
						if (scar > 0) {
							if (dinero >= 55) {
								int aux = dinero - 55;

								if (aux > 0) {
									mensaje = "Su cambio " + aux + " Q.";
								}
						
								JOptionPane.showMessageDialog(null,
										"Usted compro\nPeluche Midas\n" + mensaje + " Gracias\nVuelta pronto");
								midas = midas - 1;
								//// reinicar maquina
								cantidades_ingresadas = "";
								dinero = 0;
								txttotal.setText("");
								contador = 1;
								txtingresos.setText("");
								lbstock.setText("");
								limpiar_rb();
								lbinicio.setVisible(true);
							}

							else {
								JOptionPane.showMessageDialog(null, "Revisé su bolsillo por favor");
							}
						} else {
							JOptionPane.showMessageDialog(null, "Lo sentimos no disponible en stock");
						}

					}

					if (rbderiva.isSelected() == true) {
						if (deriva > 0) {
							if (dinero >= 60) {
								int aux = dinero - 60;

								if (aux > 0) {
									mensaje = "Su cambio " + aux + " Q.";
								}
						

								JOptionPane.showMessageDialog(null,
										"Usted compro\nPeluche Deriva\n" + mensaje + " Gracias\nVuelta pronto");
								deriva = deriva - 1;
								//// reinicar maquina
								cantidades_ingresadas = "";
								dinero = 0;
								txttotal.setText("");
								contador = 1;
								txtingresos.setText("");
								lbstock.setText("");
								limpiar_rb();
								lbinicio.setVisible(true);

							}

							else {
								JOptionPane.showMessageDialog(null, "Revisé su bolsillo por favor");
							}
						} else {
							JOptionPane.showMessageDialog(null, "Lo sentimos no disponible en stock");
						}

					}
					// cierro el if del contador
				}

			}
		});

	}

	public void mostrar_stock() {

		rbshield.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbstock.setText("Llavero Shield: Disponible " + shield + " unidades");
			}
		});

		rbllama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbstock.setText("Llavero Llama: Disponible " + llama + " unidades");
			}
		});

		rbkevin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbstock.setText("Llavero Kevin: Disponible " + kevin + " unidades");
			}
		});

		rbbidon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbstock.setText("Llavero Bidon: Disponible " + bidon + " unidades");
			}
		});

		rbscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbstock.setText("Juguete Scar: Disponible " + scar + " unidades");
			}
		});

		rbrocket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbstock.setText("Juguete Rocket: Disponible " + rocket + " unidades");
			}
		});
		
		rbpump.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbstock.setText("Juguete Pump: Disponible " + pump + " unidades");
			}
		});
		
		rbp90.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbstock.setText("Juguete P90: Disponible " + p90 + " unidades");
			}
		});
		
		rbbomber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbstock.setText("Peluche Bomber: Disponible " + bomber + " unidades");
			}
		});

		rbrex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbstock.setText("Peluche Rex: Disponible " + rex + " unidades");
			}
		});
		
		rbmidas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbstock.setText("Peluche Midas: Disponible " + midas + " unidades");
			}
		});
		
		rbderiva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbstock.setText("Peluche Deriva: Disponible " + deriva + " unidades");
			}
		});

	}


	public void limpiar_rb() {
		// MONEDAS
		monedas.remove(rb5Q);
		rb5Q.setSelected(false);
		monedas.add(rb5Q);

		monedas.remove(rb10Q);
		rb10Q.setSelected(false);
		monedas.add(rb10Q);

		monedas.remove(rb20Q);
		rb20Q.setSelected(false);
		monedas.add(rb20Q);

		monedas.remove(rb50Q);
		rb50Q.setSelected(false);
		monedas.add(rb50Q);


		items.remove(rbshield);
		rbshield.setSelected(false);
		items.add(rbshield);

		items.remove(rbllama);
		rbllama.setSelected(false);
		items.add(rbllama);

		items.remove(rbkevin);
		rbkevin.setSelected(false);
		items.add(rbkevin);

		items.remove(rbbidon);
		rbbidon.setSelected(false);
		items.add(rbbidon);

		items.remove(rbscar);
		rbscar.setSelected(false);
		items.add(rbscar);

		items.remove(rbrocket);
		rbrocket.setSelected(false);
		items.add(rbrocket);
		
		
		items.remove(rbpump);
		rbpump.setSelected(false);
		items.add(rbpump);

		items.remove(rbp90);
		rbp90.setSelected(false);
		items.add(rbp90);

		items.remove(rbbomber);
		rbbomber.setSelected(false);
		items.add(rbbomber);

		items.remove(rbrex);
		rbrex.setSelected(false);
		items.add(rbrex);

		items.remove(rbmidas);
		rbmidas.setSelected(false);
		items.add(rbmidas);

		items.remove(rbderiva);
		rbderiva.setSelected(false);
		items.add(rbderiva);

	}
}

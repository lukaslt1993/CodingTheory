package GUI;

import Math.Sending;
import Math.Coding;
import Math.Decoding;
import Math.Utils;
import javax.swing.text.Style;
import javax.swing.text.StyleContext;
import javax.swing.text.StyleConstants;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import javax.swing.text.Document;
import javax.swing.text.DefaultStyledDocument;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingWorker;
import javax.swing.filechooser.FileNameExtensionFilter;

public class GUI extends javax.swing.JFrame {

    private final javax.swing.JOptionPane jo = new javax.swing.JOptionPane();
    private final DefaultStyledDocument doc = new DefaultStyledDocument();
    private final DefaultStyledDocument doc2 = new DefaultStyledDocument();
    private final StyleContext context = new StyleContext();
    private final Style red = context.addStyle("red", null);
    private String text = "";
    private BufferedImage img;

    public GUI() {
        initComponents();
        StyleConstants.setForeground(red, Color.RED);
        jTextPane1.setDocument(doc);
        jTextPane2.setDocument(doc2);
        jRadioButton1.doClick();
    }

    /**
     * Sugeneruojama NetBeans GUI Builder'yje paruosta grafine vartotojo sasaja
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane8 = new javax.swing.JScrollPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextArea1KeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setText("Iveskite binarine informacija");

        jButton1.setText("Koduoti");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel3.setText("Uzkoduota informacija:");

        jButton2.setText("Siusti");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Dekoduoti");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setText("Dekoduota informacija:");

        jLabel7.setText("Is kanalo gauta informacija:");

        jButton3.setText("Klaidu statistika");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("Aktyvuoti redagavima");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Klaidu statistika");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextPane1.setEditable(false);
        jTextPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextPane1KeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(jTextPane1);

        jTextPane2.setEditable(false);
        jScrollPane4.setViewportView(jTextPane2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 514, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, 0)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton2))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jLabel7)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(805, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Scenarijus 1", jPanel2);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane5.setViewportView(jTextArea3);

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane6.setViewportView(jTextArea4);

        jTextArea5.setEditable(false);
        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane7.setViewportView(jTextArea5);

        jButton7.setText("Abu iskart");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Siusti ir atgaminti koduojant");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Siusti ir atgaminti nekoduojant");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel4.setText("Pradinis tekstas");

        jLabel8.setText("Siusta ir atgaminta nekoduojant");

        jLabel9.setText("Siusta ir atgaminta koduojant");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 466, Short.MAX_VALUE)
                        .addComponent(jButton9)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7)))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(975, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Scenarijus 2", jPanel1);

        jLabel13.setText("Pradinis paveiksliukas");

        jButton10.setText("Abu iskart");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Siusti ir atgaminti koduojant");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Siusti ir atgaminti nekoduojant");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("Atidaryti...");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel14.setText("Siusta ir atgaminta nekoduojant");

        jLabel15.setText("Siusta ir atgaminta koduojant");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(48, 48, 48)
                        .addComponent(jButton13)
                        .addGap(18, 18, 18)
                        .addComponent(jButton12)
                        .addGap(18, 18, 18)
                        .addComponent(jButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jButton10)))
                .addContainerGap(270, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(jButton13)
                    .addComponent(jButton12)
                    .addComponent(jButton11)
                    .addComponent(jButton10))
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Scenarijus 3", jPanel3);

        jLabel6.setText("Kanalo klaidu tikimybe =");

        jTextField1.setText("0.05");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jRadioButton1.setText("Pirmame scenarijuje naudoti interaktyvu rezima");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(756, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jRadioButton1)
                .addContainerGap(1289, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nustatymai", jPanel4);

        jScrollPane8.setViewportView(jTabbedPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
     * Atliekami abu antro scenarijaus punktai is karto
     */
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        jButton8.doClick();
        jButton9.doClick();
    }//GEN-LAST:event_jButton7ActionPerformed

    /*
     * Siusti ir atgaminti koduojant (antras scenarijus)
     */
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        byte[] bytes = jTextArea3.getText().getBytes();
        String bits = Utils.bytesToString(bytes);
        String coded = new Coding().encode(bits);
        String sent = new Sending().send(coded, Double.parseDouble(jTextField1.getText()));
        String decoded = new Decoding().decode(sent);
        jTextArea5.setText(Utils.bitsToString(decoded));
    }//GEN-LAST:event_jButton8ActionPerformed

    /*
     * Siusti ir atgaminti nekoduojant (antras scenarijus)
     */
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        byte[] bytes = jTextArea3.getText().getBytes();
        String bits = Utils.bytesToString(bytes);
        String sent = new Sending().send(bits, Double.parseDouble(jTextField1.getText()));
        jTextArea4.setText(Utils.bitsToString(sent));
    }//GEN-LAST:event_jButton9ActionPerformed

    /*
     * Atliekami abu trecio scenarijaus punktai iskart
     */
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        jButton12.doClick();
        jButton11.doClick();
    }//GEN-LAST:event_jButton10ActionPerformed

    /*
     * Siuntimas ir atgaminimas koduojant (3 scenarijus);
     * Uzkoduoti pradzios 54 baitai (uzkoduoti jie sudaro 108 baitus = 864 bitus)
     * nukopijuojami, nes tai BMP antraste
     */
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        String encoded = new Coding().encode(text);
        String s = encoded.substring(0, 864) + new Sending().send(encoded.substring(864), Double.parseDouble(jTextField1.getText()));
        String decoded = new Decoding().decode(s);
        InputStream in = new ByteArrayInputStream(Utils.bitsToBytes(decoded));
        try {
            img = ImageIO.read(in);
            Image dimg = img.getScaledInstance(jLabel12.getWidth(), jLabel12.getHeight(),
                    Image.SCALE_SMOOTH);
            jLabel12.setIcon(new ImageIcon(dimg));
        } catch (Exception ex) {
        }

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTextPane1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPane1KeyReleased

        if (jRadioButton1.isSelected()) {
            final boolean isBackspace = evt.paramString().contains("Backspace");
            final boolean b;
            final int cursor;
            final int length;
            if (jTextPane1.getText().length() != 0) {
                if (jTextPane1.getText().charAt(jTextPane1.getText().length() - 1) == ' ') {
                    length = jTextPane1.getText().length() - 1;
                    cursor = jTextPane1.getCaretPosition() - 1;
                    b = true;
                } else {
                    if ((jTextPane1.getCaretPosition() + 1) % 3 == 0 && isBackspace) {
                        length = jTextPane1.getText().length() - 1;
                        cursor = jTextPane1.getCaretPosition() - 1;
                        b = true;
                    } else {
                        cursor = jTextPane1.getCaretPosition();
                        length = jTextPane1.getText().length();
                        b = false;
                    }
                }
            } else {
                cursor = 0;
                length = 0;
                b = false;
            }
            new SwingWorker<Void, Void>() {
                @Override
                protected Void doInBackground() throws Exception {
                    errorsInteractive(jTextArea2, doc, true);
                    if (jTextPane1.getText().length() <= length) {
                        jTextPane1.setCaretPosition(cursor);
                    } else {
                        jTextPane1.setCaretPosition(cursor + jTextPane1.getText().length() - length);
                        if (jTextPane1.getText().charAt(cursor + 1) == ' ' && b) {
                            jTextPane1.setCaretPosition(jTextPane1.getCaretPosition() - 1);
                        }
                    }
                    return null;
                }
            }.execute();
        }
    }//GEN-LAST:event_jTextPane1KeyReleased

    /*
     * klaidu statistikos antras mygtukas (pirmas scenarijus)
     */
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        errorStats(jTextArea1, doc2);
    }//GEN-LAST:event_jButton6ActionPerformed

    /*
     * Aktyvuoti redagavima (pirmas scenarijus)
     */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        if (jTextArea2.getText().equals("")) {
            jTextPane1.setText("Neatlikti ankstesni veiksmai");
            return;
        }
        if (jTextPane1.isEditable()) {
            jTextPane1.setEditable(false);
            jButton5.setText("Aktyvuoti redagavima");
            errorsInteractive(jTextArea2, doc, true);
        } else {
            jTextPane1.setEditable(true);
            jButton5.setText("Patvirtinti pakeitimus");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    /*
     * klaidu statistikos pirmas mygtukas (pirmas scenarijus)
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        errorStats(jTextArea2, doc);
    }//GEN-LAST:event_jButton3ActionPerformed

    /*
     * dekodavimas (pirmas scenarijus)
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        if (jButton5.getText().equals("Aktyvuoti redagavima")) {
            try {
                jTextPane2.setText(new Decoding().decode(doc.getText(0, doc.getLength())));
            } catch (Exception ex) {
                jTextPane2.setText(ex.toString());
            }
            if (jTextPane2.getText().equals("Dekoduojamu simboliu turi buti lyginis skaicius ir ne maziau 12")) {
                jTextPane2.setText("Dekoduojamu simboliu turi buti lyginis skaicius ir ne maziau 12");
                return;
            }
            errorsInteractive(jTextArea1, doc2, false);
        } else {
            jTextPane2.setText("Nepatvirtinti pakeitimai");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    /*
     * siuntimas kanalu (pirmas scenarijus)
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        jTextPane1.setText("");
        double d = 0;
        try {
            d = Double.parseDouble(jTextField1.getText());
        } catch (Exception ex) {
            jTextPane1.setText("Neteisingai ivesta tikimybe");
            return;
        }
        if (d < 0 || d > 1) {
            jTextPane1.setText("tikimybe turi buti is intervalo [0; 1]");
            return;
        }
        jTextPane1.setText(new Sending().send(jTextArea2.getText().replaceAll("\\s", ""), d));
        errorsInteractive(jTextArea2, doc, true);
        jTextPane2.setText("");
        if (!jRadioButton1.isSelected()) {
            jButton5.setText("Aktyvuoti redagavima");
            jTextPane1.setEditable(false);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /*
     * kodavimas (pirmas scenarijus)
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jTextArea2.setText("");
        String encode = new Coding().encode(jTextArea1.getText());
        if (encode.equals("Neteisinga ivestis")) {
            jTextArea2.setText(encode);
            return;
        }
        for (int i = 0; i < encode.length(); i += 2) {
            jTextArea2.append(encode.substring(i, i + 2));
            jTextArea2.append(" ");
        }
        jTextPane1.setText("");
        jTextPane2.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextArea1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyTyped

        jTextArea2.setText("");
        jTextPane1.setText("");
        jTextPane2.setText("");
    }//GEN-LAST:event_jTextArea1KeyTyped

    /*
     * BMP paveiksliuko atidarymas (3 scenarijus)
     */
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        try {
            javax.swing.JFileChooser chooser = new javax.swing.JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("bmp image", "bmp");
            chooser.setFileFilter(filter);
            chooser.setAcceptAllFileFilterUsed(false);
            chooser.showOpenDialog(null);
            File f = chooser.getSelectedFile();
            String filename = f.getAbsolutePath();
            img = ImageIO.read(f);
            Image dimg = img.getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(),
                    Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(dimg);
            jLabel10.setIcon(icon);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(img, "bmp", baos);
            baos.flush();
            byte[] imageInByte = baos.toByteArray();
            text = Utils.bytesToString(imageInByte);
        } catch (Exception ex) {
        }

    }//GEN-LAST:event_jButton13ActionPerformed

    /*
     * Siuntimas ir atgaminimas nekoduojant (3 scenarijus);
     * 54 pradzios baitai (432 bitai) nukopijuojami, nes tai BMP antraste
     */
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        String s = text.substring(0, 432) + new Sending().send(text.substring(432), Double.parseDouble(jTextField1.getText()));
        InputStream in = new ByteArrayInputStream(Utils.bitsToBytes(s));
        try {
            img = ImageIO.read(in);
            Image dimg = img.getScaledInstance(jLabel11.getWidth(), jLabel11.getHeight(),
                    Image.SCALE_SMOOTH);
            jLabel11.setIcon(new ImageIcon(dimg));
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    }//GEN-LAST:event_jTextField1ActionPerformed

    /*
     * Pasirenkamas rezimas pirmame scenarijuje (Nustatymai)
     */
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

        if (jRadioButton1.isSelected()) {
            jButton5.setVisible(false);
            jTextPane1.setEditable(true);
            jButton5.setText("Aktyvuoti redagavima");
        } else {
            jButton5.setVisible(true);
            jTextPane1.setEditable(false);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    public static void main(String args[]) {
        /* Nustatyti GUI stiliu i Nimbus */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Sukurti ir parodyti GUI */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration//GEN-END:variables

    /*
     * jt - originalios informacijos langas, pagal kuri tikrinamos klaidos;
     * doc - dokumentas, reprezentuojantis teksta lange, kuriame tikrinamos
     * klaidos. Ne taip tiksliai bet suprantamiau - langas, kuriame tikrinamos
     * klaidos;
     * Isveda klaidu statistika
     */
    private void errorStats(javax.swing.JTextArea jt, Document doc) {
        ArrayList<Integer> errors = new ArrayList();
        String s1 = jt.getText().replaceAll("\\s", "");
        String s2;
        try {
            s2 = doc.getText(0, doc.getLength()).replaceAll("\\s", "");
        } catch (Exception ex) {
            jo.showMessageDialog(null, ex.toString());
            return;
        }
        String pos = "";
        for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
            if (s2.charAt(i) != s1.charAt(i)) {
                errors.add(i + 1);
                pos = pos + errors.get(errors.size() - 1) + " ";
            }
        }
        if (s2.length() > s1.length()) {
            for (int i = s1.length(); i < s2.length(); i++) {
                errors.add(i + 1);
                pos = pos + errors.get(errors.size() - 1) + " ";
            }
        } else {
            for (int i = s2.length(); i < s1.length(); i++) {
                errors.add(i + 1);
                pos = pos + errors.get(errors.size() - 1) + " ";
            }
        }
        javax.swing.JTextArea textArea = new javax.swing.JTextArea(6, 25);
        textArea.setText("Klaidu kiekis = " + errors.size() + "\nKlaidingu simboliu pozicijos:\n" + pos);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        jo.showMessageDialog(null, new javax.swing.JScrollPane(textArea));
    }

    /*
     * jt - originalios informacijos langas, pagal kuri tikrinamos klaidos;
     * d - dokumentas, reprezentuojantis teksta lange, kuriame tikrinamos
     * klaidos. Ne taip tiksliai bet suprantamiau - langas, kuriame tikrinamos
     * klaidos;
     * insertSpaces - ar interaktyviai parodomoje informacijoje skaitomumo
     * palengvinimui iterpti tarpus;
     * Raudonai atspausdina klaidingus bitus. Reaguoja i mygtuku atleidimus
     * lange. Uztat ir vadinama interaktyvu.
     */
    private void errorsInteractive(javax.swing.JTextArea jt, Document d, boolean insertSpaces) {
        String s1 = jt.getText().replaceAll("\\s", "");
        String s2;
        try {
            s2 = d.getText(0, d.getLength()).replaceAll("\\s", "");
            d.remove(0, d.getLength());
            for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
                if (s2.charAt(i) != s1.charAt(i)) {
                    d.insertString(d.getLength(), s2.substring(i, i + 1), red);
                } else {
                    d.insertString(d.getLength(), s2.substring(i, i + 1), null);
                }
                if ((i + 1) % 2 == 0 && insertSpaces && i < Math.min(s1.length(), s2.length()) - 1) {
                    d.insertString(d.getLength(), " ", null);
                }
            }
            if (s2.length() > s1.length() && insertSpaces && s1.length() >= 12) {
                d.insertString(d.getLength(), " ", null);
            }
            for (int i = s1.length(); i < s2.length(); i++) {
                d.insertString(d.getLength(), s2.substring(i, i + 1), red);
                if ((i + 1) % 2 == 0 && insertSpaces && i < s2.length() - 1) {
                    d.insertString(d.getLength(), " ", null);
                }
            }

        } catch (Exception ex) {
        }
    }
}

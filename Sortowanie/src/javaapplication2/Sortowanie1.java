package javaapplication2;

import static java.lang.Math.ceil;
import static java.lang.Math.floor;
import java.util.Random;
import javax.swing.JTextField;

public class Sortowanie1 extends javax.swing.JFrame {

    boolean roslaco = true, malejaco = false;
    Long time, time1, time2;

    public Sortowanie1() {
        initComponents();
        jTFwektorwejsciowy.setEditable(false);
        JTFwektorwyjsciowy.setEditable(false);
        jTextField1.setEditable(false);
        jRRosnaco.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Oblicz = new javax.swing.JButton();
        jTFLiczbaElementów = new javax.swing.JTextField();
        JTFwektorwyjsciowy = new javax.swing.JTextField();
        jTFwektorwejsciowy = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRRosnaco = new javax.swing.JRadioButton();
        jRMalejaco = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jTFZakres = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Oblicz.setBackground(new java.awt.Color(204, 204, 255));
        Oblicz.setText("Oblicz");
        Oblicz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ObliczMouseClicked(evt);
            }
        });
        Oblicz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObliczActionPerformed(evt);
            }
        });

        jTFLiczbaElementów.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFLiczbaElementówActionPerformed(evt);
            }
        });

        JTFwektorwyjsciowy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFwektorwyjsciowyActionPerformed(evt);
            }
        });

        jTFwektorwejsciowy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFwektorwejsciowyActionPerformed(evt);
            }
        });

        jLabel1.setText("Liczba elementów wektora:");

        jLabel2.setText("Wektor wejściowy");

        jLabel3.setText("Wektor wyjściowy");

        buttonGroup1.add(jRRosnaco);
        jRRosnaco.setText("Rosnąco");
        jRRosnaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRRosnacoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRMalejaco);
        jRMalejaco.setText("Malejąco");
        jRMalejaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRMalejacoActionPerformed(evt);
            }
        });

        jLabel4.setText("Kierunek sortowania:");

        jTFZakres.setToolTipText("");
        jTFZakres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFZakresActionPerformed(evt);
            }
        });

        jLabel5.setText("Zakres");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Czas sortowania");

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jTFLiczbaElementów, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(74, 74, 74)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFZakres, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTFwektorwejsciowy, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(48, 48, 48)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jRMalejaco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jRRosnaco)))
                                        .addComponent(jLabel4))
                                    .addGap(57, 57, 57)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(69, 69, 69)
                                            .addComponent(Oblicz, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(JTFwektorwyjsciowy, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(87, 87, 87)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFZakres)
                    .addComponent(jTFLiczbaElementów))
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTFwektorwejsciowy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(JTFwektorwyjsciowy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Oblicz, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jRRosnaco, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRMalejaco)))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void jTFLiczbaElementówActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFLiczbaElementówActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFLiczbaElementówActionPerformed

    private void jTFwektorwejsciowyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFwektorwejsciowyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFwektorwejsciowyActionPerformed

    private void jRRosnacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRRosnacoActionPerformed

    }//GEN-LAST:event_jRRosnacoActionPerformed

    private void jRMalejacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRMalejacoActionPerformed

    }//GEN-LAST:event_jRMalejacoActionPerformed

    private void ObliczMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ObliczMouseClicked

        String tempString = new String();
        int[] wynik;
        wynik = generujLosowo(Integer.parseInt(jTFLiczbaElementów.getText()));
        for (int i = 0; i < wynik.length; i++) {
            tempString = tempString + Integer.toString(wynik[i]) + " ";
        }
        jTFwektorwejsciowy.setText(tempString);
        wynik = Sort(wynik, jRRosnaco.isSelected());
        //wynik = mergeSort(wynik, jRRosnaco.isSelected());
        //wynik = bubleSort(wynik, jRRosnaco.isSelected());
        tempString = "";
        for (int i = 0; i < wynik.length; i++) {
            tempString = tempString + Integer.toString(wynik[i]) + " ";
        }
        JTFwektorwyjsciowy.setText(tempString);

    }//GEN-LAST:event_ObliczMouseClicked

    private void jTFZakresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFZakresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFZakresActionPerformed

    private void JTFwektorwyjsciowyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFwektorwyjsciowyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFwektorwyjsciowyActionPerformed

    private void ObliczActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObliczActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ObliczActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sortowanie1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sortowanie1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sortowanie1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sortowanie1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Sortowanie1().setVisible(true);
        });

    }

    private int getZakres() {

        int a = Integer.parseInt(jTFZakres.getText());
        return a;
    }

    private int[] generujLosowo(int ileElementow) {

        Random rand = new Random();
        int[] wektor = new int[ileElementow];
        for (int i = 0; i < ileElementow; i++) {
            wektor[i] = rand.nextInt(getZakres());
        }
        return wektor;
    }

    private int[] Sort(int[] wektor, boolean roslaco) {
        int key, i;
        time1 = System.nanoTime();
        for (int j = 1; j < wektor.length; j++) {
            key = wektor[j];
            i = j - 1;
            if (roslaco == true) {
                while (i >= 0 && wektor[i] > key) {
                    wektor[i + 1] = wektor[i--];
                }
            } else {
                while (i >= 0 && wektor[i] < key) {
                    wektor[i + 1] = wektor[i--];
                }
            }
            wektor[i + 1] = key;
        }
        time2 = System.nanoTime();
        time = time2 - time1;
        String finish = Long.toString(time);
        jTextField1.setText(finish);
        return wektor;
    }

    private int[] mergeSort(int[] wektor, boolean roslaco) {
        time1 = System.nanoTime();
        if (wektor.length != 1) {
            float dlugoszc = (float) wektor.length / 2;
            int[] wm, ww;
            wm = new int[(int) floor(dlugoszc)];
            ww = new int[(int) ceil(dlugoszc)];
            int i;
            for (i = 0; i < floor(dlugoszc); i++) {
                wm[i] = wektor[i];
                ww[i] = wektor[i + (int) floor(dlugoszc)];
            }
            if ((wektor.length % 2) != 0) {
                ww[i] = wektor[i + (int) floor(dlugoszc)];
            }

            int[] wektor1 = mergeSort(wm, roslaco);
            int[] wektor2 = mergeSort(ww, roslaco);
            wektor = merge(wektor1, wektor2, roslaco);
        }
        time2 = System.nanoTime();
        time = time2 - time1;
        String finish = Long.toString(time);
        jTextField1.setText(finish);
        return wektor;
    }

    int[] merge(int[] wm, int[] ww, boolean rosloco) {
        int[] wynik;
        int i = 0, k = 0, l = 0;
        wynik = new int[wm.length + ww.length];

        while (k < wm.length && l < ww.length) {
            if (rosloco) {
                wynik[i++] = wm[k] < ww[l] ? wm[k++] : ww[l++];
            } else {
                wynik[i++] = wm[k] > ww[l] ? wm[k++] : ww[l++];
            }
        }
        if (k < wm.length) {
            for (int j = k; j < wm.length; j++) {
                wynik[i++] = wm[j];
            }
        } else {
            for (int j = l; j < ww.length; j++) {
                wynik[i++] = ww[j];
            }
        }
        return wynik;
    }

    int[] bubleSort(int[] wektor, boolean roslaco) {
        time1 = System.nanoTime();
        int n = wektor.length;
        int t = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (roslaco) {
                    if (wektor[j - 1] > wektor[j]) {
                        t = wektor[j - 1];
                        wektor[j - 1] = wektor[j];
                        wektor[j] = t;
                    }
                } else if (wektor[j - 1] < wektor[j]) {
                    t = wektor[j - 1];
                    wektor[j - 1] = wektor[j];
                    wektor[j] = t;
                }

            }
        }
        time2 = System.nanoTime();
        time = time2 - time1;
        String finish = Long.toString(time);
        jTextField1.setText(finish);
        return wektor;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTFwektorwyjsciowy;
    private javax.swing.JButton Oblicz;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRMalejaco;
    private javax.swing.JRadioButton jRRosnaco;
    private javax.swing.JTextField jTFLiczbaElementów;
    private javax.swing.JTextField jTFZakres;
    private javax.swing.JTextField jTFwektorwejsciowy;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}

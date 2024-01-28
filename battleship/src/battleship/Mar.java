//prueba fer
/*
prueba hans
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package battleship;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.CellEditor;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

/**
 *
 * @author Ferna
 */
public class Mar extends javax.swing.JFrame {

    DefaultTableModel modelSea, modelRadar;

    boolean ship5Slots, ship4Slots, ship3Slots1, ship3Slots2, ship2Slots;
    
    ArrayList<Integer> currentPlacedUnitsArrayList = new ArrayList<>();
    DefaultTableCellRenderer defaultTableCellRenderer = new DefaultTableCellRenderer();
    JTextField textbox = new JTextField();
    
    
    /**
     * Creates new form Mar
     */
    public Mar() {
        initComponents();
        setShipImagesOnLabels();
        tblSea.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
//        tblSea.setColumnSelectionAllowed(true);
//        tblSea.setRowSelectionAllowed(false);
        tblSea.setCellSelectionEnabled(true);
        modelSea = (DefaultTableModel) tblSea.getModel();
        modelRadar = (DefaultTableModel) tblRadar.getModel();

        setTableWidthAndHeight(tblSea);
        
                
        
        
        tblSea.setCellEditor(new DefaultCellEditor(textbox));
        
        
//        setTableWidthAndHeight(tblRadar);

        //sets the imageIcon on lblRadarBackground
//        BufferedImage bufferedImage;
//        File file = new File("C:\\battleshipAssets\\radarBlue.png");
//        try {
//            bufferedImage = ImageIO.read(file);
//            ImageIcon imageIcon = new ImageIcon(bufferedImage);
//            lblRadarBackground.setIcon(imageIcon);
//        } catch (IOException ex) {
//            Logger.getLogger(Mar.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBoardTopNumbers = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblBoardSideA = new javax.swing.JLabel();
        lblBoardSideB = new javax.swing.JLabel();
        lblBoardSideC = new javax.swing.JLabel();
        lblBoardSideD = new javax.swing.JLabel();
        lblBoardSideE = new javax.swing.JLabel();
        lblBoardSideF = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblBoardTopNumbers1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblBoardSideA1 = new javax.swing.JLabel();
        lblBoardSideB1 = new javax.swing.JLabel();
        lblBoardSideC1 = new javax.swing.JLabel();
        lblBoardSideD1 = new javax.swing.JLabel();
        lblBoardSideE1 = new javax.swing.JLabel();
        lblBoardSideF1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblCarrier5Slots = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSea = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRadar = new javax.swing.JTable();
        lblBattleship4Slots = new javax.swing.JLabel();
        lblCruiser3Slots = new javax.swing.JLabel();
        lblSubmarine3Slots = new javax.swing.JLabel();
        lblDestroyer2Slots = new javax.swing.JLabel();
        lblShipsMessageDialog = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1500, 1000));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1500, 1000));
        setMinimumSize(new java.awt.Dimension(1500, 1000));
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        getContentPane().setLayout(null);

        lblBoardTopNumbers.setText("1                  2                 3                  4                   5                6                   7                   8                 9                 10");
        getContentPane().add(lblBoardTopNumbers);
        lblBoardTopNumbers.setBounds(70, 80, 600, 16);

        jLabel1.setText("J");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 670, 20, 16);

        lblBoardSideA.setText("A");
        getContentPane().add(lblBoardSideA);
        lblBoardSideA.setBounds(20, 130, 20, 16);

        lblBoardSideB.setText("B");
        getContentPane().add(lblBoardSideB);
        lblBoardSideB.setBounds(20, 190, 20, 16);

        lblBoardSideC.setText("C");
        getContentPane().add(lblBoardSideC);
        lblBoardSideC.setBounds(20, 250, 20, 16);

        lblBoardSideD.setText("D");
        getContentPane().add(lblBoardSideD);
        lblBoardSideD.setBounds(20, 310, 20, 16);

        lblBoardSideE.setText("E");
        getContentPane().add(lblBoardSideE);
        lblBoardSideE.setBounds(20, 370, 20, 16);

        lblBoardSideF.setText("F");
        getContentPane().add(lblBoardSideF);
        lblBoardSideF.setBounds(20, 430, 20, 16);

        jLabel10.setText("G");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 490, 20, 16);

        jLabel11.setText("H");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 550, 20, 16);

        jLabel12.setText("I");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 610, 20, 16);

        lblBoardTopNumbers1.setText("1                  2                 3                  4                   5                6                   7                   8                 9                 10");
        getContentPane().add(lblBoardTopNumbers1);
        lblBoardTopNumbers1.setBounds(800, 80, 600, 16);

        jLabel2.setText("J");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(750, 670, 20, 16);

        lblBoardSideA1.setText("A");
        getContentPane().add(lblBoardSideA1);
        lblBoardSideA1.setBounds(750, 130, 20, 16);

        lblBoardSideB1.setText("B");
        getContentPane().add(lblBoardSideB1);
        lblBoardSideB1.setBounds(750, 190, 20, 16);

        lblBoardSideC1.setText("C");
        getContentPane().add(lblBoardSideC1);
        lblBoardSideC1.setBounds(750, 250, 20, 16);

        lblBoardSideD1.setText("D");
        getContentPane().add(lblBoardSideD1);
        lblBoardSideD1.setBounds(750, 310, 20, 16);

        lblBoardSideE1.setText("E");
        getContentPane().add(lblBoardSideE1);
        lblBoardSideE1.setBounds(750, 370, 20, 16);

        lblBoardSideF1.setText("F");
        getContentPane().add(lblBoardSideF1);
        lblBoardSideF1.setBounds(750, 430, 20, 16);

        jLabel13.setText("G");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(750, 490, 20, 16);

        jLabel14.setText("H");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(750, 550, 20, 16);

        jLabel15.setText("I");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(750, 610, 20, 16);

        lblCarrier5Slots.setBackground(new java.awt.Color(153, 153, 153));
        lblCarrier5Slots.setText("5SlotCarrier");
        lblCarrier5Slots.setOpaque(true);
        lblCarrier5Slots.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblCarrier5SlotsMouseReleased(evt);
            }
        });
        getContentPane().add(lblCarrier5Slots);
        lblCarrier5Slots.setBounds(50, 800, 180, 66);

        tblSea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10"},
                {"B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10"},
                {"C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10"},
                {"D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10"},
                {"E1", "E2", "E3", "E4", "D5", "D6", "D7", "D8", "D9", "D10"},
                {"F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10"},
                {"G1", "G2", "G3", "G4", "G5", "G6", "G6", "G8", "G9", "G10"},
                {"H1", "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H10"},
                {"I1", "I2", "I3", "I4", "I5", "I6", "I7", "I8", "I9", "I10"},
                {"J1", "J2", "J3", "J4", "J5", "J6", "J7", "J8", "J9", "J10"}
            },
            new String [] {
                "A1", "A2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSea.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblSea.setEnabled(false);
        tblSea.setMaximumSize(new java.awt.Dimension(600, 600));
        tblSea.setMinimumSize(new java.awt.Dimension(600, 600));
        tblSea.setPreferredSize(new java.awt.Dimension(600, 600));
        tblSea.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tblSea.setTableHeader(null);
        tblSea.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tblSeaMouseMoved(evt);
            }
        });
        tblSea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblSeaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblSea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 110, 610, 610);

        tblRadar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblRadar.setTableHeader(null);
        jScrollPane2.setViewportView(tblRadar);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(830, 150, 452, 402);

        lblBattleship4Slots.setBackground(new java.awt.Color(153, 153, 153));
        lblBattleship4Slots.setText("4SlotsBattleship");
        lblBattleship4Slots.setOpaque(true);
        lblBattleship4Slots.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblBattleship4SlotsMouseReleased(evt);
            }
        });
        getContentPane().add(lblBattleship4Slots);
        lblBattleship4Slots.setBounds(240, 810, 150, 50);

        lblCruiser3Slots.setBackground(new java.awt.Color(153, 153, 153));
        lblCruiser3Slots.setText("3Slots1");
        lblCruiser3Slots.setOpaque(true);
        lblCruiser3Slots.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblCruiser3SlotsMouseReleased(evt);
            }
        });
        getContentPane().add(lblCruiser3Slots);
        lblCruiser3Slots.setBounds(410, 820, 120, 45);

        lblSubmarine3Slots.setBackground(new java.awt.Color(153, 153, 153));
        lblSubmarine3Slots.setText("3Slots2");
        lblSubmarine3Slots.setOpaque(true);
        lblSubmarine3Slots.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSubmarine3SlotsMouseReleased(evt);
            }
        });
        getContentPane().add(lblSubmarine3Slots);
        lblSubmarine3Slots.setBounds(50, 900, 120, 36);

        lblDestroyer2Slots.setBackground(new java.awt.Color(153, 153, 153));
        lblDestroyer2Slots.setText("2Slots");
        lblDestroyer2Slots.setOpaque(true);
        lblDestroyer2Slots.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblDestroyer2SlotsMouseReleased(evt);
            }
        });
        getContentPane().add(lblDestroyer2Slots);
        lblDestroyer2Slots.setBounds(190, 890, 80, 50);

        lblShipsMessageDialog.setBackground(new java.awt.Color(51, 255, 51));
        lblShipsMessageDialog.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblShipsMessageDialog.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShipsMessageDialog.setText("Coloca tus unidades!");
        lblShipsMessageDialog.setOpaque(true);
        getContentPane().add(lblShipsMessageDialog);
        lblShipsMessageDialog.setBounds(50, 730, 610, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblSeaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSeaMouseMoved
        // TODO add your handling code here:

//        tblMar.setColumnSelectionAllowed(true);
        tblSea = (JTable) evt.getSource();
        int column = tblSea.columnAtPoint(evt.getPoint());
        int row = tblSea.rowAtPoint(evt.getPoint());
        tblSea.changeSelection(row, column, false, false);
    }//GEN-LAST:event_tblSeaMouseMoved

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
        tblSea.clearSelection();
        tblRadar.clearSelection();
    }//GEN-LAST:event_formMouseMoved

    private void lblCarrier5SlotsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarrier5SlotsMouseReleased
        // TODO add your handling code here:
        lblShipsMessageDialog.setText("Portaaviones seleccionado (5 pts)");
        changeSelectedShipState(false);
        ship5Slots = true;
    }//GEN-LAST:event_lblCarrier5SlotsMouseReleased

    private void lblBattleship4SlotsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBattleship4SlotsMouseReleased
        // TODO add your handling code here:
        lblShipsMessageDialog.setText("Nave de batalla seleccionado (4 pts)");
        changeSelectedShipState(false);
        ship4Slots=true;
    }//GEN-LAST:event_lblBattleship4SlotsMouseReleased

    private void lblCruiser3SlotsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCruiser3SlotsMouseReleased
        // TODO add your handling code here:
        lblShipsMessageDialog.setText("Crucero seleccionado (3 pts)");
        changeSelectedShipState(false);
        ship3Slots1=true;
    }//GEN-LAST:event_lblCruiser3SlotsMouseReleased

    private void lblSubmarine3SlotsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSubmarine3SlotsMouseReleased
        // TODO add your handling code here:
        lblShipsMessageDialog.setText("Submarino seleccionado (3 pts)");
        changeSelectedShipState(false);
        ship3Slots2=true;
    }//GEN-LAST:event_lblSubmarine3SlotsMouseReleased

    private void lblDestroyer2SlotsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDestroyer2SlotsMouseReleased
        // TODO add your handling code here:
        lblShipsMessageDialog.setText("Destructor seleccionado (2 pts)");
        changeSelectedShipState(false);
        ship2Slots=true;
    }//GEN-LAST:event_lblDestroyer2SlotsMouseReleased

    private void tblSeaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSeaMouseReleased
        // TODO add your handling code here:
//        JTable tableCoords = new JTable();
//        tableCoords = (JTable) evt.getSource();
//        
//        int xCoord = tableCoords.columnAtPoint(evt.getPoint());
//        int yCoord = tableCoords.rowAtPoint(evt.getPoint());
//        
        
        int yCoord = tblSea.getSelectedRow();
        int xCoord = tblSea.getSelectedColumn();
        
//        tblSea.getCellEditor(yCoord, xCoord).


//        TableColumn column = tblSea.getColumnModel().getColumn(xCoord);
//        column.setCellEditor(new DefaultCellEditor(textbox));
//        tblSea.setCellEditor(new DefaultCellEditor(textbox));
        textbox.setBackground(Color.red);
        
        
        
        System.out.println("x: "+xCoord);
        System.out.println("y: "+yCoord);
    }//GEN-LAST:event_tblSeaMouseReleased

    private void setUnits(){
        
    }
    
    
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
            java.util.logging.Logger.getLogger(Mar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mar().setVisible(true);
            }
        });
    }

    private void setTableWidthAndHeight(JTable tabla) {
        tabla.setRowHeight(60);
//        tabla.setAutoResizeMode(tabla.AUTO_RESIZE_OFF);

        for (int i = 0; i < 10; i++) {
            tabla.getColumnModel().getColumn(i).setPreferredWidth(60);

            
            defaultTableCellRenderer.setHorizontalAlignment(JLabel.CENTER);
            tabla.getColumnModel().getColumn(i).setCellRenderer(defaultTableCellRenderer);

        }

        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        tabla.setPreferredScrollableViewportSize(null);
    }

    private void changeSelectedShipState(boolean state) {
        if (state) {
            ship5Slots = true;
            ship4Slots = true;
            ship3Slots1 = true;
            ship3Slots2 = true;
            ship2Slots = true;
        } else {
            ship5Slots = false;
            ship4Slots = false;
            ship3Slots1 = false;
            ship3Slots2 = false;
            ship2Slots = false;
        }
    }

    private void setShipImagesOnLabels() {

        File file5Slot = new File("C:\\battleshipAssets\\5Slot.png");
        File file4Slot = new File("C:\\battleshipAssets\\4Slot.png");
        File file3Slot1 = new File("C:\\battleshipAssets\\3Slot1.png");
        File file3Slot2 = new File("C:\\battleshipAssets\\3Slot2.png");
        File file2Slot = new File("C:\\battleshipAssets\\2Slot.png");
        BufferedImage bufferedImage;
        try {
            bufferedImage = ImageIO.read(file5Slot);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            lblCarrier5Slots.setIcon(imageIcon);

            bufferedImage = ImageIO.read(file4Slot);
            imageIcon = new ImageIcon(bufferedImage);
            lblBattleship4Slots.setIcon(imageIcon);

            bufferedImage = ImageIO.read(file3Slot1);
            imageIcon = new ImageIcon(bufferedImage);
            lblCruiser3Slots.setIcon(imageIcon);

            bufferedImage = ImageIO.read(file3Slot2);
            imageIcon = new ImageIcon(bufferedImage);
            lblSubmarine3Slots.setIcon(imageIcon);

            bufferedImage = ImageIO.read(file2Slot);
            imageIcon = new ImageIcon(bufferedImage);
            lblDestroyer2Slots.setIcon(imageIcon);
        } catch (IOException ex) {
            Logger.getLogger(Mar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBattleship4Slots;
    private javax.swing.JLabel lblBoardSideA;
    private javax.swing.JLabel lblBoardSideA1;
    private javax.swing.JLabel lblBoardSideB;
    private javax.swing.JLabel lblBoardSideB1;
    private javax.swing.JLabel lblBoardSideC;
    private javax.swing.JLabel lblBoardSideC1;
    private javax.swing.JLabel lblBoardSideD;
    private javax.swing.JLabel lblBoardSideD1;
    private javax.swing.JLabel lblBoardSideE;
    private javax.swing.JLabel lblBoardSideE1;
    private javax.swing.JLabel lblBoardSideF;
    private javax.swing.JLabel lblBoardSideF1;
    private javax.swing.JLabel lblBoardTopNumbers;
    private javax.swing.JLabel lblBoardTopNumbers1;
    private javax.swing.JLabel lblCarrier5Slots;
    private javax.swing.JLabel lblCruiser3Slots;
    private javax.swing.JLabel lblDestroyer2Slots;
    private javax.swing.JLabel lblShipsMessageDialog;
    private javax.swing.JLabel lblSubmarine3Slots;
    private javax.swing.JTable tblRadar;
    private javax.swing.JTable tblSea;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battaglianavale;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;

/**
 *
 * @author giada
 */
public class interfaccia extends javax.swing.JFrame {

    /**
     * Creates new form interfaccia
     */
    int acqua[][],miaAcqua [][],lMat, run, mosse, linguaggio, fineGioco, punteggio, numeroNavi, lMosse;
    ArrayList click;

    public interfaccia() {
        initComponents();
        if(facile.isSelected()==true)
        {
            lMat=5;
            acqua = new int [lMat][lMat];
        }
        else if(medio.isSelected()==true)
        {
            lMat=7;
            acqua = new int [lMat][lMat];
        }
        else if(difficile.isSelected()==true)
        {
            lMat=10;
            acqua = new int [lMat][lMat];
        }
        run = 0;
        mosse = 0;
        linguaggio = 0;
        fineGioco = 0;
        punteggio = 0;
        numeroNavi = 0;
        lMosse = 0;
        click = new ArrayList();
        acqua = new int[lMat][lMat];
        miaAcqua = new int [lMat][lMat];
        //proprietà componenti inziali
        insert.setVisible(false);
        if (facile.isSelected() == true) {
            J.setVisible(false);
            F.setVisible(false);
            G.setVisible(false);
            H.setVisible(false);
            I.setVisible(false);
            dieci.setVisible(false);
            nove.setVisible(false);
            otto.setVisible(false);
            sette.setVisible(false);
            sei.setVisible(false);
            zero_cinque.setVisible(false);
            zero_sei.setVisible(false);
            zero_sette.setVisible(false);
            zero_otto.setVisible(false);
            zero_nove.setVisible(false);
            uno_cinque.setVisible(false);
            uno_sei.setVisible(false);
            uno_sette.setVisible(false);
            uno_otto.setVisible(false);
            uno_nove.setVisible(false);
            due_cinque.setVisible(false);
            due_sei.setVisible(false);
            due_sette.setVisible(false);
            due_otto.setVisible(false);
            due_nove.setVisible(false);
            tre_cinque.setVisible(false);
            tre_sei.setVisible(false);
            tre_sette.setVisible(false);
            tre_otto.setVisible(false);
            tre_nove.setVisible(false);
            quattro_cinque.setVisible(false);
            quattro_sei.setVisible(false);
            quattro_sette.setVisible(false);
            quattro_otto.setVisible(false);
            quattro_nove.setVisible(false);
            cinque_zero.setVisible(false);
            cinque_uno.setVisible(false);
            cinque_due.setVisible(false);
            cinque_tre.setVisible(false);
            cinque_quattro.setVisible(false);
            cinque_cinque.setVisible(false);
            cinque_sei.setVisible(false);
            cinque_sette.setVisible(false);
            cinque_otto.setVisible(false);
            cinque_nove.setVisible(false);
            sei_zero.setVisible(false);
            sei_uno.setVisible(false);
            sei_due.setVisible(false);
            sei_tre.setVisible(false);
            sei_quattro.setVisible(false);
            sei_cinque.setVisible(false);
            sei_sei.setVisible(false);
            sei_sette.setVisible(false);
            sei_otto.setVisible(false);
            sei_nove.setVisible(false);
            sette_zero.setVisible(false);
            sette_uno.setVisible(false);
            sette_due.setVisible(false);
            sette_tre.setVisible(false);
            sette_quattro.setVisible(false);
            sette_cinque.setVisible(false);
            sette_sei.setVisible(false);
            sette_sette.setVisible(false);
            sette_otto.setVisible(false);
            sette_nove.setVisible(false);
            otto_zero.setVisible(false);
            otto_uno.setVisible(false);
            otto_due.setVisible(false);
            otto_tre.setVisible(false);
            otto_quattro.setVisible(false);
            otto_cinque.setVisible(false);
            otto_sei.setVisible(false);
            otto_sette.setVisible(false);
            otto_otto.setVisible(false);
            otto_nove.setVisible(false);
            nove_zero.setVisible(false);
            nove_uno.setVisible(false);
            nove_due.setVisible(false);
            nove_tre.setVisible(false);
            nove_quattro.setVisible(false);
            nove_cinque.setVisible(false);
            nove_sei.setVisible(false);
            nove_sette.setVisible(false);
            nove_otto.setVisible(false);
            nove_nove.setVisible(false);

            zero_zero.setEnabled(false);
            zero_uno.setEnabled(false);
            zero_due.setEnabled(false);
            zero_tre.setEnabled(false);
            zero_quattro.setEnabled(false);
            zero_cinque.setEnabled(false);
            uno_zero.setEnabled(false);
            uno_uno.setEnabled(false);
            uno_due.setEnabled(false);
            uno_tre.setEnabled(false);
            uno_quattro.setEnabled(false);
            uno_cinque.setEnabled(false);
            due_zero.setEnabled(false);
            due_uno.setEnabled(false);
            due_due.setEnabled(false);
            due_tre.setEnabled(false);
            due_quattro.setEnabled(false);
            due_cinque.setEnabled(false);
            tre_zero.setEnabled(false);
            tre_uno.setEnabled(false);
            tre_due.setEnabled(false);
            tre_tre.setEnabled(false);
            tre_quattro.setEnabled(false);
            tre_cinque.setEnabled(false);
            quattro_zero.setEnabled(false);
            quattro_uno.setEnabled(false);
            quattro_due.setEnabled(false);
            quattro_tre.setEnabled(false);
            quattro_quattro.setEnabled(false);
            quattro_cinque.setEnabled(false);
            cinque_zero.setEnabled(false);
            cinque_uno.setEnabled(false);
            cinque_due.setEnabled(false);
            cinque_tre.setEnabled(false);
            cinque_quattro.setEnabled(false);
            cinque_cinque.setEnabled(false);

            zero_zero.setBackground(Color.white);
            zero_uno.setBackground(Color.white);
            zero_due.setBackground(Color.white);
            zero_tre.setBackground(Color.white);
            zero_quattro.setBackground(Color.white);
            uno_zero.setBackground(Color.white);
            uno_uno.setBackground(Color.white);
            uno_due.setBackground(Color.white);
            uno_tre.setBackground(Color.white);
            uno_quattro.setBackground(Color.white);
            due_zero.setBackground(Color.white);
            due_uno.setBackground(Color.white);
            due_due.setBackground(Color.white);
            due_tre.setBackground(Color.white);
            due_quattro.setBackground(Color.white);
            tre_zero.setBackground(Color.white);
            tre_uno.setBackground(Color.white);
            tre_due.setBackground(Color.white);
            tre_tre.setBackground(Color.white);
            tre_quattro.setBackground(Color.white);
            quattro_zero.setBackground(Color.white);
            quattro_uno.setBackground(Color.white);
            quattro_due.setBackground(Color.white);
            quattro_tre.setBackground(Color.white);
            quattro_quattro.setBackground(Color.white);
        }
        if (solitario.isSelected()) {

            zero_zero1.setEnabled(false);
            zero_uno1.setEnabled(false);
            zero_due1.setEnabled(false);
            zero_tre1.setEnabled(false);
            zero_quattro1.setEnabled(false);
            uno_zero1.setEnabled(false);
            uno_uno1.setEnabled(false);
            uno_due1.setEnabled(false);
            uno_tre1.setEnabled(false);
            uno_quattro1.setEnabled(false);
            due_zero1.setEnabled(false);
            due_uno1.setEnabled(false);
            due_due1.setEnabled(false);
            due_tre1.setEnabled(false);
            due_quattro1.setEnabled(false);
            tre_zero1.setEnabled(false);
            tre_uno1.setEnabled(false);
            tre_due1.setEnabled(false);
            tre_tre1.setEnabled(false);
            tre_quattro1.setEnabled(false);
            quattro_zero1.setEnabled(false);
            quattro_uno1.setEnabled(false);
            quattro_due1.setEnabled(false);
            quattro_tre1.setEnabled(false);
            quattro_quattro1.setEnabled(false);

            zero_cinque1.setEnabled(false);
            zero_sei1.setEnabled(false);
            zero_sette1.setEnabled(false);
            zero_otto1.setEnabled(false);
            zero_nove1.setEnabled(false);
            uno_cinque1.setEnabled(false);
            uno_sei1.setEnabled(false);
            uno_sette1.setEnabled(false);
            uno_otto1.setEnabled(false);
            uno_nove1.setEnabled(false);
            due_cinque1.setEnabled(false);
            due_sei1.setEnabled(false);
            due_sette1.setEnabled(false);
            due_otto1.setEnabled(false);
            due_nove1.setEnabled(false);
            tre_cinque1.setEnabled(false);
            tre_sei1.setEnabled(false);
            tre_sette1.setEnabled(false);
            tre_otto1.setEnabled(false);
            tre_nove1.setEnabled(false);
            quattro_cinque1.setEnabled(false);
            quattro_sei1.setEnabled(false);
            quattro_sette1.setEnabled(false);
            quattro_otto1.setEnabled(false);
            quattro_nove1.setEnabled(false);
            cinque_zero1.setEnabled(false);
            cinque_uno1.setEnabled(false);
            cinque_due1.setEnabled(false);
            cinque_tre1.setEnabled(false);
            cinque_quattro1.setEnabled(false);
            cinque_cinque1.setEnabled(false);
            cinque_sei1.setEnabled(false);
            cinque_sette1.setEnabled(false);
            cinque_otto1.setEnabled(false);
            cinque_nove1.setEnabled(false);
            sei_zero1.setEnabled(false);
            sei_uno1.setEnabled(false);
            sei_due1.setEnabled(false);
            sei_tre1.setEnabled(false);
            sei_quattro1.setEnabled(false);
            sei_cinque1.setEnabled(false);
            sei_sei1.setEnabled(false);
            sei_sette1.setEnabled(false);
            sei_otto1.setEnabled(false);
            sei_nove1.setEnabled(false);
            sette_zero1.setEnabled(false);
            sette_uno1.setEnabled(false);
            sette_due1.setEnabled(false);
            sette_tre1.setEnabled(false);
            sette_quattro1.setEnabled(false);
            sette_cinque1.setEnabled(false);
            sette_sei1.setEnabled(false);
            sette_sette1.setEnabled(false);
            sette_otto1.setEnabled(false);
            sette_nove1.setEnabled(false);
            otto_zero1.setEnabled(false);
            otto_uno1.setEnabled(false);
            otto_due1.setEnabled(false);
            otto_tre1.setEnabled(false);
            otto_quattro1.setEnabled(false);
            otto_cinque1.setEnabled(false);
            otto_sei1.setEnabled(false);
            otto_sette1.setEnabled(false);
            otto_otto1.setEnabled(false);
            otto_nove1.setEnabled(false);
            nove_zero1.setEnabled(false);
            nove_uno1.setEnabled(false);
            nove_due1.setEnabled(false);
            nove_tre1.setEnabled(false);
            nove_quattro1.setEnabled(false);
            nove_cinque1.setEnabled(false);
            nove_sei1.setEnabled(false);
            nove_sette1.setEnabled(false);
            nove_otto1.setEnabled(false);
            nove_nove1.setEnabled(false);

            zero_zero1.setVisible(false);
            zero_uno1.setVisible(false);
            zero_due1.setVisible(false);
            zero_tre1.setVisible(false);
            zero_quattro1.setVisible(false);
            uno_zero1.setVisible(false);
            uno_uno1.setVisible(false);
            uno_due1.setVisible(false);
            uno_tre1.setVisible(false);
            uno_quattro1.setVisible(false);
            due_zero1.setVisible(false);
            due_uno1.setVisible(false);
            due_due1.setVisible(false);
            due_tre1.setVisible(false);
            due_quattro1.setVisible(false);
            tre_zero1.setVisible(false);
            tre_uno1.setVisible(false);
            tre_due1.setVisible(false);
            tre_tre1.setVisible(false);
            tre_quattro1.setVisible(false);
            quattro_zero1.setVisible(false);
            quattro_uno1.setVisible(false);
            quattro_due1.setVisible(false);
            quattro_tre1.setVisible(false);
            quattro_quattro1.setVisible(false);

            zero_cinque1.setVisible(false);
            zero_sei1.setVisible(false);
            zero_sette1.setVisible(false);
            zero_otto1.setVisible(false);
            zero_nove1.setVisible(false);
            uno_cinque1.setVisible(false);
            uno_sei1.setVisible(false);
            uno_sette1.setVisible(false);
            uno_otto1.setVisible(false);
            uno_nove1.setVisible(false);
            due_cinque1.setVisible(false);
            due_sei1.setVisible(false);
            due_sette1.setVisible(false);
            due_otto1.setVisible(false);
            due_nove1.setVisible(false);
            tre_cinque1.setVisible(false);
            tre_sei1.setVisible(false);
            tre_sette1.setVisible(false);
            tre_otto1.setVisible(false);
            tre_nove1.setVisible(false);
            quattro_cinque1.setVisible(false);
            quattro_sei1.setVisible(false);
            quattro_sette1.setVisible(false);
            quattro_otto1.setVisible(false);
            quattro_nove1.setVisible(false);
            cinque_zero1.setVisible(false);
            cinque_uno1.setVisible(false);
            cinque_due1.setVisible(false);
            cinque_tre1.setVisible(false);
            cinque_quattro1.setVisible(false);
            cinque_cinque1.setVisible(false);
            cinque_sei1.setVisible(false);
            cinque_sette1.setVisible(false);
            cinque_otto1.setVisible(false);
            cinque_nove1.setVisible(false);
            sei_zero1.setVisible(false);
            sei_uno1.setVisible(false);
            sei_due1.setVisible(false);
            sei_tre1.setVisible(false);
            sei_quattro1.setVisible(false);
            sei_cinque1.setVisible(false);
            sei_sei1.setVisible(false);
            sei_sette1.setVisible(false);
            sei_otto1.setVisible(false);
            sei_nove1.setVisible(false);
            sette_zero1.setVisible(false);
            sette_uno1.setVisible(false);
            sette_due1.setVisible(false);
            sette_tre1.setVisible(false);
            sette_quattro1.setVisible(false);
            sette_cinque1.setVisible(false);
            sette_sei1.setVisible(false);
            sette_sette1.setVisible(false);
            sette_otto1.setVisible(false);
            sette_nove1.setVisible(false);
            otto_zero1.setVisible(false);
            otto_uno1.setVisible(false);
            otto_due1.setVisible(false);
            otto_tre1.setVisible(false);
            otto_quattro1.setVisible(false);
            otto_cinque1.setVisible(false);
            otto_sei1.setVisible(false);
            otto_sette1.setVisible(false);
            otto_otto1.setVisible(false);
            otto_nove1.setVisible(false);
            nove_zero1.setVisible(false);
            nove_uno1.setVisible(false);
            nove_due1.setVisible(false);
            nove_tre1.setVisible(false);
            nove_quattro1.setVisible(false);
            nove_cinque1.setVisible(false);
            nove_sei1.setVisible(false);
            nove_sette1.setVisible(false);
            nove_otto1.setVisible(false);
            nove_nove1.setVisible(false);
            A1.setVisible(false);
            B1.setVisible(false);
            C1.setVisible(false);
            D1.setVisible(false);
            E1.setVisible(false);
            F1.setVisible(false);
            G1.setVisible(false);
            H1.setVisible(false);
            I1.setVisible(false);
            J1.setVisible(false);
            _1.setVisible(false);
            _2.setVisible(false);
            _3.setVisible(false);
            _4.setVisible(false);
            _5.setVisible(false);
            _6.setVisible(false);
            _7.setVisible(false);
            _8.setVisible(false);
            _9.setVisible(false);
            _10.setVisible(false);
        } else {
            J.setVisible(false);
            F.setVisible(false);
            G.setVisible(false);
            H.setVisible(false);
            I.setVisible(false);
            dieci.setVisible(false);
            nove.setVisible(false);
            otto.setVisible(false);
            sette.setVisible(false);
            sei.setVisible(false);
            zero_cinque.setVisible(false);
            zero_sei.setVisible(false);
            zero_sette.setVisible(false);
            zero_otto.setVisible(false);
            zero_nove.setVisible(false);
            uno_cinque.setVisible(false);
            uno_sei.setVisible(false);
            uno_sette.setVisible(false);
            uno_otto.setVisible(false);
            uno_nove.setVisible(false);
            due_cinque.setVisible(false);
            due_sei.setVisible(false);
            due_sette.setVisible(false);
            due_otto.setVisible(false);
            due_nove.setVisible(false);
            tre_cinque.setVisible(false);
            tre_sei.setVisible(false);
            tre_sette.setVisible(false);
            tre_otto.setVisible(false);
            tre_nove.setVisible(false);
            quattro_cinque.setVisible(false);
            quattro_sei.setVisible(false);
            quattro_sette.setVisible(false);
            quattro_otto.setVisible(false);
            quattro_nove.setVisible(false);
            cinque_zero.setVisible(false);
            cinque_uno.setVisible(false);
            cinque_due.setVisible(false);
            cinque_tre.setVisible(false);
            cinque_quattro.setVisible(false);
            cinque_cinque.setVisible(false);
            cinque_sei.setVisible(false);
            cinque_sette.setVisible(false);
            cinque_otto.setVisible(false);
            cinque_nove.setVisible(false);
            sei_zero.setVisible(false);
            sei_uno.setVisible(false);
            sei_due.setVisible(false);
            sei_tre.setVisible(false);
            sei_quattro.setVisible(false);
            sei_cinque.setVisible(false);
            sei_sei.setVisible(false);
            sei_sette.setVisible(false);
            sei_otto.setVisible(false);
            sei_nove.setVisible(false);
            sette_zero.setVisible(false);
            sette_uno.setVisible(false);
            sette_due.setVisible(false);
            sette_tre.setVisible(false);
            sette_quattro.setVisible(false);
            sette_cinque.setVisible(false);
            sette_sei.setVisible(false);
            sette_sette.setVisible(false);
            sette_otto.setVisible(false);
            sette_nove.setVisible(false);
            otto_zero.setVisible(false);
            otto_uno.setVisible(false);
            otto_due.setVisible(false);
            otto_tre.setVisible(false);
            otto_quattro.setVisible(false);
            otto_cinque.setVisible(false);
            otto_sei.setVisible(false);
            otto_sette.setVisible(false);
            otto_otto.setVisible(false);
            otto_nove.setVisible(false);
            nove_zero.setVisible(false);
            nove_uno.setVisible(false);
            nove_due.setVisible(false);
            nove_tre.setVisible(false);
            nove_quattro.setVisible(false);
            nove_cinque.setVisible(false);
            nove_sei.setVisible(false);
            nove_sette.setVisible(false);
            nove_otto.setVisible(false);
            nove_nove.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        stop = new javax.swing.JButton();
        start = new javax.swing.JButton();
        testomosse = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        F = new javax.swing.JLabel();
        G = new javax.swing.JLabel();
        H = new javax.swing.JLabel();
        I = new javax.swing.JLabel();
        J = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        zero_zero = new javax.swing.JButton();
        zero_uno = new javax.swing.JButton();
        zero_due = new javax.swing.JButton();
        zero_tre = new javax.swing.JButton();
        zero_quattro = new javax.swing.JButton();
        zero_cinque = new javax.swing.JButton();
        zero_sei = new javax.swing.JButton();
        zero_sette = new javax.swing.JButton();
        zero_otto = new javax.swing.JButton();
        zero_nove = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        uno_zero = new javax.swing.JButton();
        uno_uno = new javax.swing.JButton();
        uno_due = new javax.swing.JButton();
        uno_tre = new javax.swing.JButton();
        uno_quattro = new javax.swing.JButton();
        uno_cinque = new javax.swing.JButton();
        uno_sei = new javax.swing.JButton();
        uno_sette = new javax.swing.JButton();
        uno_otto = new javax.swing.JButton();
        uno_nove = new javax.swing.JButton();
        tre = new javax.swing.JLabel();
        due_zero = new javax.swing.JButton();
        due_uno = new javax.swing.JButton();
        due_due = new javax.swing.JButton();
        due_tre = new javax.swing.JButton();
        due_quattro = new javax.swing.JButton();
        due_cinque = new javax.swing.JButton();
        due_sei = new javax.swing.JButton();
        due_sette = new javax.swing.JButton();
        due_otto = new javax.swing.JButton();
        due_nove = new javax.swing.JButton();
        quattro = new javax.swing.JLabel();
        tre_zero = new javax.swing.JButton();
        tre_uno = new javax.swing.JButton();
        tre_due = new javax.swing.JButton();
        tre_tre = new javax.swing.JButton();
        tre_quattro = new javax.swing.JButton();
        tre_cinque = new javax.swing.JButton();
        tre_sei = new javax.swing.JButton();
        tre_sette = new javax.swing.JButton();
        tre_otto = new javax.swing.JButton();
        tre_nove = new javax.swing.JButton();
        cinque = new javax.swing.JLabel();
        quattro_zero = new javax.swing.JButton();
        quattro_uno = new javax.swing.JButton();
        quattro_due = new javax.swing.JButton();
        quattro_tre = new javax.swing.JButton();
        quattro_quattro = new javax.swing.JButton();
        quattro_cinque = new javax.swing.JButton();
        quattro_sei = new javax.swing.JButton();
        quattro_sette = new javax.swing.JButton();
        quattro_otto = new javax.swing.JButton();
        quattro_nove = new javax.swing.JButton();
        sei = new javax.swing.JLabel();
        cinque_zero = new javax.swing.JButton();
        cinque_uno = new javax.swing.JButton();
        cinque_due = new javax.swing.JButton();
        cinque_tre = new javax.swing.JButton();
        cinque_quattro = new javax.swing.JButton();
        cinque_cinque = new javax.swing.JButton();
        cinque_sei = new javax.swing.JButton();
        cinque_sette = new javax.swing.JButton();
        cinque_otto = new javax.swing.JButton();
        cinque_nove = new javax.swing.JButton();
        sette = new javax.swing.JLabel();
        sei_zero = new javax.swing.JButton();
        sei_uno = new javax.swing.JButton();
        sei_due = new javax.swing.JButton();
        sei_tre = new javax.swing.JButton();
        sei_quattro = new javax.swing.JButton();
        sei_cinque = new javax.swing.JButton();
        sei_sei = new javax.swing.JButton();
        sei_sette = new javax.swing.JButton();
        sei_otto = new javax.swing.JButton();
        sei_nove = new javax.swing.JButton();
        otto = new javax.swing.JLabel();
        sette_zero = new javax.swing.JButton();
        sette_uno = new javax.swing.JButton();
        sette_due = new javax.swing.JButton();
        sette_tre = new javax.swing.JButton();
        sette_quattro = new javax.swing.JButton();
        sette_cinque = new javax.swing.JButton();
        sette_sei = new javax.swing.JButton();
        sette_sette = new javax.swing.JButton();
        sette_otto = new javax.swing.JButton();
        sette_nove = new javax.swing.JButton();
        nove = new javax.swing.JLabel();
        otto_zero = new javax.swing.JButton();
        otto_uno = new javax.swing.JButton();
        otto_due = new javax.swing.JButton();
        otto_tre = new javax.swing.JButton();
        otto_quattro = new javax.swing.JButton();
        otto_cinque = new javax.swing.JButton();
        otto_sei = new javax.swing.JButton();
        otto_sette = new javax.swing.JButton();
        otto_otto = new javax.swing.JButton();
        otto_nove = new javax.swing.JButton();
        dieci = new javax.swing.JLabel();
        nove_zero = new javax.swing.JButton();
        nove_uno = new javax.swing.JButton();
        nove_due = new javax.swing.JButton();
        nove_tre = new javax.swing.JButton();
        nove_quattro = new javax.swing.JButton();
        nove_cinque = new javax.swing.JButton();
        nove_sei = new javax.swing.JButton();
        nove_sette = new javax.swing.JButton();
        nove_otto = new javax.swing.JButton();
        nove_nove = new javax.swing.JButton();
        Lmosse = new javax.swing.JLabel();
        punti = new javax.swing.JLabel();
        testoPunti = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        A1 = new javax.swing.JLabel();
        B1 = new javax.swing.JLabel();
        C1 = new javax.swing.JLabel();
        D1 = new javax.swing.JLabel();
        E1 = new javax.swing.JLabel();
        F1 = new javax.swing.JLabel();
        G1 = new javax.swing.JLabel();
        H1 = new javax.swing.JLabel();
        I1 = new javax.swing.JLabel();
        J1 = new javax.swing.JLabel();
        _1 = new javax.swing.JLabel();
        zero_zero1 = new javax.swing.JButton();
        zero_uno1 = new javax.swing.JButton();
        zero_due1 = new javax.swing.JButton();
        zero_tre1 = new javax.swing.JButton();
        zero_quattro1 = new javax.swing.JButton();
        zero_cinque1 = new javax.swing.JButton();
        zero_sei1 = new javax.swing.JButton();
        zero_sette1 = new javax.swing.JButton();
        zero_otto1 = new javax.swing.JButton();
        zero_nove1 = new javax.swing.JButton();
        _2 = new javax.swing.JLabel();
        uno_zero1 = new javax.swing.JButton();
        uno_uno1 = new javax.swing.JButton();
        uno_due1 = new javax.swing.JButton();
        uno_tre1 = new javax.swing.JButton();
        uno_quattro1 = new javax.swing.JButton();
        uno_cinque1 = new javax.swing.JButton();
        uno_sei1 = new javax.swing.JButton();
        uno_sette1 = new javax.swing.JButton();
        uno_otto1 = new javax.swing.JButton();
        uno_nove1 = new javax.swing.JButton();
        _3 = new javax.swing.JLabel();
        due_zero1 = new javax.swing.JButton();
        due_uno1 = new javax.swing.JButton();
        due_due1 = new javax.swing.JButton();
        due_tre1 = new javax.swing.JButton();
        due_quattro1 = new javax.swing.JButton();
        due_cinque1 = new javax.swing.JButton();
        due_sei1 = new javax.swing.JButton();
        due_sette1 = new javax.swing.JButton();
        due_otto1 = new javax.swing.JButton();
        due_nove1 = new javax.swing.JButton();
        _4 = new javax.swing.JLabel();
        tre_zero1 = new javax.swing.JButton();
        tre_uno1 = new javax.swing.JButton();
        tre_due1 = new javax.swing.JButton();
        tre_tre1 = new javax.swing.JButton();
        tre_quattro1 = new javax.swing.JButton();
        tre_cinque1 = new javax.swing.JButton();
        tre_sei1 = new javax.swing.JButton();
        tre_sette1 = new javax.swing.JButton();
        tre_otto1 = new javax.swing.JButton();
        tre_nove1 = new javax.swing.JButton();
        _5 = new javax.swing.JLabel();
        quattro_zero1 = new javax.swing.JButton();
        quattro_uno1 = new javax.swing.JButton();
        quattro_due1 = new javax.swing.JButton();
        quattro_tre1 = new javax.swing.JButton();
        quattro_quattro1 = new javax.swing.JButton();
        quattro_cinque1 = new javax.swing.JButton();
        quattro_sei1 = new javax.swing.JButton();
        quattro_sette1 = new javax.swing.JButton();
        quattro_otto1 = new javax.swing.JButton();
        quattro_nove1 = new javax.swing.JButton();
        _6 = new javax.swing.JLabel();
        cinque_zero1 = new javax.swing.JButton();
        cinque_uno1 = new javax.swing.JButton();
        cinque_due1 = new javax.swing.JButton();
        cinque_tre1 = new javax.swing.JButton();
        cinque_quattro1 = new javax.swing.JButton();
        cinque_cinque1 = new javax.swing.JButton();
        cinque_sei1 = new javax.swing.JButton();
        cinque_sette1 = new javax.swing.JButton();
        cinque_otto1 = new javax.swing.JButton();
        cinque_nove1 = new javax.swing.JButton();
        _7 = new javax.swing.JLabel();
        sei_zero1 = new javax.swing.JButton();
        sei_uno1 = new javax.swing.JButton();
        sei_due1 = new javax.swing.JButton();
        sei_tre1 = new javax.swing.JButton();
        sei_quattro1 = new javax.swing.JButton();
        sei_cinque1 = new javax.swing.JButton();
        sei_sei1 = new javax.swing.JButton();
        sei_sette1 = new javax.swing.JButton();
        sei_otto1 = new javax.swing.JButton();
        sei_nove1 = new javax.swing.JButton();
        _8 = new javax.swing.JLabel();
        sette_zero1 = new javax.swing.JButton();
        sette_uno1 = new javax.swing.JButton();
        sette_due1 = new javax.swing.JButton();
        sette_tre1 = new javax.swing.JButton();
        sette_quattro1 = new javax.swing.JButton();
        sette_cinque1 = new javax.swing.JButton();
        sette_sei1 = new javax.swing.JButton();
        sette_sette1 = new javax.swing.JButton();
        sette_otto1 = new javax.swing.JButton();
        sette_nove1 = new javax.swing.JButton();
        _9 = new javax.swing.JLabel();
        otto_zero1 = new javax.swing.JButton();
        otto_uno1 = new javax.swing.JButton();
        otto_due1 = new javax.swing.JButton();
        otto_tre1 = new javax.swing.JButton();
        otto_quattro1 = new javax.swing.JButton();
        otto_cinque1 = new javax.swing.JButton();
        otto_sei1 = new javax.swing.JButton();
        otto_sette1 = new javax.swing.JButton();
        otto_otto1 = new javax.swing.JButton();
        otto_nove1 = new javax.swing.JButton();
        _10 = new javax.swing.JLabel();
        nove_zero1 = new javax.swing.JButton();
        nove_uno1 = new javax.swing.JButton();
        nove_due1 = new javax.swing.JButton();
        nove_tre1 = new javax.swing.JButton();
        nove_quattro1 = new javax.swing.JButton();
        nove_cinque1 = new javax.swing.JButton();
        nove_sei1 = new javax.swing.JButton();
        nove_sette1 = new javax.swing.JButton();
        nove_otto1 = new javax.swing.JButton();
        nove_nove1 = new javax.swing.JButton();
        insert = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        opzioni = new javax.swing.JMenu();
        limiteMosse = new javax.swing.JCheckBoxMenuItem();
        difficolta = new javax.swing.JMenu();
        facile = new javax.swing.JRadioButtonMenuItem();
        medio = new javax.swing.JRadioButtonMenuItem();
        difficile = new javax.swing.JRadioButtonMenuItem();
        lingua = new javax.swing.JMenu();
        italiano = new javax.swing.JMenuItem();
        English = new javax.swing.JMenuItem();
        solitario = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Una PseudoBattaglia Navale");

        stop.setBackground(new java.awt.Color(2, 123, 253));
        stop.setText("ferma");
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });

        start.setBackground(new java.awt.Color(0, 152, 255));
        start.setForeground(new java.awt.Color(1, 1, 1));
        start.setText("avvia");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        testomosse.setText("0");

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new java.awt.GridLayout(11, 11, -4, -4));

        jLabel8.setText(" ");
        jPanel1.add(jLabel8);

        jLabel1.setText("        A");
        jPanel1.add(jLabel1);

        jLabel2.setText("       B");
        jPanel1.add(jLabel2);

        jLabel3.setText("       C");
        jPanel1.add(jLabel3);

        jLabel4.setText("       D");
        jPanel1.add(jLabel4);

        jLabel5.setText("       E");
        jPanel1.add(jLabel5);

        F.setText("        F");
        jPanel1.add(F);

        G.setText("       G");
        jPanel1.add(G);

        H.setText("      H");
        jPanel1.add(H);

        I.setText("        I");
        jPanel1.add(I);

        J.setText("       J");
        jPanel1.add(J);

        jLabel6.setText("1");
        jPanel1.add(jLabel6);

        zero_zero.setBackground(new java.awt.Color(247, 254, 254));
        zero_zero.setForeground(new java.awt.Color(209, 67, 67));
        zero_zero.setText(" ");
        zero_zero.setBorderPainted(false);
        zero_zero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        zero_zero.setEnabled(false);
        zero_zero.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                zero_zeroMouseMoved(evt);
            }
        });
        zero_zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zero_zeroActionPerformed(evt);
            }
        });
        jPanel1.add(zero_zero);

        zero_uno.setText(" ");
        zero_uno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        zero_uno.setEnabled(false);
        zero_uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zero_unoActionPerformed(evt);
            }
        });
        jPanel1.add(zero_uno);

        zero_due.setText(" ");
        zero_due.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        zero_due.setEnabled(false);
        zero_due.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zero_dueActionPerformed(evt);
            }
        });
        jPanel1.add(zero_due);

        zero_tre.setText(" ");
        zero_tre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        zero_tre.setEnabled(false);
        zero_tre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zero_treActionPerformed(evt);
            }
        });
        jPanel1.add(zero_tre);

        zero_quattro.setText(" ");
        zero_quattro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        zero_quattro.setEnabled(false);
        zero_quattro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zero_quattroActionPerformed(evt);
            }
        });
        jPanel1.add(zero_quattro);

        zero_cinque.setText(" ");
        zero_cinque.setEnabled(false);
        zero_cinque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zero_cinqueActionPerformed(evt);
            }
        });
        jPanel1.add(zero_cinque);

        zero_sei.setText(" ");
        zero_sei.setEnabled(false);
        zero_sei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zero_seiActionPerformed(evt);
            }
        });
        jPanel1.add(zero_sei);

        zero_sette.setText(" ");
        zero_sette.setEnabled(false);
        zero_sette.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zero_setteActionPerformed(evt);
            }
        });
        jPanel1.add(zero_sette);

        zero_otto.setText(" ");
        zero_otto.setEnabled(false);
        zero_otto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zero_ottoActionPerformed(evt);
            }
        });
        jPanel1.add(zero_otto);

        zero_nove.setText(" ");
        zero_nove.setEnabled(false);
        zero_nove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zero_noveActionPerformed(evt);
            }
        });
        jPanel1.add(zero_nove);

        jLabel7.setText("2");
        jPanel1.add(jLabel7);

        uno_zero.setText(" ");
        uno_zero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        uno_zero.setEnabled(false);
        uno_zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uno_zeroActionPerformed(evt);
            }
        });
        jPanel1.add(uno_zero);

        uno_uno.setText(" ");
        uno_uno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        uno_uno.setEnabled(false);
        uno_uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uno_unoActionPerformed(evt);
            }
        });
        jPanel1.add(uno_uno);

        uno_due.setText(" ");
        uno_due.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        uno_due.setEnabled(false);
        uno_due.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uno_dueActionPerformed(evt);
            }
        });
        jPanel1.add(uno_due);

        uno_tre.setText(" ");
        uno_tre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        uno_tre.setEnabled(false);
        uno_tre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uno_treActionPerformed(evt);
            }
        });
        jPanel1.add(uno_tre);

        uno_quattro.setText(" ");
        uno_quattro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        uno_quattro.setEnabled(false);
        uno_quattro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uno_quattroActionPerformed(evt);
            }
        });
        jPanel1.add(uno_quattro);

        uno_cinque.setText(" ");
        uno_cinque.setEnabled(false);
        uno_cinque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uno_cinqueActionPerformed(evt);
            }
        });
        jPanel1.add(uno_cinque);

        uno_sei.setText(" ");
        uno_sei.setEnabled(false);
        uno_sei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uno_seiActionPerformed(evt);
            }
        });
        jPanel1.add(uno_sei);

        uno_sette.setText(" ");
        uno_sette.setEnabled(false);
        uno_sette.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uno_setteActionPerformed(evt);
            }
        });
        jPanel1.add(uno_sette);

        uno_otto.setText(" ");
        uno_otto.setEnabled(false);
        uno_otto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uno_ottoActionPerformed(evt);
            }
        });
        jPanel1.add(uno_otto);

        uno_nove.setText(" ");
        uno_nove.setEnabled(false);
        uno_nove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uno_noveActionPerformed(evt);
            }
        });
        jPanel1.add(uno_nove);

        tre.setText("3");
        jPanel1.add(tre);

        due_zero.setText(" ");
        due_zero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        due_zero.setEnabled(false);
        due_zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                due_zeroActionPerformed(evt);
            }
        });
        jPanel1.add(due_zero);

        due_uno.setText(" ");
        due_uno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        due_uno.setEnabled(false);
        due_uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                due_unoActionPerformed(evt);
            }
        });
        jPanel1.add(due_uno);

        due_due.setText(" ");
        due_due.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        due_due.setEnabled(false);
        due_due.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                due_dueActionPerformed(evt);
            }
        });
        jPanel1.add(due_due);

        due_tre.setText(" ");
        due_tre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        due_tre.setEnabled(false);
        due_tre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                due_treActionPerformed(evt);
            }
        });
        jPanel1.add(due_tre);

        due_quattro.setText(" ");
        due_quattro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        due_quattro.setEnabled(false);
        due_quattro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                due_quattroActionPerformed(evt);
            }
        });
        jPanel1.add(due_quattro);

        due_cinque.setText(" ");
        due_cinque.setEnabled(false);
        due_cinque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                due_cinqueActionPerformed(evt);
            }
        });
        jPanel1.add(due_cinque);

        due_sei.setText(" ");
        due_sei.setEnabled(false);
        due_sei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                due_seiActionPerformed(evt);
            }
        });
        jPanel1.add(due_sei);

        due_sette.setText(" ");
        due_sette.setEnabled(false);
        due_sette.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                due_setteActionPerformed(evt);
            }
        });
        jPanel1.add(due_sette);

        due_otto.setText(" ");
        due_otto.setEnabled(false);
        due_otto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                due_ottoActionPerformed(evt);
            }
        });
        jPanel1.add(due_otto);

        due_nove.setText(" ");
        due_nove.setEnabled(false);
        due_nove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                due_noveActionPerformed(evt);
            }
        });
        jPanel1.add(due_nove);

        quattro.setText("4");
        jPanel1.add(quattro);

        tre_zero.setText(" ");
        tre_zero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tre_zero.setEnabled(false);
        tre_zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tre_zeroActionPerformed(evt);
            }
        });
        jPanel1.add(tre_zero);

        tre_uno.setText(" ");
        tre_uno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tre_uno.setEnabled(false);
        tre_uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tre_unoActionPerformed(evt);
            }
        });
        jPanel1.add(tre_uno);

        tre_due.setText(" ");
        tre_due.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tre_due.setEnabled(false);
        tre_due.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tre_dueActionPerformed(evt);
            }
        });
        jPanel1.add(tre_due);

        tre_tre.setText(" ");
        tre_tre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tre_tre.setEnabled(false);
        tre_tre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tre_treActionPerformed(evt);
            }
        });
        jPanel1.add(tre_tre);

        tre_quattro.setText(" ");
        tre_quattro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tre_quattro.setEnabled(false);
        tre_quattro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tre_quattroActionPerformed(evt);
            }
        });
        jPanel1.add(tre_quattro);

        tre_cinque.setText(" ");
        tre_cinque.setEnabled(false);
        tre_cinque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tre_cinqueActionPerformed(evt);
            }
        });
        jPanel1.add(tre_cinque);

        tre_sei.setText(" ");
        tre_sei.setEnabled(false);
        tre_sei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tre_seiActionPerformed(evt);
            }
        });
        jPanel1.add(tre_sei);

        tre_sette.setText(" ");
        tre_sette.setEnabled(false);
        tre_sette.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tre_setteActionPerformed(evt);
            }
        });
        jPanel1.add(tre_sette);

        tre_otto.setText(" ");
        tre_otto.setEnabled(false);
        tre_otto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tre_ottoActionPerformed(evt);
            }
        });
        jPanel1.add(tre_otto);

        tre_nove.setText(" ");
        tre_nove.setEnabled(false);
        tre_nove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tre_noveActionPerformed(evt);
            }
        });
        jPanel1.add(tre_nove);

        cinque.setText("5");
        jPanel1.add(cinque);

        quattro_zero.setText(" ");
        quattro_zero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quattro_zero.setEnabled(false);
        quattro_zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quattro_zeroActionPerformed(evt);
            }
        });
        jPanel1.add(quattro_zero);

        quattro_uno.setText(" ");
        quattro_uno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quattro_uno.setEnabled(false);
        quattro_uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quattro_unoActionPerformed(evt);
            }
        });
        jPanel1.add(quattro_uno);

        quattro_due.setText(" ");
        quattro_due.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quattro_due.setEnabled(false);
        quattro_due.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quattro_dueActionPerformed(evt);
            }
        });
        jPanel1.add(quattro_due);

        quattro_tre.setText(" ");
        quattro_tre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quattro_tre.setEnabled(false);
        quattro_tre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quattro_treActionPerformed(evt);
            }
        });
        jPanel1.add(quattro_tre);

        quattro_quattro.setText(" ");
        quattro_quattro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quattro_quattro.setEnabled(false);
        quattro_quattro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quattro_quattroActionPerformed(evt);
            }
        });
        jPanel1.add(quattro_quattro);

        quattro_cinque.setText(" ");
        quattro_cinque.setEnabled(false);
        quattro_cinque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quattro_cinqueActionPerformed(evt);
            }
        });
        jPanel1.add(quattro_cinque);

        quattro_sei.setText(" ");
        quattro_sei.setEnabled(false);
        quattro_sei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quattro_seiActionPerformed(evt);
            }
        });
        jPanel1.add(quattro_sei);

        quattro_sette.setText(" ");
        quattro_sette.setEnabled(false);
        quattro_sette.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quattro_setteActionPerformed(evt);
            }
        });
        jPanel1.add(quattro_sette);

        quattro_otto.setText(" ");
        quattro_otto.setEnabled(false);
        quattro_otto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quattro_ottoActionPerformed(evt);
            }
        });
        jPanel1.add(quattro_otto);

        quattro_nove.setText(" ");
        quattro_nove.setEnabled(false);
        quattro_nove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quattro_noveActionPerformed(evt);
            }
        });
        jPanel1.add(quattro_nove);

        sei.setText("6");
        jPanel1.add(sei);

        cinque_zero.setText(" ");
        cinque_zero.setEnabled(false);
        cinque_zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinque_zeroActionPerformed(evt);
            }
        });
        jPanel1.add(cinque_zero);

        cinque_uno.setText(" ");
        cinque_uno.setEnabled(false);
        cinque_uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinque_unoActionPerformed(evt);
            }
        });
        jPanel1.add(cinque_uno);

        cinque_due.setText(" ");
        cinque_due.setEnabled(false);
        cinque_due.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinque_dueActionPerformed(evt);
            }
        });
        jPanel1.add(cinque_due);

        cinque_tre.setText(" ");
        cinque_tre.setEnabled(false);
        cinque_tre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinque_treActionPerformed(evt);
            }
        });
        jPanel1.add(cinque_tre);

        cinque_quattro.setText(" ");
        cinque_quattro.setEnabled(false);
        cinque_quattro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinque_quattroActionPerformed(evt);
            }
        });
        jPanel1.add(cinque_quattro);

        cinque_cinque.setText(" ");
        cinque_cinque.setEnabled(false);
        cinque_cinque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinque_cinqueActionPerformed(evt);
            }
        });
        jPanel1.add(cinque_cinque);

        cinque_sei.setText(" ");
        cinque_sei.setEnabled(false);
        cinque_sei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinque_seiActionPerformed(evt);
            }
        });
        jPanel1.add(cinque_sei);

        cinque_sette.setText(" ");
        cinque_sette.setEnabled(false);
        cinque_sette.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinque_setteActionPerformed(evt);
            }
        });
        jPanel1.add(cinque_sette);

        cinque_otto.setText(" ");
        cinque_otto.setEnabled(false);
        cinque_otto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinque_ottoActionPerformed(evt);
            }
        });
        jPanel1.add(cinque_otto);

        cinque_nove.setText(" ");
        cinque_nove.setEnabled(false);
        cinque_nove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinque_noveActionPerformed(evt);
            }
        });
        jPanel1.add(cinque_nove);

        sette.setText("7");
        jPanel1.add(sette);

        sei_zero.setText(" ");
        sei_zero.setEnabled(false);
        sei_zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sei_zeroActionPerformed(evt);
            }
        });
        jPanel1.add(sei_zero);

        sei_uno.setText(" ");
        sei_uno.setEnabled(false);
        sei_uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sei_unoActionPerformed(evt);
            }
        });
        jPanel1.add(sei_uno);

        sei_due.setText(" ");
        sei_due.setEnabled(false);
        sei_due.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sei_dueActionPerformed(evt);
            }
        });
        jPanel1.add(sei_due);

        sei_tre.setText(" ");
        sei_tre.setEnabled(false);
        sei_tre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sei_treActionPerformed(evt);
            }
        });
        jPanel1.add(sei_tre);

        sei_quattro.setText(" ");
        sei_quattro.setEnabled(false);
        sei_quattro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sei_quattroActionPerformed(evt);
            }
        });
        jPanel1.add(sei_quattro);

        sei_cinque.setText(" ");
        sei_cinque.setEnabled(false);
        sei_cinque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sei_cinqueActionPerformed(evt);
            }
        });
        jPanel1.add(sei_cinque);

        sei_sei.setText(" ");
        sei_sei.setEnabled(false);
        sei_sei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sei_seiActionPerformed(evt);
            }
        });
        jPanel1.add(sei_sei);

        sei_sette.setText(" ");
        sei_sette.setEnabled(false);
        sei_sette.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sei_setteActionPerformed(evt);
            }
        });
        jPanel1.add(sei_sette);

        sei_otto.setText(" ");
        sei_otto.setEnabled(false);
        sei_otto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sei_ottoActionPerformed(evt);
            }
        });
        jPanel1.add(sei_otto);

        sei_nove.setEnabled(false);
        sei_nove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sei_noveActionPerformed(evt);
            }
        });
        jPanel1.add(sei_nove);

        otto.setText("8");
        jPanel1.add(otto);

        sette_zero.setText(" ");
        sette_zero.setEnabled(false);
        sette_zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sette_zeroActionPerformed(evt);
            }
        });
        jPanel1.add(sette_zero);

        sette_uno.setText(" ");
        sette_uno.setEnabled(false);
        sette_uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sette_unoActionPerformed(evt);
            }
        });
        jPanel1.add(sette_uno);

        sette_due.setText(" ");
        sette_due.setEnabled(false);
        sette_due.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sette_dueActionPerformed(evt);
            }
        });
        jPanel1.add(sette_due);

        sette_tre.setText(" ");
        sette_tre.setEnabled(false);
        sette_tre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sette_treActionPerformed(evt);
            }
        });
        jPanel1.add(sette_tre);

        sette_quattro.setText(" ");
        sette_quattro.setEnabled(false);
        sette_quattro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sette_quattroActionPerformed(evt);
            }
        });
        jPanel1.add(sette_quattro);

        sette_cinque.setText(" ");
        sette_cinque.setEnabled(false);
        sette_cinque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sette_cinqueActionPerformed(evt);
            }
        });
        jPanel1.add(sette_cinque);

        sette_sei.setText(" ");
        sette_sei.setEnabled(false);
        sette_sei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sette_seiActionPerformed(evt);
            }
        });
        jPanel1.add(sette_sei);

        sette_sette.setText(" ");
        sette_sette.setEnabled(false);
        sette_sette.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sette_setteActionPerformed(evt);
            }
        });
        jPanel1.add(sette_sette);

        sette_otto.setText(" ");
        sette_otto.setEnabled(false);
        sette_otto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sette_ottoActionPerformed(evt);
            }
        });
        jPanel1.add(sette_otto);

        sette_nove.setText(" ");
        sette_nove.setEnabled(false);
        sette_nove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sette_noveActionPerformed(evt);
            }
        });
        jPanel1.add(sette_nove);

        nove.setText("9");
        jPanel1.add(nove);

        otto_zero.setText(" ");
        otto_zero.setEnabled(false);
        otto_zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otto_zeroActionPerformed(evt);
            }
        });
        jPanel1.add(otto_zero);

        otto_uno.setText(" ");
        otto_uno.setEnabled(false);
        otto_uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otto_unoActionPerformed(evt);
            }
        });
        jPanel1.add(otto_uno);

        otto_due.setText(" ");
        otto_due.setEnabled(false);
        otto_due.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otto_dueActionPerformed(evt);
            }
        });
        jPanel1.add(otto_due);

        otto_tre.setText(" ");
        otto_tre.setEnabled(false);
        otto_tre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otto_treActionPerformed(evt);
            }
        });
        jPanel1.add(otto_tre);

        otto_quattro.setText(" ");
        otto_quattro.setEnabled(false);
        otto_quattro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otto_quattroActionPerformed(evt);
            }
        });
        jPanel1.add(otto_quattro);

        otto_cinque.setText(" ");
        otto_cinque.setEnabled(false);
        otto_cinque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otto_cinqueActionPerformed(evt);
            }
        });
        jPanel1.add(otto_cinque);

        otto_sei.setText(" ");
        otto_sei.setEnabled(false);
        otto_sei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otto_seiActionPerformed(evt);
            }
        });
        jPanel1.add(otto_sei);

        otto_sette.setText(" ");
        otto_sette.setEnabled(false);
        otto_sette.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otto_setteActionPerformed(evt);
            }
        });
        jPanel1.add(otto_sette);

        otto_otto.setText(" ");
        otto_otto.setEnabled(false);
        otto_otto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otto_ottoActionPerformed(evt);
            }
        });
        jPanel1.add(otto_otto);

        otto_nove.setText(" ");
        otto_nove.setEnabled(false);
        otto_nove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otto_noveActionPerformed(evt);
            }
        });
        jPanel1.add(otto_nove);

        dieci.setText("10");
        jPanel1.add(dieci);

        nove_zero.setText(" ");
        nove_zero.setEnabled(false);
        nove_zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nove_zeroActionPerformed(evt);
            }
        });
        jPanel1.add(nove_zero);

        nove_uno.setText(" ");
        nove_uno.setEnabled(false);
        nove_uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nove_unoActionPerformed(evt);
            }
        });
        jPanel1.add(nove_uno);

        nove_due.setText(" ");
        nove_due.setEnabled(false);
        nove_due.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nove_dueActionPerformed(evt);
            }
        });
        jPanel1.add(nove_due);

        nove_tre.setText(" ");
        nove_tre.setEnabled(false);
        nove_tre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nove_treActionPerformed(evt);
            }
        });
        jPanel1.add(nove_tre);

        nove_quattro.setText(" ");
        nove_quattro.setEnabled(false);
        nove_quattro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nove_quattroActionPerformed(evt);
            }
        });
        jPanel1.add(nove_quattro);

        nove_cinque.setText(" ");
        nove_cinque.setEnabled(false);
        nove_cinque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nove_cinqueActionPerformed(evt);
            }
        });
        jPanel1.add(nove_cinque);

        nove_sei.setText(" ");
        nove_sei.setEnabled(false);
        nove_sei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nove_seiActionPerformed(evt);
            }
        });
        jPanel1.add(nove_sei);

        nove_sette.setText(" ");
        nove_sette.setEnabled(false);
        nove_sette.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nove_setteActionPerformed(evt);
            }
        });
        jPanel1.add(nove_sette);

        nove_otto.setText(" ");
        nove_otto.setEnabled(false);
        nove_otto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nove_ottoActionPerformed(evt);
            }
        });
        jPanel1.add(nove_otto);

        nove_nove.setText(" ");
        nove_nove.setEnabled(false);
        nove_nove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nove_noveActionPerformed(evt);
            }
        });
        jPanel1.add(nove_nove);

        Lmosse.setText("mosse:");

        punti.setText("punti:");

        testoPunti.setText("0");

        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new java.awt.GridLayout(11, 11, -4, -4));

        jLabel9.setText(" ");
        jPanel2.add(jLabel9);

        A1.setText("        A");
        jPanel2.add(A1);

        B1.setText("       B");
        jPanel2.add(B1);

        C1.setText("       C");
        jPanel2.add(C1);

        D1.setText("       D");
        jPanel2.add(D1);

        E1.setText("       E");
        jPanel2.add(E1);

        F1.setText("        F");
        jPanel2.add(F1);

        G1.setText("       G");
        jPanel2.add(G1);

        H1.setText("      H");
        jPanel2.add(H1);

        I1.setText("        I");
        jPanel2.add(I1);

        J1.setText("       J");
        jPanel2.add(J1);

        _1.setText("1");
        jPanel2.add(_1);

        zero_zero1.setBackground(new java.awt.Color(247, 254, 254));
        zero_zero1.setForeground(new java.awt.Color(209, 67, 67));
        zero_zero1.setText(" ");
        zero_zero1.setBorderPainted(false);
        zero_zero1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        zero_zero1.setEnabled(false);
        zero_zero1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                zero_zero1MouseMoved(evt);
            }
        });
        zero_zero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zero_zero1ActionPerformed(evt);
            }
        });
        jPanel2.add(zero_zero1);

        zero_uno1.setText(" ");
        zero_uno1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        zero_uno1.setEnabled(false);
        zero_uno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zero_uno1ActionPerformed(evt);
            }
        });
        jPanel2.add(zero_uno1);

        zero_due1.setText(" ");
        zero_due1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        zero_due1.setEnabled(false);
        zero_due1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zero_due1ActionPerformed(evt);
            }
        });
        jPanel2.add(zero_due1);

        zero_tre1.setText(" ");
        zero_tre1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        zero_tre1.setEnabled(false);
        zero_tre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zero_tre1ActionPerformed(evt);
            }
        });
        jPanel2.add(zero_tre1);

        zero_quattro1.setText(" ");
        zero_quattro1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        zero_quattro1.setEnabled(false);
        zero_quattro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zero_quattro1ActionPerformed(evt);
            }
        });
        jPanel2.add(zero_quattro1);

        zero_cinque1.setText(" ");
        zero_cinque1.setEnabled(false);
        zero_cinque1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zero_cinque1ActionPerformed(evt);
            }
        });
        jPanel2.add(zero_cinque1);

        zero_sei1.setText(" ");
        zero_sei1.setEnabled(false);
        jPanel2.add(zero_sei1);

        zero_sette1.setText(" ");
        zero_sette1.setEnabled(false);
        jPanel2.add(zero_sette1);

        zero_otto1.setText(" ");
        zero_otto1.setEnabled(false);
        jPanel2.add(zero_otto1);

        zero_nove1.setText(" ");
        zero_nove1.setEnabled(false);
        zero_nove1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zero_nove1ActionPerformed(evt);
            }
        });
        jPanel2.add(zero_nove1);

        _2.setText("2");
        jPanel2.add(_2);

        uno_zero1.setText(" ");
        uno_zero1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        uno_zero1.setEnabled(false);
        uno_zero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uno_zero1ActionPerformed(evt);
            }
        });
        jPanel2.add(uno_zero1);

        uno_uno1.setText(" ");
        uno_uno1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        uno_uno1.setEnabled(false);
        uno_uno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uno_uno1ActionPerformed(evt);
            }
        });
        jPanel2.add(uno_uno1);

        uno_due1.setText(" ");
        uno_due1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        uno_due1.setEnabled(false);
        uno_due1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uno_due1ActionPerformed(evt);
            }
        });
        jPanel2.add(uno_due1);

        uno_tre1.setText(" ");
        uno_tre1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        uno_tre1.setEnabled(false);
        uno_tre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uno_tre1ActionPerformed(evt);
            }
        });
        jPanel2.add(uno_tre1);

        uno_quattro1.setText(" ");
        uno_quattro1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        uno_quattro1.setEnabled(false);
        uno_quattro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uno_quattro1ActionPerformed(evt);
            }
        });
        jPanel2.add(uno_quattro1);

        uno_cinque1.setText(" ");
        uno_cinque1.setEnabled(false);
        uno_cinque1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uno_cinque1ActionPerformed(evt);
            }
        });
        jPanel2.add(uno_cinque1);

        uno_sei1.setText(" ");
        uno_sei1.setEnabled(false);
        jPanel2.add(uno_sei1);

        uno_sette1.setText(" ");
        uno_sette1.setEnabled(false);
        jPanel2.add(uno_sette1);

        uno_otto1.setText(" ");
        uno_otto1.setEnabled(false);
        jPanel2.add(uno_otto1);

        uno_nove1.setText(" ");
        uno_nove1.setEnabled(false);
        jPanel2.add(uno_nove1);

        _3.setText("3");
        jPanel2.add(_3);

        due_zero1.setText(" ");
        due_zero1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        due_zero1.setEnabled(false);
        due_zero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                due_zero1ActionPerformed(evt);
            }
        });
        jPanel2.add(due_zero1);

        due_uno1.setText(" ");
        due_uno1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        due_uno1.setEnabled(false);
        due_uno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                due_uno1ActionPerformed(evt);
            }
        });
        jPanel2.add(due_uno1);

        due_due1.setText(" ");
        due_due1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        due_due1.setEnabled(false);
        due_due1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                due_due1ActionPerformed(evt);
            }
        });
        jPanel2.add(due_due1);

        due_tre1.setText(" ");
        due_tre1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        due_tre1.setEnabled(false);
        due_tre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                due_tre1ActionPerformed(evt);
            }
        });
        jPanel2.add(due_tre1);

        due_quattro1.setText(" ");
        due_quattro1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        due_quattro1.setEnabled(false);
        due_quattro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                due_quattro1ActionPerformed(evt);
            }
        });
        jPanel2.add(due_quattro1);

        due_cinque1.setText(" ");
        due_cinque1.setEnabled(false);
        due_cinque1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                due_cinque1ActionPerformed(evt);
            }
        });
        jPanel2.add(due_cinque1);

        due_sei1.setText(" ");
        due_sei1.setEnabled(false);
        jPanel2.add(due_sei1);

        due_sette1.setText(" ");
        due_sette1.setEnabled(false);
        jPanel2.add(due_sette1);

        due_otto1.setText(" ");
        due_otto1.setEnabled(false);
        jPanel2.add(due_otto1);

        due_nove1.setText(" ");
        due_nove1.setEnabled(false);
        jPanel2.add(due_nove1);

        _4.setText("4");
        jPanel2.add(_4);

        tre_zero1.setText(" ");
        tre_zero1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tre_zero1.setEnabled(false);
        tre_zero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tre_zero1ActionPerformed(evt);
            }
        });
        jPanel2.add(tre_zero1);

        tre_uno1.setText(" ");
        tre_uno1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tre_uno1.setEnabled(false);
        tre_uno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tre_uno1ActionPerformed(evt);
            }
        });
        jPanel2.add(tre_uno1);

        tre_due1.setText(" ");
        tre_due1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tre_due1.setEnabled(false);
        tre_due1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tre_due1ActionPerformed(evt);
            }
        });
        jPanel2.add(tre_due1);

        tre_tre1.setText(" ");
        tre_tre1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tre_tre1.setEnabled(false);
        tre_tre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tre_tre1ActionPerformed(evt);
            }
        });
        jPanel2.add(tre_tre1);

        tre_quattro1.setText(" ");
        tre_quattro1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tre_quattro1.setEnabled(false);
        tre_quattro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tre_quattro1ActionPerformed(evt);
            }
        });
        jPanel2.add(tre_quattro1);

        tre_cinque1.setText(" ");
        tre_cinque1.setEnabled(false);
        jPanel2.add(tre_cinque1);

        tre_sei1.setText(" ");
        tre_sei1.setEnabled(false);
        jPanel2.add(tre_sei1);

        tre_sette1.setText(" ");
        tre_sette1.setEnabled(false);
        jPanel2.add(tre_sette1);

        tre_otto1.setText(" ");
        tre_otto1.setEnabled(false);
        jPanel2.add(tre_otto1);

        tre_nove1.setText(" ");
        tre_nove1.setEnabled(false);
        jPanel2.add(tre_nove1);

        _5.setText("5");
        jPanel2.add(_5);

        quattro_zero1.setText(" ");
        quattro_zero1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quattro_zero1.setEnabled(false);
        quattro_zero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quattro_zero1ActionPerformed(evt);
            }
        });
        jPanel2.add(quattro_zero1);

        quattro_uno1.setText(" ");
        quattro_uno1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quattro_uno1.setEnabled(false);
        quattro_uno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quattro_uno1ActionPerformed(evt);
            }
        });
        jPanel2.add(quattro_uno1);

        quattro_due1.setText(" ");
        quattro_due1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quattro_due1.setEnabled(false);
        quattro_due1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quattro_due1ActionPerformed(evt);
            }
        });
        jPanel2.add(quattro_due1);

        quattro_tre1.setText(" ");
        quattro_tre1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quattro_tre1.setEnabled(false);
        quattro_tre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quattro_tre1ActionPerformed(evt);
            }
        });
        jPanel2.add(quattro_tre1);

        quattro_quattro1.setText(" ");
        quattro_quattro1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quattro_quattro1.setEnabled(false);
        quattro_quattro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quattro_quattro1ActionPerformed(evt);
            }
        });
        jPanel2.add(quattro_quattro1);

        quattro_cinque1.setText(" ");
        quattro_cinque1.setEnabled(false);
        jPanel2.add(quattro_cinque1);

        quattro_sei1.setText(" ");
        quattro_sei1.setEnabled(false);
        jPanel2.add(quattro_sei1);

        quattro_sette1.setText(" ");
        quattro_sette1.setEnabled(false);
        jPanel2.add(quattro_sette1);

        quattro_otto1.setText(" ");
        quattro_otto1.setEnabled(false);
        jPanel2.add(quattro_otto1);

        quattro_nove1.setText(" ");
        quattro_nove1.setEnabled(false);
        jPanel2.add(quattro_nove1);

        _6.setText("6");
        jPanel2.add(_6);

        cinque_zero1.setText(" ");
        cinque_zero1.setEnabled(false);
        jPanel2.add(cinque_zero1);

        cinque_uno1.setText(" ");
        cinque_uno1.setEnabled(false);
        jPanel2.add(cinque_uno1);

        cinque_due1.setText(" ");
        cinque_due1.setEnabled(false);
        jPanel2.add(cinque_due1);

        cinque_tre1.setText(" ");
        cinque_tre1.setEnabled(false);
        jPanel2.add(cinque_tre1);

        cinque_quattro1.setText(" ");
        cinque_quattro1.setEnabled(false);
        jPanel2.add(cinque_quattro1);

        cinque_cinque1.setText(" ");
        cinque_cinque1.setEnabled(false);
        jPanel2.add(cinque_cinque1);

        cinque_sei1.setText(" ");
        cinque_sei1.setEnabled(false);
        jPanel2.add(cinque_sei1);

        cinque_sette1.setText(" ");
        cinque_sette1.setEnabled(false);
        jPanel2.add(cinque_sette1);

        cinque_otto1.setText(" ");
        cinque_otto1.setEnabled(false);
        jPanel2.add(cinque_otto1);

        cinque_nove1.setText(" ");
        cinque_nove1.setEnabled(false);
        jPanel2.add(cinque_nove1);

        _7.setText("7");
        jPanel2.add(_7);

        sei_zero1.setText(" ");
        sei_zero1.setEnabled(false);
        jPanel2.add(sei_zero1);

        sei_uno1.setText(" ");
        sei_uno1.setEnabled(false);
        jPanel2.add(sei_uno1);

        sei_due1.setText(" ");
        sei_due1.setEnabled(false);
        jPanel2.add(sei_due1);

        sei_tre1.setText(" ");
        sei_tre1.setEnabled(false);
        jPanel2.add(sei_tre1);

        sei_quattro1.setText(" ");
        sei_quattro1.setEnabled(false);
        jPanel2.add(sei_quattro1);

        sei_cinque1.setText(" ");
        sei_cinque1.setEnabled(false);
        jPanel2.add(sei_cinque1);

        sei_sei1.setText(" ");
        sei_sei1.setEnabled(false);
        jPanel2.add(sei_sei1);

        sei_sette1.setText(" ");
        sei_sette1.setEnabled(false);
        jPanel2.add(sei_sette1);

        sei_otto1.setText(" ");
        sei_otto1.setEnabled(false);
        jPanel2.add(sei_otto1);

        sei_nove1.setEnabled(false);
        jPanel2.add(sei_nove1);

        _8.setText("8");
        jPanel2.add(_8);

        sette_zero1.setText(" ");
        sette_zero1.setEnabled(false);
        jPanel2.add(sette_zero1);

        sette_uno1.setText(" ");
        sette_uno1.setEnabled(false);
        jPanel2.add(sette_uno1);

        sette_due1.setText(" ");
        sette_due1.setEnabled(false);
        jPanel2.add(sette_due1);

        sette_tre1.setText(" ");
        sette_tre1.setEnabled(false);
        jPanel2.add(sette_tre1);

        sette_quattro1.setText(" ");
        sette_quattro1.setEnabled(false);
        jPanel2.add(sette_quattro1);

        sette_cinque1.setText(" ");
        sette_cinque1.setEnabled(false);
        jPanel2.add(sette_cinque1);

        sette_sei1.setText(" ");
        sette_sei1.setEnabled(false);
        jPanel2.add(sette_sei1);

        sette_sette1.setText(" ");
        sette_sette1.setEnabled(false);
        jPanel2.add(sette_sette1);

        sette_otto1.setText(" ");
        sette_otto1.setEnabled(false);
        jPanel2.add(sette_otto1);

        sette_nove1.setText(" ");
        sette_nove1.setEnabled(false);
        jPanel2.add(sette_nove1);

        _9.setText("9");
        jPanel2.add(_9);

        otto_zero1.setText(" ");
        otto_zero1.setEnabled(false);
        jPanel2.add(otto_zero1);

        otto_uno1.setText(" ");
        otto_uno1.setEnabled(false);
        jPanel2.add(otto_uno1);

        otto_due1.setText(" ");
        otto_due1.setEnabled(false);
        jPanel2.add(otto_due1);

        otto_tre1.setText(" ");
        otto_tre1.setEnabled(false);
        jPanel2.add(otto_tre1);

        otto_quattro1.setText(" ");
        otto_quattro1.setEnabled(false);
        jPanel2.add(otto_quattro1);

        otto_cinque1.setText(" ");
        otto_cinque1.setEnabled(false);
        jPanel2.add(otto_cinque1);

        otto_sei1.setText(" ");
        otto_sei1.setEnabled(false);
        jPanel2.add(otto_sei1);

        otto_sette1.setText(" ");
        otto_sette1.setEnabled(false);
        jPanel2.add(otto_sette1);

        otto_otto1.setText(" ");
        otto_otto1.setEnabled(false);
        jPanel2.add(otto_otto1);

        otto_nove1.setText(" ");
        otto_nove1.setEnabled(false);
        jPanel2.add(otto_nove1);

        _10.setText("10");
        jPanel2.add(_10);

        nove_zero1.setText(" ");
        nove_zero1.setEnabled(false);
        jPanel2.add(nove_zero1);

        nove_uno1.setText(" ");
        nove_uno1.setEnabled(false);
        jPanel2.add(nove_uno1);

        nove_due1.setText(" ");
        nove_due1.setEnabled(false);
        jPanel2.add(nove_due1);

        nove_tre1.setText(" ");
        nove_tre1.setEnabled(false);
        jPanel2.add(nove_tre1);

        nove_quattro1.setText(" ");
        nove_quattro1.setEnabled(false);
        jPanel2.add(nove_quattro1);

        nove_cinque1.setText(" ");
        nove_cinque1.setEnabled(false);
        jPanel2.add(nove_cinque1);

        nove_sei1.setText(" ");
        nove_sei1.setEnabled(false);
        jPanel2.add(nove_sei1);

        nove_sette1.setText(" ");
        nove_sette1.setEnabled(false);
        jPanel2.add(nove_sette1);

        nove_otto1.setText(" ");
        nove_otto1.setEnabled(false);
        jPanel2.add(nove_otto1);

        nove_nove1.setText(" ");
        nove_nove1.setEnabled(false);
        nove_nove1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nove_nove1ActionPerformed(evt);
            }
        });
        jPanel2.add(nove_nove1);

        insert.setText("inserisci navi");
        insert.setEnabled(false);
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        opzioni.setText("opzioni");

        limiteMosse.setText("limite mosse");
        limiteMosse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limiteMosseActionPerformed(evt);
            }
        });
        opzioni.add(limiteMosse);

        difficolta.setText("difficoltà");

        facile.setSelected(true);
        facile.setText("bassa");
        facile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facileActionPerformed(evt);
            }
        });
        difficolta.add(facile);

        medio.setText("media");
        medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medioActionPerformed(evt);
            }
        });
        difficolta.add(medio);

        difficile.setText("alta");
        difficile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difficileActionPerformed(evt);
            }
        });
        difficolta.add(difficile);

        opzioni.add(difficolta);

        lingua.setText("lingua");

        italiano.setText("italiano");
        italiano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                italianoActionPerformed(evt);
            }
        });
        lingua.add(italiano);

        English.setText("English");
        English.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnglishActionPerformed(evt);
            }
        });
        lingua.add(English);

        opzioni.add(lingua);

        solitario.setSelected(true);
        solitario.setText("solitario");
        solitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solitarioActionPerformed(evt);
            }
        });
        opzioni.add(solitario);

        jMenuBar1.add(opzioni);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stop, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Lmosse, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(testomosse, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(punti)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(testoPunti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(148, 148, 148))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(insert)
                                .addGap(36, 36, 36)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(72, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(stop, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                .addComponent(Lmosse, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(testomosse)
                                .addComponent(punti)
                                .addComponent(testoPunti))
                            .addComponent(start, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(insert)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uno_unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uno_unoActionPerformed
        // TODO add your handling code here:
        if (acqua[1][1] == 0) {
            uno_uno.setBackground(Color.cyan);
        } else if (acqua[1][1] == 1) {
            uno_uno.setBackground(Color.black);
//            fineGioco++;
        }
        Comportamento(uno_uno);
        /*if(fineGioco==5)
         {
         for (int j = 0; j < 5 ; j++)// riempimento matrice 
         {
         for(int j2 = 0; j2 < 5; j2++ )
         {
         acqua [j][j2] = 2;
         }
         }
         }
         else
         {
         boolean clik= click.contains("uno_uno");
         if(clik==false)
         {
         mosse++;
         testomosse.setText(Integer.toString(mosse));
         click.add("uno_uno");
         if(uno_uno.getBackground()==(Color .black))
         {
         punteggio+=5000;
         testoPunti.setText(Integer.toString(punteggio));
         }
         else
         {
         punteggio-=1250;
         testoPunti.setText(Integer.toString((punteggio)));
         }
         }
         }*/




    }//GEN-LAST:event_uno_unoActionPerformed

    private void uno_dueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uno_dueActionPerformed
        // TODO add your handling code here:
        if (acqua[1][2] == 0) {
            uno_due.setBackground(Color.cyan);
        } else if (acqua[1][2] == 1) {
//            fineGioco++;
            uno_due.setBackground(Color.black);
        }
        Comportamento(uno_due);
        /*if(fineGioco==5)
         {
         for (int j = 0; j < 5 ; j++)// riempimento matrice 
         {
         for(int j2 = 0; j2 < 5; j2++ )
         {
         acqua [j][j2] = 2;
         }
         }
         }
         else
         {
         boolean clik= click.contains("uno_due");
         if(clik==false)
         {
         mosse++;
         testomosse.setText(Integer.toString(mosse));
         click.add("uno_due");
         if(uno_due.getBackground()==(Color .black))
         {
         punteggio+=5000;
         testoPunti.setText(Integer.toString(punteggio));
         }
         else
         {
         punteggio-=1250;
         testoPunti.setText(Integer.toString((punteggio)));
         }
         }
         }*/

    }//GEN-LAST:event_uno_dueActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        // TODO add your handling code here:
        run = 1;

        if (run == 1) {
            if (linguaggio == 1) {
                start.setText("riavvia");
            } else if (linguaggio == 2) {
                start.setText("restart");
            }
        }
        //reset
        click.clear();
        punteggio = 0;
        testoPunti.setText("0");
        fineGioco = 0;
        if (limiteMosse.isSelected() == true) {
            mosse = 10;
            testomosse.setText("10");
        } else {
            mosse = 0;
            testomosse.setText("0");
        }
        zero_zero.setEnabled(true);
        zero_uno.setEnabled(true);
        zero_due.setEnabled(true);
        zero_tre.setEnabled(true);
        zero_quattro.setEnabled(true);
        uno_zero.setEnabled(true);
        uno_uno.setEnabled(true);
        uno_due.setEnabled(true);
        uno_tre.setEnabled(true);
        uno_quattro.setEnabled(true);
        due_zero.setEnabled(true);
        due_uno.setEnabled(true);
        due_due.setEnabled(true);
        due_tre.setEnabled(true);
        due_quattro.setEnabled(true);
        tre_zero.setEnabled(true);
        tre_uno.setEnabled(true);
        tre_due.setEnabled(true);
        tre_tre.setEnabled(true);
        tre_quattro.setEnabled(true);
        quattro_zero.setEnabled(true);
        quattro_uno.setEnabled(true);
        quattro_due.setEnabled(true);
        quattro_tre.setEnabled(true);
        quattro_quattro.setEnabled(true);

        zero_zero.setBackground(Color.white);
        zero_uno.setBackground(Color.white);
        zero_due.setBackground(Color.white);
        zero_tre.setBackground(Color.white);
        zero_quattro.setBackground(Color.white);
        uno_zero.setBackground(Color.white);
        uno_uno.setBackground(Color.white);
        uno_due.setBackground(Color.white);
        uno_tre.setBackground(Color.white);
        uno_quattro.setBackground(Color.white);
        due_zero.setBackground(Color.white);
        due_uno.setBackground(Color.white);
        due_due.setBackground(Color.white);
        due_tre.setBackground(Color.white);
        due_quattro.setBackground(Color.white);
        tre_zero.setBackground(Color.white);
        tre_uno.setBackground(Color.white);
        tre_due.setBackground(Color.white);
        tre_tre.setBackground(Color.white);
        tre_quattro.setBackground(Color.white);
        quattro_zero.setBackground(Color.white);
        quattro_uno.setBackground(Color.white);
        quattro_due.setBackground(Color.white);
        quattro_tre.setBackground(Color.white);
        quattro_quattro.setBackground(Color.white);

        if (medio.isSelected() == true) {
            if (solitario.isSelected() == false) {
                sette_zero1.setEnabled(true);
                sette_uno1.setEnabled(true);
                sette_due1.setEnabled(true);
                sette_tre1.setEnabled(true);
                sette_quattro1.setEnabled(true);
                sette_cinque1.setEnabled(true);
                sette_sei1.setEnabled(true);
                sette_sette1.setEnabled(true);
                zero_cinque1.setEnabled(true);
                zero_sei1.setEnabled(true);
                zero_sette1.setEnabled(true);
                uno_cinque1.setEnabled(true);
                uno_sei1.setEnabled(true);
                uno_sette1.setEnabled(true);
                due_cinque1.setEnabled(true);
                due_sei1.setEnabled(true);
                due_sette1.setEnabled(true);
                tre_cinque1.setEnabled(true);
                tre_sei1.setEnabled(true);
                tre_sette1.setEnabled(true);
                quattro_cinque1.setEnabled(true);
                quattro_sei1.setEnabled(true);
                quattro_sette1.setEnabled(true);
                cinque_zero1.setEnabled(true);
                cinque_uno1.setEnabled(true);
                cinque_due1.setEnabled(true);
                cinque_tre1.setEnabled(true);
                cinque_quattro1.setEnabled(true);
                cinque_cinque1.setEnabled(true);
                cinque_sei1.setEnabled(true);
                cinque_sette1.setEnabled(true);
                sei_zero1.setEnabled(true);
                sei_uno1.setEnabled(true);
                sei_due1.setEnabled(true);
                sei_tre1.setEnabled(true);
                sei_quattro1.setEnabled(true);
                sei_cinque1.setEnabled(true);
                sei_sei1.setEnabled(true);
                sei_sette1.setEnabled(true);

                zero_zero1.setEnabled(false);
                zero_uno1.setEnabled(false);
                zero_due1.setEnabled(false);
                zero_tre1.setEnabled(false);
                zero_quattro1.setEnabled(false);
                uno_zero1.setEnabled(false);
                uno_uno1.setEnabled(false);
                uno_due1.setEnabled(false);
                uno_tre1.setEnabled(false);
                uno_quattro1.setEnabled(false);
                due_zero1.setEnabled(false);
                due_uno1.setEnabled(false);
                due_due1.setEnabled(false);
                due_tre1.setEnabled(false);
                due_quattro1.setEnabled(false);
                tre_zero1.setEnabled(false);
                tre_uno1.setEnabled(false);
                tre_due1.setEnabled(false);
                tre_tre1.setEnabled(false);
                tre_quattro1.setEnabled(false);
                quattro_zero1.setEnabled(false);
                quattro_uno1.setEnabled(false);
                quattro_due1.setEnabled(false);
                quattro_tre1.setEnabled(false);
                quattro_quattro1.setEnabled(false);

                zero_zero1.setVisible(true);
                zero_uno1.setVisible(true);
                zero_due1.setVisible(true);
                zero_tre1.setVisible(true);
                zero_quattro1.setVisible(true);
                zero_cinque1.setVisible(true);
                zero_sei1.setVisible(true);
                zero_sette1.setVisible(true);
                uno_zero1.setVisible(true);
                uno_uno1.setVisible(true);
                uno_due1.setVisible(true);
                uno_tre1.setVisible(true);
                uno_quattro1.setVisible(true);
                uno_cinque1.setVisible(true);
                uno_sei1.setVisible(true);
                uno_sette1.setVisible(true);
                due_zero1.setVisible(true);
                due_uno1.setVisible(true);
                due_due1.setVisible(true);
                due_tre1.setVisible(true);
                due_quattro1.setVisible(true);
                due_cinque1.setVisible(true);
                due_sei1.setVisible(true);
                due_sette1.setVisible(true);
                tre_zero1.setVisible(true);
                tre_uno1.setVisible(true);
                tre_due1.setVisible(true);
                tre_tre1.setVisible(true);
                tre_quattro1.setVisible(true);
                tre_cinque1.setVisible(true);
                tre_sei1.setVisible(true);
                tre_sette1.setVisible(true);
                quattro_zero1.setVisible(true);
                quattro_uno1.setVisible(true);
                quattro_due1.setVisible(true);
                quattro_tre1.setVisible(true);
                quattro_quattro1.setVisible(true);
                quattro_cinque1.setVisible(true);
                quattro_sei1.setVisible(true);
                quattro_sette1.setVisible(true);
                cinque_zero1.setVisible(true);
                cinque_uno1.setVisible(true);
                cinque_due1.setVisible(true);
                cinque_tre1.setVisible(true);
                cinque_quattro1.setVisible(true);
                cinque_cinque1.setVisible(true);
                cinque_sei1.setVisible(true);
                cinque_sette1.setVisible(true);
                sei_zero1.setVisible(true);
                sei_uno1.setVisible(true);
                sei_due1.setVisible(true);
                sei_tre1.setVisible(true);
                sei_quattro1.setVisible(true);
                sei_cinque1.setVisible(true);
                sei_sei1.setVisible(true);
                sei_sette1.setVisible(true);
                sette_zero1.setVisible(true);
                sette_uno1.setVisible(true);
                sette_due1.setVisible(true);
                sette_tre1.setVisible(true);
                sette_quattro1.setVisible(true);
                sette_cinque1.setVisible(true);
                sette_sei1.setVisible(true);
                sette_sette1.setVisible(true);
                A1.setVisible(true);
                B1.setVisible(true);
                C1.setVisible(true);
                D1.setVisible(true);
                E1.setVisible(true);
                F1.setVisible(true);
                G1.setVisible(true);
                H1.setVisible(true);
                _1.setVisible(true);
                _2.setVisible(true);
                _3.setVisible(true);
                _4.setVisible(true);
                _5.setVisible(true);
                _6.setVisible(true);
                _7.setVisible(true);
                _8.setVisible(true);


                zero_otto1.setVisible(false);
                zero_nove1.setVisible(false);

                uno_otto1.setVisible(false);
                uno_nove1.setVisible(false);

                due_otto1.setVisible(false);
                due_nove1.setVisible(false);

                tre_otto1.setVisible(false);
                tre_nove1.setVisible(false);

                quattro_otto1.setVisible(false);
                quattro_nove1.setVisible(false);

                cinque_otto1.setVisible(false);
                cinque_nove1.setVisible(false);

                sei_otto1.setVisible(false);
                sei_nove1.setVisible(false);

                sette_otto1.setVisible(false);
                sette_nove1.setVisible(false);
                otto_zero1.setVisible(false);
                otto_uno1.setVisible(false);
                otto_due1.setVisible(false);
                otto_tre1.setVisible(false);
                otto_quattro1.setVisible(false);
                otto_cinque1.setVisible(false);
                otto_sei1.setVisible(false);
                otto_sette1.setVisible(false);
                otto_otto1.setVisible(false);
                otto_nove1.setVisible(false);
                nove_zero1.setVisible(false);
                nove_uno1.setVisible(false);
                nove_due1.setVisible(false);
                nove_tre1.setVisible(false);
                nove_quattro1.setVisible(false);
                nove_cinque1.setVisible(false);
                nove_sei1.setVisible(false);
                nove_sette1.setVisible(false);
                nove_otto1.setVisible(false);
                nove_nove1.setVisible(false);

                I1.setVisible(false);
                J1.setVisible(false);

                _9.setVisible(false);
                _10.setVisible(false);


                zero_zero1.setBackground(Color.white);
                zero_uno1.setBackground(Color.white);
                zero_due1.setBackground(Color.white);
                zero_tre1.setBackground(Color.white);
                zero_quattro1.setBackground(Color.white);
                zero_cinque1.setBackground(Color.white);
                zero_sei1.setBackground(Color.white);
                zero_sette1.setBackground(Color.white);
                uno_zero1.setBackground(Color.white);
                uno_uno1.setBackground(Color.white);
                uno_due1.setBackground(Color.white);
                uno_tre1.setBackground(Color.white);
                uno_quattro1.setBackground(Color.white);
                uno_cinque1.setBackground(Color.white);
                uno_sei1.setBackground(Color.white);
                uno_sette1.setBackground(Color.white);
                due_zero1.setBackground(Color.white);
                due_uno1.setBackground(Color.white);
                due_due1.setBackground(Color.white);
                due_tre1.setBackground(Color.white);
                due_quattro1.setBackground(Color.white);
                due_cinque1.setBackground(Color.white);
                due_sei1.setBackground(Color.white);
                due_sette1.setBackground(Color.white);
                tre_zero1.setBackground(Color.white);
                tre_uno1.setBackground(Color.white);
                tre_due1.setBackground(Color.white);
                tre_tre1.setBackground(Color.white);
                tre_quattro1.setBackground(Color.white);
                tre_cinque1.setBackground(Color.white);
                tre_sei1.setBackground(Color.white);
                tre_sette1.setBackground(Color.white);
                quattro_zero1.setBackground(Color.white);
                quattro_uno1.setBackground(Color.white);
                quattro_due1.setBackground(Color.white);
                quattro_tre1.setBackground(Color.white);
                quattro_quattro1.setBackground(Color.white);
                quattro_cinque1.setBackground(Color.white);
                quattro_sei1.setBackground(Color.white);
                quattro_sette1.setBackground(Color.white);
                cinque_zero1.setBackground(Color.white);
                cinque_uno1.setBackground(Color.white);
                cinque_due1.setBackground(Color.white);
                cinque_tre1.setBackground(Color.white);
                cinque_quattro1.setBackground(Color.white);
                cinque_cinque1.setBackground(Color.white);
                cinque_sei1.setBackground(Color.white);
                cinque_sette1.setBackground(Color.white);
                sei_zero1.setBackground(Color.white);
                sei_uno1.setBackground(Color.white);
                sei_due1.setBackground(Color.white);
                sei_tre1.setBackground(Color.white);
                sei_quattro1.setBackground(Color.white);
                sei_cinque1.setBackground(Color.white);
                sei_sei1.setBackground(Color.white);
                sei_sette1.setBackground(Color.white);
                sette_zero1.setBackground(Color.white);
                sette_uno1.setBackground(Color.white);
                sette_due1.setBackground(Color.white);
                sette_tre1.setBackground(Color.white);
                sette_quattro1.setBackground(Color.white);
                sette_cinque1.setBackground(Color.white);
                sette_sei1.setBackground(Color.white);
                sette_sette1.setBackground(Color.white);
            }
            sette_zero.setEnabled(true);
            sette_uno.setEnabled(true);
            sette_due.setEnabled(true);
            sette_tre.setEnabled(true);
            sette_quattro.setEnabled(true);
            sette_cinque.setEnabled(true);
            sette_sei.setEnabled(true);
            sette_sette.setEnabled(true);
            zero_cinque.setEnabled(true);
            zero_sei.setEnabled(true);
            zero_sette.setEnabled(true);
            uno_cinque.setEnabled(true);
            uno_sei.setEnabled(true);
            uno_sette.setEnabled(true);
            due_cinque.setEnabled(true);
            due_sei.setEnabled(true);
            due_sette.setEnabled(true);
            tre_cinque.setEnabled(true);
            tre_sei.setEnabled(true);
            tre_sette.setEnabled(true);
            quattro_cinque.setEnabled(true);
            quattro_sei.setEnabled(true);
            quattro_sette.setEnabled(true);
            cinque_zero.setEnabled(true);
            cinque_uno.setEnabled(true);
            cinque_due.setEnabled(true);
            cinque_tre.setEnabled(true);
            cinque_quattro.setEnabled(true);
            cinque_cinque.setEnabled(true);
            cinque_sei.setEnabled(true);
            cinque_sette.setEnabled(true);
            sei_zero.setEnabled(true);
            sei_uno.setEnabled(true);
            sei_due.setEnabled(true);
            sei_tre.setEnabled(true);
            sei_quattro.setEnabled(true);
            sei_cinque.setEnabled(true);
            sei_sei.setEnabled(true);
            sei_sette.setEnabled(true);

            zero_zero.setBackground(Color.white);
            zero_uno.setBackground(Color.white);
            zero_due.setBackground(Color.white);
            zero_tre.setBackground(Color.white);
            zero_quattro.setBackground(Color.white);
            zero_cinque.setBackground(Color.white);
            zero_sei.setBackground(Color.white);
            zero_sette.setBackground(Color.white);
            uno_zero.setBackground(Color.white);
            uno_uno.setBackground(Color.white);
            uno_due.setBackground(Color.white);
            uno_tre.setBackground(Color.white);
            uno_quattro.setBackground(Color.white);
            uno_cinque.setBackground(Color.white);
            uno_sei.setBackground(Color.white);
            uno_sette.setBackground(Color.white);
            due_zero.setBackground(Color.white);
            due_uno.setBackground(Color.white);
            due_due.setBackground(Color.white);
            due_tre.setBackground(Color.white);
            due_quattro.setBackground(Color.white);
            due_cinque.setBackground(Color.white);
            due_sei.setBackground(Color.white);
            due_sette.setBackground(Color.white);
            tre_zero.setBackground(Color.white);
            tre_uno.setBackground(Color.white);
            tre_due.setBackground(Color.white);
            tre_tre.setBackground(Color.white);
            tre_quattro.setBackground(Color.white);
            tre_cinque.setBackground(Color.white);
            tre_sei.setBackground(Color.white);
            tre_sette.setBackground(Color.white);
            quattro_zero.setBackground(Color.white);
            quattro_uno.setBackground(Color.white);
            quattro_due.setBackground(Color.white);
            quattro_tre.setBackground(Color.white);
            quattro_quattro.setBackground(Color.white);
            quattro_cinque.setBackground(Color.white);
            quattro_sei.setBackground(Color.white);
            quattro_sette.setBackground(Color.white);
            cinque_zero.setBackground(Color.white);
            cinque_uno.setBackground(Color.white);
            cinque_due.setBackground(Color.white);
            cinque_tre.setBackground(Color.white);
            cinque_quattro.setBackground(Color.white);
            cinque_cinque.setBackground(Color.white);
            cinque_sei.setBackground(Color.white);
            cinque_sette.setBackground(Color.white);
            sei_zero.setBackground(Color.white);
            sei_uno.setBackground(Color.white);
            sei_due.setBackground(Color.white);
            sei_tre.setBackground(Color.white);
            sei_quattro.setBackground(Color.white);
            sei_cinque.setBackground(Color.white);
            sei_sei.setBackground(Color.white);
            sei_sette.setBackground(Color.white);
            sette_zero.setBackground(Color.white);
            sette_uno.setBackground(Color.white);
            sette_due.setBackground(Color.white);
            sette_tre.setBackground(Color.white);
            sette_quattro.setBackground(Color.white);
            sette_cinque.setBackground(Color.white);
            sette_sei.setBackground(Color.white);
            sette_sette.setBackground(Color.white);
        }
        if (difficile.isSelected() == true) {
            sette_zero.setEnabled(true);
            sette_uno.setEnabled(true);
            sette_due.setEnabled(true);
            sette_tre.setEnabled(true);
            sette_quattro.setEnabled(true);
            sette_cinque.setEnabled(true);
            sette_sei.setEnabled(true);
            sette_sette.setEnabled(true);
            sette_otto.setEnabled(true);
            sette_nove.setEnabled(true);
            zero_cinque.setEnabled(true);
            zero_sei.setEnabled(true);
            zero_sette.setEnabled(true);
            zero_otto.setEnabled(true);
            zero_nove.setEnabled(true);
            uno_cinque.setEnabled(true);
            uno_sei.setEnabled(true);
            uno_sette.setEnabled(true);
            uno_otto.setEnabled(true);
            uno_nove.setEnabled(true);
            due_cinque.setEnabled(true);
            due_sei.setEnabled(true);
            due_sette.setEnabled(true);
            due_otto.setEnabled(true);
            due_nove.setEnabled(true);
            tre_cinque.setEnabled(true);
            tre_sei.setEnabled(true);
            tre_sette.setEnabled(true);
            tre_otto.setEnabled(true);
            tre_nove.setEnabled(true);
            quattro_cinque.setEnabled(true);
            quattro_sei.setEnabled(true);
            quattro_sette.setEnabled(true);
            quattro_otto.setEnabled(true);
            quattro_nove.setEnabled(true);
            cinque_zero.setEnabled(true);
            cinque_uno.setEnabled(true);
            cinque_due.setEnabled(true);
            cinque_tre.setEnabled(true);
            cinque_quattro.setEnabled(true);
            cinque_cinque.setEnabled(true);
            cinque_sei.setEnabled(true);
            cinque_sette.setEnabled(true);
            cinque_otto.setEnabled(true);
            cinque_nove.setEnabled(true);
            sei_zero.setEnabled(true);
            sei_uno.setEnabled(true);
            sei_due.setEnabled(true);
            sei_tre.setEnabled(true);
            sei_quattro.setEnabled(true);
            sei_cinque.setEnabled(true);
            sei_sei.setEnabled(true);
            sei_sette.setEnabled(true);
            sei_otto.setEnabled(true);
            sei_nove.setEnabled(true);
            otto_zero.setEnabled(true);
            otto_uno.setEnabled(true);
            otto_due.setEnabled(true);
            otto_tre.setEnabled(true);
            otto_quattro.setEnabled(true);
            otto_cinque.setEnabled(true);
            otto_sei.setEnabled(true);
            otto_sette.setEnabled(true);
            otto_otto.setEnabled(true);
            otto_nove.setEnabled(true);
            nove_zero.setEnabled(true);
            nove_uno.setEnabled(true);
            nove_due.setEnabled(true);
            nove_tre.setEnabled(true);
            nove_quattro.setEnabled(true);
            nove_cinque.setEnabled(true);
            nove_sei.setEnabled(true);
            nove_sette.setEnabled(true);
            nove_otto.setEnabled(true);
            nove_nove.setEnabled(true);

            zero_zero.setBackground(Color.white);
            zero_uno.setBackground(Color.white);
            zero_due.setBackground(Color.white);
            zero_tre.setBackground(Color.white);
            zero_quattro.setBackground(Color.white);
            zero_cinque.setBackground(Color.white);
            zero_sei.setBackground(Color.white);
            zero_sette.setBackground(Color.white);
            zero_otto.setBackground(Color.white);
            zero_nove.setBackground(Color.white);
            uno_zero.setBackground(Color.white);
            uno_uno.setBackground(Color.white);
            uno_due.setBackground(Color.white);
            uno_tre.setBackground(Color.white);
            uno_quattro.setBackground(Color.white);
            uno_cinque.setBackground(Color.white);
            uno_sei.setBackground(Color.white);
            uno_sette.setBackground(Color.white);
            uno_otto.setBackground(Color.white);
            uno_nove.setBackground(Color.white);
            due_zero.setBackground(Color.white);
            due_uno.setBackground(Color.white);
            due_due.setBackground(Color.white);
            due_tre.setBackground(Color.white);
            due_quattro.setBackground(Color.white);
            due_cinque.setBackground(Color.white);
            due_sei.setBackground(Color.white);
            due_sette.setBackground(Color.white);
            due_otto.setBackground(Color.white);
            due_nove.setBackground(Color.white);
            tre_zero.setBackground(Color.white);
            tre_uno.setBackground(Color.white);
            tre_due.setBackground(Color.white);
            tre_tre.setBackground(Color.white);
            tre_quattro.setBackground(Color.white);
            tre_cinque.setBackground(Color.white);
            tre_sei.setBackground(Color.white);
            tre_sette.setBackground(Color.white);
            tre_otto.setBackground(Color.white);
            tre_nove.setBackground(Color.white);
            quattro_zero.setBackground(Color.white);
            quattro_uno.setBackground(Color.white);
            quattro_due.setBackground(Color.white);
            quattro_tre.setBackground(Color.white);
            quattro_quattro.setBackground(Color.white);
            quattro_cinque.setBackground(Color.white);
            quattro_sei.setBackground(Color.white);
            quattro_sette.setBackground(Color.white);
            quattro_otto.setBackground(Color.white);
            quattro_nove.setBackground(Color.white);
            sette_zero.setBackground(Color.white);
            sette_uno.setBackground(Color.white);
            sette_due.setBackground(Color.white);
            sette_tre.setBackground(Color.white);
            sette_quattro.setBackground(Color.white);
            sette_cinque.setBackground(Color.white);
            sette_sei.setBackground(Color.white);
            sette_sette.setBackground(Color.white);
            sette_otto.setBackground(Color.white);
            sette_nove.setBackground(Color.white);
            cinque_zero.setBackground(Color.white);
            cinque_uno.setBackground(Color.white);
            cinque_due.setBackground(Color.white);
            cinque_tre.setBackground(Color.white);
            cinque_quattro.setBackground(Color.white);
            cinque_cinque.setBackground(Color.white);
            cinque_sei.setBackground(Color.white);
            cinque_sette.setBackground(Color.white);
            cinque_otto.setBackground(Color.white);
            cinque_nove.setBackground(Color.white);
            sei_zero.setBackground(Color.white);
            sei_uno.setBackground(Color.white);
            sei_due.setBackground(Color.white);
            sei_tre.setBackground(Color.white);
            sei_quattro.setBackground(Color.white);
            sei_cinque.setBackground(Color.white);
            sei_sei.setBackground(Color.white);
            sei_sette.setBackground(Color.white);
            sei_otto.setBackground(Color.white);
            sei_nove.setBackground(Color.white);
            otto_zero.setBackground(Color.white);
            otto_uno.setBackground(Color.white);
            otto_due.setBackground(Color.white);
            otto_tre.setBackground(Color.white);
            otto_quattro.setBackground(Color.white);
            otto_cinque.setBackground(Color.white);
            otto_sei.setBackground(Color.white);
            otto_sette.setBackground(Color.white);
            otto_otto.setBackground(Color.white);
            otto_nove.setBackground(Color.white);
            nove_zero.setBackground(Color.white);
            nove_uno.setBackground(Color.white);
            nove_due.setBackground(Color.white);
            nove_tre.setBackground(Color.white);
            nove_quattro.setBackground(Color.white);
            nove_cinque.setBackground(Color.white);
            nove_sei.setBackground(Color.white);
            nove_sette.setBackground(Color.white);
            nove_otto.setBackground(Color.white);
            nove_nove.setBackground(Color.white);
        }

        zero_zero1.setEnabled(true);
        zero_uno1.setEnabled(true);
        zero_due1.setEnabled(true);
        zero_tre1.setEnabled(true);
        zero_quattro1.setEnabled(true);
        uno_zero1.setEnabled(true);
        uno_uno1.setEnabled(true);
        uno_due1.setEnabled(true);
        uno_tre1.setEnabled(true);
        uno_quattro1.setEnabled(true);
        due_zero1.setEnabled(true);
        due_uno1.setEnabled(true);
        due_due1.setEnabled(true);
        due_tre1.setEnabled(true);
        due_quattro1.setEnabled(true);
        tre_zero1.setEnabled(true);
        tre_uno1.setEnabled(true);
        tre_due1.setEnabled(true);
        tre_tre1.setEnabled(true);
        tre_quattro1.setEnabled(true);
        quattro_zero1.setEnabled(true);
        quattro_uno1.setEnabled(true);
        quattro_due1.setEnabled(true);
        quattro_tre1.setEnabled(true);
        quattro_quattro1.setEnabled(true);

        zero_zero1.setBackground(Color.white);
        zero_uno1.setBackground(Color.white);
        zero_due1.setBackground(Color.white);
        zero_tre1.setBackground(Color.white);
        zero_quattro1.setBackground(Color.white);
        uno_zero1.setBackground(Color.white);
        uno_uno1.setBackground(Color.white);
        uno_due1.setBackground(Color.white);
        uno_tre1.setBackground(Color.white);
        uno_quattro1.setBackground(Color.white);
        due_zero1.setBackground(Color.white);
        due_uno1.setBackground(Color.white);
        due_due1.setBackground(Color.white);
        due_tre1.setBackground(Color.white);
        due_quattro1.setBackground(Color.white);
        tre_zero1.setBackground(Color.white);
        tre_uno1.setBackground(Color.white);
        tre_due1.setBackground(Color.white);
        tre_tre1.setBackground(Color.white);
        tre_quattro1.setBackground(Color.white);
        quattro_zero1.setBackground(Color.white);
        quattro_uno1.setBackground(Color.white);
        quattro_due1.setBackground(Color.white);
        quattro_tre1.setBackground(Color.white);
        quattro_quattro1.setBackground(Color.white);


        if (difficile.isSelected() == true) {
            sette_zero1.setEnabled(true);
            sette_uno1.setEnabled(true);
            sette_due1.setEnabled(true);
            sette_tre1.setEnabled(true);
            sette_quattro1.setEnabled(true);
            sette_cinque1.setEnabled(true);
            sette_sei1.setEnabled(true);
            sette_sette1.setEnabled(true);
            sette_otto1.setEnabled(true);
            sette_nove1.setEnabled(true);
            zero_cinque1.setEnabled(true);
            zero_sei1.setEnabled(true);
            zero_sette1.setEnabled(true);
            zero_otto1.setEnabled(true);
            zero_nove1.setEnabled(true);
            uno_cinque1.setEnabled(true);
            uno_sei1.setEnabled(true);
            uno_sette1.setEnabled(true);
            uno_otto1.setEnabled(true);
            uno_nove1.setEnabled(true);
            due_cinque1.setEnabled(true);
            due_sei1.setEnabled(true);
            due_sette1.setEnabled(true);
            due_otto1.setEnabled(true);
            due_nove1.setEnabled(true);
            tre_cinque1.setEnabled(true);
            tre_sei1.setEnabled(true);
            tre_sette1.setEnabled(true);
            tre_otto1.setEnabled(true);
            tre_nove1.setEnabled(true);
            quattro_cinque1.setEnabled(true);
            quattro_sei1.setEnabled(true);
            quattro_sette1.setEnabled(true);
            quattro_otto1.setEnabled(true);
            quattro_nove1.setEnabled(true);
            cinque_zero1.setEnabled(true);
            cinque_uno1.setEnabled(true);
            cinque_due1.setEnabled(true);
            cinque_tre1.setEnabled(true);
            cinque_quattro1.setEnabled(true);
            cinque_cinque1.setEnabled(true);
            cinque_sei1.setEnabled(true);
            cinque_sette1.setEnabled(true);
            cinque_otto1.setEnabled(true);
            cinque_nove1.setEnabled(true);
            sei_zero1.setEnabled(true);
            sei_uno1.setEnabled(true);
            sei_due1.setEnabled(true);
            sei_tre1.setEnabled(true);
            sei_quattro1.setEnabled(true);
            sei_cinque1.setEnabled(true);
            sei_sei1.setEnabled(true);
            sei_sette1.setEnabled(true);
            sei_otto1.setEnabled(true);
            sei_nove1.setEnabled(true);
            otto_zero1.setEnabled(true);
            otto_uno1.setEnabled(true);
            otto_due1.setEnabled(true);
            otto_tre1.setEnabled(true);
            otto_quattro1.setEnabled(true);
            otto_cinque1.setEnabled(true);
            otto_sei1.setEnabled(true);
            otto_sette1.setEnabled(true);
            otto_otto1.setEnabled(true);
            otto_nove1.setEnabled(true);
            nove_zero1.setEnabled(true);
            nove_uno1.setEnabled(true);
            nove_due1.setEnabled(true);
            nove_tre1.setEnabled(true);
            nove_quattro1.setEnabled(true);
            nove_cinque1.setEnabled(true);
            nove_sei1.setEnabled(true);
            nove_sette1.setEnabled(true);
            nove_otto1.setEnabled(true);
            nove_nove1.setEnabled(true);

            zero_zero1.setBackground(Color.white);
            zero_uno1.setBackground(Color.white);
            zero_due1.setBackground(Color.white);
            zero_tre1.setBackground(Color.white);
            zero_quattro1.setBackground(Color.white);
            zero_cinque1.setBackground(Color.white);
            zero_sei1.setBackground(Color.white);
            zero_sette1.setBackground(Color.white);
            zero_otto1.setBackground(Color.white);
            zero_nove1.setBackground(Color.white);
            uno_zero1.setBackground(Color.white);
            uno_uno1.setBackground(Color.white);
            uno_due1.setBackground(Color.white);
            uno_tre1.setBackground(Color.white);
            uno_quattro1.setBackground(Color.white);
            uno_cinque1.setBackground(Color.white);
            uno_sei1.setBackground(Color.white);
            uno_sette1.setBackground(Color.white);
            uno_otto1.setBackground(Color.white);
            uno_nove1.setBackground(Color.white);
            due_zero1.setBackground(Color.white);
            due_uno1.setBackground(Color.white);
            due_due1.setBackground(Color.white);
            due_tre1.setBackground(Color.white);
            due_quattro1.setBackground(Color.white);
            due_cinque1.setBackground(Color.white);
            due_sei1.setBackground(Color.white);
            due_sette1.setBackground(Color.white);
            due_otto1.setBackground(Color.white);
            due_nove1.setBackground(Color.white);
            tre_zero1.setBackground(Color.white);
            tre_uno1.setBackground(Color.white);
            tre_due1.setBackground(Color.white);
            tre_tre1.setBackground(Color.white);
            tre_quattro1.setBackground(Color.white);
            tre_cinque1.setBackground(Color.white);
            tre_sei1.setBackground(Color.white);
            tre_sette1.setBackground(Color.white);
            tre_otto1.setBackground(Color.white);
            tre_nove1.setBackground(Color.white);
            quattro_zero1.setBackground(Color.white);
            quattro_uno1.setBackground(Color.white);
            quattro_due1.setBackground(Color.white);
            quattro_tre1.setBackground(Color.white);
            quattro_quattro1.setBackground(Color.white);
            quattro_cinque1.setBackground(Color.white);
            quattro_sei1.setBackground(Color.white);
            quattro_sette1.setBackground(Color.white);
            quattro_otto1.setBackground(Color.white);
            quattro_nove1.setBackground(Color.white);
            sette_zero1.setBackground(Color.white);
            sette_uno1.setBackground(Color.white);
            sette_due1.setBackground(Color.white);
            sette_tre1.setBackground(Color.white);
            sette_quattro1.setBackground(Color.white);
            sette_cinque1.setBackground(Color.white);
            sette_sei1.setBackground(Color.white);
            sette_sette1.setBackground(Color.white);
            sette_otto1.setBackground(Color.white);
            sette_nove1.setBackground(Color.white);
            cinque_zero1.setBackground(Color.white);
            cinque_uno1.setBackground(Color.white);
            cinque_due1.setBackground(Color.white);
            cinque_tre1.setBackground(Color.white);
            cinque_quattro1.setBackground(Color.white);
            cinque_cinque1.setBackground(Color.white);
            cinque_sei1.setBackground(Color.white);
            cinque_sette1.setBackground(Color.white);
            cinque_otto1.setBackground(Color.white);
            cinque_nove1.setBackground(Color.white);
            sei_zero1.setBackground(Color.white);
            sei_uno1.setBackground(Color.white);
            sei_due1.setBackground(Color.white);
            sei_tre1.setBackground(Color.white);
            sei_quattro1.setBackground(Color.white);
            sei_cinque1.setBackground(Color.white);
            sei_sei1.setBackground(Color.white);
            sei_sette1.setBackground(Color.white);
            sei_otto1.setBackground(Color.white);
            sei_nove1.setBackground(Color.white);
            otto_zero1.setBackground(Color.white);
            otto_uno1.setBackground(Color.white);
            otto_due1.setBackground(Color.white);
            otto_tre1.setBackground(Color.white);
            otto_quattro1.setBackground(Color.white);
            otto_cinque1.setBackground(Color.white);
            otto_sei1.setBackground(Color.white);
            otto_sette1.setBackground(Color.white);
            otto_otto1.setBackground(Color.white);
            otto_nove1.setBackground(Color.white);
            nove_zero1.setBackground(Color.white);
            nove_uno1.setBackground(Color.white);
            nove_due1.setBackground(Color.white);
            nove_tre1.setBackground(Color.white);
            nove_quattro1.setBackground(Color.white);
            nove_cinque1.setBackground(Color.white);
            nove_sei1.setBackground(Color.white);
            nove_sette1.setBackground(Color.white);
            nove_otto1.setBackground(Color.white);
            nove_nove1.setBackground(Color.white);
        }
        numeroNavi = (acqua.length * acqua.length) / 7;
        int contaNavi = 0;
        Random casuale = new Random();
        for (int j = 0; j < lMat; j++)// riempimento matrice 
        {
            for (int j2 = 0; j2 < lMat; j2++) {
                acqua[j][j2] = 0;
            }
        }

        while (numeroNavi != contaNavi) {
            int riga = casuale.nextInt(acqua.length - 1);
            int colonna = casuale.nextInt(acqua.length - 1);
            if (acqua[riga][colonna] == 0) {
                if (contaNavi == 0) {
                    acqua[riga][colonna] = 1;
                    contaNavi++;
                } else {
                    int dove = casuale.nextInt(4);
                    if (dove == 0 && riga != 0) {
                        if (acqua[riga - 1][colonna] == 0) {
                            acqua[riga][colonna] = 1;
                            acqua[riga - 1][colonna] = 1;
                            contaNavi++;
                        }
                    } else if (dove == 1 && riga != acqua.length) {
                        if (acqua[riga + 1][colonna] == 0) {
                            acqua[riga][colonna] = 1;
                            acqua[riga + 1][colonna] = 1;
                            contaNavi++;
                        }

                    } else if (dove == 2 && colonna != 0) {
                        if (acqua[riga][colonna - 1] == 0) {
                            acqua[riga][colonna] = 1;
                            acqua[riga][colonna - 1] = 1;
                            contaNavi++;
                        }
                    } else if (dove == 3 && colonna != acqua.length) {
                        if (acqua[riga][colonna + 1] == 0) {
                            acqua[riga][colonna] = 1;
                            acqua[riga][colonna + 1] = 1;
                            contaNavi++;
                        }
                    }

                }

            }

        }

    }//GEN-LAST:event_startActionPerformed

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        // TODO add your handling code here:
        run = 0;
        if (linguaggio == 1) {
            start.setText("avvia");
        } else if (linguaggio == 2) {
            start.setText("start");
        }

        zero_zero1.setEnabled(false);
        zero_uno1.setEnabled(false);
        zero_due1.setEnabled(false);
        zero_tre1.setEnabled(false);
        zero_quattro1.setEnabled(false);
        uno_zero1.setEnabled(false);
        uno_uno1.setEnabled(false);
        uno_due1.setEnabled(false);
        uno_tre1.setEnabled(false);
        uno_quattro1.setEnabled(false);
        due_zero1.setEnabled(false);
        due_uno1.setEnabled(false);
        due_due1.setEnabled(false);
        due_tre1.setEnabled(false);
        due_quattro1.setEnabled(false);
        tre_zero1.setEnabled(false);
        tre_uno1.setEnabled(false);
        tre_due1.setEnabled(false);
        tre_tre1.setEnabled(false);
        tre_quattro1.setEnabled(false);
        quattro_zero1.setEnabled(false);
        quattro_uno1.setEnabled(false);
        quattro_due1.setEnabled(false);
        quattro_tre1.setEnabled(false);
        quattro_quattro1.setEnabled(false);

        zero_cinque1.setEnabled(false);
        zero_sei1.setEnabled(false);
        zero_sette1.setEnabled(false);
        zero_otto1.setEnabled(false);
        zero_nove1.setEnabled(false);
        uno_cinque1.setEnabled(false);
        uno_sei1.setEnabled(false);
        uno_sette1.setEnabled(false);
        uno_otto1.setEnabled(false);
        uno_nove1.setEnabled(false);
        due_cinque1.setEnabled(false);
        due_sei1.setEnabled(false);
        due_sette1.setEnabled(false);
        due_otto1.setEnabled(false);
        due_nove1.setEnabled(false);
        tre_cinque1.setEnabled(false);
        tre_sei1.setEnabled(false);
        tre_sette1.setEnabled(false);
        tre_otto1.setEnabled(false);
        tre_nove1.setEnabled(false);
        quattro_cinque1.setEnabled(false);
        quattro_sei1.setEnabled(false);
        quattro_sette1.setEnabled(false);
        quattro_otto1.setEnabled(false);
        quattro_nove1.setEnabled(false);
        cinque_zero1.setEnabled(false);
        cinque_uno1.setEnabled(false);
        cinque_due1.setEnabled(false);
        cinque_tre1.setEnabled(false);
        cinque_quattro1.setEnabled(false);
        cinque_cinque1.setEnabled(false);
        cinque_sei1.setEnabled(false);
        cinque_sette1.setEnabled(false);
        cinque_otto1.setEnabled(false);
        cinque_nove1.setEnabled(false);
        sei_zero1.setEnabled(false);
        sei_uno1.setEnabled(false);
        sei_due1.setEnabled(false);
        sei_tre1.setEnabled(false);
        sei_quattro1.setEnabled(false);
        sei_cinque1.setEnabled(false);
        sei_sei1.setEnabled(false);
        sei_sette1.setEnabled(false);
        sei_otto1.setEnabled(false);
        sei_nove1.setEnabled(false);
        sette_zero1.setEnabled(false);
        sette_uno1.setEnabled(false);
        sette_due1.setEnabled(false);
        sette_tre1.setEnabled(false);
        sette_quattro1.setEnabled(false);
        sette_cinque1.setEnabled(false);
        sette_sei1.setEnabled(false);
        sette_sette1.setEnabled(false);
        sette_otto1.setEnabled(false);
        sette_nove1.setEnabled(false);
        otto_zero1.setEnabled(false);
        otto_uno1.setEnabled(false);
        otto_due1.setEnabled(false);
        otto_tre1.setEnabled(false);
        otto_quattro1.setEnabled(false);
        otto_cinque1.setEnabled(false);
        otto_sei1.setEnabled(false);
        otto_sette1.setEnabled(false);
        otto_otto1.setEnabled(false);
        otto_nove1.setEnabled(false);
        nove_zero1.setEnabled(false);
        nove_uno1.setEnabled(false);
        nove_due1.setEnabled(false);
        nove_tre1.setEnabled(false);
        nove_quattro1.setEnabled(false);
        nove_cinque1.setEnabled(false);
        nove_sei1.setEnabled(false);
        nove_sette1.setEnabled(false);
        nove_otto1.setEnabled(false);
        nove_nove1.setEnabled(false);

        zero_zero.setEnabled(false);
        zero_uno.setEnabled(false);
        zero_due.setEnabled(false);
        zero_tre.setEnabled(false);
        zero_quattro.setEnabled(false);
        uno_zero.setEnabled(false);
        uno_uno.setEnabled(false);
        uno_due.setEnabled(false);
        uno_tre.setEnabled(false);
        uno_quattro.setEnabled(false);
        due_zero.setEnabled(false);
        due_uno.setEnabled(false);
        due_due.setEnabled(false);
        due_tre.setEnabled(false);
        due_quattro.setEnabled(false);
        tre_zero.setEnabled(false);
        tre_uno.setEnabled(false);
        tre_due.setEnabled(false);
        tre_tre.setEnabled(false);
        tre_quattro.setEnabled(false);
        quattro_zero.setEnabled(false);
        quattro_uno.setEnabled(false);
        quattro_due.setEnabled(false);
        quattro_tre.setEnabled(false);
        quattro_quattro.setEnabled(false);

        zero_cinque.setEnabled(false);
        zero_sei.setEnabled(false);
        zero_sette.setEnabled(false);
        zero_otto.setEnabled(false);
        zero_nove.setEnabled(false);
        uno_cinque.setEnabled(false);
        uno_sei.setEnabled(false);
        uno_sette.setEnabled(false);
        uno_otto.setEnabled(false);
        uno_nove.setEnabled(false);
        due_cinque.setEnabled(false);
        due_sei.setEnabled(false);
        due_sette.setEnabled(false);
        due_otto.setEnabled(false);
        due_nove.setEnabled(false);
        tre_cinque.setEnabled(false);
        tre_sei.setEnabled(false);
        tre_sette.setEnabled(false);
        tre_otto.setEnabled(false);
        tre_nove.setEnabled(false);
        quattro_cinque.setEnabled(false);
        quattro_sei.setEnabled(false);
        quattro_sette.setEnabled(false);
        quattro_otto.setEnabled(false);
        quattro_nove.setEnabled(false);
        cinque_zero.setEnabled(false);
        cinque_uno.setEnabled(false);
        cinque_due.setEnabled(false);
        cinque_tre.setEnabled(false);
        cinque_quattro.setEnabled(false);
        cinque_cinque.setEnabled(false);
        cinque_sei.setEnabled(false);
        cinque_sette.setEnabled(false);
        cinque_otto.setEnabled(false);
        cinque_nove.setEnabled(false);
        sei_zero.setEnabled(false);
        sei_uno.setEnabled(false);
        sei_due.setEnabled(false);
        sei_tre.setEnabled(false);
        sei_quattro.setEnabled(false);
        sei_cinque.setEnabled(false);
        sei_sei.setEnabled(false);
        sei_sette.setEnabled(false);
        sei_otto.setEnabled(false);
        sei_nove.setEnabled(false);
        sette_zero.setEnabled(false);
        sette_uno.setEnabled(false);
        sette_due.setEnabled(false);
        sette_tre.setEnabled(false);
        sette_quattro.setEnabled(false);
        sette_cinque.setEnabled(false);
        sette_sei.setEnabled(false);
        sette_sette.setEnabled(false);
        sette_otto.setEnabled(false);
        sette_nove.setEnabled(false);
        otto_zero.setEnabled(false);
        otto_uno.setEnabled(false);
        otto_due.setEnabled(false);
        otto_tre.setEnabled(false);
        otto_quattro.setEnabled(false);
        otto_cinque.setEnabled(false);
        otto_sei.setEnabled(false);
        otto_sette.setEnabled(false);
        otto_otto.setEnabled(false);
        otto_nove.setEnabled(false);
        nove_zero.setEnabled(false);
        nove_uno.setEnabled(false);
        nove_due.setEnabled(false);
        nove_tre.setEnabled(false);
        nove_quattro.setEnabled(false);
        nove_cinque.setEnabled(false);
        nove_sei.setEnabled(false);
        nove_sette.setEnabled(false);
        nove_otto.setEnabled(false);
        nove_nove.setEnabled(false);
    }//GEN-LAST:event_stopActionPerformed

    private void zero_zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zero_zeroActionPerformed
        // TODO add your handling code here:
        if (acqua[0][0] == 0) {
            zero_zero.setBackground(Color.cyan);
        } else if (acqua[0][0] == 1) {
            zero_zero.setBackground(Color.black);
            //fineGioco++;
        }
        Comportamento(zero_zero);
    }//GEN-LAST:event_zero_zeroActionPerformed

    private void zero_unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zero_unoActionPerformed
        // TODO add your handling code here:
        if (acqua[0][1] == 0) {
            zero_uno.setBackground(Color.cyan);
        } else if (acqua[0][1] == 1) {
            //fineGioco++;
            zero_uno.setBackground(Color.black);
        }
        Comportamento(zero_uno);
    }//GEN-LAST:event_zero_unoActionPerformed

    private void zero_dueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zero_dueActionPerformed
        // TODO add your handling code here:
        if (acqua[0][2] == 0) {
            zero_due.setBackground(Color.cyan);
        } else if (acqua[0][2] == 1) {
            zero_due.setBackground(Color.black);
//            fineGioco++;
        }
        Comportamento(zero_due);
    }//GEN-LAST:event_zero_dueActionPerformed

    private void zero_treActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zero_treActionPerformed
        // TODO add your handling code here:
        if (acqua[0][3] == 0) {
            zero_tre.setBackground(Color.cyan);
        } else if (acqua[0][3] == 1) {
            zero_tre.setBackground(Color.black);
//            fineGioco++;
        }
        Comportamento(zero_tre);

    }//GEN-LAST:event_zero_treActionPerformed

    private void zero_quattroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zero_quattroActionPerformed
        // TODO add your handling code here:
        if (acqua[0][4] == 0) {
            zero_quattro.setBackground(Color.cyan);
        } else if (acqua[0][4] == 1) {
            zero_quattro.setBackground(Color.black);
//            fineGioco++;
        }
        Comportamento(zero_quattro);

    }//GEN-LAST:event_zero_quattroActionPerformed

    private void uno_zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uno_zeroActionPerformed
        // TODO add your handling code here:
        if (acqua[1][0] == 0) {
            uno_zero.setBackground(Color.cyan);
        } else if (acqua[1][0] == 1) {
            uno_zero.setBackground(Color.black);
//            fineGioco++;
        }
        Comportamento(uno_zero);
    }//GEN-LAST:event_uno_zeroActionPerformed

    private void uno_treActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uno_treActionPerformed
        // TODO add your handling code here:
        if (acqua[1][3] == 0) {
            uno_tre.setBackground(Color.cyan);
        } else if (acqua[1][3] == 1) {
            uno_tre.setBackground(Color.black);
//            fineGioco++;
        }
        Comportamento(uno_tre);

    }//GEN-LAST:event_uno_treActionPerformed

    private void uno_quattroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uno_quattroActionPerformed
        // TODO add your handling code here:
        if (acqua[1][4] == 0) {
            uno_quattro.setBackground(Color.cyan);
        } else if (acqua[1][4] == 1) {
//            fineGioco++;
            uno_quattro.setBackground(Color.black);
        }
        Comportamento(uno_quattro);

    }//GEN-LAST:event_uno_quattroActionPerformed

    private void due_zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_due_zeroActionPerformed
        // TODO add your handling code here:
        if (acqua[2][0] == 0) {
            due_zero.setBackground(Color.cyan);
        } else if (acqua[2][0] == 1) {
//            fineGioco++;
            due_zero.setBackground(Color.black);
        }
        Comportamento(due_zero);

    }//GEN-LAST:event_due_zeroActionPerformed

    private void due_unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_due_unoActionPerformed
        // TODO add your handling code here:
        if (acqua[2][1] == 0) {
            due_uno.setBackground(Color.cyan);
        } else if (acqua[2][1] == 1) {
            due_uno.setBackground(Color.black);
//            fineGioco++;
        }
        Comportamento(due_uno);

    }//GEN-LAST:event_due_unoActionPerformed

    private void due_dueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_due_dueActionPerformed
        // TODO add your handling code here:
        if (acqua[2][2] == 0) {
            due_due.setBackground(Color.cyan);
        } else if (acqua[2][2] == 1) {
            due_due.setBackground(Color.black);
//            fineGioco++;
        }
        Comportamento(due_due);

    }//GEN-LAST:event_due_dueActionPerformed

    private void due_treActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_due_treActionPerformed
        // TODO add your handling code here:
        if (acqua[2][3] == 0) {
            due_tre.setBackground(Color.cyan);
        } else if (acqua[2][3] == 1) {
            due_tre.setBackground(Color.black);
//            fineGioco++;
        }
        Comportamento(due_tre);

    }//GEN-LAST:event_due_treActionPerformed

    private void due_quattroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_due_quattroActionPerformed
        // TODO add your handling code here:
        if (acqua[2][4] == 0) {
            due_quattro.setBackground(Color.cyan);
        } else if (acqua[2][4] == 1) {
            due_quattro.setBackground(Color.black);
//            fineGioco++;
        }
        Comportamento(due_quattro);

    }//GEN-LAST:event_due_quattroActionPerformed

    private void tre_zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tre_zeroActionPerformed
        // TODO add your handling code here:
        if (acqua[3][0] == 0) {
            tre_zero.setBackground(Color.cyan);
        } else if (acqua[3][0] == 1) {
            tre_zero.setBackground(Color.black);
//            fineGioco++;
        }
        Comportamento(tre_zero);

    }//GEN-LAST:event_tre_zeroActionPerformed

    private void tre_unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tre_unoActionPerformed
        // TODO add your handling code here:
        if (acqua[3][1] == 0) {
            tre_uno.setBackground(Color.cyan);
        } else if (acqua[3][1] == 1) {
            tre_uno.setBackground(Color.black);
//            fineGioco++;
        }
        Comportamento(tre_uno);

    }//GEN-LAST:event_tre_unoActionPerformed

    private void tre_dueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tre_dueActionPerformed
        // TODO add your handling code here:
        if (acqua[3][2] == 0) {
            tre_due.setBackground(Color.cyan);
        } else if (acqua[3][2] == 1) {
            tre_due.setBackground(Color.black);
//            fineGioco++;
        }
        Comportamento(tre_due);

    }//GEN-LAST:event_tre_dueActionPerformed

    private void tre_treActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tre_treActionPerformed
        // TODO add your handling code here:
        if (acqua[3][3] == 0) {
            tre_tre.setBackground(Color.cyan);
        } else if (acqua[3][3] == 1) {
            tre_tre.setBackground(Color.black);
//            fineGioco++;
        }
        Comportamento(tre_tre);

    }//GEN-LAST:event_tre_treActionPerformed

    private void tre_quattroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tre_quattroActionPerformed
        // TODO add your handling code here:
        if (acqua[3][4] == 0) {
            tre_quattro.setBackground(Color.cyan);
        } else if (acqua[3][4] == 1) {
            tre_quattro.setBackground(Color.black);
//            fineGioco++;
        }
        Comportamento(tre_quattro);

    }//GEN-LAST:event_tre_quattroActionPerformed

    private void quattro_zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quattro_zeroActionPerformed
        // TODO add your handling code here:
        if (acqua[4][0] == 0) {
            quattro_zero.setBackground(Color.cyan);
        } else if (acqua[4][0] == 1) {
            quattro_zero.setBackground(Color.black);
//            fineGioco++;
        }
        Comportamento(quattro_zero);

    }//GEN-LAST:event_quattro_zeroActionPerformed

    private void quattro_unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quattro_unoActionPerformed
        // TODO add your handling code here:
        if (acqua[4][1] == 0) {
            quattro_uno.setBackground(Color.cyan);
        } else if (acqua[4][1] == 1) {
//            fineGioco++;
            quattro_uno.setBackground(Color.black);
        }
        Comportamento(quattro_uno);

    }//GEN-LAST:event_quattro_unoActionPerformed

    private void quattro_dueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quattro_dueActionPerformed
        // TODO add your handling code here:
        if (acqua[4][2] == 0) {
            quattro_due.setBackground(Color.cyan);
        } else if (acqua[4][2] == 1) {
            quattro_due.setBackground(Color.black);
//            fineGioco++;
        }
        Comportamento(quattro_due);

    }//GEN-LAST:event_quattro_dueActionPerformed

    private void quattro_treActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quattro_treActionPerformed
        // TODO add your handling code here:
        if (acqua[4][3] == 0) {
            quattro_tre.setBackground(Color.cyan);
        } else if (acqua[4][3] == 1) {
            quattro_tre.setBackground(Color.black);
//            fineGioco++;
        }
        Comportamento(quattro_tre);

    }//GEN-LAST:event_quattro_treActionPerformed

    private void quattro_quattroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quattro_quattroActionPerformed
        // TODO add your handling code here:
        if (acqua[4][4] == 0) {
            quattro_quattro.setBackground(Color.cyan);
        } else if (acqua[4][4] == 1) {
            quattro_quattro.setBackground(Color.black);
//            fineGioco++;
        }
        Comportamento(quattro_quattro);

    }//GEN-LAST:event_quattro_quattroActionPerformed

    private void zero_zeroMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zero_zeroMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_zero_zeroMouseMoved

    private void facileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facileActionPerformed
        // TODO add your handling code here:

        if (facile.isSelected() == true) {
            medio.setSelected(false);
            difficile.setSelected(false);
        }
        if(solitario.isSelected()==false)
        {
            A1.setVisible(true);
                B1.setVisible(true);
                C1.setVisible(true);
                D1.setVisible(true);
                E1.setVisible(true);
                _1.setVisible(true);
                _2.setVisible(true);
                _3.setVisible(true);
                _4.setVisible(true);
                _5.setVisible(true);
                zero_zero1.setVisible(true);
                zero_uno1.setVisible(true);
                zero_due1.setVisible(true);
                zero_tre1.setVisible(true);
                zero_quattro1.setVisible(true);
                uno_zero1.setVisible(true);
                uno_uno1.setVisible(true);
                uno_due1.setVisible(true);
                uno_tre1.setVisible(true);
                uno_quattro1.setVisible(true);
                due_zero1.setVisible(true);
                due_uno1.setVisible(true);
                due_due1.setVisible(true);
                due_tre1.setVisible(true);
                due_quattro1.setVisible(true);
                tre_zero1.setVisible(true);
                tre_uno1.setVisible(true);
                tre_due1.setVisible(true);
                tre_tre1.setVisible(true);
                tre_quattro1.setVisible(true);
                quattro_zero1.setVisible(true);
                quattro_uno1.setVisible(true);
                quattro_due1.setVisible(true);
                quattro_tre1.setVisible(true);
                quattro_quattro1.setVisible(true);
               zero_cinque1.setVisible(false);
        zero_sei1.setVisible(false);
        zero_sette1.setVisible(false);
        uno_cinque1.setVisible(false);
        uno_sei1.setVisible(false);
        uno_sette1.setVisible(false);
        due_cinque1.setVisible(false);
        due_sei1.setVisible(false);
        due_sette1.setVisible(false);
        tre_cinque1.setVisible(false);
        tre_sei1.setVisible(false);
        tre_sette1.setVisible(false);
         quattro_cinque1.setVisible(false);
        quattro_sei1.setVisible(false);
        quattro_sette1.setVisible(false);
                cinque_zero1.setVisible(false);
                cinque_uno1.setVisible(false);
                cinque_due1.setVisible(false);
                cinque_tre1.setVisible(false);
                cinque_quattro1.setVisible(false);
              cinque_cinque1.setVisible(false);
                cinque_sei1.setVisible(false);
        cinque_sette1.setVisible(false);
        sei_zero1.setVisible(false);
        sei_uno1.setVisible(false);
        sei_due1.setVisible(false);
        sei_tre1.setVisible(false);
        sei_quattro1.setVisible(false);
        sei_cinque1.setVisible(false);
        sei_sei1.setVisible(false);
        sei_sette1.setVisible(false);
        sette_zero1.setVisible(false);
        sette_uno1.setVisible(false);
        sette_due1.setVisible(false);
        sette_tre1.setVisible(false);
        sette_quattro1.setVisible(false);
        sette_cinque1.setVisible(false);
        sette_sei1.setVisible(false);
        sette_sette1.setVisible(false);
        sette_otto1.setVisible(false);

        J1.setVisible(false);
        I1.setVisible(false);

        _10.setVisible(false);
        _9.setVisible(false);
        _8.setVisible(true);

        zero_otto1.setVisible(false);
        zero_nove1.setVisible(false);
        uno_cinque1.setVisible(false);
        uno_otto1.setVisible(false);
        uno_nove1.setVisible(false);
        due_otto1.setVisible(false);
        due_nove1.setVisible(false);
        tre_otto1.setVisible(false);
        tre_nove1.setVisible(false);
        quattro_otto1.setVisible(false);
        quattro_nove1.setVisible(false);
        cinque_otto1.setVisible(false);
        cinque_nove1.setVisible(false);
        sei_otto1.setVisible(false);
        sei_nove1.setVisible(false);
        sette_otto1.setVisible(false);
        sette_nove1.setVisible(false);
        otto_zero1.setVisible(false);
        otto_uno1.setVisible(false);
        otto_due1.setVisible(false);
        otto_tre1.setVisible(false);
        otto_quattro1.setVisible(false);
        otto_cinque1.setVisible(false);
        otto_sei1.setVisible(false);
        otto_sette1.setVisible(false);
        otto_otto1.setVisible(false);
        otto_nove1.setVisible(false);
        
        nove_zero1.setVisible(false);
        nove_uno1.setVisible(false);
        nove_due1.setVisible(false);
        nove_tre1.setVisible(false);
        nove_quattro1.setVisible(false);
        nove_cinque1.setVisible(false);
        nove_sei1.setVisible(false);
        nove_sette1.setVisible(false);
        nove_otto1.setVisible(false);
        nove_nove1.setVisible(false);

        }
        J.setVisible(false);
        F.setVisible(false);
        G.setVisible(false);
        H.setVisible(false);
        I.setVisible(false);
        dieci.setVisible(false);
        nove.setVisible(false);
        otto.setVisible(false);
        sette.setVisible(false);
        sei.setVisible(false);
        zero_cinque.setVisible(false);
        zero_sei.setVisible(false);
        zero_sette.setVisible(false);
        zero_otto.setVisible(false);
        zero_nove.setVisible(false);
        uno_cinque.setVisible(false);
        uno_sei.setVisible(false);
        uno_sette.setVisible(false);
        uno_otto.setVisible(false);
        uno_nove.setVisible(false);
        due_cinque.setVisible(false);
        due_sei.setVisible(false);
        due_sette.setVisible(false);
        due_otto.setVisible(false);
        due_nove.setVisible(false);
        tre_cinque.setVisible(false);
        tre_sei.setVisible(false);
        tre_sette.setVisible(false);
        tre_otto.setVisible(false);
        tre_nove.setVisible(false);
        quattro_cinque.setVisible(false);
        quattro_sei.setVisible(false);
        quattro_sette.setVisible(false);
        quattro_otto.setVisible(false);
        quattro_nove.setVisible(false);
        cinque_zero.setVisible(false);
        cinque_uno.setVisible(false);
        cinque_due.setVisible(false);
        cinque_tre.setVisible(false);
        cinque_quattro.setVisible(false);
        cinque_cinque.setVisible(false);
        cinque_sei.setVisible(false);
        cinque_sette.setVisible(false);
        cinque_otto.setVisible(false);
        cinque_nove.setVisible(false);
        sei_zero.setVisible(false);
        sei_uno.setVisible(false);
        sei_due.setVisible(false);
        sei_tre.setVisible(false);
        sei_quattro.setVisible(false);
        sei_cinque.setVisible(false);
        sei_sei.setVisible(false);
        sei_sette.setVisible(false);
        sei_otto.setVisible(false);
        sei_nove.setVisible(false);
        sette_zero.setVisible(false);
        sette_uno.setVisible(false);
        sette_due.setVisible(false);
        sette_tre.setVisible(false);
        sette_quattro.setVisible(false);
        sette_cinque.setVisible(false);
        sette_sei.setVisible(false);
        sette_sette.setVisible(false);
        sette_otto.setVisible(false);
        sette_nove.setVisible(false);
        otto_zero.setVisible(false);
        otto_uno.setVisible(false);
        otto_due.setVisible(false);
        otto_tre.setVisible(false);
        otto_quattro.setVisible(false);
        otto_cinque.setVisible(false);
        otto_sei.setVisible(false);
        otto_sette.setVisible(false);
        otto_otto.setVisible(false);
        otto_nove.setVisible(false);
        nove_zero.setVisible(false);
        nove_uno.setVisible(false);
        nove_due.setVisible(false);
        nove_tre.setVisible(false);
        nove_quattro.setVisible(false);
        nove_cinque.setVisible(false);
        nove_sei.setVisible(false);
        nove_sette.setVisible(false);
        nove_otto.setVisible(false);
        nove_nove.setVisible(false);

        zero_zero.setEnabled(false);
        zero_uno.setEnabled(false);
        zero_due.setEnabled(false);
        zero_tre.setEnabled(false);
        zero_quattro.setEnabled(false);
        zero_cinque.setEnabled(false);
        uno_zero.setEnabled(false);
        uno_uno.setEnabled(false);
        uno_due.setEnabled(false);
        uno_tre.setEnabled(false);
        uno_quattro.setEnabled(false);
        uno_cinque.setEnabled(false);
        due_zero.setEnabled(false);
        due_uno.setEnabled(false);
        due_due.setEnabled(false);
        due_tre.setEnabled(false);
        due_quattro.setEnabled(false);
        due_cinque.setEnabled(false);
        tre_zero.setEnabled(false);
        tre_uno.setEnabled(false);
        tre_due.setEnabled(false);
        tre_tre.setEnabled(false);
        tre_quattro.setEnabled(false);
        tre_cinque.setEnabled(false);
        quattro_zero.setEnabled(false);
        quattro_uno.setEnabled(false);
        quattro_due.setEnabled(false);
        quattro_tre.setEnabled(false);
        quattro_quattro.setEnabled(false);
        quattro_cinque.setEnabled(false);
        cinque_zero.setEnabled(false);
        cinque_uno.setEnabled(false);
        cinque_due.setEnabled(false);
        cinque_tre.setEnabled(false);
        cinque_quattro.setEnabled(false);
        cinque_cinque.setEnabled(false);

        zero_zero.setBackground(Color.white);
        zero_uno.setBackground(Color.white);
        zero_due.setBackground(Color.white);
        zero_tre.setBackground(Color.white);
        zero_quattro.setBackground(Color.white);
        uno_zero.setBackground(Color.white);
        uno_uno.setBackground(Color.white);
        uno_due.setBackground(Color.white);
        uno_tre.setBackground(Color.white);
        uno_quattro.setBackground(Color.white);
        due_zero.setBackground(Color.white);
        due_uno.setBackground(Color.white);
        due_due.setBackground(Color.white);
        due_tre.setBackground(Color.white);
        due_quattro.setBackground(Color.white);
        tre_zero.setBackground(Color.white);
        tre_uno.setBackground(Color.white);
        tre_due.setBackground(Color.white);
        tre_tre.setBackground(Color.white);
        tre_quattro.setBackground(Color.white);
        quattro_zero.setBackground(Color.white);
        quattro_uno.setBackground(Color.white);
        quattro_due.setBackground(Color.white);
        quattro_tre.setBackground(Color.white);
        quattro_quattro.setBackground(Color.white);
    }//GEN-LAST:event_facileActionPerformed

    private void medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medioActionPerformed
        // TODO add your handling code here:
        if (medio.isSelected() == true) {
            facile.setSelected(false);
            difficile.setSelected(false);
        }

        F.setVisible(true);
        G.setVisible(true);
        H.setVisible(true);
        I.setVisible(true);
        J.setVisible(true);
        sette_zero.setVisible(true);
        sette_uno.setVisible(true);
        sette_due.setVisible(true);
        sette_tre.setVisible(true);
        sette_quattro.setVisible(true);
        sette_cinque.setVisible(true);
        sette_sei.setVisible(true);
        sette_sette.setVisible(true);
        sette.setVisible(true);
        sei.setVisible(true);
        otto.setVisible(true);
        zero_cinque.setVisible(true);
        zero_sei.setVisible(true);
        zero_sette.setVisible(true);
        uno_sei.setVisible(true);
        uno_sette.setVisible(true);
        due_cinque.setVisible(true);
        due_sei.setVisible(true);
        due_sette.setVisible(true);
        tre_cinque.setVisible(true);
        tre_sei.setVisible(true);
        tre_sette.setVisible(true);
        quattro_cinque.setVisible(true);
        quattro_sei.setVisible(true);
        quattro_sette.setVisible(true);
        cinque_zero.setVisible(true);
        cinque_uno.setVisible(true);
        cinque_due.setVisible(true);
        cinque_tre.setVisible(true);
        cinque_quattro.setVisible(true);
        cinque_cinque.setVisible(true);
        cinque_sei.setVisible(true);
        cinque_sette.setVisible(true);
        sei_zero.setVisible(true);
        sei_uno.setVisible(true);
        sei_due.setVisible(true);
        sei_tre.setVisible(true);
        sei_quattro.setVisible(true);
        sei_cinque.setVisible(true);
        sei_sei.setVisible(true);
        sei_sette.setVisible(true);

        J.setVisible(false);
        I.setVisible(false);

        dieci.setVisible(false);
        nove.setVisible(false);
        otto.setVisible(true);

        zero_otto.setVisible(false);
        zero_nove.setVisible(false);
        uno_cinque.setVisible(true);
        uno_otto.setVisible(false);
        uno_nove.setVisible(false);
        due_otto.setVisible(false);
        due_nove.setVisible(false);
        tre_otto.setVisible(false);
        tre_nove.setVisible(false);
        quattro_otto.setVisible(false);
        quattro_nove.setVisible(false);
        cinque_otto.setVisible(false);
        cinque_nove.setVisible(false);
        sei_otto.setVisible(false);
        sei_nove.setVisible(false);
        sette_otto.setVisible(false);
        sette_nove.setVisible(false);
        otto_zero.setVisible(false);
        otto_uno.setVisible(false);
        otto_due.setVisible(false);
        otto_tre.setVisible(false);
        otto_quattro.setVisible(false);
        otto_cinque.setVisible(false);
        otto_sei.setVisible(false);
        otto_sette.setVisible(false);
        otto_otto.setVisible(false);
        otto_nove.setVisible(false);
        nove_zero.setVisible(false);
        nove_uno.setVisible(false);
        nove_due.setVisible(false);
        nove_tre.setVisible(false);
        nove_quattro.setVisible(false);
        nove_cinque.setVisible(false);
        nove_sei.setVisible(false);
        nove_sette.setVisible(false);
        nove_otto.setVisible(false);
        nove_nove.setVisible(false);

        sette_zero.setEnabled(false);
        sette_uno.setEnabled(false);
        sette_due.setEnabled(false);
        sette_tre.setEnabled(false);
        sette_quattro.setEnabled(false);
        sette_cinque.setEnabled(false);
        sette_sei.setEnabled(false);
        sette_sette.setEnabled(false);
        zero_zero.setEnabled(false);
        zero_uno.setEnabled(false);
        zero_due.setEnabled(false);
        zero_tre.setEnabled(false);
        zero_quattro.setEnabled(false);
        zero_cinque.setEnabled(false);
        zero_sei.setEnabled(false);
        zero_sette.setEnabled(false);
        uno_zero.setEnabled(false);
        uno_uno.setEnabled(false);
        uno_due.setEnabled(false);
        uno_tre.setEnabled(false);
        uno_quattro.setEnabled(false);
        uno_cinque.setEnabled(false);
        uno_sei.setEnabled(false);
        uno_sette.setEnabled(false);
        due_zero.setEnabled(false);
        due_uno.setEnabled(false);
        due_due.setEnabled(false);
        due_tre.setEnabled(false);
        due_quattro.setEnabled(false);
        due_cinque.setEnabled(false);
        due_sei.setEnabled(false);
        due_sette.setEnabled(false);
        tre_zero.setEnabled(false);
        tre_uno.setEnabled(false);
        tre_due.setEnabled(false);
        tre_tre.setEnabled(false);
        tre_quattro.setEnabled(false);
        tre_cinque.setEnabled(false);
        tre_sei.setEnabled(false);
        tre_sette.setEnabled(false);
        quattro_zero.setEnabled(false);
        quattro_uno.setEnabled(false);
        quattro_due.setEnabled(false);
        quattro_tre.setEnabled(false);
        quattro_quattro.setEnabled(false);
        quattro_cinque.setEnabled(false);
        quattro_sei.setEnabled(false);
        quattro_sette.setEnabled(false);
        cinque_zero.setEnabled(false);
        cinque_uno.setEnabled(false);
        cinque_due.setEnabled(false);
        cinque_tre.setEnabled(false);
        cinque_quattro.setEnabled(false);
        cinque_cinque.setEnabled(false);
        cinque_sei.setEnabled(false);
        cinque_sette.setEnabled(false);
        sei_zero.setEnabled(false);
        sei_uno.setEnabled(false);
        sei_due.setEnabled(false);
        sei_tre.setEnabled(false);
        sei_quattro.setEnabled(false);
        sei_cinque.setEnabled(false);
        sei_sei.setEnabled(false);
        sei_sette.setEnabled(false);

        zero_zero.setBackground(Color.white);
        zero_uno.setBackground(Color.white);
        zero_due.setBackground(Color.white);
        zero_tre.setBackground(Color.white);
        zero_quattro.setBackground(Color.white);
        uno_zero.setBackground(Color.white);
        uno_uno.setBackground(Color.white);
        uno_due.setBackground(Color.white);
        uno_tre.setBackground(Color.white);
        uno_quattro.setBackground(Color.white);
        due_zero.setBackground(Color.white);
        due_uno.setBackground(Color.white);
        due_due.setBackground(Color.white);
        due_tre.setBackground(Color.white);
        due_quattro.setBackground(Color.white);
        tre_zero.setBackground(Color.white);
        tre_uno.setBackground(Color.white);
        tre_due.setBackground(Color.white);
        tre_tre.setBackground(Color.white);
        tre_quattro.setBackground(Color.white);
        quattro_zero.setBackground(Color.white);
        quattro_uno.setBackground(Color.white);
        quattro_due.setBackground(Color.white);
        quattro_tre.setBackground(Color.white);
        quattro_quattro.setBackground(Color.white);
        sette_zero.setBackground(Color.white);
        sette_uno.setBackground(Color.white);
        sette_due.setBackground(Color.white);
        sette_tre.setBackground(Color.white);
        sette_quattro.setBackground(Color.white);
        sette_cinque.setBackground(Color.white);
        sette_sei.setBackground(Color.white);
        sette_sette.setBackground(Color.white);
        zero_cinque.setBackground(Color.white);
        zero_sei.setBackground(Color.white);
        zero_sette.setBackground(Color.white);
        uno_cinque.setBackground(Color.white);
        uno_sei.setBackground(Color.white);
        uno_sette.setBackground(Color.white);
        due_cinque.setBackground(Color.white);
        due_sei.setBackground(Color.white);
        due_sette.setBackground(Color.white);
        tre_cinque.setBackground(Color.white);
        tre_sei.setBackground(Color.white);
        tre_sette.setBackground(Color.white);
        quattro_cinque.setBackground(Color.white);
        quattro_sei.setBackground(Color.white);
        quattro_sette.setBackground(Color.white);
        cinque_zero.setBackground(Color.white);
        cinque_uno.setBackground(Color.white);
        cinque_due.setBackground(Color.white);
        cinque_tre.setBackground(Color.white);
        cinque_quattro.setBackground(Color.white);
        cinque_cinque.setBackground(Color.white);
        cinque_sei.setBackground(Color.white);
        cinque_sette.setBackground(Color.white);
        sei_zero.setBackground(Color.white);
        sei_uno.setBackground(Color.white);
        sei_due.setBackground(Color.white);
        sei_tre.setBackground(Color.white);
        sei_quattro.setBackground(Color.white);
        sei_cinque.setBackground(Color.white);
        sei_sei.setBackground(Color.white);
        sei_sette.setBackground(Color.white);
        if (solitario.isSelected()==false) {
            zero_zero1.setVisible(true);
            zero_uno1.setVisible(true);
            zero_due1.setVisible(true);
            zero_tre1.setVisible(true);
            zero_quattro1.setVisible(true);
            uno_zero1.setVisible(true);
            uno_uno1.setVisible(true);
            uno_due1.setVisible(true);
            uno_tre1.setVisible(true);
            uno_quattro1.setVisible(true);
            due_zero1.setVisible(true);
            due_uno1.setVisible(true);
            due_due1.setVisible(true);
            due_tre1.setVisible(true);
            due_quattro1.setVisible(true);
            tre_zero1.setVisible(true);
            tre_uno1.setVisible(true);
            tre_due1.setVisible(true);
            tre_tre1.setVisible(true);
            tre_quattro1.setVisible(true);
            quattro_zero1.setVisible(true);
            quattro_uno1.setVisible(true);
            quattro_due1.setVisible(true);
            quattro_tre1.setVisible(true);
            quattro_quattro1.setVisible(true);

            zero_cinque1.setVisible(true);
            zero_sei1.setVisible(true);
            zero_sette1.setVisible(true);
            zero_otto1.setVisible(false);
            zero_nove1.setVisible(false);
            uno_cinque1.setVisible(true);
            uno_sei1.setVisible(true);
            uno_sette1.setVisible(true);
            uno_otto1.setVisible(false);
            uno_nove1.setVisible(false);
            due_cinque1.setVisible(true);
            due_sei1.setVisible(true);
            due_sette1.setVisible(true);
            due_otto1.setVisible(false);
            due_nove1.setVisible(false);
            tre_cinque1.setVisible(true);
            tre_sei1.setVisible(true);
            tre_sette1.setVisible(true);
            tre_otto1.setVisible(false);
            tre_nove1.setVisible(false);
            quattro_cinque1.setVisible(true);
            quattro_sei1.setVisible(true);
            quattro_sette1.setVisible(true);
            quattro_otto1.setVisible(false);
            quattro_nove1.setVisible(false);
            cinque_zero1.setVisible(true);
            cinque_uno1.setVisible(true);
            cinque_due1.setVisible(true);
            cinque_tre1.setVisible(true);
            cinque_quattro1.setVisible(true);
            cinque_cinque1.setVisible(true);
            cinque_sei1.setVisible(true);
            cinque_sette1.setVisible(true);
            cinque_otto1.setVisible(false);
            cinque_nove1.setVisible(false);
            sei_zero1.setVisible(true);
            sei_uno1.setVisible(true);
            sei_due1.setVisible(true);
            sei_tre1.setVisible(true);
            sei_quattro1.setVisible(true);
            sei_cinque1.setVisible(true);
            sei_sei1.setVisible(true);
            sei_sette1.setVisible(true);
            sei_otto1.setVisible(false);
            sei_nove1.setVisible(false);
            sette_zero1.setVisible(true);
            sette_uno1.setVisible(true);
            sette_due1.setVisible(true);
            sette_tre1.setVisible(true);
            sette_quattro1.setVisible(true);
            sette_cinque1.setVisible(true);
            sette_sei1.setVisible(true);
            sette_sette1.setVisible(true);
            sette_otto1.setVisible(false);
            sette_nove1.setVisible(false);
            otto_zero1.setVisible(false);
            otto_uno1.setVisible(false);
            otto_due1.setVisible(false);
            otto_tre1.setVisible(false);
            otto_quattro1.setVisible(false);
            otto_cinque1.setVisible(false);
            otto_sei1.setVisible(false);
            otto_sette1.setVisible(false);
            otto_otto1.setVisible(false);
            otto_nove1.setVisible(false);
            nove_zero1.setVisible(false);
            nove_uno1.setVisible(false);
            nove_due1.setVisible(false);
            nove_tre1.setVisible(false);
            nove_quattro1.setVisible(false);
            nove_cinque1.setVisible(false);
            nove_sei1.setVisible(false);
            nove_sette1.setVisible(false);
            nove_otto1.setVisible(false);
            nove_nove1.setVisible(false);
            A1.setVisible(false);
            B1.setVisible(false);
            C1.setVisible(false);
            D1.setVisible(false);
            E1.setVisible(false);
            F1.setVisible(false);
            G1.setVisible(false);
            H1.setVisible(false);
            I1.setVisible(false);
            J1.setVisible(false);
            _1.setVisible(false);
            _2.setVisible(false);
            _3.setVisible(false);
            _4.setVisible(false);
            _5.setVisible(false);
            _6.setVisible(false);
            _7.setVisible(false);
            _8.setVisible(false);
            _9.setVisible(false);
            _10.setVisible(false);
}
    }//GEN-LAST:event_medioActionPerformed

    private void difficileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_difficileActionPerformed
        // TODO add your handling code here:
        if (difficile.isSelected() == true) {
            medio.setSelected(false);
            facile.setSelected(false);
        }
        F.setVisible(true);
        G.setVisible(true);
        H.setVisible(true);
        I.setVisible(true);
        J.setVisible(true);
        sette_zero.setVisible(true);
        sette_uno.setVisible(true);
        sette_due.setVisible(true);
        sette_tre.setVisible(true);
        sette_quattro.setVisible(true);
        sette_cinque.setVisible(true);
        sette_sei.setVisible(true);
        sette_sette.setVisible(true);
        sette_otto.setVisible(true);
        sette_nove.setVisible(true);
        sette.setVisible(true);
        sei.setVisible(true);
        otto.setVisible(true);
        nove.setVisible(true);
        dieci.setVisible(true);
        zero_cinque.setVisible(true);
        zero_sei.setVisible(true);
        zero_sette.setVisible(true);
        zero_otto.setVisible(true);
        zero_nove.setVisible(true);
        uno_cinque.setVisible(true);
        uno_sei.setVisible(true);
        uno_sette.setVisible(true);
        uno_otto.setVisible(true);
        uno_nove.setVisible(true);
        due_cinque.setVisible(true);
        due_sei.setVisible(true);
        due_sette.setVisible(true);
        due_otto.setVisible(true);
        due_nove.setVisible(true);
        tre_cinque.setVisible(true);
        tre_sei.setVisible(true);
        tre_sette.setVisible(true);
        tre_otto.setVisible(true);
        tre_nove.setVisible(true);
        quattro_cinque.setVisible(true);
        quattro_sei.setVisible(true);
        quattro_sette.setVisible(true);
        quattro_otto.setVisible(true);
        quattro_nove.setVisible(true);
        cinque_zero.setVisible(true);
        cinque_uno.setVisible(true);
        cinque_due.setVisible(true);
        cinque_tre.setVisible(true);
        cinque_quattro.setVisible(true);
        cinque_cinque.setVisible(true);
        cinque_sei.setVisible(true);
        cinque_sette.setVisible(true);
        cinque_otto.setVisible(true);
        cinque_nove.setVisible(true);
        sei_zero.setVisible(true);
        sei_uno.setVisible(true);
        sei_due.setVisible(true);
        sei_tre.setVisible(true);
        sei_quattro.setVisible(true);
        sei_cinque.setVisible(true);
        sei_sei.setVisible(true);
        sei_sette.setVisible(true);
        sei_otto.setVisible(true);
        sei_nove.setVisible(true);

        otto_zero.setVisible(true);
        otto_uno.setVisible(true);
        otto_due.setVisible(true);
        otto_tre.setVisible(true);
        otto_quattro.setVisible(true);
        otto_cinque.setVisible(true);
        otto_sei.setVisible(true);
        otto_sette.setVisible(true);
        otto_otto.setVisible(true);
        otto_nove.setVisible(true);
        nove_zero.setVisible(true);
        nove_uno.setVisible(true);
        nove_due.setVisible(true);
        nove_tre.setVisible(true);
        nove_quattro.setVisible(true);
        nove_cinque.setVisible(true);
        nove_sei.setVisible(true);
        nove_sette.setVisible(true);
        nove_otto.setVisible(true);
        nove_nove.setVisible(true);
        sette_zero.setEnabled(false);

        sette_uno.setEnabled(false);
        sette_due.setEnabled(false);
        sette_tre.setEnabled(false);
        sette_quattro.setEnabled(false);
        sette_cinque.setEnabled(false);
        sette_sei.setEnabled(false);
        sette_sette.setEnabled(false);
        zero_zero.setEnabled(false);
        zero_uno.setEnabled(false);
        zero_due.setEnabled(false);
        zero_tre.setEnabled(false);
        zero_quattro.setEnabled(false);
        zero_cinque.setEnabled(false);
        zero_sei.setEnabled(false);
        zero_sette.setEnabled(false);
        uno_zero.setEnabled(false);
        uno_uno.setEnabled(false);
        uno_due.setEnabled(false);
        uno_tre.setEnabled(false);
        uno_quattro.setEnabled(false);
        uno_cinque.setEnabled(false);
        uno_sei.setEnabled(false);
        uno_sette.setEnabled(false);
        due_zero.setEnabled(false);
        due_uno.setEnabled(false);
        due_due.setEnabled(false);
        due_tre.setEnabled(false);
        due_quattro.setEnabled(false);
        due_cinque.setEnabled(false);
        due_sei.setEnabled(false);
        due_sette.setEnabled(false);
        tre_zero.setEnabled(false);
        tre_uno.setEnabled(false);
        tre_due.setEnabled(false);
        tre_tre.setEnabled(false);
        tre_quattro.setEnabled(false);
        tre_cinque.setEnabled(false);
        tre_sei.setEnabled(false);
        tre_sette.setEnabled(false);
        quattro_zero.setEnabled(false);
        quattro_uno.setEnabled(false);
        quattro_due.setEnabled(false);
        quattro_tre.setEnabled(false);
        quattro_quattro.setEnabled(false);
        quattro_cinque.setEnabled(false);
        quattro_sei.setEnabled(false);
        quattro_sette.setEnabled(false);
        cinque_zero.setEnabled(false);
        cinque_uno.setEnabled(false);
        cinque_due.setEnabled(false);
        cinque_tre.setEnabled(false);
        cinque_quattro.setEnabled(false);
        cinque_cinque.setEnabled(false);
        cinque_sei.setEnabled(false);
        cinque_sette.setEnabled(false);
        sei_zero.setEnabled(false);
        sei_uno.setEnabled(false);
        sei_due.setEnabled(false);
        sei_tre.setEnabled(false);
        sei_quattro.setEnabled(false);
        sei_cinque.setEnabled(false);
        sei_sei.setEnabled(false);
        sei_sette.setEnabled(false);
        sette_zero.setEnabled(false);
        sette_uno.setEnabled(false);
        sette_due.setEnabled(false);
        sette_tre.setEnabled(false);
        sette_quattro.setEnabled(false);
        sette_cinque.setEnabled(false);
        sette_sei.setEnabled(false);
        sette_sette.setEnabled(false);
        sette_otto.setEnabled(false);
        sette_nove.setEnabled(false);
        zero_otto.setEnabled(false);
        zero_nove.setEnabled(false);
        uno_otto.setEnabled(false);
        uno_nove.setEnabled(false);
        due_otto.setEnabled(false);
        due_nove.setEnabled(false);
        tre_otto.setEnabled(false);
        tre_nove.setEnabled(false);
        quattro_otto.setEnabled(false);
        quattro_nove.setEnabled(false);
        cinque_otto.setEnabled(false);
        cinque_nove.setEnabled(false);
        sei_otto.setEnabled(false);
        sei_nove.setEnabled(false);
        otto_zero.setEnabled(false);
        otto_uno.setEnabled(false);
        otto_due.setEnabled(false);
        otto_tre.setEnabled(false);
        otto_quattro.setEnabled(false);
        otto_cinque.setEnabled(false);
        otto_sei.setEnabled(false);
        otto_sette.setEnabled(false);
        otto_otto.setEnabled(false);
        otto_nove.setEnabled(false);
        nove_zero.setEnabled(false);
        nove_uno.setEnabled(false);
        nove_due.setEnabled(false);
        nove_tre.setEnabled(false);
        nove_quattro.setEnabled(false);
        nove_cinque.setEnabled(false);
        nove_sei.setEnabled(false);
        nove_sette.setEnabled(false);
        nove_otto.setEnabled(false);
        nove_nove.setEnabled(false);

        zero_zero.setBackground(Color.white);
        zero_uno.setBackground(Color.white);
        zero_due.setBackground(Color.white);
        zero_tre.setBackground(Color.white);
        zero_quattro.setBackground(Color.white);
        zero_cinque.setBackground(Color.white);
        zero_sei.setBackground(Color.white);
        zero_sette.setBackground(Color.white);
        zero_otto.setBackground(Color.white);
        zero_nove.setBackground(Color.white);
        uno_zero.setBackground(Color.white);
        uno_uno.setBackground(Color.white);
        uno_due.setBackground(Color.white);
        uno_tre.setBackground(Color.white);
        uno_quattro.setBackground(Color.white);
        uno_cinque.setBackground(Color.white);
        uno_sei.setBackground(Color.white);
        uno_sette.setBackground(Color.white);
        uno_otto.setBackground(Color.white);
        uno_nove.setBackground(Color.white);
        due_zero.setBackground(Color.white);
        due_uno.setBackground(Color.white);
        due_due.setBackground(Color.white);
        due_tre.setBackground(Color.white);
        due_quattro.setBackground(Color.white);
        due_cinque.setBackground(Color.white);
        due_sei.setBackground(Color.white);
        due_sette.setBackground(Color.white);
        due_otto.setBackground(Color.white);
        due_nove.setBackground(Color.white);
        tre_zero.setBackground(Color.white);
        tre_uno.setBackground(Color.white);
        tre_due.setBackground(Color.white);
        tre_tre.setBackground(Color.white);
        tre_quattro.setBackground(Color.white);
        tre_cinque.setBackground(Color.white);
        tre_sei.setBackground(Color.white);
        tre_sette.setBackground(Color.white);
        tre_otto.setBackground(Color.white);
        tre_nove.setBackground(Color.white);
        quattro_zero.setBackground(Color.white);
        quattro_uno.setBackground(Color.white);
        quattro_due.setBackground(Color.white);
        quattro_tre.setBackground(Color.white);
        quattro_quattro.setBackground(Color.white);
        quattro_cinque.setBackground(Color.white);
        quattro_sei.setBackground(Color.white);
        quattro_sette.setBackground(Color.white);
        quattro_otto.setBackground(Color.white);
        quattro_nove.setBackground(Color.white);
        sette_zero.setBackground(Color.white);
        sette_uno.setBackground(Color.white);
        sette_due.setBackground(Color.white);
        sette_tre.setBackground(Color.white);
        sette_quattro.setBackground(Color.white);
        sette_cinque.setBackground(Color.white);
        sette_sei.setBackground(Color.white);
        sette_sette.setBackground(Color.white);
        sette_otto.setBackground(Color.white);
        sette_nove.setBackground(Color.white);
        cinque_zero.setBackground(Color.white);
        cinque_uno.setBackground(Color.white);
        cinque_due.setBackground(Color.white);
        cinque_tre.setBackground(Color.white);
        cinque_quattro.setBackground(Color.white);
        cinque_cinque.setBackground(Color.white);
        cinque_sei.setBackground(Color.white);
        cinque_sette.setBackground(Color.white);
        cinque_otto.setBackground(Color.white);
        cinque_nove.setBackground(Color.white);
        sei_zero.setBackground(Color.white);
        sei_uno.setBackground(Color.white);
        sei_due.setBackground(Color.white);
        sei_tre.setBackground(Color.white);
        sei_quattro.setBackground(Color.white);
        sei_cinque.setBackground(Color.white);
        sei_sei.setBackground(Color.white);
        sei_sette.setBackground(Color.white);
        sei_otto.setBackground(Color.white);
        sei_nove.setBackground(Color.white);
        otto_zero.setBackground(Color.white);
        otto_uno.setBackground(Color.white);
        otto_due.setBackground(Color.white);
        otto_tre.setBackground(Color.white);
        otto_quattro.setBackground(Color.white);
        otto_cinque.setBackground(Color.white);
        otto_sei.setBackground(Color.white);
        otto_sette.setBackground(Color.white);
        otto_otto.setBackground(Color.white);
        otto_nove.setBackground(Color.white);
        nove_zero.setBackground(Color.white);
        nove_uno.setBackground(Color.white);
        nove_due.setBackground(Color.white);
        nove_tre.setBackground(Color.white);
        nove_quattro.setBackground(Color.white);
        nove_cinque.setBackground(Color.white);
        nove_sei.setBackground(Color.white);
        nove_sette.setBackground(Color.white);
        nove_otto.setBackground(Color.white);
        nove_nove.setBackground(Color.white);

    }//GEN-LAST:event_difficileActionPerformed

    private void uno_cinqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uno_cinqueActionPerformed
        // TODO add your handling code here:
        Comportamento(uno_cinque);
    }//GEN-LAST:event_uno_cinqueActionPerformed

    private void zero_noveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zero_noveActionPerformed
        // TODO add your handling code here:
        Comportamento(zero_nove);
    }//GEN-LAST:event_zero_noveActionPerformed

    private void zero_cinqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zero_cinqueActionPerformed
        // TODO add your handling code here:
        Comportamento(zero_cinque);
    }//GEN-LAST:event_zero_cinqueActionPerformed

    private void italianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_italianoActionPerformed
        // TODO add your handling code here:
        linguaggio = 1;
        Lmosse.setText("mosse:");
        start.setText("avvia");
        stop.setText("ferma");
        difficolta.setText("difficoltà");
        lingua.setText("lingua");
        facile.setText("bassa");
        medio.setText("media");
        difficile.setText("alta");
        punti.setText("punti:");
        limiteMosse.setText("limite mosse");
        opzioni.setText("opzioni");
    }//GEN-LAST:event_italianoActionPerformed

    private void EnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnglishActionPerformed
        // TODO add your handling code here:
        linguaggio = 2;
        Lmosse.setText("moves:");
        start.setText("start");
        stop.setText("stop");
        difficolta.setText("difficulty");
        lingua.setText("language");
        facile.setText("low");
        medio.setText("medium");
        difficile.setText("high");
        punti.setText("score:");
        limiteMosse.setText("limit moves");
        opzioni.setText("options");
    }//GEN-LAST:event_EnglishActionPerformed

    private void nove_noveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nove_noveActionPerformed
        // TODO add your handling code here:
        Comportamento(nove_nove);
        Colore(9,9,nove_nove);
    }//GEN-LAST:event_nove_noveActionPerformed

    private void limiteMosseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limiteMosseActionPerformed
    }//GEN-LAST:event_limiteMosseActionPerformed

    private void due_cinqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_due_cinqueActionPerformed
        // TODO add your handling code here:
        Comportamento(due_cinque);
    }//GEN-LAST:event_due_cinqueActionPerformed

    private void zero_zero1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zero_zero1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_zero_zero1MouseMoved

    private void zero_zero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zero_zero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zero_zero1ActionPerformed

    private void zero_uno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zero_uno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zero_uno1ActionPerformed

    private void zero_due1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zero_due1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zero_due1ActionPerformed

    private void zero_tre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zero_tre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zero_tre1ActionPerformed

    private void zero_quattro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zero_quattro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zero_quattro1ActionPerformed

    private void zero_cinque1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zero_cinque1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zero_cinque1ActionPerformed

    private void zero_nove1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zero_nove1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zero_nove1ActionPerformed

    private void uno_zero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uno_zero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uno_zero1ActionPerformed

    private void uno_uno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uno_uno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uno_uno1ActionPerformed

    private void uno_due1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uno_due1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uno_due1ActionPerformed

    private void uno_tre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uno_tre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uno_tre1ActionPerformed

    private void uno_quattro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uno_quattro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uno_quattro1ActionPerformed

    private void uno_cinque1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uno_cinque1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uno_cinque1ActionPerformed

    private void due_zero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_due_zero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_due_zero1ActionPerformed

    private void due_uno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_due_uno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_due_uno1ActionPerformed

    private void due_due1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_due_due1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_due_due1ActionPerformed

    private void due_tre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_due_tre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_due_tre1ActionPerformed

    private void due_quattro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_due_quattro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_due_quattro1ActionPerformed

    private void due_cinque1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_due_cinque1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_due_cinque1ActionPerformed

    private void tre_zero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tre_zero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tre_zero1ActionPerformed

    private void tre_uno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tre_uno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tre_uno1ActionPerformed

    private void tre_due1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tre_due1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tre_due1ActionPerformed

    private void tre_tre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tre_tre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tre_tre1ActionPerformed

    private void tre_quattro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tre_quattro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tre_quattro1ActionPerformed

    private void quattro_zero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quattro_zero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quattro_zero1ActionPerformed

    private void quattro_uno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quattro_uno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quattro_uno1ActionPerformed

    private void quattro_due1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quattro_due1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quattro_due1ActionPerformed

    private void quattro_tre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quattro_tre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quattro_tre1ActionPerformed

    private void quattro_quattro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quattro_quattro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quattro_quattro1ActionPerformed

    private void nove_nove1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nove_nove1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nove_nove1ActionPerformed

    private void solitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solitarioActionPerformed
        if (solitario.isSelected() == false) {
            start.setEnabled(false);
           stop.setEnabled(true);
           insert.setVisible(true);
            insert.setEnabled(true);
            if (medio.isSelected() == true) {

                zero_zero1.setEnabled(false);
                zero_uno1.setEnabled(false);
                zero_due1.setEnabled(false);
                zero_tre1.setEnabled(false);
                zero_quattro1.setEnabled(false);
                uno_zero1.setEnabled(false);
                uno_uno1.setEnabled(false);
                uno_due1.setEnabled(false);
                uno_tre1.setEnabled(false);
                uno_quattro1.setEnabled(false);
                due_zero1.setEnabled(false);
                due_uno1.setEnabled(false);
                due_due1.setEnabled(false);
                due_tre1.setEnabled(false);
                due_quattro1.setEnabled(false);
                tre_zero1.setEnabled(false);
                tre_uno1.setEnabled(false);
                tre_due1.setEnabled(false);
                tre_tre1.setEnabled(false);
                tre_quattro1.setEnabled(false);
                quattro_zero1.setEnabled(false);
                quattro_uno1.setEnabled(false);
                quattro_due1.setEnabled(false);
                quattro_tre1.setEnabled(false);
                quattro_quattro1.setEnabled(false);

                zero_zero1.setVisible(true);
                zero_uno1.setVisible(true);
                zero_due1.setVisible(true);
                zero_tre1.setVisible(true);
                zero_quattro1.setVisible(true);
                zero_cinque1.setVisible(true);
                zero_sei1.setVisible(true);
                zero_sette1.setVisible(true);
                uno_zero1.setVisible(true);
                uno_uno1.setVisible(true);
                uno_due1.setVisible(true);
                uno_tre1.setVisible(true);
                uno_quattro1.setVisible(true);
                uno_cinque1.setVisible(true);
                uno_sei1.setVisible(true);
                uno_sette1.setVisible(true);
                due_zero1.setVisible(true);
                due_uno1.setVisible(true);
                due_due1.setVisible(true);
                due_tre1.setVisible(true);
                due_quattro1.setVisible(true);
                due_cinque1.setVisible(true);
                due_sei1.setVisible(true);
                due_sette1.setVisible(true);
                tre_zero1.setVisible(true);
                tre_uno1.setVisible(true);
                tre_due1.setVisible(true);
                tre_tre1.setVisible(true);
                tre_quattro1.setVisible(true);
                tre_cinque1.setVisible(true);
                tre_sei1.setVisible(true);
                tre_sette1.setVisible(true);
                quattro_zero1.setVisible(true);
                quattro_uno1.setVisible(true);
                quattro_due1.setVisible(true);
                quattro_tre1.setVisible(true);
                quattro_quattro1.setVisible(true);
                quattro_cinque1.setVisible(true);
                quattro_sei1.setVisible(true);
                quattro_sette1.setVisible(true);
                cinque_zero1.setVisible(true);
                cinque_uno1.setVisible(true);
                cinque_due1.setVisible(true);
                cinque_tre1.setVisible(true);
                cinque_quattro1.setVisible(true);
                cinque_cinque1.setVisible(true);
                cinque_sei1.setVisible(true);
                cinque_sette1.setVisible(true);
                sei_zero1.setVisible(true);
                sei_uno1.setVisible(true);
                sei_due1.setVisible(true);
                sei_tre1.setVisible(true);
                sei_quattro1.setVisible(true);
                sei_cinque1.setVisible(true);
                sei_sei1.setVisible(true);
                sei_sette1.setVisible(true);
                sette_zero1.setVisible(true);
                sette_uno1.setVisible(true);
                sette_due1.setVisible(true);
                sette_tre1.setVisible(true);
                sette_quattro1.setVisible(true);
                sette_cinque1.setVisible(true);
                sette_sei1.setVisible(true);
                sette_sette1.setVisible(true);
                A1.setVisible(true);
                B1.setVisible(true);
                C1.setVisible(true);
                D1.setVisible(true);
                E1.setVisible(true);
                F1.setVisible(true);
                G1.setVisible(true);
                H1.setVisible(true);
                _1.setVisible(true);
                _2.setVisible(true);
                _3.setVisible(true);
                _4.setVisible(true);
                _5.setVisible(true);
                _6.setVisible(true);
                _7.setVisible(true);
                _8.setVisible(true);


                zero_otto1.setVisible(false);
                zero_nove1.setVisible(false);

                uno_otto1.setVisible(false);
                uno_nove1.setVisible(false);

                due_otto1.setVisible(false);
                due_nove1.setVisible(false);

                tre_otto1.setVisible(false);
                tre_nove1.setVisible(false);

                quattro_otto1.setVisible(false);
                quattro_nove1.setVisible(false);

                cinque_otto1.setVisible(false);
                cinque_nove1.setVisible(false);

                sei_otto1.setVisible(false);
                sei_nove1.setVisible(false);

                sette_otto1.setVisible(false);
                sette_nove1.setVisible(false);
                otto_zero1.setVisible(false);
                otto_uno1.setVisible(false);
                otto_due1.setVisible(false);
                otto_tre1.setVisible(false);
                otto_quattro1.setVisible(false);
                otto_cinque1.setVisible(false);
                otto_sei1.setVisible(false);
                otto_sette1.setVisible(false);
                otto_otto1.setVisible(false);
                otto_nove1.setVisible(false);
                nove_zero1.setVisible(false);
                nove_uno1.setVisible(false);
                nove_due1.setVisible(false);
                nove_tre1.setVisible(false);
                nove_quattro1.setVisible(false);
                nove_cinque1.setVisible(false);
                nove_sei1.setVisible(false);
                nove_sette1.setVisible(false);
                nove_otto1.setVisible(false);
                nove_nove1.setVisible(false);

                I1.setVisible(false);
                J1.setVisible(false);

                _9.setVisible(false);
                _10.setVisible(false);
            }
            if (facile.isSelected() == true) {
                A1.setVisible(true);
                B1.setVisible(true);
                C1.setVisible(true);
                D1.setVisible(true);
                E1.setVisible(true);
                _1.setVisible(true);
                _2.setVisible(true);
                _3.setVisible(true);
                _4.setVisible(true);
                _5.setVisible(true);
                zero_zero1.setVisible(true);
                zero_uno1.setVisible(true);
                zero_due1.setVisible(true);
                zero_tre1.setVisible(true);
                zero_quattro1.setVisible(true);
                uno_zero1.setVisible(true);
                uno_uno1.setVisible(true);
                uno_due1.setVisible(true);
                uno_tre1.setVisible(true);
                uno_quattro1.setVisible(true);
                due_zero1.setVisible(true);
                due_uno1.setVisible(true);
                due_due1.setVisible(true);
                due_tre1.setVisible(true);
                due_quattro1.setVisible(true);
                tre_zero1.setVisible(true);
                tre_uno1.setVisible(true);
                tre_due1.setVisible(true);
                tre_tre1.setVisible(true);
                tre_quattro1.setVisible(true);
                quattro_zero1.setVisible(true);
                quattro_uno1.setVisible(true);
                quattro_due1.setVisible(true);
                quattro_tre1.setVisible(true);
                quattro_quattro1.setVisible(true);
            }
            if (difficile.isSelected() == true) {
                A1.setVisible(true);
                B1.setVisible(true);
                C1.setVisible(true);
                D1.setVisible(true);
                E1.setVisible(true);
                F1.setVisible(true);
                G1.setVisible(true);
                H1.setVisible(true);
                J1.setVisible(true);
                I1.setVisible(true);
                _1.setVisible(true);
                _2.setVisible(true);
                _3.setVisible(true);
                _4.setVisible(true);
                _5.setVisible(true);
                _6.setVisible(true);
                _7.setVisible(true);
                _8.setVisible(true);
                _9.setVisible(true);
                _10.setVisible(true);
                nove_zero1.setVisible(true);
                nove_uno1.setVisible(true);
                nove_due1.setVisible(true);
                nove_tre1.setVisible(true);
                nove_quattro1.setVisible(true);
                nove_cinque1.setVisible(true);
                nove_sei1.setVisible(true);
                nove_sette1.setVisible(true);
                nove_otto1.setVisible(true);
                nove_nove1.setVisible(true);
                otto_zero1.setVisible(true);
                otto_uno1.setVisible(true);
                otto_due1.setVisible(true);
                otto_tre1.setVisible(true);
                otto_quattro1.setVisible(true);
                otto_cinque1.setVisible(true);
                otto_sei1.setVisible(true);
                otto_sette1.setVisible(true);
                otto_otto1.setVisible(true);
                otto_nove1.setVisible(true);
                sette_zero1.setVisible(true);
                sette_uno1.setVisible(true);
                sette_due1.setVisible(true);
                sette_tre1.setVisible(true);
                sette_quattro1.setVisible(true);
                sette_cinque1.setVisible(true);
                sette_sei1.setVisible(true);
                sette_sette1.setVisible(true);
                sette_otto1.setVisible(true);
                sette_nove1.setVisible(true);
                sei_zero1.setVisible(true);
                sei_uno1.setVisible(true);
                sei_due1.setVisible(true);
                sei_tre1.setVisible(true);
                sei_quattro1.setVisible(true);
                sei_cinque1.setVisible(true);
                sei_sei1.setVisible(true);
                sei_sette1.setVisible(true);
                sei_otto1.setVisible(true);
                sei_nove1.setVisible(true);
                cinque_zero1.setVisible(true);
                cinque_uno1.setVisible(true);
                cinque_due1.setVisible(true);
                cinque_tre1.setVisible(true);
                cinque_quattro1.setVisible(true);
                cinque_cinque1.setVisible(true);
                cinque_sei1.setVisible(true);
                cinque_sette1.setVisible(true);
                cinque_otto1.setVisible(true);
                cinque_nove1.setVisible(true);
                quattro_zero1.setVisible(true);
                quattro_uno1.setVisible(true);
                quattro_due1.setVisible(true);
                quattro_tre1.setVisible(true);
                quattro_quattro1.setVisible(true);
                quattro_cinque1.setVisible(true);
                quattro_sei1.setVisible(true);
                quattro_sette1.setVisible(true);
                quattro_otto1.setVisible(true);
                quattro_nove1.setVisible(true);
                tre_zero1.setVisible(true);
                tre_uno1.setVisible(true);
                tre_due1.setVisible(true);
                tre_tre1.setVisible(true);
                tre_quattro1.setVisible(true);
                tre_cinque1.setVisible(true);
                tre_sei1.setVisible(true);
                tre_sette1.setVisible(true);
                tre_otto1.setVisible(true);
                tre_nove1.setVisible(true);
                due_zero1.setVisible(true);
                due_uno1.setVisible(true);
                due_due1.setVisible(true);
                due_tre1.setVisible(true);
                due_quattro1.setVisible(true);
                due_cinque1.setVisible(true);
                due_sei1.setVisible(true);
                due_sette1.setVisible(true);
                due_otto1.setVisible(true);
                due_nove1.setVisible(true);
                uno_zero1.setVisible(true);
                uno_uno1.setVisible(true);
                uno_due1.setVisible(true);
                uno_tre1.setVisible(true);
                uno_quattro1.setVisible(true);
                uno_cinque1.setVisible(true);
                uno_sei1.setVisible(true);
                uno_sette1.setVisible(true);
                uno_otto1.setVisible(true);
                uno_nove1.setVisible(true);
                zero_zero1.setVisible(true);
                zero_uno1.setVisible(true);
                zero_due1.setVisible(true);
                zero_tre1.setVisible(true);
                zero_quattro1.setVisible(true);
                zero_cinque1.setVisible(true);
                zero_sei1.setVisible(true);
                zero_sette1.setVisible(true);
                zero_otto1.setVisible(true);
                zero_nove1.setVisible(true);

           
            
            
            
            
            
            
            
            
            
            
            
            
            }
        }
    }//GEN-LAST:event_solitarioActionPerformed

    private void nove_ottoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nove_ottoActionPerformed
        // TODO add your handling code here:
        Comportamento(nove_otto);
    }//GEN-LAST:event_nove_ottoActionPerformed

    private void nove_setteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nove_setteActionPerformed
        // TODO add your handling code here:
        Comportamento(nove_sette);
    }//GEN-LAST:event_nove_setteActionPerformed

    private void nove_seiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nove_seiActionPerformed
        // TODO add your handling code here:
        Comportamento(nove_sei);
    }//GEN-LAST:event_nove_seiActionPerformed

    private void nove_cinqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nove_cinqueActionPerformed
        // TODO add your handling code here:
        Comportamento(nove_cinque);
    }//GEN-LAST:event_nove_cinqueActionPerformed

    private void nove_quattroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nove_quattroActionPerformed
        // TODO add your handling code here:
        Comportamento(nove_quattro);
    }//GEN-LAST:event_nove_quattroActionPerformed

    private void nove_treActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nove_treActionPerformed
        // TODO add your handling code here:
        Comportamento(nove_tre);
    }//GEN-LAST:event_nove_treActionPerformed

    private void nove_dueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nove_dueActionPerformed
        // TODO add your handling code here:
        Comportamento(nove_due);
    }//GEN-LAST:event_nove_dueActionPerformed

    private void nove_unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nove_unoActionPerformed
        // TODO add your handling code here:
        Comportamento(nove_uno);
    }//GEN-LAST:event_nove_unoActionPerformed

    private void nove_zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nove_zeroActionPerformed
        // TODO add your handling code here:
        Comportamento(nove_zero);
    }//GEN-LAST:event_nove_zeroActionPerformed

    private void otto_noveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otto_noveActionPerformed
        // TODO add your handling code here:
        Comportamento(otto_nove);
    }//GEN-LAST:event_otto_noveActionPerformed

    private void otto_ottoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otto_ottoActionPerformed
        // TODO add your handling code here:
        Comportamento(otto_otto);
    }//GEN-LAST:event_otto_ottoActionPerformed

    private void otto_setteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otto_setteActionPerformed
        // TODO add your handling code here:
        Comportamento(otto_sette);
    }//GEN-LAST:event_otto_setteActionPerformed

    private void otto_seiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otto_seiActionPerformed
        // TODO add your handling code here:
        Comportamento(otto_sei);
    }//GEN-LAST:event_otto_seiActionPerformed

    private void otto_cinqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otto_cinqueActionPerformed
        // TODO add your handling code here:
        Comportamento(otto_cinque);
    }//GEN-LAST:event_otto_cinqueActionPerformed

    private void otto_quattroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otto_quattroActionPerformed
        // TODO add your handling code here:
        Comportamento(otto_quattro);
    }//GEN-LAST:event_otto_quattroActionPerformed

    private void otto_treActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otto_treActionPerformed
        // TODO add your handling code here:
        Comportamento(otto_tre);
    }//GEN-LAST:event_otto_treActionPerformed

    private void otto_dueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otto_dueActionPerformed
        // TODO add your handling code here:
        Comportamento(otto_due);
    }//GEN-LAST:event_otto_dueActionPerformed

    private void otto_unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otto_unoActionPerformed
        // TODO add your handling code here:
        Comportamento(otto_uno);
    }//GEN-LAST:event_otto_unoActionPerformed

    private void otto_zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otto_zeroActionPerformed
        // TODO add your handling code here:
        Comportamento(otto_zero);
    }//GEN-LAST:event_otto_zeroActionPerformed

    private void sette_noveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sette_noveActionPerformed
        // TODO add your handling code here:
        Comportamento(sette_nove);
    }//GEN-LAST:event_sette_noveActionPerformed

    private void sette_ottoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sette_ottoActionPerformed
        // TODO add your handling code here:
        Comportamento(sette_otto);
    }//GEN-LAST:event_sette_ottoActionPerformed

    private void sette_setteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sette_setteActionPerformed
        // TODO add your handling code here:
        Comportamento(sette_sette);
    }//GEN-LAST:event_sette_setteActionPerformed

    private void sette_seiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sette_seiActionPerformed
        // TODO add your handling code here:
        Comportamento(sette_sei);
    }//GEN-LAST:event_sette_seiActionPerformed

    private void sette_cinqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sette_cinqueActionPerformed
        // TODO add your handling code here:
        Comportamento(sette_cinque);
    }//GEN-LAST:event_sette_cinqueActionPerformed

    private void sette_quattroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sette_quattroActionPerformed
        // TODO add your handling code here:
        Comportamento(sette_quattro);
    }//GEN-LAST:event_sette_quattroActionPerformed

    private void sette_treActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sette_treActionPerformed
        // TODO add your handling code here:
        Comportamento(sette_tre);
    }//GEN-LAST:event_sette_treActionPerformed

    private void sette_dueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sette_dueActionPerformed
        // TODO add your handling code here:
        Comportamento(sette_due);
    }//GEN-LAST:event_sette_dueActionPerformed

    private void sette_unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sette_unoActionPerformed
        // TODO add your handling code here:
        Comportamento(sette_uno);
    }//GEN-LAST:event_sette_unoActionPerformed

    private void sette_zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sette_zeroActionPerformed
        // TODO add your handling code here:
        Comportamento(sette_zero);
    }//GEN-LAST:event_sette_zeroActionPerformed

    private void sei_noveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sei_noveActionPerformed
        // TODO add your handling code here:
        Comportamento(sei_nove);
    }//GEN-LAST:event_sei_noveActionPerformed

    private void sei_ottoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sei_ottoActionPerformed
        // TODO add your handling code here:
        Comportamento(sei_otto);
    }//GEN-LAST:event_sei_ottoActionPerformed

    private void sei_setteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sei_setteActionPerformed
        // TODO add your handling code here:
        Comportamento(sei_sette);
    }//GEN-LAST:event_sei_setteActionPerformed

    private void sei_seiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sei_seiActionPerformed
        // TODO add your handling code here:
        Comportamento(sei_sei);
    }//GEN-LAST:event_sei_seiActionPerformed

    private void sei_cinqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sei_cinqueActionPerformed
        // TODO add your handling code here:
        Comportamento(sei_cinque);
    }//GEN-LAST:event_sei_cinqueActionPerformed

    private void sei_quattroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sei_quattroActionPerformed
        // TODO add your handling code here:
        Comportamento(sei_quattro);
    }//GEN-LAST:event_sei_quattroActionPerformed

    private void sei_treActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sei_treActionPerformed
        // TODO add your handling code here:
        Comportamento(sei_tre);
    }//GEN-LAST:event_sei_treActionPerformed

    private void sei_dueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sei_dueActionPerformed
        // TODO add your handling code here:
        Comportamento(sei_due);
    }//GEN-LAST:event_sei_dueActionPerformed

    private void sei_unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sei_unoActionPerformed
        // TODO add your handling code here:
        Comportamento(sei_uno);
    }//GEN-LAST:event_sei_unoActionPerformed

    private void sei_zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sei_zeroActionPerformed
        // TODO add your handling code here:
        Comportamento(sei_zero);
    }//GEN-LAST:event_sei_zeroActionPerformed

    private void cinque_noveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinque_noveActionPerformed
        // TODO add your handling code here:
        Comportamento(cinque_nove);
    }//GEN-LAST:event_cinque_noveActionPerformed

    private void cinque_ottoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinque_ottoActionPerformed
        // TODO add your handling code here:
        Comportamento(cinque_otto);
    }//GEN-LAST:event_cinque_ottoActionPerformed

    private void cinque_setteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinque_setteActionPerformed
        // TODO add your handling code here:
        Comportamento(cinque_sette);
    }//GEN-LAST:event_cinque_setteActionPerformed

    private void cinque_seiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinque_seiActionPerformed
        // TODO add your handling code here:
        Comportamento(cinque_sei);
    }//GEN-LAST:event_cinque_seiActionPerformed

    private void cinque_cinqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinque_cinqueActionPerformed
        // TODO add your handling code here:
        Comportamento(cinque_cinque);
    }//GEN-LAST:event_cinque_cinqueActionPerformed

    private void cinque_quattroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinque_quattroActionPerformed
        // TODO add your handling code here:
        Comportamento(cinque_quattro);
    }//GEN-LAST:event_cinque_quattroActionPerformed

    private void cinque_treActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinque_treActionPerformed
        // TODO add your handling code here:
        Comportamento(cinque_tre);
    }//GEN-LAST:event_cinque_treActionPerformed

    private void cinque_dueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinque_dueActionPerformed
        // TODO add your handling code here:
        Comportamento(cinque_due);
    }//GEN-LAST:event_cinque_dueActionPerformed

    private void cinque_unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinque_unoActionPerformed
        // TODO add your handling code here:
        Comportamento(cinque_uno);
    }//GEN-LAST:event_cinque_unoActionPerformed

    private void cinque_zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinque_zeroActionPerformed
        // TODO add your handling code here:
        Comportamento(cinque_zero);
    }//GEN-LAST:event_cinque_zeroActionPerformed

    private void zero_seiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zero_seiActionPerformed
        // TODO add your handling code here:
        Comportamento(zero_sei);
    }//GEN-LAST:event_zero_seiActionPerformed

    private void zero_setteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zero_setteActionPerformed
        // TODO add your handling code here:
        Comportamento(zero_sette);
    }//GEN-LAST:event_zero_setteActionPerformed

    private void zero_ottoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zero_ottoActionPerformed
        // TODO add your handling code here:
        Comportamento(zero_otto);
    }//GEN-LAST:event_zero_ottoActionPerformed

    private void uno_seiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uno_seiActionPerformed
        // TODO add your handling code here:
        Comportamento(uno_sei);
    }//GEN-LAST:event_uno_seiActionPerformed

    private void uno_setteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uno_setteActionPerformed
        // TODO add your handling code here:
        Comportamento(uno_sette);
    }//GEN-LAST:event_uno_setteActionPerformed

    private void uno_ottoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uno_ottoActionPerformed
        // TODO add your handling code here:
        Comportamento(uno_otto);
    }//GEN-LAST:event_uno_ottoActionPerformed

    private void uno_noveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uno_noveActionPerformed
        // TODO add your handling code here:
        Comportamento(uno_nove);
    }//GEN-LAST:event_uno_noveActionPerformed

    private void due_seiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_due_seiActionPerformed
        // TODO add your handling code here:
        Comportamento(due_sei);
    }//GEN-LAST:event_due_seiActionPerformed

    private void due_setteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_due_setteActionPerformed
        // TODO add your handling code here:
        Comportamento(due_sette);
    }//GEN-LAST:event_due_setteActionPerformed

    private void due_ottoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_due_ottoActionPerformed
        // TODO add your handling code here:
        Comportamento(due_otto);
    }//GEN-LAST:event_due_ottoActionPerformed

    private void due_noveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_due_noveActionPerformed
        // TODO add your handling code here:
        Comportamento(due_nove);
    }//GEN-LAST:event_due_noveActionPerformed

    private void tre_cinqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tre_cinqueActionPerformed
        // TODO add your handling code here:
        Comportamento(tre_cinque);
    }//GEN-LAST:event_tre_cinqueActionPerformed

    private void tre_seiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tre_seiActionPerformed
        // TODO add your handling code here:
        Comportamento(tre_sei);
    }//GEN-LAST:event_tre_seiActionPerformed

    private void tre_setteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tre_setteActionPerformed
        // TODO add your handling code here:
        Comportamento(tre_sette);
    }//GEN-LAST:event_tre_setteActionPerformed

    private void tre_ottoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tre_ottoActionPerformed
        // TODO add your handling code here:
        Comportamento(tre_otto);
    }//GEN-LAST:event_tre_ottoActionPerformed

    private void tre_noveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tre_noveActionPerformed
        // TODO add your handling code here:
        Comportamento(tre_nove);
    }//GEN-LAST:event_tre_noveActionPerformed

    private void quattro_cinqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quattro_cinqueActionPerformed
        // TODO add your handling code here:
        Comportamento(quattro_cinque);
    }//GEN-LAST:event_quattro_cinqueActionPerformed

    private void quattro_seiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quattro_seiActionPerformed
        // TODO add your handling code here:
        Comportamento(quattro_sei);
    }//GEN-LAST:event_quattro_seiActionPerformed

    private void quattro_setteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quattro_setteActionPerformed
        // TODO add your handling code here:
        Comportamento(quattro_sette);
    }//GEN-LAST:event_quattro_setteActionPerformed

    private void quattro_ottoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quattro_ottoActionPerformed
        // TODO add your handling code here:
        Comportamento(quattro_otto);
    }//GEN-LAST:event_quattro_ottoActionPerformed

    private void quattro_noveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quattro_noveActionPerformed
        // TODO add your handling code here:
        Comportamento(quattro_nove);
    }//GEN-LAST:event_quattro_noveActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        // TODO add your handling code here:
        for(int j = 0; j<5; j++)
        {
            for(int j2 = 0; j2<5;j2++)
            {
                miaAcqua [j][j2]=0;
            }
        }
            
    }//GEN-LAST:event_insertActionPerformed

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
            java.util.logging.Logger.getLogger(interfaccia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaccia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaccia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaccia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaccia().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A1;
    private javax.swing.JLabel B1;
    private javax.swing.JLabel C1;
    private javax.swing.JLabel D1;
    private javax.swing.JLabel E1;
    private javax.swing.JMenuItem English;
    private javax.swing.JLabel F;
    private javax.swing.JLabel F1;
    private javax.swing.JLabel G;
    private javax.swing.JLabel G1;
    private javax.swing.JLabel H;
    private javax.swing.JLabel H1;
    private javax.swing.JLabel I;
    private javax.swing.JLabel I1;
    private javax.swing.JLabel J;
    private javax.swing.JLabel J1;
    private javax.swing.JLabel Lmosse;
    private javax.swing.JLabel _1;
    private javax.swing.JLabel _10;
    private javax.swing.JLabel _2;
    private javax.swing.JLabel _3;
    private javax.swing.JLabel _4;
    private javax.swing.JLabel _5;
    private javax.swing.JLabel _6;
    private javax.swing.JLabel _7;
    private javax.swing.JLabel _8;
    private javax.swing.JLabel _9;
    private javax.swing.JLabel cinque;
    private javax.swing.JButton cinque_cinque;
    private javax.swing.JButton cinque_cinque1;
    private javax.swing.JButton cinque_due;
    private javax.swing.JButton cinque_due1;
    private javax.swing.JButton cinque_nove;
    private javax.swing.JButton cinque_nove1;
    private javax.swing.JButton cinque_otto;
    private javax.swing.JButton cinque_otto1;
    private javax.swing.JButton cinque_quattro;
    private javax.swing.JButton cinque_quattro1;
    private javax.swing.JButton cinque_sei;
    private javax.swing.JButton cinque_sei1;
    private javax.swing.JButton cinque_sette;
    private javax.swing.JButton cinque_sette1;
    private javax.swing.JButton cinque_tre;
    private javax.swing.JButton cinque_tre1;
    private javax.swing.JButton cinque_uno;
    private javax.swing.JButton cinque_uno1;
    private javax.swing.JButton cinque_zero;
    private javax.swing.JButton cinque_zero1;
    private javax.swing.JLabel dieci;
    private javax.swing.JRadioButtonMenuItem difficile;
    private javax.swing.JMenu difficolta;
    private javax.swing.JButton due_cinque;
    private javax.swing.JButton due_cinque1;
    private javax.swing.JButton due_due;
    private javax.swing.JButton due_due1;
    private javax.swing.JButton due_nove;
    private javax.swing.JButton due_nove1;
    private javax.swing.JButton due_otto;
    private javax.swing.JButton due_otto1;
    private javax.swing.JButton due_quattro;
    private javax.swing.JButton due_quattro1;
    private javax.swing.JButton due_sei;
    private javax.swing.JButton due_sei1;
    private javax.swing.JButton due_sette;
    private javax.swing.JButton due_sette1;
    private javax.swing.JButton due_tre;
    private javax.swing.JButton due_tre1;
    private javax.swing.JButton due_uno;
    private javax.swing.JButton due_uno1;
    private javax.swing.JButton due_zero;
    private javax.swing.JButton due_zero1;
    private javax.swing.JRadioButtonMenuItem facile;
    private javax.swing.JButton insert;
    private javax.swing.JMenuItem italiano;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JCheckBoxMenuItem limiteMosse;
    private javax.swing.JMenu lingua;
    private javax.swing.JRadioButtonMenuItem medio;
    private javax.swing.JLabel nove;
    private javax.swing.JButton nove_cinque;
    private javax.swing.JButton nove_cinque1;
    private javax.swing.JButton nove_due;
    private javax.swing.JButton nove_due1;
    private javax.swing.JButton nove_nove;
    private javax.swing.JButton nove_nove1;
    private javax.swing.JButton nove_otto;
    private javax.swing.JButton nove_otto1;
    private javax.swing.JButton nove_quattro;
    private javax.swing.JButton nove_quattro1;
    private javax.swing.JButton nove_sei;
    private javax.swing.JButton nove_sei1;
    private javax.swing.JButton nove_sette;
    private javax.swing.JButton nove_sette1;
    private javax.swing.JButton nove_tre;
    private javax.swing.JButton nove_tre1;
    private javax.swing.JButton nove_uno;
    private javax.swing.JButton nove_uno1;
    private javax.swing.JButton nove_zero;
    private javax.swing.JButton nove_zero1;
    private javax.swing.JMenu opzioni;
    private javax.swing.JLabel otto;
    private javax.swing.JButton otto_cinque;
    private javax.swing.JButton otto_cinque1;
    private javax.swing.JButton otto_due;
    private javax.swing.JButton otto_due1;
    private javax.swing.JButton otto_nove;
    private javax.swing.JButton otto_nove1;
    private javax.swing.JButton otto_otto;
    private javax.swing.JButton otto_otto1;
    private javax.swing.JButton otto_quattro;
    private javax.swing.JButton otto_quattro1;
    private javax.swing.JButton otto_sei;
    private javax.swing.JButton otto_sei1;
    private javax.swing.JButton otto_sette;
    private javax.swing.JButton otto_sette1;
    private javax.swing.JButton otto_tre;
    private javax.swing.JButton otto_tre1;
    private javax.swing.JButton otto_uno;
    private javax.swing.JButton otto_uno1;
    private javax.swing.JButton otto_zero;
    private javax.swing.JButton otto_zero1;
    private javax.swing.JLabel punti;
    private javax.swing.JLabel quattro;
    private javax.swing.JButton quattro_cinque;
    private javax.swing.JButton quattro_cinque1;
    private javax.swing.JButton quattro_due;
    private javax.swing.JButton quattro_due1;
    private javax.swing.JButton quattro_nove;
    private javax.swing.JButton quattro_nove1;
    private javax.swing.JButton quattro_otto;
    private javax.swing.JButton quattro_otto1;
    private javax.swing.JButton quattro_quattro;
    private javax.swing.JButton quattro_quattro1;
    private javax.swing.JButton quattro_sei;
    private javax.swing.JButton quattro_sei1;
    private javax.swing.JButton quattro_sette;
    private javax.swing.JButton quattro_sette1;
    private javax.swing.JButton quattro_tre;
    private javax.swing.JButton quattro_tre1;
    private javax.swing.JButton quattro_uno;
    private javax.swing.JButton quattro_uno1;
    private javax.swing.JButton quattro_zero;
    private javax.swing.JButton quattro_zero1;
    private javax.swing.JLabel sei;
    private javax.swing.JButton sei_cinque;
    private javax.swing.JButton sei_cinque1;
    private javax.swing.JButton sei_due;
    private javax.swing.JButton sei_due1;
    private javax.swing.JButton sei_nove;
    private javax.swing.JButton sei_nove1;
    private javax.swing.JButton sei_otto;
    private javax.swing.JButton sei_otto1;
    private javax.swing.JButton sei_quattro;
    private javax.swing.JButton sei_quattro1;
    private javax.swing.JButton sei_sei;
    private javax.swing.JButton sei_sei1;
    private javax.swing.JButton sei_sette;
    private javax.swing.JButton sei_sette1;
    private javax.swing.JButton sei_tre;
    private javax.swing.JButton sei_tre1;
    private javax.swing.JButton sei_uno;
    private javax.swing.JButton sei_uno1;
    private javax.swing.JButton sei_zero;
    private javax.swing.JButton sei_zero1;
    private javax.swing.JLabel sette;
    private javax.swing.JButton sette_cinque;
    private javax.swing.JButton sette_cinque1;
    private javax.swing.JButton sette_due;
    private javax.swing.JButton sette_due1;
    private javax.swing.JButton sette_nove;
    private javax.swing.JButton sette_nove1;
    private javax.swing.JButton sette_otto;
    private javax.swing.JButton sette_otto1;
    private javax.swing.JButton sette_quattro;
    private javax.swing.JButton sette_quattro1;
    private javax.swing.JButton sette_sei;
    private javax.swing.JButton sette_sei1;
    private javax.swing.JButton sette_sette;
    private javax.swing.JButton sette_sette1;
    private javax.swing.JButton sette_tre;
    private javax.swing.JButton sette_tre1;
    private javax.swing.JButton sette_uno;
    private javax.swing.JButton sette_uno1;
    private javax.swing.JButton sette_zero;
    private javax.swing.JButton sette_zero1;
    private javax.swing.JCheckBoxMenuItem solitario;
    private javax.swing.JButton start;
    private javax.swing.JButton stop;
    private javax.swing.JLabel testoPunti;
    private javax.swing.JLabel testomosse;
    private javax.swing.JLabel tre;
    private javax.swing.JButton tre_cinque;
    private javax.swing.JButton tre_cinque1;
    private javax.swing.JButton tre_due;
    private javax.swing.JButton tre_due1;
    private javax.swing.JButton tre_nove;
    private javax.swing.JButton tre_nove1;
    private javax.swing.JButton tre_otto;
    private javax.swing.JButton tre_otto1;
    private javax.swing.JButton tre_quattro;
    private javax.swing.JButton tre_quattro1;
    private javax.swing.JButton tre_sei;
    private javax.swing.JButton tre_sei1;
    private javax.swing.JButton tre_sette;
    private javax.swing.JButton tre_sette1;
    private javax.swing.JButton tre_tre;
    private javax.swing.JButton tre_tre1;
    private javax.swing.JButton tre_uno;
    private javax.swing.JButton tre_uno1;
    private javax.swing.JButton tre_zero;
    private javax.swing.JButton tre_zero1;
    private javax.swing.JButton uno_cinque;
    private javax.swing.JButton uno_cinque1;
    private javax.swing.JButton uno_due;
    private javax.swing.JButton uno_due1;
    private javax.swing.JButton uno_nove;
    private javax.swing.JButton uno_nove1;
    private javax.swing.JButton uno_otto;
    private javax.swing.JButton uno_otto1;
    private javax.swing.JButton uno_quattro;
    private javax.swing.JButton uno_quattro1;
    private javax.swing.JButton uno_sei;
    private javax.swing.JButton uno_sei1;
    private javax.swing.JButton uno_sette;
    private javax.swing.JButton uno_sette1;
    private javax.swing.JButton uno_tre;
    private javax.swing.JButton uno_tre1;
    private javax.swing.JButton uno_uno;
    private javax.swing.JButton uno_uno1;
    private javax.swing.JButton uno_zero;
    private javax.swing.JButton uno_zero1;
    private javax.swing.JButton zero_cinque;
    private javax.swing.JButton zero_cinque1;
    private javax.swing.JButton zero_due;
    private javax.swing.JButton zero_due1;
    private javax.swing.JButton zero_nove;
    private javax.swing.JButton zero_nove1;
    private javax.swing.JButton zero_otto;
    private javax.swing.JButton zero_otto1;
    private javax.swing.JButton zero_quattro;
    private javax.swing.JButton zero_quattro1;
    private javax.swing.JButton zero_sei;
    private javax.swing.JButton zero_sei1;
    private javax.swing.JButton zero_sette;
    private javax.swing.JButton zero_sette1;
    private javax.swing.JButton zero_tre;
    private javax.swing.JButton zero_tre1;
    private javax.swing.JButton zero_uno;
    private javax.swing.JButton zero_uno1;
    private javax.swing.JButton zero_zero;
    private javax.swing.JButton zero_zero1;
    // End of variables declaration//GEN-END:variables

    private void Comportamento(JButton button) {
        if (fineGioco == 5) {
         for (int j = 0; j < lMat; j++)// riempimento matrice ,disattiva bottoni
         {
         for (int j2 = 0; j2 < lMat; j2++) {
         acqua[j][j2] = 2;
         }
         }
         }
         else {
        boolean clik = click.contains(button);
        if (clik == false)//mosse aumentano solo al primo click
        {
            
            if (limiteMosse.isSelected() == true) {
                click.add(button);
                if (mosse > 0) {
                    mosse--;
                    testomosse.setText(Integer.toString(mosse));
                    if (button.getBackground() == (Color.black)) {
                        fineGioco++;
                    }

                } else if (mosse == 0) {
                    for (int j = 0; j < 5; j++)// riempimento matrice 
                    {
                        for (int j2 = 0; j2 < 5; j2++) {
                            acqua[j][j2] = 2;
                        }
                    }
                }
            } else if (limiteMosse.isSelected() == false) {
                mosse++;
                testomosse.setText(Integer.toString(mosse));
                click.add(button);
                if (button.getBackground() == (Color.black)) {
                    fineGioco++;
                }
            }
            if (button.getBackground() == (Color.black))//assegnameto punti
            {
                punteggio += 5000;
                testoPunti.setText(Integer.toString(punteggio));
            } else {
                punteggio -= 1250;
                testoPunti.setText(Integer.toString((punteggio)));
            }
        }
        if (fineGioco == 5) {
            for (int j = 0; j < lMat; j++)// riempimento matrice 
            {
                for (int j2 = 0; j2 < lMat; j2++) {
                    acqua[j][j2] = 2;
                }
            }
        }

    }
  }
    protected void Colore(int riga,int colonna,JButton button)
    {
        if (acqua[riga][colonna] == 0) {
            button.setBackground(Color.cyan);
        } else if (acqua[riga][colonna] == 1) {
            button.setBackground(Color.black);
        }
    }
    
}

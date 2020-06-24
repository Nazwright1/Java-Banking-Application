/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankingapplication;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author nazwright
 */
class MenuCellRenderer implements ListCellRenderer {

    protected DefaultListCellRenderer defaultRenderer = new DefaultListCellRenderer();
    protected static Border noFocusBorder = new EmptyBorder(15, 1, 1, 1);
protected static TitledBorder focusBorder = new TitledBorder(LineBorder.createGrayLineBorder(),
      "title");
    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        JLabel renderer = (JLabel) defaultRenderer.getListCellRendererComponent(list, value, index,
        isSelected, cellHasFocus);
    renderer.setBorder(cellHasFocus ? focusBorder : noFocusBorder);
    return renderer;
    }
    
}

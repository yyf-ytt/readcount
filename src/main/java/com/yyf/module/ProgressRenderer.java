package com.yyf.module;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

/**
 * Created by andy on 2015/8/10 0010.
 */
public class ProgressRenderer extends DefaultTableCellRenderer {

    private static final long serialVersionUID = 1L;
    //定义滚动条0-100%
    private final JProgressBar jb = new JProgressBar(0, 100);

    /**
     * 构造方法
     */
    public ProgressRenderer() {
        super();
        setOpaque(true);
        jb.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
    }

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Integer i = (Integer) value;
        String text = "完成";
        if (i < 0) {
            //删除
            text = "取消完毕";
        } else if (i < 100) {
            jb.setValue(i);
            return jb;
        }
        super.getTableCellRendererComponent(table, text, isSelected, hasFocus, row, column);
        return this;
    }

}

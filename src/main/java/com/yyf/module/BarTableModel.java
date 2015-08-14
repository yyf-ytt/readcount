package com.yyf.module;

import com.yyf.entity.ColumnContext;
import com.yyf.entity.TableColumn;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by andy on 2015/8/10 0010.
 */
public class BarTableModel extends DefaultTableModel {

    private static final long serialVersionUID = 1L;
    private static final ColumnContext[] columnArray = {
            new ColumnContext("ID", Integer.class, false),
            new ColumnContext("名称", String.class, false),
            new ColumnContext("进度", Integer.class, false)};
    private final Map<Integer, SwingWorker> swmap = new HashMap<Integer, SwingWorker>();
    private int number = 0;

    public void addTest(TableColumn t, SwingWorker worker) {
        Object[] obj = {new Integer(number), t.getName(), t.getProgress()};
        super.addRow(obj);
        swmap.put(number, worker);
        number++;
    }

    public synchronized SwingWorker getSwingWorker(int identifier) {
        Integer key = (Integer) getValueAt(identifier, 0);
        return swmap.get(key);
    }


}

package com.yyf.entity;

/**
 * Created by andy on 2015/8/12 0012.
 */
public class ColumnContext {
    public final String columnName;
    public final Class columnClass;
    public final boolean isEditable;

    public ColumnContext(String columnName, Class columnClass,
                         boolean isEditable) {
        this.columnName = columnName;
        this.columnClass = columnClass;
        this.isEditable = isEditable;
    }

}

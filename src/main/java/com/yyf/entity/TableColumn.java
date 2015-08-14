package com.yyf.entity;

/**
 * Created by andy on 2015/8/10 0010.
 */
public class TableColumn {
    private static final long serialVersionUID = 1L;

    private String name; //名称
    private Integer progress;//滚动条进度
    private String status;//状态 wait running complete

    public TableColumn(String name, Integer progress, String status) {
        this.name = name;
        this.progress = progress;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

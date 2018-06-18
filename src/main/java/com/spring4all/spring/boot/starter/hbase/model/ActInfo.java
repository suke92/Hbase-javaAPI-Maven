package com.spring4all.spring.boot.starter.hbase.model;
import java.util.Map;

public class ActInfo {
    private String rowKey;
    private  int rowNums;
    private Map<String, String> data;

    public String getRowKey() {
        return rowKey;
    }

    public void setRowKey(String rowKey) {
        this.rowKey = rowKey;
    }
    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return super.toString();
    }

    public int getRowNums() {
        return rowNums;
    }

    public void setRowNums(int rowNums) {
        this.rowNums = rowNums;
    }
}

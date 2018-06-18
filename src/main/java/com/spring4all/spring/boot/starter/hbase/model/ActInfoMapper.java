package com.spring4all.spring.boot.starter.hbase.model;

import com.spring4all.spring.boot.starter.hbase.api.RowMapper;
import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.CellUtil;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.util.Bytes;

import java.util.HashMap;
import java.util.Map;

public class ActInfoMapper implements RowMapper<ActInfo>{
    private Map<String, String> map = new HashMap<>();
    @Override
    public ActInfo mapRow(Result result, int rowNum) throws Exception {
        ActInfo actInfo = new ActInfo();
        actInfo.setRowKey(Bytes.toString(result.getRow()));
        actInfo.setRowNums(rowNum);
        for(Cell cell : result.rawCells()){
            map.put(Bytes.toString(CellUtil.cloneQualifier(cell)), Bytes.toString(CellUtil.cloneValue(cell)));
        }
        actInfo.setData(map);
        return actInfo;
    }
}

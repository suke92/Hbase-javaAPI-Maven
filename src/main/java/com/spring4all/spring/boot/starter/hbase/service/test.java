package com.spring4all.spring.boot.starter.hbase.service;

import com.spring4all.spring.boot.starter.hbase.api.HbaseOperations;
import com.spring4all.spring.boot.starter.hbase.api.HbaseTemplate;
import com.spring4all.spring.boot.starter.hbase.api.RowMapper;
import com.spring4all.spring.boot.starter.hbase.model.ActInfo;
import com.spring4all.spring.boot.starter.hbase.model.ActInfoMapper;
import org.apache.hadoop.hbase.client.Result;

import java.util.List;

public class test {
    public String getData(){
        HbaseOperations hbaseOperations = new HbaseTemplate();
        RowMapper<ActInfo> actInfoMapper = new ActInfoMapper();

        List<ActInfo> list= hbaseOperations.getScan("table", "start", "end", actInfoMapper);
        return list.toString();
    }
}

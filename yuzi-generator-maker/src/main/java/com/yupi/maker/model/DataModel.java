package com.yupi.maker.model;

import lombok.Data;

/**
 * 数据模型
 */
@Data
public class DataModel {
    /**
     *
     */
    //模板输入作者名
    private String author;
    //设置输出文本
    private String outputText;
    //是否为循环
    private boolean loop;

}

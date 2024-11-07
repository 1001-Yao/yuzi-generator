package com.yupi.model;

import lombok.Data;

@Data
public class MainTemplateConfig {
    //模板输入作者名
    private String author;
    //设置输出文本
    private String outputText;
    //是否为循环
    private boolean loop;

}

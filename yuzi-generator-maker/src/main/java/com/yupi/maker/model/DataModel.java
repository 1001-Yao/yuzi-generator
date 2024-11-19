package com.yupi.maker.model;

import lombok.Data;

/**
 * 数据模型
 */
@Data
public class DataModel {
    /**
     *核心模板
     */
    //是否为循环
    private boolean loop=false;

    public boolean needGit=true;

    public MainTemplate mainTemplate = new MainTemplate();

    /**
     * 用于生成核心模板文件
     */
    @Data
    public static class MainTemplate {
        /**
         * 作者注释
         */
        public String author = "yupi";

        /**
         * 输出信息
         */
        public String outputText = "sum = ";
    }
}

package com.yupi.maker.generator.main;

public class MainGenerator extends GenerateTemplate {


//    @Override
//    protected void buildDist(String outputPath, String sourceCopyDestPath, String jarPath, String shellOutputFilePath) {
//        super.buildDist(outputPath, sourceCopyDestPath, jarPath, shellOutputFilePath);
//    }


    @Override
    protected String buildDist(String outputPath, String sourceCopyDestPath, String jarPath, String shellOutputFilePath) {
        System.out.println("不要给我输出 dist 啦！");
        return "";
    }


}

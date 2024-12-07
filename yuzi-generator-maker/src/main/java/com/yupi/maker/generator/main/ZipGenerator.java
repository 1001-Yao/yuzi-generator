package com.yupi.maker.generator.main;

import freemarker.template.TemplateException;

import java.io.IOException;

/**
 * 生成代码生成器压缩包
 */
public class ZipGenerator extends GenerateTemplate {
    @Override
    protected String buildDist(String outputPath, String sourceCopyDestPath, String jarPath, String shellOutputFilePath) {
        String buildPath= super.buildDist(outputPath, sourceCopyDestPath, jarPath, shellOutputFilePath);
        return buildZip(buildPath);
    }
}

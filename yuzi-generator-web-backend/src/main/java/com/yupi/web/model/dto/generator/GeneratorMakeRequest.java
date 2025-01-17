package com.yupi.web.model.dto.generator;

import com.yupi.maker.meta.Meta;
import lombok.Data;

import java.io.Serializable;

/**
 * 制作代码生成器请求
 */
@Data
public class GeneratorMakeRequest implements Serializable {

    /**
     * 元数据信息
     */
    private Meta meta;

    /**
     * 上传模板文件压缩包路径
     */
    private String ZipFilePath;

    private static final long serialVersionUID = 1L;
}

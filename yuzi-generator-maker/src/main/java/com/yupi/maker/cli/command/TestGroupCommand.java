package com.yupi.maker.cli.command;


import com.yupi.maker.model.DataModel;
import lombok.Data;
import picocli.CommandLine;

import java.util.concurrent.Callable;

@CommandLine.Command(name = "test", mixinStandardHelpOptions = true)
public class TestGroupCommand implements Runnable {

    @CommandLine.Option(names = {"--needGit"}, arity = "0..1", description = "是否生成 .gitignore 文件", interactive = true, echo = true)
    private boolean needGit = true;

    @CommandLine.Option(names = {"-l", "--loop"}, arity = "0..1", description = "是否生成循环", interactive = true, echo = true)
    private boolean loop = false;

    static DataModel.MainTemplate mainTemplate = new DataModel.MainTemplate();

    @Override
    public void run() {
        System.out.println(needGit);
        System.out.println(loop);
        if (true) {
            System.out.println("输入核心模板配置：");
            CommandLine commandLine = new CommandLine(MainTemplateCommand.class);
            commandLine.execute( "-a", "-o");
            System.out.println(mainTemplate);
        }
        // 需要赋值给 DataModel.java.ftl
//        DataModel.java.ftl dataModel = new DataModel.java.ftl();
//        BeanUtil.copyProperties(this, dataModel);
//        dataModel.mainTemplate = mainTemplate;
//        MainGenerator.java.ftl.doGenerate(dataModel);
    }

    @CommandLine.Command(name = "mainTemplate")
    @Data
    public static class MainTemplateCommand implements Runnable {

        @CommandLine.Option(names = {"--needGit"}, arity = "0..1", description = "是否生成 .gitignore 文件", interactive = true, echo = true)
        private boolean needGit = true;

        @CommandLine.Option(names = {"-l", "--loop"}, arity = "0..1", description = "是否生成循环", interactive = true, echo = true)
        private boolean loop = false;

        static DataModel.MainTemplate mainTemplate = new DataModel.MainTemplate();


        @CommandLine.Option(names = {"-a", "--author"}, arity = "0..1", description = "作者注释", interactive = true, echo = true)
        private String author = "yupi666";

        @CommandLine.Option(names = {"-o", "--outputText"}, arity = "0..1", description = "输出信息", interactive = true, echo = true)
        private String outputText = "the sum = ";

        @Override
        public void run() {
            mainTemplate.author = author;
            mainTemplate.outputText = outputText;
        }
    }

    public static void main(String[] args) {
        CommandLine commandLine = new CommandLine(TestGroupCommand.class);
        commandLine.execute("-l");
      //  commandLine.execute( "--help");
    }
}

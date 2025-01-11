package com.mirror.weblog.admin.runner;

import com.mirror.weblog.admin.service.AdminStatisticsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author: mirror
 * @description:
 **/
@Component
@Slf4j
public class StatisticsTagArticleTotalRunner implements CommandLineRunner {

    @Autowired
    private AdminStatisticsService statisticsService;

    @Override
    @Async("threadPoolTaskExecutor")
    public void run(String... args) throws Exception {
        log.info("==> 开始统计各标签下文章数量...");
        statisticsService.statisticsTagArticleTotal();
        log.info("==> 结束统计各标签下文章数量...");
    }
}
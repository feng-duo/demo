package com.code.basic.log;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author FengDuo
 * @date 2023/1/12 14:43
 */
@Slf4j
@RestController
@RequestMapping("/log")
public class LogController {

    /**
     * 测试logback.xml的scan/scanPeriod定期扫描
     */
    @GetMapping("/log_update")
    public void logUpdate(){
        log.info("info文本:{}", LocalDateTime.now());
        log.debug("debug文本:{}", LocalDateTime.now());
    }
}

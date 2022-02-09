package dev.spider.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4j {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Slf4j.class);
        logger.info("最近我在听 CHANGMO 的 METEOR");
    }
}


package com.kilo;

import org.apache.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProguardBusinessDriver {

    private static Logger LOG = Logger.getLogger(ProguardBusinessDriver.class);

    public static void main(String[] args) throws InterruptedException {
        try (ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "classpath:com/kilo/proguard/logging.xml",
                "classpath:com/kilo/proguard/applicationContext.xml")) {
            LOG.info("Inited");
            // sleep for an hour while we do some playing around
            Thread.sleep(60 * 60 * 1_000);
        }
    }

}

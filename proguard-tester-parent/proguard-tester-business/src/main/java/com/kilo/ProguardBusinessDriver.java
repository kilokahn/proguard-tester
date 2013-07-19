
package com.kilo;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProguardBusinessDriver {

    private static Logger LOG = Logger.getLogger(ProguardBusinessDriver.class);

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext(
                "classpath:com/kilo/proguard/logging.xml",
                "classpath:com/kilo/proguard/applicationContext.xml");
        LOG.info("Inited");
    }

}

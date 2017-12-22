package com.example.spring.basics.springin5steps.cdi;


import org.slf4j.LoggerFactory;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.inject.Singleton;

@Named
@Singleton
public class SomeCDIDAO {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    public SomeCDIDAO() {
        logger.info("-----> This is inside of <SomeCDIDAO>");
    }
}

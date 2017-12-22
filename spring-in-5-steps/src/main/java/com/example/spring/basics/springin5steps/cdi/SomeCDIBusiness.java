package com.example.spring.basics.springin5steps.cdi;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class SomeCDIBusiness {
    SomeCDIDAO someCDIDAO;

    @Inject
    public SomeCDIBusiness(SomeCDIDAO someCDIDAO) {
        this.someCDIDAO = someCDIDAO;
    }

    public SomeCDIDAO getSomeCDIDAO() {
        return someCDIDAO;
    }
}

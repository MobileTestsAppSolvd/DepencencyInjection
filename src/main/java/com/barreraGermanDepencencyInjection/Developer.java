package com.barreraGermanDepencencyInjection;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

//@Named
public class Developer {
    @Inject
    Coffee coffee;

    public String develop(){
        return this.coffee.drink() + "Here we are implementing this approach!!";
    }
}

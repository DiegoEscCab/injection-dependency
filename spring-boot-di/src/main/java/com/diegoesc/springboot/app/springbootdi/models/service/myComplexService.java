package com.diegoesc.springboot.app.springbootdi.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("myComplexService")
public class myComplexService implements IService {
    @Override
    public String operation() {
        return "executing some important complex process...";

    }


}

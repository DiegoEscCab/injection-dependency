package com.diegoesc.springboot.app.springbootdi.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component("mySimpleService")
public class myService implements IService {
    @Override
    public String operation() {
        return "executing some important  simple process...";

    }


}

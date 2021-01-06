/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springteam.groovy.main;

import com.springteam.groovy.domain.Creature;
import com.springteam.groovy.service.CreatureGroovyService;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericGroovyApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 *
 * @author siux
 */

@Component
public class Main {
    
    private final CreatureGroovyService creatureGroovyService;

    @Autowired
    public Main(CreatureGroovyService creatureGroovyService) {
        this.creatureGroovyService = creatureGroovyService;
    }
    
    public void say(){
        System.out.println("Main says.");
    }
    
    
    
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:app-config.xml");
        
        Main main = ctx.getBean(Main.class);
        
        main.say();
        
        Creature c = new Creature();
        
        c.setPrice(BigDecimal.ONE);
        
        main.creatureGroovyService.applyRule(c);
        
        
        System.out.println(c.getPriceCategory());
        
        ctx.close();
    }
}

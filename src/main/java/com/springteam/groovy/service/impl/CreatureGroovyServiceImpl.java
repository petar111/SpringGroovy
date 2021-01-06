/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springteam.groovy.service.impl;

import com.springteam.groovy.domain.Creature;
import com.springteam.groovy.rule.Rule;
import com.springteam.groovy.rule.engine.RuleEngine;
import com.springteam.groovy.rule.factory.RuleFactory;
import com.springteam.groovy.service.CreatureGroovyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author siux
 */
@Service
public class CreatureGroovyServiceImpl implements CreatureGroovyService{

    
    @Autowired
    private RuleEngine ruleEngine;
    
    @Autowired
    private RuleFactory ruleFactory;
    
    @Override
    public void applyRule(Creature creature) {
        Rule rule = ruleFactory.getPriceCategoryRule();
        
        ruleEngine.run(rule, creature);

        System.out.println("Creature");
    }
    
}

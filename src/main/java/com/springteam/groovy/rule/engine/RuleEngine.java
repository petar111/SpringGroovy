/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springteam.groovy.rule.engine;

import com.springteam.groovy.rule.Rule;

/**
 *
 * @author siux
 */
public interface RuleEngine {
    void run(Rule rule, Object o);
}

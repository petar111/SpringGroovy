/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springteam.groovy.rule;

import groovy.lang.Closure;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author siux
 */
public class Rule {
    private boolean singleHit = true;
    private List conditions = new ArrayList();
    private List actions = new ArrayList();
    private List params = new ArrayList();

    public boolean isSingleHit() {
        return singleHit;
    }

    public void setSingleHit(boolean singleHit) {
        this.singleHit = singleHit;
    }

    public List getConditions() {
        return conditions;
    }

    public void setConditions(List conditions) {
        this.conditions = conditions;
    }

    public List getActions() {
        return actions;
    }

    public void setActions(List actions) {
        this.actions = actions;
    }

    public List getParams() {
        return params;
    }

    public void setParams(List params) {
        this.params = params;
    }
    
    
}

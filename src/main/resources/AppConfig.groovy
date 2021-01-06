
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.springteam.groovy.main.Main;
import com.springteam.groovy.service.impl.CreatureGroovyServiceImpl
import com.springteam.groovy.rule.engine.impl.RuleEngineImpl
import com.springteam.groovy.rule.factory.impl.RuleFactoryImpl

beans{
    main Main, ref('creatureGroovyService')
    creatureGroovyService CreatureGroovyServiceImpl{
        ruleEngine = ref('ruleEngine')
        ruleFactory = ref('ruleFactory')
    }
    ruleEngine RuleEngineImpl,
    ruleFactory RuleFactoryImpl
}


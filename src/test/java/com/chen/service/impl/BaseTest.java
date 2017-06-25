package com.chen.service.impl;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/6/25 0025.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
//@TransactionConfiguration(transactionManager = "transactionManager",defaultRollback = true)
//@TestExecutionListeners({})
public class BaseTest extends AbstractTransactionalJUnit4SpringContextTests{
}

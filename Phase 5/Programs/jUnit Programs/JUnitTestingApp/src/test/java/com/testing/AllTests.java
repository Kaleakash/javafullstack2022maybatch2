package com.testing;

import org.junit.jupiter.api.DisplayName;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import com.dao.ProductDao;

//@RunWith(Suite.class)
//@SuiteClasses({})				jUnit 4.x testing suite 

@Suite
@SelectClasses({OperationTest.class,HookMethods.class,ProductDaoTest.class})
@DisplayName(value = "All Test Cases running")
public class AllTests {

}

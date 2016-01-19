package com.microsoft.winme.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.winme.test.model.ui.UserTest;

@RunWith(Suite.class)
@SuiteClasses({UserTest.class})
public class AllTests {

}

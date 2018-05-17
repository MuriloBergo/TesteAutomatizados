package Teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.TestCase;
@RunWith(Suite.class)
@SuiteClasses({TestReverte.class, TestArrayReverse.class})
public class TestAll extends TestCase {

}

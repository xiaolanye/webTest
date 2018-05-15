package test.com.web.test; 

import com.web.test.JunitPlugin;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* JunitPlugin Tester. 
* 
* @author <Authors name> 
* @since <pre>ÎåÔÂ 15, 2018</pre> 
* @version 1.0 
*/ 
public class JunitPluginTest { 

@Before
public void before() throws Exception {
    System.out.println("=====before====");
} 

@After
public void after() throws Exception {
    System.out.println("=====after====");
} 

/** 
* 
* Method: doJunit1(String name) 
* 
*/ 
@Test
public void testDoJunit1() throws Exception {
    JunitPlugin junitPlugin = new JunitPlugin();
    junitPlugin.doJunit1("doJunit1");
}

/** 
* 
* Method: doJunit2(String name) 
* 
*/ 
@Test
public void testDoJunit2() throws Exception {
    JunitPlugin junitPlugin = new JunitPlugin();
    junitPlugin.doJunit1("doJunit2");
}


} 

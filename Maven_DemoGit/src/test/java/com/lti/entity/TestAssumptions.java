package com.lti.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
//Additional suppport while executing
// a failed assumptions results in test being terminated
// when to use---- if test case failed.....don't continue further
//100 lines---10th line error so we need to make it run ahead
class TestAssumptions {
	
	
	 @Test
	    void testOnDev()
	    {
	        System.setProperty("ENV", "DEV");
	        Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")), TestAssumptions::message);
	        System.out.println(" continue execution");
	    }

	    @Test
	    void testOnProd()
	    {
	        System.setProperty("ENV", "PROD");
	        Assumptions.assumeFalse("PROD".equals(System.getProperty("ENV")),TestAssumptions::message);
	        System.out.println(" don't continue execution");
	    }

	    private static String message () {
	        return "TEST Execution Failed :: ";
	    }

}

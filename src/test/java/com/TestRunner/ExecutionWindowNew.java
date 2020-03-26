package com.TestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.TestcaseImplimentation.Tc_1UserLogin;
import com.TestcaseImplimentation.Tc_2ApplyLeave;
import com.TestcaseImplimentation.Tc_3MyLeaveList;

public class ExecutionWindowNew extends Tc_1UserLogin {
public static Tc_2ApplyLeave tcapply=new Tc_2ApplyLeave();
public static Tc_3MyLeaveList tcMyLeaveList=new Tc_3MyLeaveList();
	@Test
	public static void Testexecution() throws IOException
	{
		getbrowser("Chrome");	
		Hrm_Login();
		tcapply.applyleave();
//		tcMyLeaveList.myleaveList();
		
	}
}

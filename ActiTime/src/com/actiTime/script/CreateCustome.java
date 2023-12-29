package com.actiTime.script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actiTime.generic.BaseClass;
import com.actiTime.generic.File;
import com.actiTime.pom.HomePage;
import com.actiTime.pom.OpenTasksPage;

@Listeners(com.actiTime.generic.ListerImpliments.class)
public class CreateCustome extends BaseClass {
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException {
		HomePage h = new HomePage(dr);
		h.setTaskTab();
		File f = new File();
		String name = f.getExcelData("createCustome", 1, 2);
		String descri = f.getExcelData("createCustome", 1, 3);
		OpenTasksPage o = new OpenTasksPage(dr);
		o.getProCusBtn().click();
		o.getCreCus().click();
		o.getCusNameTxbx().sendKeys(name);
		o.getCusDesTxbx().sendKeys(descri);
		o.getDroDowBtn().click();
		o.getCreCusBtn().click();
		String actual = o.getVerify().getText();
		Assert.assertEquals(actual, name);
	}

}

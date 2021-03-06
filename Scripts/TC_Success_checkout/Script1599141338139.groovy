import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl(GlobalVariable.url)

WebUI.click(findTestObject('Checkout/Btn_buy'))

if(WebUI.verifyElementPresent(findTestObject('Checkout/Frame_Buying'), 0) == true){
	WebUI.setText(findTestObject('Checkout/Txt_midtrans_plow'), '10000')
	
	String lbl_total_plow = WebUI.getText(findTestObject('Checkout/Lbl_total_plow'))
	
	if(lbl_total_plow == '10,000'){
		WebUI.verifyElementPresent(findTestObject('Checkout/Lbl_total_plow'), 30)
	}else{
		print("Total Tidak Sesuai")
	}
	WebUI.setText(findTestObject('Checkout/Txt_name'), 'Ronni')
	
	WebUI.setText(findTestObject('Checkout/Txt_email'), 'ronni@gmail.com')
	
	WebUI.setText(findTestObject('Checkout/Txt_phone'), GlobalVariable.phone)
	
	WebUI.setText(findTestObject('Checkout/Txt_city'), 'Bandung')
	
	WebUI.setText(findTestObject('Checkout/Txt_address'), 'Batununggal')
	
	WebUI.setText(findTestObject('Checkout/Txt_postal_code'), '40192')
	
	WebUI.click(findTestObject('Checkout/Btn_Checkout'))
}
else{
	WebUI.click(findTestObject('Checkout/Btn_Checkout'))
	print('error')
}



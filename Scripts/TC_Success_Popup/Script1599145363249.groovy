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



WebUI.click(findTestObject('Popup/Tab_shiping_detail'))

def label_amount1 = WebUI.getText(findTestObject('Popup/Lbl_amount1'))

def label_amount2 = WebUI.getText(findTestObject('Popup/Lbl_amount2'))

if ((label_amount1 == '10,000') && (label_amount2 == '10,000')) {
	WebUI.verifyElementPresent(findTestObject('Popup/Lbl_amount1'), 30)
	WebUI.verifyElementPresent(findTestObject('Popup/Lbl_amount2'), 30)
    println('valid')
} else {
    println('not valid')
}
String nama = "Ronni"
String email = "ronn@gmail.com"
String tlp = "+6281808466410"
String city = "Bandung"
String address = "Batununggal"
String postal_code = "40192"

if(WebUI.getText(findTestObject('Popup/Lbl_name')) == nama){
	WebUI.verifyElementPresent(findTestObject('Popup/Lbl_name'),30)
	print('Nama Sesuai')
}
else{
		print('Nama Tidak Sesuai')
}
if(WebUI.getText(findTestObject('Popup/Lbl_email')) == email){
	WebUI.verifyElementPresent(findTestObject('Popup/Lbl_email'),30)
	print('Email Sesuai')
}
else{
	print('Email Tidak Sesuai')
}

if(WebUI.getText(findTestObject('Popup/Lbl_phone')) == tlp){
	WebUI.verifyElementPresent(findTestObject('Popup/Lbl_phone'),30)
	print('No Telepon Sesuai')
}
else{
	print('No Telepon Tidak Sesuai')
}
String alamat_lengkap = address + " " + city + " " + postal_code

if(WebUI.getText(findTestObject('Popup/Lbl_address')) == alamat_lengkap){
	WebUI.verifyElementPresent(findTestObject('Popup/Lbl_address'),30)
	print('Alamat Sesuai')
}
else{
	print('Alamat tidak Sesuai')
}


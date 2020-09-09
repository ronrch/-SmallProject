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

WebUI.click(findTestObject('Payment/Btn_Continue'))

WebUI.click(findTestObject('Payment/Btn_Credit'))

WebUI.setText(findTestObject('Payment/Txt_number_card'), '4842 1111 1111 1166')

WebUI.setText(findTestObject('Payment/Txt_Expired'), '01/22')

WebUI.setText(findTestObject('Payment/Txt_Input_CVV'), '123')

WebUI.click(findTestObject('Payment/CK_Promo2'))

String phone = '+6281808466410'

String email = 'ronn@gmail.com'

if (WebUI.getText(findTestObject('Payment/Txt_Email')) == GlobalVariable.email) {
    WebUI.verifyElementPresent(findTestObject('Payment/Txt_Email'))
} else {
    print('Email Tidak Sesuai')
}

if (WebUI.getText(findTestObject('Payment/Txt_Phone')) == phone) {
    WebUI.verifyElementPresent(findTestObject('Payment/Txt_Phone'))
} else {
    print('Phone Number Tidak Sesuai')
}

WebUI.click(findTestObject('Payment/Btn_Continue'))

WebUI.click(findTestObject('Payment/Btn_Continue'))


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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('http://www.automationpractice.pl/index.php')

WebUI.click(findTestObject('Create Account/Email Verification/Hyperlink_Sign in'))

WebUI.setText(findTestObject('Create Account/Email Verification/Input_Email Address'), 'QAdata1@test.com')

WebUI.click(findTestObject('Create Account/Email Verification/Button_Create Account'))

WebUI.click(findTestObject('Create Account/Register/RadioButton_Title'))

WebUI.setText(findTestObject('Create Account/Register/Input_FirstName'), 'User')

WebUI.setText(findTestObject('Create Account/Register/Input_LastName'), 'Alpha')

WebUI.setText(findTestObject('Create Account/Register/Input_Password'), 'Pelepens123')

WebUI.selectOptionByValue(findTestObject('Create Account/Register/Select_Day'), '25', true)

WebUI.selectOptionByValue(findTestObject('Create Account/Register/Select_Month'), '12', true)

WebUI.selectOptionByValue(findTestObject('Create Account/Register/Select_Year'), '1996', true)

WebUI.click(findTestObject('Create Account/Register/Button_Register'))


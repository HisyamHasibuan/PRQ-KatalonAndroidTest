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

Mobile.startApplication('/Users/macbookpro/Documents/KatalonProject/Perqara/DemoAppTest-PerqaraTechnicalTest/APK/Android-MyDemoAppRN.1.3.0.build-244.apk', 
    true)

Mobile.tap(findTestObject('Object Repository/Login Page/sidebar-button.hamburger'), 0)

Mobile.tap(findTestObject('Object Repository/Login Page/login-menu.login'), 0)

Mobile.setText(findTestObject('Object Repository/Login Page/login-field.username'), 'bob@example.com', 0)

Mobile.setText(findTestObject('Object Repository/Login Page/login-field.password'), '10203040', 0)

Mobile.tap(findTestObject('Object Repository/Login Page/login-button.login'), 0)


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

WebUI.callTestCase(findTestCase('Verify user successfully login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Checkout Order/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Checkout Order/checkout-button.addtocart'), 0)

Mobile.tap(findTestObject('Object Repository/Checkout Order/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Checkout Order/checkout-button.proceedtocheckout'), 0)

Mobile.setText(findTestObject('Object Repository/Checkout Order/checkout.address-field.fullname'), 'Hisyam Hasibuan', 
    0)

Mobile.setText(findTestObject('Object Repository/Checkout Order/checkout.address-field.street1'), 'St. Woltermongonsidi', 
    0)

Mobile.setText(findTestObject('Object Repository/Checkout Order/checkout.address-field.city'), 'South Jakarta', 0)

Mobile.setText(findTestObject('Object Repository/Checkout Order/checkout.address-field.region'), 'DKI Jakarta', 0)

Mobile.setText(findTestObject('Object Repository/Checkout Order/checkout.address-field.postcode'), '12345', 0)

Mobile.setText(findTestObject('Object Repository/Checkout Order/checkout.address-field.country'), 'Indonesia', 
    0)

Mobile.tap(findTestObject('Object Repository/Checkout Order/checkout-button.topayment'), 0)

Mobile.setText(findTestObject('Object Repository/Checkout Order/checkout.payment-field.fullname'), 'HIsyam Hasibuan', 
    0)

Mobile.setText(findTestObject('Checkout Order/checkout.payment-field.cardnumber'), '9786756453423142', 0)

Mobile.setText(findTestObject('Object Repository/Checkout Order/checkout.payment-field.expirydate'), '03/27', 0)

Mobile.setText(findTestObject('Object Repository/Checkout Order/checkout.payment-field.CVV'), '523', 2)

Mobile.tap(findTestObject('Checkout Order/checkout.payment-button.revieworder'), 0)

Mobile.tap(findTestObject('Checkout Order/checkout.payment-button.revieworder'), 0)

Mobile.tap(findTestObject('Object Repository/Checkout Order/checkout.reveiworder-button.placeorder'), 0)

def complete = Mobile.getText(findTestObject('Object Repository/Checkout Order/android.widget.TextView - Checkout Complete'), 
    0)

Mobile.verifyMatch('Checkout Complete', complete, false)

Mobile.closeApplication()


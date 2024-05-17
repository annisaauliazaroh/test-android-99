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

// Scenario 1

Mobile.startApplication('/Users/annisa/Downloads/android.wdio.native.app.v1.0.8.apk', true)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - (3)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Type something'), 'forms1@99.co', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Switch'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/android.widget.TextView - Click to turn the switch OFF'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Select an item'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.CheckedTextView - webdriver.io is awesome'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Active'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/android.widget.TextView - This button is active'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - OK'), 0)

Mobile.closeApplication()

//Scenario 2

Mobile.startApplication('/Users/annisa/Downloads/android.wdio.native.app.v1.0.8.apk', true)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - (3)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Type something'), 'Form2@99.co', 0)

Mobile.verifyElementExist(findTestObject('Object Repository/android.widget.TextView - Click to turn the switch ON'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Select an item'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.CheckedTextView - This app is awesome'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Active'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/android.widget.TextView - This button is active'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - OK'), 0)

Mobile.closeApplication()


// Scenario 3

Mobile.startApplication('/Users/annisa/Downloads/android.wdio.native.app.v1.0.8.apk', true)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - (3)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Type something'), 'f0rm3@99.co', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Switch'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/android.widget.TextView - Click to turn the switch OFF'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Select an item'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.CheckedTextView - Appium is awesome'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Inactive'), 0)

Mobile.closeApplication()



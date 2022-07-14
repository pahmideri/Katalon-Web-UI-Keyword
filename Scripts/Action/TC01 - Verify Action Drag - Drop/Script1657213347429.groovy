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

'Open Browser\r\n'
WebUI.openBrowser('')

'Navigate to Url \'https://jqueryui.com/\''
WebUI.navigateToUrl('https://jqueryui.com/droppable/')

'Maximize Screen Size'
WebUI.maximizeWindow()

'Scroll to elment Active'
WebUI.scrollToElement(findTestObject('Page_jQuery UI/a_Droppable'), 2)

'Drag to drop'
WebUI.dragAndDropToObject(findTestObject('Page_jQuery UI/div_Drag me to my target'), findTestObject('Page_jQuery UI/div_Drop here'))

'Delay 2 Second untill page web close'
WebUI.delay(2)

'Close Browser'
WebUI.closeBrowser()


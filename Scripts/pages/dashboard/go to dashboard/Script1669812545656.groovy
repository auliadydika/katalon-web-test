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

WebUI.callTestCase(findTestCase("Test Cases/pages/login/login valid"), null)

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index')

WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/txt_timeatwork'))
WebUI.verifyElementText(findTestObject("Object Repository/dashboard/txt_timeatwork"), "Time at Work")

WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/txt_myactions'))
WebUI.verifyElementText(findTestObject("Object Repository/dashboard/txt_myactions"), "My Actions")

WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/txt_quicklaunch'))
WebUI.verifyElementText(findTestObject("Object Repository/dashboard/txt_quicklaunch"), "Quick Launch")

WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/txt_employeesleave'))
WebUI.verifyElementText(findTestObject("Object Repository/dashboard/txt_employeesleave"), "Employees on Leave Today")

WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/txt_subunit'))
WebUI.verifyElementText(findTestObject("Object Repository/dashboard/txt_subunit"), "Employee Distribution by Sub Unit")

WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/txt_location'))
WebUI.verifyElementText(findTestObject("Object Repository/dashboard/txt_location"), "Employee Distribution by Location")



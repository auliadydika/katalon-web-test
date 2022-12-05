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

//login
WebUI.callTestCase(findTestCase("Test Cases/pages/login/login valid"), null)

//direct to dashboard
WebUI.callTestCase(findTestCase('Test Cases/pages/dashboard/go to dashboard'), null)

//click admin
WebUI.click(findTestObject('Object Repository/side panel/btn_admin'))

//direct to admin page
WebUI.verifyElementVisible(findTestObject('Object Repository/admin/txt_admin'))

//verify admin page
WebUI.verifyElementText(findTestObject('Object Repository/admin/txt_admin'), 'Admin')

//verify dropdown
WebUI.verifyElementVisible(findTestObject('Object Repository/admin/dropdown/user management/btn_management'))
WebUI.verifyElementText(findTestObject('Object Repository/admin/dropdown/user management/btn_management'), 'User Management')

WebUI.verifyElementVisible(findTestObject('Object Repository/admin/dropdown/qualifications/btn_qualifications'))
WebUI.verifyElementText(findTestObject('Object Repository/admin/dropdown/qualifications/btn_qualifications'), 'Qualifications')

WebUI.verifyElementVisible(findTestObject('Object Repository/admin/dropdown/organization/btn_organization'))
WebUI.verifyElementText(findTestObject('Object Repository/admin/dropdown/organization/btn_organization'), 'Organization')

WebUI.verifyElementVisible(findTestObject('Object Repository/admin/dropdown/nationalities/btn_nationalities'))
WebUI.verifyElementText(findTestObject('Object Repository/admin/dropdown/nationalities/btn_nationalities'), 'Nationalities')

WebUI.verifyElementVisible(findTestObject('Object Repository/admin/dropdown/job/btn_job'))
WebUI.verifyElementText(findTestObject('Object Repository/admin/dropdown/job/btn_job'), 'Job')

WebUI.verifyElementVisible(findTestObject('Object Repository/admin/dropdown/corporate branding/btn_branding'))
WebUI.verifyElementText(findTestObject('Object Repository/admin/dropdown/corporate branding/btn_branding'), 'Corporate Branding')

WebUI.verifyElementVisible(findTestObject('Object Repository/admin/dropdown/configuration/btn_configuration'))
WebUI.verifyElementText(findTestObject('Object Repository/admin/dropdown/configuration/btn_configuration'), 'Configuration')

//click dropdown users
WebUI.click(findTestObject('Object Repository/admin/dropdown/user management/btn_management'))
WebUI.click(findTestObject('Object Repository/admin/dropdown/user management/btn_user'))

WebUI.closeBrowser()





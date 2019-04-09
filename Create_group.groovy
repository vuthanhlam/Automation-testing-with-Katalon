import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://hoclieu.sachmem.vn/folder/0')

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_ng nhp'))

WebUI.setText(findTestObject('Page_ng nhp  Sch Mm/input_a ch email_useremail'), 'lam9a1yb@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_ng nhp  Sch Mm/input_Mt khu_userpassword'), 'xY+SMxDLnc28ILza2E7vYQ==')

WebUI.click(findTestObject('Page_ng nhp  Sch Mm/input_Qun mt khu_commit'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_Lp hc ca ti'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_12A'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_Danh sch ngi hc'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/label_Hot ng_custom-control-label'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_To nhm'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_Tn nhm'))

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input_Tn nhm_form-control ng-touched ng-dirty ng-valid'), 
    'Học thêm')

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input_Tn nhm_btn btn-primary'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_To nhm thnh cng'))

WebUI.closeBrowser()


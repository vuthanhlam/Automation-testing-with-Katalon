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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://hoclieu.sachmem.vn')

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_ng nhp'))

WebUI.setText(findTestObject('Page_ng nhp  Sch Mm/input_a ch email_useremail'), 'lam9a1yb@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_ng nhp  Sch Mm/input_Mt khu_userpassword'), 'xY+SMxDLnc28ILza2E7vYQ==')

WebUI.click(findTestObject('Page_ng nhp  Sch Mm/input_Qun mt khu_commit'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_Lp 12'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_Trc nghim Gio dc cng dn 12 (2018)'))

WebUI.click(findTestObject('Page_Hc liu - Sch Mm/i_Lm c bi_fa fa-users'))

WebUI.click(findTestObject('Page_Hc liu - Sch Mm/div_Chn lp hc'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_12A'))

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input_Thi gian lm bi (pht)_form-control ng-untouched ng-valid ng-dirty'), 
    '30')

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input_Ngy gi bt u_form-control ng-untouched ng-pristine ng-valid'), 
    '10/04/2019')

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input_Ngy gi kt thc_form-control ng-untouched ng-pristine ng-valid'), 
    '15/04/2019')

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input__btn btn-primary'))

WebUI.verifyElementVisible(findTestObject('Page_Hc liu - Sch Mm/div_Giao bi tp thnh cng'))

WebUI.closeBrowser()


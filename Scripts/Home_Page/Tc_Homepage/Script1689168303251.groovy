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

Mobile.startApplication('D:\\DATA YESSI\\BELAJAR\\Belajar QA !!!\\KATALON CLASS\\Test Mobile\\lbs_staging_android.apk', 
    false)

Mobile.tap(findTestObject('Object Repository/Home_page/android.widget.TextView - Home'), 0)

Mobile.verifyElementText(findTestObject('Home_page/android.widget.TextView - Tester Digima'), 'Tester Digima')

Mobile.tap(findTestObject('Home_page/android.widget.TextView - Chat1'), 0)

Mobile.verifyElementText(findTestObject('Home_page/android.view.View - Chat'), 'Chat')

Mobile.tap(findTestObject('Object Repository/Home_page/android.widget.Button_Notifikasi'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Home_page/android.widget.TextView - Learning'), 'Learning', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Home_page/android.widget.TextView - btn_setting'), 0)

Mobile.verifyElementText(findTestObject('Home_page/android.widget.TextView - Settings'), 'Settings')

Mobile.tap(findTestObject('Home_page/android.widget.TextView - btnback_setting'), 0)

Mobile.tap(findTestObject('Object Repository/Home_page/android.widget.ImageView_More'), 0)

Mobile.tap(findTestObject('Home_page/android.view.ViewGroup_ContentLibrary'), 0)

Mobile.verifyElementText(findTestObject('Home_page/android.view.View - Content Library (1)'), 'Content Library')

Mobile.tap(findTestObject('Home_page/android.widget.ImageView_btn_back'), 0)

Mobile.tap(findTestObject('Object Repository/Home_page/android.widget.ImageView_More'), 0)

Mobile.tap(findTestObject('Home_page/android.view.ViewGroup_TeamMonitoring'), 0)

Mobile.verifyElementText(findTestObject('Home_page/android.view.View - Team Monitoring'), 'Team Monitoring')

Mobile.tap(findTestObject('Home_page/android.widget.ImageView_btn_back'), 0)

Mobile.tap(findTestObject('Object Repository/Home_page/android.widget.ImageView_More'), 0)

Mobile.tap(findTestObject('Home_page/android.view.ViewGroup_Reviews'), 0)

Mobile.verifyElementText(findTestObject('Home_page/android.view.View - Reviews'), 'Reviews')

Mobile.tap(findTestObject('Home_page/android.widget.ImageView_btn_back'), 0)

Mobile.tap(findTestObject('Object Repository/Home_page/android.widget.ImageView_More'), 0)

Mobile.tap(findTestObject('Object Repository/Home_page/android.widget.ImageView_Clear_Modules'), 0)

Mobile.tap(findTestObject('Home_page/android.view.ViewGroup_cancel'), 0)

Mobile.tap(findTestObject('Object Repository/Home_page/android.widget.ImageView_More'), 0)

Mobile.tap(findTestObject('Home_page/android.view.ViewGroup_btnprogressingmodul'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Home_page/android.widget.TextView - From Journey'), 'From Journey')

Mobile.verifyElementText(findTestObject('Object Repository/Home_page/android.widget.TextView - From Library'), 'From Library')

Mobile.tap(findTestObject('Home_page/android.widget.ImageView_btn_back'), 0)

Mobile.tap(findTestObject('Object Repository/Home_page/android.widget.ImageView_More'), 0)

Mobile.tap(findTestObject('Home_page/android.widget.ImageView_RewardPoint'), 0)

Mobile.verifyElementText(findTestObject('Home_page/android.widget.TextView - Program List'), 'Program List')

Mobile.tap(findTestObject('Home_page/android.view.ViewGroup-TDANC'), 0)

Mobile.tap(findTestObject('Object Repository/Home_page/android.widget.ImageView_btn_back'), 0)

Mobile.tap(findTestObject('Object Repository/Home_page/android.widget.ImageView_More'), 0)

Mobile.tap(findTestObject('Home_page/android.view.ViewGroup_LearningSupport'), 0)

Mobile.verifyElementText(findTestObject('Home_page/android.widget.TextView - Text My tickets'), 'My tickets')

Mobile.tap(findTestObject('Home_page/android.widget.ImageButton_myticket'), 0)

Mobile.closeApplication()


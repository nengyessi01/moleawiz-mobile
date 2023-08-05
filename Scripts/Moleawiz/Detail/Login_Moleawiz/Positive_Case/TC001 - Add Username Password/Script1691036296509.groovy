import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('D:\\DATA YESSI\\BELAJAR\\Belajar QA !!!\\KATALON CLASS\\Test Mobile\\lbs_staging_android.apk', 
    true)

Mobile.setText(findTestObject('login_moleawiz/TC_002_Login2/android.widget.EditText - Username'), 'tester@digimasia.com', 
    0)

Mobile.setText(findTestObject('login_moleawiz/TC_002_Login2/android.widget.EditText - Password'), 'Test3rDigim@', 0)

Mobile.tap(findTestObject('login_moleawiz/TC_002_Login2/android.view.ViewGroup-btnLogin'), 0)

Mobile.verifyElementText(findTestObject('login_moleawiz/TC_002_Login2/android.widget.TextView - Welcome to MoLeaWiz'), 'Welcome to MoLeaWiz')

Mobile.tap(findTestObject('login_moleawiz/TC_002_Login2/android.widget.TextView - button next'), 0)

Mobile.verifyElementText(findTestObject('login_moleawiz/TC_002_Login2/android.widget.TextView - How to Learn'), 'How to Learn')

Mobile.tap(findTestObject('login_moleawiz/TC_002_Login2/android.widget.TextView - button next'), 0)

Mobile.verifyElementText(findTestObject('login_moleawiz/TC_002_Login2/android.widget.TextView - Experience the Difference'), 
    'Experience the Difference!')

Mobile.tap(findTestObject('login_moleawiz/TC_002_Login2/android.widget.TextView - button next'), 0)

Mobile.verifyElementText(findTestObject('login_moleawiz/TC_002_Login2/android.widget.TextView - Dont Worry'), 'Don\'t Worry!')

Mobile.tap(findTestObject('login_moleawiz/TC_002_Login2/android.widget.TextView - DONE'), 0)

Mobile.verifyElementVisible(findTestObject('login_moleawiz/TC_002_Login2/android.view.ViewGroup - Home Object'), 0)

Mobile.closeApplication()


package Automation_RunnerPack;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.Automation_pomanger.Automation_Manger;
import com.configuration.helper.File_Reader_Manager;

import Base_Package.Base_Class;

public class Automation_Singletton extends Base_Class {
	public static WebDriver driver = browser_Configuration("chrome");
	public static Automation_Manger pom = new Automation_Manger(driver);
	public static Logger log=Logger.getLogger(AutomationDataDriven_Log.class);
	public static void main(String[] args) throws Exception{
		PropertyConfigurator.configure("log4j.properties");
		wait(10, TimeUnit.SECONDS);
		String url=File_Reader_Manager.get_Instance_Frm().get_Instance_CR().get_confi_url();
		getUrl(url);
		log.info("Url Launch");
		clickOnElement(pom.get_Hp().getLogin());
		String userid=File_Reader_Manager.get_Instance_Frm().get_Instance_CR().get_confi_email();
		inputValueElement(pom.get_Login().getEmail(),userid );
		String passwrd=File_Reader_Manager.get_Instance_Frm().get_Instance_CR().get_confi_passwrd();
		inputValueElement(pom.get_Login().getPassword(),passwrd );
		clickOnElement(pom.get_Login().getSubmitbtn());
		clickOnElement(pom.get_Women().getWomen());
		javaScript();
		clickOnElement(pom.get_Img().getImge());
		clickOnElement(pom.get_Cart().getCart());
		clickOnElement(pom.get_Btn1().getBtn1());
		clickOnElement(pom.get_Btn2().getBtn2());
		clickOnElement(pom.get_Btn3().getBtn3());
		clickOnElement(pom.get_Process().getCheckBox());
		clickOnElement(pom.get_Process().getProcessbtn());
		clickOnElement(pom.get_Cheq().getCheqq());
		clickOnElement(pom.get_Submit().getSubmitbtn());
		clickOnElement(pom.get_Order().getConform());
		clickOnElement(pom.get_Logout().getLogoff());
		log.info("Thank You ,Your Order Arriving Soon");
		close();

	}


}

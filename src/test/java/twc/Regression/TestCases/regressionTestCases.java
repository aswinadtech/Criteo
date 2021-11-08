package twc.Regression.TestCases;

import java.io.File;

import org.openqa.selenium.internal.Killable;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

import twc.Regression.HandleWithCharles.CharlesProxy;

//import twc.Automation.HandleMapLocal.MapLocalFunctions;
import twc.Regression.CustomParamValidation.CustomParamFunctions;
import twc.Regression.CustomParamValidation.validate_CustomParameter;
import twc.Regression.Driver.Drivers;
import twc.Regression.General.Functions;
import twc.Regression.General.TwcAndroidBaseTest;
import twc.Regression.HandleWithAppium.AppiumFunctions;
import twc.Regression.HandleWithCharles.CharlesFunctions;
import twc.Regression.ReadDataFromFile.read_excel_data;
import twc.Regression.utils.DeleteFiles;

public class regressionTestCases extends TwcAndroidBaseTest {
	
	public static String CurrentWifiName=null;
	
	private static final String CONFIG_FILE_PATH = "charles_common.config";

	private static final String BN_SEVERE1_CONFIG_FILE_PATH = "BNSevere1charles_common.config";
	private static final String BN_SEVERE2_CONFIG_FILE_PATH = "BNSevere2charles_common.config";
	private static final String CRITEO_CONFIG_FILE_PATH = "Criteocharles_common.config";
	private static final String CRITEO_NONUS_CONFIG_FILE_PATH = "CriteoNonUScharles_common.config";
	// public static CharlesProxy proxy;
	public File configFile;
	private CharlesProxy proxy;

	
	/*
	 * This method validates Amazon SDK version
	 */
	@Test(priority = 0, enabled = true)
	@Description("Validating 'adsdk' parameter of Amazon aax call ")
	public void Validate_Amazon_SDK_adsdk_parameter() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating Amazon SDK version i.e. 'adsdk' parameter of Amazon aax call");
		logStep("****** Validating Amazon SDK version i.e. 'adsdk' parameter of Amazon aax call");
		CharlesFunctions.createXMLFileForCharlesSessionFile();
		Functions.validate_Amazon_aax_call_parameter("Amazon", "adsdk","aps-android-9.1.0");

	}

	
	
	@Test(priority = 1, enabled = true)
	@Description("Verify Feed1 ad call amazon bid id")
	public void Verify_Feed1_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Feed1 ad call amazon bid id ====================");

		System.out.println("****** Feed1 ad call amazon bid id validation Started");
		logStep("****** Feed1 ad call amazon bid id validation Started");
	  Functions.validate_aax_bid_value_with_gampad_bid_value("Feed1", true);
		//Functions.verifyAAX_SlotId("Feed1");
	}
	
	
	
	@Test(priority = 2, enabled = true)
	@Description("Verify Feed2 ad call amazon bid id")
	public void Verify_Feed2_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Feed2 ad call amazon bid id ====================");
		System.out.println("****** Feed2 ad call amazon bid id validation Started");
		logStep("****** Feed2 ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value("Feed2", true);
	}
	
	@Test(priority = 3, enabled = true)
	@Description("Verify Feed3 ad call amazon bid id")
	public void Verify_Feed3_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Feed3 ad call amazon bid id ====================");

		System.out.println("****** Feed3 ad call amazon bid id validation Started");
		logStep("****** Feed3 ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value( "Feed3", true);
	}
	
	
	@Test(priority = 4, enabled = true)
	@Description("Verify Feed4 ad call amazon bid id")
	public void Verify_Feed4_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Feed4 ad call amazon bid id ====================");

		System.out.println("****** Feed4 ad call amazon bid id validation Started");
		logStep("****** Feed4 ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value("Feed4", true);
	}
	
	
	@Test(priority = 21, enabled = true)
	@Description("Verify Feed5 ad call amazon bid id")
	public void Verify_Feed5_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Feed5 ad call amazon bid id ====================");

		System.out.println("****** Feed5 ad call amazon bid id validation Started");
		logStep("****** Feed5 ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value("Feed5", true);
	}
	
	
	
	@Test(priority = 5, enabled = true)
	@Description("Verify Hourly Details ad call amazon bid id")
	public void Verify_Hourly_Details_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Hourly Details ad call amazon bid id ====================");

		System.out.println("****** Hourly Details ad call amazon bid id validation Started");
		logStep("****** Hourly Details ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value( "Hourly", true);
	}
	
	
	
	
	@Test(priority = 7, enabled = true)
	@Description("Verify Hourly1 Details ad call amazon bid id")
	public void Verify_Hourly1_Details_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Hourly1 Details ad call amazon bid id ====================");

		System.out.println("****** Hourly1 Details ad call amazon bid id validation Started");
		logStep("****** Hourly1 Details ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value( "Hourly1", true);
	}
	
	
	@Test(priority = 8, enabled = true)
	@Description("Verify Hourly2 Details ad call amazon bid id")
	public void Verify_Hourly2_Details_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Hourly2 Details ad call amazon bid id ====================");

		System.out.println("****** Hourly2 Details ad call amazon bid id validation Started");
		logStep("****** Hourly2 Details ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value( "Hourly2", true);
	}
	
	@Test(priority = 9, enabled = true)
	@Description("Verify Hourly3 Details ad call amazon bid id")
	public void Verify_Hourly3_Details_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Hourly3 Details ad call amazon bid id ====================");

		System.out.println("****** Hourly1 Details ad call amazon bid id validation Started");
		logStep("****** Hourly3 Details ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value( "Hourly3", true);
	}
	
	
	
	
	@Test(priority = 10, enabled = true)
	@Description("Verify Daily Details ad call amazon bid id")
	public void Verify_Daily_Details_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Daily Details ad call amazon bid id ====================");

		System.out.println("****** Daily Details ad call amazon bid id validation Started");
		logStep("****** Daily Details ad call amazon bid id validation Started");
Functions.validate_aax_bid_value_with_gampad_bid_value("Daily(10day)", true);
	}
	
	
	

	@Test(priority = 12, enabled = true)
	@Description("Verify Map Details ad call amazon bid id")
	public void Verify_Map_Details_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Map Details ad call amazon bid id ====================");

		System.out.println("****** Map Details ad call amazon bid id validation Started");
		logStep("****** Map Details ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value("Map", true);
	}
	
	
	
	
	
	@Test(priority = 14, enabled = true)
	@Description("Verify Today Details ad call amazon bid id")
	public void Verify_Today_Details_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Today Details ad call amazon bid id ====================");

		System.out.println("****** Today Details ad call amazon bid id validation Started");
		logStep("****** Today Details ad call amazon bid id validation Started");
	Functions.validate_aax_bid_value_with_gampad_bid_value("Today", true);
	}
	
	
	
	@Test(priority = 15, enabled = true)
	@Description("Verify AQ Details ad call amazon bid id")
	public void Verify_AQ_Details_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== AQ Details ad call amazon bid id ====================");

		System.out.println("****** AQ Details ad call amazon bid id validation Started");
		logStep("****** AQ Details ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value("Air Quality(Content)", true);
	}
	
	
	
	
	

	@Test(priority = 17, enabled = true)
	@Description("Verify AlertCenter ad call amazon bid id")
	public void Verify_AlertCenter_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== AlertCenter ad call amazon bid id ====================");

		System.out.println("****** AlertCenter ad call amazon bid id validation Started");
		logStep("****** AlertCenter ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value("MyAlerts", true);

	}
	
	
	
	


	@Test(priority = 19, enabled = true)
	@Description("Verify Health Boat & Beach Details ad call amazon bid id")
	public void Verify_Health_BoatAndBeach_Details_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Health Boat & Beach Details ad call amazon bid id ====================");

		System.out.println("****** Health Boat & Beach Details ad call amazon bid id validation Started");
		logStep("****** Health Boat & Beach Details ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value("Health(boatAndBeach)", true);
	}

		@Test(priority = 20, enabled = true)
	@Description("Verify amazon aax Seasonal Hub Details ad call")
	public void Verify_amazon_aax_SeasonalHub_details_adcall() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== amazon aax Seasonal Hub Details ad call ====================");

		System.out.println("****** amazon aax Seasonal Hub Details ad call validation Started");
		logStep("****** amazon aax Seasonal Hub Details ad call validation Started");

		// Functions.verifyAAX_SlotId("Smoke", "Daily(10day)");
		Functions.validate_aax_bid_value_with_gampad_bid_value("SeasonalHub(Details)", true);

	}
	


	@Test(priority = 22, enabled = true)
	@Description("Verify Health Running Details ad call amazon bid id")
	public void Verify_Health_Running_Details_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Health Running Details ad call amazon bid id ====================");

		System.out.println("****** Health Running Details ad call amazon bid id validation Started");
		logStep("****** Health Running Details ad call amazon bid id validation Started");
		CharlesFunctions.archive_folder("Charles");
		Functions.validate_aax_bid_value_with_gampad_bid_value("Health(goRun)", true);
		Thread.sleep(100000);
	}
	
	
	@Test(priority = 162, enabled = true)
	@Description("Verify Criteo SDK config app call")
	public void Verify_Criteo_SDK_config_app_Call() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Criteo SDK config/app call ====================");

		System.out.println("****** Criteo SDK config/app call validation Started");
		logStep("****** Criteo SDK config/app call validation Started");

		CharlesFunctions.createXMLFileForCharlesSessionFile();
	Functions.verifyCriteo_config_app_Call("Criteo");

	//Functions.verifyCriteo_config_app_Call("Criteo", false);
	}
	
	
		
	@Test(priority = 163, enabled = true)
	@Description("Verify Criteo SDK inapp v2 call")
	public void Verify_Criteo_SDK_inapp_v2_Call() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Criteo SDK inapp/v2 call ====================");

		System.out.println("****** Criteo SDK inapp/v2 call validation Started");
		logStep("****** Criteo SDK inapp/v2 call validation Started");

	Functions.verifyCriteo_inapp_v2_Call("Criteo");
	//Functions.verifyCriteo_inapp_v2_Call("Criteo", false);

	}
	
	

	
		@Test(priority = 164, enabled = true)
	@Description("Validating 'cpId' parameter of Criteo SDK config app call")
	public void Validate_Criteo_SDK_config_app_Call_cpId_parameter() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating 'cpId' parameter of Criteo SDK config app call");
		logStep("****** Validating 'cpId' parameter of Criteo SDK config app call");
		Functions.validate_Criteo_SDK_config_app_call_parameter("Criteo", "cpId", "B-051673");

	}
	@Test(priority = 166, enabled = true)
	@Description("Validating 'bundleId' parameter of Criteo SDK config app call ")
	public void Validate_Criteo_SDK_config_app_Call_bundleId_parameter() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating 'bundleId' parameter of Criteo SDK config app call");
		logStep("****** Validating 'bundleId' parameter of Criteo SDK config app call");
		Functions.validate_Criteo_SDK_config_app_call_parameter("Criteo", "bundleId", "com.weather.Weather");

	}
	
	@Test(priority = 168, enabled = true)
	@Description("Validating 'sdkVersion' parameter of Criteo SDK config app call ")
	public void Validate_Criteo_SDK_config_app_Call_sdkVersion_parameter() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating 'sdkVersion' parameter of Criteo SDK config app call");
		logStep("****** Validating 'sdkVersion' parameter of Criteo SDK config app call");
		Functions.validate_Criteo_SDK_config_app_call_parameter("Criteo", "sdkVersion", "4.4.0");

	}
	
		/*@Test(priority = 169, enabled = true)
	@Description("Verify cpm parameter of Criteo SDK inapp v2 call with homescreen hourly call")
	public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_homescreen_hourly_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call cpm parameter with homescreen hourly call====================");

		System.out.println(
				"****** Criteo SDK invapp v2 call cpm parameter with homescreen hourly call validation Started");
		logStep("****** Criteo SDK invapp v2 call cpm parameter with homescreen hourly call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Pulltorefresh", "cpm",true);
	}

	@Test(priority = 170, enabled = true)
	@Description("Verify size parameter of Criteo SDK inapp v2 call with homescreen hourly call")
	public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_homescreen_hourly_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call size parameter with homescreen hourly call====================");

		System.out.println(
				"****** Criteo SDK invapp v2 call size parameter with homescreen hourly call validation Started");
		logStep("****** Criteo SDK invapp v2 call size parameter with homescreen hourly call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Pulltorefresh", "size",true);
	}

	@Test(priority = 172, enabled = true)
	@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with homescreen hourly call")
	public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_homescreen_hourly_gampad_call()
			throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call displayUrl parameter with homescreen hourly call====================");

		System.out.println(
				"****** Criteo SDK invapp v2 call displayUrl parameter with homescreen hourly call validation Started");
		logStep("****** Criteo SDK invapp v2 call displayUrl parameter with homescreen hourly call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Pulltorefresh","displayUrl", true);
	}*/

	
	
	
	

	

	
	@Test(priority = 174, enabled = true)
	@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Feed1 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_Feed1_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call cpm parameter with  Feed1 call====================");

		System.out.println("****** Criteo SDK invapp v2 call cpm parameter with  Feed1 validation Started");
		logStep("****** Criteo SDK invapp v2 call cpm parameter with Feed1 call validation Started");

		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed1", "cpm", true);
	}

	@Test(priority = 176, enabled = true)
	@Description("Verify size parameter of Criteo SDK inapp v2 call with Feed1 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_Feed1_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call size parameter with Feed1 call====================");

		System.out.println("****** Criteo SDK invapp v2 call size parameter with Feed1 call validation Started");
		logStep("****** Criteo SDK invapp v2 call size parameter with Feed1 call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed1", "size", true);
	}

	@Test(priority = 178, enabled = true)
	@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Feed1 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_Feed1_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call displayUrl parameter with Feed1 call====================");

		System.out.println("****** Criteo SDK invapp v2 call displayUrl parameter with Feed1 call validation Started");
		logStep("****** Criteo SDK invapp v2 call displayUrl parameter with Feed1 call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed1", "displayUrl",true);
	}
	
	
	
	
	
	@Test(priority = 180, enabled = true)
	@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Feed2 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_Feed2_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call cpm parameter with  Feed2 call====================");

		System.out.println("****** Criteo SDK invapp v2 call cpm parameter with  Feed2 validation Started");
		logStep("****** Criteo SDK invapp v2 call cpm parameter with Feed2 call validation Started");

		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed2", "cpm", true);
	}

	@Test(priority = 182, enabled = true)
	@Description("Verify size parameter of Criteo SDK inapp v2 call with Feed2 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_Feed2_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call size parameter with Feed2 call====================");

		System.out.println("****** Criteo SDK invapp v2 call size parameter with Feed2 call validation Started");
		logStep("****** Criteo SDK invapp v2 call size parameter with Feed2 call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed2", "size", true);
	}

	@Test(priority = 184, enabled = true)
	@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Feed2 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_Feed2_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call displayUrl parameter with Feed2 call====================");

		System.out.println("****** Criteo SDK invapp v2 call displayUrl parameter with Feed2 call validation Started");
		logStep("****** Criteo SDK invapp v2 call displayUrl parameter with Feed2 call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed2", "displayUrl",true);
	}
	
	
	@Test(priority = 186, enabled = true)
	@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Feed3 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_Feed3_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call cpm parameter with  Feed3 call====================");

		System.out.println("****** Criteo SDK invapp v2 call cpm parameter with  Feed3 validation Started");
		logStep("****** Criteo SDK invapp v2 call cpm parameter with Feed3 call validation Started");

		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed3", "cpm", true);
	}

	@Test(priority = 188, enabled = true)
	@Description("Verify size parameter of Criteo SDK inapp v2 call with Feed3 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_Feed3_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call size parameter with Feed3 call====================");

		System.out.println("****** Criteo SDK invapp v2 call size parameter with Feed3 call validation Started");
		logStep("****** Criteo SDK invapp v2 call size parameter with Feed3 call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed3", "size", true);
	}

	@Test(priority = 190, enabled = true)
	@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Feed3 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_Feed3_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call displayUrl parameter with Feed3 call====================");

		System.out.println("****** Criteo SDK invapp v2 call displayUrl parameter with Feed3 call validation Started");
		logStep("****** Criteo SDK invapp v2 call displayUrl parameter with Feed3 call validation Started");
		
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed3", "displayUrl",true);
	}

	
	
	
	@Test(priority = 192, enabled = true)
	@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Feed4 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_Feed4_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call cpm parameter with  Feed4 call====================");

		System.out.println("****** Criteo SDK invapp v2 call cpm parameter with  Feed4 validation Started");
		logStep("****** Criteo SDK invapp v2 call cpm parameter with Feed4 call validation Started");

		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value( "Feed4", "cpm", true);
	}

	@Test(priority = 194, enabled = true)
	@Description("Verify size parameter of Criteo SDK inapp v2 call with Feed4 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_Feed4_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call size parameter with Feed4 call====================");

		System.out.println("****** Criteo SDK invapp v2 call size parameter with Feed4 call validation Started");
		logStep("****** Criteo SDK invapp v2 call size parameter with Feed4 call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed4", "size", true);
	}

	@Test(priority = 196, enabled = true)
	@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Feed4 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_Feed4_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call displayUrl parameter with Feed4 call====================");

		System.out.println("****** Criteo SDK invapp v2 call displayUrl parameter with Feed4 call validation Started");
		logStep("****** Criteo SDK invapp v2 call displayUrl parameter with Feed4 call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed4", "displayUrl",true);
	}
	
	
	
	@Test(priority = 198, enabled = true)
	@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Feed5 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_Feed5_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call cpm parameter with  Feed5 call====================");

		System.out.println("****** Criteo SDK invapp v2 call cpm parameter with  Feed5 validation Started");
		logStep("****** Criteo SDK invapp v2 call cpm parameter with Feed5 call validation Started");

		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value( "Feed5", "cpm", true);
	}

	@Test(priority = 200, enabled = true)
	@Description("Verify size parameter of Criteo SDK inapp v2 call with Feed5 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_Feed5_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call size parameter with Feed5 call====================");

		System.out.println("****** Criteo SDK invapp v2 call size parameter with Feed5 call validation Started");
		logStep("****** Criteo SDK invapp v2 call size parameter with Feed5 call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value( "Feed5", "size", true);
	}

	@Test(priority = 202, enabled = true)
	@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Feed5 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_Feed5_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call displayUrl parameter with Feed5 call====================");

		System.out.println("****** Criteo SDK invapp v2 call displayUrl parameter with Feed5 call validation Started");
		logStep("****** Criteo SDK invapp v2 call displayUrl parameter with Feed5 call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed5", "displayUrl",true);
	}
	
	
	

	@Test(priority = 208, enabled = true)
@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Hourly Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_hourly_details_gampad_call() throws Exception {

	System.out.println("****** Criteo SDK invapp v2 call cpm parameter of Hourly Details validation Started");
	logStep("****** Criteo SDK invapp v2 call cpm parameter of Hourly Details validation Started");
    Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly", "cpm", true);
}

@Test(priority = 210, enabled = true)
@Description("Verify size parameter of Criteo SDK inapp v2 call with Hourly Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_hourly_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println("=========================== Criteo SDK invapp v2 call size parameter ====================");

	System.out.println("****** Criteo SDK invapp v2 call size parameter of Hourly Details validation Started");
	logStep("****** Criteo SDK invapp v2 call size parameter of Hourly Details validation Started");
Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly", "size", true);
}
@Test(priority = 212, enabled = true)
@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Hourly Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_hourly_details_gampad_call()
		throws Exception {
	System.out.println("==============================================");
	System.out.println("=========================== Criteo SDK invapp v2 call displayUrl parameter ====================");
	System.out.println("****** Criteo SDK invapp v2 call displayUrl parameter of Hourly Details validation Started");
	logStep("****** Criteo SDK invapp v2 call displayUrl parameter of Hourly Details validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly", "displayUrl",true);
}


		@Test(priority = 214, enabled = true)
@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Hourly1 Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_hourly1_details_gampad_call() throws Exception {

	System.out.println("****** Criteo SDK invapp v2 call cpm parameter of Hourly1 Details validation Started");
	logStep("****** Criteo SDK invapp v2 call cpm parameter of Hourly1 Details validation Started");
    Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly1", "cpm", true);
}

@Test(priority = 216, enabled = true)
@Description("Verify size parameter of Criteo SDK inapp v2 call with Hourly1 Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_hourly1_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println("=========================== Criteo SDK invapp v2 call size parameter ====================");

	System.out.println("****** Criteo SDK invapp v2 call size parameter of Hourly1 Details validation Started");
	logStep("****** Criteo SDK invapp v2 call size parameter of Hourly1 Details validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly1", "size", true);
}
@Test(priority = 218, enabled = true)
@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Hourly1 Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_hourly1_details_gampad_call()
		throws Exception {
	System.out.println("==============================================");
	System.out.println("=========================== Criteo SDK invapp v2 call displayUrl parameter ====================");
	System.out.println("****** Criteo SDK invapp v2 call displayUrl parameter of Hourly1 Details validation Started");
	logStep("****** Criteo SDK invapp v2 call displayUrl parameter of Hourly1 Details validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly1", "displayUrl",true);
}

										
										
		@Test(priority = 220, enabled = true)
@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Hourly2 Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_hourly2_details_gampad_call() throws Exception {

	System.out.println("****** Criteo SDK invapp v2 call cpm parameter of Hourly2 Details validation Started");
	logStep("****** Criteo SDK invapp v2 call cpm parameter of Hourly2 Details validation Started");
    Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly2", "cpm", true);
}

@Test(priority = 222, enabled = true)
@Description("Verify size parameter of Criteo SDK inapp v2 call with Hourly2 Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_hourly2_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println("=========================== Criteo SDK invapp v2 call size parameter ====================");

	System.out.println("****** Criteo SDK invapp v2 call size parameter of Hourly2 Details validation Started");
	logStep("****** Criteo SDK invapp v2 call size parameter of Hourly2 Details validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly2", "size", true);
}
@Test(priority = 224, enabled = true)
@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Hourly2 Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_hourly2_details_gampad_call()
		throws Exception {
	System.out.println("==============================================");
	System.out.println("=========================== Criteo SDK invapp v2 call displayUrl parameter ====================");
	System.out.println("****** Criteo SDK invapp v2 call displayUrl parameter of Hourly2 Details validation Started");
	logStep("****** Criteo SDK invapp v2 call displayUrl parameter of Hourly2 Details validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly2", "displayUrl",true);
}
										
										
																				
		@Test(priority = 226, enabled = true)
@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Hourly3 Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_hourly3_details_gampad_call() throws Exception {

	System.out.println("****** Criteo SDK invapp v2 call cpm parameter of Hourly3 Details validation Started");
	logStep("****** Criteo SDK invapp v2 call cpm parameter of Hourly3 Details validation Started");
    Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly3", "cpm", true);
}

@Test(priority = 228, enabled = true)
@Description("Verify size parameter of Criteo SDK inapp v2 call with Hourly3 Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_hourly3_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println("=========================== Criteo SDK invapp v2 call size parameter ====================");

	System.out.println("****** Criteo SDK invapp v2 call size parameter of Hourly3 Details validation Started");
	logStep("****** Criteo SDK invapp v2 call size parameter of Hourly3 Details validation Started");
Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly3", "size", true);
}
@Test(priority = 230, enabled = true)
@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Hourly3 Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_hourly3_details_gampad_call()
		throws Exception {
	System.out.println("==============================================");
	System.out.println("=========================== Criteo SDK invapp v2 call displayUrl parameter ====================");
	System.out.println("****** Criteo SDK invapp v2 call displayUrl parameter of Hourly3 Details validation Started");
	logStep("****** Criteo SDK invapp v2 call displayUrl parameter of Hourly3 Details validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly3", "displayUrl",true);
}


	
@Test(priority = 232, enabled = true)
@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Map Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_map_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println("=========================== Criteo SDK invapp v2 call cpm parameter ====================");
	System.out.println("****** Criteo SDK invapp v2 call cpm parameter of Map Details validation Started");
	logStep("****** Criteo SDK invapp v2 call cpm parameter of Map Details validation Started");

	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Map", "cpm", true);
}


@Test(priority = 234, enabled = true)
@Description("Verify size parameter of Criteo SDK inapp v2 call with Map Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_map_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println("=========================== Criteo SDK invapp v2 call size parameter ====================");

	System.out.println("****** Criteo SDK invapp v2 call size parameter of Map Details validation Started");
	logStep("****** Criteo SDK invapp v2 call size parameter of Map Details validation Started");
Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Map", "size", true);
}


@Test(priority = 236, enabled = true)
@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Map Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_map_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call displayUrl parameter ====================");

	System.out.println("****** Criteo SDK invapp v2 call displayUrl parameter of Map Details validation Started");
	logStep("****** Criteo SDK invapp v2 call displayUrl parameter of Map Details validation Started");
Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value( "Map", "displayUrl", true);
}


	@Test(priority = 238, enabled = true)
@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Daily Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_daily_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call cpm parameter with Daily details call====================");

	System.out.println("****** Criteo SDK invapp v2 call cpm parameter with Daily Details call validation Started");
	logStep("****** Criteo SDK invapp v2 call cpm parameter with Today Details call validation Started");
//	Functions.verifyingdailydetailiuu();
Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value( "Daily(10day)", "cpm",true);
}

@Test(priority = 240, enabled = true)
@Description("Verify size parameter of Criteo SDK inapp v2 call with daily Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_daily_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call size parameter with Daily details call====================");

	System.out
			.println("****** Criteo SDK invapp v2 call size parameter with Daily details call validation Started");
	logStep("****** Criteo SDK invapp v2 call size parameter with Daily details call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Daily(10day)", "size",true);
}

@Test(priority = 242, enabled = true)
@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Daily Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_daily_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call displayUrl parameter with Daily details call====================");

	System.out.println(
			"****** Criteo SDK invapp v2 call displayUrl parameter with Daily details call validation Started");
	logStep("****** Criteo SDK invapp v2 call displayUrl parameter with Daily details call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Daily(10day)","displayUrl", true);
}




@Test(priority = 246, enabled = true)
@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Today Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_today_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call cpm parameter with Today details call====================");

	System.out.println("****** Criteo SDK invapp v2 call cpm parameter with Today Details call validation Started");
	logStep("****** Criteo SDK invapp v2 call cpm parameter with Today Details call validation Started");

	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Today", "cpm", true);
}

@Test(priority = 248, enabled = true)
@Description("Verify size parameter of Criteo SDK inapp v2 call with Today Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_today_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call size parameter with Today details call====================");

	System.out
			.println("****** Criteo SDK invapp v2 call size parameter with Today details call validation Started");
	logStep("****** Criteo SDK invapp v2 call size parameter with Today details call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Today", "size", true);
}

@Test(priority = 250, enabled = true)
@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Today Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_today_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call displayUrl parameter with Today details call====================");

	System.out.println(
			"****** Criteo SDK invapp v2 call displayUrl parameter with Today details call validation Started");
	logStep("****** Criteo SDK invapp v2 call displayUrl parameter with Today details call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value( "Today", "displayUrl",true);
}



@Test(priority = 252, enabled = true)
@Description("Verify cpm parameter of Criteo SDK inapp v2 call with AQ Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_aq_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call cpm parameter with aq details call====================");

	System.out.println("****** Criteo SDK invapp v2 call cpm parameter with aq details call validation Started");
	logStep("****** Criteo SDK invapp v2 call cpm parameter with aq details call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Air Quality(Content)","cpm", true);
}

@Test(priority = 254, enabled = true)
@Description("Verify size parameter of Criteo SDK inapp v2 call with AQ Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_aq_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call size parameter with aq details call====================");

	System.out.println("****** Criteo SDK invapp v2 call size parameter with aq details call validation Started");
	logStep("****** Criteo SDK invapp v2 call size parameter with aq details call validation Started");
Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value( "Air Quality(Content)", "size", true);
}

@Test(priority = 256, enabled = true)
@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with AQ Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_aq_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call displayUrl parameter with aq details call====================");

	System.out.println(
			"****** Criteo SDK invapp v2 call displayUrl parameter with aq details call validation Started");
	logStep("****** Criteo SDK invapp v2 call displayUrl parameter with aq details call validation Started");
		CharlesFunctions.archive_folder("Charles");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Air Quality(Content)","displayUrl", true);
}


	@Test(priority = 258, enabled = true)
@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Seasonal Hub Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_SeasonalHub_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call cpm parameter with Seasonal Hub details call====================");

	System.out.println(
			"****** Criteo SDK invapp v2 call cpm parameter with Seasonal Hub details call validation Started");
	logStep("****** Criteo SDK invapp v2 call cpm parameter with Seasonal Hub details call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("SeasonalHub(Details)", "cpm", true);
}

@Test(priority = 260, enabled = true)
@Description("Verify size parameter of Criteo SDK inapp v2 call with Seasonal Hub Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_SeasonalHub_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call size parameter with Seasonal Hub details call====================");

	System.out.println(
			"****** Criteo SDK invapp v2 call size parameter with Seasonal Hub details call validation Started");
	logStep("****** Criteo SDK invapp v2 call size parameter with Seasonal Hub details call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("SeasonalHub(Details)","size", true);
}

@Test(priority = 262, enabled = true)
@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Seasonal Hub Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_SeasonalHub_details_gampad_call()
		throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call displayUrl parameter with Seasonal Hub details call====================");

	System.out.println(
			"****** Criteo SDK invapp v2 call displayUrl parameter with Seasonal Hub details call validation Started");
	logStep("****** Criteo SDK invapp v2 call displayUrl parameter with Seasonal Hub details call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("SeasonalHub(Details)","displayUrl", true);
}



@Test(priority = 264, enabled = true)
@Description("Verify cpm parameter of Criteo SDK inapp v2 call with boatAndBeach Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_boatAndBeach_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call cpm parameter with boatAndBeach Details call====================");

	System.out.println("****** Criteo SDK invapp v2 call cpm parameter of boatAndBeach Details validation Started");
	logStep("****** Criteo SDK invapp v2 call cpm parameter of boatAndBeach Details validation Started");

	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Health(boatAndBeach)","cpm", true);
}

@Test(priority = 268, enabled = true)
@Description("Verify size parameter of Criteo SDK inapp v2 call with boatAndBeach Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_boatAndBeach_details_gampad_call()
		throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call size parameter with boatAndBeach Details call====================");

	System.out.println(
			"****** Criteo SDK invapp v2 call size parameter with boatAndBeach Details call validation Started");
	logStep("****** Criteo SDK invapp v2 call size parameter with boatAndBeach Details call validation Started");
Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Health(boatAndBeach)","size", true);
}

@Test(priority = 270, enabled = true)
@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with boatAndBeach Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_boatAndBeach_details_gampad_call()
		throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call displayUrl parameter with boatAndBeach Details call====================");

	System.out.println(
			"****** Criteo SDK invapp v2 call displayUrl parameter with boatAndBeach Details call validation Started");
	logStep("****** Criteo SDK invapp v2 call displayUrl parameter with boatAndBeach Details call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value( "Health(boatAndBeach)","displayUrl", true);
}



@Test(priority = 272, enabled = true)
@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Running Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_Running_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call cpm parameter with Running Details call====================");

	System.out.println("****** Criteo SDK invapp v2 call cpm parameter of Running Details validation Started");
	logStep("****** Criteo SDK invapp v2 call cpm parameter of Running Details validation Started");

	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value( "Health(goRun)", "cpm",true);
}

@Test(priority = 274, enabled = true)
@Description("Verify size parameter of Criteo SDK inapp v2 call with Running Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_Running_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call size parameter with Running Details call====================");

	System.out.println(
			"****** Criteo SDK invapp v2 call size parameter with Running Details call validation Started");
	logStep("****** Criteo SDK invapp v2 call size parameter with Running Details call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Health(goRun)", "size",true);
}

@Test(priority = 278, enabled = true)
@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Running Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_Running_details_gampad_call()
		throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call displayUrl parameter with Running Details call====================");

	System.out.println(
			"****** Criteo SDK invapp v2 call displayUrl parameter with Running Details call validation Started");
	logStep("****** Criteo SDK invapp v2 call displayUrl parameter with Running Details call validation Started");
Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Health(goRun)","displayUrl", true);

}
	
	
	
	
	
	

}

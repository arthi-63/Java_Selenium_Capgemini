package orangeHrmRecuruitmentLink;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.orangehrm.GenericUtility.ActionsHelper;
import com.orangehrm.GenericUtility.BaseClass;
import com.orangehrm.GenericUtility.ExcelUtility;
import com.orangehrm.GenericUtility.JavaUtility;
import com.orangehrm.objectRepository.AddVacancyPage;
import com.orangehrm.objectRepository.DashboardPage;
import com.orangehrm.objectRepository.RecuritmentPage;
import com.orangehrm.objectRepository.VacancyPage;

public class CreateVacancyTest extends BaseClass{
	
	@Test
	public void addVacancy() throws IOException, Exception {
		
		DashboardPage dsp = new DashboardPage(driver);
		RecuritmentPage rp = new RecuritmentPage(driver);
		VacancyPage vp = new VacancyPage(driver);
		AddVacancyPage adp = new AddVacancyPage(driver);
		ActionsHelper ah=new ActionsHelper(driver);
		ExcelUtility eu=new ExcelUtility();
		JavaUtility ju = new JavaUtility();
		String random = ju.getRandomValue();
		
		//dashboard
		dsp.clickRecruitmentLink();
		//recruiment page
		rp.clickVacancyLink();
		//click add 
		vp.clickVacancy();
		//recruiment vacancy
		
		String path="C:\\Orangehrm_Testscript_Data\\VacanciesData.xlsx";
		eu.loadExcelFile(path,"AddVacancy");
		String vacancyName = eu.getDataFromSingleCell(1, 1);
		String description = eu.getDataFromSingleCell(1, 2);
		String hiringManager = eu.getDataFromSingleCell(1, 3);
		String positions = eu.getDataFromSingleCell(1, 4);
		
		adp.setVacancyName(vacancyName);
		
		ah.navigateDownDropdown(adp.getJobTitle(),1,3);
		adp.setDescription(description);
		
		ah.scrollDownAutoSuggestion(hiringManager,adp.getHiringMgr(), 5, 1);
		adp.setNumOfPos(positions);
		adp.clickSaveBtn();
		
		List<WebElement> valiationVacancy = driver.findElements(By.xpath("//div[@class=\"oxd-table-row oxd-table-row--with-border\"]"));
		  
        for(WebElement vacancy: valiationVacancy) {
        	String name=vacancy.getText();
        	Assert.assertEquals(name,eu.getDataFromSingleCell(1, 1));
        	if(name.equals(eu.getDataFromSingleCell(1, 1))) {
        		Reporter.log("passed");
        	}else {
        		Reporter.log("failed");
        	}	
        	
        }		
		
	}
	
	public void addCandidate(){
		DashboardPage dsp = new DashboardPage(driver);
		RecuritmentPage rp = new RecuritmentPage(driver);
		
		//dashboard
		dsp.clickRecruitmentLink();
		
	}

}

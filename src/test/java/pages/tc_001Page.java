package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class tc_001Page {
    WebDriver driver;
    
    private By cannedReportsModule = By.xpath("//a[text()='Canned Reports']");
    private By moduleClaimOption = By.xpath("//a[text()='Module Claim']");
    private By reportCodeOption = By.xpath("//a[text()='Report Code']");
    private By claimAccountingReportLink = By.xpath("//a[text()='Claim Accounting Report']");
    private By submitButton = By.id("submitBtn");
    private By viewLogButton = By.id("viewLogBtn");
    private By addFolioButton = By.id("addFolioBtn");
    private By downloadExcelLink = By.id("downloadExcelLink");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigate_to_claim_accounting_report() {
        driver.findElement(cannedReportsModule).click();
        driver.findElement(moduleClaimOption).click();
        driver.findElement(reportCodeOption).click();
        driver.findElement(claimAccountingReportLink).click();
    }

    public void execute_report_workflow() {
        driver.findElement(submitButton).click();
        driver.findElement(viewLogButton).click();
        driver.findElement(addFolioButton).click();
        driver.findElement(downloadExcelLink).click();
    }

    public void verify_excel_download() {
        // Logic to verify that Excel file is downloaded successfully
    }
    
    public void verify_excel_content() {
        // Logic to verify the content and formatting of Excel file
    }
}
package com.salezrobot.rsoft_web_Application_All_Elements;

import java.util.List;

import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.salezrobot.projectSpecific.base.ProjectSpecificMethods;


public class Rsoft_web_Application_All_Elements_and_All_Methods extends ProjectSpecificMethods{
    Random ran = new Random();
   // RemoteWebDriver driver;
   public Rsoft_web_Application_All_Elements_and_All_Methods(RemoteWebDriver driver, ExtentTest node, Properties prop, String Environment, String StageUrl,
                                                      String Stage1Url){
        this.driver = driver;
        this.node = node;
        this.prop = prop;
        this.Environment = Environment;
        this.StageURL = StageUrl;
        this.Stage1URL = StageUrl;
    }


public WebElement menuButtn1() {
       try {
           
    return null;
       }catch(Exception x){
           return null;
       }
   }

   //Menu Button
   public WebElement menuButton() {
       try {
           Thread.sleep(2000);
          // WebElement Full_View = driver.findElement(By.xpath("//a[contains(@class,'dropdown-toggle ')]"));
           WebElement kebab = driver.findElement(By.xpath("//a[contains(@class,'nav-link nav-menu-main')]"));
          System.out.println("Santhosh4");
          return kebab;
       }catch(Exception x){
           return null;
       }
       
   }
       
   //DashBoard Icon
   public WebElement dashBoardIcon() {
       try {
       WebElement dasboardicon_ = driver.findElement(By.xpath("//i[@class='fa fa-home']"));
       return dasboardicon_;
       }catch(Exception g) {
           return null;
       }
   }
   
   //DashBoard
   public WebElement dashBoard() {
       try {
       WebElement dasboard_ = driver.findElement(By.linkText("Dashboard"));
       return dasboard_;
       }catch(Exception g) {
           return null;
       }
   }
   
   
   
       //All Button
       public WebElement allButton() {
           try {
               WebElement All_Button = driver.findElement(By.id("vertical_header_name"));
        return All_Button;
           }catch(Exception x){
               return null;
           }
       }

       //All Modules in All Button List
       public WebElement allModuleInAllList(String moduleName) {
           try {
               WebElement allModule = driver.findElement(By.xpath("//a/div[text()[normalize-space()='"+moduleName+"']]"));
               return allModule;
           }catch(Exception g) {
               return null;
           }
       }
       //All Modules Add Button
       public WebElement allButtonWithTextXpath(String modulename, String ToporBottom) {
           try {
               if(ToporBottom.equalsIgnoreCase("Top")) {
               WebElement allModuleAddButton = driver.findElement(By.xpath("(//button[text()[normalize-space()='"+modulename+"']])[1]"));
               return allModuleAddButton;
               }else if(ToporBottom.equalsIgnoreCase("Bottom")) {
                   WebElement allModuleAddButton = driver.findElement(By.xpath("(//button[text()[normalize-space()='"+modulename+"']])[2]"));
                   return allModuleAddButton;
               }else {
                   return null;
               }
           }catch(Exception g) {
               return null;
           }
       
       }
       
       //Label Text
       public WebElement labelText(String eleName) {
           try {
           WebElement label = driver.findElement(By.xpath("//label[text()[normalize-space()='"+eleName+"']]"));
           return label;
       }catch(Exception g) {
           return null;
       }
       }
       //Full View Button
       public WebElement fullViewButton() {
         try {
           WebElement Full_View = driver.findElement(By.xpath("//a[contains(@class,'dropdown-toggle ')]"));
           return Full_View;
         }catch(Exception g) {
             return null;
         }
       }
       
       //Search Button
       public void searchButton() throws InterruptedException {
       WebElement search_Element = driver.findElement(By.xpath("//li[contains(@class,'nav-item dropdown')]//a"));
       verify_report_(search_Element,"search_Element");
       click2(search_Element,"search_Element", url());
       
       
       //drop down element
       WebElement drop_Down = driver.findElement(By.xpath("//span[text()='All Records']/following-sibling::span"));
       verify_report_(drop_Down,"drop_Down");
       click2(drop_Down,"drop_Down", url());
       
       WebElement select = driver.findElement(By.xpath("//select[@name='Q_serach_module']"));
       Select sel = new Select(select);
       selectByIndex(select, ran.nextInt(sel.getOptions().size()), url());
       click2(drop_Down,"drop_Down", url());
       
       //text box element
       WebElement textbox = driver.findElement(By.name("Q_serach_word"));
       try {
           boolean enabled = textbox.isEnabled();
           reportStep("TextBox is Enabled", "PASS",enabled);
       }catch (Exception e) {
           reportStep("TextBox is not Enabled", "FAIL", false);
       }
       
       //search element
       WebElement search = driver.findElement(By.xpath("//span[@class='input-group-text searchingbtn']"));
       verify_report_(search,"search");
       click2(search,"search",url());
       Thread.sleep(3000);
       click2(search,"search", url());
       
       //cancel element
       WebElement cancel = driver.findElement(By.xpath("//i[contains(@class,'ficon ft-x')]"));
       verify_report_(cancel,"cancel");
       click2(cancel,"cancel", url());
       }
       
     //Notification_Element
       public WebElement notification() throws InterruptedException {
           try {
       WebElement Notification_ELement = driver.findElement(By.xpath("//a[@class='dropdown-toggle nav-link']"));
           return Notification_ELement;
           }catch(Exception g) {
               return null;
           }
       }
       
       //Email Element
       public WebElement email() throws InterruptedException {
           try {
       WebElement email = driver.findElement(By.xpath("(//a[@id='dropdown-flag'])[2]"));
       return email;
           }catch(Exception g) {
       driver.navigate().back(); driver.navigate().refresh();
       return null;
       }
       }
       
     //Home Profile Element
       public WebElement profileHome() throws InterruptedException {
           try {
           WebElement profile = driver.findElement(By.xpath("//li[contains(@class,'dropdown dropdown-user')]//a"));
           return profile;
           }catch(Exception g) {
               return null;
           }
       }
       
       //My Profile Element
       public WebElement myProfileHome() {
           try {
           WebElement myProfile = driver.findElement(By.xpath("//a[text()=' My Profile']"));
           return myProfile;
       }catch(Exception g) {
           return null;
       }
       }
       
       //CRM Setting
       public WebElement crmSettin() {
           try {
           WebElement CRM_Setting = driver.findElement(By.linkText("CRM Setting"));
           return CRM_Setting;
           }catch(Exception g) {
               return null;
           }
       }
       
       
       //Manage User
       public WebElement manageUser() {
           try {
           WebElement manageUser_ = driver.findElement(By.linkText("Manage Users"));
           return manageUser_;
           }catch(Exception g) {
               return null;
           }
       }
       
       //Logout
       public WebElement logOut() {
           try {
           WebElement logout = driver.findElement(By.linkText("Logout"));
           return logout;
           }catch(Exception g) {
               return null;
           }
       }
       
       //Logout
       public WebElement logOutDayOut() {
           try {
           WebElement logoutDayout = driver.findElement(By.linkText("Dayout/Logout"));
           return logoutDayout;
           }catch(Exception g) {
               return null;
           }
       }
       
       
       //Genereal
       public WebElement generalHome() {
           try {
               WebElement general = driver.findElement(By.linkText("General"));
               return general;
           }catch(Exception g) {
               return null;
           }
       }
       
       
       //Attendence Module
       public WebElement attendenceEle() {
        try {
            WebElement attendence = driver.findElement(By.xpath("//a[text()='Attendances']"));
            return attendence;
        }catch(Exception g) {
            return null;
        }
       }
        
       public WebElement attendenceSettingButton() {
           try {
               WebElement attendenceSetting_Button = driver.findElement(By.linkText("Attendances"));
               return attendenceSetting_Button;
           }catch(Exception g) {
               return null;
           }
       }
        public WebElement attendenceAddTop() {
           try {
               WebElement attendenceAddTop = driver.findElement(By.xpath("(//button[text()='Attendances'])[1]"));
               return attendenceAddTop;
           }catch(Exception h) {
               return null;
           }

        }
        
        public WebElement attendenceColumnView() {
            try {
                WebElement attendenceColumnView = driver.findElement(By.xpath("(//button[contains(@class,'btn mr-1')])[2]"));
                return attendenceColumnView;
            }catch(Exception g) {
                return null;
            }
        }
        
        public WebElement rsoftsaveButtonMain() {
            try {
            WebElement saveMain = driver.findElement(By.xpath("//button[@class='btn btn-primary ModuleSubmit']"));
            return saveMain;
            }catch(Exception m) {
                return null;
            }
        }
        
        public WebElement rsoftLinkText(String LinkTextELeName) {
            try {
                WebElement linkTextEle = driver.findElement(By.linkText(""+LinkTextELeName+""));
                return linkTextEle;
            }catch(Exception g) {
                return null;
            }
        }
        
        public WebElement userAndAccessContro() {
            try {
                WebElement userAndAccessControl = driver.findElement(By.xpath("//label[text()='User & Access Control']"));
                return userAndAccessControl;
            }catch(Exception j) {
                return null;
            }
        }
        
        public WebElement studio() {
            try {
            WebElement studio = driver.findElement(By.xpath("//label[text()='Studio']"));
            return studio;
            }catch(Exception g) {
                return null;
            }
        }
        
        public WebElement template() {
            try {
            WebElement templates = driver.findElement(By.xpath("//label[text()='Templates']"));
            return templates;
            }catch(Exception g) {
                return null;
            }
        }
        
        public WebElement otherSettings() {
            try {
            WebElement otherSettings = driver.findElement(By.xpath("//label[text()='Other Settings']"));
            return otherSettings;
            }catch(Exception g) {
                return null;
            }
        }
        
        public WebElement integration() {
           try {
               WebElement integration = driver.findElement(By.xpath("//label[text()='Integration']"));
               return integration;
           }catch(Exception g) {
               return null;
           }
        }
        
        public WebElement users() {
            try {
        WebElement user = driver.findElement(By.xpath("//label[text()='User']"));
        return user;
            }catch(Exception g) {
                return null;
            }
        }
        
        public WebElement roles() {
            try {
        WebElement role = driver.findElement(By.xpath("//label[text()='Role']"));
        return role;
            }catch(Exception g) {
                return null;
            }
        }
        
        public WebElement profiles() {
            try {
        WebElement profile = driver.findElement(By.xpath("//label[text()='Profile']"));
        return profile;
            }catch(Exception g) {
                return null;
            }
        }
        
        public WebElement loginHistories() {
            try {
        WebElement loginHistory = driver.findElement(By.xpath("//label[text()='Login History']"));
        return loginHistory;
            }catch(Exception g) {
                return null;
            }
        }
            
        public WebElement sharingRules() {
            try {
        WebElement sharingRule = driver.findElement(By.xpath("//label[text()='Sharing Rules']"));
        return sharingRule;
            }catch(Exception g) {
                return null;
            }
        }
        
        public WebElement studios() {
            try {
        WebElement studio = driver.findElement(By.xpath("//label[text()='Studio']"));
        return studio;
            }catch(Exception g) {
                return null;
            }
        }
        
        public WebElement editField() {
            try {
        WebElement editField = driver.findElement(By.xpath("//label[text()='Edit Field']"));
        return editField;
            }catch(Exception g) {
                return null;
            }
        }
        
        
        public WebElement picklistEditor() {
            try {
        WebElement picklistEditor = driver.findElement(By.xpath("//label[text()='Picklist Editor']"));
        return picklistEditor;
            }catch(Exception g) {
                return null;
            }
        }
        
        public WebElement menuEditor() {
            try {
        WebElement menuEditor = driver.findElement(By.xpath("//label[text()='Menu Editor']"));
        return menuEditor;
        }catch(Exception g) {
            return null;
            }
        }
        
        public WebElement moduleManager() {
            try {
        WebElement moduleManager = driver.findElement(By.xpath("//label[text()='Module Manager']"));
        return moduleManager;
            }catch(Exception g) {
                return null;
            }
        }
        
        public WebElement picklistDependency() {
            try {
        WebElement picklistDependency = driver.findElement(By.xpath("//label[text()='Picklist Dependency']"));
        return picklistDependency;
            }catch(Exception g) {
                return null;
            }
        }

        public WebElement companyDetails() {
            try {
                WebElement companyDetails = driver.findElement(By.xpath("//label[text()='Company Details']"));
                return companyDetails;
            }catch(Exception g) {
                return null;
            }
        }

        public WebElement workflow() {
            try {
                WebElement workflow = driver.findElement(By.xpath("//label[text()='Workflow']"));
                return workflow;
            }catch(Exception g) {
                return null;
            }
        }
        
        public WebElement scheduler() {
            try {
        WebElement scheduler = driver.findElement(By.xpath("//label[text()='Scheduler']"));
        return scheduler;
            }catch(Exception g) {
                return null;
            }
        }
        
        public WebElement customizeRecordNumbering() {
            try {
        WebElement customizeRecordNumbering = driver.findElement(By.xpath("//label[text()='Customize Record Numbering']"));
        return customizeRecordNumbering;
            }catch(Exception g) {
                return null;
            }
        }
        
        public WebElement outGoingServer() {
            try {
        WebElement outgoingServer = driver.findElement(By.xpath("//label[text()='Outgoing Server']"));
        return outgoingServer;
            }catch(Exception g) {
                return null;
            }
        }
        
        public WebElement configurationEditor() {
            try {
        WebElement configurationEditor = driver.findElement(By.xpath("//label[text()='Configuration Editor']"));
        return configurationEditor;
            }catch(Exception g) {
                return null;
            }
        }
        
        public WebElement taxCalculation() {
            try {
        WebElement taxCalculations = driver.findElement(By.xpath("//label[text()='Tax Calculations']"));
        return taxCalculations;
            }catch(Exception g) {
                return null;
            }
        }
        
        public WebElement target() {
            try {
        WebElement target = driver.findElement(By.xpath("//label[text()='Target']"));
        return target;
            }catch(Exception g){
                return null;
            }
        }
        
        public WebElement conditionalLayout() {
            try {
        WebElement conditionalLayout = driver.findElement(By.xpath("//label[text()='Conditional Layout']"));
        return conditionalLayout;
            }catch(Exception g) {
                return null;
            }
        }
        
        public WebElement attendanceSetting() {
            try {
        WebElement attendanceSettings = driver.findElement(By.xpath("//label[text()='Attendance Settings']"));
        return attendanceSettings;
            }catch(Exception g) {
                return null;
            }
        }
        
        public WebElement mailConverter() {
            try {
        WebElement mailConverter = driver.findElement(By.xpath("//label[text()='Mail Converter']"));
        return mailConverter;
            }catch(Exception g) {
                return null;
            }
        }
        
        public WebElement smsNotifier() {
            try {
        WebElement sMSNotifier = driver.findElement(By.xpath("//label[text()='SMS Notifier']"));
        return sMSNotifier;
            }catch(Exception g) {
                return null;
            }
        }
        
        public WebElement portalIntegration() {
            try {
        WebElement portalIntegration = driver.findElement(By.xpath("//label[text()='Portal Integration']"));
        return portalIntegration;
            }catch(Exception g) {
                return null;
            }
        }
        
        public WebElement webForms() {
                try {
        WebElement webForms = driver.findElement(By.xpath("//label[text()='Web Forms']"));
        return webForms;
                }catch(Exception g) {
                    return null;
                }
        }
        
        public WebElement whatsappConfig() {
            try {
        WebElement whatsAppConfig = driver.findElement(By.xpath("//label[text()='WhatsApp Config']"));
        return whatsAppConfig;
            }catch(Exception g) {
                return null;
            }
        }
        
        public WebElement facebook() {
            try {
        WebElement facebook = driver.findElement(By.xpath("//label[text()='Facebook']"));
        return facebook;
            }catch(Exception g) {
                return null;
            }
        }
        
        //Role Name Link Label
        public WebElement roleName(String roleName) {
            try {
                WebElement rolename = driver.findElement(By.xpath("//a[text()='"+roleName+"']"));
                return rolename;
            }catch(Exception g) {
                return null;
            }
        }
        
        //Role Add Button
        public WebElement roleAddIcon(int num ) {
            try {
                WebElement roleAdd = driver.findElement(By.xpath("(//a/i[@class='fa fa-plus-circle'])["+num+"]"));
                return roleAdd;
            }catch(Exception g) {
                return null;
            }
        }
        
        //Role Button
        public WebElement DeleteIcon_trash(int num) {
            try {
                WebElement delete = driver.findElement(By.xpath("(//a/i[contains(@class,'fa fa-trash')])["+num+"]"));
                return delete;
            }catch(Exception g) {
                return null;
            }
        }
        
        //Profile Edit Icon
        public WebElement profileEditIcon(int num) {
            try {
                WebElement profileEdit = driver.findElement(By.xpath("(//a[contains(@href,'Setting&field')])["+num+"]"));
                return profileEdit;
            }catch(Exception g) {
                return null;
            }
        }
        
        //Edit Field Module Edit
        public WebElement editFieldEdit(int num) {
            try {
                WebElement editIcon = driver.findElement(By.xpath("(//a[contains(@href,'Edit&field')])["+num+"]"));
                return editIcon;
            }catch(Exception g) {
                return null;
            }
        }
        
      //Edit Field Module Delete
        public WebElement editFieldDelete(int num) {
            try {
                WebElement deleteIcon = driver.findElement(By.xpath("(//a/i[contains(@class,'fa fa-trash delete')])["+num+"]"));
                return deleteIcon;
            }catch(Exception g) {
                return null;
            }
        }
        
        //ModuleManager Check Box
        public WebElement moduleManagerCheck() {
            try {
                WebElement check = driver.findElement(By.xpath("//input[@name='SelectMod']"));
                return check;
            }catch(Exception g) {
                return null;
            }
        }
        
        //
        public WebElement attendenceMonthlyReport() {
            try {
                WebElement monthlyReportButton = driver.findElement(By.linkText("Monthly"));
                return monthlyReportButton;
            }catch(Exception g){
                return null;
            }
        }
        
        
        public WebElement creatingWorkflow() {
            try {
                WebElement creatingWorflow = driver.findElement(By.xpath("//button[text()='Creating  Workflow']"));
                return creatingWorflow;
            }catch(Exception g) {
                return null;
            }
        }
    
        public WebElement rsoftNextButton() {
            try {
                WebElement rsoftNextbutton = driver.findElement(By.xpath("//button[text()[normalize-space()='Next']]"));
                        return rsoftNextbutton;
            }catch(Exception g) {
                return null;
            }
        }
        
        public WebElement rsoftCancelButton() {
            try {
                WebElement rsoftCancelbutton = driver.findElement(By.xpath("//button[text()[normalize-space()='Cancel']]"));
                        return rsoftCancelbutton;
            }catch(Exception g){
                return null;
            }
        }
}

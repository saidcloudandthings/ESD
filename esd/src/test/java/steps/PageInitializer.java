package steps;

import pages.*;

public class PageInitializer {
    public static LoginPage loginPage;

    public static CreateScreens createScreens;

    public static DashboardPage dashboardPage;

    public static ApplyScreens applyScreens;

    public static ApplicationSummary applicationSummary;

    public static BusinessDetails businessDetails;

    public static void initializeObjects(){
        loginPage = new LoginPage();
        createScreens = new CreateScreens();
        dashboardPage = new DashboardPage();
        applyScreens = new ApplyScreens();
        applicationSummary = new ApplicationSummary();
        businessDetails = new BusinessDetails();
    }


}

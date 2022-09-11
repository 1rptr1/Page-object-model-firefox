package utils.extentreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    public static final ExtentReports extentReports = new ExtentReports();

    public synchronized static ExtentReports createExtentReports() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("./target/Reports/extent-report.html");
        reporter.config().setReportName("Extent Report");
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("Project Name", "Reporting base");
        extentReports.setSystemInfo("Author", "Saurav");
        return extentReports;
    }
}

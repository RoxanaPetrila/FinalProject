package SharedData.Browser;

public interface BrowserService {
    void openBrowser(Boolean cicd);
    Object prepareBrowserOptions(Boolean cicd);

    void closeBrowser();
}

package src.oops_13jan.abstraction.RealTimeExample;

public class TCChrome extends Baseclass{
    @Override
    String openBrowser() {
        System.out.println("Starting Chrome");
        return null;
    }

    @Override
    String closeBrowser() {
        System.out.println("Closing Chrome");
        return null;
    }
}

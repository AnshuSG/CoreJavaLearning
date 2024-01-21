package src.oops_13jan.abstraction.RealTimeExample;

public class TCFirefox extends Baseclass{
    @Override
    String openBrowser() {
        System.out.println("Starting Firefox");
        return null;
    }

    @Override
    String closeBrowser() {
        System.out.println("Closing Firefox");
        return null;
    }
}

package creational.abstractfactory;

public class MacOSFactory implements GUIFactory {
    public Button createButton() {
        return new MacOSButton();
    }
}

package creational.abstractfactory;

public class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }
}

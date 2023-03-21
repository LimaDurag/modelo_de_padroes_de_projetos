package factories;

import button.Button;
import button.MacOSButton;
import checkbox.Checkbox;
import checkbox.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
	@Override
	public Button createButton() {
		return new MacOSButton();
	}
	
	@Override
	public Checkbox createCheckbox() {
		return new MacOSCheckbox();
	}
}

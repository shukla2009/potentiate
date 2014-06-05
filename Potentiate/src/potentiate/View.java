package potentiate;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class View extends ViewPart {
	public static final String ID = "Potentiate.view";
	private Browser brw;
	private String defaultUrl = "http://www.potentiateglobal.com/";

	public void createPartControl(Composite parent) {
		brw = new Browser(parent, SWT.NONE);
		brw.setLayoutData(new GridData(GridData.FILL_BOTH));
		brw.setUrl(defaultUrl);

	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		brw.setFocus();
	}

	public void setInput(String url) {
		if (brw != null && !brw.isDisposed()) {
			brw.setUrl(url);
		}
	};
}
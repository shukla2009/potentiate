package com.potentiate.example;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import potentiate.View;

public abstract class UrlHandler extends AbstractHandler {

	private IViewPart showView;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
			showView = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
					.getActivePage().showView(View.ID);

			if (showView != null && showView instanceof View) {
				((View) showView).setInput(getUrl());
			}
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	abstract String getUrl();

}

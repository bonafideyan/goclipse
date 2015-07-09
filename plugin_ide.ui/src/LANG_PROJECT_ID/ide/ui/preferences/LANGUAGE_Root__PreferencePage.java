/*******************************************************************************
 * Copyright (c) 2014, 2014 Bruno Medeiros and other Contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Bruno Medeiros - initial API and implementation
 *******************************************************************************/
package LANG_PROJECT_ID.ide.ui.preferences;

import melnorme.lang.ide.ui.preferences.LangRootPreferencePage;
import melnorme.lang.tooling.data.LANGUAGE_SDKLocationValidator;
import melnorme.lang.tooling.data.SDKLocationValidator;


/**
 * The main/root preference page.
 */
public class LANGUAGE_Root__PreferencePage extends LangRootPreferencePage {
	
	public LANGUAGE_Root__PreferencePage() {
		super();
	}
	
	@Override
	protected String getHelpId() {
		return null;
	}
	
	@Override
	protected SDKLocationValidator getSDKValidator() {
		return new LANGUAGE_SDKLocationValidator();
	}
	
}
/*******************************************************************************
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     
 *******************************************************************************/
package org.eclipse.wst.xml.ui.internal.templates;

import org.eclipse.jface.text.templates.SimpleTemplateVariableResolver;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.wst.common.encoding.CommonEncodingPreferenceNames;
import org.eclipse.wst.xml.core.internal.XMLCorePlugin;


public class EncodingTemplateVariableResolverXML extends SimpleTemplateVariableResolver {
	private static final String ENCODING_TYPE = getEncodingType();

	private static String getEncodingType() {
		return "encoding";
	}

	/**
	 * Creates a new encoding variable
	 */
	public EncodingTemplateVariableResolverXML() {
		super(ENCODING_TYPE, "Creating files encoding preference");
	}

	protected String resolve(TemplateContext context) {
		return XMLCorePlugin.getDefault().getPluginPreferences().getString(CommonEncodingPreferenceNames.OUTPUT_CODESET);
	}
}

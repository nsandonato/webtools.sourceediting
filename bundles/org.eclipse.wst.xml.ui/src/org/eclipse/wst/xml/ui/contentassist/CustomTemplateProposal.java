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
package org.eclipse.wst.xml.ui.contentassist;

import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateProposal;
import org.eclipse.swt.graphics.Image;
import org.eclipse.wst.sse.core.util.StringUtils;
import org.eclipse.wst.sse.ui.contentassist.IRelevanceCompletionProposal;

/**
 * Purpose of this class is to make the additional proposal info into content
 * fit for an HTML viewer (by escaping characters)
 */
class CustomTemplateProposal extends TemplateProposal implements IRelevanceCompletionProposal {
	// copies of this class exist in:
	// org.eclipse.jst.jsp.ui.internal.contentassist
	// org.eclipse.wst.html.ui.internal.contentassist
	// org.eclipse.wst.xml.ui.internal.contentassist

	public CustomTemplateProposal(Template template, TemplateContext context, IRegion region, Image image, int relevance) {
		super(template, context, region, image, relevance);
	}

	public String getAdditionalProposalInfo() {
		String additionalInfo = super.getAdditionalProposalInfo();
		return StringUtils.convertToHTMLContent(additionalInfo);
	}
}

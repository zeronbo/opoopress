/*
 * Copyright 2013 Alex Lin.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.opoo.press.maven.plugins.plugin;


/**
 * Generate static site/blog.
 * 
 * @author Alex Lin
 * @goal generate
 */
public class GenerateMojo extends AbstractGenerateMojo{
	/**
     * Set this to 'true' to generate draft posts.
     *
     * @parameter expression="${op.show-drafts}" default-value="false"
     */
    protected boolean showDrafts;
    
	/* (non-Javadoc)
	 * @see org.opoo.press.maven.plugins.plugin.AbstractGenerateMojo#showDrafts()
	 */
	@Override
	protected boolean showDrafts() {
		return showDrafts;
	}
}

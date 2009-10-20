/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.wookie.manifestmodel;
/**
 * @author Paul Sharples
 * @version $Id: ILicenseEntity.java,v 1.3 2009-09-02 18:37:30 scottwilson Exp $
 */
public interface ILicenseEntity extends IManifestModelBase {

	public String getLicenseText();

	public void setLicenseText(String licenseText);

	public String getHref();

	public void setHref(String href);

	public String getLanguage();

	public void setLanguage(String language);

}
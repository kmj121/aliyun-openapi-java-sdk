/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListEnvironmentAlertRulesRequest extends RpcAcsRequest<ListEnvironmentAlertRulesResponse> {
	   

	private String scene;

	private String environmentId;

	private String addonName;
	public ListEnvironmentAlertRulesRequest() {
		super("ARMS", "2019-08-08", "ListEnvironmentAlertRules", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getScene() {
		return this.scene;
	}

	public void setScene(String scene) {
		this.scene = scene;
		if(scene != null){
			putQueryParameter("Scene", scene);
		}
	}

	public String getEnvironmentId() {
		return this.environmentId;
	}

	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
		if(environmentId != null){
			putQueryParameter("EnvironmentId", environmentId);
		}
	}

	public String getAddonName() {
		return this.addonName;
	}

	public void setAddonName(String addonName) {
		this.addonName = addonName;
		if(addonName != null){
			putQueryParameter("AddonName", addonName);
		}
	}

	@Override
	public Class<ListEnvironmentAlertRulesResponse> getResponseClass() {
		return ListEnvironmentAlertRulesResponse.class;
	}

}

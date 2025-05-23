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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyMaskingRulesRequest extends RpcAcsRequest<ModifyMaskingRulesResponse> {
	   

	private String maskingAlgo;

	private String ruleName;

	private String ruleVersion;

	private String enable;

	private String interfaceVersion;

	private String dBClusterId;

	private String defaultAlgo;

	private String ruleConfig;

	private String ruleNameList;
	public ModifyMaskingRulesRequest() {
		super("polardb", "2017-08-01", "ModifyMaskingRules", "polardb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMaskingAlgo() {
		return this.maskingAlgo;
	}

	public void setMaskingAlgo(String maskingAlgo) {
		this.maskingAlgo = maskingAlgo;
		if(maskingAlgo != null){
			putQueryParameter("MaskingAlgo", maskingAlgo);
		}
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
		if(ruleName != null){
			putQueryParameter("RuleName", ruleName);
		}
	}

	public String getRuleVersion() {
		return this.ruleVersion;
	}

	public void setRuleVersion(String ruleVersion) {
		this.ruleVersion = ruleVersion;
		if(ruleVersion != null){
			putQueryParameter("RuleVersion", ruleVersion);
		}
	}

	public String getEnable() {
		return this.enable;
	}

	public void setEnable(String enable) {
		this.enable = enable;
		if(enable != null){
			putQueryParameter("Enable", enable);
		}
	}

	public String getInterfaceVersion() {
		return this.interfaceVersion;
	}

	public void setInterfaceVersion(String interfaceVersion) {
		this.interfaceVersion = interfaceVersion;
		if(interfaceVersion != null){
			putQueryParameter("InterfaceVersion", interfaceVersion);
		}
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
		if(dBClusterId != null){
			putQueryParameter("DBClusterId", dBClusterId);
		}
	}

	public String getDefaultAlgo() {
		return this.defaultAlgo;
	}

	public void setDefaultAlgo(String defaultAlgo) {
		this.defaultAlgo = defaultAlgo;
		if(defaultAlgo != null){
			putQueryParameter("DefaultAlgo", defaultAlgo);
		}
	}

	public String getRuleConfig() {
		return this.ruleConfig;
	}

	public void setRuleConfig(String ruleConfig) {
		this.ruleConfig = ruleConfig;
		if(ruleConfig != null){
			putQueryParameter("RuleConfig", ruleConfig);
		}
	}

	public String getRuleNameList() {
		return this.ruleNameList;
	}

	public void setRuleNameList(String ruleNameList) {
		this.ruleNameList = ruleNameList;
		if(ruleNameList != null){
			putQueryParameter("RuleNameList", ruleNameList);
		}
	}

	@Override
	public Class<ModifyMaskingRulesResponse> getResponseClass() {
		return ModifyMaskingRulesResponse.class;
	}

}

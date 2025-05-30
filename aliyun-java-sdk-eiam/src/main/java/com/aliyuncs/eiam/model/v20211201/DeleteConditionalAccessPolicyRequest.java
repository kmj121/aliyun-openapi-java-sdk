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

package com.aliyuncs.eiam.model.v20211201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteConditionalAccessPolicyRequest extends RpcAcsRequest<DeleteConditionalAccessPolicyResponse> {
	   

	private String conditionalAccessPolicyId;

	private String instanceId;
	public DeleteConditionalAccessPolicyRequest() {
		super("Eiam", "2021-12-01", "DeleteConditionalAccessPolicy", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getConditionalAccessPolicyId() {
		return this.conditionalAccessPolicyId;
	}

	public void setConditionalAccessPolicyId(String conditionalAccessPolicyId) {
		this.conditionalAccessPolicyId = conditionalAccessPolicyId;
		if(conditionalAccessPolicyId != null){
			putQueryParameter("ConditionalAccessPolicyId", conditionalAccessPolicyId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	@Override
	public Class<DeleteConditionalAccessPolicyResponse> getResponseClass() {
		return DeleteConditionalAccessPolicyResponse.class;
	}

}

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

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateExpressConnectTrafficQosRequest extends RpcAcsRequest<CreateExpressConnectTrafficQosResponse> {
	   

	private String clientToken;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String qosName;

	private String qosDescription;
	public CreateExpressConnectTrafficQosRequest() {
		super("Vpc", "2016-04-28", "CreateExpressConnectTrafficQos", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getQosName() {
		return this.qosName;
	}

	public void setQosName(String qosName) {
		this.qosName = qosName;
		if(qosName != null){
			putQueryParameter("QosName", qosName);
		}
	}

	public String getQosDescription() {
		return this.qosDescription;
	}

	public void setQosDescription(String qosDescription) {
		this.qosDescription = qosDescription;
		if(qosDescription != null){
			putQueryParameter("QosDescription", qosDescription);
		}
	}

	@Override
	public Class<CreateExpressConnectTrafficQosResponse> getResponseClass() {
		return CreateExpressConnectTrafficQosResponse.class;
	}

}

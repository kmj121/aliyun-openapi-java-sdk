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

package com.aliyuncs.quickbi_public.model.v20220101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SmartqQueryAbilityRequest extends RpcAcsRequest<SmartqQueryAbilityResponse> {
	   

	private String userId;

	private String userQuestion;

	private String cubeId;
	public SmartqQueryAbilityRequest() {
		super("quickbi-public", "2022-01-01", "SmartqQueryAbility", "2.2.0");
		setMethod(MethodType.POST);
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public String getUserQuestion() {
		return this.userQuestion;
	}

	public void setUserQuestion(String userQuestion) {
		this.userQuestion = userQuestion;
		if(userQuestion != null){
			putQueryParameter("UserQuestion", userQuestion);
		}
	}

	public String getCubeId() {
		return this.cubeId;
	}

	public void setCubeId(String cubeId) {
		this.cubeId = cubeId;
		if(cubeId != null){
			putQueryParameter("CubeId", cubeId);
		}
	}

	@Override
	public Class<SmartqQueryAbilityResponse> getResponseClass() {
		return SmartqQueryAbilityResponse.class;
	}

}

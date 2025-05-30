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

package com.aliyuncs.brinekingdom.model.v20190627;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetProjectTypeByCodeRequest extends RpcAcsRequest<GetProjectTypeByCodeResponse> {
	   

	private String projectType;
	public GetProjectTypeByCodeRequest() {
		super("brinekingdom", "2019-06-27", "GetProjectTypeByCode");
		setMethod(MethodType.POST);
	}

	public String getProjectType() {
		return this.projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
		if(projectType != null){
			putQueryParameter("ProjectType", projectType);
		}
	}

	@Override
	public Class<GetProjectTypeByCodeResponse> getResponseClass() {
		return GetProjectTypeByCodeResponse.class;
	}

}

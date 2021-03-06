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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListLinkeantcodeAntcodeRepositoryfilesRequest extends RpcAcsRequest<ListLinkeantcodeAntcodeRepositoryfilesResponse> {
	   

	private String ref;

	private String id;

	private String perPage;

	private String requestGitOperate;

	private String page;

	private List<String> filePathRepeatLists;
	public ListLinkeantcodeAntcodeRepositoryfilesRequest() {
		super("SOFA", "2019-08-15", "ListLinkeantcodeAntcodeRepositoryfiles", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRef() {
		return this.ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
		if(ref != null){
			putBodyParameter("Ref", ref);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	public String getPerPage() {
		return this.perPage;
	}

	public void setPerPage(String perPage) {
		this.perPage = perPage;
		if(perPage != null){
			putBodyParameter("PerPage", perPage);
		}
	}

	public String getRequestGitOperate() {
		return this.requestGitOperate;
	}

	public void setRequestGitOperate(String requestGitOperate) {
		this.requestGitOperate = requestGitOperate;
		if(requestGitOperate != null){
			putBodyParameter("RequestGitOperate", requestGitOperate);
		}
	}

	public String getPage() {
		return this.page;
	}

	public void setPage(String page) {
		this.page = page;
		if(page != null){
			putBodyParameter("Page", page);
		}
	}

	public List<String> getFilePathRepeatLists() {
		return this.filePathRepeatLists;
	}

	public void setFilePathRepeatLists(List<String> filePathRepeatLists) {
		this.filePathRepeatLists = filePathRepeatLists;	
		if (filePathRepeatLists != null) {
			for (int i = 0; i < filePathRepeatLists.size(); i++) {
				putBodyParameter("FilePathRepeatList." + (i + 1) , filePathRepeatLists.get(i));
			}
		}	
	}

	@Override
	public Class<ListLinkeantcodeAntcodeRepositoryfilesResponse> getResponseClass() {
		return ListLinkeantcodeAntcodeRepositoryfilesResponse.class;
	}

}

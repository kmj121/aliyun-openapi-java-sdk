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

package com.aliyuncs.dataphin_public.model.v20230630;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetTableColumnLineageByTaskIdRequest extends RpcAcsRequest<GetTableColumnLineageByTaskIdResponse> {
	   

	private Long opTenantId;

	@SerializedName("tableColumnLineageByTaskIdQuery")
	private TableColumnLineageByTaskIdQuery tableColumnLineageByTaskIdQuery;
	public GetTableColumnLineageByTaskIdRequest() {
		super("dataphin-public", "2023-06-30", "GetTableColumnLineageByTaskId");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getOpTenantId() {
		return this.opTenantId;
	}

	public void setOpTenantId(Long opTenantId) {
		this.opTenantId = opTenantId;
		if(opTenantId != null){
			putQueryParameter("OpTenantId", opTenantId.toString());
		}
	}

	public TableColumnLineageByTaskIdQuery getTableColumnLineageByTaskIdQuery() {
		return this.tableColumnLineageByTaskIdQuery;
	}

	public void setTableColumnLineageByTaskIdQuery(TableColumnLineageByTaskIdQuery tableColumnLineageByTaskIdQuery) {
		this.tableColumnLineageByTaskIdQuery = tableColumnLineageByTaskIdQuery;	
		if (tableColumnLineageByTaskIdQuery != null) {
			putBodyParameter("TableColumnLineageByTaskIdQuery" , new Gson().toJson(tableColumnLineageByTaskIdQuery));
		}	
	}

	public static class TableColumnLineageByTaskIdQuery {

		@SerializedName("TaskEnv")
		private String taskEnv;

		@SerializedName("NeedNotExistObject")
		private Boolean needNotExistObject;

		@SerializedName("TaskId")
		private String taskId;

		public String getTaskEnv() {
			return this.taskEnv;
		}

		public void setTaskEnv(String taskEnv) {
			this.taskEnv = taskEnv;
		}

		public Boolean getNeedNotExistObject() {
			return this.needNotExistObject;
		}

		public void setNeedNotExistObject(Boolean needNotExistObject) {
			this.needNotExistObject = needNotExistObject;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}
	}

	@Override
	public Class<GetTableColumnLineageByTaskIdResponse> getResponseClass() {
		return GetTableColumnLineageByTaskIdResponse.class;
	}

}

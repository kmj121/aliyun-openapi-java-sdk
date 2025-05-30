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

package com.aliyuncs.resourcemanager.model.v20200331;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.resourcemanager.transform.v20200331.GetResourceDirectoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetResourceDirectoryResponse extends AcsResponse {

	private String requestId;

	private ResourceDirectory resourceDirectory;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ResourceDirectory getResourceDirectory() {
		return this.resourceDirectory;
	}

	public void setResourceDirectory(ResourceDirectory resourceDirectory) {
		this.resourceDirectory = resourceDirectory;
	}

	public static class ResourceDirectory {

		private String controlPolicyStatus;

		private String createTime;

		private String identityInformation;

		private String masterAccountId;

		private String masterAccountName;

		private String memberDeletionStatus;

		private String resourceDirectoryId;

		private String rootFolderId;

		private String scpStatus;

		public String getControlPolicyStatus() {
			return this.controlPolicyStatus;
		}

		public void setControlPolicyStatus(String controlPolicyStatus) {
			this.controlPolicyStatus = controlPolicyStatus;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getIdentityInformation() {
			return this.identityInformation;
		}

		public void setIdentityInformation(String identityInformation) {
			this.identityInformation = identityInformation;
		}

		public String getMasterAccountId() {
			return this.masterAccountId;
		}

		public void setMasterAccountId(String masterAccountId) {
			this.masterAccountId = masterAccountId;
		}

		public String getMasterAccountName() {
			return this.masterAccountName;
		}

		public void setMasterAccountName(String masterAccountName) {
			this.masterAccountName = masterAccountName;
		}

		public String getMemberDeletionStatus() {
			return this.memberDeletionStatus;
		}

		public void setMemberDeletionStatus(String memberDeletionStatus) {
			this.memberDeletionStatus = memberDeletionStatus;
		}

		public String getResourceDirectoryId() {
			return this.resourceDirectoryId;
		}

		public void setResourceDirectoryId(String resourceDirectoryId) {
			this.resourceDirectoryId = resourceDirectoryId;
		}

		public String getRootFolderId() {
			return this.rootFolderId;
		}

		public void setRootFolderId(String rootFolderId) {
			this.rootFolderId = rootFolderId;
		}

		public String getScpStatus() {
			return this.scpStatus;
		}

		public void setScpStatus(String scpStatus) {
			this.scpStatus = scpStatus;
		}
	}

	@Override
	public GetResourceDirectoryResponse getInstance(UnmarshallerContext context) {
		return	GetResourceDirectoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

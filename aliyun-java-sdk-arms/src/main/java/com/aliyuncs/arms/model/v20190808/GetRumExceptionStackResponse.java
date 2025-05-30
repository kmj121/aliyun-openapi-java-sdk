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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.GetRumExceptionStackResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRumExceptionStackResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String success;

	private String message;

	private String httpStatusCode;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(String httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String threadId;

		private String crashReason;

		private String crashAddress;

		private String moduleName;

		private String uuid;

		private String binaryImages;

		private List<ThreadInfoListItem> threadInfoList;

		private List<String> lines;

		public String getThreadId() {
			return this.threadId;
		}

		public void setThreadId(String threadId) {
			this.threadId = threadId;
		}

		public String getCrashReason() {
			return this.crashReason;
		}

		public void setCrashReason(String crashReason) {
			this.crashReason = crashReason;
		}

		public String getCrashAddress() {
			return this.crashAddress;
		}

		public void setCrashAddress(String crashAddress) {
			this.crashAddress = crashAddress;
		}

		public String getModuleName() {
			return this.moduleName;
		}

		public void setModuleName(String moduleName) {
			this.moduleName = moduleName;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getBinaryImages() {
			return this.binaryImages;
		}

		public void setBinaryImages(String binaryImages) {
			this.binaryImages = binaryImages;
		}

		public List<ThreadInfoListItem> getThreadInfoList() {
			return this.threadInfoList;
		}

		public void setThreadInfoList(List<ThreadInfoListItem> threadInfoList) {
			this.threadInfoList = threadInfoList;
		}

		public List<String> getLines() {
			return this.lines;
		}

		public void setLines(List<String> lines) {
			this.lines = lines;
		}

		public static class ThreadInfoListItem {

			private String threadTag;

			private String threadDetail;

			public String getThreadTag() {
				return this.threadTag;
			}

			public void setThreadTag(String threadTag) {
				this.threadTag = threadTag;
			}

			public String getThreadDetail() {
				return this.threadDetail;
			}

			public void setThreadDetail(String threadDetail) {
				this.threadDetail = threadDetail;
			}
		}
	}

	@Override
	public GetRumExceptionStackResponse getInstance(UnmarshallerContext context) {
		return	GetRumExceptionStackResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

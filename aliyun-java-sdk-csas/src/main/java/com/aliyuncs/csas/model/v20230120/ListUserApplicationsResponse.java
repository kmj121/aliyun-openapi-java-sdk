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

package com.aliyuncs.csas.model.v20230120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.csas.transform.v20230120.ListUserApplicationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUserApplicationsResponse extends AcsResponse {

	private String requestId;

	private Integer totalNum;

	private List<ApplicationsItem> applications;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public List<ApplicationsItem> getApplications() {
		return this.applications;
	}

	public void setApplications(List<ApplicationsItem> applications) {
		this.applications = applications;
	}

	public static class ApplicationsItem {

		private String name;

		private String applicationId;

		private String protocol;

		private String action;

		private List<PortRangesItem> portRanges;

		private List<String> addresses;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getApplicationId() {
			return this.applicationId;
		}

		public void setApplicationId(String applicationId) {
			this.applicationId = applicationId;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getAction() {
			return this.action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public List<PortRangesItem> getPortRanges() {
			return this.portRanges;
		}

		public void setPortRanges(List<PortRangesItem> portRanges) {
			this.portRanges = portRanges;
		}

		public List<String> getAddresses() {
			return this.addresses;
		}

		public void setAddresses(List<String> addresses) {
			this.addresses = addresses;
		}

		public static class PortRangesItem {

			private String begin;

			private String end;

			public String getBegin() {
				return this.begin;
			}

			public void setBegin(String begin) {
				this.begin = begin;
			}

			public String getEnd() {
				return this.end;
			}

			public void setEnd(String end) {
				this.end = end;
			}
		}
	}

	@Override
	public ListUserApplicationsResponse getInstance(UnmarshallerContext context) {
		return	ListUserApplicationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

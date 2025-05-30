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

package com.aliyuncs.config.model.v20200907;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.config.transform.v20200907.GetIntegratedServiceStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetIntegratedServiceStatusResponse extends AcsResponse {

	private String requestId;

	private Boolean data;

	private String integratedTypes;

	private String aggregatorDeliveryDataType;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getData() {
		return this.data;
	}

	public void setData(Boolean data) {
		this.data = data;
	}

	public String getIntegratedTypes() {
		return this.integratedTypes;
	}

	public void setIntegratedTypes(String integratedTypes) {
		this.integratedTypes = integratedTypes;
	}

	public String getAggregatorDeliveryDataType() {
		return this.aggregatorDeliveryDataType;
	}

	public void setAggregatorDeliveryDataType(String aggregatorDeliveryDataType) {
		this.aggregatorDeliveryDataType = aggregatorDeliveryDataType;
	}

	@Override
	public GetIntegratedServiceStatusResponse getInstance(UnmarshallerContext context) {
		return	GetIntegratedServiceStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

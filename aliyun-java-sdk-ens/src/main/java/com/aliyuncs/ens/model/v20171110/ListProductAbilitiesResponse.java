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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.ListProductAbilitiesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListProductAbilitiesResponse extends AcsResponse {

	private String requestId;

	private List<String> productAbilities;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getProductAbilities() {
		return this.productAbilities;
	}

	public void setProductAbilities(List<String> productAbilities) {
		this.productAbilities = productAbilities;
	}

	@Override
	public ListProductAbilitiesResponse getInstance(UnmarshallerContext context) {
		return	ListProductAbilitiesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

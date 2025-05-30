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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeEnsEipAddressesRequest extends RpcAcsRequest<DescribeEnsEipAddressesResponse> {
	   

	private String eipName;

	private String eipAddress;

	private String ensRegionId;

	private String standby;

	private String allocationId;

	private Integer pageNumber;

	private String associatedInstanceType;

	private Integer pageSize;

	private List<String> ensRegionIds;

	private String associatedInstanceId;
	public DescribeEnsEipAddressesRequest() {
		super("Ens", "2017-11-10", "DescribeEnsEipAddresses", "ens");
		setMethod(MethodType.POST);
	}

	public String getEipName() {
		return this.eipName;
	}

	public void setEipName(String eipName) {
		this.eipName = eipName;
		if(eipName != null){
			putQueryParameter("EipName", eipName);
		}
	}

	public String getEipAddress() {
		return this.eipAddress;
	}

	public void setEipAddress(String eipAddress) {
		this.eipAddress = eipAddress;
		if(eipAddress != null){
			putQueryParameter("EipAddress", eipAddress);
		}
	}

	public String getEnsRegionId() {
		return this.ensRegionId;
	}

	public void setEnsRegionId(String ensRegionId) {
		this.ensRegionId = ensRegionId;
		if(ensRegionId != null){
			putQueryParameter("EnsRegionId", ensRegionId);
		}
	}

	public String getStandby() {
		return this.standby;
	}

	public void setStandby(String standby) {
		this.standby = standby;
		if(standby != null){
			putQueryParameter("Standby", standby);
		}
	}

	public String getAllocationId() {
		return this.allocationId;
	}

	public void setAllocationId(String allocationId) {
		this.allocationId = allocationId;
		if(allocationId != null){
			putQueryParameter("AllocationId", allocationId);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getAssociatedInstanceType() {
		return this.associatedInstanceType;
	}

	public void setAssociatedInstanceType(String associatedInstanceType) {
		this.associatedInstanceType = associatedInstanceType;
		if(associatedInstanceType != null){
			putQueryParameter("AssociatedInstanceType", associatedInstanceType);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public List<String> getEnsRegionIds() {
		return this.ensRegionIds;
	}

	public void setEnsRegionIds(List<String> ensRegionIds) {
		this.ensRegionIds = ensRegionIds;	
		if (ensRegionIds != null) {
			for (int depth1 = 0; depth1 < ensRegionIds.size(); depth1++) {
				putQueryParameter("EnsRegionIds." + (depth1 + 1) , ensRegionIds.get(depth1));
			}
		}	
	}

	public String getAssociatedInstanceId() {
		return this.associatedInstanceId;
	}

	public void setAssociatedInstanceId(String associatedInstanceId) {
		this.associatedInstanceId = associatedInstanceId;
		if(associatedInstanceId != null){
			putQueryParameter("AssociatedInstanceId", associatedInstanceId);
		}
	}

	@Override
	public Class<DescribeEnsEipAddressesResponse> getResponseClass() {
		return DescribeEnsEipAddressesResponse.class;
	}

}

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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeServerLoadBalancerListenMonitorRequest extends RpcAcsRequest<DescribeServerLoadBalancerListenMonitorResponse> {
	   

	private String startTime;

	private String loadBalancerId;

	private String proto;

	private String vPort;

	private String endTime;
	public DescribeServerLoadBalancerListenMonitorRequest() {
		super("Ens", "2017-11-10", "DescribeServerLoadBalancerListenMonitor", "ens");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.GET);
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public String getLoadBalancerId() {
		return this.loadBalancerId;
	}

	public void setLoadBalancerId(String loadBalancerId) {
		this.loadBalancerId = loadBalancerId;
		if(loadBalancerId != null){
			putQueryParameter("LoadBalancerId", loadBalancerId);
		}
	}

	public String getProto() {
		return this.proto;
	}

	public void setProto(String proto) {
		this.proto = proto;
		if(proto != null){
			putQueryParameter("Proto", proto);
		}
	}

	public String getVPort() {
		return this.vPort;
	}

	public void setVPort(String vPort) {
		this.vPort = vPort;
		if(vPort != null){
			putQueryParameter("VPort", vPort);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	@Override
	public Class<DescribeServerLoadBalancerListenMonitorResponse> getResponseClass() {
		return DescribeServerLoadBalancerListenMonitorResponse.class;
	}

}

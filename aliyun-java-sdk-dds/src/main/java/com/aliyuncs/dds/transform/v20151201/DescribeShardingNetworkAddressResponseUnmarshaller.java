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

package com.aliyuncs.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.DescribeShardingNetworkAddressResponse;
import com.aliyuncs.dds.model.v20151201.DescribeShardingNetworkAddressResponse.CompatibleConnection;
import com.aliyuncs.dds.model.v20151201.DescribeShardingNetworkAddressResponse.NetworkAddress;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeShardingNetworkAddressResponseUnmarshaller {

	public static DescribeShardingNetworkAddressResponse unmarshall(DescribeShardingNetworkAddressResponse describeShardingNetworkAddressResponse, UnmarshallerContext _ctx) {
		
		describeShardingNetworkAddressResponse.setRequestId(_ctx.stringValue("DescribeShardingNetworkAddressResponse.RequestId"));

		List<CompatibleConnection> compatibleConnections = new ArrayList<CompatibleConnection>();
		for (int i = 0; i < _ctx.lengthValue("DescribeShardingNetworkAddressResponse.CompatibleConnections.Length"); i++) {
			CompatibleConnection compatibleConnection = new CompatibleConnection();
			compatibleConnection.setVswitchId(_ctx.stringValue("DescribeShardingNetworkAddressResponse.CompatibleConnections["+ i +"].VswitchId"));
			compatibleConnection.setExpiredTime(_ctx.stringValue("DescribeShardingNetworkAddressResponse.CompatibleConnections["+ i +"].ExpiredTime"));
			compatibleConnection.setNetworkType(_ctx.stringValue("DescribeShardingNetworkAddressResponse.CompatibleConnections["+ i +"].NetworkType"));
			compatibleConnection.setPort(_ctx.stringValue("DescribeShardingNetworkAddressResponse.CompatibleConnections["+ i +"].Port"));
			compatibleConnection.setNetworkAddress(_ctx.stringValue("DescribeShardingNetworkAddressResponse.CompatibleConnections["+ i +"].NetworkAddress"));
			compatibleConnection.setVPCId(_ctx.stringValue("DescribeShardingNetworkAddressResponse.CompatibleConnections["+ i +"].VPCId"));
			compatibleConnection.setIPAddress(_ctx.stringValue("DescribeShardingNetworkAddressResponse.CompatibleConnections["+ i +"].IPAddress"));

			compatibleConnections.add(compatibleConnection);
		}
		describeShardingNetworkAddressResponse.setCompatibleConnections(compatibleConnections);

		List<NetworkAddress> networkAddresses = new ArrayList<NetworkAddress>();
		for (int i = 0; i < _ctx.lengthValue("DescribeShardingNetworkAddressResponse.NetworkAddresses.Length"); i++) {
			NetworkAddress networkAddress = new NetworkAddress();
			networkAddress.setNodeType(_ctx.stringValue("DescribeShardingNetworkAddressResponse.NetworkAddresses["+ i +"].NodeType"));
			networkAddress.setVswitchId(_ctx.stringValue("DescribeShardingNetworkAddressResponse.NetworkAddresses["+ i +"].VswitchId"));
			networkAddress.setExpiredTime(_ctx.stringValue("DescribeShardingNetworkAddressResponse.NetworkAddresses["+ i +"].ExpiredTime"));
			networkAddress.setNetworkType(_ctx.stringValue("DescribeShardingNetworkAddressResponse.NetworkAddresses["+ i +"].NetworkType"));
			networkAddress.setRole(_ctx.stringValue("DescribeShardingNetworkAddressResponse.NetworkAddresses["+ i +"].Role"));
			networkAddress.setPort(_ctx.stringValue("DescribeShardingNetworkAddressResponse.NetworkAddresses["+ i +"].Port"));
			networkAddress.setVPCId(_ctx.stringValue("DescribeShardingNetworkAddressResponse.NetworkAddresses["+ i +"].VPCId"));
			networkAddress.setNetworkAddress(_ctx.stringValue("DescribeShardingNetworkAddressResponse.NetworkAddresses["+ i +"].NetworkAddress"));
			networkAddress.setNodeId(_ctx.stringValue("DescribeShardingNetworkAddressResponse.NetworkAddresses["+ i +"].NodeId"));
			networkAddress.setIPAddress(_ctx.stringValue("DescribeShardingNetworkAddressResponse.NetworkAddresses["+ i +"].IPAddress"));
			networkAddress.setConnectionType(_ctx.stringValue("DescribeShardingNetworkAddressResponse.NetworkAddresses["+ i +"].ConnectionType"));
			networkAddress.setTxtRecord(_ctx.stringValue("DescribeShardingNetworkAddressResponse.NetworkAddresses["+ i +"].TxtRecord"));

			networkAddresses.add(networkAddress);
		}
		describeShardingNetworkAddressResponse.setNetworkAddresses(networkAddresses);
	 
	 	return describeShardingNetworkAddressResponse;
	}
}
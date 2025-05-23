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

package com.aliyuncs.rds.transform.v20140815;

import com.aliyuncs.rds.model.v20140815.DescribeResourceUsageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResourceUsageResponseUnmarshaller {

	public static DescribeResourceUsageResponse unmarshall(DescribeResourceUsageResponse describeResourceUsageResponse, UnmarshallerContext _ctx) {
		
		describeResourceUsageResponse.setRequestId(_ctx.stringValue("DescribeResourceUsageResponse.RequestId"));
		describeResourceUsageResponse.setArchiveBackupSize(_ctx.longValue("DescribeResourceUsageResponse.ArchiveBackupSize"));
		describeResourceUsageResponse.setBackupDataSize(_ctx.longValue("DescribeResourceUsageResponse.BackupDataSize"));
		describeResourceUsageResponse.setBackupLogSize(_ctx.longValue("DescribeResourceUsageResponse.BackupLogSize"));
		describeResourceUsageResponse.setBackupOssDataSize(_ctx.longValue("DescribeResourceUsageResponse.BackupOssDataSize"));
		describeResourceUsageResponse.setBackupOssLogSize(_ctx.longValue("DescribeResourceUsageResponse.BackupOssLogSize"));
		describeResourceUsageResponse.setBackupSize(_ctx.longValue("DescribeResourceUsageResponse.BackupSize"));
		describeResourceUsageResponse.setColdBackupSize(_ctx.longValue("DescribeResourceUsageResponse.ColdBackupSize"));
		describeResourceUsageResponse.setDBInstanceId(_ctx.stringValue("DescribeResourceUsageResponse.DBInstanceId"));
		describeResourceUsageResponse.setDataSize(_ctx.longValue("DescribeResourceUsageResponse.DataSize"));
		describeResourceUsageResponse.setDiskUsed(_ctx.longValue("DescribeResourceUsageResponse.DiskUsed"));
		describeResourceUsageResponse.setEngine(_ctx.stringValue("DescribeResourceUsageResponse.Engine"));
		describeResourceUsageResponse.setLogSize(_ctx.longValue("DescribeResourceUsageResponse.LogSize"));
		describeResourceUsageResponse.setPaidBackupSize(_ctx.longValue("DescribeResourceUsageResponse.PaidBackupSize"));
		describeResourceUsageResponse.setSQLSize(_ctx.longValue("DescribeResourceUsageResponse.SQLSize"));
		describeResourceUsageResponse.setBackupEcsSnapshotSize(_ctx.stringValue("DescribeResourceUsageResponse.BackupEcsSnapshotSize"));
	 
	 	return describeResourceUsageResponse;
	}
}
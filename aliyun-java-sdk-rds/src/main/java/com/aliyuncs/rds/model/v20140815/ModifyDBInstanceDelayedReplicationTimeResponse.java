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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.ModifyDBInstanceDelayedReplicationTimeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyDBInstanceDelayedReplicationTimeResponse extends AcsResponse {

	private String dBInstanceId;

	private String readSQLReplicationTime;

	private String requestId;

	private String taskId;

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
	}

	public String getReadSQLReplicationTime() {
		return this.readSQLReplicationTime;
	}

	public void setReadSQLReplicationTime(String readSQLReplicationTime) {
		this.readSQLReplicationTime = readSQLReplicationTime;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	@Override
	public ModifyDBInstanceDelayedReplicationTimeResponse getInstance(UnmarshallerContext context) {
		return	ModifyDBInstanceDelayedReplicationTimeResponseUnmarshaller.unmarshall(this, context);
	}
}

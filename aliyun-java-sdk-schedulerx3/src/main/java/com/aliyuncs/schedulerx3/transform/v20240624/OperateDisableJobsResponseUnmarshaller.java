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

package com.aliyuncs.schedulerx3.transform.v20240624;

import com.aliyuncs.schedulerx3.model.v20240624.OperateDisableJobsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OperateDisableJobsResponseUnmarshaller {

	public static OperateDisableJobsResponse unmarshall(OperateDisableJobsResponse operateDisableJobsResponse, UnmarshallerContext _ctx) {
		
		operateDisableJobsResponse.setRequestId(_ctx.stringValue("OperateDisableJobsResponse.RequestId"));
		operateDisableJobsResponse.setCode(_ctx.integerValue("OperateDisableJobsResponse.Code"));
		operateDisableJobsResponse.setMessage(_ctx.stringValue("OperateDisableJobsResponse.Message"));
		operateDisableJobsResponse.setSuccess(_ctx.booleanValue("OperateDisableJobsResponse.Success"));
	 
	 	return operateDisableJobsResponse;
	}
}
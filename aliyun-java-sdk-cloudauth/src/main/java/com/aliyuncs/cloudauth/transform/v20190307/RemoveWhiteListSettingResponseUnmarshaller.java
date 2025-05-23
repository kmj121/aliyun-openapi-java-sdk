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

package com.aliyuncs.cloudauth.transform.v20190307;

import com.aliyuncs.cloudauth.model.v20190307.RemoveWhiteListSettingResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveWhiteListSettingResponseUnmarshaller {

	public static RemoveWhiteListSettingResponse unmarshall(RemoveWhiteListSettingResponse removeWhiteListSettingResponse, UnmarshallerContext _ctx) {
		
		removeWhiteListSettingResponse.setRequestId(_ctx.stringValue("RemoveWhiteListSettingResponse.RequestId"));
		removeWhiteListSettingResponse.setCode(_ctx.stringValue("RemoveWhiteListSettingResponse.Code"));
		removeWhiteListSettingResponse.setMessage(_ctx.stringValue("RemoveWhiteListSettingResponse.Message"));
		removeWhiteListSettingResponse.setSuccess(_ctx.booleanValue("RemoveWhiteListSettingResponse.Success"));
		removeWhiteListSettingResponse.setResultObject(_ctx.booleanValue("RemoveWhiteListSettingResponse.ResultObject"));
	 
	 	return removeWhiteListSettingResponse;
	}
}
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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.DeleteBizEntityResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteBizEntityResponseUnmarshaller {

	public static DeleteBizEntityResponse unmarshall(DeleteBizEntityResponse deleteBizEntityResponse, UnmarshallerContext _ctx) {
		
		deleteBizEntityResponse.setRequestId(_ctx.stringValue("DeleteBizEntityResponse.RequestId"));
		deleteBizEntityResponse.setSuccess(_ctx.booleanValue("DeleteBizEntityResponse.Success"));
		deleteBizEntityResponse.setHttpStatusCode(_ctx.integerValue("DeleteBizEntityResponse.HttpStatusCode"));
		deleteBizEntityResponse.setCode(_ctx.stringValue("DeleteBizEntityResponse.Code"));
		deleteBizEntityResponse.setMessage(_ctx.stringValue("DeleteBizEntityResponse.Message"));
	 
	 	return deleteBizEntityResponse;
	}
}
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

package com.aliyuncs.nas.transform.v20170626;

import com.aliyuncs.nas.model.v20170626.EnableNfsAclResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableNfsAclResponseUnmarshaller {

	public static EnableNfsAclResponse unmarshall(EnableNfsAclResponse enableNfsAclResponse, UnmarshallerContext _ctx) {
		
		enableNfsAclResponse.setRequestId(_ctx.stringValue("EnableNfsAclResponse.RequestId"));
	 
	 	return enableNfsAclResponse;
	}
}
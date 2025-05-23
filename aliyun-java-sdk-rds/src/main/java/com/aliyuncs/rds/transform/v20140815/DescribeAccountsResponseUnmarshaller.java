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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeAccountsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeAccountsResponse.DBInstanceAccount;
import com.aliyuncs.rds.model.v20140815.DescribeAccountsResponse.DBInstanceAccount.DatabasePrivilege;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccountsResponseUnmarshaller {

	public static DescribeAccountsResponse unmarshall(DescribeAccountsResponse describeAccountsResponse, UnmarshallerContext _ctx) {
		
		describeAccountsResponse.setRequestId(_ctx.stringValue("DescribeAccountsResponse.RequestId"));
		describeAccountsResponse.setPageNumber(_ctx.integerValue("DescribeAccountsResponse.PageNumber"));
		describeAccountsResponse.setSystemAdminAccountFirstActivationTime(_ctx.stringValue("DescribeAccountsResponse.SystemAdminAccountFirstActivationTime"));
		describeAccountsResponse.setSystemAdminAccountStatus(_ctx.stringValue("DescribeAccountsResponse.SystemAdminAccountStatus"));
		describeAccountsResponse.setTotalRecordCount(_ctx.integerValue("DescribeAccountsResponse.TotalRecordCount"));
		describeAccountsResponse.setResourceGroupId(_ctx.stringValue("DescribeAccountsResponse.ResourceGroupId"));

		List<DBInstanceAccount> accounts = new ArrayList<DBInstanceAccount>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAccountsResponse.Accounts.Length"); i++) {
			DBInstanceAccount dBInstanceAccount = new DBInstanceAccount();
			dBInstanceAccount.setAccountDescription(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountDescription"));
			dBInstanceAccount.setAccountName(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountName"));
			dBInstanceAccount.setAccountStatus(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountStatus"));
			dBInstanceAccount.setAccountType(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountType"));
			dBInstanceAccount.setBypassRLS(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].BypassRLS"));
			dBInstanceAccount.setCheckPolicy(_ctx.booleanValue("DescribeAccountsResponse.Accounts["+ i +"].CheckPolicy"));
			dBInstanceAccount.setCreateDB(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].CreateDB"));
			dBInstanceAccount.setCreateRole(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].CreateRole"));
			dBInstanceAccount.setDBInstanceId(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].DBInstanceId"));
			dBInstanceAccount.setPasswordExpireTime(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].PasswordExpireTime"));
			dBInstanceAccount.setPrivExceeded(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].PrivExceeded"));
			dBInstanceAccount.setReplication(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].Replication"));
			dBInstanceAccount.setValidUntil(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].ValidUntil"));

			List<DatabasePrivilege> databasePrivileges = new ArrayList<DatabasePrivilege>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAccountsResponse.Accounts["+ i +"].DatabasePrivileges.Length"); j++) {
				DatabasePrivilege databasePrivilege = new DatabasePrivilege();
				databasePrivilege.setAccountPrivilege(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].DatabasePrivileges["+ j +"].AccountPrivilege"));
				databasePrivilege.setAccountPrivilegeDetail(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].DatabasePrivileges["+ j +"].AccountPrivilegeDetail"));
				databasePrivilege.setDBName(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].DatabasePrivileges["+ j +"].DBName"));

				databasePrivileges.add(databasePrivilege);
			}
			dBInstanceAccount.setDatabasePrivileges(databasePrivileges);

			accounts.add(dBInstanceAccount);
		}
		describeAccountsResponse.setAccounts(accounts);
	 
	 	return describeAccountsResponse;
	}
}
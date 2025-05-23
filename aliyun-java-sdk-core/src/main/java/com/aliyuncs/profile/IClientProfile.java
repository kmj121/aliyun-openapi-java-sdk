package com.aliyuncs.profile;

import com.aliyuncs.auth.AlibabaCloudCredentialsProvider;
import com.aliyuncs.auth.Credential;
import com.aliyuncs.auth.ISigner;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpClientConfig;
import org.slf4j.Logger;

public interface IClientProfile {

    /**
     * @deprecated : Use Signer.getSigner(AlibabaCloudCredentials credentials) instead of this
     */
    @Deprecated
    ISigner getSigner();

    String getRegionId();

    FormatType getFormat();

    AlibabaCloudCredentialsProvider getCredentialsProvider();

    /**
     * @deprecated : Use AlibabaCloudCredentialsProvider getCredentials() instead of this
     */
    @Deprecated
    Credential getCredential();

    /**
     * This method exists because ClientProfile holds too much modules like endpoint management
     *
     * @deprecated : Use DefaultAcsClient(IClientProfile profile, AlibabaCloudCredentialsProvider credentialsProvider) instead of this
     */
    @Deprecated
    void setCredentialsProvider(AlibabaCloudCredentialsProvider credentialsProvider);

    /**
     * use HttpClientConfig.getCertPath instead
     */
    @Deprecated
    String getCertPath();

    /**
     * use HttpClientConfig.setCertPath instead
     *
     * @param certPath
     */
    @Deprecated
    void setCertPath(String certPath);

    /**
     * http client configs
     */
    HttpClientConfig getHttpClientConfig();

    void setHttpClientConfig(HttpClientConfig httpClientConfig);

    void enableUsingInternalLocationService();

    boolean isUsingInternalLocationService();

    boolean isUsingVpcEndpoint();

    void enableUsingVpcEndpoint();

    /**
     * @Deprecated : Use enableUsingInternalLocationService instead of this
     */
    @Deprecated
    void setUsingInternalLocationService();

    Logger getLogger();

    void setLogger(Logger logger);

    String getLogFormat();

    void setLogFormat(String logFormat);

    boolean isCloseTrace();

    void setCloseTrace(boolean closeTrace);

    String getLocationServiceEndpoint();

    void setLocationServiceEndpoint(String locationServiceEndpoint);

    String getLocationServiceApiVersion();

    void setLocationServiceApiVersion(String locationServiceApiVersion);
}

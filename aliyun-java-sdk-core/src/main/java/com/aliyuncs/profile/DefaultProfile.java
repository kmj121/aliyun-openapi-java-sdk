package com.aliyuncs.profile;

import com.aliyuncs.auth.*;
import com.aliyuncs.endpoint.DefaultEndpointResolver;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpClientConfig;
import com.aliyuncs.utils.ParameterHelper;
import org.slf4j.Logger;

import static com.aliyuncs.utils.LogUtils.DEFAULT_LOG_FORMAT;

@SuppressWarnings("deprecation")
public class DefaultProfile implements IClientProfile {
    private static DefaultProfile profile = null;
    private String regionId = null;
    private FormatType acceptFormat = null;
    private ICredentialProvider icredential = null;
    private volatile AlibabaCloudCredentialsProvider credentialsProvider = null;
    private Credential credential;
    private String certPath;
    private HttpClientConfig httpClientConfig = HttpClientConfig.getDefault();
    private boolean usingInternalLocationService = false;
    private boolean usingVpcEndpoint = false;
    private Logger logger;
    private String logFormat = DEFAULT_LOG_FORMAT;
    private boolean isCloseTrace = false;
    private String locationServiceEndpoint = null;
    private String locationServiceApiVersion = null;

    private DefaultProfile() {
    }

    private DefaultProfile(String regionId) {
        this.regionId = regionId;
    }

    private DefaultProfile(String regionId, Credential creden) {
        this.credential = creden;
        this.regionId = regionId;
    }

    private DefaultProfile(String region, ICredentialProvider icredential) {
        this.regionId = region;
        this.icredential = icredential;
    }

    public synchronized static DefaultProfile getProfile() {
        if (null == profile) {
            profile = new DefaultProfile();
        }
        return profile;
    }

    /**
     * @deprecated : Use DefaultAcsClient(IClientProfile profile, AlibabaCloudCredentialsProvider credentialsProvider) instead of this
     */
    @Deprecated
    public synchronized static DefaultProfile getProfile(String regionId, ICredentialProvider icredential) {
        profile = new DefaultProfile(regionId, icredential);
        return profile;
    }

    public synchronized static DefaultProfile getProfile(String regionId, String accessKeyId, String secret) {
        profile = new DefaultProfile(regionId, new Credential(accessKeyId, secret));
        return profile;
    }

    public synchronized static DefaultProfile getProfile(String regionId, String accessKeyId, String secret,
                                                         String stsToken) {
        Credential creden = new Credential(accessKeyId, secret, stsToken);
        profile = new DefaultProfile(regionId, creden);
        return profile;
    }

    public synchronized static DefaultProfile getProfile(String regionId) {
        return new DefaultProfile(regionId);
    }

    /**
     * @deprecated : Use addEndpoint(String regionId, String product, String endpoint) instead of this
     */
    @Deprecated
    public synchronized static void addEndpoint(String endpointName, String regionId, String product, String domain) {
        addEndpoint(endpointName, regionId, product, domain, true);
    }

    /**
     * @deprecated : Use addEndpoint(String regionId, String product, String endpoint) instead of this
     */
    @Deprecated
    public synchronized static void addEndpoint(String endpointName, String regionId, String product, String domain,
                                                boolean isNeverExpire) {
        // endpointName, isNeverExpire take no effect
        addEndpoint(regionId, product, domain);
    }

    public synchronized static void addEndpoint(String regionId, String product, String endpoint) {
        ParameterHelper.validateParameter(regionId, "regionId");
        DefaultEndpointResolver.predefinedEndpointResolver.putEndpointEntry(regionId, product, endpoint);
    }

    @Override
    public synchronized String getRegionId() {
        return regionId;
    }

    @Override
    public synchronized FormatType getFormat() {
        return acceptFormat;
    }

    @Override
    public AlibabaCloudCredentialsProvider getCredentialsProvider() {
        return credentialsProvider;
    }

    @Override
    public synchronized Credential getCredential() {
        if (null == credential && null != icredential) {
            credential = icredential.fresh();
        }
        return credential;
    }

    @Override
    @Deprecated
    public ISigner getSigner() {
        return null;
    }


    /**
     * @deprecated : Use DefaultAcsClient(IClientProfile profile, AlibabaCloudCredentialsProvider credentialsProvider) instead of this
     */
    @Override
    @Deprecated
    public void setCredentialsProvider(AlibabaCloudCredentialsProvider credentialsProvider) {
        if (credential == null) {
            credential = new CredentialsBackupCompatibilityAdaptor(credentialsProvider);
        }
        this.credentialsProvider = credentialsProvider;
    }

    @Override
    public String getCertPath() {
        return certPath;
    }

    @Override
    public void setCertPath(String certPath) {
        this.certPath = certPath;
    }

    @Override
    public HttpClientConfig getHttpClientConfig() {
        return httpClientConfig;
    }

    @Override
    public void setHttpClientConfig(HttpClientConfig httpClientConfig) {
        this.httpClientConfig = httpClientConfig;
    }

    @Override
    public void enableUsingInternalLocationService() {
        usingInternalLocationService = true;
    }

    @Override
    public boolean isUsingInternalLocationService() {
        return usingInternalLocationService;
    }

    @Override
    public boolean isUsingVpcEndpoint() {
        return usingVpcEndpoint;
    }

    @Override
    public void enableUsingVpcEndpoint() {
        this.usingVpcEndpoint = true;
    }

    /**
     * @deprecated : use enableUsingInternalLocationService instead of this.
     */
    @Override
    @Deprecated
    public void setUsingInternalLocationService() {
        enableUsingInternalLocationService();
    }

    @Override
    public Logger getLogger() {
        return logger;
    }

    @Override
    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    @Override
    public String getLogFormat() {
        return logFormat;
    }

    @Override
    public void setLogFormat(String logFormat) {
        this.logFormat = logFormat;
    }

    @Override
    public boolean isCloseTrace() {
        return isCloseTrace;
    }

    @Override
    public void setCloseTrace(boolean closeTrace) {
        isCloseTrace = closeTrace;
    }

    @Override
    public String getLocationServiceEndpoint() {
        return locationServiceEndpoint;
    }

    @Override
    public void setLocationServiceEndpoint(String locationServiceEndpoint) {
        this.locationServiceEndpoint = locationServiceEndpoint;
    }

    @Override
    public String getLocationServiceApiVersion() {
        return locationServiceApiVersion;
    }

    @Override
    public void setLocationServiceApiVersion(String locationServiceApiVersion) {
        this.locationServiceApiVersion = locationServiceApiVersion;
    }
}

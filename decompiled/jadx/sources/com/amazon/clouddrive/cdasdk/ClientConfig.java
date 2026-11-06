package com.amazon.clouddrive.cdasdk;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.clouddrive.cdasdk.aps.common.DevicePlatform;
import java.security.InvalidParameterException;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import lombok.Generated;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ClientConfig {

    @NonNull
    private final Context appContext;
    private String appVersionName;

    @NonNull
    private final String applicationId;
    private DevicePlatform apsDevicePlatform;
    private String clientName;
    private long connectTimeoutMs;

    @NonNull
    private EndpointConfiguration endpointConfiguration;
    private long readTimeoutMs;
    private RequestLoggingConfig requestLoggingConfig;
    private SdkMetrics sdkMetrics;
    private SocketFactory socketFactory;
    private SSLConfiguration sslConfiguration;

    @NonNull
    private final TokenProvider tokenProvider;

    @NonNull
    private final String userAgent;
    private long writeTimeoutMs;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {

        @NonNull
        private final Context appContext;

        @Nullable
        private String appVersionName;

        @NonNull
        private final String applicationId;

        @NonNull
        private final String clientName;

        @Nullable
        private DevicePlatform devicePlatform;

        @NonNull
        private final TokenProvider tokenProvider;

        @NonNull
        private final String userAgent;

        @NonNull
        private EndpointConfiguration endpointConfiguration = new DefaultEndpointConfiguration();
        private long connectTimeoutMs = 60000;
        private long readTimeoutMs = 60000;
        private long writeTimeoutMs = 60000;

        @NonNull
        private RequestLoggingConfig requestLoggingConfig = new RequestLoggingConfig();

        @NonNull
        private SocketFactory socketFactory = SocketFactory.getDefault();

        @NonNull
        private SSLConfiguration sslConfiguration = SSLConfiguration.SAFE;

        @NonNull
        private SdkMetrics sdkMetrics = new NoOpSdkMetrics();

        public Builder(@NonNull Context context, @NonNull TokenProvider tokenProvider, @NonNull String str, @NonNull String str2, @NonNull String str3) {
            this.appContext = context;
            this.tokenProvider = tokenProvider;
            this.userAgent = str;
            this.applicationId = str2;
            this.clientName = str3;
        }

        @NonNull
        public ClientConfig build() throws InvalidParameterException {
            ClientConfig clientConfig = new ClientConfig(this.appContext, this.tokenProvider, this.userAgent, this.applicationId, this.endpointConfiguration, this.clientName);
            clientConfig.setRequestLoggingConfig(this.requestLoggingConfig);
            clientConfig.setSocketFactory(this.socketFactory);
            clientConfig.setSslConfiguration(this.sslConfiguration);
            clientConfig.setConnectTimeoutMs(this.connectTimeoutMs);
            clientConfig.setReadTimeoutMs(this.readTimeoutMs);
            clientConfig.setWriteTimeoutMs(this.writeTimeoutMs);
            clientConfig.setSdkMetrics(this.sdkMetrics);
            clientConfig.setApsDevicePlatform(this.devicePlatform);
            clientConfig.setAppVersionName(this.appVersionName);
            return clientConfig;
        }

        public Builder withAPSDevicePlatform(@NonNull DevicePlatform devicePlatform) {
            this.devicePlatform = devicePlatform;
            return this;
        }

        public Builder withAppVersionName(@NonNull String str) {
            this.appVersionName = str;
            return this;
        }

        public Builder withConnectTimeoutMs(long j) {
            this.connectTimeoutMs = j;
            return this;
        }

        public Builder withEndpointConfiguration(@NonNull EndpointConfiguration endpointConfiguration) {
            this.endpointConfiguration = endpointConfiguration;
            return this;
        }

        public Builder withReadTimeoutMs(long j) {
            this.readTimeoutMs = j;
            return this;
        }

        public Builder withRequestLoggingConfig(@NonNull RequestLoggingConfig requestLoggingConfig) {
            this.requestLoggingConfig = requestLoggingConfig;
            return this;
        }

        public Builder withSSLConfiguration(@NonNull SSLConfiguration sSLConfiguration) {
            this.sslConfiguration = sSLConfiguration;
            return this;
        }

        public Builder withSdkMetrics(@NonNull SdkMetrics sdkMetrics) {
            this.sdkMetrics = sdkMetrics;
            return this;
        }

        public Builder withSocketFactory(@NonNull SocketFactory socketFactory) {
            this.socketFactory = socketFactory;
            return this;
        }

        public Builder withWriteTimeoutMs(long j) {
            this.writeTimeoutMs = j;
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum SSLConfiguration {
        SAFE
    }

    private ClientConfig(@NonNull Context context, @NonNull TokenProvider tokenProvider, @NonNull String str, @NonNull String str2, @NonNull EndpointConfiguration endpointConfiguration, @NonNull String str3) {
        this.appContext = context;
        this.tokenProvider = tokenProvider;
        this.userAgent = str;
        this.applicationId = str2;
        this.endpointConfiguration = endpointConfiguration;
        this.clientName = str3;
    }

    @NonNull
    @Generated
    public Context getAppContext() {
        return this.appContext;
    }

    @Generated
    public String getAppVersionName() {
        return this.appVersionName;
    }

    @NonNull
    @Generated
    public String getApplicationId() {
        return this.applicationId;
    }

    @Generated
    public DevicePlatform getApsDevicePlatform() {
        return this.apsDevicePlatform;
    }

    @Generated
    public String getClientName() {
        return this.clientName;
    }

    @Generated
    public long getConnectTimeoutMs() {
        return this.connectTimeoutMs;
    }

    @NonNull
    @Generated
    public EndpointConfiguration getEndpointConfiguration() {
        return this.endpointConfiguration;
    }

    @Generated
    public long getReadTimeoutMs() {
        return this.readTimeoutMs;
    }

    @Generated
    public RequestLoggingConfig getRequestLoggingConfig() {
        return this.requestLoggingConfig;
    }

    @Generated
    public SdkMetrics getSdkMetrics() {
        return this.sdkMetrics;
    }

    @Generated
    public SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    @Generated
    public SSLConfiguration getSslConfiguration() {
        return this.sslConfiguration;
    }

    @NonNull
    @Generated
    public TokenProvider getTokenProvider() {
        return this.tokenProvider;
    }

    @NonNull
    @Generated
    public String getUserAgent() {
        return this.userAgent;
    }

    @Generated
    public long getWriteTimeoutMs() {
        return this.writeTimeoutMs;
    }

    @Generated
    public void setAppVersionName(String str) {
        this.appVersionName = str;
    }

    @Generated
    public void setApsDevicePlatform(DevicePlatform devicePlatform) {
        this.apsDevicePlatform = devicePlatform;
    }

    @Generated
    public void setClientName(String str) {
        this.clientName = str;
    }

    @Generated
    public void setConnectTimeoutMs(long j) {
        this.connectTimeoutMs = j;
    }

    @Generated
    public void setEndpointConfiguration(@NonNull EndpointConfiguration endpointConfiguration) {
        if (endpointConfiguration != null) {
            this.endpointConfiguration = endpointConfiguration;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("endpointConfiguration is marked non-null but is null");
        }
    }

    @Generated
    public void setReadTimeoutMs(long j) {
        this.readTimeoutMs = j;
    }

    @Generated
    public void setRequestLoggingConfig(RequestLoggingConfig requestLoggingConfig) {
        this.requestLoggingConfig = requestLoggingConfig;
    }

    @Generated
    public void setSdkMetrics(SdkMetrics sdkMetrics) {
        this.sdkMetrics = sdkMetrics;
    }

    @Generated
    public void setSocketFactory(SocketFactory socketFactory) {
        this.socketFactory = socketFactory;
    }

    @Generated
    public void setSslConfiguration(SSLConfiguration sSLConfiguration) {
        this.sslConfiguration = sSLConfiguration;
    }

    @Generated
    public void setWriteTimeoutMs(long j) {
        this.writeTimeoutMs = j;
    }
}

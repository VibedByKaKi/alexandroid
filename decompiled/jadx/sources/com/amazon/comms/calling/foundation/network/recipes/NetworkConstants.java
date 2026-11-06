package com.amazon.comms.calling.foundation.network.recipes;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/amazon/comms/calling/foundation/network/recipes/NetworkConstants;", "", "<init>", "()V", "ACMS_BASE_URL", "", "DEFAULT_SIP_PROXY", "DEFAULT_SIP_PROXY_PORT", "CALLING_NETWORK_METRIC_FORMAT", "CALLING_CLIENT_METRIC_FORMAT", "ALEXA_COMMS_CALLING_CLIENT", "ACMS_URL_KEY", "ALEXA_APP_SOURCE", "ACMS_HEADER_REQUEST_ID", "ACMS_HEADER_CLIENT_ID", "USER_AGENT", "ACCEPT_LANGUAGE", "ACCEPT_PFM", "ABOVE_MIN_VERSION", "DEVICE_VERSION", "META_ERROR_SOURCE", "META_REQUEST_ID", "META_STATUS_CODE", "META_SOURCE", "PATH", "NAMES", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class NetworkConstants {

    @NotNull
    public static final String ABOVE_MIN_VERSION = "X-Alexa-AboveMinVersion";

    @NotNull
    public static final String ACCEPT_LANGUAGE = "Accept-Language";

    @NotNull
    public static final String ACCEPT_PFM = "Accept-PFM";

    @NotNull
    public static final String ACMS_BASE_URL = "https://alexa-comms-mobile-service.amazon.com";

    @NotNull
    public static final String ACMS_HEADER_CLIENT_ID = "X-Amzn-ClientId";

    @NotNull
    public static final String ACMS_HEADER_REQUEST_ID = "X-Amzn-RequestId";

    @NotNull
    public static final String ACMS_URL_KEY = "ACMS.Endpoints.PFM.${PFM}";

    @NotNull
    public static final String ALEXA_APP_SOURCE = "AlexaApp";

    @NotNull
    public static final String ALEXA_COMMS_CALLING_CLIENT = "AlexaCommsCallingClient";

    @NotNull
    public static final String CALLING_CLIENT_METRIC_FORMAT = "com.alexa.comms.api.%s.client";

    @NotNull
    public static final String CALLING_NETWORK_METRIC_FORMAT = "com.alexa.comms.api.%s.network";

    @NotNull
    public static final String DEFAULT_SIP_PROXY = "sips:prod.amcs-tachyon.com:443";

    @NotNull
    public static final String DEFAULT_SIP_PROXY_PORT = "443";

    @NotNull
    public static final String DEVICE_VERSION = "X-Alexa-DeviceVersion";

    @NotNull
    public static final NetworkConstants INSTANCE = new NetworkConstants();

    @NotNull
    public static final String META_ERROR_SOURCE = "errorSource";

    @NotNull
    public static final String META_REQUEST_ID = "requestId";

    @NotNull
    public static final String META_SOURCE = "source";

    @NotNull
    public static final String META_STATUS_CODE = "statusCode";

    @NotNull
    public static final String USER_AGENT = "User-Agent";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/amazon/comms/calling/foundation/network/recipes/NetworkConstants$NAMES;", "", "<init>", "()V", "GET_ACCOUNTS", "", "GET_IDENTITY", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NAMES {

        @NotNull
        public static final String GET_ACCOUNTS = "getAccounts";

        @NotNull
        public static final String GET_IDENTITY = "getIdentity";

        @NotNull
        public static final NAMES INSTANCE = new NAMES();

        private NAMES() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/amazon/comms/calling/foundation/network/recipes/NetworkConstants$PATH;", "", "<init>", "()V", "GET_IDENTITY", "", "GET_ACCOUNTS", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PATH {

        @NotNull
        public static final String GET_ACCOUNTS = "/accounts";

        @NotNull
        public static final String GET_IDENTITY = "/users/{0}/identities";

        @NotNull
        public static final PATH INSTANCE = new PATH();

        private PATH() {
        }
    }

    private NetworkConstants() {
    }
}

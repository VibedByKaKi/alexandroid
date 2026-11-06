package com.amazon.alexa.client.alexaservice.networking.downchannel;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.Feature;
import com.amazon.alexa.client.alexaservice.base.capabilities.discovery.DiscoveryFeatureChecker;
import com.amazon.alexa.client.alexaservice.base.feature.FeatureFlagConfigurationAuthority;
import com.amazon.alexa.client.alexaservice.networking.bootstrap.ConnectionSetupFeatureChecker;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class DownchannelStatusTracker {
    private static final String TAG = "DownchannelStatusTracker";
    private final ConnectionSetupFeatureChecker connectionSetupFeatureChecker;
    private final DiscoveryFeatureChecker discoveryFeatureChecker;
    private volatile Exception downchannelException;
    private volatile Integer downchannelFailureStatusCode;
    private final FeatureFlagConfigurationAuthority featureFlagConfigurationAuthority;
    private volatile Exception publishCapabilitiesException;
    private volatile Integer publishCapabilitiesFailureStatusCode;
    private volatile Exception synchronizeStateException;
    private volatile Integer synchronizeStateFailureStatusCode;
    private volatile Exception verifyAlexaGatewayException;
    private volatile Integer verifyAlexaGatewayFailureStatusCode;
    private volatile boolean uninitialized = true;
    private volatile boolean waitingForNetworkConnectivity = true;
    private volatile boolean waitingForAuthorization = false;
    private volatile boolean waitingForInternalCapabilitiesRefresh = true;
    private volatile boolean waitingForExternalCapabilitiesRefresh = true;
    private volatile boolean waitingForDownchannelConnection = true;
    private volatile boolean waitingForDownchannel = true;
    private volatile boolean waitingForCapabilityPublish = true;
    private volatile boolean waitingForSynchronizeState = true;
    private volatile boolean waitingForVerifyAlexaGateway = true;
    private volatile boolean capabilityPublishInBackground = false;
    private volatile boolean backgroundPublishRetryPending = false;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DownchannelStatus {
        private final Status status;
        public static final DownchannelStatus UNINITIALIZED = new DownchannelStatus(Status.UNINITIALIZED);
        public static final DownchannelStatus UNAUTHORIZED = new DownchannelStatus(Status.UNAUTHORIZED);
        public static final DownchannelStatus NETWORK = new DownchannelStatus(Status.NETWORK);
        public static final DownchannelStatus REFRESH_INTERNAL_CAPABILITIES = new DownchannelStatus(Status.REFRESH_INTERNAL_CAPABILITIES);
        public static final DownchannelStatus REFRESH_EXTERNAL_CAPABILITIES = new DownchannelStatus(Status.REFRESH_EXTERNAL_CAPABILITIES);
        public static final DownchannelStatus CONNECTION_NOT_ESTABLISHED = new DownchannelStatus(Status.CONNECTION_NOT_ESTABLISHED);
        public static final DownchannelStatus CONNECTION_NOT_CONNECTED = new DownchannelStatus(Status.CONNECTION_NOT_CONNECTED);
        public static final DownchannelStatus AVAILABLE = new DownchannelStatus(Status.AVAILABLE);

        @VisibleForTesting
        public DownchannelStatus(Status status) {
            this.status = status;
        }

        public DownchannelErrorStatus asErrorStatus() {
            throw new UnsupportedOperationException();
        }

        public DownchannelExceptionStatus asExceptionStatus() {
            throw new UnsupportedOperationException();
        }

        public Status getStatus() {
            return this.status;
        }

        public boolean isCausedByException() {
            return false;
        }

        public boolean isCausedByHttpError() {
            return false;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Status {
        UNINITIALIZED,
        UNAUTHORIZED,
        REFRESH_INTERNAL_CAPABILITIES,
        REFRESH_EXTERNAL_CAPABILITIES,
        NETWORK,
        CONNECTION_NOT_ESTABLISHED,
        CONNECTION_NOT_CONNECTED,
        CAPABILITY_PUBLISH,
        VERIFY_ALEXA_GATEWAY,
        SYNCHRONIZE_STATE,
        AVAILABLE
    }

    @Inject
    public DownchannelStatusTracker(FeatureFlagConfigurationAuthority featureFlagConfigurationAuthority, DiscoveryFeatureChecker discoveryFeatureChecker, ConnectionSetupFeatureChecker connectionSetupFeatureChecker) {
        this.featureFlagConfigurationAuthority = featureFlagConfigurationAuthority;
        this.discoveryFeatureChecker = discoveryFeatureChecker;
        this.connectionSetupFeatureChecker = connectionSetupFeatureChecker;
    }

    private DownchannelStatus getWaitingForCapabilityPublishState() {
        return this.publishCapabilitiesFailureStatusCode != null ? new DownchannelErrorStatus(Status.CAPABILITY_PUBLISH, this.publishCapabilitiesFailureStatusCode.intValue()) : this.publishCapabilitiesException != null ? new DownchannelExceptionStatus(Status.CAPABILITY_PUBLISH, this.publishCapabilitiesException) : new DownchannelStatus(Status.CAPABILITY_PUBLISH);
    }

    private DownchannelStatus getWaitingForDownchannelState() {
        return this.downchannelFailureStatusCode != null ? new DownchannelErrorStatus(Status.CONNECTION_NOT_ESTABLISHED, this.downchannelFailureStatusCode.intValue()) : this.downchannelException != null ? new DownchannelExceptionStatus(Status.CONNECTION_NOT_ESTABLISHED, this.downchannelException) : DownchannelStatus.CONNECTION_NOT_ESTABLISHED;
    }

    private DownchannelStatus getWaitingForSynchronizeStateState() {
        return this.synchronizeStateFailureStatusCode != null ? this.waitingForCapabilityPublish ? getWaitingForCapabilityPublishState() : new DownchannelErrorStatus(Status.SYNCHRONIZE_STATE, this.synchronizeStateFailureStatusCode.intValue()) : this.synchronizeStateException != null ? new DownchannelExceptionStatus(Status.SYNCHRONIZE_STATE, this.synchronizeStateException) : this.waitingForCapabilityPublish ? getWaitingForCapabilityPublishState() : new DownchannelStatus(Status.SYNCHRONIZE_STATE);
    }

    private DownchannelStatus getWaitingForVerifyAlexaGatewayState() {
        return this.verifyAlexaGatewayFailureStatusCode != null ? new DownchannelErrorStatus(Status.VERIFY_ALEXA_GATEWAY, this.verifyAlexaGatewayFailureStatusCode.intValue()) : this.verifyAlexaGatewayException != null ? new DownchannelExceptionStatus(Status.VERIFY_ALEXA_GATEWAY, this.verifyAlexaGatewayException) : new DownchannelStatus(Status.VERIFY_ALEXA_GATEWAY);
    }

    private boolean isWaitingForBlockingCapabilityPublish() {
        return this.waitingForSynchronizeState && this.waitingForCapabilityPublish && !this.capabilityPublishInBackground && !this.backgroundPublishRetryPending && this.connectionSetupFeatureChecker.isNonBlockingSyncEnabled();
    }

    public void clear() {
        this.downchannelException = null;
        this.downchannelFailureStatusCode = null;
        this.publishCapabilitiesException = null;
        this.publishCapabilitiesFailureStatusCode = null;
        this.synchronizeStateException = null;
        this.synchronizeStateFailureStatusCode = null;
        if (this.discoveryFeatureChecker.isApiGatewayEnabled()) {
            this.verifyAlexaGatewayFailureStatusCode = null;
            this.verifyAlexaGatewayException = null;
        }
        this.uninitialized = false;
        this.waitingForExternalCapabilitiesRefresh = false;
        this.waitingForInternalCapabilitiesRefresh = false;
        this.waitingForNetworkConnectivity = false;
        this.waitingForAuthorization = false;
        this.waitingForDownchannelConnection = false;
        this.waitingForDownchannel = false;
        if (!this.capabilityPublishInBackground && !this.backgroundPublishRetryPending) {
            this.waitingForCapabilityPublish = false;
        }
        if (!this.featureFlagConfigurationAuthority.isEnabled(Feature.ALEXA_A4A_ANDROID_SDK_COLD_START_LATENCY_NON_CRITICAL_SYNCHRONIZE_STATE) || !this.discoveryFeatureChecker.isApiGatewayEnabled()) {
            this.waitingForSynchronizeState = false;
        }
        if (this.discoveryFeatureChecker.isApiGatewayEnabled()) {
            this.waitingForVerifyAlexaGateway = false;
        }
    }

    public void failedToSynchronizeState(@Nullable Integer num, @Nullable Exception exc) {
        this.synchronizeStateFailureStatusCode = num;
        this.synchronizeStateException = exc;
    }

    public void failedToVerifyAlexaGateway(@Nullable Integer num, @Nullable Exception exc) {
        this.verifyAlexaGatewayFailureStatusCode = num;
        this.verifyAlexaGatewayException = exc;
    }

    public DownchannelStatus getStatus() {
        return this.uninitialized ? DownchannelStatus.UNINITIALIZED : this.waitingForInternalCapabilitiesRefresh ? DownchannelStatus.REFRESH_INTERNAL_CAPABILITIES : this.waitingForExternalCapabilitiesRefresh ? DownchannelStatus.REFRESH_EXTERNAL_CAPABILITIES : this.waitingForAuthorization ? DownchannelStatus.UNAUTHORIZED : this.waitingForNetworkConnectivity ? DownchannelStatus.NETWORK : this.waitingForDownchannel ? getWaitingForDownchannelState() : this.waitingForDownchannelConnection ? DownchannelStatus.CONNECTION_NOT_CONNECTED : (this.waitingForVerifyAlexaGateway && this.discoveryFeatureChecker.isApiGatewayEnabled()) ? getWaitingForVerifyAlexaGatewayState() : (!this.waitingForSynchronizeState || (this.featureFlagConfigurationAuthority.isEnabled(Feature.ALEXA_A4A_ANDROID_SDK_COLD_START_LATENCY_NON_CRITICAL_SYNCHRONIZE_STATE) && this.discoveryFeatureChecker.isApiGatewayEnabled()) || this.connectionSetupFeatureChecker.isNonBlockingSyncEnabled()) ? isWaitingForBlockingCapabilityPublish() ? getWaitingForCapabilityPublishState() : DownchannelStatus.AVAILABLE : getWaitingForSynchronizeStateState();
    }

    public void invalidAuthorization() {
        this.waitingForAuthorization = true;
    }

    public boolean isBackgroundPublishRetryPending() {
        return this.backgroundPublishRetryPending;
    }

    public boolean isCapabilityPublishInBackground() {
        return this.capabilityPublishInBackground;
    }

    public boolean isInitialized() {
        return !this.uninitialized;
    }

    public boolean isWaitingForCapabilityPublish() {
        return this.waitingForCapabilityPublish;
    }

    public boolean isWaitingForDownchannelConnection() {
        return this.waitingForDownchannelConnection;
    }

    public boolean isWaitingForDownchannelConnectivity() {
        return this.waitingForDownchannel;
    }

    public boolean isWaitingForExternalCapabilitiesRefresh() {
        return this.waitingForExternalCapabilitiesRefresh;
    }

    public boolean isWaitingForInternalCapabilitiesRefresh() {
        return this.waitingForInternalCapabilitiesRefresh;
    }

    public boolean isWaitingForNetworkConnectivity() {
        return this.waitingForNetworkConnectivity;
    }

    public boolean isWaitingForSynchronizeState() {
        return this.waitingForSynchronizeState;
    }

    public boolean isWaitingForVerifyAlexaGateway() {
        return this.waitingForVerifyAlexaGateway;
    }

    public void publishCapabilitiesFailedNoNetwork() {
        this.waitingForNetworkConnectivity = true;
        this.waitingForCapabilityPublish = true;
    }

    public void setBackgroundPublishRetryPending(boolean z) {
        this.backgroundPublishRetryPending = z;
    }

    public void setCapabilityPublishInBackground(boolean z) {
        this.capabilityPublishInBackground = z;
    }

    public void setDownchannelException(@Nullable Exception exc) {
        this.downchannelException = exc;
    }

    public void setDownchannelFailureStatusCode(@Nullable Integer num) {
        this.downchannelFailureStatusCode = num;
    }

    public void setInitialized() {
        this.uninitialized = false;
    }

    public void setPublishCapabilitiesFailure(Exception exc) {
        this.publishCapabilitiesException = exc;
    }

    public void setSynchronizeStateSuccess() {
        this.waitingForSynchronizeState = false;
    }

    public void setWaitingForAuthorization(boolean z) {
        this.waitingForAuthorization = z;
    }

    public void setWaitingForCapabilityPublish(boolean z) {
        this.waitingForCapabilityPublish = z;
    }

    public void setWaitingForDownchannel(boolean z) {
        this.waitingForDownchannel = z;
    }

    public void setWaitingForDownchannelConnection(boolean z) {
        this.waitingForDownchannelConnection = z;
    }

    public void setWaitingForExternalCapabilitiesRefresh(boolean z) {
        this.waitingForExternalCapabilitiesRefresh = z;
    }

    public void setWaitingForInternalCapabilitiesRefresh(boolean z) {
        this.waitingForInternalCapabilitiesRefresh = z;
    }

    public void setWaitingForNetworkConnectivity(boolean z) {
        this.waitingForNetworkConnectivity = z;
    }

    public void setWaitingForSynchronizeState() {
        this.waitingForSynchronizeState = true;
    }

    public void setWaitingForVerifyAlexaGateway(boolean z) {
        this.waitingForVerifyAlexaGateway = z;
    }

    public void synchronizeStateFailedNoNetwork() {
        this.waitingForNetworkConnectivity = true;
        this.waitingForSynchronizeState = true;
    }

    public void setPublishCapabilitiesFailure(Integer num) {
        this.publishCapabilitiesFailureStatusCode = num;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DownchannelErrorStatus extends DownchannelStatus {
        private final int errorCode;

        @VisibleForTesting
        public DownchannelErrorStatus(Status status, int i) {
            super(status);
            this.errorCode = i;
        }

        public int getErrorCode() {
            return this.errorCode;
        }

        @Override // com.amazon.alexa.client.alexaservice.networking.downchannel.DownchannelStatusTracker.DownchannelStatus
        public boolean isCausedByHttpError() {
            return true;
        }

        @Override // com.amazon.alexa.client.alexaservice.networking.downchannel.DownchannelStatusTracker.DownchannelStatus
        public DownchannelErrorStatus asErrorStatus() {
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DownchannelExceptionStatus extends DownchannelStatus {
        private final Exception exception;

        @VisibleForTesting
        public DownchannelExceptionStatus(Status status, Exception exc) {
            super(status);
            this.exception = exc;
        }

        public Exception getException() {
            return this.exception;
        }

        @Override // com.amazon.alexa.client.alexaservice.networking.downchannel.DownchannelStatusTracker.DownchannelStatus
        public boolean isCausedByException() {
            return true;
        }

        @Override // com.amazon.alexa.client.alexaservice.networking.downchannel.DownchannelStatusTracker.DownchannelStatus
        public DownchannelExceptionStatus asExceptionStatus() {
            return this;
        }
    }
}

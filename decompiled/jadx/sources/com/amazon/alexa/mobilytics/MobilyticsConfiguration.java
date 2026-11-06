package com.amazon.alexa.mobilytics;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.mobilytics.connector.MobilyticsConnector;
import com.amazon.alexa.mobilytics.identity.MobilyticsCredentialKeyProvider;
import com.amazon.alexa.mobilytics.identity.MobilyticsDeviceProvider;
import com.amazon.alexa.mobilytics.identity.MobilyticsEndpointPicker;
import com.amazon.alexa.mobilytics.identity.MobilyticsEntitlementStatusProviderV2;
import com.amazon.alexa.mobilytics.identity.MobilyticsRouteProvider;
import com.amazon.alexa.mobilytics.identity.MobilyticsUserProvider;
import com.amazon.alexa.mobilytics.identity.message.MobilyticsMessageProvider;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.common.base.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class MobilyticsConfiguration {
    private final String applicationId;
    private final List<MobilyticsConnector> connectors;
    private final Context context;
    private final MobilyticsCredentialKeyProvider credentialKeyProvider;
    private final String dcmDeviceType;
    private final boolean debug;
    private final MobilyticsDeviceProvider deviceProvider;
    private final int domain;
    private final MobilyticsDynamicConfigProvider dynamicConfigProvider;
    private final MobilyticsEndpointPicker endpointPicker;
    private final MobilyticsEntitlementStatusProviderV2 entitlementStatusProvider;
    private final MobilyticsMessageProvider messageProvider;
    private final MobilyticsRouteProvider routeProvider;
    private final String serviceName;
    private final MobilyticsUserProvider userProvider;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private String applicationId;
        private List<MobilyticsConnector> connectors;
        private Context context;
        private MobilyticsCredentialKeyProvider credentialKeyProvider;
        private String dcmDeviceType;
        private MobilyticsDeviceProvider deviceProvider;
        private MobilyticsDynamicConfigProvider dynamicConfigProvider;
        private MobilyticsEndpointPicker endpointPicker;
        private MobilyticsEntitlementStatusProviderV2 entitlementStatusProvider;
        private MobilyticsMessageProvider messageProvider;
        private MobilyticsRouteProvider routeProvider;
        private String serviceName;
        private MobilyticsUserProvider userProvider;
        private int domain = 2;
        private boolean debug = false;

        @NonNull
        public MobilyticsConfiguration build() {
            try {
                Preconditions.checkNotNull(this.context, "context cannot be null");
                Preconditions.checkArgument(!TextUtils.isEmpty(this.applicationId), "applicationId cannot be null");
                Preconditions.checkArgument(!TextUtils.isEmpty(this.serviceName), "serviceName cannot be null");
                Preconditions.checkNotNull(this.userProvider, "userProvider cannot be null");
                return new MobilyticsConfiguration(this, 0);
            } catch (Exception e) {
                throw new MobilyticsException("configuration error", e);
            }
        }

        @NonNull
        public Builder withApplicationId(@NonNull String str) {
            this.applicationId = str;
            return this;
        }

        @NonNull
        public Builder withConnectors(@NonNull List<MobilyticsConnector> list) {
            this.connectors = list;
            return this;
        }

        @NonNull
        public Builder withContext(@NonNull Context context) {
            this.context = context;
            return this;
        }

        @NonNull
        public Builder withCredentialKeyProvider(MobilyticsCredentialKeyProvider mobilyticsCredentialKeyProvider) {
            this.credentialKeyProvider = mobilyticsCredentialKeyProvider;
            return this;
        }

        @NonNull
        public Builder withDcmDeviceType(String str) {
            this.dcmDeviceType = str;
            return this;
        }

        @NonNull
        public Builder withDebug(boolean z) {
            this.debug = z;
            return this;
        }

        @NonNull
        public Builder withDeviceProvider(@NonNull MobilyticsDeviceProvider mobilyticsDeviceProvider) {
            this.deviceProvider = mobilyticsDeviceProvider;
            return this;
        }

        @NonNull
        public Builder withDomain(@NonNull int i) {
            this.domain = i;
            return this;
        }

        @NonNull
        public Builder withDynamicConfigProvider(MobilyticsDynamicConfigProvider mobilyticsDynamicConfigProvider) {
            this.dynamicConfigProvider = mobilyticsDynamicConfigProvider;
            return this;
        }

        @NonNull
        public Builder withEndpointPicker(@NonNull MobilyticsEndpointPicker mobilyticsEndpointPicker) {
            this.endpointPicker = mobilyticsEndpointPicker;
            return this;
        }

        @NonNull
        public Builder withEntitlementStatusProvider(MobilyticsEntitlementStatusProviderV2 mobilyticsEntitlementStatusProviderV2) {
            this.entitlementStatusProvider = mobilyticsEntitlementStatusProviderV2;
            return this;
        }

        @NonNull
        public Builder withMessageProvider(MobilyticsMessageProvider mobilyticsMessageProvider) {
            this.messageProvider = mobilyticsMessageProvider;
            return this;
        }

        @NonNull
        public Builder withRouteProvider(MobilyticsRouteProvider mobilyticsRouteProvider) {
            this.routeProvider = mobilyticsRouteProvider;
            return this;
        }

        @NonNull
        public Builder withServiceName(@NonNull String str) {
            this.serviceName = str;
            return this;
        }

        @NonNull
        public Builder withUserProvider(@NonNull MobilyticsUserProvider mobilyticsUserProvider) {
            this.userProvider = mobilyticsUserProvider;
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Domain {
        public static final int BETA = 0;
        public static final int GAMMA = 1;
        public static final int PROD = 2;
    }

    private MobilyticsConfiguration(@NonNull Builder builder) {
        this.context = builder.context;
        this.applicationId = builder.applicationId;
        this.userProvider = builder.userProvider;
        this.endpointPicker = builder.endpointPicker;
        this.deviceProvider = builder.deviceProvider;
        this.domain = builder.domain;
        this.connectors = builder.connectors;
        this.debug = builder.debug;
        this.serviceName = builder.serviceName;
        this.dcmDeviceType = builder.dcmDeviceType;
        this.credentialKeyProvider = builder.credentialKeyProvider;
        this.dynamicConfigProvider = builder.dynamicConfigProvider;
        this.routeProvider = builder.routeProvider;
        this.messageProvider = builder.messageProvider;
        this.entitlementStatusProvider = builder.entitlementStatusProvider;
    }

    @NonNull
    public static Builder builder() {
        return new Builder();
    }

    @NonNull
    public String applicationId() {
        return this.applicationId;
    }

    @Nullable
    public List<MobilyticsConnector> connectors() {
        return this.connectors;
    }

    @NonNull
    public Context context() {
        return this.context;
    }

    @Nullable
    public MobilyticsCredentialKeyProvider credentialKeyProvider() {
        return this.credentialKeyProvider;
    }

    @Nullable
    public String dcmDeviceType() {
        return this.dcmDeviceType;
    }

    @NonNull
    public MobilyticsDeviceProvider deviceProvider() {
        return this.deviceProvider;
    }

    public int domain() {
        return this.domain;
    }

    @Nullable
    public MobilyticsDynamicConfigProvider dynamicConfigProvider() {
        return this.dynamicConfigProvider;
    }

    @NonNull
    public MobilyticsEndpointPicker endpointPicker() {
        return this.endpointPicker;
    }

    @Nullable
    public MobilyticsEntitlementStatusProviderV2 entitlementStatusProvider() {
        return this.entitlementStatusProvider;
    }

    public boolean isDebug() {
        return this.debug;
    }

    @Nullable
    public MobilyticsMessageProvider messageProvider() {
        return this.messageProvider;
    }

    @Nullable
    public MobilyticsRouteProvider routeProvider() {
        return this.routeProvider;
    }

    @NonNull
    public String serviceName() {
        return this.serviceName;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MobilyticsConfiguration[");
        sb.append("context: " + this.context + "; ");
        sb.append("applicationId: " + this.applicationId + "; ");
        sb.append("serviceName: " + this.serviceName + "; ");
        sb.append("userIdentityProvider: " + this.userProvider + "; ");
        sb.append("domain: " + this.domain + "; ");
        sb.append("connectors: " + this.connectors + "; ");
        sb.append("dcmDeviceType: " + this.dcmDeviceType + ";");
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }

    @NonNull
    public MobilyticsUserProvider userProvider() {
        return this.userProvider;
    }

    public /* synthetic */ MobilyticsConfiguration(Builder builder, int i) {
        this(builder);
    }
}

package com.amazon.deecomms.settings;

import androidx.annotation.NonNull;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.common.CommsInternal;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.network.ACMSClient;
import com.amazon.deecomms.common.network.IHttpClient;
import com.amazon.deecomms.common.network.ServiceException;
import com.fasterxml.jackson.annotation.JsonProperty;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.text.MessageFormat;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class IdentityPreferencesProvider {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, IdentityPreferencesProvider.class);
    private AuthenticationType authenticationType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class GetIdentityPreferencesResponse {

        @JsonProperty("key")
        private String key;

        @JsonProperty("namespace")
        private String namespace;

        @JsonProperty("set")
        private String set;

        @JsonProperty("value")
        private String value;

        private GetIdentityPreferencesResponse() {
        }

        public String getKey() {
            return this.key;
        }

        public String getNamespace() {
            return this.namespace;
        }

        public String getSet() {
            return this.set;
        }

        public String getValue() {
            return this.value;
        }
    }

    public IdentityPreferencesProvider() {
        this(AuthenticationType.AS_LOGGED_ON_USER);
    }

    public String get(String str, String str2) throws ServiceException {
        IHttpClient.Request request = new ACMSClient("comms.api.ids.pref.get").request(MessageFormat.format("/users/{0}/preferences/{1}", str, str2));
        CommsLogger commsLogger = LOG;
        commsLogger.d("Fetching value of preference " + commsLogger.sensitive(str2) + ", requestId=" + request.getRequestId());
        try {
            IHttpClient.Response execute = this.authenticationType.authenticate(request).addMetricMetadata("source", str2).get().execute();
            try {
                String value = ((GetIdentityPreferencesResponse) execute.convert(GetIdentityPreferencesResponse.class)).getValue();
                commsLogger.d("Fetched value of preference " + commsLogger.sensitive(str2) + ", requestId=" + request.getRequestId() + ", value=" + commsLogger.sensitive(value));
                execute.close();
                return value;
            } finally {
            }
        } catch (ServiceException e) {
            CommsLogger commsLogger2 = LOG;
            commsLogger2.e(a$$ExternalSyntheticOutline0.m("Error while fetching value of preference ", commsLogger2.sensitive(str2), ", requestId=", request.getRequestId()), e);
            throw e;
        } catch (IOException e2) {
            CommsLogger commsLogger3 = LOG;
            String m = a$$ExternalSyntheticOutline0.m("Error while fetching value of preference ", commsLogger3.sensitive(str2), ", requestId=", request.getRequestId());
            commsLogger3.e(m, e2);
            throw new ServiceException(m, e2);
        }
    }

    public void set(String str, String str2, Object obj) throws ServiceException {
        IHttpClient.Request request = new ACMSClient("comms.api.ids.pref.update").request(MessageFormat.format("/users/{0}/preferences/{1}", str, str2));
        CommsLogger commsLogger = LOG;
        String sensitive = commsLogger.sensitive(str2);
        String sensitive2 = commsLogger.sensitive(obj != null ? obj.toString() : "null");
        String requestId = request.getRequestId();
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("Saving value of preference ", sensitive, " to ", sensitive2, ", requestId=");
        m.append(requestId);
        commsLogger.d(m.toString());
        try {
            IHttpClient.Response execute = this.authenticationType.authenticate(request).addMetricMetadata("source", str2).patchJson(obj).execute();
            try {
                String sensitive3 = commsLogger.sensitive(str2);
                commsLogger.d("Saved value of preference " + sensitive3 + " to " + commsLogger.sensitive(obj != null ? obj.toString() : "null") + ", requestId=" + request.getRequestId());
                execute.close();
                execute.close();
            } catch (Throwable th) {
                if (execute != null) {
                    try {
                        execute.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (ServiceException e) {
            CommsLogger commsLogger2 = LOG;
            commsLogger2.e(a$$ExternalSyntheticOutline0.m("Error while saving value of preference ", commsLogger2.sensitive(str2), ", requestId=", request.getRequestId()), e);
            throw e;
        } catch (IOException e2) {
            CommsLogger commsLogger3 = LOG;
            String m2 = a$$ExternalSyntheticOutline0.m("Error while saving value of preference ", commsLogger3.sensitive(str2), ", requestId=", request.getRequestId());
            commsLogger3.e(m2, e2);
            throw new ServiceException(m2, e2);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class AuthenticationType {
        public static final AuthenticationType AS_LOGGED_ON_USER = new AnonymousClass1();
        public static final AuthenticationType AS_COMMS_USER = new AnonymousClass2();
        private static final /* synthetic */ AuthenticationType[] $VALUES = $values();

        private static /* synthetic */ AuthenticationType[] $values() {
            return new AuthenticationType[]{AS_LOGGED_ON_USER, AS_COMMS_USER};
        }

        public /* synthetic */ AuthenticationType(String str, int i, int i2) {
            this(str, i);
        }

        public static AuthenticationType valueOf(String str) {
            return (AuthenticationType) Enum.valueOf(AuthenticationType.class, str);
        }

        public static AuthenticationType[] values() {
            return (AuthenticationType[]) $VALUES.clone();
        }

        public abstract IHttpClient.Request authenticate(@NonNull IHttpClient.Request request);

        private AuthenticationType(String str, int i) {
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        /* renamed from: com.amazon.deecomms.settings.IdentityPreferencesProvider$AuthenticationType$1, reason: invalid class name */
        public enum AnonymousClass1 extends AuthenticationType {
            public /* synthetic */ AnonymousClass1() {
                this("AS_LOGGED_ON_USER", 0);
            }

            @Override // com.amazon.deecomms.settings.IdentityPreferencesProvider.AuthenticationType
            public IHttpClient.Request authenticate(@NonNull IHttpClient.Request request) {
                IdentityPreferencesProvider.LOG.i("Authenticating request '" + request.getRequestId() + "' as logged on user");
                return request.authenticated();
            }

            private AnonymousClass1(String str, int i) {
                super(str, i, 0);
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        /* renamed from: com.amazon.deecomms.settings.IdentityPreferencesProvider$AuthenticationType$2, reason: invalid class name */
        public enum AnonymousClass2 extends AuthenticationType {
            public /* synthetic */ AnonymousClass2() {
                this("AS_COMMS_USER", 1);
            }

            @Override // com.amazon.deecomms.settings.IdentityPreferencesProvider.AuthenticationType
            public IHttpClient.Request authenticate(@NonNull IHttpClient.Request request) {
                CommsLogger commsLogger = IdentityPreferencesProvider.LOG;
                commsLogger.i(a$$ExternalSyntheticOutline0.m("Authenticating request '", request.getRequestId(), "' as current Comms user '", commsLogger.sensitive(CommsInternal.getInstance().getCommsId()), "'"));
                return request.authenticatedAsCurrentCommsUser();
            }

            private AnonymousClass2(String str, int i) {
                super(str, i, 0);
            }
        }
    }

    public IdentityPreferencesProvider(@NonNull AuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
    }
}

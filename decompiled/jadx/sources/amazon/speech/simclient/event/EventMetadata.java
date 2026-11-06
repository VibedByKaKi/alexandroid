package amazon.speech.simclient.event;

import amazon.speech.requestid.RequestIdGenerator;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.json.JSONException;
import org.json.JSONObject;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class EventMetadata implements Parcelable {
    private static final String CORRELATION_TOKEN_KEY = "correlationToken";
    public static final Parcelable.Creator<EventMetadata> CREATOR = new Parcelable.Creator<EventMetadata>() { // from class: amazon.speech.simclient.event.EventMetadata.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EventMetadata createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String unused = EventMetadata.DEFAULT_LABEL;
            if (readString != null && readString.endsWith(EventMetadata.VERSION_1_DELIMITER)) {
                parcel.readString();
                parcel.readLong();
                readString = readString.replace(EventMetadata.VERSION_1_DELIMITER, "");
            }
            String str = readString;
            byte readByte = parcel.readByte();
            String readString3 = parcel.readString();
            int dataPosition = parcel.dataPosition();
            Bundle bundle = null;
            if (!EventMetadata.VERSION_0_DELIMITER.equals(parcel.dataAvail() > 0 ? parcel.readString() : null) || parcel.dataAvail() <= 0) {
                parcel.setDataPosition(dataPosition);
            } else {
                bundle = parcel.readBundle();
            }
            Bundle bundle2 = bundle;
            Log.i(EventMetadata.TAG, "bundle ".concat(bundle2 == null ? "not found" : "found"));
            EventMetadata eventMetadata = new EventMetadata(bundle2, str, readString2, readByte == 1, (String) null, false);
            eventMetadata.setKeys(readString3);
            return eventMetadata;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EventMetadata[] newArray(int i) {
            return new EventMetadata[i];
        }
    };
    private static final String DEFAULT_LABEL = null;
    private static final long DEFAULT_TIMESTAMP = -1;
    private static final String ENDPOINT_KEY = "endpoint";
    private static final String EVENT_CORRELATION_TOKEN_KEY = "eventCorrelationToken";
    public static final String EVENT_CUSTOM_URI_KEY = "EventCustomUriKey";
    public static final String EVENT_PREFIX_ENVELOPE_URI_KEY = "EventPrefixEnvelopeUriKey";
    static final String ID_KEY = "ID";
    private static final String INCLUDE_COOKIE_KEY = "includeCookie";
    private static final String INCLUDE_SCOPE_KEY = "includeScope";
    private static final String LABEL_KEY = "label";
    private static final String PAYLOAD_VERSION = "payloadVersion";
    private static final String SERVICE_NAME_ACRONYM = "CSM";
    private static final String TAG = "SPCH-EventMetadata";
    private static final String TIMESTAMP_KEY = "timestamp";
    private static final String VERSION_0_DELIMITER = "=====";
    private static final String VERSION_1_DELIMITER = "=====v1";
    private Bundle mBundle;
    private String mId;
    private final boolean mIncludeDeviceContext;
    private JSONObject mKeys;
    private final String mName;
    private final String mNamespace;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private String mCorrelationToken;
        private String mEventCorrelationToken;
        private String mId;
        private String mLabel;
        private String mName;
        private String mNamespace;
        private String mPayloadVersion;
        private boolean mPrefixEnvelopeUri;
        private String mUri;
        private boolean mIncludeDeviceContext = true;
        private Long mTimestamp = null;
        private Endpoint mEndpoint = null;
        private boolean mIncludeScope = false;
        private boolean mIncludeCookie = false;

        public EventMetadata build() {
            return new EventMetadata(new BundleBuilder().setId(this.mId).setLabel(this.mLabel).setTimestamp(this.mTimestamp).setPayloadVersion(this.mPayloadVersion).setCorrelationToken(this.mCorrelationToken).setEventCorrelationToken(this.mEventCorrelationToken).setEndpoint(this.mEndpoint).setIncludeScope(this.mIncludeScope).setIncludeCookie(this.mIncludeCookie).build(), this.mNamespace, this.mName, this.mIncludeDeviceContext, this.mUri, this.mPrefixEnvelopeUri);
        }

        public Builder setCorrelationToken(String str) {
            this.mCorrelationToken = str;
            return this;
        }

        public Builder setEndpoint(Endpoint endpoint) {
            this.mEndpoint = endpoint;
            return this;
        }

        public Builder setEventCorrelationToken(String str) {
            this.mEventCorrelationToken = str;
            return this;
        }

        public Builder setId(String str) {
            this.mId = str;
            return this;
        }

        public Builder setIncludeCookie(boolean z) {
            this.mIncludeCookie = z;
            return this;
        }

        public Builder setIncludeDeviceContext(boolean z) {
            this.mIncludeDeviceContext = z;
            return this;
        }

        public Builder setIncludeScope(boolean z) {
            this.mIncludeScope = z;
            return this;
        }

        public Builder setLabel(String str) {
            this.mLabel = str;
            return this;
        }

        public Builder setName(String str) {
            this.mName = str;
            return this;
        }

        public Builder setNamespace(String str) {
            this.mNamespace = str;
            return this;
        }

        public Builder setPayloadVersion(String str) {
            this.mPayloadVersion = str;
            return this;
        }

        public Builder setPrefixEnvelopeUri(boolean z) {
            this.mPrefixEnvelopeUri = z;
            return this;
        }

        public Builder setTimestamp(Long l) {
            this.mTimestamp = l;
            return this;
        }

        public Builder setUri(String str) {
            this.mUri = str;
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class BundleBuilder {
        private String mCorrelationToken;
        private Endpoint mEndpoint;
        private String mEventCorrelationToken;
        private String mId;
        private boolean mIncludeCookie;
        private boolean mIncludeScope;
        private String mLabel;
        private String mPayloadVersion;
        private Long mTimestamp;

        public Bundle build() {
            Bundle bundle = new Bundle();
            String str = this.mId;
            if (str != null) {
                bundle.putString(EventMetadata.ID_KEY, str);
            }
            String str2 = this.mLabel;
            if (str2 != null) {
                bundle.putString("label", str2);
            }
            Long l = this.mTimestamp;
            if (l != null) {
                bundle.putLong("timestamp", l.longValue());
            }
            String str3 = this.mPayloadVersion;
            if (str3 != null) {
                bundle.putString("payloadVersion", str3);
            }
            String str4 = this.mCorrelationToken;
            if (str4 != null) {
                bundle.putString("correlationToken", str4);
            }
            String str5 = this.mEventCorrelationToken;
            if (str5 != null) {
                bundle.putString("eventCorrelationToken", str5);
            }
            Endpoint endpoint = this.mEndpoint;
            if (endpoint != null) {
                bundle.putSerializable("endpoint", endpoint);
            }
            bundle.putBoolean(EventMetadata.INCLUDE_SCOPE_KEY, this.mIncludeScope);
            bundle.putBoolean(EventMetadata.INCLUDE_COOKIE_KEY, this.mIncludeCookie);
            return bundle;
        }

        public BundleBuilder setCorrelationToken(String str) {
            this.mCorrelationToken = str;
            return this;
        }

        public BundleBuilder setEndpoint(Endpoint endpoint) {
            this.mEndpoint = endpoint;
            return this;
        }

        public BundleBuilder setEventCorrelationToken(String str) {
            this.mEventCorrelationToken = str;
            return this;
        }

        public BundleBuilder setId(String str) {
            this.mId = str;
            return this;
        }

        public BundleBuilder setIncludeCookie(boolean z) {
            this.mIncludeCookie = z;
            return this;
        }

        public BundleBuilder setIncludeScope(boolean z) {
            this.mIncludeScope = z;
            return this;
        }

        public BundleBuilder setLabel(String str) {
            this.mLabel = str;
            return this;
        }

        public BundleBuilder setPayloadVersion(String str) {
            this.mPayloadVersion = str;
            return this;
        }

        public BundleBuilder setTimestamp(Long l) {
            this.mTimestamp = l;
            return this;
        }
    }

    public EventMetadata(Bundle bundle, String str, String str2, boolean z, String str3, boolean z2) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Cannot have null namespace");
            throw null;
        }
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Cannot have null name");
            throw null;
        }
        if (z2 && str3 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Cannot have null custom URI and specify to prefix with envelope URI");
            throw null;
        }
        this.mBundle = bundle;
        String id = getId(bundle);
        if (id != null) {
            this.mId = id;
        } else {
            refreshIdIfAllowed();
        }
        this.mNamespace = str;
        this.mName = str2;
        this.mIncludeDeviceContext = z;
        JSONObject jSONObject = new JSONObject();
        this.mKeys = jSONObject;
        if (str3 != null) {
            try {
                jSONObject.put(EVENT_CUSTOM_URI_KEY, str3);
            } catch (JSONException e) {
                Log.e(TAG, "Unable to add uri", e);
            }
            try {
                this.mKeys.put(EVENT_PREFIX_ENVELOPE_URI_KEY, z2);
            } catch (JSONException e2) {
                Log.e(TAG, "Unable to add prefix envelope uri", e2);
            }
        }
    }

    private String getId(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return bundle.getString(ID_KEY);
    }

    private boolean idExplicitlyProvided() {
        return getId(this.mBundle) != null;
    }

    private void setId(String str, boolean z) {
        if (z) {
            this.mBundle.putString(ID_KEY, str);
        }
        this.mId = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof EventMetadata)) {
            return false;
        }
        EventMetadata eventMetadata = (EventMetadata) obj;
        return getNamespace().equals(eventMetadata.getNamespace()) && getName().equals(eventMetadata.getName()) && (getLabel() != null ? getLabel().equals(eventMetadata.getLabel()) : eventMetadata.getLabel() == null) && getTimestamp() == eventMetadata.getTimestamp() && getPayloadVersion() == eventMetadata.getPayloadVersion() && getCorrelationToken() == eventMetadata.getCorrelationToken() && getEventCorrelationToken() == eventMetadata.getEventCorrelationToken() && includeDeviceContext() == eventMetadata.includeDeviceContext();
    }

    public boolean getBooleanKey(String str, boolean z) {
        return this.mKeys.optBoolean(str, z);
    }

    public String getCorrelationToken() {
        return this.mBundle.getString("correlationToken");
    }

    public Endpoint getEndpoint() {
        return (Endpoint) this.mBundle.getSerializable("endpoint");
    }

    public String getEventCorrelationToken() {
        return this.mBundle.getString("eventCorrelationToken");
    }

    public boolean getIncludeCookie() {
        return this.mBundle.getBoolean(INCLUDE_COOKIE_KEY);
    }

    public boolean getIncludeScope() {
        return this.mBundle.getBoolean(INCLUDE_SCOPE_KEY);
    }

    public String getKey(String str) {
        return this.mKeys.optString(str, null);
    }

    public String getKeys() {
        return this.mKeys.toString();
    }

    public String getLabel() {
        Bundle bundle = this.mBundle;
        return bundle == null ? DEFAULT_LABEL : bundle.getString("label");
    }

    public String getName() {
        return this.mName;
    }

    public String getNamespace() {
        return this.mNamespace;
    }

    public String getPayloadVersion() {
        return this.mBundle.getString("payloadVersion");
    }

    public long getTimestamp() {
        Bundle bundle = this.mBundle;
        if (bundle == null || !bundle.containsKey("timestamp")) {
            return -1L;
        }
        return this.mBundle.getLong("timestamp");
    }

    public int hashCode() {
        return Objects.hash(this.mNamespace, this.mName, Boolean.valueOf(this.mIncludeDeviceContext));
    }

    public boolean includeDeviceContext() {
        return this.mIncludeDeviceContext;
    }

    public void putKey(String str, String str2) {
        if (str == null || str2 == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            return;
        }
        try {
            this.mKeys.put(str, str2);
        } catch (JSONException e) {
            Log.e(TAG, "Unable to add key", e);
        }
    }

    public void refreshIdIfAllowed() {
        if (idExplicitlyProvided()) {
            return;
        }
        setId(RequestIdGenerator.generateRequestId((String) null, SERVICE_NAME_ACRONYM), false);
    }

    public void setKeys(String str) {
        if (str == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            return;
        }
        try {
            this.mKeys = new JSONObject(str);
        } catch (JSONException e) {
            Log.e(TAG, "Unable to set keys", e);
        }
    }

    public String toString() {
        return String.format("namespace=%s, name=%s, label=%s, timestamp=%d, includeDeviceContext=%s, keys=%s", getNamespace(), getName(), getLabel(), Long.valueOf(getTimestamp()), Boolean.valueOf(includeDeviceContext()), getKeys());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        a$$ExternalSyntheticOutline0.m5m(new StringBuilder("writeToParcel with bundle :"), this.mBundle != null, TAG);
        parcel.writeString(this.mNamespace);
        parcel.writeString(this.mName);
        parcel.writeByte(this.mIncludeDeviceContext ? (byte) 1 : (byte) 0);
        parcel.writeString(getKeys());
        if (this.mBundle != null) {
            parcel.writeString(VERSION_0_DELIMITER);
            parcel.writeBundle(this.mBundle);
        }
    }

    public final String getId() {
        return this.mId;
    }

    public void setId(String str) {
        setId(str, str != null);
    }

    public void putKey(String str, boolean z) {
        if (str != null) {
            try {
                this.mKeys.put(str, z);
                return;
            } catch (JSONException e) {
                Log.e(TAG, "Unable to add key", e);
                return;
            }
        }
        Path$$ExternalSyntheticBUOutline0.m();
    }

    public EventMetadata(String str, String str2, boolean z) {
        this(str, str2, z, (String) null);
    }

    public EventMetadata(String str, String str2, String str3, String str4, Endpoint endpoint, boolean z, boolean z2) {
        this(new BundleBuilder().setEndpoint(endpoint).setIncludeScope(z).setIncludeCookie(z2).setPayloadVersion(str3).setCorrelationToken(str4).build(), str, str2, true, (String) null, false);
    }

    public EventMetadata(String str, String str2, String str3) {
        this(new BundleBuilder().setId(str).build(), str2, str3, true, (String) null, false);
    }

    public EventMetadata(String str, String str2, boolean z, String str3, boolean z2) {
        this(new BundleBuilder().build(), str, str2, z, str3, z2);
    }

    public EventMetadata(String str, String str2, boolean z, String str3) {
        this(new BundleBuilder().build(), str, str2, z, str3, false);
    }

    public EventMetadata(String str, String str2, String str3, long j) {
        this(new BundleBuilder().setLabel(str3).setTimestamp(Long.valueOf(j)).build(), str, str2, true, (String) null, false);
    }

    public EventMetadata(String str, String str2, String str3, boolean z, String str4, boolean z2) {
        this(new BundleBuilder().setId(str).build(), str2, str3, z, str4, z2);
    }

    public EventMetadata(String str, String str2, String str3, boolean z, String str4) {
        this(new BundleBuilder().setId(str).build(), str2, str3, z, str4, false);
    }

    public EventMetadata(String str, String str2) {
        this(str, str2, true);
    }
}

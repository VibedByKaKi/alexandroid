package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.amazon.alexa.client.annotations.Nullable;
import com.amazon.alexa.utils.validation.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaEndpointConfiguration implements Parcelable {
    public static final Parcelable.Creator<AlexaEndpointConfiguration> CREATOR = new Parcelable.Creator<AlexaEndpointConfiguration>() { // from class: com.amazon.alexa.api.AlexaEndpointConfiguration.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaEndpointConfiguration createFromParcel(Parcel parcel) {
            return new AlexaEndpointConfiguration(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaEndpointConfiguration[] newArray(int i) {
            return new AlexaEndpointConfiguration[i];
        }
    };
    private static final String TAG = "AlexaEndpointConfiguration";

    @Nullable
    private final String appPackageName;
    private final Set<AlexaCapability> capabilities;
    private final String description;
    private final List<String> displayCategories;
    private final String endpointId;
    private final String friendlyName;
    private final String manufacturerName;

    @Nullable
    private final JSONObject relationships;

    public AlexaEndpointConfiguration(Parcel parcel) {
        JSONObject jSONObject;
        this.endpointId = parcel.readString();
        ArrayList arrayList = new ArrayList();
        parcel.readTypedList(arrayList, AlexaCapability.CREATOR);
        this.capabilities = Collections.unmodifiableSet(new HashSet(arrayList));
        this.displayCategories = Collections.unmodifiableList(parcel.createStringArrayList());
        this.description = parcel.readString();
        this.friendlyName = parcel.readString();
        this.manufacturerName = parcel.readString();
        String readString = parcel.readString();
        if (readString != null) {
            try {
                jSONObject = new JSONObject(readString);
            } catch (JSONException e) {
                Log.e(TAG, "Unable to parse relationships", e);
            }
            this.relationships = jSONObject;
            this.appPackageName = parcel.readString();
        }
        jSONObject = null;
        this.relationships = jSONObject;
        this.appPackageName = parcel.readString();
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlexaEndpointConfiguration)) {
            return false;
        }
        AlexaEndpointConfiguration alexaEndpointConfiguration = (AlexaEndpointConfiguration) obj;
        if (Objects.equals(this.endpointId, alexaEndpointConfiguration.endpointId) && Objects.equals(this.capabilities, alexaEndpointConfiguration.capabilities) && Objects.equals(this.displayCategories, alexaEndpointConfiguration.displayCategories) && Objects.equals(this.description, alexaEndpointConfiguration.description) && Objects.equals(this.friendlyName, alexaEndpointConfiguration.friendlyName) && Objects.equals(this.manufacturerName, alexaEndpointConfiguration.manufacturerName)) {
            JSONObject jSONObject = this.relationships;
            String jSONObject2 = jSONObject == null ? null : jSONObject.toString();
            JSONObject jSONObject3 = alexaEndpointConfiguration.relationships;
            if (Objects.equals(jSONObject2, jSONObject3 != null ? jSONObject3.toString() : null) && Objects.equals(this.appPackageName, alexaEndpointConfiguration.appPackageName)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public String getAppPackageName() {
        return this.appPackageName;
    }

    public Set<AlexaCapability> getCapabilities() {
        return this.capabilities;
    }

    public String getDescription() {
        return this.description;
    }

    public List<String> getDisplayCategories() {
        return this.displayCategories;
    }

    public String getEndpointId() {
        return this.endpointId;
    }

    public String getFriendlyName() {
        return this.friendlyName;
    }

    public String getManufacturerName() {
        return this.manufacturerName;
    }

    @Nullable
    public JSONObject getRelationships() {
        return this.relationships;
    }

    public int hashCode() {
        String str = this.endpointId;
        Set<AlexaCapability> set = this.capabilities;
        List<String> list = this.displayCategories;
        String str2 = this.description;
        String str3 = this.friendlyName;
        String str4 = this.manufacturerName;
        JSONObject jSONObject = this.relationships;
        return Objects.hash(str, set, list, str2, str3, str4, jSONObject == null ? null : jSONObject.toString(), this.appPackageName);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.endpointId);
        parcel.writeTypedList(new ArrayList(this.capabilities));
        parcel.writeStringList(new ArrayList(this.displayCategories));
        parcel.writeString(this.description);
        parcel.writeString(this.friendlyName);
        parcel.writeString(this.manufacturerName);
        JSONObject jSONObject = this.relationships;
        parcel.writeString(jSONObject == null ? null : jSONObject.toString());
        parcel.writeString(this.appPackageName);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {

        @Nullable
        private String appPackageName;
        private Set<AlexaCapability> capabilities;
        private String description;
        private List<String> displayCategories;
        private String endpointId;
        private String friendlyName;
        private String manufacturerName;

        @Nullable
        private JSONObject relationships;

        public AlexaEndpointConfiguration build() {
            Preconditions.notNull(this.endpointId, "endpointId is null");
            Preconditions.notNull(this.capabilities, "capabilities is null");
            Preconditions.notNull(this.displayCategories, "displayCategories is null");
            Preconditions.notNull(this.description, "description is null");
            Preconditions.notNull(this.friendlyName, "friendlyName is null");
            Preconditions.notNull(this.manufacturerName, "manufacturerName is null");
            return new AlexaEndpointConfiguration(this);
        }

        public Builder setAppPackageName(@Nullable String str) {
            this.appPackageName = str;
            return this;
        }

        public Builder setCapabilities(Set<AlexaCapability> set) {
            this.capabilities = set;
            return this;
        }

        public Builder setDescription(String str) {
            this.description = str;
            return this;
        }

        public Builder setDisplayCategories(List<String> list) {
            this.displayCategories = list;
            return this;
        }

        public Builder setEndpointId(String str) {
            this.endpointId = str;
            return this;
        }

        public Builder setFriendlyName(String str) {
            this.friendlyName = str;
            return this;
        }

        public Builder setManufacturerName(String str) {
            this.manufacturerName = str;
            return this;
        }

        public Builder setRelationships(@Nullable JSONObject jSONObject) {
            this.relationships = jSONObject;
            return this;
        }

        private Builder() {
        }
    }

    private AlexaEndpointConfiguration(Builder builder) {
        this.endpointId = builder.endpointId;
        this.capabilities = Collections.unmodifiableSet(new HashSet(builder.capabilities));
        this.displayCategories = Collections.unmodifiableList(new ArrayList(builder.displayCategories));
        this.description = builder.description;
        this.friendlyName = builder.friendlyName;
        this.manufacturerName = builder.manufacturerName;
        this.relationships = builder.relationships;
        this.appPackageName = builder.appPackageName;
    }
}

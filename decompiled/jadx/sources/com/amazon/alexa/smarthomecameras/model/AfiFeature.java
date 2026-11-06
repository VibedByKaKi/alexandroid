package com.amazon.alexa.smarthomecameras.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaEventBundleKeys;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class AfiFeature implements Parcelable {
    private static final String AFI_OBJECT_DETECTION = "objectDetection";
    private static final String AFI_RANGE = "range";
    private static final String AFI_RTC_SESSION = "rtcSession";
    public static final Parcelable.Creator<AfiFeature> CREATOR = new Parcelable.Creator<AfiFeature>() { // from class: com.amazon.alexa.smarthomecameras.model.AfiFeature.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AfiFeature createFromParcel(Parcel parcel) {
            return new AfiFeature(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AfiFeature[] newArray(int i) {
            return new AfiFeature[i];
        }
    };

    @SerializedName("configuration")
    public AfiFeatureConfiguration configuration;

    @SerializedName(AlexaEventBundleKeys.INSTANCE)
    public String instance;

    @SerializedName("name")
    public String name;

    public AfiFeature(Parcel parcel) {
        this.name = parcel.readString();
        this.instance = parcel.readString();
        this.configuration = (AfiFeatureConfiguration) parcel.readParcelable(AfiFeatureConfiguration.class.getClassLoader());
    }

    public boolean containsInstances(List<String> list) {
        return list.contains(this.instance);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getInstance() {
        return this.instance;
    }

    public String getName() {
        return this.name;
    }

    public boolean isObjectDetection() {
        return AFI_OBJECT_DETECTION.equals(this.name);
    }

    public boolean isRange() {
        return AFI_RANGE.equals(this.name);
    }

    public boolean isRtcSession() {
        return AFI_RTC_SESSION.equals(this.name);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.instance);
        parcel.writeParcelable(this.configuration, i);
    }

    @VisibleForTesting
    public AfiFeature(String str, String str2) {
        this.name = str;
        this.instance = str2;
    }
}

package com.amazon.alexa.smarthomecameras.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaEventBundleKeys;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class Capability implements Parcelable {
    public static final Parcelable.Creator<Capability> CREATOR = new Parcelable.Creator<Capability>() { // from class: com.amazon.alexa.smarthomecameras.model.Capability.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Capability createFromParcel(Parcel parcel) {
            return new Capability(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Capability[] newArray(int i) {
            return new Capability[i];
        }
    };
    public static final String ODS_CAPABILITY_INTERFACE = "Alexa.SmartVision.ObjectDetectionSensor";
    public static final String RTC_SESSION_CONTROLLER_CAPABILITY_INTERFACE = "Alexa.RTCSessionController";

    @SerializedName("configuration")
    public CapabilityConfiguration configuration;

    @SerializedName(AlexaEventBundleKeys.INSTANCE)
    public String instance;

    @SerializedName("interfaceName")
    public String interfaceName;

    public Capability(Parcel parcel) {
        this.interfaceName = parcel.readString();
        this.instance = parcel.readString();
        this.configuration = (CapabilityConfiguration) parcel.readParcelable(CapabilityConfiguration.class.getClassLoader());
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

    public String getInterfaceName() {
        return this.interfaceName;
    }

    public boolean hasObjectDetectionSensor() {
        return this.interfaceName.equals(ODS_CAPABILITY_INTERFACE);
    }

    public boolean isRangeController() {
        return this.interfaceName.equals("Alexa.RangeController");
    }

    public boolean isRtcSessionController() {
        return this.interfaceName.equals("Alexa.RTCSessionController");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.interfaceName);
        parcel.writeString(this.instance);
        parcel.writeParcelable(this.configuration, i);
    }

    @VisibleForTesting
    public Capability(String str, String str2) {
        this.interfaceName = str;
        this.instance = str2;
    }
}

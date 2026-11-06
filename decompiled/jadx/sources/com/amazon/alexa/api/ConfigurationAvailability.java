package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.alexa.client.annotations.NonNull;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class ConfigurationAvailability implements Parcelable {
    public static final Parcelable.Creator<ConfigurationAvailability> CREATOR = new Parcelable.Creator<ConfigurationAvailability>() { // from class: com.amazon.alexa.api.ConfigurationAvailability.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConfigurationAvailability createFromParcel(Parcel parcel) {
            return new ConfigurationAvailability(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConfigurationAvailability[] newArray(int i) {
            return new ConfigurationAvailability[i];
        }
    };
    private final EnumSet<AlexaConfigurationName> availableConfigurations;
    private final EnumSet<AlexaConfigurationName> unavailableConfigurations;

    public ConfigurationAvailability(Parcel parcel) {
        this.availableConfigurations = (EnumSet) parcel.readSerializable();
        this.unavailableConfigurations = (EnumSet) parcel.readSerializable();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Set<AlexaConfigurationName> getAvailableConfiguration() {
        return Collections.unmodifiableSet(this.availableConfigurations);
    }

    public Set<AlexaConfigurationName> getUnavailableConfiguration() {
        return Collections.unmodifiableSet(this.unavailableConfigurations);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.availableConfigurations);
        parcel.writeSerializable(this.unavailableConfigurations);
    }

    public ConfigurationAvailability(@NonNull EnumSet<AlexaConfigurationName> enumSet, @NonNull EnumSet<AlexaConfigurationName> enumSet2) {
        this.availableConfigurations = enumSet;
        this.unavailableConfigurations = enumSet2;
    }
}

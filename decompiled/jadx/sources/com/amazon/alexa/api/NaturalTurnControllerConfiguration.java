package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.alexa.client.annotations.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class NaturalTurnControllerConfiguration implements Parcelable {
    public static final Parcelable.Creator<NaturalTurnControllerConfiguration> CREATOR = new Parcelable.Creator<NaturalTurnControllerConfiguration>() { // from class: com.amazon.alexa.api.NaturalTurnControllerConfiguration.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NaturalTurnControllerConfiguration createFromParcel(Parcel parcel) {
            return new NaturalTurnControllerConfiguration(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NaturalTurnControllerConfiguration[] newArray(int i) {
            return new NaturalTurnControllerConfiguration[i];
        }
    };
    private final BargeInBehavior bargeInBehavior;
    private final boolean enforceTimeouts;
    private final boolean exitIntentClassifierEnabled;
    private final SecondaryVadConfiguration secondaryVadConfiguration;
    private final UIConfiguration uiConfiguration;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private BargeInBehavior bargeInBehavior;
        private boolean enforceTimeouts;
        private boolean exitIntentClassifierEnabled;
        private SecondaryVadConfiguration secondaryVadConfiguration;
        private UIConfiguration uiConfiguration;

        private Builder() {
            this.exitIntentClassifierEnabled = false;
            this.enforceTimeouts = true;
        }

        public NaturalTurnControllerConfiguration build() {
            return new NaturalTurnControllerConfiguration(this);
        }

        public Builder setBargeInBehavior(BargeInBehavior bargeInBehavior) {
            this.bargeInBehavior = bargeInBehavior;
            return this;
        }

        public Builder setEnforceTimeouts(boolean z) {
            this.enforceTimeouts = z;
            return this;
        }

        public Builder setExitIntentClassifierEnabled(boolean z) {
            this.exitIntentClassifierEnabled = z;
            return this;
        }

        public Builder setSecondaryVadConfig(SecondaryVadConfiguration secondaryVadConfiguration) {
            this.secondaryVadConfiguration = secondaryVadConfiguration;
            return this;
        }

        public Builder setUIConfiguration(UIConfiguration uIConfiguration) {
            this.uiConfiguration = uIConfiguration;
            return this;
        }
    }

    private NaturalTurnControllerConfiguration(Builder builder) {
        this.secondaryVadConfiguration = builder.secondaryVadConfiguration != null ? builder.secondaryVadConfiguration : SecondaryVadConfiguration.builder().build();
        this.uiConfiguration = builder.uiConfiguration != null ? builder.uiConfiguration : UIConfiguration.builder().build();
        this.bargeInBehavior = builder.bargeInBehavior != null ? builder.bargeInBehavior : BargeInBehavior.PAUSE_RESUME;
        this.exitIntentClassifierEnabled = builder.exitIntentClassifierEnabled;
        this.enforceTimeouts = builder.enforceTimeouts;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public BargeInBehavior getBargeInBehavior() {
        return this.bargeInBehavior;
    }

    @NonNull
    public SecondaryVadConfiguration getSecondaryVadConfig() {
        return this.secondaryVadConfiguration;
    }

    @NonNull
    public UIConfiguration getUIConfiguration() {
        return this.uiConfiguration;
    }

    public boolean isExitIntentClassifierEnabled() {
        return this.exitIntentClassifierEnabled;
    }

    public boolean shouldEnforceTimeouts() {
        return this.enforceTimeouts;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.secondaryVadConfiguration, i);
        parcel.writeParcelable(this.uiConfiguration, i);
        parcel.writeParcelable(this.bargeInBehavior, i);
        parcel.writeByte(this.exitIntentClassifierEnabled ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enforceTimeouts ? (byte) 1 : (byte) 0);
    }

    private NaturalTurnControllerConfiguration(Parcel parcel) {
        this.secondaryVadConfiguration = (SecondaryVadConfiguration) parcel.readParcelable(SecondaryVadConfiguration.class.getClassLoader());
        this.uiConfiguration = (UIConfiguration) parcel.readParcelable(UIConfiguration.class.getClassLoader());
        this.bargeInBehavior = (BargeInBehavior) parcel.readParcelable(BargeInBehavior.class.getClassLoader());
        this.exitIntentClassifierEnabled = parcel.readByte() != 0;
        this.enforceTimeouts = parcel.readByte() != 0;
    }
}

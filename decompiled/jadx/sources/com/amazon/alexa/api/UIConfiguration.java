package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class UIConfiguration implements Parcelable {
    public static final Parcelable.Creator<UIConfiguration> CREATOR = new Parcelable.Creator<UIConfiguration>() { // from class: com.amazon.alexa.api.UIConfiguration.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public UIConfiguration createFromParcel(Parcel parcel) {
            return new UIConfiguration(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public UIConfiguration[] newArray(int i) {
            return new UIConfiguration[i];
        }
    };
    private static final boolean DEFAULT_SHOW_LIVE_MODE_UI = false;
    private final boolean showLiveModeUI;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private boolean showLiveModeUI;

        private Builder() {
            this.showLiveModeUI = false;
        }

        public UIConfiguration build() {
            return new UIConfiguration(this);
        }

        public Builder setShowLiveModeUI(boolean z) {
            this.showLiveModeUI = z;
            return this;
        }
    }

    private UIConfiguration(Parcel parcel) {
        this.showLiveModeUI = parcel.readByte() != 0;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean showLiveModeUI() {
        return this.showLiveModeUI;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.showLiveModeUI ? (byte) 1 : (byte) 0);
    }

    private UIConfiguration(Builder builder) {
        this.showLiveModeUI = builder.showLiveModeUI;
    }
}

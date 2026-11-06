package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaMetricsFilter implements Parcelable {
    public static final Parcelable.Creator<AlexaMetricsFilter> CREATOR = new Parcelable.Creator<AlexaMetricsFilter>() { // from class: com.amazon.alexa.api.AlexaMetricsFilter.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaMetricsFilter createFromParcel(Parcel parcel) {
            return new AlexaMetricsFilter(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaMetricsFilter[] newArray(int i) {
            return new AlexaMetricsFilter[i];
        }
    };
    private final String[] allowedMetadataKeys;

    public AlexaMetricsFilter(Parcel parcel) {
        this.allowedMetadataKeys = parcel.createStringArray();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String[] getAllowedMetadataKeys() {
        return this.allowedMetadataKeys;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(this.allowedMetadataKeys);
    }

    public AlexaMetricsFilter() {
        this.allowedMetadataKeys = null;
    }

    public AlexaMetricsFilter(String[] strArr) {
        this.allowedMetadataKeys = strArr;
    }
}

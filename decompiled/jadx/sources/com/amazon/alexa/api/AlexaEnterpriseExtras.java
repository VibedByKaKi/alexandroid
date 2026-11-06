package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaEnterpriseExtras implements Parcelable {
    public static final Parcelable.Creator<AlexaEnterpriseExtras> CREATOR = new Parcelable.Creator<AlexaEnterpriseExtras>() { // from class: com.amazon.alexa.api.AlexaEnterpriseExtras.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaEnterpriseExtras createFromParcel(Parcel parcel) {
            return new AlexaEnterpriseExtras(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaEnterpriseExtras[] newArray(int i) {
            return new AlexaEnterpriseExtras[i];
        }
    };
    private final List<String> enterpriseAccountIds;

    public AlexaEnterpriseExtras() {
        this.enterpriseAccountIds = new ArrayList();
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<String> getEnterpriseAccountIds() {
        return this.enterpriseAccountIds;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(getEnterpriseAccountIds());
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private List<String> enterpriseAccountIds;

        public AlexaEnterpriseExtras build() {
            if (this.enterpriseAccountIds == null) {
                this.enterpriseAccountIds = new ArrayList();
            }
            return new AlexaEnterpriseExtras(this);
        }

        public Builder setEnterpriseAccountIds(List<String> list) {
            this.enterpriseAccountIds = list;
            return this;
        }

        private Builder() {
        }
    }

    public AlexaEnterpriseExtras(Builder builder) {
        this((List<String>) builder.enterpriseAccountIds);
    }

    private AlexaEnterpriseExtras(List<String> list) {
        this.enterpriseAccountIds = list;
    }

    public AlexaEnterpriseExtras(Parcel parcel) {
        this(parcel.createStringArrayList());
    }
}

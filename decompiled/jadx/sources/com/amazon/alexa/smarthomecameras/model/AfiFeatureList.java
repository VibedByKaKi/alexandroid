package com.amazon.alexa.smarthomecameras.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.alexa.smarthomecameras.routing.CamerasRouteParameter;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class AfiFeatureList implements Parcelable {
    public static final Parcelable.Creator<AfiFeatureList> CREATOR = new Parcelable.Creator<AfiFeatureList>() { // from class: com.amazon.alexa.smarthomecameras.model.AfiFeatureList.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AfiFeatureList createFromParcel(Parcel parcel) {
            return new AfiFeatureList(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AfiFeatureList[] newArray(int i) {
            return new AfiFeatureList[i];
        }
    };

    @SerializedName(CamerasRouteParameter.FEATURES)
    List<AfiFeature> features;

    public AfiFeatureList(Parcel parcel) {
        if (parcel.readByte() != 1) {
            this.features = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.features = arrayList;
        parcel.readList(arrayList, AfiFeature.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<AfiFeature> getFeatures() {
        return this.features;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (this.features == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeList(this.features);
        }
    }

    public AfiFeatureList(List<AfiFeature> list) {
        this.features = list;
    }
}

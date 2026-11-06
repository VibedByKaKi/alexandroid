package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.alexa.utils.validation.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaEndpointConfigurationList implements Parcelable {
    public static final Parcelable.Creator<AlexaEndpointConfigurationList> CREATOR = new Parcelable.Creator<AlexaEndpointConfigurationList>() { // from class: com.amazon.alexa.api.AlexaEndpointConfigurationList.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaEndpointConfigurationList createFromParcel(Parcel parcel) {
            Preconditions.notNull(parcel, "Parcel is null");
            return new AlexaEndpointConfigurationList(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaEndpointConfigurationList[] newArray(int i) {
            return new AlexaEndpointConfigurationList[i];
        }
    };
    private final List<AlexaEndpointConfiguration> endpoints;

    public AlexaEndpointConfigurationList(List<AlexaEndpointConfiguration> list) {
        Preconditions.notNull(list, "endpoints is null");
        this.endpoints = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.endpoints, ((AlexaEndpointConfigurationList) obj).endpoints);
    }

    public List<AlexaEndpointConfiguration> getEndpoints() {
        return this.endpoints;
    }

    public int hashCode() {
        return Objects.hashCode(this.endpoints);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.endpoints);
    }

    public AlexaEndpointConfigurationList(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readTypedList(arrayList, AlexaEndpointConfiguration.CREATOR);
        this.endpoints = Collections.unmodifiableList(arrayList);
    }
}

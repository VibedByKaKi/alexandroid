package com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.type;

import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RegistrationRequest implements Parcelable {
    public static final Parcelable.Creator<RegistrationRequest> CREATOR = new Parcelable.Creator<RegistrationRequest>() { // from class: com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.type.RegistrationRequest.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RegistrationRequest createFromParcel(Parcel parcel) {
            return new RegistrationRequest(parcel, 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RegistrationRequest[] newArray(int i) {
            return new RegistrationRequest[i];
        }
    };
    private final Scheme mScheme;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Scheme {
        CODE_BASED_LINKING
    }

    public RegistrationRequest(Scheme scheme) {
        if (scheme != null) {
            this.mScheme = scheme;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Scheme can't be null");
            throw null;
        }
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
        return new EqualsBuilder().append(this.mScheme, ((RegistrationRequest) obj).mScheme).isEquals();
    }

    public Scheme getScheme() {
        return this.mScheme;
    }

    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(this.mScheme).toHashCode();
    }

    public String toString() {
        return "RegistrationRequest{mScheme=" + this.mScheme + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mScheme.name());
    }

    public /* synthetic */ RegistrationRequest(Parcel parcel, int i) {
        this(parcel);
    }

    private RegistrationRequest(Parcel parcel) {
        this.mScheme = Scheme.valueOf(parcel.readString());
    }
}

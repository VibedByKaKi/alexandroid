package amazon.speech.simclient.context;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public enum DeviceContextQueryType implements Parcelable {
    NAVIGATION_GO_BACK;

    public static final Parcelable.Creator<DeviceContextQueryType> CREATOR = new Parcelable.Creator<DeviceContextQueryType>() { // from class: amazon.speech.simclient.context.DeviceContextQueryType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceContextQueryType createFromParcel(Parcel parcel) {
            DeviceContextQueryType valueOf = DeviceContextQueryType.valueOf(parcel.readString());
            valueOf.handleBundle(parcel.readBundle());
            return valueOf;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceContextQueryType[] newArray(int i) {
            return new DeviceContextQueryType[i];
        }
    };
    private Bundle mBundle;

    DeviceContextQueryType() {
        this(new Bundle());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void handleBundle(Bundle bundle) {
        this.mBundle = bundle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
        parcel.writeBundle(this.mBundle);
    }

    DeviceContextQueryType(Bundle bundle) {
        this.mBundle = bundle;
    }
}

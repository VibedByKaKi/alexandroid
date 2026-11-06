package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.alexa.utils.validation.Preconditions;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class LocaleCombination implements Parcelable {
    public static final Parcelable.Creator<LocaleCombination> CREATOR = new Parcelable.Creator<LocaleCombination>() { // from class: com.amazon.alexa.api.LocaleCombination.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LocaleCombination createFromParcel(Parcel parcel) {
            return new LocaleCombination(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LocaleCombination[] newArray(int i) {
            return new LocaleCombination[i];
        }
    };
    private List<String> locales;

    public LocaleCombination(Parcel parcel) {
        Preconditions.notNull(parcel, "Parameter in is null.");
        this.locales = parcel.createStringArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<String> getLocales() {
        return this.locales;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.locales);
    }

    public LocaleCombination(List<String> list) {
        Preconditions.notNull(list, "Parameter locales is null.");
        this.locales = list;
    }
}

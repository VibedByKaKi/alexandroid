package com.google.android.gms.home.matter.commissioning;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SafeParcelable.Class(creator = "RoomCreator")
@Deprecated
/* loaded from: classes7.dex */
public final class Room extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Room> CREATOR = new zzk();

    @SafeParcelable.Field(getter = "getName", id = 1)
    private final String zza;

    @SafeParcelable.Constructor
    public Room(@SafeParcelable.Param(id = 1) String str) {
        this.zza = (String) Preconditions.checkNotNull(str);
    }

    @NonNull
    public static Room create(@NonNull String str) {
        return new Room(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Room) {
            return this.zza.equals(((Room) obj).zza);
        }
        return false;
    }

    @NonNull
    public String getName() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getName(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

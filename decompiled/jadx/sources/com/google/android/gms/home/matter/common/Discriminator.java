package com.google.android.gms.home.matter.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SafeParcelable.Class(creator = "DiscriminatorCreator")
/* loaded from: classes7.dex */
public final class Discriminator extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Discriminator> CREATOR = new zzb();

    @SafeParcelable.Field(getter = "getValue", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getMask", id = 2)
    private final int zzb;

    @SafeParcelable.Constructor
    public Discriminator(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2) {
        this.zza = i;
        this.zzb = i2;
    }

    @NonNull
    public static Discriminator forLongValue(@IntRange(from = 0, to = 4095) int i) {
        zza(i);
        return new Discriminator(i & 4095, 4095);
    }

    @NonNull
    public static Discriminator forShortValue(@IntRange(from = 0, to = 4095) int i) {
        zza(i);
        return new Discriminator(i & 3840, 3840);
    }

    private static void zza(int i) {
        boolean z = false;
        if (i >= 0 && i <= 4095) {
            z = true;
        }
        Preconditions.checkArgument(z, "Invalid discriminator value 0x%X (valid range 0-0xFFF)", Integer.valueOf(i));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Discriminator)) {
            return false;
        }
        Discriminator discriminator = (Discriminator) obj;
        return this.zza == discriminator.zza && this.zzb == discriminator.zzb;
    }

    public int getValue() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb));
    }

    public boolean matches(@NonNull Discriminator discriminator) {
        int i = this.zzb & discriminator.zzb;
        return (this.zza & i) == (discriminator.zza & i);
    }

    @NonNull
    public String toString() {
        return String.format(Locale.ROOT, "%s[0x%03X]", this.zzb == 4095 ? "L" : ExifInterface.LATITUDE_SOUTH, Integer.valueOf(this.zza));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getValue());
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

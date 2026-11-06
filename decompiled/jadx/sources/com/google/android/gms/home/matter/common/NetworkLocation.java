package com.google.android.gms.home.matter.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.home.zzbc;
import com.google.android.gms.internal.home.zze;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SafeParcelable.Class(creator = "NetworkLocationCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes7.dex */
public final class NetworkLocation extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<NetworkLocation> CREATOR = new zzc();

    @SafeParcelable.Field(getter = "getPort", id = 2)
    private final int zza;

    @SafeParcelable.Field(getter = "getFormattedIpAddress", id = 3, type = "java.lang.String")
    private final InetAddress zzb;

    @SafeParcelable.Constructor
    public NetworkLocation(@Nullable @SafeParcelable.RemovedParam(id = 1) byte[] bArr, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) String str) {
        this(bArr != null ? zza(bArr) : zze.zza(str), i);
    }

    @NonNull
    public static NetworkLocation create(@NonNull String str, int i) {
        return create(zze.zza(str), i);
    }

    private static InetAddress zza(byte[] bArr) {
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e) {
            Single$$ExternalSyntheticBUOutline0.m("Failed to parse IP address ".concat(String.valueOf(Arrays.toString(bArr))), e);
            return null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkLocation)) {
            return false;
        }
        NetworkLocation networkLocation = (NetworkLocation) obj;
        if (this.zza == networkLocation.zza) {
            InetAddress inetAddress = this.zzb;
            InetAddress inetAddress2 = networkLocation.zzb;
            if (inetAddress.equals(inetAddress2) && (!(inetAddress instanceof Inet6Address) || !(inetAddress2 instanceof Inet6Address) || ((Inet6Address) inetAddress).getScopeId() == ((Inet6Address) inetAddress2).getScopeId())) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public String getFormattedIpAddress() {
        int scopeId;
        InetAddress inetAddress = this.zzb;
        String zza = zzbc.zza(inetAddress);
        return (!(inetAddress instanceof Inet6Address) || (scopeId = ((Inet6Address) inetAddress).getScopeId()) <= 0) ? zza : TableInfo$$ExternalSyntheticOutline0.m(scopeId, zza, "%");
    }

    @NonNull
    public InetAddress getIpAddress() {
        return this.zzb;
    }

    public int getPort() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(this.zzb, Integer.valueOf(this.zza));
    }

    @NonNull
    public String toString() {
        return getFormattedIpAddress() + MarkdownConstants.LEFT_BRACKET + this.zza + MarkdownConstants.RIGHT_BRACKET;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, getPort());
        SafeParcelWriter.writeString(parcel, 3, getFormattedIpAddress(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @NonNull
    public static NetworkLocation create(@NonNull InetAddress inetAddress, int i) {
        return new NetworkLocation(inetAddress, i);
    }

    private NetworkLocation(InetAddress inetAddress, int i) {
        this.zzb = (InetAddress) Preconditions.checkNotNull(inetAddress);
        this.zza = i;
    }
}

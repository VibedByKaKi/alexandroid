package com.google.android.gms.home.matter.discovery;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.home.matter.common.NetworkLocation;
import com.google.android.gms.internal.home.zzab;
import com.google.android.gms.internal.home.zzac;
import com.google.android.gms.internal.home.zzaj;
import com.google.android.gms.internal.home.zzv;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SafeParcelable.Class(creator = "DnsSdServiceInfoCreator")
/* loaded from: classes7.dex */
public final class DnsSdServiceInfo extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DnsSdServiceInfo> CREATOR = new zza();

    @SafeParcelable.Field(getter = "getTxtRecords", id = 1)
    private final List zza;

    @SafeParcelable.Field(getter = "getNetworkLocations", id = 2)
    private final List zzb;

    @SafeParcelable.Field(getter = "getInstanceName", id = 3)
    private final String zzc;

    @SafeParcelable.Field(getter = "getServiceType", id = 4)
    private final String zzd;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {

        @Nullable
        private String zza;

        @Nullable
        private String zzb;
        private final List zzc = new ArrayList();
        private final Set zzd = new HashSet();
        private final List zze = new ArrayList();

        private final void zza(TxtRecord txtRecord) {
            txtRecord.getClass();
            boolean contains = this.zzd.contains(txtRecord.getKey());
            String key = txtRecord.getKey();
            if (contains) {
                Single$$ExternalSyntheticBUOutline0.m$3(zzac.zza("TXT record with key %s is already added.", key));
            } else {
                this.zzd.add(txtRecord.getKey());
                this.zze.add(txtRecord);
            }
        }

        @NonNull
        public Builder addAllNetworkLocations(@NonNull List<NetworkLocation> list) {
            this.zzc.addAll(list);
            return this;
        }

        @NonNull
        public Builder addAllTxtRecords(@NonNull Collection<TxtRecord> collection) {
            collection.getClass();
            Iterator<TxtRecord> it2 = collection.iterator();
            while (it2.hasNext()) {
                zza(it2.next());
            }
            return this;
        }

        @NonNull
        public Builder addNetworkLocation(@NonNull NetworkLocation networkLocation) {
            List list = this.zzc;
            networkLocation.getClass();
            list.add(networkLocation);
            return this;
        }

        @NonNull
        public Builder addTxtRecord(@NonNull TxtRecord txtRecord) {
            zza(txtRecord);
            return this;
        }

        @NonNull
        public DnsSdServiceInfo build() {
            String str = this.zza;
            boolean z = false;
            zzab.zzg((str == null || str.isEmpty()) ? false : true, "InstanceName must be provided.");
            String str2 = this.zzb;
            if (str2 != null && !str2.isEmpty()) {
                z = true;
            }
            zzab.zzg(z, "ServiceType must be provided.");
            zzab.zzg(!this.zzc.isEmpty(), "At least one NetworkLocation must be provided.");
            List list = this.zze;
            List list2 = this.zzc;
            String str3 = this.zza;
            str3.getClass();
            String str4 = this.zzb;
            str4.getClass();
            return new DnsSdServiceInfo(list, list2, str3, str4);
        }

        @NonNull
        public Builder setInstanceName(@NonNull String str) {
            zzab.zze(!str.isEmpty(), "InstanceName may not be empty.");
            this.zza = str;
            return this;
        }

        @NonNull
        public Builder setServiceType(@NonNull String str) {
            zzab.zze(!str.isEmpty(), "ServiceType may not be empty.");
            this.zzb = str;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public DnsSdServiceInfo(@SafeParcelable.Param(id = 1) List list, @SafeParcelable.Param(id = 2) List list2, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2) {
        this.zza = zzaj.zzl(list);
        this.zzb = zzaj.zzl(list2);
        str.getClass();
        this.zzc = str;
        str2.getClass();
        this.zzd = str2;
    }

    @NonNull
    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DnsSdServiceInfo)) {
            return false;
        }
        DnsSdServiceInfo dnsSdServiceInfo = (DnsSdServiceInfo) obj;
        return this.zza.equals(dnsSdServiceInfo.zza) && this.zzb.equals(dnsSdServiceInfo.zzb) && this.zzc.equals(dnsSdServiceInfo.zzc) && this.zzd.equals(dnsSdServiceInfo.zzd);
    }

    @NonNull
    public String getInstanceName() {
        return this.zzc;
    }

    @NonNull
    public List<NetworkLocation> getNetworkLocations() {
        return this.zzb;
    }

    @NonNull
    public NetworkLocation getPrimaryNetworkLocation() {
        return (NetworkLocation) this.zzb.get(0);
    }

    @NonNull
    public String getServiceType() {
        return this.zzd;
    }

    @Nullable
    public String getTxtAttributeValue(@NonNull String str) {
        for (TxtRecord txtRecord : this.zza) {
            if (zzv.zza(txtRecord.getKey(), str)) {
                return txtRecord.getValue();
            }
        }
        return null;
    }

    @NonNull
    public List<TxtRecord> getTxtRecords() {
        return this.zza;
    }

    public boolean hasTxtAttribute(@NonNull String str) {
        return getTxtAttributeValue(str) != null;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @NonNull
    public String toString() {
        String str = this.zzc;
        String str2 = this.zzd;
        return DoubleList$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("DnsSdServiceInfo{instanceName='", str, "', serviceType='", str2, "', networkLocations="), String.valueOf(this.zzb), ", txtRecords=", String.valueOf(this.zza), StringSubstitutor.DEFAULT_VAR_END);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, getTxtRecords(), false);
        SafeParcelWriter.writeTypedList(parcel, 2, getNetworkLocations(), false);
        SafeParcelWriter.writeString(parcel, 3, getInstanceName(), false);
        SafeParcelWriter.writeString(parcel, 4, getServiceType(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

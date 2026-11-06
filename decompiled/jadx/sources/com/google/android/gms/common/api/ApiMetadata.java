package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@KeepForSdk
@SafeParcelable.Class(creator = "ApiMetadataCreator")
/* loaded from: classes7.dex */
public final class ApiMetadata extends AbstractSafeParcelable {

    @NonNull
    public static final ApiMetadata zza;

    @Nullable
    @SafeParcelable.Field(getter = "getComplianceOptions", id = 1)
    private final ComplianceOptions zzc;

    @SafeParcelable.Field(getter = "isCallbackSupportEnabled", id = 2)
    private final boolean zzd;
    private boolean zze;

    @NonNull
    public static final Parcelable.Creator<ApiMetadata> CREATOR = zza.zza();
    private static final ApiMetadata zzb = newBuilder().build();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @KeepForSdk
    public static final class Builder {

        @Nullable
        private ComplianceOptions zza;
        private boolean zzb = false;
        private boolean zzc;

        @NonNull
        @KeepForSdk
        public ApiMetadata build() {
            ApiMetadata apiMetadata = new ApiMetadata(this.zza, this.zzb);
            apiMetadata.zza(this.zzc);
            return apiMetadata;
        }

        @NonNull
        @KeepForSdk
        public Builder setCallbackSupportEnabled(boolean z) {
            this.zzb = z;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder setComplianceOptions(@Nullable ComplianceOptions complianceOptions) {
            this.zza = complianceOptions;
            return this;
        }

        public final /* synthetic */ Builder zza(boolean z) {
            this.zzc = z;
            return this;
        }
    }

    static {
        Builder newBuilder = newBuilder();
        newBuilder.zza(true);
        zza = newBuilder.build();
    }

    @SafeParcelable.Constructor
    public ApiMetadata(@Nullable @SafeParcelable.Param(id = 1) ComplianceOptions complianceOptions, @SafeParcelable.Param(id = 2) boolean z) {
        this.zzc = complianceOptions;
        this.zzd = z;
    }

    @NonNull
    @KeepForSdk
    public static final ApiMetadata fromComplianceOptions(@NonNull ComplianceOptions complianceOptions) {
        Builder newBuilder = newBuilder();
        newBuilder.setComplianceOptions(complianceOptions);
        return newBuilder.build();
    }

    @NonNull
    @KeepForSdk
    public static final ApiMetadata getEmptyInstance() {
        return zzb;
    }

    @NonNull
    @KeepForSdk
    public static Builder newBuilder() {
        return new Builder();
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ApiMetadata)) {
            return false;
        }
        ApiMetadata apiMetadata = (ApiMetadata) obj;
        return Objects.equal(this.zzc, apiMetadata.zzc) && this.zze == apiMetadata.zze && this.zzd == apiMetadata.zzd;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzc, Boolean.valueOf(this.zze), Boolean.valueOf(this.zzd));
    }

    @NonNull
    @KeepForSdk
    public Builder toBuilder() {
        Builder newBuilder = newBuilder();
        newBuilder.setComplianceOptions(this.zzc);
        newBuilder.setCallbackSupportEnabled(this.zzd);
        newBuilder.zza(this.zze);
        return newBuilder;
    }

    @NonNull
    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        return ErrorUtils$$ExternalSyntheticOutline0.m(new StringBuilder(valueOf.length() + 31), "ApiMetadata(complianceOptions=", valueOf, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        if (this.zze) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zzc, i, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final /* synthetic */ void zza(boolean z) {
        this.zze = z;
    }
}

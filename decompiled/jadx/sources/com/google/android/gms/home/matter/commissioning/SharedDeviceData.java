package com.google.android.gms.home.matter.commissioning;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.home.matter.Matter;
import java.util.Locale;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SafeParcelable.Class(creator = "SharedDeviceDataCreator")
/* loaded from: classes7.dex */
public final class SharedDeviceData extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SharedDeviceData> CREATOR = new zzn();

    @NonNull
    public static final String EXTRA_COMMISSIONING_WINDOW_EXPIRATION = "com.google.android.gms.home.matter.EXTRA_COMMISSIONING_WINDOW_EXPIRATION";

    @NonNull
    public static final String EXTRA_DEVICE_NAME = "com.google.android.gms.home.matter.EXTRA_DEVICE_NAME";

    @NonNull
    @Deprecated
    public static final String EXTRA_DEVICE_TYPE = "com.google.android.gms.home.matter.EXTRA_DEVICE_TYPE";

    @NonNull
    public static final String EXTRA_MANUAL_PAIRING_CODE = "com.google.android.gms.home.matter.EXTRA_MANUAL_PAIRING_CODE";

    @NonNull
    public static final String EXTRA_PRODUCT_ID = "com.google.android.gms.home.matter.EXTRA_PRODUCT_ID";

    @NonNull
    public static final String EXTRA_ROOM_NAME = "com.google.android.gms.home.matter.EXTRA_ROOM_NAME";

    @NonNull
    public static final String EXTRA_VENDOR_ID = "com.google.android.gms.home.matter.EXTRA_VENDOR_ID";

    @SafeParcelable.Field(getter = "getManualPairingCode", id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getCommissioningWindowExpirationMillis", id = 2)
    private final long zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getRoomName", id = 3)
    private final String zzc;

    @SafeParcelable.Field(getter = "getDeviceName", id = 4)
    private final String zzd;

    @SafeParcelable.Field(getter = "getVendorId", id = 5)
    private final int zze;

    @SafeParcelable.Field(getter = "getProductId", id = 6)
    private final int zzf;

    @SafeParcelable.Field(getter = "getDeviceType", id = 7)
    private final int zzg;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private final String zza;
        private int zzb = 0;
        private int zzc = 0;
        private int zzd = 0;

        @Nullable
        private String zze;

        @Nullable
        private String zzf;

        @Nullable
        private Long zzg;

        public /* synthetic */ Builder(String str, zzm zzmVar) {
            this.zza = (String) Preconditions.checkNotNull(str);
        }

        @NonNull
        public SharedDeviceData build() {
            Preconditions.checkState(this.zze != null, "Must set a device name via setDeviceName");
            Preconditions.checkState(this.zzg != null, "Must set a commissioning window expiration.");
            return new SharedDeviceData(this.zza, ((Long) Preconditions.checkNotNull(this.zzg)).longValue(), this.zzf, (String) Preconditions.checkNotNull(this.zze), this.zzb, this.zzc, this.zzd);
        }

        @NonNull
        public Builder setCommissioningWindowExpirationMillis(@IntRange(from = 0) long j) {
            Preconditions.checkArgument(j >= 0, "Expiration should be based on SystemClock.elapsedRealtime() and must be >= 0.");
            this.zzg = Long.valueOf(j);
            return this;
        }

        @NonNull
        public Builder setDeviceName(@NonNull String str) {
            Preconditions.checkArgument(!((String) Preconditions.checkNotNull(str)).isEmpty(), "Device name may not be empty.");
            this.zze = str;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setDeviceType(@IntRange(from = 0, to = 65535) int i) {
            boolean z = false;
            if (i >= 0 && i <= 65535) {
                z = true;
            }
            Preconditions.checkArgument(z, "Device Type 0x%04X out of range [0,FFFF]");
            this.zzd = i;
            return this;
        }

        @NonNull
        public Builder setProductId(@IntRange(from = 0, to = 65535) int i) {
            boolean z = false;
            if (i >= 0 && i <= 65535) {
                z = true;
            }
            Preconditions.checkArgument(z, "Product ID 0x%04X out of range [0,FFFF]");
            this.zzc = i;
            return this;
        }

        @NonNull
        public Builder setRoomName(@Nullable String str) {
            this.zzf = str;
            return this;
        }

        @NonNull
        public Builder setVendorId(@IntRange(from = 0, to = 65535) int i) {
            boolean z = false;
            if (i >= 0 && i <= 65535) {
                z = true;
            }
            Preconditions.checkArgument(z, "Vendor ID 0x%04X out of range [0,FFFF]");
            this.zzb = i;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public SharedDeviceData(@SafeParcelable.Param(id = 1) String str, @IntRange(from = 0) @SafeParcelable.Param(id = 2) long j, @Nullable @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3, @IntRange(from = 0, to = 65535) @SafeParcelable.Param(id = 5) int i, @IntRange(from = 0, to = 65535) @SafeParcelable.Param(id = 6) int i2, @IntRange(from = 0, to = 65535) @SafeParcelable.Param(id = 7) int i3) {
        Preconditions.checkArgument(i >= 0 && i <= 65535, "Vendor ID invalid: %04X", Integer.valueOf(i));
        boolean z = i2 >= 0 && i2 <= 65535;
        Integer valueOf = Integer.valueOf(i2);
        Preconditions.checkArgument(z, "Product ID invalid: %04X", valueOf);
        Preconditions.checkArgument(i3 >= 0 && i3 <= 65535, "Device type invalid: %04X", valueOf);
        Preconditions.checkArgument(j >= 0, "Invalid commissioning window expiration %d", Long.valueOf(j));
        this.zza = (String) Preconditions.checkNotNull(str);
        this.zzb = j;
        this.zzc = str2;
        this.zzd = (String) Preconditions.checkNotNull(str3);
        this.zze = i;
        this.zzf = i2;
        this.zzg = i3;
    }

    @NonNull
    public static Builder builder(@NonNull String str) {
        return new Builder(str, null);
    }

    @NonNull
    public static SharedDeviceData fromIntent(@NonNull Intent intent) throws InvalidSharedDeviceDataException {
        if (!intent.hasExtra(EXTRA_MANUAL_PAIRING_CODE)) {
            throw new InvalidSharedDeviceDataException("Manual pairing code was missing.");
        }
        if (!intent.hasExtra(EXTRA_COMMISSIONING_WINDOW_EXPIRATION)) {
            throw new InvalidSharedDeviceDataException("Commissioning window expiration was missing.");
        }
        if (!intent.hasExtra(EXTRA_DEVICE_NAME)) {
            throw new InvalidSharedDeviceDataException("Device name was missing.");
        }
        if (!intent.hasExtra("com.google.android.gms.home.matter.EXTRA_VENDOR_ID")) {
            throw new InvalidSharedDeviceDataException("Vendor ID was missing.");
        }
        if (!intent.hasExtra("com.google.android.gms.home.matter.EXTRA_PRODUCT_ID")) {
            throw new InvalidSharedDeviceDataException("Product ID was missing.");
        }
        try {
            return new SharedDeviceData((String) Preconditions.checkNotNull(intent.getStringExtra(EXTRA_MANUAL_PAIRING_CODE)), intent.getLongExtra(EXTRA_COMMISSIONING_WINDOW_EXPIRATION, 0L), intent.getStringExtra(EXTRA_ROOM_NAME), (String) Preconditions.checkNotNull(intent.getStringExtra(EXTRA_DEVICE_NAME)), intent.getIntExtra("com.google.android.gms.home.matter.EXTRA_VENDOR_ID", 0), intent.getIntExtra("com.google.android.gms.home.matter.EXTRA_PRODUCT_ID", 0), intent.getIntExtra(EXTRA_DEVICE_TYPE, 0));
        } catch (IllegalArgumentException e) {
            throw new InvalidSharedDeviceDataException("Invalid parameters in Intent data.", e);
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedDeviceData)) {
            return false;
        }
        SharedDeviceData sharedDeviceData = (SharedDeviceData) obj;
        return this.zzb == sharedDeviceData.zzb && this.zze == sharedDeviceData.zze && this.zzf == sharedDeviceData.zzf && this.zzg == sharedDeviceData.zzg && this.zza.equals(sharedDeviceData.zza) && Objects.equal(this.zzc, sharedDeviceData.zzc) && this.zzd.equals(sharedDeviceData.zzd);
    }

    @IntRange(from = 0)
    public long getCommissioningWindowExpirationMillis() {
        return this.zzb;
    }

    @NonNull
    public String getDeviceName() {
        return this.zzd;
    }

    @IntRange(from = 0, to = WebSocketProtocol.PAYLOAD_SHORT_MAX)
    @Deprecated
    public int getDeviceType() {
        return this.zzg;
    }

    @NonNull
    public String getManualPairingCode() {
        return this.zza;
    }

    @IntRange(from = 0, to = WebSocketProtocol.PAYLOAD_SHORT_MAX)
    public int getProductId() {
        return this.zzf;
    }

    @Nullable
    public String getRoomName() {
        return this.zzc;
    }

    @IntRange(from = 0, to = WebSocketProtocol.PAYLOAD_SHORT_MAX)
    public int getVendorId() {
        return this.zze;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, Long.valueOf(this.zzb), this.zzc, this.zzd, Integer.valueOf(this.zze), Integer.valueOf(this.zzf), Integer.valueOf(this.zzg));
    }

    @NonNull
    public Intent toIntent() {
        return new Intent(Matter.ACTION_COMMISSION_DEVICE).putExtra(EXTRA_MANUAL_PAIRING_CODE, this.zza).putExtra(EXTRA_COMMISSIONING_WINDOW_EXPIRATION, this.zzb).putExtra(EXTRA_ROOM_NAME, this.zzc).putExtra(EXTRA_DEVICE_NAME, this.zzd).putExtra("com.google.android.gms.home.matter.EXTRA_VENDOR_ID", this.zze).putExtra("com.google.android.gms.home.matter.EXTRA_PRODUCT_ID", this.zzf).putExtra(EXTRA_DEVICE_TYPE, this.zzg).addCategory("android.intent.category.DEFAULT");
    }

    @NonNull
    public String toString() {
        int length = this.zza.length();
        long j = this.zzb;
        String str = this.zzc;
        String str2 = this.zzd;
        Locale locale = Locale.ROOT;
        String format = String.format(locale, ", vendorId=0x%04X", Integer.valueOf(this.zze));
        String format2 = String.format(locale, ", productId=0x%04X", Integer.valueOf(this.zzf));
        String format3 = String.format(locale, ", deviceType=0x%04X", Integer.valueOf(this.zzg));
        StringBuilder m = Automotive$$ExternalSyntheticOutline0.m(j, "SharedDeviceData{manualPairingCode=<length=", length, ">, commissioningWindowExpirationMillis=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, ", roomName='", str, "', deviceName='", str2);
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, "'", format, format2, format3);
        m.append(StringSubstitutor.DEFAULT_VAR_END);
        return m.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getManualPairingCode(), false);
        SafeParcelWriter.writeLong(parcel, 2, getCommissioningWindowExpirationMillis());
        SafeParcelWriter.writeString(parcel, 3, getRoomName(), false);
        SafeParcelWriter.writeString(parcel, 4, getDeviceName(), false);
        SafeParcelWriter.writeInt(parcel, 5, getVendorId());
        SafeParcelWriter.writeInt(parcel, 6, getProductId());
        SafeParcelWriter.writeInt(parcel, 7, getDeviceType());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InvalidSharedDeviceDataException extends Exception {
        public InvalidSharedDeviceDataException(@NonNull String str) {
            super(str);
        }

        public InvalidSharedDeviceDataException(@NonNull String str, @NonNull Throwable th) {
            super(str, th);
        }
    }
}

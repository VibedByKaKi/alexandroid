package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/google/android/gms/identitycredentials/ClearRegistryResponse;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "isDeleted", "", "<init>", "(Z)V", "()Z", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "Companion", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SafeParcelable.Class(creator = "ClearRegistryResponseCreator")
/* loaded from: classes7.dex */
public final class ClearRegistryResponse extends AbstractSafeParcelable {

    @SafeParcelable.Field(getter = "isDeleted", id = 1)
    private final boolean isDeleted;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<ClearRegistryResponse> CREATOR = new ClearRegistryResponseCreator();

    @SafeParcelable.Constructor
    public ClearRegistryResponse(@SafeParcelable.Param(id = 1) boolean z) {
        this.isDeleted = z;
    }

    /* renamed from: isDeleted, reason: from getter */
    public final boolean getIsDeleted() {
        return this.isDeleted;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.getClass();
        ClearRegistryResponseCreator.writeToParcel(this, dest, flags);
    }
}

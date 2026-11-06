package com.google.android.gms.auth.blockstore.restorecredential;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/google/android/gms/auth/blockstore/restorecredential/ClearRestoreCredentialRequest;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "requestBundle", "Landroid/os/Bundle;", "<init>", "(Landroid/os/Bundle;)V", "getRequestBundle", "()Landroid/os/Bundle;", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "Companion", "java.com.google.android.gmscore.integ.client.auth_blockstore_client_auth_blockstore"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SafeParcelable.Class(creator = "ClearRestoreCredentialRequestCreator")
/* loaded from: classes7.dex */
public final class ClearRestoreCredentialRequest extends AbstractSafeParcelable {

    @SafeParcelable.Field(getter = "getRequestBundle", id = 1)
    @NotNull
    private final Bundle requestBundle;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<ClearRestoreCredentialRequest> CREATOR = new ClearRestoreCredentialRequestCreator();

    @SafeParcelable.Constructor
    public ClearRestoreCredentialRequest(@NonNull @SafeParcelable.Param(id = 1) Bundle bundle) {
        bundle.getClass();
        this.requestBundle = bundle;
    }

    @NotNull
    public final Bundle getRequestBundle() {
        return this.requestBundle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.getClass();
        ClearRestoreCredentialRequestCreator.writeToParcel(this, dest, flags);
    }
}

package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB9\b\u0007\u0012\u000e\b\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/google/android/gms/identitycredentials/GetCredentialRequest;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "Lcom/google/android/gms/common/internal/ReflectedParcelable;", "credentialOptions", "", "Lcom/google/android/gms/identitycredentials/CredentialOption;", "data", "Landroid/os/Bundle;", "origin", "", "resultReceiver", "Landroid/os/ResultReceiver;", "<init>", "(Ljava/util/List;Landroid/os/Bundle;Ljava/lang/String;Landroid/os/ResultReceiver;)V", "getCredentialOptions", "()Ljava/util/List;", "getData", "()Landroid/os/Bundle;", "getOrigin", "()Ljava/lang/String;", "getResultReceiver$annotations", "()V", "getResultReceiver", "()Landroid/os/ResultReceiver;", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "Companion", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SafeParcelable.Class(creator = "GetCredentialRequestCreator")
/* loaded from: classes7.dex */
public final class GetCredentialRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @SafeParcelable.Field(getter = "getCredentialOptions", id = 1)
    @NotNull
    private final List<CredentialOption> credentialOptions;

    @SafeParcelable.Field(getter = "getData", id = 2)
    @NotNull
    private final Bundle data;

    @SafeParcelable.Field(getter = "getOrigin", id = 3)
    @Nullable
    private final String origin;

    @SafeParcelable.Field(getter = "getResultReceiver", id = 4)
    @NotNull
    private final ResultReceiver resultReceiver;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<GetCredentialRequest> CREATOR = new GetCredentialRequestCreator();

    @SafeParcelable.Constructor
    public GetCredentialRequest(@NonNull @SafeParcelable.Param(id = 1) List<CredentialOption> list, @NonNull @SafeParcelable.Param(id = 2) Bundle bundle, @SafeParcelable.Param(id = 3) @Nullable String str, @NonNull @SafeParcelable.Param(id = 4) ResultReceiver resultReceiver) {
        list.getClass();
        bundle.getClass();
        resultReceiver.getClass();
        this.credentialOptions = list;
        this.data = bundle;
        this.origin = str;
        this.resultReceiver = resultReceiver;
    }

    @NotNull
    public final List<CredentialOption> getCredentialOptions() {
        return this.credentialOptions;
    }

    @NotNull
    public final Bundle getData() {
        return this.data;
    }

    @androidx.annotation.Nullable
    public final String getOrigin() {
        return this.origin;
    }

    @NotNull
    public final ResultReceiver getResultReceiver() {
        return this.resultReceiver;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.getClass();
        GetCredentialRequestCreator.writeToParcel(this, dest, flags);
    }
}

package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dBE\b\u0007\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0003\u0010\b\u001a\u00020\u0003\u0012\b\b\u0003\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u001c\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/google/android/gms/identitycredentials/CredentialOption;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "type", "", "credentialRetrievalData", "Landroid/os/Bundle;", "candidateQueryData", "requestMatcher", "requestType", "protocolType", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getCredentialRetrievalData", "()Landroid/os/Bundle;", "getCandidateQueryData", "getRequestMatcher", "getRequestType$annotations", "()V", "getRequestType", "getProtocolType$annotations", "getProtocolType", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "Companion", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SafeParcelable.Class(creator = "CredentialOptionCreator")
/* loaded from: classes7.dex */
public final class CredentialOption extends AbstractSafeParcelable {

    @SafeParcelable.Field(getter = "getCandidateQueryData", id = 3)
    @NotNull
    private final Bundle candidateQueryData;

    @SafeParcelable.Field(getter = "getCredentialRetrievalData", id = 2)
    @NotNull
    private final Bundle credentialRetrievalData;

    @SafeParcelable.Field(defaultValue = "", getter = "getProtocolType", id = 6)
    @NotNull
    private final String protocolType;

    @SafeParcelable.Field(getter = "getRequestMatcher", id = 4)
    @NotNull
    private final String requestMatcher;

    @SafeParcelable.Field(defaultValue = "", getter = "getRequestType", id = 5)
    @NotNull
    private final String requestType;

    @SafeParcelable.Field(defaultValue = "", getter = "getType", id = 1)
    @NotNull
    private final String type;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<CredentialOption> CREATOR = new CredentialOptionCreator();

    @SafeParcelable.Constructor
    public CredentialOption(@NonNull @SafeParcelable.Param(id = 1) String str, @NonNull @SafeParcelable.Param(id = 2) Bundle bundle, @NonNull @SafeParcelable.Param(id = 3) Bundle bundle2, @NonNull @SafeParcelable.Param(id = 4) String str2, @NonNull @SafeParcelable.Param(id = 5) String str3, @NonNull @SafeParcelable.Param(id = 6) String str4) {
        str.getClass();
        bundle.getClass();
        bundle2.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.type = str;
        this.credentialRetrievalData = bundle;
        this.candidateQueryData = bundle2;
        this.requestMatcher = str2;
        this.requestType = str3;
        this.protocolType = str4;
        boolean z = (StringsKt.isBlank(str3) || StringsKt.isBlank(str4)) ? false : true;
        boolean z2 = !StringsKt.isBlank(str) && str3.length() == 0 && str4.length() == 0;
        if (z || z2) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("Either type: ", str, ", or requestType: ", str3, " and protocolType: "), str4, " must be specified, but at least one contains an invalid blank value."));
        throw null;
    }

    @NotNull
    public final Bundle getCandidateQueryData() {
        return this.candidateQueryData;
    }

    @NotNull
    public final Bundle getCredentialRetrievalData() {
        return this.credentialRetrievalData;
    }

    @NotNull
    public final String getProtocolType() {
        return this.protocolType;
    }

    @NotNull
    public final String getRequestMatcher() {
        return this.requestMatcher;
    }

    @NotNull
    public final String getRequestType() {
        return this.requestType;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.getClass();
        CredentialOptionCreator.writeToParcel(this, dest, flags);
    }
}

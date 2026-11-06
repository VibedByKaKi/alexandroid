package com.google.android.gms.fido.fido2.api.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public abstract class RequestOptions extends AbstractSafeParcelable {
    @Nullable
    public abstract AuthenticationExtensions getAuthenticationExtensions();

    @NonNull
    public abstract byte[] getChallenge();

    @Nullable
    public abstract Integer getRequestId();

    @Nullable
    public abstract Double getTimeoutSeconds();

    @Nullable
    public abstract TokenBinding getTokenBinding();

    @NonNull
    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }
}

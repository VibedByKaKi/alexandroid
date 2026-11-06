package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes7.dex */
public abstract class RequestParams extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public abstract Set<Uri> getAllAppIds();

    @NonNull
    public abstract Uri getAppId();

    @NonNull
    public abstract ChannelIdValue getChannelIdValue();

    @NonNull
    public abstract String getDisplayHint();

    @NonNull
    public abstract List<RegisteredKey> getRegisteredKeys();

    @NonNull
    public abstract Integer getRequestId();

    @NonNull
    public abstract Double getTimeoutSeconds();
}

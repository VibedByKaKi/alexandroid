package com.amazon.dee.app.util;

import com.amazon.alexa.identity.api.ProfileType;
import com.amazon.alexa.identity.api.UserIdentity;
import com.amazon.alexa.identity.api.UserProfile;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/dee/app/util/IdentityUtils;", "", "<init>", "()V", "isUserAChild", "", "identity", "Lcom/amazon/alexa/identity/api/UserIdentity;", "util"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IdentityUtils {

    @NotNull
    public static final IdentityUtils INSTANCE = new IdentityUtils();

    private IdentityUtils() {
    }

    @JvmStatic
    public static final boolean isUserAChild(@Nullable UserIdentity identity) {
        UserProfile userProfile;
        return (identity == null || (userProfile = identity.getUserProfile()) == null || userProfile.getProfileType() != ProfileType.CHILD) ? false : true;
    }
}

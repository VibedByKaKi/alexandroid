package com.amazon.alexa.accessory;

import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;
import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class User {
    public static final User ABSENT = new User();
    private final String accessToken;
    private final String directedCustomerId;

    public User(@Nullable String str, @Nonnull String str2) {
        Preconditions.notNull(str2, "directedCustomerId");
        this.accessToken = str;
        this.directedCustomerId = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && User.class == obj.getClass()) {
            User user = (User) obj;
            if (Objects.equals(this.accessToken, user.accessToken) && Objects.equals(this.directedCustomerId, user.directedCustomerId)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public String getAccessToken() {
        return this.accessToken;
    }

    @Nonnull
    public String getDirectedCustomerId() {
        return this.directedCustomerId;
    }

    public int hashCode() {
        return Objects.hash(this.accessToken, this.directedCustomerId);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("User{accessToken='");
        sb.append(this.accessToken == null ? "null" : "RESTRICTED_DATA");
        sb.append("', directedCustomerId='");
        return a$$ExternalSyntheticOutline0.m(sb, this.directedCustomerId, "'}");
    }

    private User() {
        this(null, "");
    }
}

package com.amazon.blueshift.bluefront.android.common;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class BluefrontCredential {
    private final String mAccessId;
    private final String mAccessKey;

    public BluefrontCredential(String str, String str2) {
        Preconditions.checkArgument(!Strings.isNullOrEmpty(str), "Access ID cannot be null or empty.");
        Preconditions.checkArgument(!Strings.isNullOrEmpty(str2), "Access key cannot be null or empty.");
        this.mAccessId = str;
        this.mAccessKey = str2;
    }

    public String getAccessId() {
        return this.mAccessId;
    }

    public String getAccessKey() {
        return this.mAccessKey;
    }
}

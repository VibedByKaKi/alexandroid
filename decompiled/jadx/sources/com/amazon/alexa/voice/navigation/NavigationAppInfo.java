package com.amazon.alexa.voice.navigation;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class NavigationAppInfo {
    private final String appDisplayName;
    private final String appFullName;
    private final String appIconAsset;
    private final boolean isPreferred;

    private NavigationAppInfo(String str, String str2, boolean z, String str3) {
        this.appDisplayName = str;
        this.appFullName = str2;
        this.isPreferred = z;
        this.appIconAsset = str3;
    }

    public static NavigationAppInfo create(String str, String str2, boolean z) {
        return new NavigationAppInfo(str, str2, z, null);
    }

    public String getAppDisplayName() {
        return this.appDisplayName;
    }

    public String getAppFullName() {
        return this.appFullName;
    }

    @Nullable
    public String getAppIconAsset() {
        return this.appIconAsset;
    }

    public boolean isPreferred() {
        return this.isPreferred;
    }

    public static NavigationAppInfo create(String str, String str2, boolean z, String str3) {
        return new NavigationAppInfo(str, str2, z, str3);
    }
}

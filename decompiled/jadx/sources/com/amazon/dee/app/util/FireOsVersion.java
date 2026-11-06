package com.amazon.dee.app.util;

import android.os.Build;
import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0017J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/dee/app/util/FireOsVersion;", "", "<init>", "()V", "getAndroidSDKVersion", "", "getVersion", "", "isFireOS", "", "()Z", "util"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public class FireOsVersion {
    private final boolean isFireOS = Intrinsics.areEqual("Amazon", Build.MANUFACTURER);

    @VisibleForTesting
    public int getAndroidSDKVersion() {
        return Build.VERSION.SDK_INT;
    }

    @Nullable
    public final String getVersion() {
        int androidSDKVersion = getAndroidSDKVersion();
        if (androidSDKVersion < 22) {
            return null;
        }
        return androidSDKVersion < 25 ? "5.0" : androidSDKVersion < 28 ? "6.0" : androidSDKVersion < 30 ? "7.0" : androidSDKVersion == 30 ? "8.0" : String.valueOf(androidSDKVersion);
    }

    /* renamed from: isFireOS, reason: from getter */
    public final boolean getIsFireOS() {
        return this.isFireOS;
    }
}

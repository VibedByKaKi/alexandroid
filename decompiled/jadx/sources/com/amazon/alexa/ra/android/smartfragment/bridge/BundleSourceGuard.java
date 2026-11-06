package com.amazon.alexa.ra.android.smartfragment.bridge;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/bridge/BundleSourceGuard;", "", "<init>", "()V", "isRejectedUrlSource", "", "bundleSource", "", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class BundleSourceGuard {
    public static final int $stable = 0;

    @NotNull
    public static final BundleSourceGuard INSTANCE = new BundleSourceGuard();

    private BundleSourceGuard() {
    }

    public final boolean isRejectedUrlSource(@NotNull String bundleSource) {
        CharSequence trimStart;
        boolean startsWith$default;
        boolean startsWith$default2;
        bundleSource.getClass();
        trimStart = StringsKt__StringsKt.trimStart((CharSequence) bundleSource);
        String lowerCase = trimStart.toString().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(lowerCase, "http://", false, 2, null);
        if (startsWith$default) {
            return true;
        }
        startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(lowerCase, "https://", false, 2, null);
        return startsWith$default2;
    }
}

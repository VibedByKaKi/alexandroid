package com.amazon.dee.app.ui.main;

import android.os.Build;
import com.amazon.dee.app.services.logging.Log;
import com.dee.app.contacts.common.constants.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/amazon/dee/app/ui/main/LiveModeSocGuard;", "", "<init>", "()V", Constants.LOG_TAG, "", "LIVE_MODE_BLOCKED_SOC_PREFIXES", "", "[Ljava/lang/String;", "isLiveModeBlockedSoc", "", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LiveModeSocGuard {

    @NotNull
    public static final LiveModeSocGuard INSTANCE = new LiveModeSocGuard();

    @NotNull
    private static final String TAG = Log.tag((Class<?>) LiveModeSocGuard.class);

    @NotNull
    private static final String[] LIVE_MODE_BLOCKED_SOC_PREFIXES = {"SM8750", "SM8850", "SM8845"};

    private LiveModeSocGuard() {
    }

    @JvmStatic
    public static final boolean isLiveModeBlockedSoc() {
        String str;
        boolean startsWith$default;
        if (Build.VERSION.SDK_INT >= 31) {
            str = Build.SOC_MODEL;
            str.getClass();
            if (!Intrinsics.areEqual("unknown", str)) {
                for (String str2 : LIVE_MODE_BLOCKED_SOC_PREFIXES) {
                    startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, str2, false, 2, null);
                    if (startsWith$default) {
                        Log.i(TAG, "Live Mode disabled by SoC crash guard: SoC=" + str + " matches " + str2);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

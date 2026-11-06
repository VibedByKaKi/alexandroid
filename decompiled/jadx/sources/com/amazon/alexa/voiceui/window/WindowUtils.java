package com.amazon.alexa.voiceui.window;

import android.view.Window;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.utils.ApiThreadHelper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class WindowUtils {

    @VisibleForTesting
    static final int PASSTHROUGH_FLAGS = 56;

    private WindowUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean doesCurrentWindowAllowPassthrough(Window window) {
        return (window.getAttributes().flags & 56) == 56;
    }

    public static void setTouchEventPassThrough(final Window window, final boolean z) {
        ApiThreadHelper.runOnUiThread(new Runnable() { // from class: com.amazon.alexa.voiceui.window.WindowUtils.1
            @Override // java.lang.Runnable
            public void run() {
                boolean doesCurrentWindowAllowPassthrough = WindowUtils.doesCurrentWindowAllowPassthrough(window);
                boolean z2 = z;
                boolean z3 = doesCurrentWindowAllowPassthrough != z2;
                if (z3 && z2) {
                    window.addFlags(56);
                } else if (z3) {
                    window.clearFlags(56);
                }
            }
        });
    }
}

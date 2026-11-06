package amazon.speech.simclient.focus;

import android.util.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public enum UnbindBehavior {
    CLEAR_FOCUS,
    RELEASE_FOCUS;

    private static final UnbindBehavior DEFAULT;
    private static final String TAG;

    static {
        UnbindBehavior unbindBehavior = CLEAR_FOCUS;
        TAG = "UnbindBehavior";
        DEFAULT = unbindBehavior;
    }

    public static UnbindBehavior fromString(String str) {
        if (str == null) {
            return DEFAULT;
        }
        try {
            return valueOf(str);
        } catch (Exception e) {
            Log.w(TAG, "Error converting '" + str + "' to UnbindBehavior, defaulting to " + DEFAULT, e);
            return DEFAULT;
        }
    }
}

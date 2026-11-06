package androidx.tracing;

import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(29)
/* loaded from: classes14.dex */
final class TraceApi29Impl {
    private TraceApi29Impl() {
    }

    public static void beginAsyncSection(@NonNull String str, int i) {
        android.os.Trace.beginAsyncSection(str, i);
    }

    public static void endAsyncSection(@NonNull String str, int i) {
        android.os.Trace.endAsyncSection(str, i);
    }

    @DoNotInline
    public static boolean isEnabled() {
        return android.os.Trace.isEnabled();
    }

    public static void setCounter(@NonNull String str, int i) {
        android.os.Trace.setCounter(str, i);
    }
}

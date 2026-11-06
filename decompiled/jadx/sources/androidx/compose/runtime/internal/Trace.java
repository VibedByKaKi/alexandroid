package androidx.compose.runtime.internal;

import com.amazon.alexa.ra.core.data.fragments.SmartFragmentContent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/internal/Trace;", "", "<init>", "()V", "beginSection", "name", "", "endSection", "", "token", SmartFragmentContent.RUNTIME}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Trace {
    public static final int $stable = 0;

    @NotNull
    public static final Trace INSTANCE = new Trace();

    private Trace() {
    }

    @Nullable
    public final Object beginSection(@NotNull String name) {
        android.os.Trace.beginSection(name);
        return null;
    }

    public final void endSection(@Nullable Object token) {
        android.os.Trace.endSection();
    }
}

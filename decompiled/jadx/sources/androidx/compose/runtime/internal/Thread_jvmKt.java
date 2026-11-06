package androidx.compose.runtime.internal;

import com.amazon.alexa.ra.core.data.fragments.SmartFragmentContent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\u001a\b\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"currentThreadId", "", "currentThreadName", "", SmartFragmentContent.RUNTIME}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Thread_jvmKt {
    public static final long currentThreadId() {
        return Thread.currentThread().getId();
    }

    @NotNull
    public static final String currentThreadName() {
        return Thread.currentThread().getName();
    }
}

package com.bugsnag.android.performance.internal;

import com.amazon.alexa.accessory.frames.contacts.ContactsModuleConstants;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002*\u00060\u0003j\u0002`\u00042\u0006\u0010\u0005\u001a\u0002H\u0001H\u0000¢\u0006\u0002\u0010\u0006*\f\b\u0000\u0010\u0007\"\u00020\u00032\u00020\u0003¨\u0006\b"}, d2 = {"unlinkTo", "C", "", "Lcom/bugsnag/android/performance/internal/SpanImpl;", "Lcom/bugsnag/android/performance/internal/SpanChain;", ContactsModuleConstants.OUTPUT, "(Lcom/bugsnag/android/performance/internal/SpanImpl;Ljava/util/Collection;)Ljava/util/Collection;", "SpanChain", "bugsnag-android-performance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName(name = "SpanChains")
/* loaded from: classes6.dex */
public final class SpanChains {
    @NotNull
    public static final <C extends Collection<SpanImpl>> C unlinkTo(@NotNull SpanImpl spanImpl, @NotNull C c) {
        spanImpl.getClass();
        c.getClass();
        while (spanImpl != null) {
            SpanImpl spanImpl2 = spanImpl.next;
            spanImpl.next = null;
            c.add(spanImpl);
            spanImpl = spanImpl2;
        }
        return c;
    }
}

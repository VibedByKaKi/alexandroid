package com.bugsnag.android.performance.internal.controls;

import com.bugsnag.android.performance.controls.SpanControlProvider;
import com.bugsnag.android.performance.controls.SpanQuery;
import com.bugsnag.android.performance.internal.util.Prioritized;
import com.bugsnag.android.performance.internal.util.PrioritizedSet;
import com.dee.app.metrics.MetricsConstants;
import com.google.android.gms.actions.SearchIntents;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u0010\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\rJ\u001e\u0010\u000e\u001a\u00020\u000b2\u0016\u0010\u000f\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\r0\u0010J(\u0010\u0011\u001a\u0004\u0018\u00010\u0002\"\u000e\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0014\u001a\u0002H\u0012H\u0096\u0002¢\u0006\u0002\u0010\u0015R\u0018\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/bugsnag/android/performance/internal/controls/CompositeSpanControlProvider;", "Lcom/bugsnag/android/performance/controls/SpanControlProvider;", "", "()V", "providers", "Lcom/bugsnag/android/performance/internal/util/PrioritizedSet;", "size", "", "getSize", "()I", "addProvider", "", "provider", "Lcom/bugsnag/android/performance/internal/util/Prioritized;", "addProviders", "newProviders", "", MetricsConstants.Method.CACHE_GET, "Q", "Lcom/bugsnag/android/performance/controls/SpanQuery;", SearchIntents.EXTRA_QUERY, "(Lcom/bugsnag/android/performance/controls/SpanQuery;)Ljava/lang/Object;", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCompositeSpanControlProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositeSpanControlProvider.kt\ncom/bugsnag/android/performance/internal/controls/CompositeSpanControlProvider\n+ 2 Prioritized.kt\ncom/bugsnag/android/performance/internal/util/PrioritizedSet\n*L\n1#1,60:1\n94#2,4:61\n*S KotlinDebug\n*F\n+ 1 CompositeSpanControlProvider.kt\ncom/bugsnag/android/performance/internal/controls/CompositeSpanControlProvider\n*L\n48#1:61,4\n*E\n"})
/* loaded from: classes6.dex */
public final class CompositeSpanControlProvider implements SpanControlProvider<Object> {

    @NotNull
    private final PrioritizedSet<SpanControlProvider<?>> providers = new PrioritizedSet<>();

    public final void addProvider(@NotNull Prioritized<SpanControlProvider<?>> provider) {
        provider.getClass();
        this.providers.add(provider);
    }

    public final void addProviders(@NotNull Collection<Prioritized<SpanControlProvider<?>>> newProviders) {
        newProviders.getClass();
        this.providers.addAll(newProviders);
    }

    @Override // com.bugsnag.android.performance.controls.SpanControlProvider
    @Nullable
    public <Q extends SpanQuery<? extends Object>> Object get(@NotNull Q query) {
        query.getClass();
        for (Prioritized<SpanControlProvider<?>> prioritized : this.providers.getValues()) {
            SpanControlProvider<?> value = prioritized.getValue();
            value.getClass();
            Object obj = value.get(query);
            if (obj != null) {
                return obj;
            }
        }
        return null;
    }

    public final int getSize() {
        return this.providers.getSize();
    }
}

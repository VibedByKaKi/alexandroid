package com.bugsnag.android.performance.internal;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH&R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\r"}, d2 = {"Lcom/bugsnag/android/performance/internal/Sampler;", "", "sampleProbability", "", "getSampleProbability", "()D", "sampled", "", "Lcom/bugsnag/android/performance/internal/SpanImpl;", "spans", "shouldKeepSpan", "", "span", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Sampler {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSampler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sampler.kt\ncom/bugsnag/android/performance/internal/Sampler$DefaultImpls\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,51:1\n766#2:52\n857#2,2:53\n*S KotlinDebug\n*F\n+ 1 Sampler.kt\ncom/bugsnag/android/performance/internal/Sampler$DefaultImpls\n*L\n7#1:52\n7#1:53,2\n*E\n"})
    public static final class DefaultImpls {
        public static double getSampleProbability(@NotNull Sampler sampler) {
            return 1.0d;
        }

        @NotNull
        public static Collection<SpanImpl> sampled(@NotNull Sampler sampler, @NotNull Collection<SpanImpl> collection) {
            collection.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj : collection) {
                if (sampler.shouldKeepSpan((SpanImpl) obj)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    double getSampleProbability();

    @NotNull
    Collection<SpanImpl> sampled(@NotNull Collection<SpanImpl> spans);

    boolean shouldKeepSpan(@NotNull SpanImpl span);
}

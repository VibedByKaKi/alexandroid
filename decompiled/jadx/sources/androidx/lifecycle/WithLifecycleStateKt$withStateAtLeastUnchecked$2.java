package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
@SourceDebugExtension({"SMAP\nWithLifecycleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt$withStateAtLeastUnchecked$2\n*L\n1#1,175:1\n*E\n"})
/* loaded from: classes14.dex */
public final class WithLifecycleStateKt$withStateAtLeastUnchecked$2<R> implements Function0<R> {
    final /* synthetic */ Function0<R> $block;

    /* JADX WARN: Multi-variable type inference failed */
    public WithLifecycleStateKt$withStateAtLeastUnchecked$2(Function0<? extends R> function0) {
        this.$block = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final R invoke() {
        return this.$block.invoke();
    }
}

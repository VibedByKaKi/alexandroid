package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [Value, Key] */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public /* synthetic */ class Pager$flow$1<Key, Value> extends FunctionReferenceImpl implements Function1<Continuation<? super PagingSource<Key, Value>>, Object>, SuspendFunction {
    public Pager$flow$1(Object obj) {
        super(1, obj, SuspendingPagingSourceFactory.class, "create", "create(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@NotNull Continuation<? super PagingSource<Key, Value>> continuation) {
        return ((SuspendingPagingSourceFactory) this.receiver).create(continuation);
    }
}

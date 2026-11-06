package com.amazon.photos.coroutines;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00048VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006R\u001b\u0010\u000f\u001a\u00020\u00048VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u0010\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/amazon/photos/coroutines/CoroutineContextProvider;", "", "()V", "default", "Lkotlin/coroutines/CoroutineContext;", "getDefault", "()Lkotlin/coroutines/CoroutineContext;", "default$delegate", "Lkotlin/Lazy;", "io", "getIo", "io$delegate", "main", "getMain", "main$delegate", "unconfined", "getUnconfined", "unconfined$delegate", "PhotosAndroidCoroutineUtils_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public class CoroutineContextProvider {

    /* renamed from: default$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy default = LazyKt.lazy(new Function0<CoroutineDispatcher>() { // from class: com.amazon.photos.coroutines.CoroutineContextProvider$default$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final CoroutineDispatcher invoke() {
            return Dispatchers.getDefault();
        }
    });

    /* renamed from: main$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy main = LazyKt.lazy(new Function0<MainCoroutineDispatcher>() { // from class: com.amazon.photos.coroutines.CoroutineContextProvider$main$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final MainCoroutineDispatcher invoke() {
            return Dispatchers.getMain();
        }
    });

    /* renamed from: io$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy io = LazyKt.lazy(new Function0<CoroutineDispatcher>() { // from class: com.amazon.photos.coroutines.CoroutineContextProvider$io$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final CoroutineDispatcher invoke() {
            return Dispatchers.getIO();
        }
    });

    /* renamed from: unconfined$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy unconfined = LazyKt.lazy(new Function0<CoroutineDispatcher>() { // from class: com.amazon.photos.coroutines.CoroutineContextProvider$unconfined$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final CoroutineDispatcher invoke() {
            return Dispatchers.getUnconfined();
        }
    });

    @NotNull
    public CoroutineContext getDefault() {
        return (CoroutineContext) this.default.getValue();
    }

    @NotNull
    public CoroutineContext getIo() {
        return (CoroutineContext) this.io.getValue();
    }

    @NotNull
    public CoroutineContext getMain() {
        return (CoroutineContext) this.main.getValue();
    }

    @NotNull
    public CoroutineContext getUnconfined() {
        return (CoroutineContext) this.unconfined.getValue();
    }
}

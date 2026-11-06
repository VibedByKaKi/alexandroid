package com.amazon.tarazed.coroutine.dispatcher;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lcom/amazon/tarazed/coroutine/dispatcher/DispatcherProvider;", "", "default", "Lkotlinx/coroutines/CoroutineDispatcher;", "io", "main", "unconfined", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface DispatcherProvider {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        /* renamed from: default, reason: not valid java name */
        public static CoroutineDispatcher m23081default(@NotNull DispatcherProvider dispatcherProvider) {
            return Dispatchers.getDefault();
        }

        @NotNull
        public static CoroutineDispatcher io(@NotNull DispatcherProvider dispatcherProvider) {
            return Dispatchers.getIO();
        }

        @NotNull
        public static CoroutineDispatcher main(@NotNull DispatcherProvider dispatcherProvider) {
            return Dispatchers.getMain();
        }

        @NotNull
        public static CoroutineDispatcher unconfined(@NotNull DispatcherProvider dispatcherProvider) {
            return Dispatchers.getUnconfined();
        }
    }

    @NotNull
    /* renamed from: default */
    CoroutineDispatcher mo23080default();

    @NotNull
    CoroutineDispatcher io();

    @NotNull
    CoroutineDispatcher main();

    @NotNull
    CoroutineDispatcher unconfined();
}

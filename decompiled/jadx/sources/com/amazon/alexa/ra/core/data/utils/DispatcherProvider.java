package com.amazon.alexa.ra.core.data.utils;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/data/utils/DispatcherProvider;", "", "main", "Lkotlinx/coroutines/CoroutineDispatcher;", "default", "io", "unconfined", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface DispatcherProvider {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        @NotNull
        /* renamed from: default, reason: not valid java name */
        public static CoroutineDispatcher m17774default(@NotNull DispatcherProvider dispatcherProvider) {
            return DispatcherProvider.super.m17773default();
        }

        @Deprecated
        @NotNull
        public static CoroutineDispatcher io(@NotNull DispatcherProvider dispatcherProvider) {
            return DispatcherProvider.super.io();
        }

        @Deprecated
        @NotNull
        public static CoroutineDispatcher main(@NotNull DispatcherProvider dispatcherProvider) {
            return DispatcherProvider.super.main();
        }

        @Deprecated
        @NotNull
        public static CoroutineDispatcher unconfined(@NotNull DispatcherProvider dispatcherProvider) {
            return DispatcherProvider.super.unconfined();
        }
    }

    @NotNull
    /* renamed from: default, reason: not valid java name */
    default CoroutineDispatcher m17773default() {
        return Dispatchers.getDefault();
    }

    @NotNull
    default CoroutineDispatcher io() {
        return Dispatchers.getIO();
    }

    @NotNull
    default CoroutineDispatcher main() {
        return Dispatchers.getMain();
    }

    @NotNull
    default CoroutineDispatcher unconfined() {
        return Dispatchers.getUnconfined();
    }
}

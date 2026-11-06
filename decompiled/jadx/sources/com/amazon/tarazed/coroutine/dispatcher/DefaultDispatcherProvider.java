package com.amazon.tarazed.coroutine.dispatcher;

import com.amazon.tarazed.coroutine.dispatcher.DispatcherProvider;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/amazon/tarazed/coroutine/dispatcher/DefaultDispatcherProvider;", "Lcom/amazon/tarazed/coroutine/dispatcher/DispatcherProvider;", "()V", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DefaultDispatcherProvider implements DispatcherProvider {
    @Override // com.amazon.tarazed.coroutine.dispatcher.DispatcherProvider
    @NotNull
    /* renamed from: default, reason: not valid java name */
    public CoroutineDispatcher mo23080default() {
        return DispatcherProvider.DefaultImpls.m23081default(this);
    }

    @Override // com.amazon.tarazed.coroutine.dispatcher.DispatcherProvider
    @NotNull
    public CoroutineDispatcher io() {
        return DispatcherProvider.DefaultImpls.io(this);
    }

    @Override // com.amazon.tarazed.coroutine.dispatcher.DispatcherProvider
    @NotNull
    public CoroutineDispatcher main() {
        return DispatcherProvider.DefaultImpls.main(this);
    }

    @Override // com.amazon.tarazed.coroutine.dispatcher.DispatcherProvider
    @NotNull
    public CoroutineDispatcher unconfined() {
        return DispatcherProvider.DefaultImpls.unconfined(this);
    }
}

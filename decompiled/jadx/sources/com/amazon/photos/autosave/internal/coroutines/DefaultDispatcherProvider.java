package com.amazon.photos.autosave.internal.coroutines;

import com.amazon.photos.autosave.internal.coroutines.DispatcherProvider;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/amazon/photos/autosave/internal/coroutines/DefaultDispatcherProvider;", "Lcom/amazon/photos/autosave/internal/coroutines/DispatcherProvider;", "()V", "AndroidPhotosAutosave_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultDispatcherProvider implements DispatcherProvider {
    @Override // com.amazon.photos.autosave.internal.coroutines.DispatcherProvider
    @NotNull
    public CoroutineDispatcher getDefault() {
        return DispatcherProvider.DefaultImpls.getDefault(this);
    }

    @Override // com.amazon.photos.autosave.internal.coroutines.DispatcherProvider
    @NotNull
    public CoroutineDispatcher getIo() {
        return DispatcherProvider.DefaultImpls.getIo(this);
    }

    @Override // com.amazon.photos.autosave.internal.coroutines.DispatcherProvider
    @NotNull
    public CoroutineDispatcher getMain() {
        return DispatcherProvider.DefaultImpls.getMain(this);
    }

    @Override // com.amazon.photos.autosave.internal.coroutines.DispatcherProvider
    @NotNull
    public CoroutineDispatcher getUnconfined() {
        return DispatcherProvider.DefaultImpls.getUnconfined(this);
    }
}

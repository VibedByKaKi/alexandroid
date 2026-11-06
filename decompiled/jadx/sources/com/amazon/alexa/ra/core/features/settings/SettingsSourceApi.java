package com.amazon.alexa.ra.core.features.settings;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0096@¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u000bH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/features/settings/SettingsSourceApi;", "", "isInSplitScreen", "Lkotlinx/coroutines/flow/StateFlow;", "", "()Lkotlinx/coroutines/flow/StateFlow;", "provideRetailCookies", "", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start", "", "stop", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface SettingsSourceApi {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        @Nullable
        public static Object provideRetailCookies(@NotNull SettingsSourceApi settingsSourceApi, @NotNull Continuation<? super List<String>> continuation) {
            return SettingsSourceApi.super.provideRetailCookies(continuation);
        }
    }

    static /* synthetic */ Object provideRetailCookies$suspendImpl(SettingsSourceApi settingsSourceApi, Continuation<? super List<String>> continuation) {
        return CollectionsKt.emptyList();
    }

    @NotNull
    StateFlow<Boolean> isInSplitScreen();

    @Nullable
    default Object provideRetailCookies(@NotNull Continuation<? super List<String>> continuation) {
        return provideRetailCookies$suspendImpl(this, continuation);
    }

    void start();

    void stop();
}

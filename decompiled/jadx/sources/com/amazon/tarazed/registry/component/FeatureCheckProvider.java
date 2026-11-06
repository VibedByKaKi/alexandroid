package com.amazon.tarazed.registry.component;

import androidx.annotation.NonNull;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/tarazed/registry/component/FeatureCheckProvider;", "Lcom/amazon/tarazed/registry/component/TarazedComponent;", "isFeatureEnabled", "", "featureId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface FeatureCheckProvider extends TarazedComponent {
    @Nullable
    Object isFeatureEnabled(@NonNull @NotNull String str, @NotNull Continuation<? super Boolean> continuation);
}

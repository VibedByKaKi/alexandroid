package io.ktor.client.engine;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0002\u001a\u00020\u00032\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007H\u0016¨\u0006\b"}, d2 = {"io/ktor/client/engine/HttpClientEngineKt$config$1", "Lio/ktor/client/engine/HttpClientEngineFactory;", "create", "Lio/ktor/client/engine/HttpClientEngine;", "block", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "ktor-client-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class HttpClientEngineKt$config$1<T> implements HttpClientEngineFactory<T> {
    final /* synthetic */ Function1 $nested;
    final /* synthetic */ HttpClientEngineFactory $parent;

    public HttpClientEngineKt$config$1(HttpClientEngineFactory httpClientEngineFactory, Function1 function1) {
        this.$parent = httpClientEngineFactory;
        this.$nested = function1;
    }

    @Override // io.ktor.client.engine.HttpClientEngineFactory
    @NotNull
    public HttpClientEngine create(@NotNull final Function1<? super T, Unit> block) {
        block.getClass();
        return this.$parent.create(new Function1<T, Unit>() { // from class: io.ktor.client.engine.HttpClientEngineKt$config$1$create$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)V */
            public final void invoke(@NotNull HttpClientEngineConfig httpClientEngineConfig) {
                httpClientEngineConfig.getClass();
                HttpClientEngineKt$config$1.this.$nested.invoke(httpClientEngineConfig);
                block.invoke(httpClientEngineConfig);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((HttpClientEngineConfig) obj);
                return Unit.INSTANCE;
            }
        });
    }
}

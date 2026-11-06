package io.ktor.client.utils;

import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.util.KtorExperimentalAPI;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0000\u001a\u00020\u00012\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0007¨\u0006\u0007"}, d2 = {"buildHeaders", "Lio/ktor/http/Headers;", "block", "Lkotlin/Function1;", "Lio/ktor/http/HeadersBuilder;", "", "Lkotlin/ExtensionFunctionType;", "ktor-client-core"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class HeadersKt {
    @KtorExperimentalAPI
    @NotNull
    public static final Headers buildHeaders(@NotNull Function1<? super HeadersBuilder, Unit> function1) {
        function1.getClass();
        HeadersBuilder headersBuilder = new HeadersBuilder(0, 1, null);
        function1.invoke(headersBuilder);
        return headersBuilder.build();
    }

    @KtorExperimentalAPI
    @NotNull
    public static /* synthetic */ Headers buildHeaders$default(Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<HeadersBuilder, Unit>() { // from class: io.ktor.client.utils.HeadersKt$buildHeaders$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HeadersBuilder headersBuilder) {
                    invoke2(headersBuilder);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull HeadersBuilder headersBuilder) {
                    headersBuilder.getClass();
                }
            };
        }
        return buildHeaders(function1);
    }
}

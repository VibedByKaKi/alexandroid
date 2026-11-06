package io.ktor.client.engine;

import androidx.exifinterface.media.ExifInterface;
import io.ktor.client.engine.HttpClientEngineConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003J#\u0010\u0004\u001a\u00020\u00052\u0019\b\u0002\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH&¨\u0006\n"}, d2 = {"Lio/ktor/client/engine/HttpClientEngineFactory;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/ktor/client/engine/HttpClientEngineConfig;", "", "create", "Lio/ktor/client/engine/HttpClientEngine;", "block", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "ktor-client-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public interface HttpClientEngineFactory<T extends HttpClientEngineConfig> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static /* synthetic */ HttpClientEngine create$default(HttpClientEngineFactory httpClientEngineFactory, Function1 function1, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: create");
                return null;
            }
            if ((i & 1) != 0) {
                function1 = new Function1<T, Unit>() { // from class: io.ktor.client.engine.HttpClientEngineFactory$create$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                        invoke((HttpClientEngineConfig) obj2);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Incorrect types in method signature: (TT;)V */
                    public final void invoke(@NotNull HttpClientEngineConfig httpClientEngineConfig) {
                        httpClientEngineConfig.getClass();
                    }
                };
            }
            return httpClientEngineFactory.create(function1);
        }
    }

    @NotNull
    HttpClientEngine create(@NotNull Function1<? super T, Unit> block);
}

package io.ktor.client.engine;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a9\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"config", "Lio/ktor/client/engine/HttpClientEngineFactory;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/ktor/client/engine/HttpClientEngineConfig;", "nested", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "ktor-client-core"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class HttpClientEngineKt {
    @NotNull
    public static final <T extends HttpClientEngineConfig> HttpClientEngineFactory<T> config(@NotNull HttpClientEngineFactory<? extends T> httpClientEngineFactory, @NotNull Function1<? super T, Unit> function1) {
        httpClientEngineFactory.getClass();
        function1.getClass();
        return new HttpClientEngineKt$config$1(httpClientEngineFactory, function1);
    }
}

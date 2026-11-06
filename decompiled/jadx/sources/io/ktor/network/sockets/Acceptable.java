package io.ktor.network.sockets;

import androidx.exifinterface.media.ExifInterface;
import com.mapbox.common.HttpHeaders;
import io.ktor.network.sockets.ASocket;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0002J\u0011\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"Lio/ktor/network/sockets/Acceptable;", ExifInterface.LATITUDE_SOUTH, "Lio/ktor/network/sockets/ASocket;", HttpHeaders.ACCEPT, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-network"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public interface Acceptable<S extends ASocket> extends ASocket {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    public static final class DefaultImpls {
        public static <S extends ASocket> void dispose(Acceptable<? extends S> acceptable) {
            ASocket.DefaultImpls.dispose(acceptable);
        }
    }

    @Nullable
    Object accept(@NotNull Continuation<? super S> continuation);
}

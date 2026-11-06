package kotlinx.coroutines.io;

import com.amazon.alexa.assistant.transport.MissingTokenPull;
import kotlin.Metadata;
import kotlinx.io.core.ExperimentalIoApi;
import kotlinx.io.core.IoBuffer;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ExperimentalIoApi
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H&J\u0014\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/io/ReadSession;", "", "availableForRead", "", "getAvailableForRead", "()I", ClientCookie.DISCARD_ATTR, "n", MissingTokenPull.TRIGGER_REQUEST, "Lkotlinx/io/core/IoBuffer;", "atLeast", "kotlinx-coroutines-io"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes10.dex */
public interface ReadSession {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    public static final class DefaultImpls {
        @Nullable
        public static /* synthetic */ IoBuffer request$default(ReadSession readSession, int i, int i2, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: request");
                return null;
            }
            if ((i2 & 1) != 0) {
                i = 1;
            }
            return readSession.request(i);
        }
    }

    int discard(int n);

    int getAvailableForRead();

    @Nullable
    IoBuffer request(int atLeast);
}

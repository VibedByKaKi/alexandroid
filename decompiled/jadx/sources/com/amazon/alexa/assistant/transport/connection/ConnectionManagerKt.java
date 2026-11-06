package com.amazon.alexa.assistant.transport.connection;

import com.amazon.alexa.assistant.transport.model.ReconnectCancelledException;
import com.amazon.alexa.assistant.transport.multipart.util.MalformedStreamException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.StreamResetException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\u0006\u001a\u00020\u0005*\u00060\u0001j\u0002`\u0002H\u0002¨\u0006\u0007"}, d2 = {"tagIfCancelledByReconnect", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "cancelledByReconnect", "", "isCancelledCallFailure", "transport_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ConnectionManagerKt {
    private static final boolean isCancelledCallFailure(Exception exc) {
        return Intrinsics.areEqual(exc.getClass(), IOException.class) || (exc instanceof StreamResetException) || (exc instanceof MalformedStreamException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Exception tagIfCancelledByReconnect(Exception exc, boolean z) {
        return (z && isCancelledCallFailure(exc)) ? new ReconnectCancelledException(exc) : exc;
    }
}

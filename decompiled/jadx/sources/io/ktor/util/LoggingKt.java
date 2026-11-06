package io.ktor.util;

import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"error", "", "Lorg/slf4j/Logger;", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "", "ktor-utils"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class LoggingKt {
    public static final void error(@NotNull Logger logger, @NotNull Throwable th) {
        logger.getClass();
        th.getClass();
        String message = th.getMessage();
        if (message == null) {
            message = "Exception of type " + th.getClass();
        }
        logger.error(message, th);
    }
}

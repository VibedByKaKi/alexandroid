package com.amazon.alexa.redesign.client;

import java.net.SocketTimeoutException;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toCardStudioTransportOutcome", "Lcom/amazon/alexa/redesign/client/CardStudioTransportOutcome;", "", "AlexaMobileAndroidHomeChannel_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class CardStudioServiceDelegateKt {
    @NotNull
    public static final CardStudioTransportOutcome toCardStudioTransportOutcome(@NotNull Throwable th) {
        th.getClass();
        while (th != null) {
            if ((th instanceof TimeoutException) || (th instanceof SocketTimeoutException)) {
                return CardStudioTransportOutcome.TIMEOUT;
            }
            th = th.getCause();
        }
        return CardStudioTransportOutcome.ERROR;
    }
}

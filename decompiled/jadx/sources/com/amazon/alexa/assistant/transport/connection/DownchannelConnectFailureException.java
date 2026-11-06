package com.amazon.alexa.assistant.transport.connection;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.SendEventResultBundleKeys;
import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/assistant/transport/connection/DownchannelConnectFailureException;", "Ljava/io/IOException;", SendEventResultBundleKeys.FAILURE, "Lcom/amazon/alexa/assistant/transport/connection/DownchannelConnectFailure;", "cause", "", "<init>", "(Lcom/amazon/alexa/assistant/transport/connection/DownchannelConnectFailure;Ljava/lang/Throwable;)V", "getFailure", "()Lcom/amazon/alexa/assistant/transport/connection/DownchannelConnectFailure;", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DownchannelConnectFailureException extends IOException {

    @NotNull
    private final DownchannelConnectFailure failure;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownchannelConnectFailureException(@NotNull DownchannelConnectFailure downchannelConnectFailure, @NotNull Throwable th) {
        super(th.getMessage(), th);
        downchannelConnectFailure.getClass();
        th.getClass();
        this.failure = downchannelConnectFailure;
    }

    @NotNull
    public final DownchannelConnectFailure getFailure() {
        return this.failure;
    }
}

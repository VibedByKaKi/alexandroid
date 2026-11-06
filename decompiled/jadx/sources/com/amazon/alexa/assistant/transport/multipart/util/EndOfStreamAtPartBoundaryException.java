package com.amazon.alexa.assistant.transport.multipart.util;

import java.io.IOException;
import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/amazon/alexa/assistant/transport/multipart/util/EndOfStreamAtPartBoundaryException;", "Ljava/io/IOException;", "<init>", "()V", "Companion", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class EndOfStreamAtPartBoundaryException extends IOException {
    private static final long serialVersionUID = -2593719411876392650L;

    public EndOfStreamAtPartBoundaryException() {
        super("Stream ended at a part boundary");
    }
}

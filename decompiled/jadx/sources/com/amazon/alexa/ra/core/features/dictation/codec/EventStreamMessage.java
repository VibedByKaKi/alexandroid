package com.amazon.alexa.ra.core.features.dictation.codec;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB#\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/amazon/alexa/ra/core/features/dictation/codec/EventStreamMessage;", "", "headers", "", "", "payload", "", "<init>", "(Ljava/util/Map;[B)V", "getHeaders", "()Ljava/util/Map;", "getPayload", "()[B", "messageType", "getMessageType", "()Ljava/lang/String;", "eventType", "getEventType", "contentType", "getContentType", "exceptionType", "getExceptionType", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class EventStreamMessage {

    @NotNull
    public static final String CONTENT_TYPE = ":content-type";

    @NotNull
    public static final String EVENT_TYPE = ":event-type";

    @NotNull
    public static final String EXCEPTION_TYPE = ":exception-type";

    @NotNull
    public static final String MESSAGE_TYPE = ":message-type";

    @NotNull
    private final Map<String, String> headers;

    @NotNull
    private final byte[] payload;
    public static final int $stable = 8;

    public EventStreamMessage(@NotNull Map<String, String> map, @NotNull byte[] bArr) {
        map.getClass();
        bArr.getClass();
        this.headers = map;
        this.payload = bArr;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventStreamMessage)) {
            return false;
        }
        EventStreamMessage eventStreamMessage = (EventStreamMessage) other;
        return Intrinsics.areEqual(this.headers, eventStreamMessage.headers) && Arrays.equals(this.payload, eventStreamMessage.payload);
    }

    @Nullable
    public final String getContentType() {
        return this.headers.get(CONTENT_TYPE);
    }

    @Nullable
    public final String getEventType() {
        return this.headers.get(EVENT_TYPE);
    }

    @Nullable
    public final String getExceptionType() {
        return this.headers.get(EXCEPTION_TYPE);
    }

    @NotNull
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @Nullable
    public final String getMessageType() {
        return this.headers.get(MESSAGE_TYPE);
    }

    @NotNull
    public final byte[] getPayload() {
        return this.payload;
    }

    public int hashCode() {
        return Arrays.hashCode(this.payload) + (this.headers.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "EventStreamMessage(headers=" + this.headers + ", payload=" + this.payload.length + " bytes)";
    }
}

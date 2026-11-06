package com.amazon.dee.app.services.metrics.kinesis.client;

import com.amazon.dee.app.services.metrics.kinesis.event.KinesisEvent;
import com.amazon.dee.app.services.metrics.kinesis.event.KinesisInternalEvent;
import io.ktor.client.utils.CacheControl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J1\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH&¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/amazon/dee/app/services/metrics/kinesis/client/KinesisInternalEventClient;", "Lcom/amazon/dee/app/services/metrics/kinesis/client/KinesisEventClient;", "directedId", "", "getDirectedId", "()Ljava/lang/String;", "setDirectedId", "(Ljava/lang/String;)V", "createInternalEvent", "Lcom/amazon/dee/app/services/metrics/kinesis/event/KinesisInternalEvent;", "eventType", "sessionStart", "", "sessionEnd", "duration", "(Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;)Lcom/amazon/dee/app/services/metrics/kinesis/event/KinesisInternalEvent;", "createEvent", "Lcom/amazon/dee/app/services/metrics/kinesis/event/KinesisEvent;", "applyGlobalAttributes", "", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface KinesisInternalEventClient extends KinesisEventClient {
    @NotNull
    KinesisEvent createEvent(@NotNull String eventType, boolean applyGlobalAttributes);

    @NotNull
    KinesisInternalEvent createInternalEvent(@NotNull String eventType, long sessionStart, @Nullable Long sessionEnd, @Nullable Long duration);

    @Nullable
    String getDirectedId();

    void setDirectedId(@Nullable String str);
}

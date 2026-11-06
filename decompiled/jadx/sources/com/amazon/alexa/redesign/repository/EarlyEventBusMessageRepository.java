package com.amazon.alexa.redesign.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.clouddrive.extended.model.BulkOperationType;
import com.dee.app.metrics.MetricsConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bJ\u0006\u0010\f\u001a\u00020\bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/redesign/repository/EarlyEventBusMessageRepository;", "", "<init>", "()V", "messages", "", "Lcom/amazon/alexa/eventbus/api/Message;", BulkOperationType.add, "", "message", "getMessages", "", MetricsConstants.Method.CACHE_CLEAR, "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class EarlyEventBusMessageRepository {
    public static final int $stable = 8;

    @NotNull
    private final List<Message> messages = new ArrayList();

    public final void add(@NotNull Message message) {
        message.getClass();
        this.messages.add(message);
    }

    public final void clear() {
        this.messages.clear();
    }

    @NotNull
    public final List<Message> getMessages() {
        return this.messages;
    }
}

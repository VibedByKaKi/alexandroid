package com.amazon.alexa.voice.tta.metrics;

import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.tta.metrics.TtaEvent;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public abstract class TypedEventProcessor<E extends TtaEvent> implements MetricEventProcessor {
    private final Class<E> eventClass;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Listener<E extends TtaEvent> {
        boolean onEvent(@NonNull E e, @NonNull EventTime eventTime);
    }

    public TypedEventProcessor(Class<E> cls) {
        this.eventClass = cls;
    }

    public static <E extends TtaEvent> TypedEventProcessor<E> create(Class<E> cls, final Listener<E> listener) {
        return (TypedEventProcessor<E>) new TypedEventProcessor<E>(cls) { // from class: com.amazon.alexa.voice.tta.metrics.TypedEventProcessor.1
            @Override // com.amazon.alexa.voice.tta.metrics.TypedEventProcessor
            public boolean processTypedEvent(@NonNull E e, @NonNull EventTime eventTime) {
                return listener.onEvent(e, eventTime);
            }
        };
    }

    @Override // com.amazon.alexa.voice.tta.metrics.MetricEventProcessor
    public boolean processEvent(@NonNull TtaEvent ttaEvent, @NonNull EventTime eventTime) {
        if (!this.eventClass.isInstance(ttaEvent)) {
            return false;
        }
        E cast = this.eventClass.cast(ttaEvent);
        Objects.requireNonNull(cast);
        return processTypedEvent(cast, eventTime);
    }

    public abstract boolean processTypedEvent(@NonNull E e, @NonNull EventTime eventTime);
}

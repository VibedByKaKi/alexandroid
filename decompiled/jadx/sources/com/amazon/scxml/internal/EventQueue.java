package com.amazon.scxml.internal;

import java.util.LinkedList;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ\b\u0010\f\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/scxml/internal/EventQueue;", "", "<init>", "()V", "dispatchQueue", "Lcom/amazon/scxml/internal/DispatchQueue;", "internalEventQueue", "Ljava/util/Queue;", "Lcom/amazon/scxml/internal/Event;", "push", "", "event", "pop", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class EventQueue {

    @NotNull
    private final DispatchQueue dispatchQueue = new DispatchQueue();

    @NotNull
    private Queue<Event> internalEventQueue = new LinkedList();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object] */
    public static final Unit pop$lambda$1(Ref.ObjectRef objectRef, EventQueue eventQueue) {
        objectRef.element = eventQueue.internalEventQueue.remove();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit push$lambda$0(EventQueue eventQueue, Event event) {
        eventQueue.internalEventQueue.add(event);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Event pop() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        this.dispatchQueue.sync(new EventQueue$$ExternalSyntheticLambda0(objectRef, this, 0));
        return (Event) objectRef.element;
    }

    public final void push(@NotNull Event event) {
        event.getClass();
        this.dispatchQueue.async(new EventQueue$$ExternalSyntheticLambda0(21, this, false, event));
    }
}

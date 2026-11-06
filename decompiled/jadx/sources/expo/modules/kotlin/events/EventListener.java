package expo.modules.kotlin.events;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lexpo/modules/kotlin/events/EventListener;", "", "eventName", "Lexpo/modules/kotlin/events/EventName;", "<init>", "(Lexpo/modules/kotlin/events/EventName;)V", "getEventName", "()Lexpo/modules/kotlin/events/EventName;", "Lexpo/modules/kotlin/events/BasicEventListener;", "Lexpo/modules/kotlin/events/EventListenerWithPayload;", "Lexpo/modules/kotlin/events/EventListenerWithSenderAndPayload;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class EventListener {

    @NotNull
    private final EventName eventName;

    private EventListener(EventName eventName) {
        this.eventName = eventName;
    }

    @NotNull
    public final EventName getEventName() {
        return this.eventName;
    }

    public /* synthetic */ EventListener(EventName eventName, DefaultConstructorMarker defaultConstructorMarker) {
        this(eventName);
    }
}

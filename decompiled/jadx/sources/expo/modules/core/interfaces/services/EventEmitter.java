package expo.modules.core.interfaces.services;

import android.os.Bundle;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface EventEmitter {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class BaseEvent implements Event {
        @Override // expo.modules.core.interfaces.services.EventEmitter.Event
        public boolean canCoalesce() {
            return true;
        }

        @Override // expo.modules.core.interfaces.services.EventEmitter.Event
        public short getCoalescingKey() {
            return (short) 0;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Event {
        boolean canCoalesce();

        short getCoalescingKey();

        Bundle getEventBody();

        String getEventName();
    }

    void emit(int i, Event event);

    void emit(int i, String str, Bundle bundle);

    void emit(String str, Bundle bundle);
}

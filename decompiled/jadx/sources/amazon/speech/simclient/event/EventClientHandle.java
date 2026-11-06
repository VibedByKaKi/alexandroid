package amazon.speech.simclient.event;

import amazon.speech.simclient.common.SimClientServiceHandle;
import android.content.Context;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class EventClientHandle extends SimClientServiceHandle<EventClient> {
    public EventClientHandle() {
        super(EventClient.class);
    }

    @Override // amazon.speech.simclient.common.SimClientServiceHandle
    public EventClient createClient(Context context) {
        return new EventClient(context);
    }

    @Override // amazon.speech.simclient.common.SimClientServiceHandle
    public boolean serviceExists(Context context) {
        return EventClient.isEventServiceAvailable(context);
    }
}

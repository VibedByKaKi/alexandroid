package amazon.speech.simclient.focus;

import amazon.speech.simclient.common.SimClientServiceHandle;
import android.content.Context;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class ExplicitFocusClientHandle extends SimClientServiceHandle<ExplicitFocusClient> {
    public ExplicitFocusClientHandle() {
        super(ExplicitFocusClient.class);
    }

    @Override // amazon.speech.simclient.common.SimClientServiceHandle
    public ExplicitFocusClient createClient(Context context) {
        return new ExplicitFocusClient(context);
    }

    @Override // amazon.speech.simclient.common.SimClientServiceHandle
    public boolean serviceExists(Context context) {
        return ExplicitFocusClient.isFocusServiceAvailable(context);
    }
}

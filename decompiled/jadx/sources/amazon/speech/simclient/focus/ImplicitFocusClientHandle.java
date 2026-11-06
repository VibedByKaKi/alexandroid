package amazon.speech.simclient.focus;

import amazon.speech.simclient.common.SimClientServiceHandle;
import android.content.Context;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class ImplicitFocusClientHandle extends SimClientServiceHandle<ImplicitFocusClient> {
    public ImplicitFocusClientHandle() {
        super(ImplicitFocusClient.class);
    }

    @Override // amazon.speech.simclient.common.SimClientServiceHandle
    public ImplicitFocusClient createClient(Context context) {
        return new ImplicitFocusClient(context);
    }

    @Override // amazon.speech.simclient.common.SimClientServiceHandle
    public boolean serviceExists(Context context) {
        return ImplicitFocusClient.isFocusServiceAvailable(context);
    }
}

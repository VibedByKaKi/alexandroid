package amazon.speech.simclient.context;

import amazon.speech.simclient.common.SimClientServiceHandle;
import android.content.Context;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class ContextClientHandle extends SimClientServiceHandle<ContextClient> {
    public ContextClientHandle() {
        super(ContextClient.class);
    }

    @Override // amazon.speech.simclient.common.SimClientServiceHandle
    public ContextClient createClient(Context context) {
        return new ContextClient(context);
    }

    @Override // amazon.speech.simclient.common.SimClientServiceHandle
    public boolean serviceExists(Context context) {
        return ContextClient.isContextServiceAvailable(context);
    }
}

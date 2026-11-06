package amazon.speech.simclient.common;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class SyncServiceConnectionManager extends ServiceConnectionManager {
    @Override // amazon.speech.simclient.common.ServiceConnectionManager
    public void performBind(Context context, ServiceConnection serviceConnection, Intent intent, String str) {
        bindComplete(ServiceConnectionManager.bindCommon(context, serviceConnection, intent, str));
    }

    @Override // amazon.speech.simclient.common.ServiceConnectionManager
    public void performUnbind(Context context, ServiceConnection serviceConnection) {
        ServiceConnectionManager.unbindCommon(context, serviceConnection);
        unbindComplete();
    }
}

package ai.onnxruntime.telemetry;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
class PowerInfoReceiver extends BroadcastReceiver {
    private final HttpClient m_parent;

    public PowerInfoReceiver(HttpClient httpClient) {
        this.m_parent = httpClient;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        this.m_parent.onPowerChange(intExtra == 2 || intExtra == 5, intent.getBooleanExtra("battery_low", false));
    }
}

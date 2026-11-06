package net.danlew.android.joda;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import java.util.TimeZone;
import org.joda.time.DateTimeZone;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class TimeZoneChangedReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("time-zone");
        try {
            DateTimeZone.setDefault(DateTimeZone.forTimeZone(TimeZone.getDefault()));
        } catch (IllegalArgumentException e) {
            Log.e("joda-time-android", "Could not recognize timezone id \"" + stringExtra + DeviceConfigConstants.DOUBLE_QUOTE, e);
        }
    }
}

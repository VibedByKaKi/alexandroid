package com.amazon.deecomms.common.util.provider;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.common.Constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class MMSDKManager {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, MMSDKManager.class);

    private MMSDKManager() {
    }

    public static boolean isCommsOnLenovoSmartTabletEnabled(@NonNull Context context) {
        Uri.Builder builder = new Uri.Builder();
        builder.authority("amazon.speech.sim.comms").scheme("content").path("comms_enabled");
        Cursor query = context.getContentResolver().query(builder.build(), new String[]{"comms_enabled"}, null, new String[]{""}, null);
        if (query != null) {
            try {
                if (query.getCount() >= 1) {
                    query.moveToFirst();
                    int i = query.getInt(query.getColumnIndex("comms_enabled"));
                    LOG.i("Comms on Lenovo Smart Tablet enabled : " + i);
                    boolean z = i == 1;
                    query.close();
                    return z;
                }
            } catch (Throwable th) {
                if (query == null) {
                    throw th;
                }
                try {
                    query.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        LOG.i("MMSDK cursor is null");
        if (query != null) {
            query.close();
        }
        return false;
    }
}

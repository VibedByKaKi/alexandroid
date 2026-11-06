package com.amazon.alexa.smarthomecameras.rtcsc;

import android.content.Context;
import android.util.Log;
import com.amazon.rtcsc.appclient.RtcscAppClient;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class CamerasAppClient extends RtcscAppClient {
    private static final String TAG = "CamerasAppClient";

    public CamerasAppClient(Context context) {
        super(context);
    }

    @Override // com.amazon.rtcsc.appclient.RtcscAppClient
    public void onRtcscServiceConnected() {
        Log.i(TAG, "onRtcscServiceConnected received.");
    }

    @Override // com.amazon.rtcsc.appclient.RtcscAppClient
    public void onRtcscServiceDisconnected() {
        Log.i(TAG, "onRtcscServiceDisconnected received.");
    }
}

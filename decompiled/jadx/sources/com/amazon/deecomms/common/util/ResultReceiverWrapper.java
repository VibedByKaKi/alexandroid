package com.amazon.deecomms.common.util;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SuppressLint({"ParcelCreator"})
/* loaded from: classes5.dex */
public class ResultReceiverWrapper extends ResultReceiver {
    public static final int RESULT_FAILED = 1;
    public static final int RESULT_OK = 0;
    private Receiver mReceiver;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Receiver {
        void onReceiveResult(int i, Bundle bundle);
    }

    public ResultReceiverWrapper(Handler handler) {
        super(handler);
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i, Bundle bundle) {
        Receiver receiver = this.mReceiver;
        if (receiver != null) {
            receiver.onReceiveResult(i, bundle);
        }
    }

    public void setReceiver(Receiver receiver) {
        this.mReceiver = receiver;
    }
}

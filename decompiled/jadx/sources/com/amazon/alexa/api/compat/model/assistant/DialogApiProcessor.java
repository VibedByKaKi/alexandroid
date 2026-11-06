package com.amazon.alexa.api.compat.model.assistant;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import androidx.media3.common.util.ListenerSet$$ExternalSyntheticLambda0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public abstract class DialogApiProcessor {
    private static final String TAG = "DialogApiProcessor";
    private final Messenger messenger;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.compat.model.assistant.DialogApiProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$compat$model$assistant$DialogApiMessageType;

        static {
            int[] iArr = new int[DialogApiMessageType.values().length];
            $SwitchMap$com$amazon$alexa$api$compat$model$assistant$DialogApiMessageType = iArr;
            try {
                iArr[DialogApiMessageType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$DialogApiMessageType[DialogApiMessageType.START_WITH_EXTRAS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$DialogApiMessageType[DialogApiMessageType.STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$DialogApiMessageType[DialogApiMessageType.CANCEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public DialogApiProcessor(Looper looper) {
        this.messenger = new Messenger(new Handler(looper, new ListenerSet$$ExternalSyntheticLambda0(this, 16)));
    }

    public Messenger getMessenger() {
        return this.messenger;
    }

    public boolean handleMessage(Message message) {
        DialogApiMessageType fromOrdinal = DialogApiMessageType.fromOrdinal(message.what);
        if (fromOrdinal == null) {
            ParcelCompat$$ExternalSyntheticOutline0.m7656m(TAG, message.what, new StringBuilder("Unknown message type: "));
            return false;
        }
        Bundle data = message.getData();
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$api$compat$model$assistant$DialogApiMessageType[fromOrdinal.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    onStop();
                } else {
                    if (i != 4) {
                        Log.w(TAG, "Unhandled message type in dispatch: " + fromOrdinal);
                        return false;
                    }
                    onCancel();
                }
            } else {
                if (data == null) {
                    Log.w(TAG, "DialogApi message has no data for startWithExtras");
                    return false;
                }
                onStartWithExtras(data.getBundle(DialogApiArgumentType.DIALOG_EXTRAS.name()));
            }
        } else {
            if (data == null) {
                Log.w(TAG, "DialogApi message has no data for start");
                return false;
            }
            onStart(data.getString(DialogApiArgumentType.INVOCATION_TYPE.name()), data.getString(DialogApiArgumentType.LAUNCH_TYPE.name()), data.getBundle(DialogApiArgumentType.UI_OPTIONS.name()));
        }
        return true;
    }

    public abstract void onCancel();

    public abstract void onStart(String str, String str2, Bundle bundle);

    public abstract void onStartWithExtras(Bundle bundle);

    public abstract void onStop();
}

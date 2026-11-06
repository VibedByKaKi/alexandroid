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
public abstract class LocaleListenerProcessor {
    private static final String TAG = "LocaleListenerProcessor";
    private final Messenger messenger;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.compat.model.assistant.LocaleListenerProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$compat$model$assistant$LocaleListenerMessageType;

        static {
            int[] iArr = new int[LocaleListenerMessageType.values().length];
            $SwitchMap$com$amazon$alexa$api$compat$model$assistant$LocaleListenerMessageType = iArr;
            try {
                iArr[LocaleListenerMessageType.ON_LOCALES_CHANGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$LocaleListenerMessageType[LocaleListenerMessageType.ON_SUPPORTED_LOCALES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$LocaleListenerMessageType[LocaleListenerMessageType.ON_SUPPORTED_LOCALES_COMBINATIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public LocaleListenerProcessor(Looper looper) {
        this.messenger = new Messenger(new Handler(looper, new ListenerSet$$ExternalSyntheticLambda0(this, 22)));
    }

    public Messenger getMessenger() {
        return this.messenger;
    }

    public boolean handleMessage(Message message) {
        LocaleListenerMessageType fromOrdinal = LocaleListenerMessageType.fromOrdinal(message.what);
        if (fromOrdinal == null) {
            ParcelCompat$$ExternalSyntheticOutline0.m7656m(TAG, message.what, new StringBuilder("Unknown message type: "));
            return false;
        }
        Bundle data = message.getData();
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$api$compat$model$assistant$LocaleListenerMessageType[fromOrdinal.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    Log.w(TAG, "Unhandled message type in dispatch: " + fromOrdinal);
                    return false;
                }
                if (data == null) {
                    Log.w(TAG, "LocaleListener message has no data for onSupportedLocalesCombinations");
                    return false;
                }
                onSupportedLocalesCombinations(data.getBundle(LocaleListenerArgumentType.COMBINATIONS_BUNDLE.name()));
            } else {
                if (data == null) {
                    Log.w(TAG, "LocaleListener message has no data for onSupportedLocales");
                    return false;
                }
                onSupportedLocales(data.getBundle(LocaleListenerArgumentType.SUPPORTED_LOCALES_BUNDLE.name()));
            }
        } else {
            if (data == null) {
                Log.w(TAG, "LocaleListener message has no data for onLocalesChanged");
                return false;
            }
            onLocalesChanged(data.getBundle(LocaleListenerArgumentType.LOCALES_BUNDLE.name()));
        }
        return true;
    }

    public abstract void onLocalesChanged(Bundle bundle);

    public abstract void onSupportedLocales(Bundle bundle);

    public abstract void onSupportedLocalesCombinations(Bundle bundle);
}

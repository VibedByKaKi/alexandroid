package com.amazon.alexa.api;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.amazon.alexa.api.LocalesListenerArgumentType;
import com.amazon.alexa.api.messages.MessageProcessor;
import com.amazon.alexa.client.annotations.Nullable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class LocalesListenerProcessor extends MessageProcessor<LocalesListenerMessageType> {
    private final AlexaLocalesListener alexaLocalesListener;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.LocalesListenerProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$LocalesListenerMessageType;

        static {
            int[] iArr = new int[LocalesListenerMessageType.values().length];
            $SwitchMap$com$amazon$alexa$api$LocalesListenerMessageType = iArr;
            try {
                iArr[LocalesListenerMessageType.ON_LOCALES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public LocalesListenerProcessor(AlexaLocalesListener alexaLocalesListener) {
        this.alexaLocalesListener = alexaLocalesListener;
    }

    public static LocalesListenerProcessor create(AlexaLocalesListener alexaLocalesListener) {
        return new LocalesListenerProcessor(alexaLocalesListener);
    }

    private void processOnLocale(Bundle bundle) {
        List<String> stringList = Bundles.getStringList(bundle, LocalesListenerArgumentType.OnLocaleArgumentType.LOCALES);
        ArrayList arrayList = new ArrayList(stringList.size());
        for (String str : stringList) {
            if (java.util.Locale.forLanguageTag(str) != null) {
                arrayList.add(java.util.Locale.forLanguageTag(str));
            }
        }
        this.alexaLocalesListener.onLocales(arrayList);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.api.messages.MessageProcessor
    public LocalesListenerMessageType getMessageType(Message message) {
        try {
            return LocalesListenerMessageType.fromOrdinal(message.what);
        } catch (IllegalArgumentException unused) {
            return LocalesListenerMessageType.UNKNOWN;
        }
    }

    @Override // com.amazon.alexa.api.messages.MessageProcessor
    public void processMessage(LocalesListenerMessageType localesListenerMessageType, Bundle bundle, @Nullable Messenger messenger) {
        if (AnonymousClass1.$SwitchMap$com$amazon$alexa$api$LocalesListenerMessageType[localesListenerMessageType.ordinal()] == 1) {
            processOnLocale(bundle);
            return;
        }
        Log.w("LocalesListenerProcessor", "Unsupported message: " + localesListenerMessageType);
    }
}

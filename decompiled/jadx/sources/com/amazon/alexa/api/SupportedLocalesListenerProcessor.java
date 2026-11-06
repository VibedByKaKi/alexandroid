package com.amazon.alexa.api;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.amazon.alexa.api.SupportedLocalesListenerArgumentType;
import com.amazon.alexa.api.messages.MessageProcessor;
import com.amazon.alexa.client.annotations.Nullable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class SupportedLocalesListenerProcessor extends MessageProcessor<SupportedLocalesListenerMessageType> {
    private final AlexaSupportedLocalesListener alexaSupportedLocalesListener;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.SupportedLocalesListenerProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$SupportedLocalesListenerMessageType;

        static {
            int[] iArr = new int[SupportedLocalesListenerMessageType.values().length];
            $SwitchMap$com$amazon$alexa$api$SupportedLocalesListenerMessageType = iArr;
            try {
                iArr[SupportedLocalesListenerMessageType.ON_SUPPORTED_LOCALES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public SupportedLocalesListenerProcessor(AlexaSupportedLocalesListener alexaSupportedLocalesListener) {
        this.alexaSupportedLocalesListener = alexaSupportedLocalesListener;
    }

    public static SupportedLocalesListenerProcessor create(AlexaSupportedLocalesListener alexaSupportedLocalesListener) {
        return new SupportedLocalesListenerProcessor(alexaSupportedLocalesListener);
    }

    private void processOnSupportedLocales(Bundle bundle) {
        HashSet hashSet = new HashSet(getLocaleFromLanguageTags(Bundles.getStringList(bundle, SupportedLocalesListenerArgumentType.OnSupportedLocalesArgumentType.LOCALES)));
        List parcelableList = Bundles.getParcelableList(bundle, SupportedLocalesListenerArgumentType.OnSupportedLocalesArgumentType.LOCALE_COMBINATIONS, LocaleCombination.class);
        HashSet hashSet2 = new HashSet(parcelableList.size());
        Iterator it2 = parcelableList.iterator();
        while (it2.hasNext()) {
            hashSet2.add(getLocaleFromLanguageTags(((LocaleCombination) it2.next()).getLocales()));
        }
        this.alexaSupportedLocalesListener.onSupportedLocales(hashSet, hashSet2);
    }

    public List<java.util.Locale> getLocaleFromLanguageTags(List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(java.util.Locale.forLanguageTag(it2.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.api.messages.MessageProcessor
    public SupportedLocalesListenerMessageType getMessageType(Message message) {
        try {
            return SupportedLocalesListenerMessageType.fromOrdinal(message.what);
        } catch (IllegalArgumentException unused) {
            return SupportedLocalesListenerMessageType.UNKNOWN;
        }
    }

    @Override // com.amazon.alexa.api.messages.MessageProcessor
    public void processMessage(SupportedLocalesListenerMessageType supportedLocalesListenerMessageType, Bundle bundle, @Nullable Messenger messenger) {
        if (AnonymousClass1.$SwitchMap$com$amazon$alexa$api$SupportedLocalesListenerMessageType[supportedLocalesListenerMessageType.ordinal()] == 1) {
            processOnSupportedLocales(bundle);
            return;
        }
        Log.w("SupportedLocalesListenerProcessor", "Unsupported message: " + supportedLocalesListenerMessageType);
    }
}

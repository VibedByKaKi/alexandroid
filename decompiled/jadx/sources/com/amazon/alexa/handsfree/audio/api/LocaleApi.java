package com.amazon.alexa.handsfree.audio.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.api.AlexaLocalesListener;
import com.amazon.alexa.api.AlexaServicesConnection;
import com.amazon.alexa.api.compat.AlexaServicesApis;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class LocaleApi {
    private static final String TAG = "LocaleApi";
    private static volatile Locale sCurrentAlexaLocale;
    private final LocaleChangeListener mAlexaLocalesListener = new LocaleChangeListener(this, 0);

    private void registerLocaleListener(AlexaServicesConnection alexaServicesConnection) {
        Log.d(TAG, "Registering locale listener");
        AlexaServicesApis.Locale.registerLocalesListener(alexaServicesConnection, this.mAlexaLocalesListener);
    }

    @Nullable
    public Locale getCurrentAlexaLocale() {
        return sCurrentAlexaLocale;
    }

    @Nullable
    public Locale getCurrentDeviceLocale() {
        return Locale.getDefault();
    }

    public void onConnected(AlexaServicesConnection alexaServicesConnection) {
        registerLocaleListener(alexaServicesConnection);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class LocaleChangeListener implements AlexaLocalesListener {
        private LocaleChangeListener() {
        }

        @Override // com.amazon.alexa.api.AlexaLocalesListener
        public void onLocales(@NonNull List<Locale> list) {
            if (list.isEmpty()) {
                Log.i(LocaleApi.TAG, "List of locales is empty, no need to change locale");
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<Locale> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().toLanguageTag());
            }
            Log.i(LocaleApi.TAG, String.format("onLocaleChanged: list of locales received: %s", arrayList));
            LocaleApi.sCurrentAlexaLocale = Locale.forLanguageTag((String) arrayList.get(0));
        }

        public /* synthetic */ LocaleChangeListener(LocaleApi localeApi, int i) {
            this();
        }
    }
}

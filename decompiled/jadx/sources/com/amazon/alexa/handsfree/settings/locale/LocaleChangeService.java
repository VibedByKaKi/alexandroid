package com.amazon.alexa.handsfree.settings.locale;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.JobIntentService;
import androidx.core.app.SafeDequeueJobIntentService;
import com.amazon.alexa.handsfree.protocols.Initializer;
import com.amazon.alexa.handsfree.protocols.InitializerProvider;
import com.amazon.alexa.handsfree.protocols.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class LocaleChangeService extends SafeDequeueJobIntentService {
    public static final String EXTRA_LOCALE = "com.amazon.alexa.handsfree.LocaleChangeService.locale";
    private static final int JOB_ID = 300010;
    private static final String TAG = "LocaleChangeService";
    private final Initializer mInitializer;
    private LocaleChangeUpdater mLocaleChangeUpdater;

    public LocaleChangeService() {
        this.mInitializer = InitializerProvider.getInitializer();
    }

    public static void enqueueWork(@NonNull Context context, @NonNull Intent intent) {
        JobIntentService.enqueueWork(context, (Class<?>) LocaleChangeService.class, JOB_ID, intent);
    }

    @Override // androidx.core.app.SafeDequeueJobIntentService, androidx.core.app.JobIntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mInitializer.initialize(this);
        this.mLocaleChangeUpdater = new LocaleChangeUpdater(this);
    }

    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(@NonNull Intent intent) {
        String str = TAG;
        Log.d(str, "onHandleWork");
        String[] stringArrayExtra = intent.getStringArrayExtra(EXTRA_LOCALE);
        if (stringArrayExtra == null) {
            Log.e(str, "onHandleWork: the locale array is null.");
        } else {
            this.mLocaleChangeUpdater.setVoiceAppLocale(stringArrayExtra);
        }
    }

    @VisibleForTesting
    public LocaleChangeService(@NonNull Initializer initializer, @NonNull LocaleChangeUpdater localeChangeUpdater) {
        this.mInitializer = initializer;
        this.mLocaleChangeUpdater = localeChangeUpdater;
    }
}

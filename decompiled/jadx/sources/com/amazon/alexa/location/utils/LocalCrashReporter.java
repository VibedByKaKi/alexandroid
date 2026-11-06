package com.amazon.alexa.location.utils;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.alexa.crashreporting.api.CrashReporter;
import com.amazon.alexa.protocols.service.api.LazyComponent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class LocalCrashReporter implements CrashReporter {
    private static LocalCrashReporter theInstance;

    @NonNull
    private final Context context;

    @NonNull
    private final CrashReporter crashReporter;

    public LocalCrashReporter(@NonNull CrashReporter crashReporter, @NonNull Context context) {
        this.crashReporter = crashReporter;
        this.context = context;
    }

    public static LazyComponent<CrashReporter> getFactory(final LazyComponent<CrashReporter> lazyComponent, @NonNull final Context context) {
        return new LazyComponent() { // from class: com.amazon.alexa.location.utils.LocalCrashReporter$$ExternalSyntheticLambda0
            @Override // com.amazon.alexa.protocols.service.api.LazyComponent, javax.inject.Provider
            public final Object get() {
                CrashReporter lambda$getFactory$0;
                lambda$getFactory$0 = LocalCrashReporter.lambda$getFactory$0(LazyComponent.this, context);
                return lambda$getFactory$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CrashReporter lambda$getFactory$0(LazyComponent lazyComponent, Context context) {
        if (theInstance == null) {
            theInstance = new LocalCrashReporter((CrashReporter) lazyComponent.get(), context);
        }
        return theInstance;
    }

    @NonNull
    public Context getContext() {
        return this.context;
    }

    @Override // com.amazon.alexa.crashreporting.api.CrashReporter
    public void reportNonFatal(Throwable th) {
        this.crashReporter.reportNonFatal(th);
    }

    @Override // com.amazon.alexa.crashreporting.api.CrashReporter
    public void reportNonFatal(Throwable th, int i) {
        this.crashReporter.reportNonFatal(th, i);
    }
}

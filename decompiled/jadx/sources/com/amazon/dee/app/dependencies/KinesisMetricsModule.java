package com.amazon.dee.app.dependencies;

import android.content.Context;
import com.amazon.dee.app.framework.AlexaApplication;
import dagger.Module;
import dagger.Provides;
import java.util.function.Supplier;
import javax.inject.Named;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes3.dex */
public final class KinesisMetricsModule {
    public static final String IS_APP_ON_FOREGROUND = "isAppOnForeground";

    private KinesisMetricsModule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$provideIsAppOnForeground$0(Context context) {
        return Boolean.valueOf(AlexaApplication.isAppOnForeground(context));
    }

    @Provides
    @Named(IS_APP_ON_FOREGROUND)
    public static Supplier<Boolean> provideIsAppOnForeground(final Context context) {
        return new Supplier() { // from class: com.amazon.dee.app.dependencies.KinesisMetricsModule$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                Boolean lambda$provideIsAppOnForeground$0;
                lambda$provideIsAppOnForeground$0 = KinesisMetricsModule.lambda$provideIsAppOnForeground$0(context);
                return lambda$provideIsAppOnForeground$0;
            }
        };
    }
}

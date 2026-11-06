package com.amazon.alexa.apl.dagger.module;

import android.content.Context;
import com.amazon.alexa.api.AlexaMobileFrameworkApis;
import com.amazon.alexa.apl.utils.Constants;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/apl/dagger/module/ContextModule;", "", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "provideAlexaMobileFrameworkApis", "Lcom/amazon/alexa/api/AlexaMobileFrameworkApis;", "provideContext", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes16.dex */
public final class ContextModule {

    @NotNull
    private final Context mContext;

    public ContextModule(@NotNull Context context) {
        context.getClass();
        this.mContext = context;
    }

    @Provides
    @Singleton
    @NotNull
    public final AlexaMobileFrameworkApis provideAlexaMobileFrameworkApis() {
        return new AlexaMobileFrameworkApis(this.mContext, Constants.APL_COMPONENT);
    }

    @Provides
    @Singleton
    @NotNull
    /* renamed from: provideContext, reason: from getter */
    public final Context getMContext() {
        return this.mContext;
    }
}

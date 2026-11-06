package com.amazon.alexa.apl.dagger.module;

import android.content.Context;
import com.amazon.alexa.apl.extension.ExtensionProxyProvider;
import com.amazon.alexaext.DiscoveryExtensionsProvider;
import com.amazon.alexaext.ExtensionRegistrar;
import com.amazon.alexaext.IExtensionProvider;
import com.amazon.apl.extension.back.BackStack;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0007¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/apl/dagger/module/ExtensionModule;", "", "()V", "provideBackStack", "Lcom/amazon/apl/extension/back/BackStack;", "provideDiscoveryExtensionsProvider", "Lcom/amazon/alexaext/IExtensionProvider;", "mContext", "Landroid/content/Context;", "provideExtensionProxyProvider", "Lcom/amazon/alexa/apl/extension/ExtensionProxyProvider;", "provideExtensionRegistrar", "Lcom/amazon/alexaext/ExtensionRegistrar;", "mIExtensionProvider", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes16.dex */
public final class ExtensionModule {
    @Provides
    @Singleton
    @NotNull
    public final BackStack provideBackStack() {
        return new BackStack();
    }

    @Provides
    @Singleton
    @NotNull
    public final IExtensionProvider provideDiscoveryExtensionsProvider(@NotNull Context mContext) {
        mContext.getClass();
        return new DiscoveryExtensionsProvider(mContext);
    }

    @Provides
    @Singleton
    @NotNull
    public final ExtensionProxyProvider provideExtensionProxyProvider() {
        return new ExtensionProxyProvider();
    }

    @Provides
    @NotNull
    public final ExtensionRegistrar provideExtensionRegistrar(@NotNull IExtensionProvider mIExtensionProvider) {
        mIExtensionProvider.getClass();
        ExtensionRegistrar addProvider = new ExtensionRegistrar().addProvider(mIExtensionProvider);
        addProvider.getClass();
        return addProvider;
    }
}

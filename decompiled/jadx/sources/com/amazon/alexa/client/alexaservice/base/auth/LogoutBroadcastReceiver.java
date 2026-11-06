package com.amazon.alexa.client.alexaservice.base.auth;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.os.SystemClock;
import com.amazon.alexa.api.AuthConstans;
import com.amazon.alexa.auth.AccountManager;
import com.amazon.alexa.auth.AccountManagerModule;
import com.amazon.alexa.client.alexaservice.base.application.ContextModule;
import com.amazon.alexa.client.alexaservice.base.concurrent.ExecutorModule;
import com.amazon.alexa.client.alexaservice.base.device.DeviceModule;
import com.amazon.alexa.client.alexaservice.base.device.UserDependentStorage;
import com.amazon.alexa.client.alexaservice.base.device.data.DataModule;
import com.amazon.alexa.client.alexaservice.base.feature.FeatureFlagModule;
import com.amazon.alexa.client.alexaservice.base.metrics.ConversationLoadSourceStore;
import com.amazon.alexa.client.alexaservice.base.metrics.MetricsModule;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBusModule;
import com.amazon.alexa.client.alexaservice.eventing.EventBusModule;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.ExternalMediaPlayerModule;
import com.amazon.alexa.client.crashreporting.CrashReportingModule;
import com.amazon.deecomms.common.Constants;
import dagger.Component;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000  2\u00020\u0001:\u0003 !\"B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/amazon/alexa/client/alexaservice/base/auth/LogoutBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "dependencyInjector", "Lcom/amazon/alexa/client/alexaservice/base/auth/LogoutBroadcastReceiver$DependencyInjector;", "(Lcom/amazon/alexa/client/alexaservice/base/auth/LogoutBroadcastReceiver$DependencyInjector;)V", "accountManager", "Lcom/amazon/alexa/auth/AccountManager;", "getAccountManager", "()Lcom/amazon/alexa/auth/AccountManager;", "setAccountManager", "(Lcom/amazon/alexa/auth/AccountManager;)V", "conversationLoadSourceStore", "Lcom/amazon/alexa/client/alexaservice/base/metrics/ConversationLoadSourceStore;", "getConversationLoadSourceStore", "()Lcom/amazon/alexa/client/alexaservice/base/metrics/ConversationLoadSourceStore;", "setConversationLoadSourceStore", "(Lcom/amazon/alexa/client/alexaservice/base/metrics/ConversationLoadSourceStore;)V", "userDependentStorage", "Lcom/amazon/alexa/client/alexaservice/base/device/UserDependentStorage;", "getUserDependentStorage", "()Lcom/amazon/alexa/client/alexaservice/base/device/UserDependentStorage;", "setUserDependentStorage", "(Lcom/amazon/alexa/client/alexaservice/base/device/UserDependentStorage;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "signOutElapsedRealtimeMs", "", "receiptElapsedRealtimeMs", "Companion", "DependencyInjector", "Injector", "AVSAndroidClient-alexaservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LogoutBroadcastReceiver extends BroadcastReceiver {

    @NotNull
    private static final String TAG = "LogoutBroadcastReceiver";

    @Inject
    public AccountManager accountManager;

    @Inject
    public ConversationLoadSourceStore conversationLoadSourceStore;

    @NotNull
    private final DependencyInjector dependencyInjector;

    @Inject
    public UserDependentStorage userDependentStorage;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/client/alexaservice/base/auth/LogoutBroadcastReceiver$DependencyInjector;", "", "()V", "inject", "", "logoutBroadcastReceiver", "Lcom/amazon/alexa/client/alexaservice/base/auth/LogoutBroadcastReceiver;", "context", "Landroid/content/Context;", "AVSAndroidClient-alexaservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DependencyInjector {
        public final void inject(@NotNull LogoutBroadcastReceiver logoutBroadcastReceiver, @NotNull Context context) {
            logoutBroadcastReceiver.getClass();
            context.getClass();
            DaggerLogoutBroadcastReceiver_Injector.builder().contextModule(new ContextModule(context)).build().inject(logoutBroadcastReceiver);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/client/alexaservice/base/auth/LogoutBroadcastReceiver$Injector;", "", "inject", "", Constants.BUNDLE_RECEIVER_TAG, "Lcom/amazon/alexa/client/alexaservice/base/auth/LogoutBroadcastReceiver;", "AVSAndroidClient-alexaservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Component(modules = {ContextModule.class, FeatureFlagModule.class, EventBusModule.class, AlexaClientEventBusModule.class, CrashReportingModule.class, ExecutorModule.class, MetricsModule.class, DataModule.class, ExternalMediaPlayerModule.class, DeviceModule.class, AccountManagerModule.class})
    @Singleton
    public interface Injector {
        void inject(@Nullable LogoutBroadcastReceiver receiver);
    }

    public /* synthetic */ LogoutBroadcastReceiver(DependencyInjector dependencyInjector, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new DependencyInjector() : dependencyInjector);
    }

    private final long signOutElapsedRealtimeMs(Intent intent, long receiptElapsedRealtimeMs) {
        long longExtra = intent.getLongExtra(AuthConstans.EXTRA_LOGOUT_ELAPSED_REALTIME_MS, -1L);
        return longExtra < 0 ? receiptElapsedRealtimeMs : Math.min(longExtra, receiptElapsedRealtimeMs);
    }

    @NotNull
    public final AccountManager getAccountManager() {
        AccountManager accountManager = this.accountManager;
        if (accountManager != null) {
            return accountManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountManager");
        return null;
    }

    @NotNull
    public final ConversationLoadSourceStore getConversationLoadSourceStore() {
        ConversationLoadSourceStore conversationLoadSourceStore = this.conversationLoadSourceStore;
        if (conversationLoadSourceStore != null) {
            return conversationLoadSourceStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("conversationLoadSourceStore");
        return null;
    }

    @NotNull
    public final UserDependentStorage getUserDependentStorage() {
        UserDependentStorage userDependentStorage = this.userDependentStorage;
        if (userDependentStorage != null) {
            return userDependentStorage;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userDependentStorage");
        return null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        context.getClass();
        intent.getClass();
        if (Intrinsics.areEqual(AuthConstans.ACTION_LOGOUT, intent.getAction())) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.dependencyInjector.inject(this, context);
            try {
                ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra(AuthConstans.EXTRA_RESULT_RECEIVER);
                Bundle bundle = new Bundle();
                boolean deleteAllData = getUserDependentStorage().deleteAllData();
                if (resultReceiver != null) {
                    resultReceiver.send(!deleteAllData ? 1 : 0, bundle);
                }
                getAccountManager().clearCache();
                getConversationLoadSourceStore().clear(signOutElapsedRealtimeMs(intent, elapsedRealtime));
            } catch (Throwable th) {
                getConversationLoadSourceStore().clear(signOutElapsedRealtimeMs(intent, elapsedRealtime));
                throw th;
            }
        }
    }

    public final void setAccountManager(@NotNull AccountManager accountManager) {
        accountManager.getClass();
        this.accountManager = accountManager;
    }

    public final void setConversationLoadSourceStore(@NotNull ConversationLoadSourceStore conversationLoadSourceStore) {
        conversationLoadSourceStore.getClass();
        this.conversationLoadSourceStore = conversationLoadSourceStore;
    }

    public final void setUserDependentStorage(@NotNull UserDependentStorage userDependentStorage) {
        userDependentStorage.getClass();
        this.userDependentStorage = userDependentStorage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LogoutBroadcastReceiver() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public LogoutBroadcastReceiver(@NotNull DependencyInjector dependencyInjector) {
        dependencyInjector.getClass();
        this.dependencyInjector = dependencyInjector;
    }
}

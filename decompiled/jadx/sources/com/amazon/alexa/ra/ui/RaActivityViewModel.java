package com.amazon.alexa.ra.ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.amazon.alexa.ra.core.ui.navigation.RaRoute;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0014J\u0010\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u0012J\u0010\u0010\"\u001a\u00020\u001a2\b\u0010#\u001a\u0004\u0018\u00010\u0012J\u0006\u0010$\u001a\u00020\u001aJ\b\u0010%\u001a\u00020\u0014H\u0007R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/amazon/alexa/ra/ui/RaActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "intent", "Landroidx/lifecycle/MutableLiveData;", "Landroid/content/Intent;", "getIntent", "()Landroidx/lifecycle/MutableLiveData;", "lastPluggableConsumedIntent", "getLastPluggableConsumedIntent", "()Landroid/content/Intent;", "setLastPluggableConsumedIntent", "(Landroid/content/Intent;)V", "lastFragmentConsumedIntent", "lastFragmentConsumedRoute", "Lcom/amazon/alexa/ra/core/ui/navigation/RaRoute;", "supportFragmentsState", "Landroid/os/Bundle;", "hasHostedActivity", "", "consumeFragmentIntent", "consumeFragmentRoute", "route", "markActivityCreated", "changeIntent", "", "newIntent", "intentChanged", "conversationViewClosed", "localBroadcastManager", "Landroidx/localbroadcastmanager/content/LocalBroadcastManager;", "saveInstanceState", "outState", "restoreInstanceState", "savedInstanceState", "clearSavedState", "hasSavedState", "Companion", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class RaActivityViewModel extends ViewModel {

    @NotNull
    public static final String ANDROID_FRAGMENTS_KEY = "android:fragments";

    @NotNull
    public static final String ANDROID_SUPPORT_FRAGMENTS_KEY = "android:support:fragments";

    @NotNull
    public static final String BUNDLABLE_SAVED_STATE_REGISTRY_KEY = "androidx.lifecycle.BundlableSavedStateRegistry.key";
    private boolean hasHostedActivity;

    @NotNull
    private final MutableLiveData<Intent> intent = new MutableLiveData<>();

    @Nullable
    private Intent lastFragmentConsumedIntent;

    @Nullable
    private RaRoute lastFragmentConsumedRoute;

    @Nullable
    private Intent lastPluggableConsumedIntent;

    @Nullable
    private Bundle supportFragmentsState;
    public static final int $stable = 8;

    public final void changeIntent(@Nullable Intent newIntent) {
        if (newIntent == null) {
            return;
        }
        this.intent.setValue(newIntent);
    }

    public final void clearSavedState() {
        this.supportFragmentsState = null;
    }

    public final boolean consumeFragmentIntent(@NotNull Intent intent) {
        intent.getClass();
        if (intent == this.lastFragmentConsumedIntent) {
            return false;
        }
        this.lastFragmentConsumedIntent = intent;
        return true;
    }

    public final boolean consumeFragmentRoute(@NotNull RaRoute route) {
        route.getClass();
        if (route == this.lastFragmentConsumedRoute) {
            return false;
        }
        this.lastFragmentConsumedRoute = route;
        return true;
    }

    public final void conversationViewClosed(@NotNull LocalBroadcastManager localBroadcastManager) {
        localBroadcastManager.getClass();
        localBroadcastManager.sendBroadcast(new Intent("conversation::view::close"));
    }

    @NotNull
    public final MutableLiveData<Intent> getIntent() {
        return this.intent;
    }

    @Nullable
    public final Intent getLastPluggableConsumedIntent() {
        return this.lastPluggableConsumedIntent;
    }

    @VisibleForTesting
    public final boolean hasSavedState() {
        return this.supportFragmentsState != null;
    }

    @NotNull
    public final MutableLiveData<Intent> intentChanged() {
        return this.intent;
    }

    public final boolean markActivityCreated() {
        boolean z = this.hasHostedActivity;
        this.hasHostedActivity = true;
        return z;
    }

    public final void restoreInstanceState(@Nullable Bundle savedInstanceState) {
        Bundle bundle;
        Bundle bundle2 = this.supportFragmentsState;
        if (bundle2 == null || savedInstanceState == null || (bundle = savedInstanceState.getBundle(BUNDLABLE_SAVED_STATE_REGISTRY_KEY)) == null) {
            return;
        }
        bundle.putBundle(ANDROID_SUPPORT_FRAGMENTS_KEY, bundle2);
    }

    public final void saveInstanceState(@NotNull Bundle outState) {
        outState.getClass();
        outState.remove(ANDROID_SUPPORT_FRAGMENTS_KEY);
        outState.remove(ANDROID_FRAGMENTS_KEY);
        Bundle bundle = outState.getBundle(BUNDLABLE_SAVED_STATE_REGISTRY_KEY);
        if (bundle != null) {
            this.supportFragmentsState = bundle.getBundle(ANDROID_SUPPORT_FRAGMENTS_KEY);
            bundle.remove(ANDROID_SUPPORT_FRAGMENTS_KEY);
        }
    }

    public final void setLastPluggableConsumedIntent(@Nullable Intent intent) {
        this.lastPluggableConsumedIntent = intent;
    }
}

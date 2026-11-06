package com.amazon.alexa.crashreporting;

import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.crashreporting.CrashReportingComponent;
import com.amazon.alexa.crashreporting.CrashReportingService;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageHandler;
import com.amazon.alexa.eventbus.api.MultiFilterSubscriber;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.featureservice.api.PlatformFeatureServiceV2;
import com.amazon.alexa.identity.api.IdentityEvent;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.identity.api.UserIdentity;
import com.amazon.alexa.mobilytics.Mobilytics;
import java.lang.Thread;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class DefaultCrashReportingService implements CrashReportingService {
    private static final String AMAZON_DOMAIN = "@amazon.";
    private static final String FEATURES_UPDATED_EVENT = "featureServiceV2:internal:featuresUpdated";
    private static final Object INIT_LOCK = new Object();
    private static final String TAG = "DefaultCrashReportingService";
    private static final String WEBLAB_TO_EMIT_EMAIL = "ALEXA_MOBILE_PERFORMANCE_V1";
    private static volatile DefaultCrashReportingService singleton;
    private final Provider<IdentityService> checkedIdentityService;
    private final List<CrashReportingComponent> crashReportingComponents;
    private final Provider<EventBus> eventBus;
    private final Provider<FeatureServiceV2> featureServiceV2;
    private MultiFilterSubscriber featureV2Subscription;
    private final Provider<Mobilytics> mobilytics;
    MultiFilterSubscriber.FilterUuid userFilterUuid;

    @GuardedBy("INIT_LOCK")
    private boolean isStarted = false;
    private MultiFilterSubscriber userIdentitySubscription = null;
    private final Set<CrashReportingService.CrashObserver> externalObservers = new CopyOnWriteArraySet();
    private final Thread.UncaughtExceptionHandler systemExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();

    @VisibleForTesting
    public DefaultCrashReportingService(List<CrashReportingComponent> list, Provider<IdentityService> provider, Provider<EventBus> provider2, Provider<FeatureServiceV2> provider3, Provider<Mobilytics> provider4) {
        this.crashReportingComponents = ErrorUtils$$ExternalSyntheticOutline0.m(list);
        this.checkedIdentityService = provider;
        this.eventBus = provider2;
        this.featureServiceV2 = provider3;
        this.mobilytics = provider4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleCrash(Thread thread, Throwable th) {
        Iterator<CrashReportingService.CrashObserver> it2 = this.externalObservers.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().onCrash();
            } catch (Throwable unused) {
            }
        }
        for (CrashReportingComponent crashReportingComponent : this.crashReportingComponents) {
            try {
                if (crashReportingComponent.isInitialized()) {
                    crashReportingComponent.handleCrash(thread, th);
                }
            } catch (Throwable unused2) {
            }
        }
        this.systemExceptionHandler.uncaughtException(thread, th);
    }

    @NonNull
    public static DefaultCrashReportingService init(@NonNull List<CrashReportingComponent> list, @NonNull Provider<IdentityService> provider, @NonNull Provider<EventBus> provider2, @NonNull Provider<FeatureServiceV2> provider3, @NonNull Provider<Mobilytics> provider4) {
        synchronized (INIT_LOCK) {
            if (singleton != null) {
                throw new IllegalStateException("Already initialized.");
            }
            singleton = new DefaultCrashReportingService(list, provider, provider2, provider3, provider4);
        }
        return singleton;
    }

    private void initializeComponents() {
        synchronized (INIT_LOCK) {
            try {
                Iterator<CrashReportingComponent> it2 = this.crashReportingComponents.iterator();
                while (it2.hasNext()) {
                    maybeInitializeComponent(it2.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean isInitialized() {
        boolean z;
        synchronized (INIT_LOCK) {
            z = singleton != null;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$startObservingIdentityAvailability$0(Message message) {
        return IdentityEvent.IDENTITY_CHANGED.equals(message.getEventType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startObservingIdentityAvailability$1(Message message) {
        syncUserToBugsnag(this.checkedIdentityService.get().getUser(TAG));
    }

    private void maybeInitializeComponent(CrashReportingComponent crashReportingComponent) {
        synchronized (INIT_LOCK) {
            if (!crashReportingComponent.isInitialized()) {
                try {
                    crashReportingComponent.initialize();
                } catch (CrashReportingComponent.InitializationException e) {
                    Log.w(TAG, "Failed to initialize " + crashReportingComponent.getFriendlyName(), e);
                }
            }
        }
    }

    @VisibleForTesting
    public static DefaultCrashReportingService singleton() {
        DefaultCrashReportingService defaultCrashReportingService;
        synchronized (INIT_LOCK) {
            try {
                if (singleton == null) {
                    throw new IllegalStateException("Must call init() before requesting singleton.");
                }
                defaultCrashReportingService = singleton;
            } catch (Throwable th) {
                throw th;
            }
        }
        return defaultCrashReportingService;
    }

    private void startObservingIdentityAvailability() {
        if (this.checkedIdentityService.get() == null) {
            return;
        }
        if (this.userIdentitySubscription == null && this.eventBus.get() != null) {
            this.userIdentitySubscription = this.eventBus.get().getSubscriber();
        }
        MultiFilterSubscriber multiFilterSubscriber = this.userIdentitySubscription;
        if (multiFilterSubscriber != null) {
            this.userFilterUuid = multiFilterSubscriber.subscribeFilter(new DefaultCrashReportingService$$ExternalSyntheticLambda1(), new MessageHandler() { // from class: com.amazon.alexa.crashreporting.DefaultCrashReportingService$$ExternalSyntheticLambda2
                @Override // com.amazon.alexa.eventbus.api.MessageHandler
                /* renamed from: handle */
                public final void lambda$subscribe$1(Message message) {
                    DefaultCrashReportingService.this.lambda$startObservingIdentityAvailability$1(message);
                }
            });
        }
    }

    private void stopObservingFeatureAvailability() {
        MultiFilterSubscriber multiFilterSubscriber = this.userIdentitySubscription;
        if (multiFilterSubscriber != null) {
            multiFilterSubscriber.unsubscribeFilter(this.userFilterUuid);
            this.userFilterUuid = null;
        }
        if (this.featureV2Subscription == null || this.eventBus.get() == null) {
            return;
        }
        this.eventBus.get().unsubscribe(this.featureV2Subscription);
        this.featureV2Subscription = null;
    }

    private void syncFeatureV2ToBugsnag() {
        if (this.featureServiceV2.get() == null || !(this.featureServiceV2.get() instanceof PlatformFeatureServiceV2)) {
            return;
        }
        Map<String, String> allFeatures = ((PlatformFeatureServiceV2) this.featureServiceV2.get()).getAllFeatures();
        for (CrashReportingComponent crashReportingComponent : this.crashReportingComponents) {
            if (crashReportingComponent instanceof BugsnagIntegration) {
                ((BugsnagIntegration) crashReportingComponent).syncFeaturesV2(allFeatures);
            }
        }
    }

    @Override // com.amazon.alexa.crashreporting.CrashReportingService
    public void addObserver(CrashReportingService.CrashObserver crashObserver) {
        this.externalObservers.add(crashObserver);
    }

    @Override // com.amazon.alexa.crashreporting.CrashReportingService
    public void putMetadata(String str, String str2) {
        Iterator<CrashReportingComponent> it2 = this.crashReportingComponents.iterator();
        while (it2.hasNext()) {
            it2.next().putMetadata(str, str2);
        }
    }

    @Override // com.amazon.alexa.crashreporting.CrashReportingService
    public void reportNonFatal(Throwable th) {
        Iterator<CrashReportingComponent> it2 = this.crashReportingComponents.iterator();
        while (it2.hasNext()) {
            it2.next().reportNonFatal(th);
        }
    }

    @Override // com.amazon.alexa.crashreporting.CrashReportingService
    public void setAccount(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        Iterator<CrashReportingComponent> it2 = this.crashReportingComponents.iterator();
        while (it2.hasNext()) {
            it2.next().setAccount(str, str2, str3);
        }
    }

    @Override // com.amazon.alexa.component.api.ServiceLifecycle
    public void start() {
        synchronized (INIT_LOCK) {
            try {
                if (!this.isStarted) {
                    Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.amazon.alexa.crashreporting.DefaultCrashReportingService$$ExternalSyntheticLambda0
                        @Override // java.lang.Thread.UncaughtExceptionHandler
                        public final void uncaughtException(Thread thread, Throwable th) {
                            DefaultCrashReportingService.this.handleCrash(thread, th);
                        }
                    });
                    for (CrashReportingComponent crashReportingComponent : this.crashReportingComponents) {
                        if (crashReportingComponent instanceof BugsnagIntegration) {
                            maybeInitializeComponent(crashReportingComponent);
                        }
                    }
                    startObservingIdentityAvailability();
                    initializeComponents();
                    this.isStarted = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.amazon.alexa.component.api.ServiceLifecycle
    public void stop() {
        synchronized (INIT_LOCK) {
            try {
                if (this.isStarted) {
                    stopObservingFeatureAvailability();
                    Thread.setDefaultUncaughtExceptionHandler(this.systemExceptionHandler);
                    this.isStarted = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @VisibleForTesting
    public void syncUserToBugsnag(UserIdentity userIdentity) {
        String email = userIdentity == null ? "" : userIdentity.getEmail();
        boolean z = false;
        if (this.featureServiceV2.get() != null && (this.featureServiceV2.get() instanceof PlatformFeatureServiceV2)) {
            z = this.featureServiceV2.get().hasAccess(WEBLAB_TO_EMIT_EMAIL, false);
        }
        if (z && email.contains(AMAZON_DOMAIN)) {
            syncFeatureV2ToBugsnag();
            for (CrashReportingComponent crashReportingComponent : this.crashReportingComponents) {
                if (crashReportingComponent instanceof BugsnagIntegration) {
                    ((BugsnagIntegration) crashReportingComponent).syncUser(email);
                }
            }
        }
    }
}

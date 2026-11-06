package com.bugsnag.android.performance.internal;

import android.app.Application;
import androidx.annotation.RestrictTo;
import com.amazon.alexa.redesign.view.container.CardStudioSurfaceHealth;
import com.bugsnag.android.performance.AutoInstrument;
import com.bugsnag.android.performance.SpanContext;
import com.bugsnag.android.performance.internal.instrumentation.AbstractActivityLifecycleInstrumentation;
import com.bugsnag.android.performance.internal.instrumentation.ActivityLifecycleInstrumentation;
import com.bugsnag.android.performance.internal.instrumentation.ForegroundState;
import com.bugsnag.android.performance.internal.processing.ForwardingSpanProcessor;
import com.bugsnag.android.performance.internal.processing.ImmutableConfig;
import com.bugsnag.android.performance.internal.processing.Tracer;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\bH\u0000¢\u0006\u0002\b2J\u0015\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0010H\u0000¢\u0006\u0002\b6J\u0010\u00107\u001a\u0002002\u0006\u00105\u001a\u00020\u0010H\u0002J\b\u00108\u001a\u00020\u0004H\u0002J\u0006\u00109\u001a\u000200R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u00108A@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u001c@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R \u0010(\u001a\b\u0012\u0004\u0012\u00020*0)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u0006:"}, d2 = {"Lcom/bugsnag/android/performance/internal/InstrumentedAppState;", "", "()V", "activityInstrumentation", "Lcom/bugsnag/android/performance/internal/instrumentation/AbstractActivityLifecycleInstrumentation;", "getActivityInstrumentation$bugsnag_android_performance_release", "()Lcom/bugsnag/android/performance/internal/instrumentation/AbstractActivityLifecycleInstrumentation;", "<set-?>", "Landroid/app/Application;", "app", "getApp", "()Landroid/app/Application;", "autoInstrumentationCache", "Lcom/bugsnag/android/performance/internal/AutoInstrumentationCache;", "getAutoInstrumentationCache", "()Lcom/bugsnag/android/performance/internal/AutoInstrumentationCache;", "Lcom/bugsnag/android/performance/internal/processing/ImmutableConfig;", "config", "getConfig$internal", "()Lcom/bugsnag/android/performance/internal/processing/ImmutableConfig;", "defaultAttributeSource", "Lcom/bugsnag/android/performance/internal/DefaultAttributeSource;", "getDefaultAttributeSource$bugsnag_android_performance_release", "()Lcom/bugsnag/android/performance/internal/DefaultAttributeSource;", "spanFactory", "Lcom/bugsnag/android/performance/internal/SpanFactory;", "getSpanFactory", "()Lcom/bugsnag/android/performance/internal/SpanFactory;", "Lcom/bugsnag/android/performance/internal/SpanProcessor;", "spanProcessor", "getSpanProcessor", "()Lcom/bugsnag/android/performance/internal/SpanProcessor;", "spanTracker", "Lcom/bugsnag/android/performance/internal/SpanTracker;", "getSpanTracker", "()Lcom/bugsnag/android/performance/internal/SpanTracker;", "startupTracker", "Lcom/bugsnag/android/performance/internal/AppStartTracker;", "getStartupTracker$bugsnag_android_performance_release", "()Lcom/bugsnag/android/performance/internal/AppStartTracker;", "tracePropagationUrls", "", "Ljava/util/regex/Pattern;", "getTracePropagationUrls", "()Ljava/util/Collection;", "setTracePropagationUrls", "(Ljava/util/Collection;)V", CardStudioSurfaceHealth.Stage.ATTACH, "", "application", "attach$bugsnag_android_performance_release", "configure", "Lcom/bugsnag/android/performance/internal/processing/Tracer;", "configuration", "configure$bugsnag_android_performance_release", "configureLifecycleCallbacks", "createActivityInstrumentation", "onBugsnagPerformanceStart", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public final class InstrumentedAppState {

    @NotNull
    private final AbstractActivityLifecycleInstrumentation activityInstrumentation;
    private Application app;

    @NotNull
    private final AutoInstrumentationCache autoInstrumentationCache;

    @Nullable
    private ImmutableConfig config;

    @NotNull
    private final DefaultAttributeSource defaultAttributeSource;

    @NotNull
    private final SpanFactory spanFactory;

    @NotNull
    private SpanProcessor spanProcessor;

    @NotNull
    private final SpanTracker spanTracker;

    @NotNull
    private final AppStartTracker startupTracker;

    @NotNull
    private Collection<Pattern> tracePropagationUrls;

    public InstrumentedAppState() {
        DefaultAttributeSource defaultAttributeSource = new DefaultAttributeSource();
        this.defaultAttributeSource = defaultAttributeSource;
        this.spanProcessor = new ForwardingSpanProcessor();
        SpanTracker spanTracker = new SpanTracker();
        this.spanTracker = spanTracker;
        SpanFactory spanFactory = new SpanFactory(this.spanProcessor, defaultAttributeSource);
        this.spanFactory = spanFactory;
        this.startupTracker = new AppStartTracker(spanTracker, spanFactory);
        this.autoInstrumentationCache = new AutoInstrumentationCache();
        this.activityInstrumentation = createActivityInstrumentation();
        this.tracePropagationUrls = SetsKt.emptySet();
    }

    private final void configureLifecycleCallbacks(ImmutableConfig configuration) {
        AbstractActivityLifecycleInstrumentation abstractActivityLifecycleInstrumentation = this.activityInstrumentation;
        abstractActivityLifecycleInstrumentation.setOpenLoadSpans$bugsnag_android_performance_release(configuration.getAutoInstrumentActivities() != AutoInstrument.OFF);
        abstractActivityLifecycleInstrumentation.setCloseLoadSpans$bugsnag_android_performance_release(configuration.getAutoInstrumentActivities() == AutoInstrument.FULL);
    }

    private final AbstractActivityLifecycleInstrumentation createActivityInstrumentation() {
        return new ActivityLifecycleInstrumentation(this.spanTracker, this.spanFactory, this.startupTracker, this.autoInstrumentationCache);
    }

    public final void attach$bugsnag_android_performance_release(@NotNull Application application) {
        application.getClass();
        if (this.app != null) {
            return;
        }
        this.app = application;
        getApp().registerActivityLifecycleCallbacks(this.activityInstrumentation);
        this.spanFactory.attach$bugsnag_android_performance_release(application);
        ForegroundState.INSTANCE.addForegroundChangedCallback(new Function1<Boolean, Unit>() { // from class: com.bugsnag.android.performance.internal.InstrumentedAppState$attach$2
            {
                super(1);
            }

            public final void invoke(boolean z) {
                DefaultAttributeSource defaultAttributeSource = InstrumentedAppState.this.getDefaultAttributeSource();
                loop0: while (true) {
                    DefaultAttributes defaultAttributes = defaultAttributeSource.getCurrentDefaultAttributes$bugsnag_android_performance_release().get();
                    defaultAttributes.getClass();
                    DefaultAttributes copy$default = DefaultAttributes.copy$default(defaultAttributes, null, null, Boolean.valueOf(z), 3, null);
                    if (!Intrinsics.areEqual(defaultAttributes, copy$default)) {
                        AtomicReference<DefaultAttributes> currentDefaultAttributes$bugsnag_android_performance_release = defaultAttributeSource.getCurrentDefaultAttributes$bugsnag_android_performance_release();
                        while (!currentDefaultAttributes$bugsnag_android_performance_release.compareAndSet(defaultAttributes, copy$default)) {
                            if (currentDefaultAttributes$bugsnag_android_performance_release.get() != defaultAttributes) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                InstrumentedAppState.this.getStartupTracker().setInBackground$bugsnag_android_performance_release(!z);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }
        });
    }

    @NotNull
    public final Tracer configure$bugsnag_android_performance_release(@NotNull ImmutableConfig configuration) {
        ForwardingSpanProcessor forwardingSpanProcessor;
        configuration.getClass();
        this.config = configuration;
        attach$bugsnag_android_performance_release(configuration.getApplication());
        SpanProcessor spanProcessor = this.spanProcessor;
        final Tracer tracer = new Tracer(configuration.getSpanEndCallbacks());
        configureLifecycleCallbacks(configuration);
        this.spanProcessor = tracer;
        this.spanFactory.configure$bugsnag_android_performance_release(tracer, configuration, configuration.getSpanStartCallbacks(), configuration.getNetworkRequestCallback(), configuration.getEnabledMetrics());
        this.tracePropagationUrls = configuration.getTracePropagationUrls();
        if (configuration.getAutoInstrumentAppStarts()) {
            forwardingSpanProcessor = spanProcessor instanceof ForwardingSpanProcessor ? (ForwardingSpanProcessor) spanProcessor : null;
            if (forwardingSpanProcessor != null) {
                forwardingSpanProcessor.forwardTo(this.spanProcessor);
            }
            this.autoInstrumentationCache.configure(configuration.getDoNotEndAppStart(), configuration.getDoNotAutoInstrument());
        } else {
            SpanContextStack.m23839clearimpl(SpanContext.INSTANCE.m23818getContextStack07jRbR8$bugsnag_android_performance_release());
            forwardingSpanProcessor = spanProcessor instanceof ForwardingSpanProcessor ? (ForwardingSpanProcessor) spanProcessor : null;
            if (forwardingSpanProcessor != null) {
                forwardingSpanProcessor.discard();
            }
        }
        ForegroundState.INSTANCE.addForegroundChangedCallback(new Function1<Boolean, Unit>() { // from class: com.bugsnag.android.performance.internal.InstrumentedAppState$configure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                if (z) {
                    return;
                }
                Tracer.this.forceCurrentBatch();
            }
        });
        return tracer;
    }

    @NotNull
    /* renamed from: getActivityInstrumentation$bugsnag_android_performance_release, reason: from getter */
    public final AbstractActivityLifecycleInstrumentation getActivityInstrumentation() {
        return this.activityInstrumentation;
    }

    @NotNull
    public final Application getApp() {
        Application application = this.app;
        if (application != null) {
            return application;
        }
        Intrinsics.throwUninitializedPropertyAccessException("app");
        return null;
    }

    @NotNull
    public final AutoInstrumentationCache getAutoInstrumentationCache() {
        return this.autoInstrumentationCache;
    }

    @JvmName(name = "getConfig$internal")
    @Nullable
    /* renamed from: getConfig$internal, reason: from getter */
    public final ImmutableConfig getConfig() {
        return this.config;
    }

    @NotNull
    /* renamed from: getDefaultAttributeSource$bugsnag_android_performance_release, reason: from getter */
    public final DefaultAttributeSource getDefaultAttributeSource() {
        return this.defaultAttributeSource;
    }

    @NotNull
    public final SpanFactory getSpanFactory() {
        return this.spanFactory;
    }

    @NotNull
    public final SpanProcessor getSpanProcessor() {
        return this.spanProcessor;
    }

    @NotNull
    public final SpanTracker getSpanTracker() {
        return this.spanTracker;
    }

    @NotNull
    /* renamed from: getStartupTracker$bugsnag_android_performance_release, reason: from getter */
    public final AppStartTracker getStartupTracker() {
        return this.startupTracker;
    }

    @NotNull
    public final Collection<Pattern> getTracePropagationUrls() {
        return this.tracePropagationUrls;
    }

    public final void onBugsnagPerformanceStart() {
        this.startupTracker.onBugsnagPerformanceStart();
    }

    public final void setTracePropagationUrls(@NotNull Collection<Pattern> collection) {
        collection.getClass();
        this.tracePropagationUrls = collection;
    }
}

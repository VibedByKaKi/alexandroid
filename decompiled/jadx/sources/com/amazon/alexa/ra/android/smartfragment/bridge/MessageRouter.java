package com.amazon.alexa.ra.android.smartfragment.bridge;

import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.assistant.AssistantBuilder$$ExternalSyntheticLambda6;
import com.amazon.alexa.mobilytics.event.LogLevel;
import com.amazon.alexa.ra.android.smartfragment.bridge.InboundAdmission;
import com.amazon.alexa.ra.android.smartfragment.react.ViewClaim;
import com.amazon.alexa.ra.android.smartfragment.util.JsonConverter;
import com.amazon.alexa.ra.android.smartfragment.util.Logger;
import com.amazon.alexa.redesign.compose.home.HomeKt$$ExternalSyntheticLambda80;
import com.amazon.apl.android.Content$$ExternalSyntheticLambda0;
import com.amazon.identity.auth.device.api.MAPAccountManager;
import com.amazon.identity.auth.device.api.MultipleAccountManager;
import com.dee.app.metrics.MetricsConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\b\u0001\u0018\u0000 72\u00020\u0001:\u000267B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJj\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172(\u0010\u0018\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001a\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0019j\u0004\u0018\u0001`\u001b2(\u0010\u001c\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001a\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0019j\u0004\u0018\u0001`\u001dJ\u0016\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u001f\u001a\u00020\u0014J\u0016\u0010 \u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000eJ\u0016\u0010\"\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eJ\u001c\u0010$\u001a\u00020\u00142\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001aJ\u001c\u0010&\u001a\u00020\u00142\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001aJ\u001c\u0010'\u001a\u00020\u00142\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001aJ&\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u000e2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00140,H\u0002J\"\u0010-\u001a\u00020\u00142\n\u0010.\u001a\u00060/R\u00020\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00140,H\u0002J\u0018\u00100\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0002J>\u00101\u001a\u00020\u00142$\u00102\u001a \u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001a\u0012\u0004\u0012\u00020\u00140\u0019j\u0002`\u001b2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000eH\u0002J,\u00103\u001a&\u0012\"\u0012 \u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001a\u0012\u0004\u0012\u00020\u00140\u0019j\u0002`\u001d04H\u0002JD\u00105\u001a\u00020\u00142$\u00102\u001a \u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001a\u0012\u0004\u0012\u00020\u00140\u0019j\u0002`\u001d2\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/bridge/MessageRouter;", "", "mainExecutor", "Ljava/util/concurrent/Executor;", "metrics", "Lcom/amazon/alexa/ra/android/smartfragment/bridge/BridgeMetrics;", "messageAdmission", "Lcom/amazon/alexa/ra/android/smartfragment/bridge/InboundAdmission;", "errorAdmission", "<init>", "(Ljava/util/concurrent/Executor;Lcom/amazon/alexa/ra/android/smartfragment/bridge/BridgeMetrics;Lcom/amazon/alexa/ra/android/smartfragment/bridge/InboundAdmission;Lcom/amazon/alexa/ra/android/smartfragment/bridge/InboundAdmission;)V", JoinPoint.SYNCHRONIZATION_LOCK, "registrations", "", "", "", "Lcom/amazon/alexa/ra/android/smartfragment/bridge/MessageRouter$Registration;", "isFirstInstanceExceptionClaimed", "Ljava/util/concurrent/atomic/AtomicBoolean;", MAPAccountManager.KEY_REGISTER_AFTER_OAUTH, "", "viewId", MultipleAccountManager.SessionPackageMappingType.JSON_KEY_SESSION_PACKAGE_MAPPING_OWNER, "Lcom/amazon/alexa/ra/android/smartfragment/react/ViewClaim;", "onMessage", "Lkotlin/Function1;", "", "Lcom/amazon/alexa/ra/android/smartfragment/messaging/MessageHandler;", "onError", "Lcom/amazon/alexa/ra/android/smartfragment/messaging/RawErrorHandler;", "unregister", MetricsConstants.Method.CACHE_CLEAR, "deliver", "json", "rejectInbound", "reason", "broadcastError", LogLevel.INFO, "broadcastJsError", "broadcastInstanceException", "executeAdmitted", "admission", "shedPrefix", "task", "Lkotlin/Function0;", "runReleasing", "permit", "Lcom/amazon/alexa/ra/android/smartfragment/bridge/InboundAdmission$Permit;", "reportShed", "invokeMessageHandler", "handler", "newestErrorHandlers", "", "invokeErrorHandler", "Registration", "Companion", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMessageRouter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageRouter.kt\ncom/amazon/alexa/ra/android/smartfragment/bridge/MessageRouter\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SafeCatching.kt\ncom/amazon/alexa/ra/android/smartfragment/util/SafeCatchingKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,319:1\n384#2,7:320\n1#3:327\n1#3:345\n19#4,7:328\n19#4,7:348\n1617#5,9:335\n1869#5:344\n1870#5:346\n1626#5:347\n1869#5,2:355\n1869#5,2:357\n*S KotlinDebug\n*F\n+ 1 MessageRouter.kt\ncom/amazon/alexa/ra/android/smartfragment/bridge/MessageRouter\n*L\n71#1:320,7\n286#1:345\n280#1:328,7\n296#1:348,7\n286#1:335,9\n286#1:344\n286#1:346\n286#1:347\n160#1:355,2\n184#1:357,2\n*E\n"})
/* loaded from: classes18.dex */
public final class MessageRouter {

    @NotNull
    private static final String REASON_UNREGISTERED = "unregistered";

    @NotNull
    private final InboundAdmission errorAdmission;

    @NotNull
    private final AtomicBoolean isFirstInstanceExceptionClaimed;

    @NotNull
    private final Object lock;

    @NotNull
    private final Executor mainExecutor;

    @NotNull
    private final InboundAdmission messageAdmission;

    @NotNull
    private final BridgeMetrics metrics;

    @NotNull
    private final Map<String, List<Registration>> registrations;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012(\u0010\u0004\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005j\u0004\u0018\u0001`\t\u0012(\u0010\n\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005j\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR3\u0010\u0004\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005j\u0004\u0018\u0001`\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R3\u0010\n\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005j\u0004\u0018\u0001`\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/bridge/MessageRouter$Registration;", "", MultipleAccountManager.SessionPackageMappingType.JSON_KEY_SESSION_PACKAGE_MAPPING_OWNER, "Lcom/amazon/alexa/ra/android/smartfragment/react/ViewClaim;", "onMessage", "Lkotlin/Function1;", "", "", "", "Lcom/amazon/alexa/ra/android/smartfragment/messaging/MessageHandler;", "onError", "Lcom/amazon/alexa/ra/android/smartfragment/messaging/RawErrorHandler;", "<init>", "(Lcom/amazon/alexa/ra/android/smartfragment/react/ViewClaim;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getOwner", "()Lcom/amazon/alexa/ra/android/smartfragment/react/ViewClaim;", "getOnMessage", "()Lkotlin/jvm/functions/Function1;", "getOnError", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Registration {

        @Nullable
        private final Function1<Map<String, ? extends Object>, Unit> onError;

        @Nullable
        private final Function1<Map<String, ? extends Object>, Unit> onMessage;

        @NotNull
        private final ViewClaim owner;

        /* JADX WARN: Multi-variable type inference failed */
        public Registration(@NotNull ViewClaim viewClaim, @Nullable Function1<? super Map<String, ? extends Object>, Unit> function1, @Nullable Function1<? super Map<String, ? extends Object>, Unit> function12) {
            viewClaim.getClass();
            this.owner = viewClaim;
            this.onMessage = function1;
            this.onError = function12;
        }

        @Nullable
        public final Function1<Map<String, ? extends Object>, Unit> getOnError() {
            return this.onError;
        }

        @Nullable
        public final Function1<Map<String, ? extends Object>, Unit> getOnMessage() {
            return this.onMessage;
        }

        @NotNull
        public final ViewClaim getOwner() {
            return this.owner;
        }
    }

    public MessageRouter(@NotNull Executor executor, @NotNull BridgeMetrics bridgeMetrics, @NotNull InboundAdmission inboundAdmission, @NotNull InboundAdmission inboundAdmission2) {
        executor.getClass();
        bridgeMetrics.getClass();
        inboundAdmission.getClass();
        inboundAdmission2.getClass();
        this.mainExecutor = executor;
        this.metrics = bridgeMetrics;
        this.messageAdmission = inboundAdmission;
        this.errorAdmission = inboundAdmission2;
        this.lock = new Object();
        this.registrations = new LinkedHashMap();
        this.isFirstInstanceExceptionClaimed = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void broadcastError$lambda$10(List list, MessageRouter messageRouter, Map map) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            messageRouter.invokeErrorHandler((Function1) it2.next(), map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit broadcastJsError$lambda$13(List list, MessageRouter messageRouter, Map map) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            messageRouter.invokeErrorHandler((Function1) it2.next(), map);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deliver$lambda$7(MessageRouter messageRouter, Function1 function1, String str, String str2) {
        messageRouter.invokeMessageHandler(function1, str, str2);
        return Unit.INSTANCE;
    }

    private final void executeAdmitted(InboundAdmission admission, String shedPrefix, Function0<Unit> task) {
        InboundAdmission.Permit tryAcquire = admission.tryAcquire(new Recomposer$$ExternalSyntheticLambda0(this, shedPrefix, 27));
        if (tryAcquire == null) {
            return;
        }
        try {
            this.mainExecutor.execute(new Content$$ExternalSyntheticLambda0(this, 17, tryAcquire, task));
        } catch (Throwable th) {
            tryAcquire.release();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit executeAdmitted$lambda$15(MessageRouter messageRouter, String str, String str2) {
        str2.getClass();
        messageRouter.reportShed(str, str2);
        return Unit.INSTANCE;
    }

    private final void invokeErrorHandler(Function1<? super Map<String, ? extends Object>, Unit> handler, Map<String, ? extends Object> info) {
        Object m25294constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            handler.invoke(info);
            m25294constructorimpl = Result.m25294constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Result.Companion companion2 = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl(ResultKt.createFailure(e2));
        }
        Throwable m25297exceptionOrNullimpl = Result.m25297exceptionOrNullimpl(m25294constructorimpl);
        if (m25297exceptionOrNullimpl != null) {
            Logger.INSTANCE.error("onError handler failed", m25297exceptionOrNullimpl);
        }
    }

    private final void invokeMessageHandler(Function1<? super Map<String, ? extends Object>, Unit> handler, String viewId, String json) {
        Object m25294constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            handler.invoke(JsonConverter.INSTANCE.toMap(new JSONObject(json)));
            m25294constructorimpl = Result.m25294constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Result.Companion companion2 = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl(ResultKt.createFailure(e2));
        }
        Throwable m25297exceptionOrNullimpl = Result.m25297exceptionOrNullimpl(m25294constructorimpl);
        if (m25297exceptionOrNullimpl != null) {
            Logger.INSTANCE.error("onMessage failed viewId=" + viewId, m25297exceptionOrNullimpl);
        }
    }

    private final List<Function1<Map<String, ? extends Object>, Unit>> newestErrorHandlers() {
        Collection<List<Registration>> values = this.registrations.values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = values.iterator();
        while (it2.hasNext()) {
            Registration registration = (Registration) CollectionsKt.lastOrNull((List) it2.next());
            Function1<Map<String, ? extends Object>, Unit> onError = registration != null ? registration.getOnError() : null;
            if (onError != null) {
                arrayList.add(onError);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean register$lambda$2$lambda$1(ViewClaim viewClaim, Registration registration) {
        registration.getClass();
        return registration.getOwner() == viewClaim;
    }

    private final void reportShed(String shedPrefix, String reason) {
        Logger.INSTANCE.warning("JS-originated work rejected by admission metric=" + shedPrefix + " reason=" + reason);
        this.metrics.count(shedPrefix + reason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runReleasing(InboundAdmission.Permit permit, Function0<Unit> task) {
        try {
            task.invoke();
        } finally {
            permit.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean unregister$lambda$4$lambda$3(ViewClaim viewClaim, Registration registration) {
        registration.getClass();
        return registration.getOwner() == viewClaim;
    }

    public final void broadcastError(@NotNull Map<String, ? extends Object> info) {
        List<Function1<Map<String, ? extends Object>, Unit>> newestErrorHandlers;
        info.getClass();
        synchronized (this.lock) {
            newestErrorHandlers = newestErrorHandlers();
        }
        if (newestErrorHandlers.isEmpty()) {
            this.metrics.count("SmartFragment.Bridge.ErrorDropped");
        } else {
            this.mainExecutor.execute(new Content$$ExternalSyntheticLambda0(newestErrorHandlers, 18, this, info));
        }
    }

    public final void broadcastInstanceException(@NotNull Map<String, ? extends Object> info) {
        boolean isEmpty;
        info.getClass();
        synchronized (this.lock) {
            isEmpty = newestErrorHandlers().isEmpty();
        }
        if (isEmpty) {
            this.metrics.count("SmartFragment.Bridge.ErrorDropped");
        } else if (this.isFirstInstanceExceptionClaimed.compareAndSet(false, true)) {
            broadcastError(info);
        } else {
            broadcastJsError(info);
        }
    }

    public final void broadcastJsError(@NotNull Map<String, ? extends Object> info) {
        List<Function1<Map<String, ? extends Object>, Unit>> newestErrorHandlers;
        info.getClass();
        synchronized (this.lock) {
            newestErrorHandlers = newestErrorHandlers();
        }
        if (newestErrorHandlers.isEmpty()) {
            this.metrics.count("SmartFragment.Bridge.ErrorDropped");
        } else {
            executeAdmitted(this.errorAdmission, "SmartFragment.Bridge.ErrorRejected.", new AssistantBuilder$$ExternalSyntheticLambda6(newestErrorHandlers, 12, this, info));
        }
    }

    public final void clear() {
        synchronized (this.lock) {
            this.registrations.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void deliver(@NotNull String viewId, @NotNull String json) {
        Function1<Map<String, ? extends Object>, Unit> onMessage;
        Registration registration;
        viewId.getClass();
        json.getClass();
        synchronized (this.lock) {
            List<Registration> list = this.registrations.get(viewId);
            onMessage = (list == null || (registration = (Registration) CollectionsKt.lastOrNull((List) list)) == null) ? null : registration.getOnMessage();
        }
        if (onMessage == null) {
            this.metrics.count("SmartFragment.Bridge.MessageRejected.unregistered");
        } else {
            executeAdmitted(this.messageAdmission, "SmartFragment.Bridge.MessageRejected.", new HomeKt$$ExternalSyntheticLambda80(this, onMessage, viewId, json));
        }
    }

    public final void register(@NotNull String viewId, @NotNull ViewClaim owner, @Nullable Function1<? super Map<String, ? extends Object>, Unit> onMessage, @Nullable Function1<? super Map<String, ? extends Object>, Unit> onError) {
        viewId.getClass();
        owner.getClass();
        synchronized (this.lock) {
            try {
                Map<String, List<Registration>> map = this.registrations;
                List<Registration> list = map.get(viewId);
                if (list == null) {
                    list = new ArrayList<>();
                    map.put(viewId, list);
                }
                List<Registration> list2 = list;
                CollectionsKt.removeAll((List) list2, (Function1) new MessageRouter$$ExternalSyntheticLambda0(owner, 1));
                list2.add(new Registration(owner, onMessage, onError));
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void rejectInbound(@NotNull String viewId, @NotNull String reason) {
        viewId.getClass();
        reason.getClass();
        Logger.INSTANCE.warning("message rejected viewId=" + viewId + " reason=" + reason);
        this.metrics.count("SmartFragment.Bridge.MessageRejected.".concat(reason));
    }

    public final void unregister(@NotNull String viewId, @NotNull ViewClaim owner) {
        viewId.getClass();
        owner.getClass();
        synchronized (this.lock) {
            try {
                List<Registration> list = this.registrations.get(viewId);
                if (list == null) {
                    return;
                }
                CollectionsKt.removeAll((List) list, (Function1) new MessageRouter$$ExternalSyntheticLambda0(owner, 0));
                if (list.isEmpty()) {
                    this.registrations.remove(viewId);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/bridge/MessageRouter$Companion;", "", "<init>", "()V", "REASON_UNREGISTERED", "", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ MessageRouter(Executor executor, BridgeMetrics bridgeMetrics, InboundAdmission inboundAdmission, InboundAdmission inboundAdmission2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(executor, bridgeMetrics, (i & 4) != 0 ? InboundAdmission.INSTANCE.forMessages() : inboundAdmission, (i & 8) != 0 ? InboundAdmission.INSTANCE.forErrors() : inboundAdmission2);
    }
}

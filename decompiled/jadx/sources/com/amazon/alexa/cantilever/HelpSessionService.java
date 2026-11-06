package com.amazon.alexa.cantilever;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.cantilever.HelpMetricsConstants;
import com.amazon.alexa.protocols.environment.EnvironmentService;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.alexa.protocols.service.api.LazyComponent;
import com.amazon.alexa.routing.data.RouteName;
import com.amazon.alexa.ttcf.api.TTCFCheckpoint;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class HelpSessionService {
    private static final int MINIMUM_HTTP_ERROR = 400;
    private static final int MINIMUM_HTTP_SERVER_ERROR = 500;
    private static final String TAG = "HelpSessionService";
    private static final String THANK_YOU_PATH = "thankyou";
    private final LazyComponent<EnvironmentService> environmentService;
    private final HelpMetricsService helpMetricsService;
    private boolean isHelpFlowCompleted;
    private boolean isLoadUrlCalled;
    private boolean isUnableToLoad;
    private MAPSignInState mapSignInState;
    private final Set<String> recordableJsEvents;
    private MetricSessionState state;

    @Nullable
    private LazyComponent<TTCFCheckpoint> ttcfService;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.cantilever.HelpSessionService$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$cantilever$HelpSessionService$MetricSessionState;

        static {
            int[] iArr = new int[MetricSessionState.values().length];
            $SwitchMap$com$amazon$alexa$cantilever$HelpSessionService$MetricSessionState = iArr;
            try {
                iArr[MetricSessionState.ATTEMPTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$cantilever$HelpSessionService$MetricSessionState[MetricSessionState.AUTHENTICATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum MAPSignInState {
        MAP_NOT_SIGNED_IN,
        MAP_SIGNED_IN,
        MAP_SIGNED_IN_LAST_TIME
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum MetricSessionState {
        UNINITIALIZED,
        ATTEMPTED,
        FAILED,
        LANDED,
        AUTHENTICATED,
        CANCELED
    }

    public HelpSessionService(HelpMetricsService helpMetricsService, ComponentRegistry componentRegistry) {
        this.recordableJsEvents = new HashSet(HelpMetricsConstants.EventName.JS_EVENTS);
        this.state = MetricSessionState.UNINITIALIZED;
        this.mapSignInState = MAPSignInState.MAP_NOT_SIGNED_IN;
        this.helpMetricsService = helpMetricsService;
        this.environmentService = componentRegistry.getLazy(EnvironmentService.class);
        this.ttcfService = componentRegistry.getLazy(TTCFCheckpoint.class);
    }

    private boolean isInProgress() {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$cantilever$HelpSessionService$MetricSessionState[this.state.ordinal()];
        return i == 1 || i == 2;
    }

    private void markComplete() {
        LazyComponent<TTCFCheckpoint> lazyComponent = this.ttcfService;
        if (lazyComponent != null) {
            lazyComponent.get().markComplete(RouteName.HELP);
            this.ttcfService = null;
        }
    }

    public boolean isHelpFlowCompleted() {
        return this.isHelpFlowCompleted;
    }

    public boolean isLoadUrlCalled() {
        return this.isLoadUrlCalled;
    }

    public boolean isMAPNotSignedIn() {
        return this.mapSignInState == MAPSignInState.MAP_NOT_SIGNED_IN;
    }

    public boolean isMAPSignedInLastTime() {
        return this.mapSignInState == MAPSignInState.MAP_SIGNED_IN_LAST_TIME;
    }

    public boolean isUnableToLoad() {
        return this.isUnableToLoad;
    }

    public void onHelpFlowCompleted(String str) {
        this.isHelpFlowCompleted = !TextUtils.isEmpty(str) && str.contains(THANK_YOU_PATH);
    }

    public void onHelpLoadAttempt() {
        if (this.state == MetricSessionState.UNINITIALIZED) {
            this.state = MetricSessionState.ATTEMPTED;
            this.helpMetricsService.recordHelpLoadAttempt();
        }
    }

    public void onHelpLoadDetached() {
        if (isInProgress()) {
            this.state = MetricSessionState.CANCELED;
            this.helpMetricsService.recordHelpLoadCancel();
        }
    }

    public void onHelpLoadFinishLanding(String str) {
        boolean isKnownUrl = this.environmentService.get().isKnownUrl(EnvironmentService.KnownUrlType.AUTH_PORTAL_SIGN_IN, str);
        if (isKnownUrl && this.mapSignInState == MAPSignInState.MAP_SIGNED_IN) {
            this.mapSignInState = MAPSignInState.MAP_SIGNED_IN_LAST_TIME;
            return;
        }
        this.mapSignInState = MAPSignInState.MAP_NOT_SIGNED_IN;
        if (TextUtils.isEmpty(str) || !isInProgress()) {
            return;
        }
        if (!isKnownUrl) {
            this.state = MetricSessionState.LANDED;
            markComplete();
            this.helpMetricsService.recordHelpLoadSuccess();
        } else {
            MetricSessionState metricSessionState = this.state;
            MetricSessionState metricSessionState2 = MetricSessionState.AUTHENTICATED;
            if (metricSessionState != metricSessionState2) {
                this.state = metricSessionState2;
                this.helpMetricsService.recordHelpLoadSignIn();
            }
        }
    }

    public void onHelpLoadHttpError(int i, @NonNull String str) {
        if (i >= 400) {
            if (isInProgress()) {
                this.state = MetricSessionState.FAILED;
                this.helpMetricsService.recordHelpLoadHttpError(i, str);
            }
            this.isUnableToLoad = i >= 500;
        }
    }

    public void onHelpLoadOtherError(int i, @NonNull String str) {
        if (isInProgress()) {
            this.state = MetricSessionState.FAILED;
            this.helpMetricsService.recordHelpLoadOtherError(i, str);
        }
        this.isUnableToLoad = true;
    }

    public void onJsEventSent(String str) {
        if ((isInProgress() || this.state == MetricSessionState.LANDED) && this.recordableJsEvents.contains(str)) {
            this.recordableJsEvents.remove(str);
            markComplete();
            this.helpMetricsService.recordJsEvent(str);
        }
    }

    public void onLoadUrlCalled() {
        this.isLoadUrlCalled = true;
    }

    public void onMAPOverrideUrlLoading(String str) {
        if (this.environmentService.get().isKnownUrl(EnvironmentService.KnownUrlType.AUTH_PORTAL_SIGN_IN, str)) {
            this.mapSignInState = MAPSignInState.MAP_SIGNED_IN;
        }
    }

    public void resetUnableToLoadFlag() {
        this.isUnableToLoad = false;
    }

    public HelpSessionService(HelpMetricsService helpMetricsService) {
        this(helpMetricsService, ComponentRegistry.getInstance());
    }
}

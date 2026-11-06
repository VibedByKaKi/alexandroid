package com.amazon.dee.app.services.metrics;

import com.amazon.alexa.accessory.notificationpublisher.utils.NotificationConstants;
import com.amazon.alexa.handsfree.metrics.caching.JsonFields;
import com.amazon.alexa.mobilytics.event.Channels;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer;
import com.amazon.alexa.routing.api.Route;
import com.amazon.alexa.ttcf.api.TTCFRoute;
import com.amazon.dee.app.elements.ElementsRouteKeys;
import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import com.amazon.deecomms.common.metrics.MetricKeys;
import com.amazon.latencyinfra.TimelineInputArgument;
import com.caverock.androidsvg.SVGParser;
import com.dee.app.metrics.MetricsService;
import com.dee.app.metrics.MetricsTimer;
import io.ktor.client.utils.CacheControl;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0003>?@J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\bH&J\b\u0010\u0013\u001a\u00020\u0003H&J\b\u0010\u0014\u001a\u00020\u0003H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u001aH&J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!H&J\b\u0010\"\u001a\u00020\u0003H&J\b\u0010#\u001a\u00020\u0003H&J\b\u0010$\u001a\u00020\u0003H&J\b\u0010%\u001a\u00020\u0003H&J\b\u0010&\u001a\u00020\u0003H&J\b\u0010'\u001a\u00020\u0003H&J\u0010\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u0010H&J\b\u0010*\u001a\u00020+H&J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020+H&J\b\u0010.\u001a\u00020\u0003H&J\b\u0010/\u001a\u00020\u0003H&J \u00100\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\n2\u0006\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\nH&J\b\u00103\u001a\u00020\u0003H&J\b\u00104\u001a\u00020\u0003H&J\b\u00105\u001a\u00020\u0003H&J\u0010\u00106\u001a\u00020\u00172\u0006\u00107\u001a\u000208H&J\u0010\u00106\u001a\u00020\u00172\u0006\u00107\u001a\u000209H&J\b\u0010:\u001a\u00020\u0003H&J\u0010\u0010:\u001a\u00020\u00032\u0006\u0010;\u001a\u00020\nH\u0016J\b\u0010<\u001a\u00020\u0003H&J\b\u0010=\u001a\u00020\u0003H&¨\u0006AÀ\u0006\u0003"}, d2 = {"Lcom/amazon/dee/app/services/metrics/LatencyServiceDelegate;", "", "setMetricsService", "", "service", "Lcom/dee/app/metrics/MetricsService;", "start", "type", "Lcom/amazon/dee/app/services/metrics/LatencyServiceDelegate$StartType;", "startTimeMillis", "", "pause", "resume", "suspend", "activate", "isStartActive", "", "isStartType", "test", "invalidate", "recordUserPerceivedColdStartLatency", "saveCompletion", MetricKeys.META_ENDPOINT, "", "override", "completion", "Lcom/amazon/dee/app/services/metrics/LatencyServiceDelegate$Completion;", "complete", JsonFields.COMPONENT, "Lcom/amazon/dee/app/services/metrics/LatencyServiceDelegate$Component;", "routeDidStart", "Lcom/amazon/alexa/ttcf/api/TTCFRoute;", "route", "Lcom/amazon/alexa/routing/api/Route;", "startWhenReady", "whenReadyComplete", "startElementsRouteRegistration", "endElementsRouteRegistration", "statemachineStarted", "stateMachineComplete", "catalystLoaded", "isFirstLoad", "startLoadingReactNative", "Lcom/amazon/latencyinfra/TimelineInputArgument$Builder;", "reactNativeLoaded", ElementsRouteKeys.ARGS, "onCreateReactContextStart", "onCreateStarted", "recordStartupTimeline", "componentsInjected", "reactNativeInit", "viewModelStarted", "onCreateFinished", "voiceInitialized", "formatLatency", "timer", "Lcom/dee/app/metrics/MetricsTimer;", "Lcom/amazon/alexa/mobilytics/event/operational/MobilyticsMetricsTimer;", "initColdStartTimer", "elapsedRealtimeMillis", "cancelColdStartTimer", "recordColdStartTimer", "Component", "Completion", "StartType", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface LatencyServiceDelegate {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\nj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u000b"}, d2 = {"Lcom/amazon/dee/app/services/metrics/LatencyServiceDelegate$Completion;", "", "<init>", "(Ljava/lang/String;I)V", AlexaMetricsConstants.MetricsComponents.OOBE, "HOME", "HOMEFEED", "CONVERSATION", "UNKNOWN", "value", "", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Completion {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Completion[] $VALUES;
        public static final Completion OOBE = new Completion(AlexaMetricsConstants.MetricsComponents.OOBE, 0);
        public static final Completion HOME = new Completion("HOME", 1);
        public static final Completion HOMEFEED = new Completion("HOMEFEED", 2);
        public static final Completion CONVERSATION = new Completion("CONVERSATION", 3);
        public static final Completion UNKNOWN = new Completion("UNKNOWN", 4);

        private static final /* synthetic */ Completion[] $values() {
            return new Completion[]{OOBE, HOME, HOMEFEED, CONVERSATION, UNKNOWN};
        }

        static {
            Completion[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private Completion(String str, int i) {
        }

        @NotNull
        public static EnumEntries<Completion> getEntries() {
            return $ENTRIES;
        }

        public static Completion valueOf(String str) {
            return (Completion) Enum.valueOf(Completion.class, str);
        }

        public static Completion[] values() {
            return (Completion[]) $VALUES.clone();
        }

        @NotNull
        public final String value() {
            String lowerCase = name().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            return lowerCase;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/amazon/dee/app/services/metrics/LatencyServiceDelegate$Component;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "FTUE", NotificationConstants.TYPE_COMMS, "HOME", "NATIVE", "WEB", "SIGN_IN", "ELEMENT", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Component {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Component[] $VALUES;

        @NotNull
        private final String value;
        public static final Component FTUE = new Component("FTUE", 0, "ftue");
        public static final Component COMMS = new Component(NotificationConstants.TYPE_COMMS, 1, "comms");
        public static final Component HOME = new Component("HOME", 2, Channels.HOME);
        public static final Component NATIVE = new Component("NATIVE", 3, "native");
        public static final Component WEB = new Component("WEB", 4, "web");
        public static final Component SIGN_IN = new Component("SIGN_IN", 5, "sign_in");
        public static final Component ELEMENT = new Component("ELEMENT", 6, "lmnt");

        private static final /* synthetic */ Component[] $values() {
            return new Component[]{FTUE, COMMS, HOME, NATIVE, WEB, SIGN_IN, ELEMENT};
        }

        static {
            Component[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private Component(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<Component> getEntries() {
            return $ENTRIES;
        }

        public static Component valueOf(String str) {
            return (Component) Enum.valueOf(Component.class, str);
        }

        public static Component[] values() {
            return (Component[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void initColdStartTimer(@NotNull LatencyServiceDelegate latencyServiceDelegate, long j) {
            LatencyServiceDelegate.super.initColdStartTimer(j);
        }

        @Deprecated
        public static void start(@NotNull LatencyServiceDelegate latencyServiceDelegate, @NotNull StartType startType, long j) {
            startType.getClass();
            LatencyServiceDelegate.super.start(startType, j);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\n\u001a\u00020\u0003J\u0006\u0010\u000b\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\f"}, d2 = {"Lcom/amazon/dee/app/services/metrics/LatencyServiceDelegate$StartType;", "", SVGParser.XML_STYLESHEET_ATTR_ALTERNATE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getAlternate", "()Ljava/lang/String;", "COLD", "WARM", "value", "abbr", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StartType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StartType[] $VALUES;
        public static final StartType COLD = new StartType("COLD", 0, "cs");
        public static final StartType WARM = new StartType("WARM", 1, "ws");

        @NotNull
        private final String alternate;

        private static final /* synthetic */ StartType[] $values() {
            return new StartType[]{COLD, WARM};
        }

        static {
            StartType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private StartType(String str, int i, String str2) {
            this.alternate = str2;
        }

        @NotNull
        public static EnumEntries<StartType> getEntries() {
            return $ENTRIES;
        }

        public static StartType valueOf(String str) {
            return (StartType) Enum.valueOf(StartType.class, str);
        }

        public static StartType[] values() {
            return (StartType[]) $VALUES.clone();
        }

        @NotNull
        /* renamed from: abbr, reason: from getter */
        public final String getAlternate() {
            return this.alternate;
        }

        @NotNull
        public final String getAlternate() {
            return this.alternate;
        }

        @NotNull
        public final String value() {
            String lowerCase = name().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            return lowerCase;
        }
    }

    void activate();

    void cancelColdStartTimer();

    void catalystLoaded(boolean isFirstLoad);

    void complete(@NotNull Component component, @NotNull Completion endpoint);

    void complete(@NotNull String component, @NotNull String endpoint);

    void endElementsRouteRegistration();

    @NotNull
    String formatLatency(@NotNull MobilyticsMetricsTimer timer);

    @NotNull
    String formatLatency(@NotNull MetricsTimer timer);

    void initColdStartTimer();

    default void initColdStartTimer(long elapsedRealtimeMillis) {
        initColdStartTimer();
    }

    void invalidate();

    boolean isStartActive();

    boolean isStartType(@NotNull StartType test);

    void onCreateFinished();

    void onCreateReactContextStart();

    void onCreateStarted();

    void override(@NotNull Completion completion);

    void pause();

    void reactNativeLoaded(@NotNull TimelineInputArgument.Builder args);

    void recordColdStartTimer();

    void recordStartupTimeline(long start, long componentsInjected, long reactNativeInit);

    void recordUserPerceivedColdStartLatency();

    void resume();

    @Nullable
    TTCFRoute routeDidStart(@NotNull Route route);

    void saveCompletion(@NotNull String endpoint);

    void setMetricsService(@NotNull MetricsService service);

    void start(@NotNull StartType type);

    default void start(@NotNull StartType type, long startTimeMillis) {
        type.getClass();
        start(type);
    }

    void startElementsRouteRegistration();

    @NotNull
    TimelineInputArgument.Builder startLoadingReactNative();

    void startWhenReady();

    void stateMachineComplete();

    void statemachineStarted();

    void suspend();

    void viewModelStarted();

    void voiceInitialized();

    void whenReadyComplete();
}

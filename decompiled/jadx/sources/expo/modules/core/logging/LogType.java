package expo.modules.core.logging;

import com.amazon.alexa.devicesetup.softap.listener.BuildConfig;
import com.amazon.alexa.mobilytics.event.LogLevel;
import com.amazon.dee.app.elements.bridges.TraceModule;
import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lexpo/modules/core/logging/LogType;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", TraceModule.MODULE_NAME, "Timer", "Stacktrace", "Debug", "Info", "Warn", "Error", AlexaMetricsConstants.EventTypes.EVENT_TYPE_FATAL, "Companion", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LogType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LogType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String type;
    public static final LogType Trace = new LogType(TraceModule.MODULE_NAME, 0, "trace");
    public static final LogType Timer = new LogType("Timer", 1, "timer");
    public static final LogType Stacktrace = new LogType("Stacktrace", 2, "stacktrace");
    public static final LogType Debug = new LogType("Debug", 3, BuildConfig.BUILD_TYPE);
    public static final LogType Info = new LogType("Info", 4, LogLevel.INFO);
    public static final LogType Warn = new LogType("Warn", 5, LogLevel.WARN);
    public static final LogType Error = new LogType("Error", 6, "error");
    public static final LogType Fatal = new LogType(AlexaMetricsConstants.EventTypes.EVENT_TYPE_FATAL, 7, "fatal");

    private static final /* synthetic */ LogType[] $values() {
        return new LogType[]{Trace, Timer, Stacktrace, Debug, Info, Warn, Error, Fatal};
    }

    static {
        LogType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private LogType(String str, int i, String str2) {
        this.type = str2;
    }

    @NotNull
    public static EnumEntries<LogType> getEntries() {
        return $ENTRIES;
    }

    public static LogType valueOf(String str) {
        return (LogType) Enum.valueOf(LogType.class, str);
    }

    public static LogType[] values() {
        return (LogType[]) $VALUES.clone();
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/core/logging/LogType$Companion;", "", "<init>", "()V", "toOSLogType", "", "type", "Lexpo/modules/core/logging/LogType;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LogType.values().length];
                try {
                    iArr[LogType.Trace.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LogType.Timer.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LogType.Stacktrace.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[LogType.Debug.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[LogType.Info.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[LogType.Warn.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[LogType.Error.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[LogType.Fatal.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int toOSLogType(@NotNull LogType type) {
            type.getClass();
            switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return 3;
                case 5:
                    return 4;
                case 6:
                    return 5;
                case 7:
                    return 6;
                case 8:
                    return 7;
                default:
                    PathKt$$ExternalSyntheticBUOutline0.m();
                    return 0;
            }
        }

        private Companion() {
        }
    }
}

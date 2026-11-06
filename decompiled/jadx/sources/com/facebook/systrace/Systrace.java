package com.facebook.systrace;

import androidx.tracing.Trace;
import com.amazon.alexa.accessorykit.interprocess.cookie.CookieChangeEmitter;
import com.amazon.dee.app.elements.ElementsRouteKeys;
import com.amazon.devicesetupservice.smarthome.ProtocolType;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import expo.modules.interfaces.permissions.PermissionsResponse;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001+B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0007J$\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J \u0010\u0013\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0010H\u0007J3\u0010\u0017\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0007¢\u0006\u0002\u0010\u001cJ#\u0010\u001d\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0007J \u0010 \u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u001bH\u0007J(\u0010 \u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u0005H\u0007J \u0010#\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u001bH\u0007J(\u0010#\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u0005H\u0007J \u0010%\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u001bH\u0007J \u0010(\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u001bH\u0007J \u0010)\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u001bH\u0007J \u0010*\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u001bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/facebook/systrace/Systrace;", "", "<init>", "()V", "TRACE_TAG_REACT", "", "registerListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/facebook/systrace/TraceListener;", "unregisterListener", "isTracing", "", "tag", "traceInstant", "title", "", PermissionsResponse.SCOPE_KEY, "Lcom/facebook/systrace/Systrace$EventScope;", "traceSection", "sectionName", "block", "Ljava/lang/Runnable;", "beginSection", ElementsRouteKeys.ARGS, "", "argsLength", "", "(JLjava/lang/String;[Ljava/lang/String;I)V", "convertArgsToText", "([Ljava/lang/String;I)Ljava/lang/String;", "endSection", "beginAsyncSection", CookieChangeEmitter.COOKIE_KEY, "startNanos", "endAsyncSection", "endNanos", "traceCounter", "counterName", "counterValue", "startAsyncFlow", "stepAsyncFlow", "endAsyncFlow", "EventScope", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Systrace {

    @NotNull
    public static final Systrace INSTANCE = new Systrace();
    public static final long TRACE_TAG_REACT = 0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\f\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/systrace/Systrace$EventScope;", "", "code", "", "<init>", "(Ljava/lang/String;IC)V", "getCode", "()C", ProtocolType.THREAD, "PROCESS", "GLOBAL", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EventScope {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EventScope[] $VALUES;
        private final char code;
        public static final EventScope THREAD = new EventScope(ProtocolType.THREAD, 0, 't');
        public static final EventScope PROCESS = new EventScope("PROCESS", 1, 'p');
        public static final EventScope GLOBAL = new EventScope("GLOBAL", 2, 'g');

        private static final /* synthetic */ EventScope[] $values() {
            return new EventScope[]{THREAD, PROCESS, GLOBAL};
        }

        static {
            EventScope[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private EventScope(String str, int i, char c) {
            this.code = c;
        }

        @NotNull
        public static EnumEntries<EventScope> getEntries() {
            return $ENTRIES;
        }

        public static EventScope valueOf(String str) {
            return (EventScope) Enum.valueOf(EventScope.class, str);
        }

        public static EventScope[] values() {
            return (EventScope[]) $VALUES.clone();
        }

        public final char getCode() {
            return this.code;
        }
    }

    private Systrace() {
    }

    @JvmStatic
    public static final void beginAsyncSection(long tag, @NotNull String sectionName, int cookie) {
        sectionName.getClass();
        Trace.beginAsyncSection(sectionName, cookie);
    }

    @JvmStatic
    public static final void beginSection(long tag, @NotNull String sectionName, @NotNull String[] args, int argsLength) {
        sectionName.getClass();
        args.getClass();
        Trace.beginSection(sectionName + "|" + INSTANCE.convertArgsToText(args, argsLength));
    }

    private final String convertArgsToText(String[] args, int argsLength) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < argsLength; i += 2) {
            String str = args[i - 1];
            String str2 = args[i];
            sb.append(str);
            sb.append('=');
            sb.append(str2);
            if (i < argsLength - 1) {
                sb.append(';');
            }
        }
        return sb.toString();
    }

    @JvmStatic
    public static final void endAsyncFlow(long tag, @NotNull String sectionName, int cookie) {
        sectionName.getClass();
        endAsyncSection(tag, sectionName, cookie);
    }

    @JvmStatic
    public static final void endAsyncSection(long tag, @NotNull String sectionName, int cookie) {
        sectionName.getClass();
        Trace.endAsyncSection(sectionName, cookie);
    }

    @JvmStatic
    public static final void endSection(long tag) {
        Trace.endSection();
    }

    @JvmStatic
    public static final boolean isTracing(long tag) {
        return false;
    }

    @JvmStatic
    public static final void startAsyncFlow(long tag, @NotNull String sectionName, int cookie) {
        sectionName.getClass();
        beginAsyncSection(tag, sectionName, cookie);
    }

    @JvmStatic
    public static final void stepAsyncFlow(long tag, @NotNull String sectionName, int cookie) {
        sectionName.getClass();
    }

    @JvmStatic
    public static final void traceCounter(long tag, @NotNull String counterName, int counterValue) {
        counterName.getClass();
        Trace.setCounter(counterName, counterValue);
    }

    @JvmStatic
    public static final void traceSection(long tag, @NotNull String sectionName, @NotNull Runnable block) {
        sectionName.getClass();
        block.getClass();
        beginSection(tag, sectionName);
        try {
            block.run();
        } finally {
            endSection(tag);
        }
    }

    @JvmStatic
    public static final void beginAsyncSection(long tag, @NotNull String sectionName, int cookie, long startNanos) {
        sectionName.getClass();
        beginAsyncSection(tag, sectionName, cookie);
    }

    @JvmStatic
    public static final void endAsyncSection(long tag, @NotNull String sectionName, int cookie, long endNanos) {
        sectionName.getClass();
        endAsyncSection(tag, sectionName, cookie);
    }

    @JvmStatic
    public static final void registerListener(@Nullable TraceListener listener) {
    }

    @JvmStatic
    public static final void unregisterListener(@Nullable TraceListener listener) {
    }

    @JvmStatic
    public static final void beginSection(long tag, @NotNull String sectionName) {
        sectionName.getClass();
        Trace.beginSection(sectionName);
    }

    @JvmStatic
    public static final void traceInstant(long tag, @Nullable String title, @Nullable EventScope scope) {
    }
}

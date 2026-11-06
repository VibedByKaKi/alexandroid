package com.amazon.alexa.assistant.foundation.model.diagnostics;

import com.amazon.alexa.accessorykit.ModelTransformer;
import com.amazon.alexa.assistant.foundation.logging.LogLevel;
import java.util.List;
import kotlin.Metadata;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000fH\u0016J$\u0010\u0010\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/diagnostics/DiagnosticsDelegate;", "", "log", "", ModelTransformer.KEY_BATTERY_LEVEL, "Lcom/amazon/alexa/assistant/foundation/logging/LogLevel;", "tag", "", "message", "throwable", "", "onDirectiveLifecycleChanged", "stage", "Lcom/amazon/alexa/assistant/foundation/model/diagnostics/DirectiveLifecycleStage;", "onEventLifecycleChanged", "Lcom/amazon/alexa/assistant/foundation/model/diagnostics/EventLifecycleStage;", "onCapabilitiesRegistered", "system", "", "Lcom/amazon/alexa/assistant/foundation/model/diagnostics/CapabilityInfo;", "user", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface DiagnosticsDelegate {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void log(@NotNull DiagnosticsDelegate diagnosticsDelegate, @NotNull LogLevel logLevel, @NotNull String str, @NotNull String str2, @Nullable Throwable th) {
            logLevel.getClass();
            str.getClass();
            str2.getClass();
        }

        public static /* synthetic */ void log$default(DiagnosticsDelegate diagnosticsDelegate, LogLevel logLevel, String str, String str2, Throwable th, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: log");
                return;
            }
            if ((i & 8) != 0) {
                th = null;
            }
            diagnosticsDelegate.log(logLevel, str, str2, th);
        }

        public static void onCapabilitiesRegistered(@NotNull DiagnosticsDelegate diagnosticsDelegate, @NotNull List<CapabilityInfo> list, @NotNull List<CapabilityInfo> list2) {
            list.getClass();
            list2.getClass();
        }

        public static void onDirectiveLifecycleChanged(@NotNull DiagnosticsDelegate diagnosticsDelegate, @NotNull DirectiveLifecycleStage directiveLifecycleStage) {
            directiveLifecycleStage.getClass();
        }

        public static void onEventLifecycleChanged(@NotNull DiagnosticsDelegate diagnosticsDelegate, @NotNull EventLifecycleStage eventLifecycleStage) {
            eventLifecycleStage.getClass();
        }
    }

    void log(@NotNull LogLevel level, @NotNull String tag, @NotNull String message, @Nullable Throwable throwable);

    void onCapabilitiesRegistered(@NotNull List<CapabilityInfo> system, @NotNull List<CapabilityInfo> user);

    void onDirectiveLifecycleChanged(@NotNull DirectiveLifecycleStage stage);

    void onEventLifecycleChanged(@NotNull EventLifecycleStage stage);
}

package com.google.devtools.ksp.processing;

import com.amazon.alexa.hho.navigation.constants.DeeplinkConstants;
import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import com.amazon.alexa.mobilytics.event.LogLevel;
import com.google.devtools.ksp.symbol.KSNode;
import kotlin.Metadata;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u001c\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001c\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001c\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/google/devtools/ksp/processing/KSPLogger;", "", "error", "", "message", "", "symbol", "Lcom/google/devtools/ksp/symbol/KSNode;", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "e", "", LogLevel.INFO, "logging", LogLevel.WARN, DeeplinkConstants.GoogleMapsUniversalDeeplink.Uri.API_QUERY_PARAM_KEY}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public interface KSPLogger {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ void error$default(KSPLogger kSPLogger, String str, KSNode kSNode, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: error");
            return;
        }
        if ((i & 2) != 0) {
            kSNode = null;
        }
        kSPLogger.error(str, kSNode);
    }

    static /* synthetic */ void info$default(KSPLogger kSPLogger, String str, KSNode kSNode, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: info");
            return;
        }
        if ((i & 2) != 0) {
            kSNode = null;
        }
        kSPLogger.info(str, kSNode);
    }

    static /* synthetic */ void logging$default(KSPLogger kSPLogger, String str, KSNode kSNode, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: logging");
            return;
        }
        if ((i & 2) != 0) {
            kSNode = null;
        }
        kSPLogger.logging(str, kSNode);
    }

    static /* synthetic */ void warn$default(KSPLogger kSPLogger, String str, KSNode kSNode, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: warn");
            return;
        }
        if ((i & 2) != 0) {
            kSNode = null;
        }
        kSPLogger.warn(str, kSNode);
    }

    void error(@NotNull String message, @Nullable KSNode symbol);

    void exception(@NotNull Throwable e);

    void info(@NotNull String message, @Nullable KSNode symbol);

    void logging(@NotNull String message, @Nullable KSNode symbol);

    void warn(@NotNull String message, @Nullable KSNode symbol);
}

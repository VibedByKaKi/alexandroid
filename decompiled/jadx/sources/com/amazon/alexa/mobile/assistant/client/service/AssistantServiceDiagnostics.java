package com.amazon.alexa.mobile.assistant.client.service;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/service/AssistantServiceDiagnostics;", "", "<init>", "()V", "requestDropReporter", "Lcom/amazon/alexa/mobile/assistant/client/service/AssistantServiceDropReporter;", "getRequestDropReporter$annotations", "getRequestDropReporter", "()Lcom/amazon/alexa/mobile/assistant/client/service/AssistantServiceDropReporter;", "setRequestDropReporter", "(Lcom/amazon/alexa/mobile/assistant/client/service/AssistantServiceDropReporter;)V", "client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class AssistantServiceDiagnostics {

    @Nullable
    private static volatile AssistantServiceDropReporter requestDropReporter;

    @NotNull
    public static final AssistantServiceDiagnostics INSTANCE = new AssistantServiceDiagnostics();
    public static final int $stable = 8;

    private AssistantServiceDiagnostics() {
    }

    @Nullable
    public static final AssistantServiceDropReporter getRequestDropReporter() {
        return requestDropReporter;
    }

    public static final void setRequestDropReporter(@Nullable AssistantServiceDropReporter assistantServiceDropReporter) {
        requestDropReporter = assistantServiceDropReporter;
    }

    @JvmStatic
    public static /* synthetic */ void getRequestDropReporter$annotations() {
    }
}

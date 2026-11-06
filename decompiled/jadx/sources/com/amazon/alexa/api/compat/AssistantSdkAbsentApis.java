package com.amazon.alexa.api.compat;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/api/compat/AssistantSdkAbsentApis;", "", "<init>", "()V", "NOT_SUPPORTED_MESSAGE", "", "notSupported", "Ljava/lang/UnsupportedOperationException;", "Lkotlin/UnsupportedOperationException;", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AssistantSdkAbsentApis {

    @NotNull
    public static final AssistantSdkAbsentApis INSTANCE = new AssistantSdkAbsentApis();

    @NotNull
    public static final String NOT_SUPPORTED_MESSAGE = "Assistant SDK is not yet supported";

    private AssistantSdkAbsentApis() {
    }

    @NotNull
    public final UnsupportedOperationException notSupported() {
        return new UnsupportedOperationException(NOT_SUPPORTED_MESSAGE);
    }
}

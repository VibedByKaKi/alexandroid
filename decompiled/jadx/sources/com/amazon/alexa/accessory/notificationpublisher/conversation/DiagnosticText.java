package com.amazon.alexa.accessory.notificationpublisher.conversation;

import kotlin.Metadata;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/DiagnosticText;", "", "<init>", "()V", "MAX_CODE_LENGTH", "", "MACHINE_CODE", "Lkotlin/text/Regex;", "safeCode", "", "raw", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DiagnosticText {

    @NotNull
    public static final DiagnosticText INSTANCE = new DiagnosticText();

    @NotNull
    private static final Regex MACHINE_CODE = new Regex("[A-Za-z0-9_.\\-]{1,64}");
    private static final int MAX_CODE_LENGTH = 64;

    private DiagnosticText() {
    }

    @NotNull
    public final String safeCode(@Nullable String raw) {
        return raw == null ? "null" : MACHINE_CODE.matches(raw) ? raw : "<unexpected>";
    }
}

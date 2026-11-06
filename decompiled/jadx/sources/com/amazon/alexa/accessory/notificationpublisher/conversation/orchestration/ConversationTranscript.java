package com.amazon.alexa.accessory.notificationpublisher.conversation.orchestration;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u0006\u0010\r\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationTranscript;", "", "<init>", "()V", "lines", "", "", "appendAssistant", "", "text", "appendUser", "append", "role", "rendered", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ConversationTranscript {

    @NotNull
    private final List<String> lines = new ArrayList();

    private final void append(String role, String text) {
        String obj = StringsKt.trim((CharSequence) text).toString();
        if (obj.length() == 0) {
            return;
        }
        this.lines.add(role + ": " + obj);
    }

    public final void appendAssistant(@NotNull String text) {
        text.getClass();
        append("assistant", text);
    }

    public final void appendUser(@NotNull String text) {
        text.getClass();
        append("user", text);
    }

    @NotNull
    public final String rendered() {
        return a$$ExternalSyntheticOutline0.m("[transcript]\n", CollectionsKt.joinToString$default(this.lines, "\n", null, null, null, 62), "\n[/transcript]");
    }
}

package com.amazon.alexa.accessory.speechapi.context;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/context/MessagePayload;", "", "payload", "", "(Ljava/lang/String;)V", "getPayload", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class MessagePayload {

    @NotNull
    private final String payload;

    public MessagePayload(@NotNull String str) {
        str.getClass();
        this.payload = str;
    }

    public static /* synthetic */ MessagePayload copy$default(MessagePayload messagePayload, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messagePayload.payload;
        }
        return messagePayload.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPayload() {
        return this.payload;
    }

    @NotNull
    public final MessagePayload copy(@NotNull String payload) {
        payload.getClass();
        return new MessagePayload(payload);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MessagePayload) && Intrinsics.areEqual(this.payload, ((MessagePayload) other).payload);
    }

    @NotNull
    public final String getPayload() {
        return this.payload;
    }

    public int hashCode() {
        return this.payload.hashCode();
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("MessagePayload(payload=", this.payload, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}

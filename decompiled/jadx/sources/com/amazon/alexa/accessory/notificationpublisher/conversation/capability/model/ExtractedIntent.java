package com.amazon.alexa.accessory.notificationpublisher.conversation.capability.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/capability/model/ExtractedIntent;", "", "capability", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/capability/model/Capability;", "getCapability", "()Lcom/amazon/alexa/accessory/notificationpublisher/conversation/capability/model/Capability;", "TextMessageSending", "Unknown", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/capability/model/ExtractedIntent$TextMessageSending;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/capability/model/ExtractedIntent$Unknown;", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ExtractedIntent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static Capability getCapability(@NotNull ExtractedIntent extractedIntent) {
            if (extractedIntent instanceof TextMessageSending) {
                return Capability.TEXT_MESSAGE_SENDING;
            }
            if (extractedIntent instanceof Unknown) {
                return null;
            }
            PathKt$$ExternalSyntheticBUOutline0.m();
            return null;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/capability/model/ExtractedIntent$TextMessageSending;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/capability/model/ExtractedIntent;", "messageContent", "", "<init>", "(Ljava/lang/String;)V", "getMessageContent", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TextMessageSending implements ExtractedIntent {

        @Nullable
        private final String messageContent;

        public TextMessageSending(@Nullable String str) {
            this.messageContent = str;
        }

        public static /* synthetic */ TextMessageSending copy$default(TextMessageSending textMessageSending, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = textMessageSending.messageContent;
            }
            return textMessageSending.copy(str);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getMessageContent() {
            return this.messageContent;
        }

        @NotNull
        public final TextMessageSending copy(@Nullable String messageContent) {
            return new TextMessageSending(messageContent);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TextMessageSending) && Intrinsics.areEqual(this.messageContent, ((TextMessageSending) other).messageContent);
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.capability.model.ExtractedIntent
        @Nullable
        public Capability getCapability() {
            return DefaultImpls.getCapability(this);
        }

        @Nullable
        public final String getMessageContent() {
            return this.messageContent;
        }

        public int hashCode() {
            String str = this.messageContent;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("TextMessageSending(messageContent=", this.messageContent, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/capability/model/ExtractedIntent$Unknown;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/capability/model/ExtractedIntent;", "type", "", "<init>", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Unknown implements ExtractedIntent {

        @NotNull
        private final String type;

        public Unknown(@NotNull String str) {
            str.getClass();
            this.type = str;
        }

        public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unknown.type;
            }
            return unknown.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final Unknown copy(@NotNull String type) {
            type.getClass();
            return new Unknown(type);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unknown) && Intrinsics.areEqual(this.type, ((Unknown) other).type);
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.capability.model.ExtractedIntent
        @Nullable
        public Capability getCapability() {
            return DefaultImpls.getCapability(this);
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Unknown(type=", this.type, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @Nullable
    Capability getCapability();
}

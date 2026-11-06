package com.amazon.alexa.assistant.ui.conversation.model;

import android.content.Intent;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/model/ConversationBroadcastEvent;", "", "<init>", "()V", "ActivityBackground", "ActivityForeground", "SendNotification", "RaExperienceReady", "RouteFromChat", "VoiceInteractionStart", "VoiceInteractionFinish", "Lcom/amazon/alexa/assistant/ui/conversation/model/ConversationBroadcastEvent$ActivityBackground;", "Lcom/amazon/alexa/assistant/ui/conversation/model/ConversationBroadcastEvent$ActivityForeground;", "Lcom/amazon/alexa/assistant/ui/conversation/model/ConversationBroadcastEvent$RaExperienceReady;", "Lcom/amazon/alexa/assistant/ui/conversation/model/ConversationBroadcastEvent$RouteFromChat;", "Lcom/amazon/alexa/assistant/ui/conversation/model/ConversationBroadcastEvent$SendNotification;", "Lcom/amazon/alexa/assistant/ui/conversation/model/ConversationBroadcastEvent$VoiceInteractionFinish;", "Lcom/amazon/alexa/assistant/ui/conversation/model/ConversationBroadcastEvent$VoiceInteractionStart;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class ConversationBroadcastEvent {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/model/ConversationBroadcastEvent$ActivityBackground;", "Lcom/amazon/alexa/assistant/ui/conversation/model/ConversationBroadcastEvent;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ActivityBackground extends ConversationBroadcastEvent {
        public static final int $stable = 0;

        @NotNull
        public static final ActivityBackground INSTANCE = new ActivityBackground();

        private ActivityBackground() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof ActivityBackground);
        }

        public int hashCode() {
            return -293117663;
        }

        @NotNull
        public String toString() {
            return "ActivityBackground";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/model/ConversationBroadcastEvent$ActivityForeground;", "Lcom/amazon/alexa/assistant/ui/conversation/model/ConversationBroadcastEvent;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ActivityForeground extends ConversationBroadcastEvent {
        public static final int $stable = 0;

        @NotNull
        public static final ActivityForeground INSTANCE = new ActivityForeground();

        private ActivityForeground() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof ActivityForeground);
        }

        public int hashCode() {
            return -1271433930;
        }

        @NotNull
        public String toString() {
            return "ActivityForeground";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/model/ConversationBroadcastEvent$RaExperienceReady;", "Lcom/amazon/alexa/assistant/ui/conversation/model/ConversationBroadcastEvent;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RaExperienceReady extends ConversationBroadcastEvent {
        public static final int $stable = 0;

        @NotNull
        public static final RaExperienceReady INSTANCE = new RaExperienceReady();

        private RaExperienceReady() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof RaExperienceReady);
        }

        public int hashCode() {
            return 1574667302;
        }

        @NotNull
        public String toString() {
            return "RaExperienceReady";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/model/ConversationBroadcastEvent$RouteFromChat;", "Lcom/amazon/alexa/assistant/ui/conversation/model/ConversationBroadcastEvent;", "intent", "Landroid/content/Intent;", "<init>", "(Landroid/content/Intent;)V", "getIntent", "()Landroid/content/Intent;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RouteFromChat extends ConversationBroadcastEvent {
        public static final int $stable = 8;

        @NotNull
        private final Intent intent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RouteFromChat(@NotNull Intent intent) {
            super(null);
            intent.getClass();
            this.intent = intent;
        }

        public static /* synthetic */ RouteFromChat copy$default(RouteFromChat routeFromChat, Intent intent, int i, Object obj) {
            if ((i & 1) != 0) {
                intent = routeFromChat.intent;
            }
            return routeFromChat.copy(intent);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Intent getIntent() {
            return this.intent;
        }

        @NotNull
        public final RouteFromChat copy(@NotNull Intent intent) {
            intent.getClass();
            return new RouteFromChat(intent);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RouteFromChat) && Intrinsics.areEqual(this.intent, ((RouteFromChat) other).intent);
        }

        @NotNull
        public final Intent getIntent() {
            return this.intent;
        }

        public int hashCode() {
            return this.intent.hashCode();
        }

        @NotNull
        public String toString() {
            return "RouteFromChat(intent=" + this.intent + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/model/ConversationBroadcastEvent$SendNotification;", "Lcom/amazon/alexa/assistant/ui/conversation/model/ConversationBroadcastEvent;", "title", "", "text", "conversationId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getText", "getConversationId", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SendNotification extends ConversationBroadcastEvent {
        public static final int $stable = 0;

        @NotNull
        private final String conversationId;

        @NotNull
        private final String text;

        @NotNull
        private final String title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendNotification(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            super(null);
            ParcelCompat$$ExternalSyntheticOutline0.m(str, str2, str3);
            this.title = str;
            this.text = str2;
            this.conversationId = str3;
        }

        public static /* synthetic */ SendNotification copy$default(SendNotification sendNotification, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sendNotification.title;
            }
            if ((i & 2) != 0) {
                str2 = sendNotification.text;
            }
            if ((i & 4) != 0) {
                str3 = sendNotification.conversationId;
            }
            return sendNotification.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final SendNotification copy(@NotNull String title, @NotNull String text, @NotNull String conversationId) {
            title.getClass();
            text.getClass();
            conversationId.getClass();
            return new SendNotification(title, text, conversationId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SendNotification)) {
                return false;
            }
            SendNotification sendNotification = (SendNotification) other;
            return Intrinsics.areEqual(this.title, sendNotification.title) && Intrinsics.areEqual(this.text, sendNotification.text) && Intrinsics.areEqual(this.conversationId, sendNotification.conversationId);
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.conversationId.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.text);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.text;
            return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("SendNotification(title=", str, ", text=", str2, ", conversationId="), this.conversationId, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/model/ConversationBroadcastEvent$VoiceInteractionFinish;", "Lcom/amazon/alexa/assistant/ui/conversation/model/ConversationBroadcastEvent;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class VoiceInteractionFinish extends ConversationBroadcastEvent {
        public static final int $stable = 0;

        @NotNull
        public static final VoiceInteractionFinish INSTANCE = new VoiceInteractionFinish();

        private VoiceInteractionFinish() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof VoiceInteractionFinish);
        }

        public int hashCode() {
            return -720520265;
        }

        @NotNull
        public String toString() {
            return "VoiceInteractionFinish";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/model/ConversationBroadcastEvent$VoiceInteractionStart;", "Lcom/amazon/alexa/assistant/ui/conversation/model/ConversationBroadcastEvent;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class VoiceInteractionStart extends ConversationBroadcastEvent {
        public static final int $stable = 0;

        @NotNull
        public static final VoiceInteractionStart INSTANCE = new VoiceInteractionStart();

        private VoiceInteractionStart() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof VoiceInteractionStart);
        }

        public int hashCode() {
            return 1651646654;
        }

        @NotNull
        public String toString() {
            return "VoiceInteractionStart";
        }
    }

    public /* synthetic */ ConversationBroadcastEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ConversationBroadcastEvent() {
    }
}

package com.amazon.alexa.assistant.ui.conversation.view;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/view/VoiceLaunchResolution;", "", "AlreadyResolved", "ResumeConversation", "Dismiss", "Lcom/amazon/alexa/assistant/ui/conversation/view/VoiceLaunchResolution$AlreadyResolved;", "Lcom/amazon/alexa/assistant/ui/conversation/view/VoiceLaunchResolution$Dismiss;", "Lcom/amazon/alexa/assistant/ui/conversation/view/VoiceLaunchResolution$ResumeConversation;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface VoiceLaunchResolution {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/view/VoiceLaunchResolution$AlreadyResolved;", "Lcom/amazon/alexa/assistant/ui/conversation/view/VoiceLaunchResolution;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AlreadyResolved implements VoiceLaunchResolution {
        public static final int $stable = 0;

        @NotNull
        public static final AlreadyResolved INSTANCE = new AlreadyResolved();

        private AlreadyResolved() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/view/VoiceLaunchResolution$Dismiss;", "Lcom/amazon/alexa/assistant/ui/conversation/view/VoiceLaunchResolution;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Dismiss implements VoiceLaunchResolution {
        public static final int $stable = 0;

        @NotNull
        public static final Dismiss INSTANCE = new Dismiss();

        private Dismiss() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/view/VoiceLaunchResolution$ResumeConversation;", "Lcom/amazon/alexa/assistant/ui/conversation/view/VoiceLaunchResolution;", "route", "", "<init>", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ResumeConversation implements VoiceLaunchResolution {
        public static final int $stable = 0;

        @NotNull
        private final String route;

        public ResumeConversation(@NotNull String str) {
            str.getClass();
            this.route = str;
        }

        public static /* synthetic */ ResumeConversation copy$default(ResumeConversation resumeConversation, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = resumeConversation.route;
            }
            return resumeConversation.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getRoute() {
            return this.route;
        }

        @NotNull
        public final ResumeConversation copy(@NotNull String route) {
            route.getClass();
            return new ResumeConversation(route);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ResumeConversation) && Intrinsics.areEqual(this.route, ((ResumeConversation) other).route);
        }

        @NotNull
        public final String getRoute() {
            return this.route;
        }

        public int hashCode() {
            return this.route.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("ResumeConversation(route=", this.route, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }
}

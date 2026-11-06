package com.amazon.alexa.ra.core.viewmodel;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/viewmodel/ConversationIdentityChange;", "", "Assigned", "Continued", "Restored", "Lcom/amazon/alexa/ra/core/viewmodel/ConversationIdentityChange$Assigned;", "Lcom/amazon/alexa/ra/core/viewmodel/ConversationIdentityChange$Continued;", "Lcom/amazon/alexa/ra/core/viewmodel/ConversationIdentityChange$Restored;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes18.dex */
public interface ConversationIdentityChange {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/ra/core/viewmodel/ConversationIdentityChange$Assigned;", "Lcom/amazon/alexa/ra/core/viewmodel/ConversationIdentityChange;", "from", "", TypedValues.TransitionType.S_TO, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFrom", "()Ljava/lang/String;", "getTo", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Assigned implements ConversationIdentityChange {
        public static final int $stable = 0;

        @NotNull
        private final String from;

        @NotNull
        private final String to;

        public Assigned(@NotNull String str, @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.from = str;
            this.to = str2;
        }

        public static /* synthetic */ Assigned copy$default(Assigned assigned, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = assigned.from;
            }
            if ((i & 2) != 0) {
                str2 = assigned.to;
            }
            return assigned.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getFrom() {
            return this.from;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTo() {
            return this.to;
        }

        @NotNull
        public final Assigned copy(@NotNull String from, @NotNull String to) {
            from.getClass();
            to.getClass();
            return new Assigned(from, to);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Assigned)) {
                return false;
            }
            Assigned assigned = (Assigned) other;
            return Intrinsics.areEqual(this.from, assigned.from) && Intrinsics.areEqual(this.to, assigned.to);
        }

        @NotNull
        public final String getFrom() {
            return this.from;
        }

        @NotNull
        public final String getTo() {
            return this.to;
        }

        public int hashCode() {
            return this.to.hashCode() + (this.from.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Assigned(from=", this.from, ", to=", this.to, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/ra/core/viewmodel/ConversationIdentityChange$Continued;", "Lcom/amazon/alexa/ra/core/viewmodel/ConversationIdentityChange;", "conversationId", "", "<init>", "(Ljava/lang/String;)V", "getConversationId", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Continued implements ConversationIdentityChange {
        public static final int $stable = 0;

        @NotNull
        private final String conversationId;

        public Continued(@NotNull String str) {
            str.getClass();
            this.conversationId = str;
        }

        public static /* synthetic */ Continued copy$default(Continued continued, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = continued.conversationId;
            }
            return continued.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final Continued copy(@NotNull String conversationId) {
            conversationId.getClass();
            return new Continued(conversationId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Continued) && Intrinsics.areEqual(this.conversationId, ((Continued) other).conversationId);
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        public int hashCode() {
            return this.conversationId.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Continued(conversationId=", this.conversationId, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/ra/core/viewmodel/ConversationIdentityChange$Restored;", "Lcom/amazon/alexa/ra/core/viewmodel/ConversationIdentityChange;", "conversationId", "", "<init>", "(Ljava/lang/String;)V", "getConversationId", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Restored implements ConversationIdentityChange {
        public static final int $stable = 0;

        @NotNull
        private final String conversationId;

        public Restored(@NotNull String str) {
            str.getClass();
            this.conversationId = str;
        }

        public static /* synthetic */ Restored copy$default(Restored restored, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = restored.conversationId;
            }
            return restored.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final Restored copy(@NotNull String conversationId) {
            conversationId.getClass();
            return new Restored(conversationId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Restored) && Intrinsics.areEqual(this.conversationId, ((Restored) other).conversationId);
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        public int hashCode() {
            return this.conversationId.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Restored(conversationId=", this.conversationId, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }
}

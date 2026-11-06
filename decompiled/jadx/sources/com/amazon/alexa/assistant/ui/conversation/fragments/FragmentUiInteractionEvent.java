package com.amazon.alexa.assistant.ui.conversation.fragments;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.coral.profiler.ProfilerCategory;
import com.reactcommunity.rndatetimepicker.Common;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentUiInteractionEvent;", "", "<init>", "()V", "Copy", "Share", "LongPress", "Feedback", ProfilerCategory.OTHER, "Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentUiInteractionEvent$Copy;", "Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentUiInteractionEvent$Feedback;", "Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentUiInteractionEvent$LongPress;", "Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentUiInteractionEvent$Other;", "Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentUiInteractionEvent$Share;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class FragmentUiInteractionEvent {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentUiInteractionEvent$Copy;", "Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentUiInteractionEvent;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Copy extends FragmentUiInteractionEvent {
        public static final int $stable = 0;

        @NotNull
        private final String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Copy(@NotNull String str) {
            super(null);
            str.getClass();
            this.text = str;
        }

        public static /* synthetic */ Copy copy$default(Copy copy, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = copy.text;
            }
            return copy.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final Copy copy(@NotNull String text) {
            text.getClass();
            return new Copy(text);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Copy) && Intrinsics.areEqual(this.text, ((Copy) other).text);
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Copy(text=", this.text, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentUiInteractionEvent$Feedback;", "Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentUiInteractionEvent;", Common.POSITIVE, "", "<init>", "(Z)V", "getPositive", "()Z", "component1", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Feedback extends FragmentUiInteractionEvent {
        public static final int $stable = 0;
        private final boolean positive;

        public Feedback(boolean z) {
            super(null);
            this.positive = z;
        }

        public static /* synthetic */ Feedback copy$default(Feedback feedback, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = feedback.positive;
            }
            return feedback.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getPositive() {
            return this.positive;
        }

        @NotNull
        public final Feedback copy(boolean positive) {
            return new Feedback(positive);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Feedback) && this.positive == ((Feedback) other).positive;
        }

        public final boolean getPositive() {
            return this.positive;
        }

        public int hashCode() {
            return Boolean.hashCode(this.positive);
        }

        @NotNull
        public String toString() {
            return Automotive$$ExternalSyntheticOutline0.m("Feedback(positive=", MarkdownConstants.RIGHT_PARENTHESIS, this.positive);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentUiInteractionEvent$LongPress;", "Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentUiInteractionEvent;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LongPress extends FragmentUiInteractionEvent {
        public static final int $stable = 0;

        @NotNull
        public static final LongPress INSTANCE = new LongPress();

        private LongPress() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentUiInteractionEvent$Other;", "Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentUiInteractionEvent;", "rawName", "", "<init>", "(Ljava/lang/String;)V", "getRawName", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Other extends FragmentUiInteractionEvent {
        public static final int $stable = 0;

        @NotNull
        private final String rawName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Other(@NotNull String str) {
            super(null);
            str.getClass();
            this.rawName = str;
        }

        public static /* synthetic */ Other copy$default(Other other, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = other.rawName;
            }
            return other.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getRawName() {
            return this.rawName;
        }

        @NotNull
        public final Other copy(@NotNull String rawName) {
            rawName.getClass();
            return new Other(rawName);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Other) && Intrinsics.areEqual(this.rawName, ((Other) other).rawName);
        }

        @NotNull
        public final String getRawName() {
            return this.rawName;
        }

        public int hashCode() {
            return this.rawName.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Other(rawName=", this.rawName, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentUiInteractionEvent$Share;", "Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentUiInteractionEvent;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Share extends FragmentUiInteractionEvent {
        public static final int $stable = 0;

        @NotNull
        public static final Share INSTANCE = new Share();

        private Share() {
            super(null);
        }
    }

    public /* synthetic */ FragmentUiInteractionEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private FragmentUiInteractionEvent() {
    }
}

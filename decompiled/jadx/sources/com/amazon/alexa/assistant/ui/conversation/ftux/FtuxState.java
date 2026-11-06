package com.amazon.alexa.assistant.ui.conversation.ftux;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/ftux/FtuxState;", "", "<init>", "()V", "NotStarted", "InProgress", "Completed", "Dismissed", "Lcom/amazon/alexa/assistant/ui/conversation/ftux/FtuxState$Completed;", "Lcom/amazon/alexa/assistant/ui/conversation/ftux/FtuxState$Dismissed;", "Lcom/amazon/alexa/assistant/ui/conversation/ftux/FtuxState$InProgress;", "Lcom/amazon/alexa/assistant/ui/conversation/ftux/FtuxState$NotStarted;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class FtuxState {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/ftux/FtuxState$Completed;", "Lcom/amazon/alexa/assistant/ui/conversation/ftux/FtuxState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Completed extends FtuxState {
        public static final int $stable = 0;

        @NotNull
        public static final Completed INSTANCE = new Completed();

        private Completed() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Completed);
        }

        public int hashCode() {
            return 439684489;
        }

        @NotNull
        public String toString() {
            return "Completed";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/ftux/FtuxState$Dismissed;", "Lcom/amazon/alexa/assistant/ui/conversation/ftux/FtuxState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Dismissed extends FtuxState {
        public static final int $stable = 0;

        @NotNull
        public static final Dismissed INSTANCE = new Dismissed();

        private Dismissed() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Dismissed);
        }

        public int hashCode() {
            return 2002082791;
        }

        @NotNull
        public String toString() {
            return "Dismissed";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/ftux/FtuxState$InProgress;", "Lcom/amazon/alexa/assistant/ui/conversation/ftux/FtuxState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InProgress extends FtuxState {
        public static final int $stable = 0;

        @NotNull
        public static final InProgress INSTANCE = new InProgress();

        private InProgress() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof InProgress);
        }

        public int hashCode() {
            return -60485900;
        }

        @NotNull
        public String toString() {
            return "InProgress";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/ftux/FtuxState$NotStarted;", "Lcom/amazon/alexa/assistant/ui/conversation/ftux/FtuxState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NotStarted extends FtuxState {
        public static final int $stable = 0;

        @NotNull
        public static final NotStarted INSTANCE = new NotStarted();

        private NotStarted() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof NotStarted);
        }

        public int hashCode() {
            return -1844069712;
        }

        @NotNull
        public String toString() {
            return "NotStarted";
        }
    }

    public /* synthetic */ FtuxState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private FtuxState() {
    }
}

package com.amazon.alexa.assistant.foundation.textstate.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/textstate/model/TextState;", "", "<init>", "()V", "Idle", "Processing", "Lcom/amazon/alexa/assistant/foundation/textstate/model/TextState$Idle;", "Lcom/amazon/alexa/assistant/foundation/textstate/model/TextState$Processing;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class TextState {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/textstate/model/TextState$Idle;", "Lcom/amazon/alexa/assistant/foundation/textstate/model/TextState;", "<init>", "()V", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Idle extends TextState {

        @NotNull
        public static final Idle INSTANCE = new Idle();

        private Idle() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "TextState.Idle";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\u0003H\u0016J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/textstate/model/TextState$Processing;", "Lcom/amazon/alexa/assistant/foundation/textstate/model/TextState;", "dialogRequestId", "", "<init>", "(Ljava/lang/String;)V", "getDialogRequestId", "()Ljava/lang/String;", "toString", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Processing extends TextState {

        @NotNull
        private final String dialogRequestId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Processing(@NotNull String str) {
            super(null);
            str.getClass();
            this.dialogRequestId = str;
        }

        public static /* synthetic */ Processing copy$default(Processing processing, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = processing.dialogRequestId;
            }
            return processing.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getDialogRequestId() {
            return this.dialogRequestId;
        }

        @NotNull
        public final Processing copy(@NotNull String dialogRequestId) {
            dialogRequestId.getClass();
            return new Processing(dialogRequestId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Processing) && Intrinsics.areEqual(this.dialogRequestId, ((Processing) other).dialogRequestId);
        }

        @NotNull
        public final String getDialogRequestId() {
            return this.dialogRequestId;
        }

        public int hashCode() {
            return this.dialogRequestId.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("TextState.Processing(dialogRequestId=", this.dialogRequestId, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public /* synthetic */ TextState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TextState() {
    }
}

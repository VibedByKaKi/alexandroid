package com.amazon.alexa.assistant.foundation.textstate.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/textstate/model/TextRequestEvent;", "", "<init>", "()V", "Started", "Stopped", "Lcom/amazon/alexa/assistant/foundation/textstate/model/TextRequestEvent$Started;", "Lcom/amazon/alexa/assistant/foundation/textstate/model/TextRequestEvent$Stopped;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class TextRequestEvent {
    public /* synthetic */ TextRequestEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TextRequestEvent() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/textstate/model/TextRequestEvent$Stopped;", "Lcom/amazon/alexa/assistant/foundation/textstate/model/TextRequestEvent;", "dialogRequestId", "", "error", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getDialogRequestId", "()Ljava/lang/String;", "getError", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Stopped extends TextRequestEvent {

        @NotNull
        private final String dialogRequestId;

        @Nullable
        private final Throwable error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Stopped(@NotNull String str, @Nullable Throwable th) {
            super(null);
            str.getClass();
            this.dialogRequestId = str;
            this.error = th;
        }

        public static /* synthetic */ Stopped copy$default(Stopped stopped, String str, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stopped.dialogRequestId;
            }
            if ((i & 2) != 0) {
                th = stopped.error;
            }
            return stopped.copy(str, th);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getDialogRequestId() {
            return this.dialogRequestId;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        @NotNull
        public final Stopped copy(@NotNull String dialogRequestId, @Nullable Throwable error) {
            dialogRequestId.getClass();
            return new Stopped(dialogRequestId, error);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Stopped)) {
                return false;
            }
            Stopped stopped = (Stopped) other;
            return Intrinsics.areEqual(this.dialogRequestId, stopped.dialogRequestId) && Intrinsics.areEqual(this.error, stopped.error);
        }

        @NotNull
        public final String getDialogRequestId() {
            return this.dialogRequestId;
        }

        @Nullable
        public final Throwable getError() {
            return this.error;
        }

        public int hashCode() {
            int hashCode = this.dialogRequestId.hashCode() * 31;
            Throwable th = this.error;
            return hashCode + (th == null ? 0 : th.hashCode());
        }

        @NotNull
        public String toString() {
            return "Stopped(dialogRequestId=" + this.dialogRequestId + ", error=" + this.error + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        public /* synthetic */ Stopped(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/textstate/model/TextRequestEvent$Started;", "Lcom/amazon/alexa/assistant/foundation/textstate/model/TextRequestEvent;", "dialogRequestId", "", "onCancellation", "Lkotlin/Function0;", "", "onTimeout", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getDialogRequestId", "()Ljava/lang/String;", "getOnCancellation", "()Lkotlin/jvm/functions/Function0;", "getOnTimeout", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Started extends TextRequestEvent {

        @NotNull
        private final String dialogRequestId;

        @Nullable
        private final Function0<Unit> onCancellation;

        @Nullable
        private final Function0<Unit> onTimeout;

        public /* synthetic */ Started(String str, Function0 function0, Function0 function02, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : function0, (i & 4) != 0 ? null : function02);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Started copy$default(Started started, String str, Function0 function0, Function0 function02, int i, Object obj) {
            if ((i & 1) != 0) {
                str = started.dialogRequestId;
            }
            if ((i & 2) != 0) {
                function0 = started.onCancellation;
            }
            if ((i & 4) != 0) {
                function02 = started.onTimeout;
            }
            return started.copy(str, function0, function02);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getDialogRequestId() {
            return this.dialogRequestId;
        }

        @Nullable
        public final Function0<Unit> component2() {
            return this.onCancellation;
        }

        @Nullable
        public final Function0<Unit> component3() {
            return this.onTimeout;
        }

        @NotNull
        public final Started copy(@NotNull String dialogRequestId, @Nullable Function0<Unit> onCancellation, @Nullable Function0<Unit> onTimeout) {
            dialogRequestId.getClass();
            return new Started(dialogRequestId, onCancellation, onTimeout);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Started)) {
                return false;
            }
            Started started = (Started) other;
            return Intrinsics.areEqual(this.dialogRequestId, started.dialogRequestId) && Intrinsics.areEqual(this.onCancellation, started.onCancellation) && Intrinsics.areEqual(this.onTimeout, started.onTimeout);
        }

        @NotNull
        public final String getDialogRequestId() {
            return this.dialogRequestId;
        }

        @Nullable
        public final Function0<Unit> getOnCancellation() {
            return this.onCancellation;
        }

        @Nullable
        public final Function0<Unit> getOnTimeout() {
            return this.onTimeout;
        }

        public int hashCode() {
            int hashCode = this.dialogRequestId.hashCode() * 31;
            Function0<Unit> function0 = this.onCancellation;
            int hashCode2 = (hashCode + (function0 == null ? 0 : function0.hashCode())) * 31;
            Function0<Unit> function02 = this.onTimeout;
            return hashCode2 + (function02 != null ? function02.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Started(dialogRequestId=" + this.dialogRequestId + ", onCancellation=" + this.onCancellation + ", onTimeout=" + this.onTimeout + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Started(@NotNull String str, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02) {
            super(null);
            str.getClass();
            this.dialogRequestId = str;
            this.onCancellation = function0;
            this.onTimeout = function02;
        }
    }
}

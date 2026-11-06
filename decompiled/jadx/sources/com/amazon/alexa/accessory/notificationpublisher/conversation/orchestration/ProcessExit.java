package com.amazon.alexa.accessory.notificationpublisher.conversation.orchestration;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ProcessExit;", "", "crashed", "", "label", "", "<init>", "(ZLjava/lang/String;)V", "getCrashed", "()Z", "getLabel", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Companion", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ProcessExit {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ProcessExit UNKNOWN = new ProcessExit(false, "unknown");
    private final boolean crashed;

    @NotNull
    private final String label;

    public ProcessExit(boolean z, @NotNull String str) {
        str.getClass();
        this.crashed = z;
        this.label = str;
    }

    public static /* synthetic */ ProcessExit copy$default(ProcessExit processExit, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = processExit.crashed;
        }
        if ((i & 2) != 0) {
            str = processExit.label;
        }
        return processExit.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getCrashed() {
        return this.crashed;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final ProcessExit copy(boolean crashed, @NotNull String label) {
        label.getClass();
        return new ProcessExit(crashed, label);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProcessExit)) {
            return false;
        }
        ProcessExit processExit = (ProcessExit) other;
        return this.crashed == processExit.crashed && Intrinsics.areEqual(this.label, processExit.label);
    }

    public final boolean getCrashed() {
        return this.crashed;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return this.label.hashCode() + (Boolean.hashCode(this.crashed) * 31);
    }

    @NotNull
    public String toString() {
        return "ProcessExit(crashed=" + this.crashed + ", label=" + this.label + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ProcessExit$Companion;", "", "<init>", "()V", "UNKNOWN", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ProcessExit;", "getUNKNOWN", "()Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ProcessExit;", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ProcessExit getUNKNOWN() {
            return ProcessExit.UNKNOWN;
        }

        private Companion() {
        }
    }
}

package com.amazon.alexa.assistant.ui.conversation.ftux;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/ftux/FtuxDecision;", "", "show", "", "path", "Lcom/amazon/alexa/assistant/ui/conversation/ftux/FtuxPath;", "<init>", "(ZLcom/amazon/alexa/assistant/ui/conversation/ftux/FtuxPath;)V", "getShow", "()Z", "getPath", "()Lcom/amazon/alexa/assistant/ui/conversation/ftux/FtuxPath;", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FtuxDecision {
    public static final int $stable = 0;

    @NotNull
    private final FtuxPath path;
    private final boolean show;

    public FtuxDecision(boolean z, @NotNull FtuxPath ftuxPath) {
        ftuxPath.getClass();
        this.show = z;
        this.path = ftuxPath;
    }

    public static /* synthetic */ FtuxDecision copy$default(FtuxDecision ftuxDecision, boolean z, FtuxPath ftuxPath, int i, Object obj) {
        if ((i & 1) != 0) {
            z = ftuxDecision.show;
        }
        if ((i & 2) != 0) {
            ftuxPath = ftuxDecision.path;
        }
        return ftuxDecision.copy(z, ftuxPath);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShow() {
        return this.show;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final FtuxPath getPath() {
        return this.path;
    }

    @NotNull
    public final FtuxDecision copy(boolean show, @NotNull FtuxPath path) {
        path.getClass();
        return new FtuxDecision(show, path);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FtuxDecision)) {
            return false;
        }
        FtuxDecision ftuxDecision = (FtuxDecision) other;
        return this.show == ftuxDecision.show && this.path == ftuxDecision.path;
    }

    @NotNull
    public final FtuxPath getPath() {
        return this.path;
    }

    public final boolean getShow() {
        return this.show;
    }

    public int hashCode() {
        return this.path.hashCode() + (Boolean.hashCode(this.show) * 31);
    }

    @NotNull
    public String toString() {
        return "FtuxDecision(show=" + this.show + ", path=" + this.path + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ FtuxDecision(boolean z, FtuxPath ftuxPath, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? FtuxPath.NET_NEW : ftuxPath);
    }
}

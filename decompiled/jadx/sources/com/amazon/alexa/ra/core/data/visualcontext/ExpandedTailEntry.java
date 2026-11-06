package com.amazon.alexa.ra.core.data.visualcontext;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.model.VisualContextElementInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/ra/core/data/visualcontext/ExpandedTailEntry;", "", "viewId", "", "attachmentToken", "element", "Lcom/amazon/alexa/ra/core/data/model/VisualContextElementInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/ra/core/data/model/VisualContextElementInfo;)V", "getViewId", "()Ljava/lang/String;", "getAttachmentToken", "getElement", "()Lcom/amazon/alexa/ra/core/data/model/VisualContextElementInfo;", "json", "getJson", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ExpandedTailEntry {
    public static final int $stable = 8;

    @NotNull
    private final String attachmentToken;

    @NotNull
    private final VisualContextElementInfo element;

    @NotNull
    private final String json;

    @NotNull
    private final String viewId;

    public ExpandedTailEntry(@NotNull String str, @NotNull String str2, @NotNull VisualContextElementInfo visualContextElementInfo) {
        str.getClass();
        str2.getClass();
        visualContextElementInfo.getClass();
        this.viewId = str;
        this.attachmentToken = str2;
        this.element = visualContextElementInfo;
        this.json = visualContextElementInfo.toJSON();
    }

    @NotNull
    public final String getAttachmentToken() {
        return this.attachmentToken;
    }

    @NotNull
    public final VisualContextElementInfo getElement() {
        return this.element;
    }

    @NotNull
    public final String getJson() {
        return this.json;
    }

    @NotNull
    public final String getViewId() {
        return this.viewId;
    }
}

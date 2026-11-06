package com.amazon.rtvi.mobile.orchestrator;

import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/amazon/rtvi/mobile/orchestrator/FrameKey;", "", LiveTranslationCapabilityConstants.KEY_SESSION_ID, "", "frameId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSessionId", "()Ljava/lang/String;", "getFrameId", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Orchestrator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* data */ class FrameKey {

    @NotNull
    private final String frameId;

    @NotNull
    private final String sessionId;

    public FrameKey(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.sessionId = str;
        this.frameId = str2;
    }

    public static /* synthetic */ FrameKey copy$default(FrameKey frameKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = frameKey.sessionId;
        }
        if ((i & 2) != 0) {
            str2 = frameKey.frameId;
        }
        return frameKey.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFrameId() {
        return this.frameId;
    }

    @NotNull
    public final FrameKey copy(@NotNull String sessionId, @NotNull String frameId) {
        sessionId.getClass();
        frameId.getClass();
        return new FrameKey(sessionId, frameId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FrameKey)) {
            return false;
        }
        FrameKey frameKey = (FrameKey) other;
        return Intrinsics.areEqual(this.sessionId, frameKey.sessionId) && Intrinsics.areEqual(this.frameId, frameKey.frameId);
    }

    @NotNull
    public final String getFrameId() {
        return this.frameId;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return this.frameId.hashCode() + (this.sessionId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("FrameKey(sessionId=", this.sessionId, ", frameId=", this.frameId, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}

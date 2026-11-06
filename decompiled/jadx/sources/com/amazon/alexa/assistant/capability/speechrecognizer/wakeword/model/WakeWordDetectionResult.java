package com.amazon.alexa.assistant.capability.speechrecognizer.wakeword.model;

import com.amazon.alexa.assistant.foundation.model.WakeWord;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordDetectionResult;", "", "wakeWord", "Lcom/amazon/alexa/assistant/foundation/model/WakeWord;", "wakeWordMetadata", "", "<init>", "(Lcom/amazon/alexa/assistant/foundation/model/WakeWord;[B)V", "getWakeWord", "()Lcom/amazon/alexa/assistant/foundation/model/WakeWord;", "getWakeWordMetadata", "()[B", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "component1", "component2", "copy", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class WakeWordDetectionResult {

    @NotNull
    private final WakeWord wakeWord;

    @Nullable
    private final byte[] wakeWordMetadata;

    public WakeWordDetectionResult(@NotNull WakeWord wakeWord, @Nullable byte[] bArr) {
        wakeWord.getClass();
        this.wakeWord = wakeWord;
        this.wakeWordMetadata = bArr;
    }

    public static /* synthetic */ WakeWordDetectionResult copy$default(WakeWordDetectionResult wakeWordDetectionResult, WakeWord wakeWord, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            wakeWord = wakeWordDetectionResult.wakeWord;
        }
        if ((i & 2) != 0) {
            bArr = wakeWordDetectionResult.wakeWordMetadata;
        }
        return wakeWordDetectionResult.copy(wakeWord, bArr);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final WakeWord getWakeWord() {
        return this.wakeWord;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final byte[] getWakeWordMetadata() {
        return this.wakeWordMetadata;
    }

    @NotNull
    public final WakeWordDetectionResult copy(@NotNull WakeWord wakeWord, @Nullable byte[] wakeWordMetadata) {
        wakeWord.getClass();
        return new WakeWordDetectionResult(wakeWord, wakeWordMetadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WakeWordDetectionResult)) {
            return false;
        }
        WakeWordDetectionResult wakeWordDetectionResult = (WakeWordDetectionResult) other;
        if (!Intrinsics.areEqual(this.wakeWord, wakeWordDetectionResult.wakeWord)) {
            return false;
        }
        byte[] bArr = this.wakeWordMetadata;
        byte[] bArr2 = wakeWordDetectionResult.wakeWordMetadata;
        if (bArr != null) {
            if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (bArr2 != null) {
            return false;
        }
        return true;
    }

    @NotNull
    public final WakeWord getWakeWord() {
        return this.wakeWord;
    }

    @Nullable
    public final byte[] getWakeWordMetadata() {
        return this.wakeWordMetadata;
    }

    public int hashCode() {
        int hashCode = this.wakeWord.hashCode() * 31;
        byte[] bArr = this.wakeWordMetadata;
        return hashCode + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    @NotNull
    public String toString() {
        return "WakeWordDetectionResult(wakeWord=" + this.wakeWord + ", wakeWordMetadata=" + Arrays.toString(this.wakeWordMetadata) + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ WakeWordDetectionResult(WakeWord wakeWord, byte[] bArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wakeWord, (i & 2) != 0 ? null : bArr);
    }
}

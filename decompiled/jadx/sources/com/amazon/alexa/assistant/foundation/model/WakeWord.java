package com.amazon.alexa.assistant.foundation.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.smarthomecameras.routing.CamerasRouteParameter;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/WakeWord;", "", "identifier", "", CamerasRouteParameter.DISPLAY_NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "getDisplayName", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "component1", "component2", "copy", "toString", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class WakeWord {

    @NotNull
    private final String displayName;

    @NotNull
    private final String identifier;

    public WakeWord(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.identifier = str;
        this.displayName = str2;
    }

    public static /* synthetic */ WakeWord copy$default(WakeWord wakeWord, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wakeWord.identifier;
        }
        if ((i & 2) != 0) {
            str2 = wakeWord.displayName;
        }
        return wakeWord.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final WakeWord copy(@NotNull String identifier, @NotNull String displayName) {
        identifier.getClass();
        displayName.getClass();
        return new WakeWord(identifier, displayName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof WakeWord) {
            return Intrinsics.areEqual(this.identifier, ((WakeWord) other).identifier);
        }
        return false;
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final String getIdentifier() {
        return this.identifier;
    }

    public int hashCode() {
        return this.identifier.hashCode();
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("WakeWord(identifier=", this.identifier, ", displayName=", this.displayName, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}

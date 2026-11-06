package com.amazon.scxml.internal;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/amazon/scxml/internal/Invocation;", "Lcom/amazon/scxml/internal/Executable;", "type", "", "src", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getSrc", "execute", "", "machine", "Lcom/amazon/scxml/internal/SCXMLStateMachineExecutor;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class Invocation implements Executable {

    @NotNull
    private final String src;

    @NotNull
    private final String type;

    public Invocation(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.type = str;
        this.src = str2;
    }

    public static /* synthetic */ Invocation copy$default(Invocation invocation, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = invocation.type;
        }
        if ((i & 2) != 0) {
            str2 = invocation.src;
        }
        return invocation.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSrc() {
        return this.src;
    }

    @NotNull
    public final Invocation copy(@NotNull String type, @NotNull String src) {
        type.getClass();
        src.getClass();
        return new Invocation(type, src);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Invocation)) {
            return false;
        }
        Invocation invocation = (Invocation) other;
        return Intrinsics.areEqual(this.type, invocation.type) && Intrinsics.areEqual(this.src, invocation.src);
    }

    @Override // com.amazon.scxml.internal.Executable
    public void execute(@NotNull SCXMLStateMachineExecutor machine) {
        machine.getClass();
        machine.execute(this);
    }

    @NotNull
    public final String getSrc() {
        return this.src;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.src.hashCode() + (this.type.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("Invocation(type=", this.type, ", src=", this.src, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}

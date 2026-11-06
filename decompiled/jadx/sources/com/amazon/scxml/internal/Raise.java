package com.amazon.scxml.internal;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/amazon/scxml/internal/Raise;", "Lcom/amazon/scxml/internal/Executable;", "event", "", "<init>", "(Ljava/lang/String;)V", "getEvent", "()Ljava/lang/String;", "execute", "", "machine", "Lcom/amazon/scxml/internal/SCXMLStateMachineExecutor;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class Raise implements Executable {

    @NotNull
    private final String event;

    public Raise(@NotNull String str) {
        str.getClass();
        this.event = str;
    }

    public static /* synthetic */ Raise copy$default(Raise raise, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = raise.event;
        }
        return raise.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEvent() {
        return this.event;
    }

    @NotNull
    public final Raise copy(@NotNull String event) {
        event.getClass();
        return new Raise(event);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Raise) && Intrinsics.areEqual(this.event, ((Raise) other).event);
    }

    @Override // com.amazon.scxml.internal.Executable
    public void execute(@NotNull SCXMLStateMachineExecutor machine) {
        machine.getClass();
        machine.execute(this);
    }

    @NotNull
    public final String getEvent() {
        return this.event;
    }

    public int hashCode() {
        return this.event.hashCode();
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("Raise(event=", this.event, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}

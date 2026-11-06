package com.amazon.scxml.internal;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/amazon/scxml/internal/Cancel;", "Lcom/amazon/scxml/internal/Executable;", "sendId", "", "<init>", "(Ljava/lang/String;)V", "getSendId", "()Ljava/lang/String;", "execute", "", "machine", "Lcom/amazon/scxml/internal/SCXMLStateMachineExecutor;", "toString", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class Cancel implements Executable {

    @NotNull
    private final String sendId;

    public Cancel(@NotNull String str) {
        str.getClass();
        this.sendId = str;
    }

    @Override // com.amazon.scxml.internal.Executable
    public void execute(@NotNull SCXMLStateMachineExecutor machine) {
        machine.getClass();
        machine.execute(this);
    }

    @NotNull
    public final String getSendId() {
        return this.sendId;
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("Cancel(", this.sendId, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}

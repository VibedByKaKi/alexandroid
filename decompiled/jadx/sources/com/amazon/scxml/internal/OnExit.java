package com.amazon.scxml.internal;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.scxml.logging.Loggable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/amazon/scxml/internal/OnExit;", "Lcom/amazon/scxml/logging/Loggable;", "executables", "", "Lcom/amazon/scxml/internal/Executable;", "<init>", "(Ljava/util/List;)V", "sourceState", "Lcom/amazon/scxml/internal/State;", "getSourceState", "()Lcom/amazon/scxml/internal/State;", "setSourceState", "(Lcom/amazon/scxml/internal/State;)V", "execute", "", "machine", "Lcom/amazon/scxml/internal/SCXMLStateMachineExecutor;", "toString", "", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class OnExit extends Loggable {

    @NotNull
    private final List<Executable> executables;

    @Nullable
    private State sourceState;

    /* JADX WARN: Multi-variable type inference failed */
    public OnExit(@NotNull List<? extends Executable> list) {
        list.getClass();
        this.executables = list;
    }

    public final void execute(@NotNull SCXMLStateMachineExecutor machine) {
        machine.getClass();
        Object obj = this.sourceState;
        if (obj == null) {
            obj = "?";
        }
        String valueOf = String.valueOf(obj);
        Loggable.INSTANCE.getLog().i(getTAG(), "SCXML:execute " + valueOf + ".ON_EXIT");
        Iterator<Executable> it2 = this.executables.iterator();
        while (it2.hasNext()) {
            it2.next().execute(machine);
        }
        Loggable.INSTANCE.getLog().i(getTAG(), "SCXML:execute " + valueOf + ".ON_EXIT DONE");
    }

    @Nullable
    public final State getSourceState() {
        return this.sourceState;
    }

    public final void setSourceState(@Nullable State state) {
        this.sourceState = state;
    }

    @NotNull
    public String toString() {
        return "OnExit(sourceState=[" + this.sourceState + "], executables=" + this.executables + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}

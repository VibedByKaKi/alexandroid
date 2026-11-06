package com.amazon.alexa.ra.rtvi;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\nJ\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/ra/rtvi/OrchestratorGate;", "", "whenReady", "", "onReady", "Lkotlin/Function0;", "setExpectVisualContext", "expected", "", "release", "NoOp", "ui-rtvi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface OrchestratorGate {
    void release();

    void setExpectVisualContext(boolean expected);

    void whenReady(@NotNull Function0<Unit> onReady);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/ra/rtvi/OrchestratorGate$NoOp;", "Lcom/amazon/alexa/ra/rtvi/OrchestratorGate;", "<init>", "()V", "whenReady", "", "onReady", "Lkotlin/Function0;", "setExpectVisualContext", "expected", "", "release", "ui-rtvi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoOp implements OrchestratorGate {

        @NotNull
        public static final NoOp INSTANCE = new NoOp();

        private NoOp() {
        }

        @Override // com.amazon.alexa.ra.rtvi.OrchestratorGate
        public void whenReady(@NotNull Function0<Unit> onReady) {
            onReady.getClass();
            onReady.invoke();
        }

        @Override // com.amazon.alexa.ra.rtvi.OrchestratorGate
        public void release() {
        }

        @Override // com.amazon.alexa.ra.rtvi.OrchestratorGate
        public void setExpectVisualContext(boolean expected) {
        }
    }
}

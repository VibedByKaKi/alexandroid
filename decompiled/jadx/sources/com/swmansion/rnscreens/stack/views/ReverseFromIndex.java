package com.swmansion.rnscreens.stack.views;

import com.amazon.alexa.apl.handler.event.LoadIndexListDataEventHandler;
import com.swmansion.rnscreens.ScreenStack;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\b\u0012\u00060\fR\u00020\r0\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/swmansion/rnscreens/stack/views/ReverseFromIndex;", "Lcom/swmansion/rnscreens/stack/views/ChildrenDrawingOrderStrategyBase;", LoadIndexListDataEventHandler.START_INDEX_KEY, "", "<init>", "(I)V", "getStartIndex", "()I", "apply", "", "drawingOperations", "", "Lcom/swmansion/rnscreens/ScreenStack$DrawingOp;", "Lcom/swmansion/rnscreens/ScreenStack;", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ReverseFromIndex extends ChildrenDrawingOrderStrategyBase {
    private final int startIndex;

    public ReverseFromIndex(int i) {
        super(false, 1, null);
        this.startIndex = i;
    }

    @Override // com.swmansion.rnscreens.stack.views.ChildrenDrawingOrderStrategy
    public void apply(@NotNull List<ScreenStack.DrawingOp> drawingOperations) {
        drawingOperations.getClass();
        if (isEnabled()) {
            int i = this.startIndex;
            for (int lastIndex = CollectionsKt.getLastIndex(drawingOperations); i < lastIndex; lastIndex--) {
                Collections.swap(drawingOperations, i, lastIndex);
                i++;
            }
        }
    }

    public final int getStartIndex() {
        return this.startIndex;
    }
}

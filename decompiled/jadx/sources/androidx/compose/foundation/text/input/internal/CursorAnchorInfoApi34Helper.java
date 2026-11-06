package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@RequiresApi(34)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text/input/internal/CursorAnchorInfoApi34Helper;", "", "()V", "addVisibleLineBounds", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "innerTextFieldBounds", "Landroidx/compose/ui/geometry/Rect;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CursorAnchorInfoApi34Helper {
    public static final int $stable = 0;

    @NotNull
    public static final CursorAnchorInfoApi34Helper INSTANCE = new CursorAnchorInfoApi34Helper();

    private CursorAnchorInfoApi34Helper() {
    }

    @JvmStatic
    @DoNotInline
    @NotNull
    public static final CursorAnchorInfo.Builder addVisibleLineBounds(@NotNull CursorAnchorInfo.Builder builder, @NotNull TextLayoutResult textLayoutResult, @NotNull Rect innerTextFieldBounds) {
        int lineForVerticalPosition;
        int lineForVerticalPosition2;
        if (!innerTextFieldBounds.isEmpty() && (lineForVerticalPosition = textLayoutResult.getLineForVerticalPosition(innerTextFieldBounds.getTop())) <= (lineForVerticalPosition2 = textLayoutResult.getLineForVerticalPosition(innerTextFieldBounds.getBottom()))) {
            while (true) {
                builder.addVisibleLineBounds(textLayoutResult.getLineLeft(lineForVerticalPosition), textLayoutResult.getLineTop(lineForVerticalPosition), textLayoutResult.getLineRight(lineForVerticalPosition), textLayoutResult.getLineBottom(lineForVerticalPosition));
                if (lineForVerticalPosition == lineForVerticalPosition2) {
                    break;
                }
                lineForVerticalPosition++;
            }
        }
        return builder;
    }
}

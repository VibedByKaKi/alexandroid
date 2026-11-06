package androidx.compose.foundation.text.input.internal;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(34)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/input/internal/EditorInfoApi34;", "", "()V", "setHandwritingGestures", "", "editorInfo", "Landroid/view/inputmethod/EditorInfo;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class EditorInfoApi34 {

    @NotNull
    public static final EditorInfoApi34 INSTANCE = new EditorInfoApi34();

    private EditorInfoApi34() {
    }

    @DoNotInline
    public final void setHandwritingGestures(@NotNull EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(CollectionsKt.listOf((Object[]) new Class[]{OnnxMap$$ExternalSyntheticBUOutline0.m7m(), OnnxMap$$ExternalSyntheticBUOutline0.m$2(), OnnxMap$$ExternalSyntheticBUOutline0.m$3(), OnnxMap$$ExternalSyntheticBUOutline0.m11m$1(), JoinOrSplitGesture.class, InsertGesture.class, RemoveSpaceGesture.class}));
        editorInfo.setSupportedHandwritingGesturePreviews(SetsKt.setOf((Object[]) new Class[]{OnnxMap$$ExternalSyntheticBUOutline0.m7m(), OnnxMap$$ExternalSyntheticBUOutline0.m$2(), OnnxMap$$ExternalSyntheticBUOutline0.m$3(), OnnxMap$$ExternalSyntheticBUOutline0.m11m$1()}));
    }
}

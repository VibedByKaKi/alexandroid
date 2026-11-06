package androidx.compose.material3;

import androidx.compose.runtime.Stable;
import com.amazon.alexa.accessorykit.finishsetup.presenters.FASCardPresenter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Stable
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/material3/SnackbarData;", "", "visuals", "Landroidx/compose/material3/SnackbarVisuals;", "getVisuals", "()Landroidx/compose/material3/SnackbarVisuals;", FASCardPresenter.ACTION_DISMISS, "", "performAction", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface SnackbarData {
    void dismiss();

    @NotNull
    SnackbarVisuals getVisuals();

    void performAction();
}

package androidx.compose.ui.autofill;

import android.view.View;
import android.view.autofill.AutofillId;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/autofill/AndroidAutofill;", "Landroidx/compose/ui/autofill/Autofill;", "view", "Landroid/view/View;", "autofillTree", "Landroidx/compose/ui/autofill/AutofillTree;", "<init>", "(Landroid/view/View;Landroidx/compose/ui/autofill/AutofillTree;)V", "getView", "()Landroid/view/View;", "getAutofillTree", "()Landroidx/compose/ui/autofill/AutofillTree;", "autofillManager", "Landroid/view/autofill/AutofillManager;", "getAutofillManager", "()Landroid/view/autofill/AutofillManager;", "rootAutofillId", "Landroid/view/autofill/AutofillId;", "getRootAutofillId", "()Landroid/view/autofill/AutofillId;", "setRootAutofillId", "(Landroid/view/autofill/AutofillId;)V", "requestAutofillForNode", "", "autofillNode", "Landroidx/compose/ui/autofill/AutofillNode;", "cancelAutofillForNode", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@RequiresApi(26)
@SourceDebugExtension({"SMAP\nAndroidAutofill.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,148:1\n91#2,5:149\n26#3:154\n26#3:155\n26#3:156\n26#3:157\n*S KotlinDebug\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill\n*L\n53#1:149,5\n67#1:154\n68#1:155\n69#1:156\n70#1:157\n*E\n"})
/* loaded from: classes13.dex */
public final class AndroidAutofill implements Autofill {
    public static final int $stable = 8;

    @NotNull
    private final android.view.autofill.AutofillManager autofillManager;

    @NotNull
    private final AutofillTree autofillTree;

    @NotNull
    private AutofillId rootAutofillId;

    @NotNull
    private final View view;

    public AndroidAutofill(@NotNull View view, @NotNull AutofillTree autofillTree) {
        this.view = view;
        this.autofillTree = autofillTree;
        android.view.autofill.AutofillManager autofillManager = (android.view.autofill.AutofillManager) view.getContext().getSystemService(android.view.autofill.AutofillManager.class);
        if (autofillManager == null) {
            Single$$ExternalSyntheticBUOutline0.m$2("Autofill service could not be located.");
            throw null;
        }
        this.autofillManager = autofillManager;
        view.setImportantForAutofill(1);
        AutofillIdCompat autofillId = ViewCompatShims.getAutofillId(view);
        AutofillId autofillId2 = autofillId != null ? autofillId.toAutofillId() : null;
        if (autofillId2 == null) {
            throw BitVector$$ExternalSyntheticOutline0.m3870m("Required value was null.");
        }
        this.rootAutofillId = autofillId2;
    }

    @Override // androidx.compose.ui.autofill.Autofill
    public void cancelAutofillForNode(@NotNull AutofillNode autofillNode) {
        this.autofillManager.notifyViewExited(this.view, autofillNode.getId());
    }

    @NotNull
    public final android.view.autofill.AutofillManager getAutofillManager() {
        return this.autofillManager;
    }

    @NotNull
    public final AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    @NotNull
    public final AutofillId getRootAutofillId() {
        return this.rootAutofillId;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    @Override // androidx.compose.ui.autofill.Autofill
    public void requestAutofillForNode(@NotNull AutofillNode autofillNode) {
        Rect boundingBox = autofillNode.getBoundingBox();
        if (boundingBox != null) {
            this.autofillManager.notifyViewEntered(this.view, autofillNode.getId(), new android.graphics.Rect(Math.round(boundingBox.getLeft()), Math.round(boundingBox.getTop()), Math.round(boundingBox.getRight()), Math.round(boundingBox.getBottom())));
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("requestAutofill called before onChildPositioned()");
        }
    }

    public final void setRootAutofillId(@NotNull AutofillId autofillId) {
        this.rootAutofillId = autofillId;
    }
}

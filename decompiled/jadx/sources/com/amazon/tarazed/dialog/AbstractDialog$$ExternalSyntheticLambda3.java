package com.amazon.tarazed.dialog;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.amazon.alexa.handsfree.uservoicerecognition.ui.ProgressDialogFragment;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class AbstractDialog$$ExternalSyntheticLambda3 implements DialogInterface.OnKeyListener {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AbstractDialog$$ExternalSyntheticLambda3(int i) {
        this.$r8$classId = i;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        boolean onKeyListener$lambda$1;
        boolean lambda$onCreateDialog$0;
        switch (this.$r8$classId) {
            case 0:
                onKeyListener$lambda$1 = AbstractDialog.onKeyListener$lambda$1(dialogInterface, i, keyEvent);
                return onKeyListener$lambda$1;
            default:
                lambda$onCreateDialog$0 = ProgressDialogFragment.lambda$onCreateDialog$0(dialogInterface, i, keyEvent);
                return lambda$onCreateDialog$0;
        }
    }
}

package com.google.android.material.chip;

import android.widget.CompoundButton;
import com.amazon.alexa.biloba.view.alertsv2.edit.EditAlertView;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class Chip$$ExternalSyntheticLambda0 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Chip$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((Chip) obj).lambda$new$0(compoundButton, z);
                break;
            default:
                ((EditAlertView) obj).onToggleChanged(compoundButton, z);
                break;
        }
    }
}

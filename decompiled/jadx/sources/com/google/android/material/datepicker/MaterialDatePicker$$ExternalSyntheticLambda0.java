package com.google.android.material.datepicker;

import android.view.View;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class MaterialDatePicker$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MaterialDatePicker f$0;

    public /* synthetic */ MaterialDatePicker$$ExternalSyntheticLambda0(MaterialDatePicker materialDatePicker, int i) {
        this.$r8$classId = i;
        this.f$0 = materialDatePicker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.$r8$classId;
        MaterialDatePicker materialDatePicker = this.f$0;
        switch (i) {
            case 0:
                materialDatePicker.lambda$initHeaderToggle$0(view);
                break;
            case 1:
                materialDatePicker.onPositiveButtonClick(view);
                break;
            default:
                materialDatePicker.onNegativeButtonClick(view);
                break;
        }
    }
}

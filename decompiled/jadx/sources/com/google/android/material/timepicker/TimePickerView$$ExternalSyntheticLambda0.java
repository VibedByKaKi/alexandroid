package com.google.android.material.timepicker;

import com.google.android.material.button.MaterialButtonToggleGroup;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class TimePickerView$$ExternalSyntheticLambda0 implements MaterialButtonToggleGroup.OnButtonCheckedListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ TimePickerView$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener
    public final void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
        int i2 = this.$r8$classId;
        Object obj = this.f$0;
        switch (i2) {
            case 0:
                ((TimePickerView) obj).lambda$new$0(materialButtonToggleGroup, i, z);
                break;
            default:
                ((TimePickerTextInputPresenter) obj).lambda$setupPeriodToggle$0(materialButtonToggleGroup, i, z);
                break;
        }
    }
}

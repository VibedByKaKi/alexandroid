package com.amazon.alexa.biloba.view.account.timeZonePicker;

import androidx.lifecycle.Observer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class TimeZonePickerView$$ExternalSyntheticLambda0 implements Observer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TimeZonePickerView f$0;

    public /* synthetic */ TimeZonePickerView$$ExternalSyntheticLambda0(TimeZonePickerView timeZonePickerView, int i) {
        this.$r8$classId = i;
        this.f$0 = timeZonePickerView;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.$r8$classId;
        TimeZonePickerView timeZonePickerView = this.f$0;
        switch (i) {
            case 0:
                timeZonePickerView.lambda$new$2((Throwable) obj);
                break;
            case 1:
                timeZonePickerView.lambda$makeView$0((String) obj);
                break;
            default:
                timeZonePickerView.lambda$makeView$1((String) obj);
                break;
        }
    }
}

package com.reactcommunity.rndatetimepicker;

import android.app.DatePickerDialog;
import android.content.Context;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class RNDismissableDatePickerDialog extends DatePickerDialog {
    public RNDismissableDatePickerDialog(Context context, @Nullable DatePickerDialog.OnDateSetListener onDateSetListener, int i, int i2, int i3, RNDatePickerDisplay rNDatePickerDisplay) {
        super(context, onDateSetListener, i, i2, i3);
        fixSpinner(context, i, i2, i3, rNDatePickerDisplay);
    }

    private void fixSpinner(Context context, int i, int i2, int i3, RNDatePickerDisplay rNDatePickerDisplay) {
        if (rNDatePickerDisplay != RNDatePickerDisplay.SPINNER || getDatePicker() == null) {
            return;
        }
        getDatePicker().setCalendarViewShown(false);
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
    }

    public RNDismissableDatePickerDialog(Context context, int i, @Nullable DatePickerDialog.OnDateSetListener onDateSetListener, int i2, int i3, int i4, RNDatePickerDisplay rNDatePickerDisplay) {
        super(context, i, onDateSetListener, i2, i3, i4);
        fixSpinner(context, i2, i3, i4, rNDatePickerDisplay);
    }
}

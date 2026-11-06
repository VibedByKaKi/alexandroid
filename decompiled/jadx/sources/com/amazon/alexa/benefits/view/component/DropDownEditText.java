package com.amazon.alexa.benefits.view.component;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DropDownEditText extends AppCompatAutoCompleteTextView {
    public DropDownEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        showDropDown();
        return false;
    }
}

package com.amazon.alexa.voice.ui.onedesign.tta;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AndroidTextWatcher implements TextWatcher {
    private final UserInputWatcher userInputWatcher;

    public AndroidTextWatcher(UserInputWatcher userInputWatcher) {
        this.userInputWatcher = userInputWatcher;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.userInputWatcher.onTextChanged(charSequence);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}

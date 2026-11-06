package com.amazon.dee.app.ui.view;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.amazon.dee.app.framework.ViewModel;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class LoadingProgressViewModel implements ViewModel {
    String message;

    public String getMessage() {
        return this.message;
    }

    @Override // com.amazon.dee.app.framework.ViewModel
    @Nullable
    public Bundle saveState() {
        return null;
    }

    public void setMessage(CharSequence charSequence) {
        this.message = charSequence.toString();
    }

    @Override // com.amazon.dee.app.framework.ViewModel
    public void destroy() {
    }

    @Override // com.amazon.dee.app.framework.ViewModel
    public void create(@Nullable Bundle bundle) {
    }

    @Override // com.amazon.dee.app.framework.ViewModel
    public void updateContentMode(int i) {
    }
}

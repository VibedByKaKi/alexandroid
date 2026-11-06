package com.amazon.apl.android.views;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.EditText;
import com.amazon.apl.android.APLGradientDrawable;
import com.amazon.apl.android.IAPLViewPresenter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class APLEditText extends EditText {
    private APLGradientDrawable mGradientDrawable;
    private final IAPLViewPresenter mPresenter;

    public APLEditText(Context context, IAPLViewPresenter iAPLViewPresenter) {
        super(context);
        this.mGradientDrawable = new APLGradientDrawable();
        this.mPresenter = iAPLViewPresenter;
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (getSelectionStart() == getSelectionEnd()) {
            switch (keyCode) {
                case 19:
                case 21:
                    if (getSelectionEnd() != 0) {
                        return super.dispatchKeyEvent(keyEvent);
                    }
                    break;
                case 20:
                case 22:
                    if (getSelectionEnd() != getText().length()) {
                        return super.dispatchKeyEvent(keyEvent);
                    }
                    break;
            }
        }
        return this.mPresenter.onKeyPress(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void forceLayout() {
        IAPLViewPresenter iAPLViewPresenter = this.mPresenter;
        if (iAPLViewPresenter != null) {
            iAPLViewPresenter.requestLayoutFor(this);
        }
        super.forceLayout();
    }

    public APLGradientDrawable getGradientDrawable() {
        return this.mGradientDrawable;
    }

    public IAPLViewPresenter getPresenter() {
        return this.mPresenter;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IAPLViewPresenter iAPLViewPresenter = this.mPresenter;
        if (iAPLViewPresenter != null) {
            iAPLViewPresenter.clearLayoutRequestFor(this);
        }
        super.onLayout(z, i, i2, i3, i4);
    }
}

package com.amazon.deecomms.calling.ui;

import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.annotation.NonNull;
import com.amazon.deecomms.calling.accessibility.RealTimeTextPresenter;
import com.amazon.deecomms.calling.accessibility.RealTimeTextView;
import com.amazon.ptz.util.NtpClient$$ExternalSyntheticLambda0;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class OutgoingRealTimeTextWatcher implements TextWatcher {
    private Handler ephemeralTextHandler;
    private Runnable ephemeralTextRunnable;
    private WeakReference<EditText> nearSideEditText;
    private RealTimeTextPresenter realTimeTextPresenter;
    private RealTimeTextView realTimeTextView;

    public OutgoingRealTimeTextWatcher(@NonNull RealTimeTextPresenter realTimeTextPresenter, @NonNull RealTimeTextView realTimeTextView, @NonNull EditText editText, @NonNull Handler handler, @NonNull Runnable runnable) {
        this.realTimeTextPresenter = realTimeTextPresenter;
        this.realTimeTextView = realTimeTextView;
        this.nearSideEditText = new WeakReference<>(editText);
        this.ephemeralTextHandler = handler;
        this.ephemeralTextRunnable = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0() {
        WeakReference<EditText> weakReference = this.nearSideEditText;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        EditText editText = this.nearSideEditText.get();
        if (editText.length() > 0) {
            editText.getEditableText().clear();
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@NonNull Editable editable) {
        this.realTimeTextPresenter.localTextInputChanged(editable.toString());
        EditText editText = this.nearSideEditText.get();
        if (editText != null) {
            this.realTimeTextView.enforceTwoLineLimit(editText, false);
            this.realTimeTextView.setLocalTextState(editText.getText().toString());
            this.realTimeTextView.addClearButtonToEditText();
        }
        this.ephemeralTextHandler.postDelayed(this.ephemeralTextRunnable, 8000L);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@NonNull CharSequence charSequence, int i, int i2, int i3) {
        this.realTimeTextPresenter.beforeTextInputChanged(charSequence);
    }

    public void init() {
        this.ephemeralTextHandler = new Handler(Looper.getMainLooper());
        this.ephemeralTextRunnable = new NtpClient$$ExternalSyntheticLambda0(this, 10);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@NonNull CharSequence charSequence, int i, int i2, int i3) {
        this.ephemeralTextHandler.removeCallbacks(this.ephemeralTextRunnable);
    }

    public OutgoingRealTimeTextWatcher(@NonNull RealTimeTextPresenter realTimeTextPresenter, @NonNull RealTimeTextView realTimeTextView, @NonNull EditText editText) {
        this.realTimeTextPresenter = realTimeTextPresenter;
        this.realTimeTextView = realTimeTextView;
        this.nearSideEditText = new WeakReference<>(editText);
        init();
    }
}

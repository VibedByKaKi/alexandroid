package com.amazon.deecomms.calling.accessibility;

import android.graphics.drawable.Drawable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.R;
import com.amazon.deecomms.calling.ui.OutgoingRealTimeTextWatcher;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.util.AnimUtils;
import com.mrousavy.camera.react.CameraView$$ExternalSyntheticLambda0;
import com.swmansion.rnscreens.SearchBarView$$ExternalSyntheticLambda1;
import com.swmansion.rnscreens.SearchBarView$$ExternalSyntheticLambda3;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class RealTimeTextView implements RealTimeTextViewContract {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, RealTimeTextView.class);
    private String calleeContactName;
    private TextView farSideTextBox;
    private InputMethodManager inputMethodManager;
    private EditText nearSideEditText;
    private TextWatcher nearSideTextWatcher;
    private RealTimeTextViewContract parentActiveVideoCallViewContract;
    private View parentView;
    private RealTimeTextEnablementAuthority realTimeTextEnablementAuthority;
    private RealTimeTextPresenter realTimeTextPresenter;
    private String remoteSideText = "";
    private String localSideText = "";
    private String contactNamePrefixStringToInsert = "";

    @VisibleForTesting
    public RealTimeTextView(@NonNull TextView textView, @NonNull EditText editText, @NonNull InputMethodManager inputMethodManager, @NonNull RealTimeTextPresenter realTimeTextPresenter, @NonNull String str, @NonNull TextWatcher textWatcher, @NonNull RealTimeTextViewContract realTimeTextViewContract, @NonNull RealTimeTextEnablementAuthority realTimeTextEnablementAuthority) {
        this.farSideTextBox = textView;
        this.nearSideEditText = editText;
        this.inputMethodManager = inputMethodManager;
        this.realTimeTextPresenter = realTimeTextPresenter;
        this.calleeContactName = str;
        this.nearSideTextWatcher = textWatcher;
        this.parentActiveVideoCallViewContract = realTimeTextViewContract;
        this.realTimeTextEnablementAuthority = realTimeTextEnablementAuthority;
    }

    private void animateFarSideTextViewVisibilityIfNeeded(int i) {
        if (this.farSideTextBox.getVisibility() != i) {
            AnimUtils.fadingAnimation(this.parentView.getContext(), this.farSideTextBox, 300, i == 0);
            this.farSideTextBox.setVisibility(i);
        }
    }

    private void appendCalleeContactNameIfNeeded() {
        TextView textView = this.farSideTextBox;
        if (textView == null || textView.getText().length() != 0) {
            return;
        }
        this.contactNamePrefixStringToInsert = this.realTimeTextPresenter.getInitialsForContactName(this.calleeContactName) + ": ";
        this.farSideTextBox.getEditableText().insert(0, this.contactNamePrefixStringToInsert);
    }

    private void bindUI(View view) {
        this.farSideTextBox = (TextView) view.findViewById(R.id.far_side_text_box);
        EditText editText = (EditText) view.findViewById(R.id.near_side_edit_text);
        this.nearSideEditText = editText;
        this.parentView = view;
        this.nearSideTextWatcher = new OutgoingRealTimeTextWatcher(this.realTimeTextPresenter, this, editText);
    }

    private boolean handleClearButtonPressIfSelected(@NonNull MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            Drawable drawable = this.nearSideEditText.getCompoundDrawables()[2];
            int right = this.nearSideEditText.getRight();
            if (drawable == null) {
                drawable = this.nearSideEditText.getCompoundDrawables()[0];
                right = this.nearSideEditText.getLeft();
            }
            if (drawable != null) {
                if (motionEvent.getRawX() >= right - drawable.getBounds().width()) {
                    this.nearSideEditText.getEditableText().clear();
                    return true;
                }
            }
        }
        return false;
    }

    private void hideFarSideTextViewIfNeeded() {
        TextView textView = this.farSideTextBox;
        if (textView == null || textView.getText() == null) {
            return;
        }
        String charSequence = this.farSideTextBox.getText().toString();
        if (charSequence.length() == 0 || charSequence.trim().equals(this.contactNamePrefixStringToInsert.trim())) {
            this.farSideTextBox.postDelayed(new RealTimeTextView$$ExternalSyntheticLambda0(this, 0), 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hideFarSideTextViewIfNeeded$1() {
        animateFarSideTextViewVisibilityIfNeeded(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$setListeners$2(View view, MotionEvent motionEvent) {
        return handleClearButtonPressIfSelected(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setListeners$3(View view, boolean z) {
        if (z) {
            return;
        }
        hideKeyboard();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setListeners$4(View view) {
        hideCallControls();
        showKeyboard();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showKeyboard$0() {
        this.nearSideEditText.requestFocus();
        if (this.inputMethodManager.showSoftInput(this.nearSideEditText, 1)) {
            return;
        }
        this.inputMethodManager.showSoftInput(this.nearSideEditText, 2);
    }

    private void processMessageReceived(@NonNull String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            TextView textView = this.farSideTextBox;
            if (charAt == '\b') {
                int length = textView.getText().length();
                if (length > 0) {
                    this.farSideTextBox.getEditableText().delete(length - 1, length);
                }
            } else {
                textView.append("" + str.charAt(i));
            }
        }
    }

    private void setInitialStrings() {
        this.inputMethodManager = (InputMethodManager) this.parentView.getContext().getSystemService("input_method");
        this.farSideTextBox.setText("", TextView.BufferType.EDITABLE);
        appendCalleeContactNameIfNeeded();
        this.farSideTextBox.getEditableText().append((CharSequence) this.remoteSideText);
        this.nearSideEditText.setText(this.localSideText);
        EditText editText = this.nearSideEditText;
        editText.setSelection(editText.getText().length());
    }

    private void setListeners() {
        EditText editText = this.nearSideEditText;
        if (editText != null) {
            editText.addTextChangedListener(this.nearSideTextWatcher);
            this.nearSideEditText.setOnTouchListener(new CameraView$$ExternalSyntheticLambda0(this, 8));
            this.nearSideEditText.setOnFocusChangeListener(new SearchBarView$$ExternalSyntheticLambda1(this, 4));
            this.nearSideEditText.setOnClickListener(new SearchBarView$$ExternalSyntheticLambda3(this, 1));
        }
    }

    private void setRemoteTextState() {
        String charSequence = this.farSideTextBox.getText().toString();
        int length = this.contactNamePrefixStringToInsert.length();
        if (charSequence.length() >= length) {
            this.remoteSideText = charSequence.substring(length);
        }
    }

    private void showKeyboard() {
        EditText editText = this.nearSideEditText;
        if (editText == null || this.parentView == null) {
            return;
        }
        editText.postDelayed(new RealTimeTextView$$ExternalSyntheticLambda0(this, 1), 500L);
    }

    private void toggleViewVisibility() {
        String str = this.remoteSideText;
        if (str == null || this.nearSideEditText == null) {
            return;
        }
        if (str.length() > this.contactNamePrefixStringToInsert.length()) {
            AnimUtils.fadingAnimation(this.parentView.getContext(), this.farSideTextBox, 300, true);
            this.farSideTextBox.setVisibility(0);
        }
        this.nearSideEditText.setVisibility(0);
    }

    public void addClearButtonToEditText() {
        int length = this.nearSideEditText.getText().length();
        EditText editText = this.nearSideEditText;
        if (length == 0) {
            editText.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
        } else {
            editText.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.ic_cancel, 0);
        }
    }

    public void bind(@NonNull View view) {
        bindUI(view);
        setInitialStrings();
        toggleViewVisibility();
        setListeners();
        hideCallControls();
        showKeyboard();
        hideFarSideTextViewIfNeeded();
    }

    public void enforceTwoLineLimit(@Nullable TextView textView, boolean z) {
        if (textView == null || textView.getLayout() == null) {
            return;
        }
        int lineCount = textView.getLayout().getLineCount();
        int length = z ? this.contactNamePrefixStringToInsert.length() : 0;
        while (lineCount > 2) {
            if (textView.getEditableText().length() > length) {
                textView.getEditableText().delete(length, length + 1);
            }
            lineCount = textView.getLayout().getLineCount();
        }
    }

    public void handleScreenTap() {
        hideKeyboard();
        toggleViewVisibility();
    }

    @Override // com.amazon.deecomms.calling.accessibility.RealTimeTextViewContract
    public void hideCallControls() {
        this.parentActiveVideoCallViewContract.hideCallControls();
    }

    public void hideKeyboard() {
        EditText editText = this.nearSideEditText;
        if (editText == null || this.parentView == null) {
            return;
        }
        this.inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    public void setLocalTextState(@NonNull String str) {
        this.localSideText = str;
    }

    @Override // com.amazon.deecomms.calling.accessibility.RealTimeTextViewContract
    public void showIncomingMessage(@NonNull String str) {
        if (this.farSideTextBox != null) {
            animateFarSideTextViewVisibilityIfNeeded(0);
            appendCalleeContactNameIfNeeded();
            processMessageReceived(str);
            enforceTwoLineLimit(this.farSideTextBox, true);
            hideFarSideTextViewIfNeeded();
            setRemoteTextState();
        }
    }

    public void unbind() {
        if (this.realTimeTextEnablementAuthority.isRTTAvailableForTheCall()) {
            this.nearSideEditText.removeTextChangedListener(this.nearSideTextWatcher);
            this.nearSideEditText.setOnClickListener(null);
            this.parentView = null;
            this.nearSideEditText = null;
            this.farSideTextBox = null;
            this.nearSideTextWatcher = null;
        }
    }

    public RealTimeTextView(@NonNull RealTimeTextPresenter realTimeTextPresenter, @NonNull String str, @NonNull RealTimeTextViewContract realTimeTextViewContract, @NonNull RealTimeTextEnablementAuthority realTimeTextEnablementAuthority) {
        this.realTimeTextPresenter = realTimeTextPresenter;
        this.calleeContactName = str;
        this.parentActiveVideoCallViewContract = realTimeTextViewContract;
        this.realTimeTextEnablementAuthority = realTimeTextEnablementAuthority;
    }
}

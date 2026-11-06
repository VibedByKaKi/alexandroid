package com.amazon.deecomms.common.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDialog;
import com.amazon.deecomms.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CustomDialogBuilder {
    private Activity activity;
    private Integer bodyTextResId;
    private DialogInterface.OnCancelListener cancelListener;
    private DialogInterface.OnDismissListener dismissListener;
    private View.OnClickListener negativeButtonClickListener;
    private Integer negativeButtonTextResId;
    private View.OnClickListener positiveButtonClickListener;
    private Integer positiveButtonTextResId;
    private Integer titleTextResId;
    private boolean disableTitleBar = false;
    protected Integer layoutResId = Integer.valueOf(R.layout.custom_dialog_layout);

    public CustomDialogBuilder(@NonNull Activity activity) {
        this.activity = activity;
    }

    public AppCompatDialog build() {
        int i = R.style.AlexaCustomDialogStyle;
        if (this.disableTitleBar) {
            i = R.style.DropInDiscoverabilityDialogStyle;
        }
        final AppCompatDialog appCompatDialog = new AppCompatDialog(this.activity, i);
        appCompatDialog.setContentView(this.layoutResId.intValue());
        CommsTextView commsTextView = (CommsTextView) appCompatDialog.findViewById(R.id.dialog_title);
        CommsTextView commsTextView2 = (CommsTextView) appCompatDialog.findViewById(R.id.dialog_body);
        CommsButton commsButton = (CommsButton) appCompatDialog.findViewById(R.id.dialog_positive);
        CommsButton commsButton2 = (CommsButton) appCompatDialog.findViewById(R.id.dialog_negative);
        Integer num = this.titleTextResId;
        if (num != null) {
            commsTextView.setText(num.intValue());
        }
        Integer num2 = this.bodyTextResId;
        if (num2 != null) {
            commsTextView2.setText(num2.intValue());
        }
        Integer num3 = this.positiveButtonTextResId;
        if (num3 != null) {
            commsButton.setText(num3.intValue());
        }
        View.OnClickListener onClickListener = this.positiveButtonClickListener;
        if (onClickListener != null) {
            commsButton.setOnClickListener(onClickListener);
        } else {
            final int i2 = 0;
            commsButton.setOnClickListener(new View.OnClickListener() { // from class: com.amazon.deecomms.common.ui.CustomDialogBuilder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = i2;
                    AppCompatDialog appCompatDialog2 = appCompatDialog;
                    switch (i3) {
                        case 0:
                            appCompatDialog2.dismiss();
                            break;
                        default:
                            appCompatDialog2.dismiss();
                            break;
                    }
                }
            });
        }
        Integer num4 = this.negativeButtonTextResId;
        if (num4 != null) {
            commsButton2.setText(num4.intValue());
        }
        View.OnClickListener onClickListener2 = this.negativeButtonClickListener;
        if (onClickListener2 != null) {
            commsButton2.setOnClickListener(onClickListener2);
        } else {
            final int i3 = 1;
            commsButton2.setOnClickListener(new View.OnClickListener() { // from class: com.amazon.deecomms.common.ui.CustomDialogBuilder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i32 = i3;
                    AppCompatDialog appCompatDialog2 = appCompatDialog;
                    switch (i32) {
                        case 0:
                            appCompatDialog2.dismiss();
                            break;
                        default:
                            appCompatDialog2.dismiss();
                            break;
                    }
                }
            });
        }
        DialogInterface.OnDismissListener onDismissListener = this.dismissListener;
        if (onDismissListener != null) {
            appCompatDialog.setOnDismissListener(onDismissListener);
        }
        DialogInterface.OnCancelListener onCancelListener = this.cancelListener;
        if (onCancelListener != null) {
            appCompatDialog.setOnCancelListener(onCancelListener);
        }
        return appCompatDialog;
    }

    public CustomDialogBuilder disableTitleBar(boolean z) {
        this.disableTitleBar = z;
        return this;
    }

    public CustomDialogBuilder withBody(int i) {
        this.bodyTextResId = Integer.valueOf(i);
        return this;
    }

    public CustomDialogBuilder withCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.cancelListener = onCancelListener;
        return this;
    }

    public CustomDialogBuilder withDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.dismissListener = onDismissListener;
        return this;
    }

    public CustomDialogBuilder withNegativeButtonText(int i) {
        this.negativeButtonTextResId = Integer.valueOf(i);
        return this;
    }

    public CustomDialogBuilder withNegativeClickListener(View.OnClickListener onClickListener) {
        this.negativeButtonClickListener = onClickListener;
        return this;
    }

    public CustomDialogBuilder withPositiveButtonText(int i) {
        this.positiveButtonTextResId = Integer.valueOf(i);
        return this;
    }

    public CustomDialogBuilder withPositiveClickListener(View.OnClickListener onClickListener) {
        this.positiveButtonClickListener = onClickListener;
        return this;
    }

    public CustomDialogBuilder withTitle(int i) {
        this.titleTextResId = Integer.valueOf(i);
        return this;
    }
}

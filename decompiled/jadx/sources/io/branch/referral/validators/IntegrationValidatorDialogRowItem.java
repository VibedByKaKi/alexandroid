package io.branch.referral.validators;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.amazon.deecomms.common.util.Utils$$ExternalSyntheticLambda2;
import com.google.android.material.snackbar.Snackbar$$ExternalSyntheticLambda0;
import io.branch.referral.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class IntegrationValidatorDialogRowItem extends LinearLayout {
    Button detailsButton;
    String detailsMessage;
    String moreInfoLink;
    TextView testResultSymbol;
    TextView titleText;

    public IntegrationValidatorDialogRowItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.integration_validator_dialog_row_item, (ViewGroup) null);
        addView(inflate);
        this.titleText = (TextView) inflate.findViewById(R.id.title_text);
        this.testResultSymbol = (TextView) inflate.findViewById(R.id.pass_or_fail_symbol_text);
        Button button = (Button) inflate.findViewById(R.id.details_button);
        this.detailsButton = button;
        button.setOnClickListener(new Snackbar$$ExternalSyntheticLambda0(this, context, 22));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(Context context, View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage(this.detailsMessage + "\n");
        TextView textView = new TextView(context);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setGravity(1);
        textView.setText(Html.fromHtml("<a href=" + this.moreInfoLink + "</a>"));
        builder.setView(textView);
        builder.setCancelable(false);
        builder.setPositiveButton("OK", new Utils$$ExternalSyntheticLambda2(11));
        builder.create().show();
    }

    public void SetDetailsMessage(String str) {
        this.detailsMessage = str;
    }

    public void SetMoreInfoLink(String str) {
        this.moreInfoLink = str;
    }

    public void SetTestResult(boolean z) {
        this.testResultSymbol.setText(z ? IntegrationValidatorConstants.checkmark : IntegrationValidatorConstants.xmark);
        ToggleDetailsButton(z);
    }

    public void SetTitleText(String str) {
        this.titleText.setText(str);
    }

    public void ToggleDetailsButton(boolean z) {
        Button button = this.detailsButton;
        if (z) {
            button.setVisibility(4);
        } else {
            button.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(DialogInterface dialogInterface, int i) {
    }

    public IntegrationValidatorDialogRowItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

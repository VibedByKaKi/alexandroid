package com.amazon.deecomms.calling.ui;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import androidx.appcompat.app.AppCompatActivity;
import com.amazon.deecomms.R;
import com.amazon.deecomms.calling.controller.CallHelper;
import com.amazon.deecomms.calling.initiation.InitiationLogicFactory;
import com.amazon.deecomms.calling.util.CallInitiator;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.metrics.MetricKeys;
import com.amazon.deecomms.contacts.model.ContactPhoneNumber;
import com.amazon.deecomms.core.CommsDaggerWrapper;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class COBOWarningActivity extends AppCompatActivity {

    @Inject
    InitiationLogicFactory initiationLogicFactory;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(String str, String str2, String str3, String str4, ContactPhoneNumber contactPhoneNumber, DialogInterface dialogInterface, int i) {
        this.initiationLogicFactory.create(new CallInitiator(MetricKeys.CALL_INITIATED_FROM_API), this, this, new CallHelper(), str, str2).lambda$initiateCoboCallFromActivity$1(str3, str4, contactPhoneNumber);
        finish();
    }

    public static void show(Context context, String str, String str2, ContactPhoneNumber contactPhoneNumber, String str3, String str4) {
        Intent intent = new Intent();
        intent.setClass(context, COBOWarningActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("COMMS_ID", str);
        intent.putExtra("CONTACT_NAME", str2);
        intent.putExtra("PHONE_NUMBER", contactPhoneNumber);
        intent.putExtra(Constants.Calling.METRIC_KEY, str3);
        intent.putExtra(Constants.Calling.INIT_SCREEN, str4);
        context.startActivity(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        CommsDaggerWrapper.getComponent().inject(this);
        super.onCreate(bundle);
        Intent intent = getIntent();
        final String stringExtra = intent.getStringExtra("COMMS_ID");
        final String stringExtra2 = intent.getStringExtra("CONTACT_NAME");
        final ContactPhoneNumber contactPhoneNumber = (ContactPhoneNumber) intent.getParcelableExtra("PHONE_NUMBER");
        final String stringExtra3 = intent.getStringExtra(Constants.Calling.METRIC_KEY);
        final String stringExtra4 = intent.getStringExtra(Constants.Calling.INIT_SCREEN);
        new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlexaCustomDialogStyle)).setTitle(R.string.cobo_first_call_warning_title).setMessage(R.string.cobo_first_call_warning_message).setPositiveButton(R.string.dialog_ok_button, new DialogInterface.OnClickListener() { // from class: com.amazon.deecomms.calling.ui.COBOWarningActivity$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                COBOWarningActivity.this.lambda$onCreate$0(stringExtra3, stringExtra4, stringExtra, stringExtra2, contactPhoneNumber, dialogInterface, i);
            }
        }).setCancelable(false).show();
    }
}

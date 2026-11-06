package com.facebook.react.devsupport;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.amazon.deecomms.ndt.ui.DeviceAdapter$$ExternalSyntheticLambda0;
import com.facebook.react.R;
import com.facebook.react.modules.debug.interfaces.DeveloperSettings;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import com.facebook.react.packagerconnection.PackagerConnectionSettings;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\r"}, d2 = {"Lcom/facebook/react/devsupport/ChangeBundleLocationDialog;", "", "<init>", "()V", "show", "", "context", "Landroid/content/Context;", "devSettings", "Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;", "onClickListener", "Lcom/facebook/react/devsupport/ChangeBundleLocationDialog$ChangeBundleLocationDialogListener;", "ChangeBundleLocationDialogListener", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChangeBundleLocationDialog {

    @NotNull
    public static final ChangeBundleLocationDialog INSTANCE = new ChangeBundleLocationDialog();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/facebook/react/devsupport/ChangeBundleLocationDialog$ChangeBundleLocationDialogListener;", "", ViewProps.ON_CLICK, "", "newHostAndPort", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ChangeBundleLocationDialogListener {
        void onClick(@NotNull String newHostAndPort);
    }

    private ChangeBundleLocationDialog() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$2(ChangeBundleLocationDialogListener changeBundleLocationDialogListener, EditText editText, AlertDialog alertDialog, View view) {
        changeBundleLocationDialogListener.onClick(editText.getText().toString());
        alertDialog.dismiss();
    }

    @SuppressLint({"SetTextI18n"})
    public final void show(@NotNull Context context, @NotNull DeveloperSettings devSettings, @NotNull ChangeBundleLocationDialogListener onClickListener) {
        context.getClass();
        devSettings.getClass();
        onClickListener.getClass();
        PackagerConnectionSettings packagerConnectionSettings = devSettings.getPackagerConnectionSettings();
        String debugServerHost = packagerConnectionSettings.getDebugServerHost();
        packagerConnectionSettings.setDebugServerHost("");
        final String debugServerHost2 = packagerConnectionSettings.getDebugServerHost();
        packagerConnectionSettings.setDebugServerHost(debugServerHost);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        int i = (int) (4 * context.getResources().getDisplayMetrics().density);
        int i2 = (int) (16 * context.getResources().getDisplayMetrics().density);
        linearLayout.setPadding(i2, i2, i2, i2);
        TextView textView = new TextView(context);
        textView.setText(context.getString(R.string.catalyst_change_bundle_location_input_label));
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        final EditText editText = new EditText(context);
        editText.setInputType(1);
        editText.setHint(context.getString(R.string.catalyst_change_bundle_location_input_hint));
        editText.setBackgroundResource(android.R.drawable.edit_text);
        editText.setHintTextColor(-3355444);
        editText.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        editText.setText(debugServerHost);
        Button button = new Button(context);
        button.setText(debugServerHost2);
        button.setTextSize(12.0f);
        button.setAllCaps(false);
        final int i3 = 0;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.devsupport.ChangeBundleLocationDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        editText.setText(debugServerHost2);
                        break;
                    default:
                        editText.setText(debugServerHost2);
                        break;
                }
            }
        });
        final String devServerNetworkIpAndPort$ReactAndroid_release = AndroidInfoHelpers.INSTANCE.getDevServerNetworkIpAndPort$ReactAndroid_release(context);
        Button button2 = new Button(context);
        button2.setText(devServerNetworkIpAndPort$ReactAndroid_release);
        button2.setTextSize(12.0f);
        button2.setAllCaps(false);
        final int i4 = 1;
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.devsupport.ChangeBundleLocationDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        editText.setText(devServerNetworkIpAndPort$ReactAndroid_release);
                        break;
                    default:
                        editText.setText(devServerNetworkIpAndPort$ReactAndroid_release);
                        break;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.addView(button);
        linearLayout2.addView(button2);
        TextView textView2 = new TextView(context);
        textView2.setText(context.getString(R.string.catalyst_change_bundle_location_instructions, AndroidInfoHelpers.getAdbReverseTcpCommand(context)));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i, 0, i2);
        textView2.setLayoutParams(layoutParams);
        Button button3 = new Button(context);
        button3.setText(context.getString(R.string.catalyst_change_bundle_location_apply));
        Button button4 = new Button(context);
        button4.setText(context.getString(R.string.catalyst_change_bundle_location_cancel));
        linearLayout.addView(textView);
        linearLayout.addView(editText);
        linearLayout.addView(linearLayout2);
        linearLayout.addView(textView2);
        linearLayout.addView(button3);
        linearLayout.addView(button4);
        AlertDialog create = new AlertDialog.Builder(context).setTitle(context.getString(R.string.catalyst_change_bundle_location)).setView(linearLayout).create();
        button3.setOnClickListener(new DeviceAdapter$$ExternalSyntheticLambda0(onClickListener, 5, editText, create));
        button4.setOnClickListener(new ChangeBundleLocationDialog$$ExternalSyntheticLambda3(create, 0));
        create.show();
    }
}

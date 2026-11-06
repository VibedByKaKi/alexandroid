package com.amazon.alexa.alertsca.permissiondialog;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.AppCompatActivity;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.alertsca.R;
import com.amazon.alexa.alertsca.dependencies.MetricsModule;
import com.amazon.alexa.alertsca.metrics.MetricsConstants;
import com.amazon.alexa.alertsca.metrics.service.MetricsService;
import com.amazon.dee.app.services.shortcut.ShortcutConstants;
import com.google.android.material.snackbar.Snackbar$$ExternalSyntheticLambda0;
import dagger.Component;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class PermissionDialogActivity extends AppCompatActivity {
    public static final String ALL_PERMISSIONS = "ALL_PERMISSIONS";
    public static final String NOTIFICATIONS_PERMISSION = "NOTIFICATIONS";
    public static final String SCHEDULE_EXACT_ALARM_PERMISSION = "SCHEDULED_EXACT_ALARM";
    private final String SHORTCUT_ACTION = ShortcutConstants.SHORTCUT_ACTION;

    @Inject
    MetricsService metricsService;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Component(modules = {MetricsModule.class})
    @Singleton
    public interface Injector {
        void inject(PermissionDialogActivity permissionDialogActivity);
    }

    private void init() {
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("permissionType");
        String stringExtra2 = intent.getStringExtra("alertType");
        TextView textView = (TextView) findViewById(R.id.dialog_body);
        Objects.requireNonNull(stringExtra);
        int hashCode = stringExtra.hashCode();
        if (hashCode != -1879828449) {
            if (hashCode == 93629640) {
                stringExtra.equals(NOTIFICATIONS_PERMISSION);
            } else if (hashCode == 1279699622 && stringExtra.equals(ALL_PERMISSIONS)) {
                textView.setText(getResources().getString(R.string.all_permissions_missing_dialog_body));
            }
            textView.setText(getResources().getString(R.string.notifications_permission_missing_dialog_body));
        } else {
            if (stringExtra.equals(SCHEDULE_EXACT_ALARM_PERMISSION)) {
                textView.setText(getResources().getString(R.string.alarms_and_reminders_permission_missing_dialog_body));
            }
            textView.setText(getResources().getString(R.string.notifications_permission_missing_dialog_body));
        }
        ((Button) findViewById(R.id.btn_confirm)).setOnClickListener(new Snackbar$$ExternalSyntheticLambda0(this, stringExtra2, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(String str, View view) {
        Intent intent = new Intent(ShortcutConstants.SHORTCUT_ACTION, Uri.parse("https://alexa.amazon.com/?fragment=v2/elements-hho-settings/permissions-diagnostic/" + str + ExifInterface.LATITUDE_SOUTH));
        this.metricsService.recordEvent(MetricsConstants.ALERTS.PERMISSIONS.PERMISSION_DIALOG_CLICKED);
        intent.setPackage(getPackageName());
        startActivity(intent);
        finish();
    }

    @VisibleForTesting
    public void injectDependencies() {
        DaggerPermissionDialogActivity_Injector.builder().build().inject(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        injectDependencies();
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        setContentView(R.layout.activity_permission_dialog);
        setFinishOnTouchOutside(true);
        init();
    }
}

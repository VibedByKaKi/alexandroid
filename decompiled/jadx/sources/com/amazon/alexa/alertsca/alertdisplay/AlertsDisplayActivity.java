package com.amazon.alexa.alertsca.alertdisplay;

import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.AppCompatActivity;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.core.util.ObjectsCompat;
import com.amazon.alexa.alertsca.AlertsAuthority;
import com.amazon.alexa.alertsca.AlertsIntentFactory;
import com.amazon.alexa.alertsca.R;
import com.amazon.alexa.alertsca.dependencies.MetricsModule;
import com.amazon.alexa.alertsca.metrics.MetricsConstants;
import com.amazon.alexa.alertsca.metrics.service.MetricsService;
import com.amazon.alexa.alertsca.utils.datetime.AlertsDateTimeFormatter;
import com.amazon.alexa.api.compat.model.AlertType;
import com.amazon.alexa.mosaic.components.ThemeUtil;
import dagger.Component;
import java.util.Date;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlertsDisplayActivity extends AppCompatActivity implements View.OnClickListener, AlertDisplayListener {
    private static final String EMPTY_STRING = "";
    private static final String TAG = "AlertsDisplayActivity";
    private AlertDisplayData alertDisplayData;
    private TextView alertLabel;
    private AlertsDateTimeFormatter alertsDateTimeFormatter;
    private Chronometer chronometer;
    private TextView dateLabel;
    private Button dismissButton;
    private ImageView iconHolder;

    @Inject
    MetricsService metricsService;
    private AlertDisplayReceiver receiver;
    private TextView reminderLabel;
    private TextView timeLabel;
    private PowerManager.WakeLock wakeLock;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.alertsca.alertdisplay.AlertsDisplayActivity$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$compat$model$AlertType;

        static {
            int[] iArr = new int[AlertType.values().length];
            $SwitchMap$com$amazon$alexa$api$compat$model$AlertType = iArr;
            try {
                iArr[AlertType.ALARM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$AlertType[AlertType.TIMER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Component(modules = {MetricsModule.class})
    @Singleton
    public interface Injector {
        void inject(AlertsDisplayActivity alertsDisplayActivity);
    }

    private AlertDisplayData extractData(Intent intent) {
        if (intent == null || intent.getExtras() == null) {
            return null;
        }
        AlertDisplayData alertDisplayData = new AlertDisplayData(0);
        alertDisplayData.alertText = intent.getStringExtra(AlertsIntentFactory.ExtraKeys.ALERT_LABEL);
        alertDisplayData.alertToken = intent.getStringExtra(AlertsIntentFactory.ExtraKeys.ALERT_TOKEN);
        String stringExtra = intent.getStringExtra(AlertsIntentFactory.ExtraKeys.ALERT_RECORD_TYPE);
        alertDisplayData.alertType = stringExtra != null ? AlertType.valueOf(stringExtra) : null;
        alertDisplayData.alertTimeInMillis = intent.getLongExtra(AlertsIntentFactory.ExtraKeys.ALERT_TIME, System.currentTimeMillis());
        alertDisplayData.alertId = intent.getIntExtra(AlertsIntentFactory.ExtraKeys.ALERT_RECORD_ID, 0);
        return alertDisplayData;
    }

    private void hideSystemUI() {
        getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    private void initView() {
        this.alertLabel = (TextView) findViewById(R.id.txt_label);
        this.reminderLabel = (TextView) findViewById(R.id.txt_reminder_name);
        this.iconHolder = (ImageView) findViewById(R.id.iv_alarm);
        this.timeLabel = (TextView) findViewById(R.id.txt_time);
        this.chronometer = (Chronometer) findViewById(R.id.chronometer);
        this.dateLabel = (TextView) findViewById(R.id.txt_date);
        Button button = (Button) findViewById(R.id.btn_dismiss);
        this.dismissButton = button;
        button.setOnClickListener(this);
        getWindow().addFlags(4718720);
    }

    private void registerReceiver() {
        this.receiver.register();
    }

    private void unregisterReceiver() {
        this.receiver.unregister();
    }

    private void updateUI() {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$api$compat$model$AlertType[this.alertDisplayData.alertType.ordinal()];
        if (i == 1) {
            try {
                Date date = new Date(this.alertDisplayData.alertTimeInMillis);
                this.chronometer.setVisibility(8);
                this.dateLabel.setVisibility(0);
                this.timeLabel.setText(this.alertsDateTimeFormatter.formatTime(date));
                this.dateLabel.setText(this.alertsDateTimeFormatter.formatDate(date));
                this.alertLabel.setText(getResources().getString(R.string.amazon_avs_alarm_label));
                this.iconHolder.setImageResource(SharedDrawableResolver.resolve(this, this.alertDisplayData.alertType));
            } catch (Exception e) {
                this.metricsService.recordErrorWithException(MetricsConstants.ALERTS.ALERT_DISPLAY_ACTIVITY_UPDATE_UI_ALARM.element(this.alertDisplayData.alertType.name()).failure().getEventName(), e);
                Log.e(TAG, "Couldn't Update UI for Alarm ", e);
            }
        } else if (i == 2) {
            try {
                this.dateLabel.setText("");
                this.timeLabel.setText("");
                this.dateLabel.setVisibility(4);
                this.chronometer.setVisibility(0);
                this.iconHolder.setImageResource(SharedDrawableResolver.resolve(this, this.alertDisplayData.alertType));
                this.chronometer.setBase(this.alertDisplayData.getCountdownBase());
                this.chronometer.start();
                this.alertLabel.setText(getResources().getString(R.string.amazon_avs_timer_label));
            } catch (Exception e2) {
                this.metricsService.recordErrorWithException(MetricsConstants.ALERTS.ALERT_DISPLAY_ACTIVITY_UPDATE_UI_TIMER.element(this.alertDisplayData.alertType.name()).failure().getEventName(), e2);
                Log.e(TAG, "Couldn't Update UI for Timer ", e2);
            }
        }
        boolean isEmpty = TextUtils.isEmpty(this.alertDisplayData.alertText);
        TextView textView = this.reminderLabel;
        if (isEmpty) {
            textView.setVisibility(8);
            this.reminderLabel.setText("");
        } else {
            textView.setVisibility(0);
            this.reminderLabel.setText(this.alertDisplayData.alertText);
        }
    }

    @VisibleForTesting
    public void injectDependencies() {
        DaggerAlertsDisplayActivity_Injector.builder().build().inject(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.metricsService.recordEvent(MetricsConstants.ALERTS.DISPLAY_ACTIVITY.BACK_PRESSED.element(this.alertDisplayData.alertType.name()));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.btn_dismiss) {
            getApplicationContext().startService(AlertsIntentFactory.createStopIntent(getBaseContext(), this.alertDisplayData.alertToken, this.alertDisplayData.alertId, this.alertDisplayData.alertType));
            this.metricsService.recordEvent(MetricsConstants.ALERTS.DISPLAY_ACTIVITY.CLICKED_DISMISS.element(this.alertDisplayData.alertType.name()));
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        String str = TAG;
        ThemeUtil.setTheme(this);
        setContentView(R.layout.amazon_avs_alarm_display);
        injectDependencies();
        initView();
        AlertDisplayData extractData = extractData(getIntent());
        this.alertDisplayData = extractData;
        if (extractData == null || !extractData.isValid()) {
            Log.w(str, "onCreate: alertDisplayData is null or invalid.");
            this.metricsService.recordEvent(MetricsConstants.ALERTS.DISPLAY_ACTIVITY.SHOW.failure());
            finish();
            return;
        }
        Objects.toString(this.alertDisplayData);
        this.alertsDateTimeFormatter = new AlertsDateTimeFormatter(this);
        updateUI();
        PowerManager.WakeLock newWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(268435466, str);
        this.wakeLock = newWakeLock;
        newWakeLock.acquire();
        this.receiver = new AlertDisplayReceiver(getBaseContext(), this);
        registerReceiver();
        this.metricsService.recordEvent(MetricsConstants.ALERTS.DISPLAY_ACTIVITY.SHOW.element(this.alertDisplayData.alertType.name()).success());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver();
        PowerManager.WakeLock wakeLock = this.wakeLock;
        if (wakeLock != null) {
            wakeLock.release();
            this.wakeLock = null;
        }
    }

    @Override // com.amazon.alexa.alertsca.alertdisplay.AlertDisplayListener
    public void onDismiss(String str) {
        if (ObjectsCompat.equals(str, this.alertDisplayData.alertToken)) {
            this.metricsService.recordEvent(MetricsConstants.ALERTS.DISPLAY_ACTIVITY.ON_DISMISS.element(this.alertDisplayData.alertType.name()));
            finish();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        AlertDisplayData extractData = extractData(intent);
        if (extractData == null || !extractData.isValid()) {
            Log.w(TAG, "onNewIntent: alertDisplayData is null or invalid.");
            this.metricsService.recordEvent(MetricsConstants.ALERTS.DISPLAY_ACTIVITY.NEW_INTENT.failure());
            return;
        }
        this.alertDisplayData = extractData;
        extractData.toString();
        setIntent(intent);
        updateUI();
        this.metricsService.recordEvent(MetricsConstants.ALERTS.DISPLAY_ACTIVITY.NEW_INTENT.element(extractData.alertType.name()).success());
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            hideSystemUI();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AlertDisplayData {
        private int alertId;
        private String alertText;
        private long alertTimeInMillis;
        private String alertToken;
        private AlertType alertType;

        public /* synthetic */ AlertDisplayData(int i) {
            this();
        }

        public long getCountdownBase() {
            long currentTimeMillis = System.currentTimeMillis();
            return (this.alertTimeInMillis - currentTimeMillis) + SystemClock.elapsedRealtime();
        }

        public boolean isValid() {
            return this.alertToken != null && AlertsAuthority.ALERT_TYPES_SHOWING_FULL_SCREEN.contains(this.alertType);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("AlertsDisplayData{alertText='");
            sb.append(this.alertText);
            sb.append("', alertToken='");
            sb.append(this.alertToken);
            sb.append("', alertType=");
            sb.append(this.alertType);
            sb.append(", alertTimeInMillis=");
            sb.append(this.alertTimeInMillis);
            sb.append(", alertId=");
            return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.alertId, AbstractJsonLexerKt.END_OBJ);
        }

        private AlertDisplayData() {
        }
    }
}

package com.amazon.alexa.handsfree.settings.handsfreesettings;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toolbar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.handsfree.protocols.Initializer;
import com.amazon.alexa.handsfree.protocols.InitializerProvider;
import com.amazon.alexa.handsfree.settings.R;
import com.amazon.alexa.handsfree.settings.SettingsModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DeviceInformationActivity extends Activity {
    private Initializer mInitializer;

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Initializer initializer = InitializerProvider.getInitializer();
        this.mInitializer = initializer;
        initializer.initialize(this);
        setContentView(R.layout.activity_device_information);
        setActionBar((Toolbar) findViewById(R.id.settings_toolbar));
        getActionBar().setDisplayHomeAsUpEnabled(true);
        ((TextView) findViewById(R.id.device)).setText(getString(R.string.alexa_settings_activity_information_device, Build.MODEL));
        ((TextView) findViewById(R.id.os)).setText(getString(R.string.alexa_settings_activity_information_os, Build.VERSION.RELEASE));
        ((TextView) findViewById(R.id.device_id)).setText(getString(R.string.alexa_settings_activity_information_device_id, SettingsModule.INSTANCE.getAnonymousDeviceIdProvider().getAnonymousDeviceId()));
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}

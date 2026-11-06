package com.amazon.alexa.handsfree.settings.handsfreesettings;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toolbar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.Initializer;
import com.amazon.alexa.handsfree.protocols.InitializerProvider;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfComponentsProvider;
import com.amazon.alexa.handsfree.settings.dependencies.FalcoSettingsComponent;
import com.amazon.alexa.handsfree.ui.R;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AlexaSettingsActivity extends PreferenceActivity {

    @VisibleForTesting
    static final int NUM_CLICKS_FOR_DEVICE_INFORMATION = 5;
    private final Fragment mFragment;

    @Inject
    Initializer mInitializer;
    private int mNumToolbarClicks;

    @RequiresApi(api = 23)
    public AlexaSettingsActivity() {
        this(InitializerProvider.getInitializer(), new AlexaSettingsPreferenceFragment());
    }

    @Override // android.preference.PreferenceActivity
    public boolean isValidFragment(String str) {
        return AlexaSettingsPreferenceFragment.class.getName().equals(str);
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        ((FalcoSettingsComponent) AhfComponentsProvider.getComponent(this, FalcoSettingsComponent.class)).inject(this);
        setTheme(R.style.MosaicInAppPreference);
        super.onCreate(bundle);
        this.mInitializer.initialize(this);
        setContentView(com.amazon.alexa.handsfree.settings.R.layout.settings_preference_activity);
        Toolbar toolbar = (Toolbar) findViewById(com.amazon.alexa.handsfree.settings.R.id.settings_toolbar);
        toolbar.setOnClickListener(new View.OnClickListener() { // from class: com.amazon.alexa.handsfree.settings.handsfreesettings.AlexaSettingsActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(@NonNull View view) {
                AlexaSettingsActivity.this.processToolbarClick();
            }
        });
        setActionBar(toolbar);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getFragmentManager().beginTransaction().replace(com.amazon.alexa.handsfree.settings.R.id.preferences_layout, this.mFragment).commit();
        getFragmentManager().executePendingTransactions();
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @VisibleForTesting
    public void processToolbarClick() {
        int i = this.mNumToolbarClicks + 1;
        this.mNumToolbarClicks = i;
        if (i == 5) {
            this.mNumToolbarClicks = 0;
            showDeviceInformation();
        }
    }

    @VisibleForTesting
    public void showDeviceInformation() {
        startActivity(new Intent(this, (Class<?>) DeviceInformationActivity.class));
    }

    @VisibleForTesting
    public AlexaSettingsActivity(@NonNull Initializer initializer, @NonNull Fragment fragment) {
        this.mNumToolbarClicks = 0;
        this.mInitializer = initializer;
        this.mFragment = fragment;
    }
}

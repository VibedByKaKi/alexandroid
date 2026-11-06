package com.amazon.alexa.smarthomecameras.view;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.routing.api.RoutingService;
import com.amazon.alexa.smarthomecameras.dependencies.components.SmartAlertEventComponent;
import com.amazon.alexa.smarthomecameras.dependencies.components.SmartAlertEventComponentProvider;
import com.amazon.alexa.smarthomecameras.dependencies.components.SmartAlertEventViewScope;
import com.amazon.alexa.smarthomecameras.dependencies.modules.SmartAlertEventModule;
import com.amazon.alexa.smarthomecameras.dependencies.modules.SmartAlertEventViewModule;
import dagger.Component;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class SmartAlertEventActivity extends Activity {
    public static final String EXTRA_IMAGE_URL = "imageUrl";
    private static final String TAG = "SmartAlertEventActivity";
    private String imageUrl;

    @Inject
    RoutingService routingService;

    @Inject
    SmartAlertEventView smartAlertEventView;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SmartAlertEventViewScope
    @Component(dependencies = {SmartAlertEventComponent.class}, modules = {SmartAlertEventModule.class, SmartAlertEventViewModule.class})
    public interface Injector {
        void inject(SmartAlertEventActivity smartAlertEventActivity);
    }

    @VisibleForTesting
    public void injectDependencies() {
        SmartAlertEventComponent smartAlertEventComponent = SmartAlertEventComponentProvider.getSmartAlertEventComponent();
        if (smartAlertEventComponent != null) {
            DaggerSmartAlertEventActivity_Injector.builder().smartAlertEventComponent(smartAlertEventComponent).smartAlertEventModule(new SmartAlertEventModule(this.imageUrl)).smartAlertEventViewModule(new SmartAlertEventViewModule(this)).build().inject(this);
        } else {
            Log.e(TAG, "Cannot start activity with a null smart alert event component");
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("imageUrl");
        this.imageUrl = stringExtra;
        if (stringExtra == null) {
            Log.e(TAG, "imageUrl cannot be null");
            finish();
        }
        injectDependencies();
        getWindow().getDecorView().setSystemUiVisibility(2822);
        this.smartAlertEventView.initialize();
        setContentView(this.smartAlertEventView);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.routingService.navigateBackward();
    }
}

package com.amazon.alexa.seamlessswitching;

import android.content.Context;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.featureservice.data.registry.NativeFeatureRegistry;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.alexa.seamlessswitching.capability.agent.IOComponentsBluetoothCapabilityAgent;
import com.amazon.alexa.seamlessswitching.capability.agent.IOComponentsBluetoothCapabilityAgentService;
import com.amazon.alexa.seamlessswitching.capability.dependencies.AccessoriesModule;
import com.amazon.alexa.seamlessswitching.capability.dependencies.AlexaMobileFrameworkModule;
import com.amazon.alexa.seamlessswitching.capability.dependencies.AlexaMobileModule;
import com.amazon.alexa.seamlessswitching.capability.dependencies.CapabilityAgentModule;
import com.amazon.alexa.seamlessswitching.capability.dependencies.NetworkingModule;
import com.amazon.alexa.seamlessswitching.utils.ComponentEnabler;
import com.amazon.alexa.seamlessswitching.utils.LoggingUtils;
import dagger.Component;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class SeamlessSwitchingModule {
    public static final String TAG = LoggingUtils.getTag(SeamlessSwitchingModule.class);
    private final Context appContext;

    @Inject
    public IOComponentsBluetoothCapabilityAgent ioComponentsBluetoothCapabilityAgent;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Component(modules = {AccessoriesModule.class, AlexaMobileFrameworkModule.class, AlexaMobileModule.class, CapabilityAgentModule.class, NetworkingModule.class})
    @Singleton
    public interface Injector {
        void inject(SeamlessSwitchingModule seamlessSwitchingModule);
    }

    public SeamlessSwitchingModule(Context context) {
        this.appContext = context.getApplicationContext();
    }

    private void injectDependencies() {
        DaggerSeamlessSwitchingModule_Injector.builder().alexaMobileModule(new AlexaMobileModule(this.appContext)).build().inject(this);
    }

    @VisibleForTesting
    public FeatureServiceV2 getFeatureService() {
        Object obj;
        obj = ComponentRegistry.getInstance().getLazy(FeatureServiceV2.class).get();
        return (FeatureServiceV2) obj;
    }

    public void initialize() {
        String str = TAG;
        Log.i(str, "Initializing..");
        if (!getFeatureService().hasAccess(NativeFeatureRegistry.ALEXA_OTG_SEAMLESS_SWITCHING_ANDROID, false)) {
            Log.i(str, "Seamless Switching feature not enabled");
            ComponentEnabler.setServiceEnabled(this.appContext, (Class<?>) IOComponentsBluetoothCapabilityAgentService.class, false);
        } else {
            Log.i(str, "Seamless Switching feature enabled");
            ComponentEnabler.setServiceEnabled(this.appContext, (Class<?>) IOComponentsBluetoothCapabilityAgentService.class, true);
            injectDependencies();
            this.ioComponentsBluetoothCapabilityAgent.initialize();
        }
    }
}

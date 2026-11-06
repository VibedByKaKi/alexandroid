package com.amazon.alexa.seamlessswitching.capability.agent;

import android.content.Context;
import android.util.Log;
import com.amazon.alexa.accessoryclient.client.AlexaAccessoryClient;
import com.amazon.alexa.api.compat.AlexaMobileFrameworkApis;
import com.amazon.alexa.seamlessswitching.capability.bluetooth.IOComponentsBluetoothManager;
import com.amazon.alexa.seamlessswitching.capability.events.IOComponentsBluetoothEventSender;
import com.amazon.alexa.seamlessswitching.capability.state.IOComponentsBluetoothStateProvider;
import com.amazon.alexa.seamlessswitching.utils.LoggingUtils;
import com.google.gson.Gson;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes19.dex */
public class IOComponentsBluetoothCapabilityAgent {
    private static final String TAG = LoggingUtils.getTag(IOComponentsBluetoothCapabilityAgent.class);
    private final AlexaAccessoryClient accessoryClient;
    private final AlexaMobileFrameworkApis alexaMobileFrameworkApis;
    private final IOComponentsBluetoothDirectiveReceiver bluetoothDirectiveReceiver;
    private final IOComponentsBluetoothManager bluetoothManager;
    private final IOComponentsBluetoothStateProvider bluetoothStateProvider;
    private final Context context;
    private final IOComponentsBluetoothEventSender eventSender;
    private final Gson gson;

    public IOComponentsBluetoothCapabilityAgent(Context context, AlexaAccessoryClient alexaAccessoryClient, AlexaMobileFrameworkApis alexaMobileFrameworkApis, IOComponentsBluetoothManager iOComponentsBluetoothManager, IOComponentsBluetoothStateProvider iOComponentsBluetoothStateProvider, IOComponentsBluetoothDirectiveReceiver iOComponentsBluetoothDirectiveReceiver, IOComponentsBluetoothEventSender iOComponentsBluetoothEventSender, Gson gson) {
        this.context = context.getApplicationContext();
        this.accessoryClient = alexaAccessoryClient;
        this.alexaMobileFrameworkApis = alexaMobileFrameworkApis;
        this.bluetoothManager = iOComponentsBluetoothManager;
        this.bluetoothStateProvider = iOComponentsBluetoothStateProvider;
        this.bluetoothDirectiveReceiver = iOComponentsBluetoothDirectiveReceiver;
        this.eventSender = iOComponentsBluetoothEventSender;
        this.gson = gson;
    }

    public void initialize() {
        Log.i(TAG, "Initializing..");
        this.alexaMobileFrameworkApis.start();
        this.eventSender.initialize();
        this.bluetoothStateProvider.initialize();
        this.bluetoothManager.initialize();
        this.bluetoothDirectiveReceiver.register();
    }

    public void teardown() {
        this.alexaMobileFrameworkApis.stop();
        this.eventSender.teardown();
        this.bluetoothManager.teardown();
        this.bluetoothStateProvider.teardown();
        this.bluetoothDirectiveReceiver.unregister();
    }
}

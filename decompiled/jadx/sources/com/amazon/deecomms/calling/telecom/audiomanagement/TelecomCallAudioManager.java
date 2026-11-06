package com.amazon.deecomms.calling.telecom.audiomanagement;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.telecom.CallAudioState;
import android.telecom.Connection;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.Format$$ExternalSyntheticLambda0;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.api.metrics.CounterMetric;
import com.amazon.deecomms.call.active.ActiveVideoCallView$$ExternalSyntheticOutline0;
import com.amazon.deecomms.calling.enums.AudioRoutes;
import com.amazon.deecomms.calling.telecom.TelecomBridge;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.metrics.MetricsHelper;
import com.amazon.deecomms.common.util.Utils;
import com.amazon.deecomms.perms.PermissionsHelper;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class TelecomCallAudioManager {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, TelecomCallAudioManager.class);
    private final AudioManager audioManager;
    private Context context;
    private Connection currentConnection;
    private final TelecomBridge telecomBridge;

    @Inject
    public TelecomCallAudioManager(@NonNull TelecomBridge telecomBridge, @NonNull AudioManager audioManager, @NonNull Context context) {
        this.telecomBridge = telecomBridge;
        this.audioManager = audioManager;
        this.context = context;
    }

    @TargetApi(28)
    private List<BluetoothDevice> getBluetoothDevices() {
        if (!Utils.isPieAndAbove()) {
            return Collections.EMPTY_LIST;
        }
        Connection currentConnection = this.telecomBridge.getCurrentConnection();
        this.currentConnection = currentConnection;
        if (currentConnection == null) {
            return Collections.EMPTY_LIST;
        }
        CallAudioState callAudioState = currentConnection.getCallAudioState();
        return callAudioState == null ? Collections.EMPTY_LIST : (List) callAudioState.getSupportedBluetoothDevices();
    }

    private boolean haveBluetoothPermission() {
        int i = Build.VERSION.SDK_INT;
        Context context = this.context;
        return i <= 30 ? PermissionsHelper.checkPermission(context, "android.permission.BLUETOOTH") : PermissionsHelper.checkPermission(context, "android.permission.BLUETOOTH_CONNECT");
    }

    @TargetApi(28)
    public String getActiveBluetoothDevice() {
        CallAudioState callAudioState;
        Connection currentConnection = this.telecomBridge.getCurrentConnection();
        this.currentConnection = currentConnection;
        return (currentConnection == null || (callAudioState = currentConnection.getCallAudioState()) == null) ? "" : callAudioState.getActiveBluetoothDevice() == null ? AudioRoutes.BLUETOOTH.toString() : getBluetoothDeviceName(callAudioState);
    }

    @TargetApi(26)
    public String getActiveRoute() {
        CallAudioState callAudioState;
        Connection currentConnection = this.telecomBridge.getCurrentConnection();
        this.currentConnection = currentConnection;
        return (currentConnection == null || (callAudioState = currentConnection.getCallAudioState()) == null) ? "" : CallAudioState.audioRouteToString(callAudioState.getRoute());
    }

    public String getBluetoothDeviceName(CallAudioState callAudioState) {
        return haveBluetoothPermission() ? callAudioState.getActiveBluetoothDevice().getName() : AudioRoutes.BLUETOOTH.toString();
    }

    @TargetApi(26)
    public List<String> getSupportedAudioRoutes() {
        Connection currentConnection = this.telecomBridge.getCurrentConnection();
        this.currentConnection = currentConnection;
        if (currentConnection == null) {
            LOG.e("CurrentConnection was null");
            return Collections.EMPTY_LIST;
        }
        CallAudioState callAudioState = currentConnection.getCallAudioState();
        if (callAudioState == null) {
            LOG.e("CallAudioState was null");
            return Collections.EMPTY_LIST;
        }
        String audioRouteToString = CallAudioState.audioRouteToString(callAudioState.getSupportedRouteMask());
        LOG.i(" List of supported routes : " + audioRouteToString);
        ArrayList newArrayList = Lists.newArrayList(Splitter.on(AbstractJsonLexerKt.COMMA).trimResults().omitEmptyStrings().split(audioRouteToString));
        if (newArrayList.remove("WIRED_HEADSET")) {
            newArrayList.add(AudioRoutes.WIREDHEADSET.toString());
        }
        if (Utils.isPieAndAbove() && haveBluetoothPermission() && newArrayList.remove(AudioRoutes.BLUETOOTH.toString().toUpperCase())) {
            newArrayList.addAll(Lists.transform(getBluetoothDevices(), new Format$$ExternalSyntheticLambda0(20)));
        }
        return Lists.transform(newArrayList, new Format$$ExternalSyntheticLambda0(21));
    }

    @TargetApi(28)
    public void setActiveBluetoothDevice(@NonNull String str) {
        LOG.i("Setting active bluetooth audio route to : " + str);
        CounterMetric generateClickstream = CounterMetric.generateClickstream("comms.telecom.audiopicker.routeSelected");
        generateClickstream.getMetadata().put("EventValue", "BluetoothDevice");
        MetricsHelper.recordCounterMetric(generateClickstream, Double.valueOf(1.0d));
        for (BluetoothDevice bluetoothDevice : getBluetoothDevices()) {
            if (str.equalsIgnoreCase(bluetoothDevice.getName())) {
                setActiveBluetoothDevice(bluetoothDevice);
                return;
            }
        }
        ActiveVideoCallView$$ExternalSyntheticOutline0.m(LOG, "There was no bluetooth device found with the name : ", str);
    }

    @TargetApi(26)
    public void setAudioRoute(@NonNull String str) {
        LOG.i("Changing audio route to : " + str);
        CounterMetric generateClickstream = CounterMetric.generateClickstream("comms.telecom.audiopicker.routeSelected");
        generateClickstream.getMetadata().put("EventValue", str);
        MetricsHelper.recordCounterMetric(generateClickstream, Double.valueOf(1.0d));
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
            case "speaker":
                setAudioRoute(8);
                break;
            case "wired headset":
                setAudioRoute(4);
                break;
            case "earpiece":
                setAudioRoute(1);
                break;
            case "bluetooth":
                setAudioRoute(2);
                break;
            default:
                setAudioRoute(1);
                break;
        }
        TelecomAudioUtils.verifyRouteSelected(this.audioManager, str);
    }

    @TargetApi(26)
    public void setDefaultAudioRoute(boolean z) {
        Connection currentConnection = this.telecomBridge.getCurrentConnection();
        this.currentConnection = currentConnection;
        if (currentConnection == null) {
            LOG.e("Unable to set default audio route. There is no telecom connection");
            return;
        }
        CallAudioState callAudioState = currentConnection.getCallAudioState();
        if (callAudioState == null) {
            LOG.e("CallAudioState was null");
            return;
        }
        String audioRouteToString = CallAudioState.audioRouteToString(callAudioState.getSupportedRouteMask());
        LOG.i(" List of supported routes : " + audioRouteToString);
        if (audioRouteToString.contains("BLUETOOTH")) {
            setAudioRoute(2);
        } else if (audioRouteToString.contains("WIRED_HEADSET")) {
            setAudioRoute(5);
        } else if (z) {
            setAudioRoute(8);
        }
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(26)
    public void toggleSpeaker() {
        CallAudioState callAudioState;
        Connection currentConnection = this.telecomBridge.getCurrentConnection();
        this.currentConnection = currentConnection;
        if (currentConnection == null || (callAudioState = currentConnection.getCallAudioState()) == null) {
            return;
        }
        if (callAudioState.getRoute() == 1 || callAudioState.getRoute() == 4 || callAudioState.getRoute() == 5) {
            setAudioRoute(8);
        } else {
            setAudioRoute(5);
        }
    }

    @TargetApi(28)
    @VisibleForTesting
    public void setActiveBluetoothDevice(@NonNull BluetoothDevice bluetoothDevice) {
        Connection currentConnection = this.telecomBridge.getCurrentConnection();
        this.currentConnection = currentConnection;
        if (currentConnection != null) {
            currentConnection.requestBluetoothAudio(bluetoothDevice);
        }
    }

    @TargetApi(26)
    @VisibleForTesting
    public void setAudioRoute(int i) {
        Connection currentConnection = this.telecomBridge.getCurrentConnection();
        this.currentConnection = currentConnection;
        if (currentConnection != null) {
            currentConnection.setAudioRoute(i);
        }
    }
}

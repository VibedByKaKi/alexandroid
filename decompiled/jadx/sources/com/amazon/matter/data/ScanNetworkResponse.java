package com.amazon.matter.data;

import android.annotation.SuppressLint;
import android.util.Log;
import chip.devicecontroller.WiFiScanResult;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Optional;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SuppressFBWarnings({"URF_UNREAD_FIELD"})
/* loaded from: classes5.dex */
public class ScanNetworkResponse {
    private static final String TAG = "ScanNetworkResponse";
    private final ScanNetworkStatus scanNetworkStatus;
    private final boolean threadCapable;
    private final ArrayList<chip.devicecontroller.ThreadScanResult> threadScanResults;
    private final ArrayList<WiFiScanResult> wiFiScanResults;
    private final boolean wifiCapable;

    @SuppressLint({"NewApi"})
    public ScanNetworkResponse(ScanNetworkStatus scanNetworkStatus, boolean z, boolean z2, Optional<ArrayList<WiFiScanResult>> optional, Optional<ArrayList<chip.devicecontroller.ThreadScanResult>> optional2) {
        this.scanNetworkStatus = scanNetworkStatus;
        this.wifiCapable = z;
        this.threadCapable = z2;
        if (optional.isPresent()) {
            Log.i(TAG, "number of wifi results: " + optional.get().size());
            this.wiFiScanResults = optional.get();
        } else {
            Log.i(TAG, "no wifi results returned");
            this.wiFiScanResults = new ArrayList<>();
        }
        if (!optional2.isPresent()) {
            Log.i(TAG, "no thread results returned");
            this.threadScanResults = new ArrayList<>();
            return;
        }
        Log.i(TAG, "number of thread results: " + optional2.get().size());
        this.threadScanResults = optional2.get();
    }
}

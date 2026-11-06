package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.provider.Settings;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public class AndroidConnectivity implements Connectivity {
    private static final String TAG = "AndroidConnectivity";
    private Context context;
    protected boolean hasMobile;
    protected boolean hasWifi;
    protected boolean hasWired;
    protected boolean inAirplaneMode;

    public AndroidConnectivity(Context context) {
        this.context = context;
    }

    private void determineAvailability() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.context.getSystemService("connectivity");
        this.inAirplaneMode = Settings.System.getInt(this.context.getContentResolver(), "airplane_mode_on", 0) != 0;
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        this.hasWifi = false;
        this.hasWired = false;
        this.hasMobile = connectivityManager != null;
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.isConnectedOrConnecting()) {
                int type = activeNetworkInfo.getType();
                this.hasWired = type == 9;
                this.hasWifi = type == 1 || type == 6;
                this.hasMobile = type == 0 || type == 4 || type == 5 || type == 2 || type == 3;
            } else {
                this.hasMobile = false;
            }
        }
        String str = this.hasWifi ? "On Wifi" : this.hasMobile ? "On Mobile" : "No network connectivity";
        StringBuilder sb = new StringBuilder("Device Connectivity (");
        sb.append(str);
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
    }

    @Override // com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.Connectivity
    public boolean hasWAN() {
        return this.hasMobile && !this.inAirplaneMode;
    }

    @Override // com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.Connectivity
    public boolean hasWifi() {
        return this.hasWifi;
    }

    @Override // com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.Connectivity
    public boolean hasWired() {
        return this.hasWired;
    }

    @Override // com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.Connectivity
    public boolean isConnected() {
        determineAvailability();
        return hasWifi() || hasWAN() || hasWired();
    }
}

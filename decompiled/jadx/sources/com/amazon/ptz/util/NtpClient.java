package com.amazon.ptz.util;

import android.util.Log;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.IOException;
import java.net.InetAddress;
import lombok.Generated;
import org.apache.commons.net.ntp.NTPUDPClient;
import org.apache.commons.net.ntp.TimeInfo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class NtpClient {
    private static final String HOST = "time.google.com";
    private static final String TAG = LogTag.forClass(NtpClient.class);
    private static final int TIMEOUT_MILLISECONDS = 5000;
    private long offset;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface NtpListener {
        void onNtpOffsetReceived(long j);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public NtpClient() {
    }

    public static void getNtpOffset(NtpListener ntpListener) {
        new Thread(new NtpClient$$ExternalSyntheticLambda0(ntpListener, 0)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getNtpOffset$0(NtpListener ntpListener) {
        NtpClient ntpClient = new NtpClient();
        if (ntpClient.requestTime(HOST, 5000)) {
            ntpListener.onNtpOffsetReceived(ntpClient.offset);
        }
    }

    private boolean requestTime(String str, int i) {
        NTPUDPClient nTPUDPClient = new NTPUDPClient();
        nTPUDPClient.setDefaultTimeout(i);
        try {
            TimeInfo time = nTPUDPClient.getTime(InetAddress.getByName(str));
            time.computeDetails();
            if (time.getOffset() == null) {
                Log.e(TAG, "Unable to retrieve the NTP offset from remote NTP server");
                return false;
            }
            this.offset = time.getOffset().longValue();
            return true;
        } catch (IOException e) {
            Log.e(TAG, "Exception encountered when requesting NTP time: " + e.getMessage());
            return false;
        }
    }
}

package com.amazon.alexa.handsfree.audio.features;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.audio.AlexaExperienceHelper;
import com.amazon.alexa.handsfree.devices.DeviceTypeInformationProvider;
import com.amazon.alexa.handsfree.protocols.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class RemarkableAlexaAvailabilityResolver {
    private static final String AUTHORITY = "com.amazon.alexa.voice.handsfree.settings.providers.benefitsentitlementprovider";
    static final String BMCL_ENTITLEMENT_STATUS = "bmcl_entitlement_status";
    static final String BMCL_ENTITLEMENT_STATUS_PREF_FILE = "voice";
    static final String COLUMN_ENTITLEMENT_STATE = "entitlementState";
    static final String COLUMN_ENTITLEMENT_STATUS = "entitlementStatus";
    private static final int ENTITLEMENT_STATE_UNKNOWN = -1;
    private static final int KH_TABLET_MIN_SDK_INT = 35;
    static final String PREVIEW_ALEXA_APP = "com.amazon.dee.app.beta";
    private final Context mContext;
    private final DeviceTypeInformationProvider mDeviceTypeInformationProvider;
    static final Uri CONTENT_URI = Uri.parse("content://com.amazon.alexa.voice.handsfree.settings.providers.benefitsentitlementprovider/entitlement");
    private static final String TAG = "RemarkableAlexaAvailabilityResolver";
    private static volatile boolean sHasSeenEntitled = false;

    public RemarkableAlexaAvailabilityResolver(Context context) {
        this(context, DeviceTypeInformationProvider.getInstance(context));
    }

    private boolean getBMCLEntitlementStatus() {
        boolean readEntitlementStatus = readEntitlementStatus(this.mContext);
        Log.i(TAG, "getBMCLEntitlementStatus(): " + readEntitlementStatus);
        return readEntitlementStatus;
    }

    private boolean readEntitlementStatusForKHTablet() {
        try {
            Cursor query = this.mContext.getContentResolver().query(CONTENT_URI, null, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        int columnIndex = query.getColumnIndex("entitlementState");
                        if (columnIndex == -1 || query.getInt(columnIndex) != -1) {
                            int columnIndex2 = query.getColumnIndex("entitlementStatus");
                            if (columnIndex2 == -1) {
                                Log.w(TAG, "readEntitlementStatusForKHTablet | entitlementStatus column missing");
                            } else if (query.getInt(columnIndex2) == 1) {
                                sHasSeenEntitled = true;
                            } else {
                                if (sHasSeenEntitled) {
                                    query.close();
                                    return false;
                                }
                                Log.i(TAG, "readEntitlementStatusForKHTablet | preserving default, possible premature response");
                            }
                        } else {
                            Log.d(TAG, "readEntitlementStatusForKHTablet | entitlement unknown, preserving default");
                        }
                        query.close();
                        return true;
                    }
                } finally {
                }
            }
            Log.d(TAG, "readEntitlementStatusForKHTablet | no data (null or empty cursor), preserving default");
            if (query == null) {
                return true;
            }
            query.close();
            return true;
        } catch (Exception e) {
            Log.e(TAG, "Error reading entitlement status", e, new Object[0]);
            return true;
        }
    }

    @VisibleForTesting
    public static void resetHasSeenEntitledForTesting() {
        sHasSeenEntitled = false;
    }

    @VisibleForTesting
    public boolean isGeminiAvailable() {
        return AlexaExperienceHelper.isGeminiAvailable(this.mContext);
    }

    @VisibleForTesting
    public boolean isKHTablet() {
        return this.mDeviceTypeInformationProvider.getSupportedDeviceInformation(this.mContext).isFireOS() && Build.VERSION.SDK_INT >= 35;
    }

    public synchronized boolean isRemarkableAlexaEnabled() {
        boolean isFireOS = this.mDeviceTypeInformationProvider.getSupportedDeviceInformation(this.mContext).isFireOS();
        boolean isGeminiAvailable = isGeminiAvailable();
        if (isFireOS && !isGeminiAvailable) {
            if ("com.amazon.dee.app.beta".equals(this.mContext.getPackageName())) {
                Log.i(TAG, "hardcoding the resolver to return true because we're in preview app");
                return true;
            }
            if (getBMCLEntitlementStatus()) {
                Log.i(TAG, "Remarkable Alexa is enabled");
                return true;
            }
            Log.i(TAG, "Remarkable Alexa is not enabled since it is not BMCL entitled");
            return false;
        }
        String str = TAG;
        StringBuilder sb = new StringBuilder("Remarkable Alexa is false | isFireOs = ");
        sb.append(isFireOS);
        sb.append(" !isGeminiAvailable = ");
        sb.append(!isGeminiAvailable);
        Log.i(str, sb.toString());
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0032, code lost:
    
        if (r6.getInt(r0) == 1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean readEntitlementStatus(android.content.Context r7) {
        /*
            r6 = this;
            boolean r7 = r6.isKHTablet()
            if (r7 == 0) goto Lb
            boolean r6 = r6.readEntitlementStatusForKHTablet()
            return r6
        Lb:
            r7 = 0
            android.content.Context r6 = r6.mContext     // Catch: java.lang.Exception -> L41
            android.content.ContentResolver r0 = r6.getContentResolver()     // Catch: java.lang.Exception -> L41
            android.net.Uri r1 = com.amazon.alexa.handsfree.audio.features.RemarkableAlexaAvailabilityResolver.CONTENT_URI     // Catch: java.lang.Exception -> L41
            r4 = 0
            r5 = 0
            r2 = 0
            r3 = 0
            android.database.Cursor r6 = r0.query(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L41
            if (r6 == 0) goto L45
            boolean r0 = r6.moveToFirst()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L45
            java.lang.String r0 = "entitlementStatus"
            int r0 = r6.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L35
            r1 = -1
            if (r0 == r1) goto L45
            int r0 = r6.getInt(r0)     // Catch: java.lang.Throwable -> L35
            r1 = 1
            if (r0 != r1) goto L45
            goto L46
        L35:
            r0 = move-exception
            r1 = r0
            r6.close()     // Catch: java.lang.Throwable -> L3b
            goto L40
        L3b:
            r0 = move-exception
            r6 = r0
            r1.addSuppressed(r6)     // Catch: java.lang.Exception -> L41
        L40:
            throw r1     // Catch: java.lang.Exception -> L41
        L41:
            r0 = move-exception
            r6 = r0
            r1 = r7
            goto L50
        L45:
            r1 = r7
        L46:
            if (r6 == 0) goto L4f
            r6.close()     // Catch: java.lang.Exception -> L4c
            return r1
        L4c:
            r0 = move-exception
            r6 = r0
            goto L50
        L4f:
            return r1
        L50:
            java.lang.String r0 = com.amazon.alexa.handsfree.audio.features.RemarkableAlexaAvailabilityResolver.TAG
            java.lang.String r2 = "Error reading entitlement status"
            java.lang.Object[] r7 = new java.lang.Object[r7]
            com.amazon.alexa.handsfree.protocols.utils.Log.e(r0, r2, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.handsfree.audio.features.RemarkableAlexaAvailabilityResolver.readEntitlementStatus(android.content.Context):boolean");
    }

    @VisibleForTesting
    public RemarkableAlexaAvailabilityResolver(Context context, DeviceTypeInformationProvider deviceTypeInformationProvider) {
        this.mContext = context;
        this.mDeviceTypeInformationProvider = deviceTypeInformationProvider;
    }
}

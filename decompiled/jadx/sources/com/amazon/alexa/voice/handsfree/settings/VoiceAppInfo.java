package com.amazon.alexa.voice.handsfree.settings;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.mobile.assistant.capabilities.iocomponents.MotoIOComponentsStateProvider;
import com.amazon.alexa.mobile.assistant.capabilities.iocomponents.QualcommIOComponentsStateProvider;
import com.amazon.alexa.voice.handsfree.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.amazon.alexa.voice.handsfree.settings.VoiceAppInfo, still in use, count: 1, list:
  (r0v0 com.amazon.alexa.voice.handsfree.settings.VoiceAppInfo) from 0x004c: INVOKE 
  (r2v6 java.util.HashMap)
  (wrap:java.lang.String:SGET  A[WRAPPED] com.amazon.alexa.voice.handsfree.settings.VoiceAppInfo.MOTOROLA_MANUFACTURER_NAME java.lang.String)
  (r0v0 com.amazon.alexa.voice.handsfree.settings.VoiceAppInfo)
 INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:77)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class VoiceAppInfo {
    MOTOROLA(MotoIOComponentsStateProvider.MOTOALEXA_PACKAGE_NAME, "Moto Voice for Alexa", "Moto", true, true),
    QUALCOMM(QualcommIOComponentsStateProvider.QUALCOMM_PACKAGE_NAME, "Qualcomm Voice Assist", "Qualcomm", false, false),
    FIRE_TABLET("com.amazon.tablet.voiceassistant", "Fire Tablets", "FireTablets", false, false);


    @VisibleForTesting
    static final String LGE_MANUFACTURER_NAME = "LGE";
    static final Map<String, VoiceAppInfo> MANUFACTURER_TO_VOICE_APP_INFO_MAP;

    @VisibleForTesting
    static final String MOTOROLA_MANUFACTURER_NAME = "motorola";
    public static final int SETTINGS_RES_ID;
    static final String SONY_MANUFACTURER_NAME = "Sony";
    private static final String TAG;
    private final String mAbbreviatedName;
    private final String mAppName;
    private final boolean mHandlesHandsFreeSetup;
    private final String mPackageName;
    private final boolean mShouldPromptCustomerDownload;

    static {
        VoiceAppInfo voiceAppInfo = QUALCOMM;
        TAG = "VoiceAppInfo";
        SETTINGS_RES_ID = R.string.handsfreeSettingsId;
        HashMap hashMap = new HashMap();
        MANUFACTURER_TO_VOICE_APP_INFO_MAP = hashMap;
        hashMap.put(MOTOROLA_MANUFACTURER_NAME, r0);
        hashMap.put(SONY_MANUFACTURER_NAME, voiceAppInfo);
        hashMap.put(LGE_MANUFACTURER_NAME, voiceAppInfo);
    }

    private VoiceAppInfo(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull boolean z, @NonNull boolean z2) {
        this.mAppName = str2;
        this.mPackageName = str;
        this.mAbbreviatedName = str3;
        this.mShouldPromptCustomerDownload = z;
        this.mHandlesHandsFreeSetup = z2;
    }

    @Nullable
    public static VoiceAppInfo getVoiceAppInfo(@NonNull String str) {
        return MANUFACTURER_TO_VOICE_APP_INFO_MAP.get(str);
    }

    public static VoiceAppInfo valueOf(String str) {
        return (VoiceAppInfo) Enum.valueOf(VoiceAppInfo.class, str);
    }

    public static VoiceAppInfo[] values() {
        return (VoiceAppInfo[]) $VALUES.clone();
    }

    @NonNull
    public String getAbbreviatedName() {
        return this.mAbbreviatedName;
    }

    @NonNull
    public String getAppName() {
        return this.mAppName;
    }

    @NonNull
    public String getPackageName() {
        return this.mPackageName;
    }

    @NonNull
    public boolean handlesHandsFreeSetup() {
        return this.mHandlesHandsFreeSetup;
    }

    public boolean isInstalledAndSupportsHandsFreeSetting(@NonNull Context context) {
        Iterator<ResolveInfo> it2 = context.getPackageManager().queryIntentActivities(new Intent(context.getString(SETTINGS_RES_ID)), 0).iterator();
        while (it2.hasNext()) {
            if (this.mPackageName.equals(it2.next().activityInfo.packageName)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public boolean shouldPromptCustomerDownload() {
        return this.mShouldPromptCustomerDownload;
    }
}

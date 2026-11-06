package com.amazon.alexa.voice.metrics;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.voice.model.VoiceService;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class VoxLaunchConstants {
    public static final String BS_MICROPHONE_CLICK = "BS_MICROPHONE_CLICK";
    public static final String C_DEFAULT = "C_DEFAULT";
    public static final String DEVICE_ASSIST = "DEVICE_ASSIST";
    public static final String DRIVE_MODE_TAP = "DRIVE_MODE_TAP";
    public static final String INTENT = "INTENT";
    public static final String IN_APP_WAKEWORD = "WAKEWORD";
    public static final String JASPER_CARD = "jasperhomevoxcard";
    public static final String JASPER_HEADER = "jasperhomeheader";
    public static final Map<String, String> LAUNCH_TYPE_METHOD_MAP;
    public static final String PUSH_BUTTON = "PUSH_BUTTON";
    public static final String QUICK_ACTIONS_WIDGET = "QUICK_ACTIONS_WIDGET";
    public static final String QUICK_SETTINGS_TILE = "QUICK_SETTINGS_TILE";
    public static final String REQUEST_PERMISSIONS = "REQUEST_PERMISSIONS";
    public static final String ROUTE = "ROUTE";
    public static final String SETTINGS = "SETTINGS";
    public static final String SHORTCUT = "SHORTCUT";
    public static final String UNKNOWN = "UNKNOWN";
    public static final String VOICE_ENROLLMENT = "VOICE_ENROLLMENT";
    public static final String VOICE_INGRESS = "VOICE_INGRESS";
    public static final String VOX_LAUNCH_BS_MICROPHONE_CLICK = "VOX_LAUNCH_BS_MICROPHONE_CLICK";
    public static final String VOX_LAUNCH_DEVICE_ASSIST = "VOX_LAUNCH_DEVICE_ASSIST";
    public static final String VOX_LAUNCH_DRIVE_MODE_TAP = "VOX_LAUNCH_DRIVE_MODE_TAP";
    public static final String VOX_LAUNCH_INGRESS_BUTTON = "VOX_LAUNCH_INGRESS";
    public static final String VOX_LAUNCH_LISTEN_ENROLLMENT = "VOX_LAUNCH_LISTEN_ENROLLMENT";
    public static final String VOX_LAUNCH_LISTEN_INTENT = "VOX_LAUNCH_LISTEN_INTENT";
    public static final String VOX_LAUNCH_NOTIFICATION = "VOX_LAUNCH_NOTIFICATION";
    public static final String VOX_LAUNCH_PUSHBUTTON = "VOX_LAUNCH_PUSHBUTTON";
    public static final String VOX_LAUNCH_QUICK_ACTIONS_WIDGET = "VOX_LAUNCH_QUICK_ACTIONS_WIDGET";
    public static final String VOX_LAUNCH_QUICK_SETTINGS_TILE = "VOX_LAUNCH_QUICK_SETTINGS_TILE";
    public static final String VOX_LAUNCH_REQUEST_PERMISSIONS = "VOX_LAUNCH_REQUEST_PERMISSIONS";
    public static final String VOX_LAUNCH_ROUTE = "VOX_LAUNCH_ROUTE";
    public static final String VOX_LAUNCH_SETTINGS = "VOX_LAUNCH_SETTINGS";
    public static final String VOX_LAUNCH_SHORTCUT = "VOX_LAUNCH_SHORTCUT";

    @VisibleForTesting
    static final Map<VoiceService.InvocationType, String> VOX_LAUNCH_TYPE_FROM_INVOCATION_MAP;
    public static final String VOX_LAUNCH_WAKEWORD = "VOX_LAUNCH_WAKEWORD";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface VoxLaunchTypes {
    }

    static {
        HashMap hashMap = new HashMap();
        LAUNCH_TYPE_METHOD_MAP = hashMap;
        hashMap.put("INGRESS_IN_APP_WAKEWORD_OCCUR", IN_APP_WAKEWORD);
        hashMap.put(VOX_LAUNCH_SETTINGS, "SETTINGS");
        hashMap.put(VOX_LAUNCH_SHORTCUT, SHORTCUT);
        hashMap.put(VOX_LAUNCH_QUICK_ACTIONS_WIDGET, "QUICK_ACTIONS_WIDGET");
        hashMap.put(VOX_LAUNCH_DEVICE_ASSIST, DEVICE_ASSIST);
        hashMap.put(VOX_LAUNCH_INGRESS_BUTTON, VOICE_INGRESS);
        hashMap.put(VOX_LAUNCH_PUSHBUTTON, PUSH_BUTTON);
        hashMap.put(VOX_LAUNCH_REQUEST_PERMISSIONS, REQUEST_PERMISSIONS);
        hashMap.put(VOX_LAUNCH_ROUTE, ROUTE);
        hashMap.put(VOX_LAUNCH_DRIVE_MODE_TAP, DRIVE_MODE_TAP);
        hashMap.put(VOX_LAUNCH_LISTEN_ENROLLMENT, VOICE_ENROLLMENT);
        hashMap.put(VOX_LAUNCH_BS_MICROPHONE_CLICK, BS_MICROPHONE_CLICK);
        hashMap.put(VOX_LAUNCH_QUICK_SETTINGS_TILE, QUICK_SETTINGS_TILE);
        HashMap hashMap2 = new HashMap();
        VOX_LAUNCH_TYPE_FROM_INVOCATION_MAP = hashMap2;
        hashMap2.put(VoiceService.InvocationType.SHORTCUT, SHORTCUT);
        hashMap2.put(VoiceService.InvocationType.QUICK_ACTIONS_WIDGET, "QUICK_ACTIONS_WIDGET");
        hashMap2.put(VoiceService.InvocationType.INTENT, INTENT);
        hashMap2.put(VoiceService.InvocationType.VOICE_COMMAND_INTENT, INTENT);
        hashMap2.put(VoiceService.InvocationType.ANDROID_VOICE_SEARCH_INTENT, INTENT);
        hashMap2.put(VoiceService.InvocationType.PUSH_BUTTON, PUSH_BUTTON);
        hashMap2.put(VoiceService.InvocationType.DEVICE_ASSISTANT, DEVICE_ASSIST);
        hashMap2.put(VoiceService.InvocationType.APP_INGRESS, VOICE_INGRESS);
        hashMap2.put(VoiceService.InvocationType.ROUTE, ROUTE);
        hashMap2.put(VoiceService.InvocationType.VOICE_ENROLLMENT, VOICE_ENROLLMENT);
        hashMap2.put(VoiceService.InvocationType.DRIVE_MODE_TAP, DRIVE_MODE_TAP);
        hashMap2.put(VoiceService.InvocationType.UNKNOWN, "UNKNOWN");
        hashMap2.put(VoiceService.InvocationType.BS_MICROPHONE_CLICK, BS_MICROPHONE_CLICK);
        hashMap2.put(VoiceService.InvocationType.QUICK_SETTINGS_TILE, QUICK_SETTINGS_TILE);
    }

    private VoxLaunchConstants() {
    }

    public static String getLaunchType(VoiceService.InvocationType invocationType) {
        return VOX_LAUNCH_TYPE_FROM_INVOCATION_MAP.get(invocationType);
    }
}

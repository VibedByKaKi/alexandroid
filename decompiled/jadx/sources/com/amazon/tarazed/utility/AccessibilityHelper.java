package com.amazon.tarazed.utility;

import android.content.Context;
import android.hardware.input.InputManager;
import android.media.AudioAttributes;
import android.speech.tts.TextToSpeech;
import android.view.InputDevice;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.amazon.tarazed.utility.AccessibilityManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/amazon/tarazed/utility/AccessibilityHelper;", "", "()V", "accessibilityManager", "Lcom/amazon/tarazed/utility/AccessibilityManager;", "textToSpeech", "Landroid/speech/tts/TextToSpeech;", "announceForAccessibility1P", "", "context", "Landroid/content/Context;", "message", "", "announceForAccessibility3P", "view", "Landroid/view/View;", "isAccessibilityEnabled", "", "isPhysicalKeyboardConnected", "setAccessibilityManager", "DefaultAccessibilityManager", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class AccessibilityHelper {

    @NotNull
    public static final AccessibilityHelper INSTANCE;
    private static AccessibilityManager accessibilityManager;

    @Nullable
    private static TextToSpeech textToSpeech;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/amazon/tarazed/utility/AccessibilityHelper$DefaultAccessibilityManager;", "Lcom/amazon/tarazed/utility/AccessibilityManager;", "()V", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultAccessibilityManager implements AccessibilityManager {
        @Override // com.amazon.tarazed.utility.AccessibilityManager
        public boolean isEnabled(@NotNull Context context) {
            return AccessibilityManager.DefaultImpls.isEnabled(this, context);
        }
    }

    static {
        AccessibilityHelper accessibilityHelper = new AccessibilityHelper();
        INSTANCE = accessibilityHelper;
        accessibilityHelper.setAccessibilityManager(new DefaultAccessibilityManager());
    }

    private AccessibilityHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void announceForAccessibility1P$lambda$0(Context context, CharSequence charSequence, int i) {
        context.getClass();
        charSequence.getClass();
        AccessibilityManager accessibilityManager2 = accessibilityManager;
        if (accessibilityManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("accessibilityManager");
            accessibilityManager2 = null;
        }
        if (accessibilityManager2.isEnabled(context)) {
            TextToSpeech textToSpeech2 = textToSpeech;
            if (textToSpeech2 != null) {
                textToSpeech2.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build());
            }
            AnnounceHelper.INSTANCE.speakText(textToSpeech, context, charSequence);
        }
    }

    public final void announceForAccessibility1P(@NotNull final Context context, @NotNull final CharSequence message) {
        context.getClass();
        message.getClass();
        AccessibilityManager accessibilityManager2 = accessibilityManager;
        if (accessibilityManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("accessibilityManager");
            accessibilityManager2 = null;
        }
        if (accessibilityManager2.isEnabled(context)) {
            if (textToSpeech == null) {
                textToSpeech = new TextToSpeech(context, new TextToSpeech.OnInitListener() { // from class: com.amazon.tarazed.utility.AccessibilityHelper$$ExternalSyntheticLambda0
                    @Override // android.speech.tts.TextToSpeech.OnInitListener
                    public final void onInit(int i) {
                        AccessibilityHelper.announceForAccessibility1P$lambda$0(context, message, i);
                    }
                });
            } else {
                AnnounceHelper.INSTANCE.speakText(textToSpeech, context, message);
            }
        }
    }

    public final void announceForAccessibility3P(@NotNull Context context, @NotNull View view, @NotNull CharSequence message) {
        context.getClass();
        view.getClass();
        message.getClass();
        AccessibilityManager accessibilityManager2 = accessibilityManager;
        if (accessibilityManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("accessibilityManager");
            accessibilityManager2 = null;
        }
        if (accessibilityManager2.isEnabled(context)) {
            AnnounceHelper announceHelper = AnnounceHelper.INSTANCE;
            AccessibilityEvent obtainAnnouncementAccessibilityEvent = announceHelper.obtainAnnouncementAccessibilityEvent();
            announceHelper.obtainViewAccessibilityDelegate().onInitializeAccessibilityEvent(view, obtainAnnouncementAccessibilityEvent);
            obtainAnnouncementAccessibilityEvent.getText().add(message);
            view.getParent().requestSendAccessibilityEvent(view, obtainAnnouncementAccessibilityEvent);
        }
    }

    public final boolean isAccessibilityEnabled(@NotNull Context context) {
        context.getClass();
        AccessibilityManager accessibilityManager2 = accessibilityManager;
        if (accessibilityManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("accessibilityManager");
            accessibilityManager2 = null;
        }
        return accessibilityManager2.isEnabled(context);
    }

    public final boolean isPhysicalKeyboardConnected(@NotNull Context context) {
        context.getClass();
        Object systemService = context.getSystemService("input");
        systemService.getClass();
        int[] inputDeviceIds = ((InputManager) systemService).getInputDeviceIds();
        inputDeviceIds.getClass();
        for (int i : inputDeviceIds) {
            InputDevice device = InputDevice.getDevice(i);
            if (device != null && !device.isVirtual() && device.getKeyboardType() == 2) {
                return true;
            }
        }
        return false;
    }

    public final void setAccessibilityManager(@NotNull AccessibilityManager accessibilityManager2) {
        accessibilityManager2.getClass();
        accessibilityManager = accessibilityManager2;
    }
}

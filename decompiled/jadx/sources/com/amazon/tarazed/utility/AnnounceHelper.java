package com.amazon.tarazed.utility;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.UUID;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J \u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, d2 = {"Lcom/amazon/tarazed/utility/AnnounceHelper;", "", "()V", "obtainAnnouncementAccessibilityEvent", "Landroid/view/accessibility/AccessibilityEvent;", "obtainViewAccessibilityDelegate", "Landroid/view/View$AccessibilityDelegate;", "speakText", "", "textToSpeech", "Landroid/speech/tts/TextToSpeech;", "context", "Landroid/content/Context;", "message", "", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class AnnounceHelper {

    @NotNull
    public static final AnnounceHelper INSTANCE = new AnnounceHelper();

    private AnnounceHelper() {
    }

    @NotNull
    public final AccessibilityEvent obtainAnnouncementAccessibilityEvent() {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
        obtain.getClass();
        return obtain;
    }

    @NotNull
    public final View.AccessibilityDelegate obtainViewAccessibilityDelegate() {
        return new View.AccessibilityDelegate();
    }

    public final void speakText(@Nullable TextToSpeech textToSpeech, @NotNull Context context, @NotNull CharSequence message) {
        context.getClass();
        message.getClass();
        if (textToSpeech != null) {
            textToSpeech.setLanguage(context.getResources().getConfiguration().getLocales().get(0));
        }
        if (textToSpeech != null) {
            textToSpeech.speak(message, 1, null, UUID.randomUUID().toString());
        }
    }
}

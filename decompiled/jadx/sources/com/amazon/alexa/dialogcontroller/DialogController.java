package com.amazon.alexa.dialogcontroller;

import androidx.annotation.Nullable;
import com.amazon.alexa.api.AlexaAudioSink;
import com.amazon.alexa.api.AlexaDialogExtras;
import com.amazon.alexa.api.AlexaWakeWord;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface DialogController {
    void addLifecycleCallbacks(DialogLifecycleCallbacks dialogLifecycleCallbacks);

    boolean isInDialog();

    boolean isInterruptable();

    boolean isMultiturn();

    void release();

    void removeLifecycleCallbacks(DialogLifecycleCallbacks dialogLifecycleCallbacks);

    boolean startDialog(AlexaDialogExtras alexaDialogExtras) throws IOException;

    boolean startDialog(AlexaDialogExtras alexaDialogExtras, AlexaAudioSink alexaAudioSink, @Nullable AlexaWakeWord alexaWakeWord);

    void stopCurrentDialogTurn();
}

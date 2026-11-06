package com.amazon.alexa.voiceui.ra;

import android.os.Handler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ConversationSessionTimer {
    private static final int CLEAR_MESSAGE_DELAY = 300000;
    private static final Handler HANDLER = new Handler();
    private static final String TAG = "ConversationSessionTimer";
    private Runnable clearMessageHistoryTask;

    public void initialize(Runnable runnable) {
        this.clearMessageHistoryTask = runnable;
        Handler handler = HANDLER;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(this.clearMessageHistoryTask, 300000L);
    }

    public void resetTimer() {
        Handler handler = HANDLER;
        handler.removeCallbacks(this.clearMessageHistoryTask);
        handler.postDelayed(this.clearMessageHistoryTask, 300000L);
    }
}

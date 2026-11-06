package com.amazon.alexa.voiceui.ra;

import androidx.annotation.Nullable;
import com.amazon.alexa.voice.tta.metrics.EventTime;
import com.amazon.alexa.voice.tta.metrics.MetricEventProcessingService;
import com.amazon.alexa.voice.tta.metrics.TtaConversationEvent;
import com.amazon.alexa.voice.ui.tta.TtaLivePreviewMessage;
import com.amazon.alexa.voice.ui.tta.TtaMessage;
import com.amazon.alexa.voice.ui.tta.TtaResponseMessage;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MessageHistoryManager {
    public static final /* synthetic */ int $r8$clinit = 0;
    private static final List<TtaMessage> MESSAGE_HISTORY = new CopyOnWriteArrayList();
    private static final String TAG = "MessageHistoryManager";
    private final ConversationSessionTimer conversationSessionTimer;
    private final MetricEventProcessingService eventProcessingService;

    @Nullable
    private MessageHistoryListener messageHistoryListener;
    private boolean userIsInRa;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class ClearMessageHistoryTask implements Runnable {
        public ClearMessageHistoryTask() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = MessageHistoryManager.$r8$clinit;
            MessageHistoryManager.this.clearMessageHistory();
            MessageHistoryManager.this.clearConversationUi();
        }
    }

    public MessageHistoryManager(ConversationSessionTimer conversationSessionTimer, MetricEventProcessingService metricEventProcessingService) {
        this.conversationSessionTimer = conversationSessionTimer;
        this.eventProcessingService = metricEventProcessingService;
    }

    private int findResponseMessageBasedOnId(TtaMessage ttaMessage) {
        int i;
        boolean z = ttaMessage instanceof TtaResponseMessage;
        if (!z && !(ttaMessage instanceof TtaLivePreviewMessage)) {
            return -1;
        }
        String id = z ? ((TtaResponseMessage) ttaMessage).getId() : ((TtaLivePreviewMessage) ttaMessage).getId();
        while (true) {
            List<TtaMessage> list = MESSAGE_HISTORY;
            if (i >= list.size()) {
                return -1;
            }
            TtaMessage ttaMessage2 = list.get(i);
            i = (((ttaMessage2 instanceof TtaResponseMessage) && ((TtaResponseMessage) ttaMessage2).getId().contentEquals(id)) || ((ttaMessage2 instanceof TtaLivePreviewMessage) && ((TtaLivePreviewMessage) ttaMessage2).getId().contentEquals(id))) ? 0 : i + 1;
        }
        return i;
    }

    private boolean updateToMessageHistory(TtaMessage ttaMessage) {
        int findResponseMessageBasedOnId = findResponseMessageBasedOnId(ttaMessage);
        if (findResponseMessageBasedOnId == -1) {
            return false;
        }
        MESSAGE_HISTORY.set(findResponseMessageBasedOnId, ttaMessage);
        return true;
    }

    public void appendToMessageHistory(TtaMessage ttaMessage) {
        if (this.userIsInRa && !updateToMessageHistory(ttaMessage)) {
            MESSAGE_HISTORY.add(ttaMessage);
        }
    }

    public void cleanUp() {
        clearMessageHistory();
    }

    public void clearConversationUi() {
        MessageHistoryListener messageHistoryListener = this.messageHistoryListener;
        if (messageHistoryListener != null) {
            messageHistoryListener.onClearConversationUi();
        }
    }

    public void clearMessageHistory() {
        MESSAGE_HISTORY.clear();
    }

    public void pullMessageHistory() {
        List<TtaMessage> list = MESSAGE_HISTORY;
        if (list.isEmpty()) {
            clearMessageHistory();
        } else {
            this.eventProcessingService.processEvent(TtaConversationEvent.MESSAGE_HISTORY_SHOWN, EventTime.now());
        }
        MessageHistoryListener messageHistoryListener = this.messageHistoryListener;
        if (messageHistoryListener != null) {
            messageHistoryListener.onMessageHistory(list);
        }
    }

    public void setMessageHistoryListener(MessageHistoryListener messageHistoryListener) {
        this.messageHistoryListener = messageHistoryListener;
    }

    public void setUserIsInRa(boolean z) {
        this.userIsInRa = z;
    }

    public void startConversationSessionTimer() {
        this.conversationSessionTimer.initialize(new ClearMessageHistoryTask());
    }

    public void updateMessageHistoryOnResponse(TtaResponseMessage ttaResponseMessage) {
        appendToMessageHistory(ttaResponseMessage);
        this.conversationSessionTimer.resetTimer();
    }
}

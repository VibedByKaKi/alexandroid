package com.amazon.alexa.voice.ui.onedesign.bottomsheet;

import android.os.Handler;
import android.util.Log;
import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationResponseItem;
import java.util.Deque;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ConversationResponseStreamer {
    private static final String TAG = "CRS";
    private static final long WORD_STREAM_DELAY = 50;
    private ConversationResponseItem conversationResponseItemBeingStreamed;
    private Deque<String> conversationResponseItems = new ConcurrentLinkedDeque();
    private ConversationResponseItem currentConversationItem;
    private Handler handler;
    private ResponseStreamListener responseStreamListener;
    private static final Pattern REGEX_WORD = Pattern.compile("\\s*\\S*");
    private static final Pattern REGEX_ENDS_WITH_NON_SPACE = Pattern.compile(".*\\S", 32);
    private static final Pattern REGEX_STARTS_WITH_NON_SPACE = Pattern.compile("\\S.*", 32);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ResponseStreamListener {
        void onResponseUpdated(ConversationResponseItem conversationResponseItem);
    }

    public ConversationResponseStreamer(@NonNull ResponseStreamListener responseStreamListener, @NonNull Handler handler) {
        this.responseStreamListener = responseStreamListener;
        this.handler = handler;
    }

    private static String concatenateWithProperDelimiter(CharSequence charSequence, CharSequence charSequence2) {
        return ((Object) charSequence) + ((REGEX_ENDS_WITH_NON_SPACE.matcher(charSequence).matches() && REGEX_STARTS_WITH_NON_SPACE.matcher(charSequence2).matches()) ? " " : "") + ((Object) charSequence2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ConversationResponseItem getAsConversationResponseItem(String str, String str2) {
        return ConversationResponseItem.builder().itemText(concatenateWithProperDelimiter(str, str2)).itemDialogRequestId(this.currentConversationItem.getItemDialogRequestId()).itemId(this.currentConversationItem.getItemId()).itemPosition(this.currentConversationItem.getItemPosition()).longPressAction(this.currentConversationItem.getLongPressAction()).remarkableAlexaStyleEnabled(this.currentConversationItem.isRemarkableAlexaStyleEnabled()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable wordUpdateRunnable() {
        return new Runnable() { // from class: com.amazon.alexa.voice.ui.onedesign.bottomsheet.ConversationResponseStreamer.1
            @Override // java.lang.Runnable
            public void run() {
                ConversationResponseStreamer.this.conversationResponseItems.size();
                String charSequence = ConversationResponseStreamer.this.conversationResponseItemBeingStreamed != null ? ConversationResponseStreamer.this.conversationResponseItemBeingStreamed.getItemText().toString() : "";
                if (ConversationResponseStreamer.this.conversationResponseItems.peek() != null) {
                    ConversationResponseStreamer conversationResponseStreamer = ConversationResponseStreamer.this;
                    conversationResponseStreamer.conversationResponseItemBeingStreamed = conversationResponseStreamer.getAsConversationResponseItem(charSequence, (String) conversationResponseStreamer.conversationResponseItems.remove());
                    ConversationResponseStreamer.this.responseStreamListener.onResponseUpdated(ConversationResponseStreamer.this.conversationResponseItemBeingStreamed);
                    ConversationResponseStreamer.this.handler.postDelayed(ConversationResponseStreamer.this.wordUpdateRunnable(), 50L);
                }
            }
        };
    }

    public void cleanUp() {
        this.conversationResponseItemBeingStreamed = null;
        this.conversationResponseItems.clear();
        this.currentConversationItem = null;
    }

    public ConversationResponseItem getConversationInProgressAndStopStreaming() {
        this.handler.removeCallbacks(null);
        return this.currentConversationItem;
    }

    public synchronized ConversationResponseItem streamWordByWordForResponse(ConversationResponseItem conversationResponseItem) {
        String str;
        try {
            this.handler.removeCallbacks(null);
            conversationResponseItem.isStreamingEnabled();
            boolean isStreamingEnabled = conversationResponseItem.isStreamingEnabled();
            ConversationResponseItem conversationResponseItem2 = this.currentConversationItem;
            if (!isStreamingEnabled) {
                boolean hasSameDialogRequestId = conversationResponseItem.hasSameDialogRequestId(conversationResponseItem2);
                ConversationResponseItem conversationResponseItem3 = hasSameDialogRequestId ? this.currentConversationItem : conversationResponseItem;
                this.currentConversationItem = conversationResponseItem3;
                if (hasSameDialogRequestId) {
                    str = concatenateWithProperDelimiter(conversationResponseItem3.getItemText(), conversationResponseItem.getItemText());
                } else {
                    str = "" + ((Object) conversationResponseItem.getItemText());
                }
                ConversationResponseItem build = ConversationResponseItem.builder().itemText(str).itemPosition(this.currentConversationItem.getItemPosition()).itemId(this.currentConversationItem.getItemId()).longPressAction(this.currentConversationItem.getLongPressAction()).remarkableAlexaStyleEnabled(this.currentConversationItem.isRemarkableAlexaStyleEnabled()).itemDialogRequestId(this.currentConversationItem.getItemDialogRequestId()).build();
                this.currentConversationItem = build;
                this.responseStreamListener.onResponseUpdated(build);
                return this.currentConversationItem;
            }
            if (conversationResponseItem.hasSameDialogRequestId(conversationResponseItem2)) {
                Objects.toString(conversationResponseItem.getItemText());
                this.currentConversationItem = ConversationResponseItem.builder().itemText(concatenateWithProperDelimiter(this.currentConversationItem.getItemText(), conversationResponseItem.getItemText())).itemPosition(this.currentConversationItem.getItemPosition()).itemId(this.currentConversationItem.getItemId()).longPressAction(this.currentConversationItem.getLongPressAction()).remarkableAlexaStyleEnabled(this.currentConversationItem.isRemarkableAlexaStyleEnabled()).itemDialogRequestId(this.currentConversationItem.getItemDialogRequestId()).build();
                Matcher matcher = REGEX_WORD.matcher(conversationResponseItem.getItemText().toString());
                while (matcher.find() && matcher.group().length() != 0) {
                    this.conversationResponseItems.add(matcher.group());
                }
            } else {
                ConversationResponseItem conversationResponseItem4 = this.currentConversationItem;
                if (conversationResponseItem4 != null) {
                    this.responseStreamListener.onResponseUpdated(conversationResponseItem4);
                }
                this.currentConversationItem = conversationResponseItem;
                this.conversationResponseItemBeingStreamed = ConversationResponseItem.builder().itemId(this.currentConversationItem.getItemId()).itemDialogRequestId(this.currentConversationItem.getItemDialogRequestId()).itemText("").itemPosition(this.currentConversationItem.getItemPosition()).longPressAction(this.currentConversationItem.getLongPressAction()).remarkableAlexaStyleEnabled(this.currentConversationItem.isRemarkableAlexaStyleEnabled()).build();
                this.conversationResponseItems.clear();
                Matcher matcher2 = REGEX_WORD.matcher(this.currentConversationItem.getItemText().toString());
                while (matcher2.find() && matcher2.group().length() != 0) {
                    this.conversationResponseItems.add(matcher2.group());
                }
            }
            if (!this.handler.post(wordUpdateRunnable())) {
                Log.i(TAG, "Couldn't post runnable");
                this.responseStreamListener.onResponseUpdated(this.currentConversationItem);
            }
            return this.conversationResponseItemBeingStreamed;
        } catch (Throwable th) {
            throw th;
        }
    }
}

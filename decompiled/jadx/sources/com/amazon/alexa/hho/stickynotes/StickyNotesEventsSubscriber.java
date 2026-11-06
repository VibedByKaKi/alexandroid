package com.amazon.alexa.hho.stickynotes;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.Subscriber;
import com.google.common.base.Strings;
import java.util.Locale;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
class StickyNotesEventsSubscriber implements Subscriber {
    private static final String TAG = "StickyNotesEventsSubscriber";
    private final Handler handler;
    private final UUID uuid = UUID.randomUUID();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.hho.stickynotes.StickyNotesEventsSubscriber$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$hho$stickynotes$StickyNotesEventsSubscriber$EventType;

        static {
            int[] iArr = new int[EventType.values().length];
            $SwitchMap$com$amazon$alexa$hho$stickynotes$StickyNotesEventsSubscriber$EventType = iArr;
            try {
                iArr[EventType.DELETE_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$hho$stickynotes$StickyNotesEventsSubscriber$EventType[EventType.DOWNLOAD_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$hho$stickynotes$StickyNotesEventsSubscriber$EventType[EventType.PREFETCH_REQUEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum EventType {
        DOWNLOAD_REQUEST("hho::sticky::media_download::request"),
        UPLOAD_REQUEST("hho::sticky::media_upload::request"),
        DELETE_REQUEST("hho::sticky::media_delete::request"),
        PREFETCH_REQUEST("hho::sticky::media_prefetch::request");

        private final String typeString;

        EventType(String str) {
            this.typeString = str;
        }

        @Nullable
        public static EventType fromTypeString(String str) {
            for (EventType eventType : values()) {
                if (eventType.typeString.equalsIgnoreCase(str)) {
                    return eventType;
                }
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Handler {
        void handleDeleteRequest(@NonNull String str);

        void handleDownloadRequest(@NonNull MediaDownloadRequest mediaDownloadRequest);
    }

    public StickyNotesEventsSubscriber(Handler handler) {
        this.handler = handler;
    }

    private void onDeleteRequestReceived(@NonNull Message message) {
        String payloadAsString = message.getPayloadAsString();
        if (!Strings.isNullOrEmpty(payloadAsString)) {
            this.handler.handleDeleteRequest(payloadAsString);
            return;
        }
        Log.e(TAG, "Delete request without mediaId: " + message.toString());
    }

    private void onDownloadRequestReceived(@NonNull Message message, boolean z) {
        String[] split = message.getPayloadAsString().split("-", 2);
        if (split.length < 2) {
            Log.e(TAG, "Invalid format of DOWNLOAD_REQUEST event payload: " + message.getPayloadAsString());
            return;
        }
        String str = split[0];
        String str2 = split[1];
        StickyNoteMediaType fromString = StickyNoteMediaType.fromString(str.toUpperCase(Locale.ROOT));
        if (fromString == null) {
            Log.e(TAG, "Unsupported media type for DOWNLOAD_REQUEST event: ".concat(str));
        } else {
            this.handler.handleDownloadRequest(new MediaDownloadRequest(fromString, str2, z));
        }
    }

    @Override // com.amazon.alexa.eventbus.api.Subscriber
    @NonNull
    public UUID getUUID() {
        return this.uuid;
    }

    @Override // com.amazon.alexa.eventbus.api.Subscriber
    public void onMessageReceived(@NonNull Message message) {
        EventType fromTypeString = EventType.fromTypeString(message.getEventType());
        if (fromTypeString == null) {
            Log.e(TAG, "Skip message with type: " + message.getEventType());
            return;
        }
        String str = TAG;
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$hho$stickynotes$StickyNotesEventsSubscriber$EventType[fromTypeString.ordinal()];
        if (i == 1) {
            onDeleteRequestReceived(message);
            return;
        }
        if (i == 2) {
            onDownloadRequestReceived(message, false);
        } else {
            if (i == 3) {
                onDownloadRequestReceived(message, true);
                return;
            }
            Log.e(str, "Unsupported eventType: " + fromTypeString);
        }
    }

    @Override // com.amazon.alexa.eventbus.api.Subscriber
    public boolean supportsMessage(@NonNull Message message) {
        return EventType.fromTypeString(message.getEventType()) != null;
    }
}

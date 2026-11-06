package com.amazon.alexa.accessory.frames.eventbus;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticLambda12;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.aamb.proxy.AambProxy$$ExternalSyntheticLambda0;
import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.frames.media.MediaImportService;
import com.amazon.alexa.accessory.frames.media.repository.MediaRepository;
import com.amazon.alexa.accessory.frames.metrics.media.MediaImportError;
import com.amazon.alexa.accessory.frames.utils.Log;
import com.amazon.alexa.accessory.notificationpublisher.providers.DependencyProvider;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MultiFilterSubscriber;
import com.amazon.alexa.eventbus.message.EventTypeMessageFilter;
import com.amazon.alexa.voice.nowplaying.bridge.VoiceBridgePayloadUtil;
import com.mapbox.bindgen.Cleaner$$ExternalSyntheticLambda0;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class MediaImportEventBusManager {
    public static final String MEDIA_GALLERY_COUNT = "Media:Gallery:Count";
    public static final String MEDIA_GALLERY_COUNT_REQUEST = "Media:Gallery:Count:Request";
    public static final String MEDIA_IMPORT_CONNECTION_ESTABLISHED = "Media:Import:Connection:Established";
    private static final String MEDIA_IMPORT_DOWNLOAD_PREVIEW = "Media:Import:Download:Preview";
    private static final String MEDIA_IMPORT_DOWNLOAD_READY = "Media:Import:Download:Ready";
    public static final String MEDIA_IMPORT_DOWNLOAD_STARTING = "Media:Import:Download:Starting";
    private static final String MEDIA_IMPORT_ERROR = "Media:Import:Error";
    private static final String MEDIA_IMPORT_ITEM_UPDATED = "Media:Import:Item:Updated";
    public static final String MEDIA_IMPORT_MANUAL_END = "Media:Import:Manual:End";
    private static final String MEDIA_IMPORT_MANUAL_START_REQUEST = "Media:Import:Manual:Start:Request";
    private static final String MEDIA_IMPORT_PROGRESS = "Media:Import:Progress";
    private static final String MEDIA_IMPORT_REMOVE_ITEM = "Media:Import:Remove:Item";
    private static final String MEDIA_IMPORT_RENDER_SKELETON = "Media:Import:Render:Skeleton";
    public static final String MEDIA_IMPORT_SESSION_STARTING = "Media:Import:Session:Starting";
    public static final String MEDIA_IMPORT_STATUS_REQUEST = "Media:Import:Status:Request";
    private static final String TAG = "MediaImportEventBusManager";
    private static MediaImportEventBusManager mediaImportEventBusManager;
    private Executor galleryCountExecutor = Executors.newSingleThreadExecutor();
    private MultiFilterSubscriber galleryCountRequestSubscriber;
    private MultiFilterSubscriber manualImportSubscriber;
    private MultiFilterSubscriber statusRequestSubscriber;

    public static synchronized MediaImportEventBusManager getInstance() {
        MediaImportEventBusManager mediaImportEventBusManager2;
        synchronized (MediaImportEventBusManager.class) {
            try {
                if (mediaImportEventBusManager == null) {
                    synchronized (MediaImportEventBusManager.class) {
                        mediaImportEventBusManager = new MediaImportEventBusManager();
                    }
                }
                mediaImportEventBusManager2 = mediaImportEventBusManager;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaImportEventBusManager2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initializeGalleryCountRequestHandler$1() {
        publishGalleryCount(readGalleryCount());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeGalleryCountRequestHandler$2(Message message) {
        Log.i(TAG, "initializeGalleryCountRequestHandler - Received gallery count request");
        this.galleryCountExecutor.execute(new Cleaner$$ExternalSyntheticLambda0(4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initializeStatusRequestHandler$0(Message message) {
        Log.i(TAG, "initializeStatusRequestHandler - Received status request");
        MediaImportService.publishCurrentStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$subscribeToEventBusMessages$3(Accessory accessory, Message message) {
        Log.i(TAG, "subscribeToEventBusMessages - Received Message: " + message.getEventType());
        MediaImportService.getInstance(DependencyProvider.getContext(), accessory).startImportV2();
    }

    public static void publishDownloadPreview(String str, String str2, String str3, String str4, String str5, boolean z, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(VoiceBridgePayloadUtil.PayloadKey.PLAYER_INFO_ID, str);
            jSONObject.put("accessoryId", str2);
            jSONObject.put("contentUri", str3);
            jSONObject.put("createdAt", str4);
            jSONObject.put("mediaType", str5);
            jSONObject.put("isAutoCaptured", z);
            jSONObject.put("durationInSeconds", i);
            publishMediaImportEventBusMessage(MEDIA_IMPORT_DOWNLOAD_PREVIEW, jSONObject.toString());
        } catch (JSONException e) {
            Log.e(TAG, "Error creating JSON payload for download preview: ", e);
        }
    }

    public static void publishDownloadReady(String str, String str2, String str3, String str4, String str5, boolean z, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(VoiceBridgePayloadUtil.PayloadKey.PLAYER_INFO_ID, str);
            jSONObject.put("accessoryId", str2);
            jSONObject.put("contentUri", str3);
            jSONObject.put("createdAt", str4);
            jSONObject.put("mediaType", str5);
            jSONObject.put("isAutoCaptured", z);
            jSONObject.put("durationInSeconds", i);
            publishMediaImportEventBusMessage(MEDIA_IMPORT_DOWNLOAD_READY, jSONObject.toString());
        } catch (JSONException e) {
            Log.e(TAG, "Error creating JSON payload for download ready: ", e);
        }
    }

    public static void publishGalleryCount(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("count", i);
            publishMediaImportEventBusMessage(MEDIA_GALLERY_COUNT, jSONObject.toString());
        } catch (JSONException e) {
            Log.e(TAG, "publishGalleryCount - Could not build payload: " + e.getMessage());
        }
    }

    public static void publishItemUpdated(String str, String str2, String str3, String str4, String str5, boolean z, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(VoiceBridgePayloadUtil.PayloadKey.PLAYER_INFO_ID, str);
            jSONObject.put("accessoryId", str2);
            jSONObject.put("contentUri", str3);
            jSONObject.put("createdAt", str4);
            jSONObject.put("mediaType", str5);
            jSONObject.put("isAutoCaptured", z);
            jSONObject.put("durationInSeconds", i);
            publishMediaImportEventBusMessage(MEDIA_IMPORT_ITEM_UPDATED, jSONObject.toString());
        } catch (JSONException e) {
            Log.e(TAG, "Error creating JSON payload for item updated: ", e);
        }
    }

    public static void publishMediaImportError(MediaImportError mediaImportError, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("failure_code", mediaImportError.getCode());
            if (z) {
                jSONObject.put("is_auto_import", true);
            }
            publishMediaImportEventBusMessage(MEDIA_IMPORT_ERROR, jSONObject.toString());
        } catch (JSONException e) {
            Log.e(TAG, "Error creating JSON payload for media import error: ", e);
        }
    }

    public static void publishMediaImportEventBusMessage(String str, @Nullable String str2) {
        Message.Builder m = Automotive$$ExternalSyntheticOutline0.m(str);
        if (str2 != null) {
            m.setPayload(str2);
        }
        Message build = m.build();
        DependencyProvider.getEventBus().lambda$getPublisher$0(build);
        String str3 = TAG;
        Log.i(str3, "publishMediaImportEventBusMessage - Published Message: " + build.getEventType());
        Log.d(str3, "publishMediaImportEventBusMessage - Payload: " + build.getPayloadAsString());
    }

    public static void publishMediaImportManualEnd(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("importedAssetCount", i);
            publishMediaImportEventBusMessage(MEDIA_IMPORT_MANUAL_END, jSONObject.toString());
        } catch (JSONException e) {
            Log.e(TAG, "Error creating JSON payload for manual end: ", e);
        }
    }

    public static void publishMediaImportProgress(int i, int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("importedAssetCount", i);
            jSONObject.put("totalAssetCount", i2);
            publishMediaImportEventBusMessage(MEDIA_IMPORT_PROGRESS, jSONObject.toString());
        } catch (JSONException e) {
            Log.e(TAG, "Error creating JSON payload for progress update: ", e);
        }
    }

    public static void publishRemoveItem(String str) {
        publishMediaImportEventBusMessage(MEDIA_IMPORT_REMOVE_ITEM, str);
    }

    public static void publishRenderSkeleton(String str) {
        publishMediaImportEventBusMessage(MEDIA_IMPORT_RENDER_SKELETON, str);
    }

    private static int readGalleryCount() {
        try {
            return MediaRepository.getInstance(DependencyProvider.getContext()).countThumbnails();
        } catch (Exception e) {
            Log.e(TAG, "readGalleryCount - Could not read the media index: " + e.getMessage());
            return 0;
        }
    }

    private void subscribeToEventBusMessages(Accessory accessory) {
        Log.d(TAG, "subscribeToEventBusMessages - Subscribing to Media Import event bus message");
        MultiFilterSubscriber newSubscriber = DependencyProvider.getEventBus().getNewSubscriber();
        this.manualImportSubscriber = newSubscriber;
        newSubscriber.subscribeFilter(new EventTypeMessageFilter(MEDIA_IMPORT_MANUAL_START_REQUEST), new Automotive$$ExternalSyntheticLambda12(accessory, 2));
    }

    private void unsubscribeFromEventBusMessages() {
        Log.d(TAG, "unsubscribeFromEventBusMessages - Unsubscribing from fetch media event bus messages");
        if (this.manualImportSubscriber != null) {
            DependencyProvider.getEventBus().unsubscribe(this.manualImportSubscriber);
            this.manualImportSubscriber = null;
        }
    }

    public void init(Accessory accessory) {
        unsubscribeFromEventBusMessages();
        Log.d(TAG, "Initializing");
        subscribeToEventBusMessages(accessory);
    }

    public synchronized void initializeGalleryCountRequestHandler() {
        if (this.galleryCountRequestSubscriber != null) {
            return;
        }
        MultiFilterSubscriber newSubscriber = DependencyProvider.getEventBus().getNewSubscriber();
        this.galleryCountRequestSubscriber = newSubscriber;
        newSubscriber.subscribeFilter(new EventTypeMessageFilter(MEDIA_GALLERY_COUNT_REQUEST), new Automotive$$ExternalSyntheticLambda12(this, 1));
    }

    public synchronized void initializeStatusRequestHandler() {
        if (this.statusRequestSubscriber != null) {
            return;
        }
        MultiFilterSubscriber newSubscriber = DependencyProvider.getEventBus().getNewSubscriber();
        this.statusRequestSubscriber = newSubscriber;
        newSubscriber.subscribeFilter(new EventTypeMessageFilter(MEDIA_IMPORT_STATUS_REQUEST), new AambProxy$$ExternalSyntheticLambda0(3));
    }

    @VisibleForTesting
    public void setGalleryCountExecutor(Executor executor) {
        this.galleryCountExecutor = executor;
    }

    public void teardown() {
        Log.d(TAG, "Tearing down manual import handlers");
        unsubscribeFromEventBusMessages();
    }

    public synchronized void teardownGalleryCountRequestHandler() {
        if (this.galleryCountRequestSubscriber == null) {
            return;
        }
        DependencyProvider.getEventBus().unsubscribe(this.galleryCountRequestSubscriber);
        this.galleryCountRequestSubscriber = null;
    }

    public synchronized void teardownStatusRequestHandler() {
        if (this.statusRequestSubscriber == null) {
            return;
        }
        DependencyProvider.getEventBus().unsubscribe(this.statusRequestSubscriber);
        this.statusRequestSubscriber = null;
    }

    public static void publishMediaImportError(MediaImportError mediaImportError) {
        publishMediaImportError(mediaImportError, false);
    }
}

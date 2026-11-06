package com.amazon.alexa.accessory.frames.service;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.accessory.frames.downloader.FileDownloadResponseHandler;
import com.amazon.alexa.accessory.frames.downloader.FileDownloader;
import com.amazon.alexa.accessory.frames.greeting.BudGreetingManager;
import com.amazon.alexa.accessory.frames.metrics.MetricsRecorder;
import com.amazon.alexa.accessory.frames.topContact.TopContactConstants;
import com.amazon.alexa.accessory.frames.topContact.TopContactManager;
import com.amazon.alexa.accessory.frames.utils.Log;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.notificationpublisher.announcewithcontent.AnnounceWithContentDirective;
import com.amazon.alexa.accessory.notificationpublisher.metrics.MetricsConstants;
import com.amazon.alexa.accessory.notificationpublisher.providers.DependencyProvider;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class DirectiveConsumer extends FileDownloadResponseHandler {
    private static final String TAG = "DirectiveConsumer";

    public synchronized boolean consumeDirective(AnnounceWithContentDirective announceWithContentDirective) throws Exception {
        Preconditions.notNull(announceWithContentDirective, "directive");
        if (!TtsManager.getInstance().isRequestInIncomingTtsMap(announceWithContentDirective.getNotificationUuid())) {
            return false;
        }
        Log.d(TAG, "In incoming TTS map");
        consumeDirectiveForTTSRequest(announceWithContentDirective);
        return true;
    }

    @VisibleForTesting
    public void consumeDirectiveForTTSRequest(AnnounceWithContentDirective announceWithContentDirective) {
        DirectiveConsumer directiveConsumer;
        String str;
        String str2;
        String str3;
        String notificationUuid = announceWithContentDirective.getNotificationUuid();
        JSONObject andRemoveIncomingTts = TtsManager.getInstance().getAndRemoveIncomingTts(notificationUuid);
        String str4 = TAG;
        Log.d(str4, "consumeDirective - send download request for tts - requestId: " + notificationUuid);
        String optString = andRemoveIncomingTts.optString("requestType", "None");
        new HashMap().put(MetricsConstants.CUSTOM_VALUES_KEY, optString);
        String announcementUri = announceWithContentDirective.getAnnouncementUri();
        String optString2 = andRemoveIncomingTts.optString("locale");
        File absoluteFile = DependencyProvider.getContext().getFilesDir().getAbsoluteFile();
        if (TopContactConstants.TOP_CONTACT_REQUEST_TYPE.equals(optString)) {
            String str5 = absoluteFile + TopContactConstants.TOP_CONTACT_FOLDER;
            MetricsRecorder.getInstance().recordTimer(TopContactManager.ttsRequestTimer);
            TopContactManager.ttsDownloadTimer = MetricsRecorder.getInstance().startTimer(com.amazon.alexa.accessory.frames.metrics.MetricsConstants.TOP_CONTACT_DOWNLOAD_TTS_LATENCY);
            directiveConsumer = this;
            str2 = str5;
            str3 = TopContactConstants.TOP_CONTACT_CALLING_AUDIO;
            str = announcementUri;
        } else {
            if (BudGreetingManager.REQUEST_TYPE.equals(optString)) {
                String optString3 = andRemoveIncomingTts.optString(BudGreetingManager.CLIP_FILE_NAME_KEY);
                if (optString3.isEmpty()) {
                    Log.w(str4, "consumeDirective - greeting request without a clip file name");
                    return;
                } else {
                    FileDownloader.getInstance().downloadUrlWithAuthorization(announcementUri, notificationUuid, optString, this, BudGreetingManager.clipFolderPath(), optString2, optString3);
                    return;
                }
            }
            directiveConsumer = this;
            str = announcementUri;
            str2 = null;
            str3 = null;
        }
        FileDownloader.getInstance().downloadUrl(str, notificationUuid, optString, directiveConsumer, str2, optString2, str3);
    }

    @Override // com.amazon.alexa.accessory.frames.downloader.FileDownloadResponseHandler
    public void handleDownloadResponse(boolean z, String str, String str2) {
        Log.i(TAG, "handleDownloadResponse - tts download - requestId: " + str + ", success: " + z);
        if (TopContactConstants.TOP_CONTACT_REQUEST_TYPE.equals(str2)) {
            TopContactManager.getInstance().handleTopContactTTSDownloadResponse(z);
        }
    }
}

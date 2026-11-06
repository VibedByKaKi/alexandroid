package com.amazon.alexa.accessory.notificationpublisher.urldownloader;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public abstract class DownloadResponseHandler {
    public static final int ANNOUNCEMENT_TYPE = 1;
    public static final int CONTENT_MERGED_TYPE = 4;
    public static final int CONTENT_PREFIX_TYPE = 3;
    public static final int CONTENT_TYPE = 2;
    public static final int CONVERSATION_TTS_TYPE = 6;
    public static final int READ_BACK_TYPE = 5;
    public static final ImmutableMap<Integer, String> TYPE_TO_NAME_MAP = new ImmutableMap.Builder().put(1, "Announcement").put(2, "Content").put(3, "ContentPrefix").put(4, "ContentMerged").put(5, "ReadBack").put(6, "ConversationTts").build();

    public abstract void handleDownloadResponse(boolean z, String str, int i, boolean z2, Map<String, Object> map);
}

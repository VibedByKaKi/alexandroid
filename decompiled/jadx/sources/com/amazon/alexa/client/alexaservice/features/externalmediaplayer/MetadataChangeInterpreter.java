package com.amazon.alexa.client.alexaservice.features.externalmediaplayer;

import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class MetadataChangeInterpreter {
    private static final String TAG = "MetadataChangeInterpreter";

    public List<PlayerEvent> interpret(MediaMetadataCompat mediaMetadataCompat) {
        ArrayList arrayList = new ArrayList();
        if (mediaMetadataCompat == null) {
            Log.e(TAG, "MetadataChangeInterpreter metadata is null");
            return arrayList;
        }
        if (mediaMetadataCompat.getString("android.media.metadata.MEDIA_ID") != null) {
            arrayList.add(PlayerEvent.TRACK_CHANGED);
        }
        return arrayList;
    }
}

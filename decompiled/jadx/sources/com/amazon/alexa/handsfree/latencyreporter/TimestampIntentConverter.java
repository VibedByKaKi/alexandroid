package com.amazon.alexa.handsfree.latencyreporter;

import android.content.Intent;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class TimestampIntentConverter {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum TimestampName {
        ALEXA_UI_SHOWN,
        NEW_DIALOG_REQUEST_TIME,
        AUDIO_START_TIME,
        PRYON_RESET_TIME,
        PRYON_FINISH_TIME
    }

    public Intent convertToIntent(@NonNull String str, @Nullable String str2, long j) {
        Intent intent = new Intent();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        if (TimestampName.ALEXA_UI_SHOWN.name().equals(str)) {
            Latency latency = Latency.ALEXA_SERVICE_WAKE_WORD_DETECTION_LATENCY;
            TimestampType timestampType = TimestampType.END;
            arrayList.add(new LatencyTimestamp(latency, timestampType, str2, j));
            arrayList.add(new LatencyTimestamp(Latency.ALEXA_SERVICE_VOICE_CHROME_LATENCY_UI, timestampType, str2, j));
            arrayList.add(new LatencyTimestamp(Latency.OVERALL_VOICE_CHROME_LATENCY, timestampType, str2, j));
        } else if (TimestampName.AUDIO_START_TIME.name().equals(str)) {
            Latency latency2 = Latency.PARTNER_WAKE_WORD_DETECTION_LATENCY;
            TimestampType timestampType2 = TimestampType.START;
            arrayList.add(new LatencyTimestamp(latency2, timestampType2, str2, j));
            arrayList.add(new LatencyTimestamp(Latency.PARTNER_VOICE_CHROME_LATENCY, timestampType2, str2, j));
        } else if (TimestampName.NEW_DIALOG_REQUEST_TIME.name().equals(str)) {
            arrayList.add(new LatencyTimestamp(Latency.PARTNER_VOICE_CHROME_LATENCY, TimestampType.END, str2, j));
            arrayList.add(new LatencyTimestamp(Latency.ALEXA_SERVICE_VOICE_CHROME_LATENCY_API, TimestampType.START, str2, j));
        } else if (TimestampName.PRYON_RESET_TIME.name().equals(str)) {
            arrayList.add(new LatencyTimestamp(Latency.ALEXA_SERVICE_VOICE_CHROME_LATENCY_API, TimestampType.END, str2, j));
            arrayList.add(new LatencyTimestamp(Latency.ALEXA_SERVICE_VOICE_CHROME_LATENCY_PRYON, TimestampType.START, str2, j));
        } else if (TimestampName.PRYON_FINISH_TIME.name().equals(str)) {
            arrayList.add(new LatencyTimestamp(Latency.ALEXA_SERVICE_VOICE_CHROME_LATENCY_PRYON, TimestampType.END, str2, j));
            arrayList.add(new LatencyTimestamp(Latency.ALEXA_SERVICE_VOICE_CHROME_LATENCY_UI, TimestampType.START, str2, j));
        }
        intent.putParcelableArrayListExtra("latency", arrayList);
        return intent;
    }
}

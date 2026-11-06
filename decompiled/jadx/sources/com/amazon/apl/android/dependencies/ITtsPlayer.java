package com.amazon.apl.android.dependencies;

import android.util.Log;
import com.amazon.apl.android.media.TextTrack;
import java.io.InputStream;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface ITtsPlayer {
    public static final String TAG = "ITtsPlayer";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ISpeechMarksListener {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum MarkType {
            UNKNOWN,
            WORD,
            SENTENCE,
            SSML,
            VISEME
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class SpeechMark {
            public int end;
            public MarkType markType;
            public int start;
            public long time;
            public String value;

            private SpeechMark(String str, long j, int i, int i2, MarkType markType) {
                this.value = str;
                this.time = j;
                this.start = i;
                this.end = i2;
                this.markType = markType;
            }

            public static SpeechMark create(JSONObject jSONObject) throws JSONException {
                int i;
                int i2;
                MarkType markType = MarkType.UNKNOWN;
                String string = jSONObject.getString("type");
                if (string.equalsIgnoreCase("word")) {
                    markType = MarkType.WORD;
                } else if (string.equalsIgnoreCase("sentence")) {
                    markType = MarkType.SENTENCE;
                } else if (string.equalsIgnoreCase("ssml")) {
                    markType = MarkType.SSML;
                } else if (string.equalsIgnoreCase("viseme")) {
                    markType = MarkType.VISEME;
                }
                MarkType markType2 = markType;
                if (markType2 == MarkType.SENTENCE || markType2 == MarkType.WORD || markType2 == MarkType.SSML) {
                    i = jSONObject.getInt("start");
                    i2 = jSONObject.getInt("end");
                } else {
                    i = 0;
                    i2 = 0;
                }
                return new SpeechMark(jSONObject.getString("value"), jSONObject.getLong("time"), i, i2, markType2);
            }
        }

        void onSpeechMark(SpeechMark speechMark);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface IStateChangeListener {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum AudioPlayerState {
            STATE_DEFAULT,
            STATE_IDLE,
            STATE_PREPARING,
            STATE_BUFFERING,
            STATE_READY,
            STATE_ENDED,
            STATE_ERROR
        }

        void onStateChange(AudioPlayerState audioPlayerState);
    }

    String getSource();

    void play();

    void prepare(String str, InputStream inputStream);

    default void prepare(String str, InputStream inputStream, TextTrack textTrack) {
        if (textTrack != null) {
            Log.i(TAG, "TextTrack not supported, ignored");
        }
        prepare(str, inputStream);
    }

    void prepare(String str, URL url);

    void release();

    void setStateChangeListener(IStateChangeListener iStateChangeListener);

    void setWordMarkListener(ISpeechMarksListener iSpeechMarksListener);

    void stop();

    default void prepare(String str, URL url, TextTrack textTrack) {
        if (textTrack != null) {
            Log.i(TAG, "TextTrack not supported, ignored");
        }
        prepare(str, url);
    }
}

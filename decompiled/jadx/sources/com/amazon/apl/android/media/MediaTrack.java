package com.amazon.apl.android.media;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MediaTrack {
    private final int duration;
    private final String[] headers;
    private final int offset;
    private final int repeatCount;
    private final TextTrack[] textTracks;
    private final String url;

    public MediaTrack(String str, String[] strArr, int i, int i2, int i3, TextTrack[] textTrackArr) {
        this.url = str;
        this.headers = strArr;
        this.offset = i;
        this.duration = i2;
        this.repeatCount = i3;
        this.textTracks = textTrackArr;
    }

    public int getDuration() {
        return this.duration;
    }

    public String[] getHeaders() {
        return this.headers;
    }

    public int getOffset() {
        return this.offset;
    }

    public int getRepeatCount() {
        return this.repeatCount;
    }

    public TextTrack[] getTextTracks() {
        return this.textTracks;
    }

    public String getUrl() {
        return this.url;
    }
}

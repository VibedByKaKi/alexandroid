package com.amazon.apl.android.dependencies.impl;

import com.amazon.apl.android.dependencies.ITtsPlayer;
import com.amazon.apl.android.media.TextTrack;
import java.io.InputStream;
import java.net.URL;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NoOpTtsPlayer implements ITtsPlayer {
    private static final String TAG = "NoOpTtsPlayer";

    @Override // com.amazon.apl.android.dependencies.ITtsPlayer
    public String getSource() {
        return "";
    }

    @Override // com.amazon.apl.android.dependencies.ITtsPlayer
    public void prepare(String str, InputStream inputStream, TextTrack textTrack) {
    }

    @Override // com.amazon.apl.android.dependencies.ITtsPlayer
    public void prepare(String str, URL url) {
    }

    @Override // com.amazon.apl.android.dependencies.ITtsPlayer
    public void prepare(String str, URL url, TextTrack textTrack) {
    }

    @Override // com.amazon.apl.android.dependencies.ITtsPlayer
    public void play() {
    }

    @Override // com.amazon.apl.android.dependencies.ITtsPlayer
    public void release() {
    }

    @Override // com.amazon.apl.android.dependencies.ITtsPlayer
    public void stop() {
    }

    @Override // com.amazon.apl.android.dependencies.ITtsPlayer
    public void setStateChangeListener(ITtsPlayer.IStateChangeListener iStateChangeListener) {
    }

    @Override // com.amazon.apl.android.dependencies.ITtsPlayer
    public void setWordMarkListener(ITtsPlayer.ISpeechMarksListener iSpeechMarksListener) {
    }

    @Override // com.amazon.apl.android.dependencies.ITtsPlayer
    public void prepare(String str, InputStream inputStream) {
    }
}

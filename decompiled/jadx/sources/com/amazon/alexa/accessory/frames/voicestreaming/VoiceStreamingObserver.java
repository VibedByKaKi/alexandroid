package com.amazon.alexa.accessory.frames.voicestreaming;

import com.amazon.alexa.accessory.frames.utils.Log;
import com.amazon.alexa.accessory.protocol.Speech;
import com.amazon.alexa.accessory.repositories.voicestreaming.VoiceStreamingListener;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class VoiceStreamingObserver implements VoiceStreamingListener {
    private static final String TAG = "VoiceStreamingObserver";
    private final List<VoiceDataConsumer> consumers = new CopyOnWriteArrayList();
    private int packetCount;
    private volatile boolean streaming;
    private int totalBytes;

    public void addVoiceDataConsumer(VoiceDataConsumer voiceDataConsumer) {
        if (voiceDataConsumer == null || this.consumers.contains(voiceDataConsumer)) {
            return;
        }
        this.consumers.add(voiceDataConsumer);
    }

    @Override // com.amazon.alexa.accessory.repositories.voicestreaming.VoiceStreamingListener
    public void onVoiceDataReceived(byte[] bArr) {
        if (this.streaming) {
            int i = this.packetCount + 1;
            this.packetCount = i;
            this.totalBytes += bArr.length;
            if (i % 50 == 1) {
                Log.d(TAG, "Voice data: packet #%d, %d bytes (total: %d bytes)", Integer.valueOf(i), Integer.valueOf(bArr.length), Integer.valueOf(this.totalBytes));
            }
            Iterator<VoiceDataConsumer> it2 = this.consumers.iterator();
            while (it2.hasNext()) {
                it2.next().onVoiceDataReceived(bArr);
            }
        }
    }

    @Override // com.amazon.alexa.accessory.repositories.voicestreaming.VoiceStreamingListener
    public void onVoiceStreamingDidPause() {
        Log.i(TAG, "=== VOICE STREAM PAUSED === (received %d packets, %d bytes)", Integer.valueOf(this.packetCount), Integer.valueOf(this.totalBytes));
        this.streaming = false;
    }

    @Override // com.amazon.alexa.accessory.repositories.voicestreaming.VoiceStreamingListener
    public void onVoiceStreamingDidTerminate() {
        Log.i(TAG, "=== VOICE STREAM TERMINATED === (received %d packets, %d bytes)", Integer.valueOf(this.packetCount), Integer.valueOf(this.totalBytes));
        this.streaming = false;
    }

    @Override // com.amazon.alexa.accessory.repositories.voicestreaming.VoiceStreamingListener
    public void onVoiceStreamingError(Throwable th) {
        Log.e(TAG, "=== VOICE STREAM ERROR === %s", th.getMessage());
        this.streaming = false;
    }

    @Override // com.amazon.alexa.accessory.repositories.voicestreaming.VoiceStreamingListener
    public void onVoiceStreamingWillResume(Speech.SpeechSettings speechSettings) {
        Log.i(TAG, "=== VOICE STREAM STARTED === format=%s", speechSettings.getAudioFormat());
        this.streaming = true;
        this.packetCount = 0;
        this.totalBytes = 0;
    }

    public void removeVoiceDataConsumer(VoiceDataConsumer voiceDataConsumer) {
        this.consumers.remove(voiceDataConsumer);
    }
}

package com.amazon.alexa.client.alexaservice.audio.core;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.utils.TimeProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class MetricPlayItem {
    private static final String TAG = "MetricPlayItem";
    private long bufferingStartTime;
    private boolean isBuffering;
    private boolean isMeasuringTimeBetweenPlaybackResumingAndPlaybackResumed;
    private boolean isMeasuringTimeBetweenPlaybackStartingAndPlaybackStarted;
    private final long lastPlayItemFinishedTimestamp;
    private final PlayItem playItem;
    private long startPlayResumeTime;
    private long startPlayTime;
    private long timeBetweenLastPlayItemFinishedAndPlaybackStarted;
    private long timeBetweenPlaybackResumingAndPlaybackResumed;
    private long timeBetweenPlaybackStartingAndPlaybackStarted;
    private final TimeProvider timeProvider;
    private int totalBufferingCount;
    private long totalBufferingTime;

    public MetricPlayItem(PlayItem playItem, long j, TimeProvider timeProvider) {
        this.playItem = playItem;
        this.timeProvider = timeProvider;
        this.lastPlayItemFinishedTimestamp = j;
    }

    public static MetricPlayItem create(PlayItem playItem, TimeProvider timeProvider) {
        return new MetricPlayItem(playItem, 0L, timeProvider);
    }

    @VisibleForTesting
    public long getElapsedRealTime() {
        return this.timeProvider.elapsedRealTime();
    }

    public String getFileExtension() {
        return this.playItem.getUri().getLastPathSegment();
    }

    public String getHost() {
        return this.playItem.getUri().getHost();
    }

    public PlayItem getPlayItem() {
        return this.playItem;
    }

    public long getTimeBetweenLastPlayItemFinishedAndPlaybackStarted() {
        return this.timeBetweenLastPlayItemFinishedAndPlaybackStarted;
    }

    public long getTimeBetweenPlaybackResumingAndPlaybackResumed() {
        return this.timeBetweenPlaybackResumingAndPlaybackResumed;
    }

    public long getTimeBetweenPlaybackStartingAndPlaybackStarted() {
        return this.timeBetweenPlaybackStartingAndPlaybackStarted;
    }

    public int getTotalBufferingCount() {
        return this.totalBufferingCount;
    }

    public long getTotalBufferingTime() {
        return this.totalBufferingTime;
    }

    public boolean hasAlreadyMeasuredTimeBetweenPlaybackStartingAndPlaybackStarted() {
        return this.timeBetweenPlaybackStartingAndPlaybackStarted != 0;
    }

    public boolean hasRecordedTimeBetweenLastPlayItemFinishedAndPlaybackStarted() {
        return this.timeBetweenLastPlayItemFinishedAndPlaybackStarted != 0;
    }

    public void measureTimeBetweenLastPlayItemFinishedAndPlaybackStarted() {
        if (this.lastPlayItemFinishedTimestamp != 0) {
            this.timeBetweenLastPlayItemFinishedAndPlaybackStarted = getElapsedRealTime() - this.lastPlayItemFinishedTimestamp;
        } else {
            Log.i(TAG, "There is no last play item finished.");
        }
    }

    public void startMeasuringBufferingMetric() {
        if (this.isBuffering) {
            Log.w(TAG, "Already measuring buffering");
            return;
        }
        Log.i(TAG, "Starts measuring buffering");
        this.isBuffering = true;
        this.bufferingStartTime = getElapsedRealTime();
        this.totalBufferingCount++;
    }

    public void startMeasuringTimeBetweenPlaybackResumingAndPlaybackResumed() {
        if (this.isMeasuringTimeBetweenPlaybackResumingAndPlaybackResumed) {
            Log.w(TAG, "Already measuring time between play and playback resumed");
            return;
        }
        Log.i(TAG, "Starts measuring time between play and playback resumed");
        this.isMeasuringTimeBetweenPlaybackResumingAndPlaybackResumed = true;
        this.startPlayResumeTime = getElapsedRealTime();
    }

    public void startMeasuringTimeBetweenPlaybackStartingAndPlaybackStarted() {
        if (this.isMeasuringTimeBetweenPlaybackStartingAndPlaybackStarted) {
            Log.w(TAG, "Already measuring time between play and playback started");
            return;
        }
        Log.i(TAG, "Starts measuring time between play and playback started");
        this.isMeasuringTimeBetweenPlaybackStartingAndPlaybackStarted = true;
        this.startPlayTime = getElapsedRealTime();
    }

    public void stopMeasuringBufferingMetric() {
        if (!this.isBuffering) {
            Log.e(TAG, "Must start measuring buffering");
            return;
        }
        Log.i(TAG, "Stops measuring buffering");
        this.isBuffering = false;
        this.totalBufferingTime = (getElapsedRealTime() - this.bufferingStartTime) + this.totalBufferingTime;
    }

    public void stopMeasuringTimeBetweenPlaybackResumingAndPlaybackResumed() {
        if (!this.isMeasuringTimeBetweenPlaybackResumingAndPlaybackResumed) {
            Log.e(TAG, "Must call startMeasuringTimeBetweenPlaybackResumingAndPlaybackResumed first.");
            return;
        }
        Log.i(TAG, "Stops measuring time between play and playback resumed");
        this.isMeasuringTimeBetweenPlaybackResumingAndPlaybackResumed = false;
        this.timeBetweenPlaybackResumingAndPlaybackResumed = getElapsedRealTime() - this.startPlayResumeTime;
    }

    public void stopMeasuringTimeBetweenPlaybackStartingAndPlaybackStarted() {
        if (!this.isMeasuringTimeBetweenPlaybackStartingAndPlaybackStarted) {
            Log.e(TAG, "Must call startMeasuringTimeBetweenPlaybackStartingAndPlaybackStarted first.");
        } else {
            if (hasAlreadyMeasuredTimeBetweenPlaybackStartingAndPlaybackStarted()) {
                return;
            }
            Log.i(TAG, "Stops measuring time between play and playback started");
            this.timeBetweenPlaybackStartingAndPlaybackStarted = getElapsedRealTime() - this.startPlayTime;
        }
    }

    public static MetricPlayItem create(PlayItem playItem, long j, TimeProvider timeProvider) {
        return new MetricPlayItem(playItem, j, timeProvider);
    }
}

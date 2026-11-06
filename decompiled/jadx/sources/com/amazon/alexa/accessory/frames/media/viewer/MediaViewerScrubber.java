package com.amazon.alexa.accessory.frames.media.viewer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.alexa.accessory.frames.R;
import com.amazon.alexa.accessory.frames.utils.Log;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class MediaViewerScrubber extends ConstraintLayout {
    private static final String TAG = "MediaViewerScrubber";
    private static final String TIME_FORMAT = "%d:%02d";

    @Nullable
    private TextView elapsedTimeLabel;

    @Nullable
    private TextView remainingTimeLabel;

    @Nullable
    private SeekBar seekBar;

    public MediaViewerScrubber(@NonNull Context context) {
        super(context);
        init(context);
    }

    private static long ceilToSecondMs(long j) {
        return ((j + 999) / 1000) * 1000;
    }

    @NonNull
    private static String formatClock(long j) {
        long j2 = j / 1000;
        return String.format(Locale.US, TIME_FORMAT, Long.valueOf(j2 / 60), Long.valueOf(j2 % 60));
    }

    @NonNull
    public static String formatElapsed(long j, long j2) {
        return formatClock(Math.max(0L, ceilToSecondMs(j2) - ceilToSecondMs(j2 - Math.max(0L, Math.min(j, j2)))));
    }

    @NonNull
    public static String formatRemaining(long j, long j2) {
        return "-" + formatClock(ceilToSecondMs(j2 - Math.max(0L, Math.min(j, j2))));
    }

    private void init(@NonNull Context context) {
        LayoutInflater.from(context).inflate(R.layout.media_viewer_scrubber, (ViewGroup) this, true);
        this.seekBar = (SeekBar) findViewById(R.id.seekBar);
        this.elapsedTimeLabel = (TextView) findViewById(R.id.elapsedTimeLabel);
        TextView textView = (TextView) findViewById(R.id.remainingTimeLabel);
        this.remainingTimeLabel = textView;
        if (this.seekBar == null || this.elapsedTimeLabel == null || textView == null) {
            Log.e(TAG, "Failed to find one or more scrubber views!");
        } else {
            Log.d(TAG, "MediaViewerScrubber initialized successfully");
        }
    }

    public void renderPlaybackCompleted(long j) {
        updateProgress(j, j);
    }

    public void setInteractionEnabled(boolean z) {
        SeekBar seekBar = this.seekBar;
        if (seekBar != null) {
            seekBar.setEnabled(z);
        }
    }

    public void setSeekBarListener(@Nullable SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        SeekBar seekBar = this.seekBar;
        if (seekBar == null) {
            Log.w(TAG, "Cannot set seek bar listener: seek bar not initialized");
        } else {
            seekBar.setOnSeekBarChangeListener(onSeekBarChangeListener);
        }
    }

    public void updateProgress(long j, long j2) {
        SeekBar seekBar = this.seekBar;
        if (seekBar == null || this.elapsedTimeLabel == null || this.remainingTimeLabel == null) {
            Log.w(TAG, "Cannot update progress: views not initialized");
            return;
        }
        if (j2 <= 0) {
            return;
        }
        int max = seekBar.getMax();
        long max2 = Math.max(0L, Math.min(j, j2));
        this.seekBar.setProgress((int) ((max * max2) / j2));
        this.elapsedTimeLabel.setText(formatElapsed(max2, j2));
        this.remainingTimeLabel.setText(formatRemaining(max2, j2));
    }

    public MediaViewerScrubber(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public MediaViewerScrubber(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}

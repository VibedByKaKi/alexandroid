package com.amazon.alexa.accessory.frames.media.viewer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.alexa.accessory.frames.R;
import com.amazon.alexa.accessory.frames.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class VideoControlsOverlay extends ConstraintLayout {
    public static final long SKIP_INTERVAL_MS = 10000;
    private static final String TAG = "VideoControlsOverlay";

    @Nullable
    private ImageButton playPauseButton;

    @Nullable
    private ImageButton skipBackButton;

    @Nullable
    private ImageButton skipForwardButton;

    public VideoControlsOverlay(@NonNull Context context) {
        super(context);
    }

    public static long computeSkipTarget(long j, long j2, long j3) {
        long max = Math.max(0L, j + j2);
        return j3 > 0 ? Math.min(max, j3) : max;
    }

    private static void setButtonInteraction(@Nullable ImageButton imageButton, boolean z) {
        if (imageButton != null) {
            imageButton.setEnabled(z);
            imageButton.setClickable(z);
        }
    }

    public void hide() {
        setVisibility(8);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.playPauseButton = (ImageButton) findViewById(R.id.playPauseButton);
        this.skipBackButton = (ImageButton) findViewById(R.id.skipBackButton);
        ImageButton imageButton = (ImageButton) findViewById(R.id.skipForwardButton);
        this.skipForwardButton = imageButton;
        if (this.playPauseButton == null || this.skipBackButton == null || imageButton == null) {
            Log.e(TAG, "Failed to find one or more control views!");
        } else {
            Log.d(TAG, "VideoControlsOverlay initialized successfully");
        }
    }

    public void setInteractionEnabled(boolean z) {
        setButtonInteraction(this.playPauseButton, z);
        setButtonInteraction(this.skipBackButton, z);
        setButtonInteraction(this.skipForwardButton, z);
    }

    public void setPlayPauseButtonListener(@Nullable View.OnClickListener onClickListener) {
        ImageButton imageButton = this.playPauseButton;
        if (imageButton == null) {
            Log.w(TAG, "Cannot set play/pause listener: button not initialized");
        } else {
            imageButton.setOnClickListener(onClickListener);
        }
    }

    public void setPlaybackState(boolean z) {
        ImageButton imageButton = this.playPauseButton;
        if (imageButton == null) {
            Log.w(TAG, "Cannot set playback state: play/pause button not initialized");
        } else {
            imageButton.setImageResource(z ? R.drawable.ic_pause : R.drawable.ic_play);
        }
    }

    public void setSkipBackButtonListener(@Nullable View.OnClickListener onClickListener) {
        ImageButton imageButton = this.skipBackButton;
        if (imageButton == null) {
            Log.w(TAG, "Cannot set skip-back listener: button not initialized");
        } else {
            imageButton.setOnClickListener(onClickListener);
        }
    }

    public void setSkipForwardButtonListener(@Nullable View.OnClickListener onClickListener) {
        ImageButton imageButton = this.skipForwardButton;
        if (imageButton == null) {
            Log.w(TAG, "Cannot set skip-forward listener: button not initialized");
        } else {
            imageButton.setOnClickListener(onClickListener);
        }
    }

    public void show() {
        setVisibility(0);
    }

    public VideoControlsOverlay(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VideoControlsOverlay(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

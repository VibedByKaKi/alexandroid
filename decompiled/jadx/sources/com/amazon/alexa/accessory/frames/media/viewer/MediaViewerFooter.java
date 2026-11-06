package com.amazon.alexa.accessory.frames.media.viewer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.alexa.accessory.frames.R;
import com.amazon.alexa.accessory.frames.media.revert.RevertState;
import com.amazon.alexa.accessory.frames.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class MediaViewerFooter extends ConstraintLayout {
    private static final String TAG = "MediaViewerFooter";

    @Nullable
    private ImageButton autoEffectButton;

    @Nullable
    private ImageButton deleteButton;

    @Nullable
    private ImageButton shareButton;

    public MediaViewerFooter(@NonNull Context context) {
        super(context);
        init(context);
    }

    private void init(@NonNull Context context) {
        LayoutInflater.from(context).inflate(R.layout.media_viewer_footer, (ViewGroup) this, true);
        this.shareButton = (ImageButton) findViewById(R.id.shareButton);
        this.deleteButton = (ImageButton) findViewById(R.id.deleteButton);
        this.autoEffectButton = (ImageButton) findViewById(R.id.autoEffectButton);
        Log.d(TAG, "MediaViewerFooter initialized");
    }

    private static void setButtonInteraction(@Nullable ImageButton imageButton, boolean z) {
        if (imageButton == null) {
            Log.w(TAG, "setActionButtonsEnabled - a footer action button is NULL");
        } else {
            imageButton.setEnabled(z);
            imageButton.setClickable(z);
        }
    }

    public void setActionButtonsEnabled(boolean z) {
        setButtonInteraction(this.shareButton, z);
        setButtonInteraction(this.deleteButton, z);
        setButtonInteraction(this.autoEffectButton, z);
    }

    public void setAutoEffectButtonListener(@Nullable View.OnClickListener onClickListener) {
        ImageButton imageButton = this.autoEffectButton;
        if (imageButton == null) {
            Log.w(TAG, "Cannot set auto-effect button listener: button not initialized");
        } else {
            imageButton.setOnClickListener(onClickListener);
        }
    }

    public void setAutoEffectState(@NonNull RevertState revertState) {
        if (this.autoEffectButton == null) {
            Log.w(TAG, "setAutoEffectState - autoEffectButton is NULL (view not inflated?)");
            return;
        }
        if (revertState == RevertState.ENABLED) {
            Log.i(TAG, "setAutoEffectState - state=ENABLED → VISIBLE");
            this.autoEffectButton.setVisibility(0);
            this.autoEffectButton.setImageResource(R.drawable.ic_crop);
            this.autoEffectButton.setBackgroundResource(R.drawable.circular_button_background);
            return;
        }
        Log.i(TAG, "setAutoEffectState - state=" + revertState + " → GONE");
        this.autoEffectButton.setVisibility(8);
    }

    public void setAutoEffectToggleState(@Nullable Boolean bool) {
        ImageButton imageButton = this.autoEffectButton;
        if (imageButton == null) {
            Log.w(TAG, "setAutoEffectToggleState - autoEffectButton is NULL");
            return;
        }
        if (bool == null) {
            imageButton.setVisibility(8);
            return;
        }
        imageButton.setVisibility(0);
        this.autoEffectButton.setImageResource(R.drawable.ic_crop);
        this.autoEffectButton.setBackgroundResource(bool.booleanValue() ? R.drawable.circular_bg_selected : R.drawable.circular_button_background);
        Log.i(TAG, "setAutoEffectToggleState - visible, isShowingEnhanced=" + bool);
    }

    public void setDeleteButtonListener(@Nullable View.OnClickListener onClickListener) {
        ImageButton imageButton = this.deleteButton;
        if (imageButton == null) {
            Log.w(TAG, "Cannot set delete button listener: button not initialized");
        } else {
            imageButton.setOnClickListener(onClickListener);
        }
    }

    public void setShareButtonListener(@Nullable View.OnClickListener onClickListener) {
        ImageButton imageButton = this.shareButton;
        if (imageButton == null) {
            Log.w(TAG, "Cannot set share button listener: button not initialized");
        } else {
            imageButton.setOnClickListener(onClickListener);
        }
    }

    public MediaViewerFooter(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public MediaViewerFooter(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}

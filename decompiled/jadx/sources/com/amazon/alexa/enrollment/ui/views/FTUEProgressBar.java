package com.amazon.alexa.enrollment.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.amazon.alexa.enrollment.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class FTUEProgressBar extends LinearLayout {
    private ProgressBar progressBar;
    private TextView progressSubtitle;

    public FTUEProgressBar(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.ftue_progress_bar, (ViewGroup) this, true);
    }

    public void setProgress(int i, int i2) {
        this.progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        this.progressSubtitle = (TextView) findViewById(R.id.progress_bar_subtitle);
        this.progressBar.setProgress(i);
        this.progressBar.setMax(i2);
        this.progressSubtitle.setText(String.format(getResources().getString(R.string.progress_bar_subtitle), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public FTUEProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.ftue_progress_bar, (ViewGroup) this, true);
    }
}

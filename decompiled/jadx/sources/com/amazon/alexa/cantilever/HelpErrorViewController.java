package com.amazon.alexa.cantilever;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.amazon.alexa.mosaic.components.ThemeUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class HelpErrorViewController {
    private static final String TAG = "HelpErrorViewController";
    private final TextView errorSubtitleText;
    private final TextView errorTitleText;
    private final View errorView;
    private final View offlineView;

    public HelpErrorViewController(Context context, View view, View.OnClickListener onClickListener) {
        View findViewById = view.findViewById(R.id.cantilever_no_network_page);
        this.errorView = findViewById;
        int textColor = getTextColor(context);
        TextView textView = (TextView) findViewById.findViewById(R.id.cantilever_error_page_title);
        this.errorTitleText = textView;
        textView.setTextColor(textColor);
        TextView textView2 = (TextView) findViewById.findViewById(R.id.cantilever_error_page_subtitle);
        this.errorSubtitleText = textView2;
        textView2.setTextColor(textColor);
        this.offlineView = view.findViewById(R.id.banner_text);
        ((TextView) view.findViewById(R.id.cantilever_retry)).setOnClickListener(onClickListener);
    }

    private int getTextColor(Context context) {
        ThemeUtil.setTheme(context);
        return ThemeUtil.getColorFromAttribute(context, com.amazon.alexa.mosaic.themes.R.attr.mosaicNeutral10);
    }

    public void setOffline(boolean z) {
        this.offlineView.setVisibility(z ? 0 : 8);
    }

    public void setVisible(boolean z) {
        this.errorView.setVisibility(z ? 0 : 8);
    }

    public void setupNoNetworkText() {
        Log.i(TAG, "Couldn't load due to network error");
        this.errorTitleText.setText(R.string.cantilever_no_network_title);
        this.errorSubtitleText.setText(R.string.cantilever_no_network_subtitle);
    }

    public void setupUnableToLoadText() {
        Log.i(TAG, "Couldn't load due to generic error");
        this.errorTitleText.setText(R.string.cantilever_unable_title);
        this.errorSubtitleText.setText(R.string.cantilever_unable_subtitle);
    }
}

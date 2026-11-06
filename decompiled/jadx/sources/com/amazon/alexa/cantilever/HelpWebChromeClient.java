package com.amazon.alexa.cantilever;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class HelpWebChromeClient extends WebChromeClient {
    private static final String TAG = "HelpWebChromeClient";
    private final FrameLayout.LayoutParams fullscreenLayoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
    private Activity mActivity;

    @VisibleForTesting
    View mCustomView;
    private WebChromeClient.CustomViewCallback mCustomViewCallback;
    protected FrameLayout mFullscreenContainer;
    private int mOriginalOrientation;
    private int mOriginalSystemUiVisibility;
    private View mWebView;

    public HelpWebChromeClient(Activity activity, View view) {
        this.mActivity = activity;
        this.mWebView = view;
    }

    private ViewGroup getRootView() {
        return (ViewGroup) this.mActivity.findViewById(android.R.id.content);
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        if (this.mCustomView == null) {
            return;
        }
        Log.i(TAG, "Closing fullscreen client, returning to previous webview");
        getRootView().setVisibility(this.mOriginalSystemUiVisibility);
        this.mActivity.setRequestedOrientation(this.mOriginalOrientation);
        this.mWebView.setVisibility(0);
        this.mCustomView.setVisibility(8);
        getRootView().removeView(this.mCustomView);
        getRootView().setVisibility(0);
        this.mCustomView = null;
        this.mCustomViewCallback.onCustomViewHidden();
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        if (this.mCustomView != null) {
            customViewCallback.onCustomViewHidden();
            return;
        }
        String str = TAG;
        Log.i(str, "Opening fullscreen client");
        this.mCustomView = view;
        this.mCustomViewCallback = customViewCallback;
        this.mOriginalOrientation = this.mActivity.getRequestedOrientation();
        this.mOriginalSystemUiVisibility = getRootView().getSystemUiVisibility();
        if (this.mCustomView.getParent() != null) {
            Log.i(str, "Removing view from parent");
            ((ViewGroup) this.mCustomView.getParent()).removeView(this.mCustomView);
        }
        this.mWebView.setVisibility(8);
        getRootView().setVisibility(0);
        this.mActivity.setRequestedOrientation(0);
        getRootView().addView(this.mCustomView, this.fullscreenLayoutParams);
    }
}

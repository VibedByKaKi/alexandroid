package com.amazon.alexa.voice.ui.onedesign.composecompatible;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.widget.FrameLayout;
import com.amazon.alexa.mosaic.components.apl.AplViewLayout;
import com.amazon.alexa.mosaic.components.apl.AplViewsManager;
import com.amazon.alexa.voice.ui.composableNative.ComposableCompatibleNativeView;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.json.JSONException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes20.dex */
public class ComposeCompatibleAplView extends FrameLayout implements ComposableCompatibleNativeView {
    private static final String TAG = "ComposeCompatibleApl";
    private AplViewLayout aplViewLayout;
    private final AplViewsManager aplViewManager;

    public ComposeCompatibleAplView(Context context, AplViewsManager aplViewsManager) {
        super(context);
        this.aplViewManager = aplViewsManager;
    }

    @Override // com.amazon.alexa.voice.ui.composableNative.ComposableCompatibleNativeView
    public void renderInitialContent(String str, String str2, int i, int i2) {
        this.aplViewLayout = new AplViewLayout(getContext());
        this.aplViewLayout.setLayoutParams(new FrameLayout.LayoutParams(i, i2));
        addView(this.aplViewLayout);
        try {
            this.aplViewManager.render(str2, str, this.aplViewLayout);
        } catch (JSONException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
        }
    }

    @Override // com.amazon.alexa.voice.ui.composableNative.ComposableCompatibleNativeView
    public void renderUpdatedContent(String str, String str2) {
        try {
            this.aplViewManager.render(str, str2, this.aplViewLayout);
        } catch (JSONException unused) {
            Log.e(TAG, " Error rendering Apl document");
        }
    }
}

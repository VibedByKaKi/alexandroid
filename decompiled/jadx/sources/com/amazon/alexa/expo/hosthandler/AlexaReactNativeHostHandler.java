package com.amazon.alexa.expo.hosthandler;

import android.util.Log;
import androidx.annotation.NonNull;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import expo.modules.core.interfaces.ReactNativeHostHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AlexaReactNativeHostHandler implements ReactNativeHostHandler {
    private static final String TAG = "AlexaRNHostHandler";

    @Override // expo.modules.core.interfaces.ReactNativeHostHandler
    public void onReactInstanceException(boolean z, @NonNull Exception exc) {
        Log.e(TAG, "Unhandled React Native exception (devSupport=" + z + MarkdownConstants.RIGHT_PARENTHESIS, exc);
    }
}

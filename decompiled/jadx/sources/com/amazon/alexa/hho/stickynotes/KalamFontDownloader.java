package com.amazon.alexa.hho.stickynotes;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.core.provider.FontRequest;
import androidx.core.provider.FontsContractCompat;
import com.amazon.alexa.hho.R;
import com.amazon.alexa.ttcf.TTCFService$$ExternalSyntheticLambda0;
import com.facebook.react.views.text.ReactFontManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class KalamFontDownloader extends FontsContractCompat.FontRequestCallback {
    private static final String FONT_FAMILY_NAME = "kalam-regular";
    private static final String FONT_PROVIDER_AUTHORITY = "com.google.android.gms.fonts";
    private static final String FONT_PROVIDER_PACKAGE = "com.google.android.gms";
    private static final String FONT_QUERY = "Kalam";
    private static final String TAG = "KalamFontDownloader";
    private final Context context;
    private final Handler handler;

    public KalamFontDownloader(Context context, Handler handler) {
        this.context = context;
        this.handler = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startFontDownload$0() {
        FontsContractCompat.requestFont(this.context, new FontRequest(FONT_PROVIDER_AUTHORITY, "com.google.android.gms", FONT_QUERY, R.array.com_google_android_gms_fonts_certs), this, this.handler);
    }

    @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
    public void onTypefaceRequestFailed(int i) {
        ErrorUtils$$ExternalSyntheticOutline0.m(i, "Unable download kalam font: ", TAG);
    }

    @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
    public void onTypefaceRetrieved(Typeface typeface) {
        ReactFontManager.getInstance().setTypeface(FONT_FAMILY_NAME, 0, typeface);
    }

    public void startFontDownload(long j) {
        this.handler.postDelayed(new TTCFService$$ExternalSyntheticLambda0(this, 7), j);
    }
}

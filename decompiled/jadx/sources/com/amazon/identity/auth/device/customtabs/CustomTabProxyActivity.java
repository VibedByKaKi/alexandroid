package com.amazon.identity.auth.device.customtabs;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsIntent;
import com.amazon.identity.auth.device.e9;
import com.amazon.identity.auth.device.yf;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CustomTabProxyActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private boolean f568a = false;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f568a = bundle.getBoolean("has_paused", false);
            return;
        }
        String stringExtra = getIntent().getStringExtra("com.amazon.identity.auth.device.customtabs.extra.TARGET_URL");
        if (stringExtra == null || stringExtra.isEmpty()) {
            Log.e(yf.a("CustomTabProxyActivity"), "No target URL provided, finishing.");
            finish();
            return;
        }
        if (!stringExtra.startsWith("https://") && !stringExtra.startsWith("http://")) {
            Log.e(yf.a("CustomTabProxyActivity"), "Non-web URL scheme rejected, finishing.");
            finish();
            return;
        }
        try {
            String a2 = e9.a(this);
            if (a2 == null) {
                Log.e(yf.a("CustomTabProxyActivity"), "No browser supports Custom Tabs, finishing.");
                finish();
            } else {
                CustomTabsIntent build = new CustomTabsIntent.Builder().build();
                build.intent.setPackage(a2);
                build.launchUrl(this, Uri.parse(stringExtra));
                Log.i(yf.a("CustomTabProxyActivity"), "Chrome Custom Tab launched");
            }
        } catch (Exception e) {
            Log.e(yf.a("CustomTabProxyActivity"), "Failed to launch CCT: ".concat(e.getClass().getSimpleName()));
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Uri data = intent.getData();
        if (data == null || !"com.amazon.mobile.identity.verification".equals(data.getScheme()) || !"amazon.com".equals(data.getHost())) {
            Log.w(yf.a("CustomTabProxyActivity"), "Unexpected intent in onNewIntent, ignoring.");
            return;
        }
        Log.i(yf.a("CustomTabProxyActivity"), "Page asked to close the CCT, finishing. path=" + data.getPath());
        finish();
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f568a = true;
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f568a) {
            Log.i(yf.a("CustomTabProxyActivity"), "User closed the CCT, finishing.");
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("has_paused", this.f568a);
    }
}

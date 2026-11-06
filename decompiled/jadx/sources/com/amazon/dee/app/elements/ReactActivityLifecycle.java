package com.amazon.dee.app.elements;

import android.content.Intent;
import android.view.KeyEvent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public interface ReactActivityLifecycle {
    void onActivityResult(int i, int i2, Intent intent);

    void onDestroy();

    boolean onKeyUp(int i, KeyEvent keyEvent);

    void onPause();

    void onResume();
}

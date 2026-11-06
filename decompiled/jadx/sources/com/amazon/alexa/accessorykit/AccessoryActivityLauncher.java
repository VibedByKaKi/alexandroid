package com.amazon.alexa.accessorykit;

import android.app.Activity;
import android.content.Intent;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AccessoryActivityLauncher {
    public static final int ACCESSORY_ACTIVITY_REQUEST_CODE = 18237;
    private final ReactApplicationContext mReactApplicationContext;

    public AccessoryActivityLauncher(ReactApplicationContext reactApplicationContext) {
        this.mReactApplicationContext = reactApplicationContext;
    }

    public void startActivity(Intent intent, Promise promise) {
        Intent intent2 = new Intent(intent);
        if (this.mReactApplicationContext.hasCurrentActivity()) {
            this.mReactApplicationContext.addActivityEventListener(new ActivityListener(this, promise, 0));
            this.mReactApplicationContext.startActivityForResult(intent2, 18237, null);
        } else {
            intent2.addFlags(268435456);
            this.mReactApplicationContext.startActivity(intent);
            promise.resolve(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public final class ActivityListener extends BaseActivityEventListener {
        private final Promise mPromise;

        private ActivityListener(Promise promise) {
            this.mPromise = promise;
        }

        @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
        public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
            if (i == 18237) {
                AccessoryActivityLauncher.this.mReactApplicationContext.removeActivityEventListener(this);
                Promise promise = this.mPromise;
                if (i2 != 0) {
                    promise.resolve(null);
                } else {
                    promise.reject(new Exception("Activity canceled"));
                }
            }
        }

        public /* synthetic */ ActivityListener(AccessoryActivityLauncher accessoryActivityLauncher, Promise promise, int i) {
            this(promise);
        }
    }
}

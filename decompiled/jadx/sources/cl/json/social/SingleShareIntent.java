package cl.json.social;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import cl.json.RNShareImpl;
import com.amazon.alexa.handsfree.foxtrot.FoxtrotAPIConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public abstract class SingleShareIntent extends ShareIntent {
    protected String appStoreURL;
    protected String playStoreURL;

    public SingleShareIntent(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.playStoreURL = null;
        this.appStoreURL = null;
    }

    @Override // cl.json.social.ShareIntent
    public void open(ReadableMap readableMap) throws ActivityNotFoundException {
        System.out.println(getPackage());
        if (getPackage() != null || getDefaultWebLink() != null || getPlayStoreLink() != null) {
            if (ShareIntent.isPackageInstalled(getPackage(), this.reactContext)) {
                System.out.println(FoxtrotAPIConstants.FOXTROT_BROADCAST_EXTRA_INSTALLED);
                if (getComponentClass() != null) {
                    getIntent().setComponent(new ComponentName(getPackage(), getComponentClass()));
                } else {
                    getIntent().setPackage(getPackage());
                }
                super.open(readableMap);
                return;
            }
            System.out.println("NOT INSTALLED");
            setIntent(new Intent(new Intent("android.intent.action.VIEW", Uri.parse(getDefaultWebLink() != null ? getDefaultWebLink().replace("{url}", ShareIntent.urlEncode(readableMap.getString("url"))).replace("{message}", ShareIntent.urlEncode(readableMap.getString("message"))) : getPlayStoreLink() != null ? getPlayStoreLink() : ""))));
        }
        super.open(readableMap);
    }

    public void openIntentChooser(ReadableMap readableMap) throws ActivityNotFoundException {
        if (!this.options.hasKey("forceDialog") || !this.options.getBoolean("forceDialog")) {
            getIntent().addFlags(268435456);
            this.reactContext.startActivity(getIntent());
            WritableMap createMap = Arguments.createMap();
            createMap.putBoolean("success", true);
            createMap.putString("message", getIntent().getPackage());
            TargetChosenReceiver.callbackResolve(createMap);
            return;
        }
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity == null) {
            TargetChosenReceiver.callbackReject("Something went wrong");
            return;
        }
        if (readableMap != null && !ShareIntent.hasValidKey("social", readableMap)) {
            Single$$ExternalSyntheticBUOutline0.m$3("social is empty");
            return;
        }
        if (TargetChosenReceiver.isSupported()) {
            Intent createChooser = Intent.createChooser(getIntent(), this.chooserTitle, TargetChosenReceiver.getSharingSenderIntent(this.reactContext));
            createChooser.addFlags(1073741824);
            currentActivity.startActivityForResult(createChooser, RNShareImpl.SHARE_REQUEST_CODE);
            return;
        }
        Intent createChooser2 = Intent.createChooser(getIntent(), this.chooserTitle);
        createChooser2.addFlags(1073741824);
        currentActivity.startActivityForResult(createChooser2, RNShareImpl.SHARE_REQUEST_CODE);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putBoolean("success", true);
        createMap2.putString("message", "OK");
        TargetChosenReceiver.callbackResolve(createMap2);
    }

    @Override // cl.json.social.ShareIntent
    public void openIntentChooser() throws ActivityNotFoundException {
        openIntentChooser(null);
    }
}

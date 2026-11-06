package cl.json.social;

import android.content.ActivityNotFoundException;
import android.provider.Telephony;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class SMSShare extends SingleShareIntent {
    private static final String PACKAGE = "com.android.mms";
    private static final String PLAY_STORE_LINK = "market://details?id=com.android.mms";
    private ReactApplicationContext reactContext;

    public SMSShare(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @Override // cl.json.social.ShareIntent
    public String getDefaultWebLink() {
        return null;
    }

    @Override // cl.json.social.ShareIntent
    public String getPackage() {
        return Telephony.Sms.getDefaultSmsPackage(this.reactContext);
    }

    @Override // cl.json.social.ShareIntent
    public String getPlayStoreLink() {
        return PLAY_STORE_LINK;
    }

    @Override // cl.json.social.SingleShareIntent, cl.json.social.ShareIntent
    public void open(ReadableMap readableMap) throws ActivityNotFoundException {
        super.open(readableMap);
        openIntentChooser();
    }
}

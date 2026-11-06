package cl.json.social;

import android.content.ActivityNotFoundException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class PinterestShare extends SingleShareIntent {
    private static final String DEFAULT_WEB_LINK = "https://pinterest.com/pin/create/button/?url={url}&media=$media&description={message}";
    private static final String PACKAGE = "com.pinterest";
    private static final String PLAY_STORE_LINK = "market://details?id=com.pinterest";

    public PinterestShare(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // cl.json.social.ShareIntent
    public String getDefaultWebLink() {
        return DEFAULT_WEB_LINK;
    }

    @Override // cl.json.social.ShareIntent
    public String getPackage() {
        return PACKAGE;
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

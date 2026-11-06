package cl.json.social;

import android.content.ActivityNotFoundException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class GenericShare extends ShareIntent {
    public GenericShare(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // cl.json.social.ShareIntent
    public String getDefaultWebLink() {
        return null;
    }

    @Override // cl.json.social.ShareIntent
    public String getPackage() {
        return null;
    }

    @Override // cl.json.social.ShareIntent
    public String getPlayStoreLink() {
        return null;
    }

    @Override // cl.json.social.ShareIntent
    public void open(ReadableMap readableMap) throws ActivityNotFoundException {
        super.open(readableMap);
        openIntentChooser();
    }
}

package cl.json.social;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import cl.json.RNShareImpl;
import cl.json.ShareFile;
import cl.json.ShareFiles;
import com.amazon.deecomms.common.Constants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public abstract class ShareIntent {
    protected ShareFile backgroundAsset;
    protected String chooserTitle = "Share";
    protected ShareFile fileShare;
    protected Intent intent;
    protected ReadableMap options;
    protected final ReactApplicationContext reactContext;
    protected ShareFile stickerAsset;

    public ShareIntent(ReactApplicationContext reactApplicationContext) {
        this.reactContext = reactApplicationContext;
        setIntent(new Intent("android.intent.action.SEND"));
        getIntent().setType("text/plain");
    }

    private ComponentName[] getExcludedComponentArray(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        Intent intent = new Intent(getIntent().getAction());
        intent.setType(getIntent().getType());
        ArrayList arrayList = new ArrayList();
        List<ResolveInfo> queryIntentActivities = this.reactContext.getPackageManager().queryIntentActivities(intent, 0);
        for (int i = 0; i < readableArray.size(); i++) {
            String string = readableArray.getString(i);
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (resolveInfo.activityInfo.packageName.equals(string)) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    arrayList.add(new ComponentName(activityInfo.packageName, activityInfo.name));
                }
            }
        }
        return (ComponentName[]) arrayList.toArray(new ComponentName[0]);
    }

    public static boolean hasValidKey(String str, ReadableMap readableMap) {
        return (readableMap == null || !readableMap.hasKey(str) || readableMap.isNull(str)) ? false : true;
    }

    public static boolean isPackageInstalled(String str, Context context) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static String urlEncode(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            Single$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("URLEncoder.encode() failed for ", str));
            return null;
        }
    }

    public Intent excludeChooserIntent(Intent intent, ReadableMap readableMap) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Intent intent2 = new Intent(intent.getAction());
        intent2.setType(intent.getType());
        List<ResolveInfo> queryIntentActivities = this.reactContext.getPackageManager().queryIntentActivities(intent2, 0);
        if (!queryIntentActivities.isEmpty()) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (resolveInfo.activityInfo != null && !readableMap.getArray("excludedActivityTypes").toString().contains(resolveInfo.activityInfo.packageName)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("packageName", resolveInfo.activityInfo.packageName);
                    hashMap.put("className", resolveInfo.activityInfo.name);
                    hashMap.put("simpleName", String.valueOf(resolveInfo.activityInfo.loadLabel(this.reactContext.getPackageManager())));
                    arrayList2.add(hashMap);
                }
            }
            if (!arrayList2.isEmpty()) {
                Collections.sort(arrayList2, new Comparator<HashMap<String, String>>() { // from class: cl.json.social.ShareIntent.1
                    @Override // java.util.Comparator
                    public int compare(HashMap<String, String> hashMap2, HashMap<String, String> hashMap3) {
                        return hashMap2.get("simpleName").compareTo(hashMap3.get("simpleName"));
                    }
                });
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    HashMap hashMap2 = (HashMap) it2.next();
                    Intent intent3 = (Intent) intent.clone();
                    intent3.setPackage((String) hashMap2.get("packageName"));
                    intent3.setClassName((String) hashMap2.get("packageName"), (String) hashMap2.get("className"));
                    arrayList.add(intent3);
                }
                Intent createChooser = Intent.createChooser((Intent) arrayList.remove(arrayList.size() - 1), "share");
                createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
                return createChooser;
            }
        }
        return Intent.createChooser(intent, "Share");
    }

    public String getComponentClass() {
        return null;
    }

    public abstract String getDefaultWebLink();

    public ShareFile getFileShare(ReadableMap readableMap) {
        String string = hasValidKey("filename", readableMap) ? readableMap.getString("filename") : null;
        Boolean bool = Boolean.FALSE;
        if (hasValidKey("useInternalStorage", readableMap)) {
            bool = Boolean.valueOf(readableMap.getBoolean("useInternalStorage"));
        }
        Boolean bool2 = bool;
        return hasValidKey("type", readableMap) ? new ShareFile(readableMap.getString("url"), readableMap.getString("type"), string, bool2, this.reactContext) : new ShareFile(readableMap.getString("url"), string, bool2, this.reactContext);
    }

    public ShareFiles getFileShares(ReadableMap readableMap) {
        ArrayList arrayList = new ArrayList();
        if (hasValidKey("filenames", readableMap)) {
            ReadableArray array = readableMap.getArray("filenames");
            for (int i = 0; i < array.size(); i++) {
                arrayList.add(array.getString(i));
            }
        }
        Boolean bool = Boolean.FALSE;
        if (hasValidKey("useInternalStorage", readableMap)) {
            bool = Boolean.valueOf(readableMap.getBoolean("useInternalStorage"));
        }
        Boolean bool2 = bool;
        return hasValidKey("type", readableMap) ? new ShareFiles(readableMap.getArray("urls"), arrayList, readableMap.getString("type"), bool2, this.reactContext) : new ShareFiles(readableMap.getArray("urls"), arrayList, bool2, this.reactContext);
    }

    public Intent getIntent() {
        return this.intent;
    }

    public Intent[] getIntentsToViewFile(Intent intent, Uri uri) {
        List<ResolveInfo> queryIntentActivities = this.reactContext.getPackageManager().queryIntentActivities(intent, 0);
        Intent[] intentArr = new Intent[queryIntentActivities.size()];
        for (int i = 0; i < queryIntentActivities.size(); i++) {
            ResolveInfo resolveInfo = queryIntentActivities.get(i);
            String str = resolveInfo.activityInfo.packageName;
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName(str, resolveInfo.activityInfo.name));
            intent2.setAction("android.intent.action.VIEW");
            intent2.setDataAndType(uri, intent.getType());
            intent2.addFlags(1);
            intentArr[i] = new Intent(intent2);
        }
        return intentArr;
    }

    public abstract String getPackage();

    public abstract String getPlayStoreLink();

    public void open(ReadableMap readableMap) throws ActivityNotFoundException {
        this.options = readableMap;
        if (hasValidKey("isNewTask", readableMap) && readableMap.getBoolean("isNewTask")) {
            getIntent().addFlags(268468224);
        }
        if (hasValidKey("subject", readableMap)) {
            getIntent().putExtra("android.intent.extra.SUBJECT", readableMap.getString("subject"));
        }
        if (hasValidKey("email", readableMap)) {
            getIntent().putExtra("android.intent.extra.EMAIL", new String[]{readableMap.getString("email")});
        }
        if (hasValidKey("title", readableMap)) {
            this.chooserTitle = readableMap.getString("title");
        }
        String string = hasValidKey("message", readableMap) ? readableMap.getString("message") : "";
        String string2 = hasValidKey("social", readableMap) ? readableMap.getString("social") : "";
        if (string2.equals("sms")) {
            String string3 = readableMap.getString(Constants.BUNDLE_KEY_NOTIFICATION_RECIPIENT);
            if (!string3.isEmpty()) {
                getIntent().putExtra("address", string3);
            }
        }
        if (string2.equals("whatsapp") && readableMap.hasKey("whatsAppNumber")) {
            getIntent().putExtra("jid", BitVector$$ExternalSyntheticOutline0.m(readableMap.getString("whatsAppNumber"), "@s.whatsapp.net"));
        }
        if (string2.equals("whatsappbusiness") && readableMap.hasKey("whatsAppNumber")) {
            getIntent().putExtra("jid", BitVector$$ExternalSyntheticOutline0.m(readableMap.getString("whatsAppNumber"), "@s.whatsapp.net"));
        }
        if (hasValidKey("urls", readableMap)) {
            ShareFiles fileShares = getFileShares(readableMap);
            if (!fileShares.isFile()) {
                if (TextUtils.isEmpty(string)) {
                    getIntent().putExtra("android.intent.extra.TEXT", readableMap.getArray("urls").getString(0));
                    return;
                }
                Intent intent = getIntent();
                StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(string, " ");
                m1m.append(readableMap.getArray("urls").getString(0));
                intent.putExtra("android.intent.extra.TEXT", m1m.toString());
                return;
            }
            ArrayList<Uri> uri = fileShares.getURI();
            ClipData clipData = new ClipData(new ClipDescription("Files", new String[]{fileShares.getType()}), new ClipData.Item(uri.get(0)));
            for (int i = 1; i < uri.size(); i++) {
                clipData.addItem(new ClipData.Item(uri.get(i)));
            }
            getIntent().setClipData(clipData);
            getIntent().setAction("android.intent.action.SEND_MULTIPLE");
            getIntent().setType(fileShares.getType());
            getIntent().putParcelableArrayListExtra("android.intent.extra.STREAM", uri);
            getIntent().addFlags(1);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            getIntent().putExtra("android.intent.extra.TEXT", string);
            return;
        }
        if (!hasValidKey("url", readableMap)) {
            if (TextUtils.isEmpty(string)) {
                return;
            }
            getIntent().putExtra("android.intent.extra.TEXT", string);
            return;
        }
        ShareFile fileShare = getFileShare(readableMap);
        this.fileShare = fileShare;
        if (!fileShare.isFile()) {
            if (TextUtils.isEmpty(string)) {
                getIntent().putExtra("android.intent.extra.TEXT", readableMap.getString("url"));
                return;
            }
            Intent intent2 = getIntent();
            StringBuilder m1m2 = a$$ExternalSyntheticOutline0.m1m(string, " ");
            m1m2.append(readableMap.getString("url"));
            intent2.putExtra("android.intent.extra.TEXT", m1m2.toString());
            return;
        }
        Uri uri2 = this.fileShare.getURI();
        ClipData newUri = ClipData.newUri(this.reactContext.getContentResolver(), "File", uri2);
        getIntent().setType(this.fileShare.getType());
        getIntent().setClipData(newUri);
        getIntent().putExtra("android.intent.extra.STREAM", uri2);
        getIntent().addFlags(1);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        getIntent().putExtra("android.intent.extra.TEXT", string);
    }

    public void openIntentChooser() throws ActivityNotFoundException {
        Intent createChooser;
        IntentSender intentSender;
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity == null) {
            TargetChosenReceiver.callbackReject("Something went wrong");
            return;
        }
        if (TargetChosenReceiver.isSupported()) {
            intentSender = TargetChosenReceiver.getSharingSenderIntent(this.reactContext);
            createChooser = Intent.createChooser(getIntent(), this.chooserTitle, intentSender);
        } else {
            createChooser = Intent.createChooser(getIntent(), this.chooserTitle);
            intentSender = null;
        }
        createChooser.addFlags(1073741824);
        if (hasValidKey("showAppsToView", this.options) && hasValidKey("url", this.options)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setType(this.fileShare.getType());
            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", getIntentsToViewFile(intent, this.fileShare.getURI()));
        }
        if (hasValidKey("excludedActivityTypes", this.options)) {
            createChooser.putExtra("android.intent.extra.EXCLUDE_COMPONENTS", getExcludedComponentArray(this.options.getArray("excludedActivityTypes")));
            currentActivity.startActivityForResult(createChooser, RNShareImpl.SHARE_REQUEST_CODE);
        } else {
            currentActivity.startActivityForResult(createChooser, RNShareImpl.SHARE_REQUEST_CODE);
        }
        if (intentSender == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putBoolean("success", true);
            createMap.putString("message", "OK");
            TargetChosenReceiver.callbackResolve(createMap);
        }
    }

    public void setIntent(Intent intent) {
        this.intent = intent;
    }
}

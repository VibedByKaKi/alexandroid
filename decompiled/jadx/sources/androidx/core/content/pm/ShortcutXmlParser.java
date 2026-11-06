package androidx.core.content.pm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes13.dex */
public class ShortcutXmlParser {
    private static final String ATTR_SHORTCUT_ID = "shortcutId";
    private static final Object GET_INSTANCE_LOCK = new Object();
    private static final String META_DATA_APP_SHORTCUTS = "android.app.shortcuts";
    private static final String TAG = "ShortcutXmlParser";
    private static final String TAG_SHORTCUT = "shortcut";
    private static volatile ArrayList<String> sShortcutIds;

    private ShortcutXmlParser() {
    }

    private static String getAttributeValue(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        return attributeValue == null ? xmlPullParser.getAttributeValue(null, str) : attributeValue;
    }

    @WorkerThread
    public static List<String> getShortcutIds(Context context) {
        if (sShortcutIds == null) {
            synchronized (GET_INSTANCE_LOCK) {
                try {
                    if (sShortcutIds == null) {
                        sShortcutIds = new ArrayList<>();
                        sShortcutIds.addAll(parseShortcutIds(context));
                    }
                } finally {
                }
            }
        }
        return sShortcutIds;
    }

    private static XmlResourceParser getXmlResourceParser(Context context, ActivityInfo activityInfo) {
        XmlResourceParser loadXmlMetaData = activityInfo.loadXmlMetaData(context.getPackageManager(), META_DATA_APP_SHORTCUTS);
        if (loadXmlMetaData != null) {
            return loadXmlMetaData;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$3(activityInfo.name, "Failed to open android.app.shortcuts meta-data resource of ");
        return null;
    }

    private static Set<String> parseShortcutIds(Context context) {
        HashSet hashSet = new HashSet();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 128);
        if (queryIntentActivities != null && queryIntentActivities.size() != 0) {
            try {
                Iterator<ResolveInfo> it2 = queryIntentActivities.iterator();
                while (it2.hasNext()) {
                    ActivityInfo activityInfo = it2.next().activityInfo;
                    Bundle bundle = activityInfo.metaData;
                    if (bundle != null && bundle.containsKey(META_DATA_APP_SHORTCUTS)) {
                        XmlResourceParser xmlResourceParser = getXmlResourceParser(context, activityInfo);
                        try {
                            hashSet.addAll(parseShortcutIds(xmlResourceParser));
                            if (xmlResourceParser != null) {
                                xmlResourceParser.close();
                            }
                        } finally {
                        }
                    }
                }
            } catch (Exception e) {
                Log.e(TAG, "Failed to parse the Xml resource: ", e);
            }
        }
        return hashSet;
    }

    @VisibleForTesting
    public static List<String> parseShortcutIds(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String attributeValue;
        ArrayList arrayList = new ArrayList(1);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= 0)) {
                break;
            }
            int depth = xmlPullParser.getDepth();
            String name = xmlPullParser.getName();
            if (next == 2 && depth == 2 && TAG_SHORTCUT.equals(name) && (attributeValue = getAttributeValue(xmlPullParser, ATTR_SHORTCUT_ID)) != null) {
                arrayList.add(attributeValue);
            }
        }
        return arrayList;
    }
}

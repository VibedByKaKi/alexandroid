package com.amazon.appmanager.lib;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.AtomicFile$$ExternalSyntheticBUOutline0;
import com.amazon.alexa.configservice.metrics.MetricsConstants;
import com.amazon.appmanager.R;
import com.amazon.appmanager.lib.PreloadMetricData;
import com.amazon.appmanager.lib.metrics.ApplicationDetails;
import com.amazon.appmanager.lib.metrics.MaftMetricsFactory;
import com.amazon.appmanager.lib.util.AndroidIdUtil;
import com.amazon.maft.metrics.MetricsFactory;
import com.amazon.maft.metrics.PmetMetrics;
import com.amazon.maft.metrics.PreloadMetrics;
import com.amazon.maft.metrics.PreloadMetricsFactory;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class DefaultPreloadManager extends PreloadManager {
    public static final String CONTENT_PROVIDER_ERROR = "ContentProviderError";
    public static final String EMPTY_PRELOAD_ID = "";
    public static final String ERROR_METRIC_NAME = "com.amazon.appmanager.lib.PreloadManager.ERROR";
    public static final String MDIP_CURSOR_COUNT_ZERO = "MDIPCursorCountZero";
    public static final String MDIP_CURSOR_NULL = "MDIPCursorNull";
    public static final String METRIC_PATH_DELIMITER = "/";
    public static final String METRIC_PATH_FIRST = "first";
    public static final String METRIC_PATH_START = "start";
    public static final String PREFERENCES_NAME = "com.amazon.appmanager.lib.PreloadManager";
    public static final String PREFERENCES_PRELOAD_ID = "preload_id";
    public static final Signature SIGNATURE_AMAZON = new Signature("3082056130820349020601200123ab56300d06092a864886f70d01010b05003074311430120603550408130b4e657661646120433d5553313e303c060355040b13354a617661204f626a656374205369676e696e67204f3d416d617a6f6e205365727669636573204c4c43204c3d4c6173205665676173311c301a06035504031313416d617a6f6e2053656c662d5369676e204341301e170d3039303331333138343132365a170d3333313032333030303030305a3074311430120603550408130b4e657661646120433d5553313e303c060355040b13354a617661204f626a656374205369676e696e67204f3d416d617a6f6e205365727669636573204c4c43204c3d4c6173205665676173311c301a06035504031313416d617a6f6e205365727669636573204c4c4330820222300d06092a864886f70d01010105000382020f003082020a0282020100ac60dafe1c962683e46a6e5b5c2945f0f1a75ef8f268f67994c3841a9366aec784ab1baf7ef8c90e95616272fbc71535a478812f872163e0c07a562c6e5acda475f12ec78212ba395ff90b21bc8c0e4ffc927cbdcec695d91c9c369481a7a230956ff3150f43e5ba307c345558095f52c8d830bfd3b29e0f4c81e7e2cf7154dc1a4ae7b6647a983079256fa507eefada8cab1c59c8220e65feee0c0f46f0c2010df8749d4011508f2ae92d73d4b16247e5f068ce826897ff6fe1986a5f296910ab402f8c9625dedd7acf40ea15f11b012f6fde1569527d7604139d3d7f072a71747c6bf0de03e4fe84fa246a9ce581f483d0922e10225e732e632e98861644bf3b5919927086a2ace441daec6bfa237d9a61ea4a529126f7d55dde74039bad8dbfa1d5c51b9c845f504b24893a2857202b1b6e9cb9f1d0746140b58c4aff193446cd20b1d0346258b33dc8ed6fc454d872e255e8cc6d357cc4483b1473adf20bba5243979b63374ae989d8c11b46a136c698c52558593bd5bbcbbad3b5c42a74a2b91387d03d952dd84090aa033cc36b20b8781713544b2a7049725f745d9d2849c9e0199ff6c27bb002831dbe4183b87caf311852bc4709134417a8f4f4887f02f2c550cfd1bcdf6bfba151aef437e4bb67aa48315224c2052bd6e2d5c2daf533e00e73816885dd30ec16f6b0c5eb5876bb2f619986ba30fbad68139c4c08c70203010001300d06092a864886f70d01010b0500038202010050c9ccc6a3ea540ba5e7a0e9723e1e92d4e250edd32b33b56b3400b9b3a9648c2a830df99040226dd223d64f68088192188f790e0a44db321f487774f119ce9f72528e57b38456b17def3a59353211fa3e3510500359e787e075007f52edf39a45cd376a7b8988910ebefb9b09c2a6ace54526a540ab50bac457e5a45e3f17acc27c2ff7beed697c403fdca64396057e4c3780e21ff47cdba1cb7579ef72ac6c0917d8dad13083d6648ba42a1af8dc5176258ea265f7aa255738a429ea6a4363ca93185fb8ae1774684c3633a6762b22f0582f844fcf4cb6fe266eb986a2ac028e5f7fc8cf99d91ac36a556a4be9ea250fa440a958e2c4f9a05387b333b947ae7a40e107a8d9dd28b327c5645f5e5fbdd114f03770970f6c288bb7c4ce690209b1c44e6839c433c2c3cceb9b2a32c98a33144ed3d323a749dec1d0ecd73e0f1bdc37fffcb89ee2c19b413f8442aeaf2aaaa2272f54ce88653bdcd5c81073f32d07907750ee75b09244c3bbb1653021574289107fb39abe22227b8825cb4fbe469b7aca007b49e3f57716cc96f0f89770254233cb4ef86b3c9d76a79e0401816ed9695c5b4728be2df38455050091a3182968bf02a7cd7a7d16995a2463116c2b76ea722cb550864146c52bebeaa39d9ad32a2da1556dc54e79d7c6a3d16756bf26c7eb499e6e369170b732c67d2ee2377d38e157f440e7c63642d581ea65dd1e");
    public static final String URI_PRELOAD_ID_FORMAT = "content://com.amazon.appmanager.preload.app_info.provider/%s";
    private Set<Signature> signaturesAccepted;
    private String preloadId = null;
    private boolean triedGettingPreloadId = false;

    private static boolean checkEnableMetrics(PreloadMetricData preloadMetricData) {
        return preloadMetricData != null;
    }

    private ObfuscatedMarketplaceId getObfuscatedMarketplaceId(@NonNull Context context, @NonNull String str, PreloadMetricsFactory preloadMetricsFactory, PreloadMetricData preloadMetricData) {
        try {
            return ObfuscatedMarketplaceId.valueOf(str);
        } catch (IllegalArgumentException e) {
            PreloadMetrics newPreloadMetrics = preloadMetricsFactory.newPreloadMetrics(Constants.PRELOAD_TAG_MINERVA_METRICS_GROUP_ID, Constants.OBFUSCATED_MARKETPLACE_EXCEPTION_MINERVA_METRIC_SCHEMA_ID);
            newPreloadMetrics.addProperty(Constants.OBFUSCATED_MARKETPLACE_ID, str).addCount(Constants.METRIC_COUNT, 1.0d);
            this.recordMinervaMetricWithAppDetails(newPreloadMetrics, context);
            if (!checkEnableMetrics(preloadMetricData)) {
                return null;
            }
            preloadMetricData.logException(Constants.GET_PRELOAD_ASSOCIATE_TAG, e.getClass().getSimpleName());
            return null;
        }
    }

    @SuppressLint({"ApplySharedPref"})
    private synchronized String getPreloadId(Context context, MetricsFactory metricsFactory, PreloadMetricData preloadMetricData) throws RemoteException, SecurityException {
        if (this.triedGettingPreloadId) {
            return this.preloadId;
        }
        boolean z = true;
        this.triedGettingPreloadId = true;
        PmetMetrics newPmetMetrics = metricsFactory.newPmetMetrics(PREFERENCES_NAME);
        LinkedList linkedList = new LinkedList();
        linkedList.add("start");
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES_NAME, 0);
        this.preloadId = sharedPreferences.getString(PREFERENCES_PRELOAD_ID, null);
        if (checkEnableMetrics(preloadMetricData)) {
            preloadMetricData.setPTPreviousValue(this.preloadId);
        }
        if (this.preloadId != null) {
            z = false;
        }
        if (z) {
            linkedList.add(METRIC_PATH_FIRST);
        }
        if (!z && !"".equals(this.preloadId)) {
            if (checkEnableMetrics(preloadMetricData)) {
                preloadMetricData.setPTSource(PreloadMetricData.SourceType.SP.name());
            }
            linkedList.add(this.preloadId);
            newPmetMetrics.addCount(TextUtils.join("/", linkedList), 1.0d).record();
            return this.preloadId;
        }
        String preloadIdFromAllSources = getPreloadIdFromAllSources(context, metricsFactory, preloadMetricData);
        this.preloadId = preloadIdFromAllSources;
        if (preloadIdFromAllSources == null) {
            sharedPreferences.edit().putString(PREFERENCES_PRELOAD_ID, "").commit();
            linkedList.add(context.getPackageName());
            newPmetMetrics.addCount(TextUtils.join("/", linkedList), 1.0d).record();
            return null;
        }
        sharedPreferences.edit().putString(PREFERENCES_PRELOAD_ID, this.preloadId).commit();
        if (!z) {
            linkedList.add(context.getPackageName());
        }
        linkedList.add(this.preloadId);
        newPmetMetrics.addCount(TextUtils.join("/", linkedList), 1.0d).record();
        return this.preloadId;
    }

    private String getPreloadIdFromAllSources(Context context, MetricsFactory metricsFactory, PreloadMetricData preloadMetricData) throws RemoteException, SecurityException {
        String preloadIdFromContentProvider = getPreloadIdFromContentProvider(context, metricsFactory, preloadMetricData);
        if (preloadIdFromContentProvider != null) {
            if (checkEnableMetrics(preloadMetricData)) {
                preloadMetricData.setPTSource(PreloadMetricData.SourceType.CP.name());
            }
            return preloadIdFromContentProvider;
        }
        String preloadIdFromEmbeddedFile = getPreloadIdFromEmbeddedFile(context, metricsFactory, preloadMetricData);
        if (preloadIdFromEmbeddedFile != null && checkEnableMetrics(preloadMetricData)) {
            preloadMetricData.setPTSource(PreloadMetricData.SourceType.File.name());
        }
        return preloadIdFromEmbeddedFile;
    }

    private String getPreloadIdFromAllSources_Minerva(Context context, PreloadMetricsFactory preloadMetricsFactory, PreloadMetricData preloadMetricData) throws RemoteException, SecurityException, IOException {
        String preloadIdFromContentProvider_Minerva = getPreloadIdFromContentProvider_Minerva(context, preloadMetricsFactory, preloadMetricData);
        if (preloadIdFromContentProvider_Minerva != null) {
            if (checkEnableMetrics(preloadMetricData)) {
                preloadMetricData.setPTSource(PreloadMetricData.SourceType.CP.name());
            }
            return preloadIdFromContentProvider_Minerva;
        }
        String preloadIdFromEmbeddedFile_Minerva = getPreloadIdFromEmbeddedFile_Minerva(context, preloadMetricsFactory, preloadMetricData);
        if (preloadIdFromEmbeddedFile_Minerva != null && checkEnableMetrics(preloadMetricData)) {
            preloadMetricData.setPTSource(PreloadMetricData.SourceType.File.name());
        }
        return preloadIdFromEmbeddedFile_Minerva;
    }

    private String getPreloadIdFromContentProvider(Context context, MetricsFactory metricsFactory, PreloadMetricData preloadMetricData) throws RemoteException, SecurityException {
        Uri parse = Uri.parse("content://com.amazon.appmanager.preload.app_info.provider/" + context.getPackageName());
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(parse.getEncodedAuthority(), 0);
        if (resolveContentProvider == null) {
            return null;
        }
        if (!isSignatureValid(context, resolveContentProvider.packageName)) {
            metricsFactory.newPmetMetrics(ERROR_METRIC_NAME).addCount("SecurityException", 1.0d).record();
            if (checkEnableMetrics(preloadMetricData)) {
                preloadMetricData.logException(Constants.GET_PRELOAD_ID_FROM_CONTENT_PROVIDER, "SecurityException");
            }
            AtomicFile$$ExternalSyntheticBUOutline0.m("ContentProvider package has invalid signature.");
            return null;
        }
        Cursor query = context.getContentResolver().query(parse, null, null, null, null);
        if (query == null) {
            metricsFactory.newPmetMetrics(ERROR_METRIC_NAME).addCount(CONTENT_PROVIDER_ERROR, 1.0d).record();
            if (checkEnableMetrics(preloadMetricData)) {
                preloadMetricData.logException(Constants.GET_PRELOAD_ID_FROM_CONTENT_PROVIDER, "CursorNULL");
            }
            return null;
        }
        try {
            if (query.getCount() == 0) {
                if (checkEnableMetrics(preloadMetricData)) {
                    preloadMetricData.logException(Constants.GET_PRELOAD_ID_FROM_CONTENT_PROVIDER, "CursorCount0");
                }
                return null;
            }
            try {
                query.moveToFirst();
                String string = query.getString(0);
                query.close();
                return string;
            } catch (Exception e) {
                if (!checkEnableMetrics(preloadMetricData)) {
                    throw e;
                }
                preloadMetricData.logException(Constants.GET_PRELOAD_ID_FROM_CONTENT_PROVIDER, e.getClass().getSimpleName());
                throw e;
            }
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    @SuppressFBWarnings
    private String getPreloadIdFromContentProvider_Minerva(Context context, PreloadMetricsFactory preloadMetricsFactory, PreloadMetricData preloadMetricData) throws RemoteException, SecurityException {
        Uri parse = Uri.parse("content://com.amazon.appmanager.preload.app_info.provider/" + context.getPackageName());
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(parse.getEncodedAuthority(), 0);
        if (resolveContentProvider == null) {
            return null;
        }
        if (!isSignatureValid(context, resolveContentProvider.packageName)) {
            if (checkEnableMetrics(preloadMetricData)) {
                preloadMetricData.logException(Constants.GET_PRELOAD_ID_FROM_CONTENT_PROVIDER, "SecurityException");
            }
            AtomicFile$$ExternalSyntheticBUOutline0.m("ContentProvider package has invalid signature.");
            return null;
        }
        try {
            Cursor query = context.getContentResolver().query(parse, null, null, null, null);
            try {
                if (query == null) {
                    recordMinervaExceptionMetric(context, preloadMetricsFactory, MDIP_CURSOR_NULL);
                    if (checkEnableMetrics(preloadMetricData)) {
                        preloadMetricData.logException(Constants.GET_PRELOAD_ID_FROM_CONTENT_PROVIDER, "CursorNULL");
                    }
                    if (query == null) {
                        return null;
                    }
                } else {
                    if (query.getCount() != 0) {
                        query.moveToFirst();
                        String string = query.getString(0);
                        query.close();
                        return string;
                    }
                    recordMinervaExceptionMetric(context, preloadMetricsFactory, MDIP_CURSOR_COUNT_ZERO);
                    if (checkEnableMetrics(preloadMetricData)) {
                        preloadMetricData.logException(Constants.GET_PRELOAD_ID_FROM_CONTENT_PROVIDER, "CursorCount0");
                    }
                }
                query.close();
                return null;
            } finally {
            }
        } catch (Exception e) {
            if (!checkEnableMetrics(preloadMetricData)) {
                throw e;
            }
            preloadMetricData.logException(Constants.GET_PRELOAD_ID_FROM_CONTENT_PROVIDER, e.getClass().getSimpleName());
            throw e;
        }
    }

    private String getPreloadIdFromEmbeddedFile(Context context, MetricsFactory metricsFactory, PreloadMetricData preloadMetricData) {
        return readStringFromRawResourceFile(context, metricsFactory, R.raw.plm_associate_tag, preloadMetricData);
    }

    private String getPreloadIdFromEmbeddedFile_Minerva(Context context, PreloadMetricsFactory preloadMetricsFactory, PreloadMetricData preloadMetricData) throws IOException {
        return readStringFromRawResourceFile_Minerva(context, preloadMetricsFactory, R.raw.plm_associate_tag, preloadMetricData);
    }

    @SuppressLint({"ApplySharedPref"})
    private synchronized String getPreloadId_Minerva(Context context, PreloadMetricsFactory preloadMetricsFactory, PreloadMetricData preloadMetricData) throws RemoteException, SecurityException, IOException {
        if (this.triedGettingPreloadId) {
            return this.preloadId;
        }
        boolean z = true;
        this.triedGettingPreloadId = true;
        PreloadMetrics newPreloadMetrics = preloadMetricsFactory.newPreloadMetrics(Constants.PRELOAD_TAG_MINERVA_METRICS_GROUP_ID, Constants.PRELOAD_TAG_SOURCE_PATH_MINERVA_METRIC_SCHEMA_ID);
        PreloadMetrics newPreloadMetrics2 = preloadMetricsFactory.newPreloadMetrics(Constants.PRELOAD_TAG_MINERVA_METRICS_GROUP_ID, Constants.PRELOAD_TAG_SOURCE_PATH_MINERVA_METRIC_SCHEMA_ID);
        LinkedList linkedList = new LinkedList();
        linkedList.add("start");
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES_NAME, 0);
        this.preloadId = sharedPreferences.getString(PREFERENCES_PRELOAD_ID, null);
        if (checkEnableMetrics(preloadMetricData)) {
            preloadMetricData.setPTPreviousValue(this.preloadId);
        }
        if (this.preloadId != null) {
            z = false;
        }
        if (z) {
            linkedList.add(METRIC_PATH_FIRST);
        }
        if (!z && !"".equals(this.preloadId)) {
            if (checkEnableMetrics(preloadMetricData)) {
                preloadMetricData.setPTSource(PreloadMetricData.SourceType.SP.name());
            }
            linkedList.add(this.preloadId);
            newPreloadMetrics2.addProperty(Constants.METRIC_PATH, TextUtils.join("/", linkedList)).addProperty(Constants.PRELOAD_TAG_GENERATED, "Yes").addCount(Constants.METRIC_COUNT, 1.0d);
            recordMinervaMetricWithAppDetails(newPreloadMetrics2, context);
            return this.preloadId;
        }
        String preloadIdFromAllSources_Minerva = getPreloadIdFromAllSources_Minerva(context, preloadMetricsFactory, preloadMetricData);
        this.preloadId = preloadIdFromAllSources_Minerva;
        if (preloadIdFromAllSources_Minerva == null) {
            sharedPreferences.edit().putString(PREFERENCES_PRELOAD_ID, "").commit();
            linkedList.add(context.getPackageName());
            newPreloadMetrics.addProperty(Constants.METRIC_PATH, TextUtils.join("/", linkedList)).addProperty(Constants.PRELOAD_TAG_GENERATED, "No").addCount(Constants.METRIC_COUNT, 1.0d);
            recordMinervaMetricWithAppDetails(newPreloadMetrics, context);
            return null;
        }
        sharedPreferences.edit().putString(PREFERENCES_PRELOAD_ID, this.preloadId).commit();
        if (!z) {
            linkedList.add(context.getPackageName());
        }
        linkedList.add(this.preloadId);
        newPreloadMetrics2.addProperty(Constants.METRIC_PATH, TextUtils.join("/", linkedList)).addProperty(Constants.PRELOAD_TAG_GENERATED, "Yes").addCount(Constants.METRIC_COUNT, 1.0d);
        recordMinervaMetricWithAppDetails(newPreloadMetrics2, context);
        return this.preloadId;
    }

    private boolean isFirstStart(Context context) {
        return context.getSharedPreferences(PREFERENCES_NAME, 0).getString(PREFERENCES_PRELOAD_ID, null) == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (checkEnableMetrics(r11) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        r11.logException(com.amazon.appmanager.lib.Constants.READ_STRING_FROM_RAW_RESOURCE_FILE, r8.getClass().getSimpleName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        okio.Buffer$$ExternalSyntheticBUOutline0.m((java.lang.Throwable) r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d5, code lost:
    
        if (checkEnableMetrics(r11) == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String readStringFromRawResourceFile(android.content.Context r8, com.amazon.maft.metrics.MetricsFactory r9, int r10, com.amazon.appmanager.lib.PreloadMetricData r11) {
        /*
            java.lang.String r0 = "IOException"
            java.lang.String r1 = "readStringFromRawResourceFile"
            java.lang.String r2 = "com.amazon.appmanager.lib.PreloadManager.ERROR"
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            android.content.res.Resources r8 = r8.getResources()     // Catch: java.lang.Throwable -> L6f android.content.res.Resources.NotFoundException -> L71 java.io.IOException -> L73
            java.io.InputStream r8 = r8.openRawResource(r10)     // Catch: java.lang.Throwable -> L6f android.content.res.Resources.NotFoundException -> L71 java.io.IOException -> L73
            java.io.BufferedReader r10 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L6f android.content.res.Resources.NotFoundException -> L71 java.io.IOException -> L73
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L6f android.content.res.Resources.NotFoundException -> L71 java.io.IOException -> L73
            java.lang.String r7 = "UTF-8"
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r7)     // Catch: java.lang.Throwable -> L6f android.content.res.Resources.NotFoundException -> L71 java.io.IOException -> L73
            r6.<init>(r8, r7)     // Catch: java.lang.Throwable -> L6f android.content.res.Resources.NotFoundException -> L71 java.io.IOException -> L73
            r10.<init>(r6)     // Catch: java.lang.Throwable -> L6f android.content.res.Resources.NotFoundException -> L71 java.io.IOException -> L73
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L34 android.content.res.Resources.NotFoundException -> L38 java.io.IOException -> L3b
            r8.<init>()     // Catch: java.lang.Throwable -> L34 android.content.res.Resources.NotFoundException -> L38 java.io.IOException -> L3b
        L26:
            java.lang.String r6 = r10.readLine()     // Catch: java.lang.Throwable -> L34 android.content.res.Resources.NotFoundException -> L38 java.io.IOException -> L3b
            if (r6 == 0) goto L3e
            java.lang.String r6 = r6.trim()     // Catch: java.lang.Throwable -> L34 android.content.res.Resources.NotFoundException -> L38 java.io.IOException -> L3b
            r8.append(r6)     // Catch: java.lang.Throwable -> L34 android.content.res.Resources.NotFoundException -> L38 java.io.IOException -> L3b
            goto L26
        L34:
            r8 = move-exception
            r5 = r10
            goto Lbf
        L38:
            r8 = move-exception
            r5 = r10
            goto L75
        L3b:
            r8 = move-exception
            r5 = r10
            goto L9d
        L3e:
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L34 android.content.res.Resources.NotFoundException -> L38 java.io.IOException -> L3b
            int r6 = r8.length()     // Catch: java.lang.Throwable -> L34 android.content.res.Resources.NotFoundException -> L38 java.io.IOException -> L3b
            if (r6 <= 0) goto L49
            r5 = r8
        L49:
            r10.close()     // Catch: java.io.IOException -> L4d
            return r5
        L4d:
            r8 = move-exception
            com.amazon.maft.metrics.PmetMetrics r9 = r9.newPmetMetrics(r2)
            com.amazon.maft.metrics.PmetMetrics r9 = r9.addCount(r0, r3)
            r9.record()
            boolean r9 = checkEnableMetrics(r11)
            if (r9 == 0) goto L6a
        L5f:
            java.lang.Class r9 = r8.getClass()
            java.lang.String r9 = r9.getSimpleName()
            r11.logException(r1, r9)
        L6a:
            okio.Buffer$$ExternalSyntheticBUOutline0.m(r8)
            r8 = 0
            return r8
        L6f:
            r8 = move-exception
            goto Lbf
        L71:
            r8 = move-exception
            goto L75
        L73:
            r8 = move-exception
            goto L9d
        L75:
            com.amazon.maft.metrics.PmetMetrics r10 = r9.newPmetMetrics(r2)     // Catch: java.lang.Throwable -> L6f
            java.lang.Class<android.content.res.Resources$NotFoundException> r6 = android.content.res.Resources.NotFoundException.class
            java.lang.String r6 = r6.getSimpleName()     // Catch: java.lang.Throwable -> L6f
            com.amazon.maft.metrics.PmetMetrics r10 = r10.addCount(r6, r3)     // Catch: java.lang.Throwable -> L6f
            r10.record()     // Catch: java.lang.Throwable -> L6f
            boolean r10 = checkEnableMetrics(r11)     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L97
            java.lang.Class r10 = r8.getClass()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r10 = r10.getSimpleName()     // Catch: java.lang.Throwable -> L6f
            r11.logException(r1, r10)     // Catch: java.lang.Throwable -> L6f
        L97:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L6f
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L6f
            throw r10     // Catch: java.lang.Throwable -> L6f
        L9d:
            com.amazon.maft.metrics.PmetMetrics r10 = r9.newPmetMetrics(r2)     // Catch: java.lang.Throwable -> L6f
            com.amazon.maft.metrics.PmetMetrics r10 = r10.addCount(r0, r3)     // Catch: java.lang.Throwable -> L6f
            r10.record()     // Catch: java.lang.Throwable -> L6f
            boolean r10 = checkEnableMetrics(r11)     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto Lb9
            java.lang.Class r10 = r8.getClass()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r10 = r10.getSimpleName()     // Catch: java.lang.Throwable -> L6f
            r11.logException(r1, r10)     // Catch: java.lang.Throwable -> L6f
        Lb9:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L6f
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L6f
            throw r10     // Catch: java.lang.Throwable -> L6f
        Lbf:
            if (r5 == 0) goto Ld8
            r5.close()     // Catch: java.io.IOException -> Lc5
            goto Ld8
        Lc5:
            r8 = move-exception
            com.amazon.maft.metrics.PmetMetrics r9 = r9.newPmetMetrics(r2)
            com.amazon.maft.metrics.PmetMetrics r9 = r9.addCount(r0, r3)
            r9.record()
            boolean r9 = checkEnableMetrics(r11)
            if (r9 == 0) goto L6a
            goto L5f
        Ld8:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.appmanager.lib.DefaultPreloadManager.readStringFromRawResourceFile(android.content.Context, com.amazon.maft.metrics.MetricsFactory, int, com.amazon.appmanager.lib.PreloadMetricData):java.lang.String");
    }

    private void recordDeviceMetric(@NonNull PreloadMetricsFactory preloadMetricsFactory, Context context, String str, String str2) {
        try {
            PreloadMetrics newPreloadMetrics = preloadMetricsFactory.newPreloadMetrics(Constants.PRELOAD_TAG_MINERVA_METRICS_GROUP_ID, Constants.PRELOAD_TAG_REQUEST_MINERVA_METRIC_SCHEMA_ID);
            String androidId = AndroidIdUtil.getAndroidId(context);
            if (TextUtils.isEmpty(androidId)) {
                androidId = "UNKNOWN";
            }
            newPreloadMetrics.addCustomerId().addDeviceType().addProperty(Constants.DEVICE_ID, androidId).addProperty(Constants.PRELOAD_TAG_GENERATED, str).addProperty(Constants.IS_FIRST_START, str2);
            recordMinervaMetricWithAppDetails(newPreloadMetrics, context);
        } catch (Exception unused) {
        }
    }

    @Override // com.amazon.appmanager.lib.PreloadManager
    @Nullable
    public String getPreloadAssociateTag(@NonNull Context context, @NonNull MetricsFactory metricsFactory, @NonNull String str, PreloadMetricData preloadMetricData) throws RemoteException, UnrecognizedMarketplaceException, IllegalArgumentException, SecurityException {
        if (context == null || metricsFactory == null || str == null) {
            if (checkEnableMetrics(preloadMetricData)) {
                preloadMetricData.logException(Constants.GET_PRELOAD_ASSOCIATE_TAG, MetricsConstants.Error.ILLEGAL_ARGUMENT_EXCEPTION);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("None of the arguments may be null.");
            return null;
        }
        try {
            ObfuscatedMarketplaceId valueOf = ObfuscatedMarketplaceId.valueOf(str);
            String preloadId = getPreloadId(context, metricsFactory, preloadMetricData);
            if (preloadId == null) {
                return null;
            }
            Locale locale = Locale.ENGLISH;
            return a$$ExternalSyntheticOutline0.m$1(preloadId, "-", valueOf.toRegionId());
        } catch (IllegalArgumentException e) {
            metricsFactory.newPmetMetrics(ERROR_METRIC_NAME).addProperty("obfuscatedMarketplaceId", str).addCount("UnrecognizedMarketplaceException", 1.0d).record();
            if (checkEnableMetrics(preloadMetricData)) {
                preloadMetricData.logException(Constants.GET_PRELOAD_ASSOCIATE_TAG, e.getClass().getSimpleName());
            }
            return null;
        }
    }

    @Override // com.amazon.appmanager.lib.PreloadManager
    @Nullable
    public String getPreloadAssociateTagWithoutRegionId(@NonNull Context context, @NonNull MetricsFactory metricsFactory) throws RemoteException, IllegalArgumentException, SecurityException {
        if (context != null && metricsFactory != null) {
            return getPreloadId(context, metricsFactory, null);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("None of the arguments may be null.");
        return null;
    }

    @Override // com.amazon.appmanager.lib.PreloadManager
    @Nullable
    public String getPreloadAssociateTagWithoutRegionId_Minerva(@NonNull Context context, @NonNull PreloadMetricsFactory preloadMetricsFactory) throws RemoteException, IllegalArgumentException, SecurityException, IOException {
        try {
            if (context == null || preloadMetricsFactory == null) {
                throw new IllegalArgumentException("None of the arguments may be null.");
            }
            return getPreloadId_Minerva(context, preloadMetricsFactory, null);
        } catch (Exception e) {
            recordMinervaExceptionMetric(context, preloadMetricsFactory, e.getClass().getSimpleName());
            return null;
        }
    }

    @Override // com.amazon.appmanager.lib.PreloadManager
    @Nullable
    public String getPreloadAssociateTag_Minerva(@NonNull Context context, @NonNull PreloadMetricsFactory preloadMetricsFactory, @NonNull String str, PreloadMetricData preloadMetricData) throws RemoteException, UnrecognizedMarketplaceException, IllegalArgumentException, SecurityException, IOException {
        try {
            if (context == null || preloadMetricsFactory == null || str == null) {
                if (checkEnableMetrics(preloadMetricData)) {
                    preloadMetricData.logException(Constants.GET_PRELOAD_ASSOCIATE_TAG, MetricsConstants.Error.ILLEGAL_ARGUMENT_EXCEPTION);
                }
                throw new IllegalArgumentException("None of the arguments may be null.");
            }
            ObfuscatedMarketplaceId obfuscatedMarketplaceId = getObfuscatedMarketplaceId(context, str, preloadMetricsFactory, preloadMetricData);
            if (obfuscatedMarketplaceId == null) {
                return null;
            }
            String str2 = isFirstStart(context) ? "Y" : "N";
            String preloadId_Minerva = getPreloadId_Minerva(context, preloadMetricsFactory, preloadMetricData);
            if (preloadId_Minerva != null) {
                Locale locale = Locale.ENGLISH;
                preloadId_Minerva = preloadId_Minerva + "-" + obfuscatedMarketplaceId.toRegionId();
            }
            recordDeviceMetric(preloadMetricsFactory, context, Objects.toString(preloadId_Minerva, "UNKNOWN"), str2);
            return preloadId_Minerva;
        } catch (Exception e) {
            recordMinervaExceptionMetric(context, preloadMetricsFactory, e.getClass().getSimpleName());
            return null;
        }
    }

    public boolean isSignatureValid(Context context, String str) {
        if (this.signaturesAccepted == null) {
            HashSet hashSet = new HashSet();
            this.signaturesAccepted = hashSet;
            hashSet.add(SIGNATURE_AMAZON);
            try {
                for (Signature signature : context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures) {
                    this.signaturesAccepted.add(signature);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        try {
            for (Signature signature2 : context.getPackageManager().getPackageInfo(str, 64).signatures) {
                if (this.signaturesAccepted.contains(signature2)) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        if (checkEnableMetrics(r21) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        r21.logException(com.amazon.appmanager.lib.Constants.READ_STRING_FROM_RAW_RESOURCE_FILE, r0.getClass().getSimpleName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
    
        okio.Buffer$$ExternalSyntheticBUOutline0.m$2(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0109, code lost:
    
        if (checkEnableMetrics(r21) == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String readStringFromRawResourceFile_Minerva(android.content.Context r18, com.amazon.maft.metrics.PreloadMetricsFactory r19, int r20, com.amazon.appmanager.lib.PreloadMetricData r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.appmanager.lib.DefaultPreloadManager.readStringFromRawResourceFile_Minerva(android.content.Context, com.amazon.maft.metrics.PreloadMetricsFactory, int, com.amazon.appmanager.lib.PreloadMetricData):java.lang.String");
    }

    public void recordMinervaExceptionMetric(Context context, PreloadMetricsFactory preloadMetricsFactory, String str) {
        if (context == null || preloadMetricsFactory == null) {
            return;
        }
        PreloadMetrics newPreloadMetrics = preloadMetricsFactory.newPreloadMetrics(Constants.PRELOAD_TAG_MINERVA_METRICS_GROUP_ID, Constants.PRELOAD_TAG_MDIP_ERROR_MINERVA_METRIC_SCHEMA_ID);
        newPreloadMetrics.addProperty(Constants.EXCEPTION_NAME, str).addCount(Constants.METRIC_COUNT, 1.0d);
        recordMinervaMetricWithAppDetails(newPreloadMetrics, context);
    }

    public void recordMinervaMetricWithAppDetails(PreloadMetrics preloadMetrics, Context context) {
        ApplicationDetails applicationDetails = new ApplicationDetails(context);
        try {
            preloadMetrics.addProperty("ApplicationName", applicationDetails.getApplicationName()).addProperty("ApplicationVersion", applicationDetails.getApplicationVersion()).record();
        } catch (Exception unused) {
        }
    }

    @Override // com.amazon.appmanager.lib.PreloadManager
    @Nullable
    public String getPreloadAssociateTagWithoutRegionId_Minerva(@NonNull Context context) throws RemoteException, IllegalArgumentException, SecurityException, IOException {
        return getPreloadId_Minerva(context, MaftMetricsFactory.getInstance(context), null);
    }

    public String readStringFromRawResourceFile(Context context, MetricsFactory metricsFactory, int i) {
        return readStringFromRawResourceFile(context, metricsFactory, i, null);
    }

    public String readStringFromRawResourceFile_Minerva(Context context, PreloadMetricsFactory preloadMetricsFactory, int i) throws IOException {
        return readStringFromRawResourceFile_Minerva(context, preloadMetricsFactory, i, null);
    }

    @Override // com.amazon.appmanager.lib.PreloadManager
    @Nullable
    public String getPreloadAssociateTag(@NonNull Context context, @NonNull MetricsFactory metricsFactory, @NonNull String str) throws RemoteException, UnrecognizedMarketplaceException, IllegalArgumentException, SecurityException {
        return getPreloadAssociateTag(context, metricsFactory, str, null);
    }

    @Override // com.amazon.appmanager.lib.PreloadManager
    @Nullable
    public String getPreloadAssociateTag_Minerva(@NonNull Context context, @NonNull PreloadMetricsFactory preloadMetricsFactory, @NonNull String str) throws RemoteException, UnrecognizedMarketplaceException, IllegalArgumentException, SecurityException, IOException {
        return getPreloadAssociateTag_Minerva(context, preloadMetricsFactory, str, null);
    }

    @Override // com.amazon.appmanager.lib.PreloadManager
    @Nullable
    public String getPreloadAssociateTag_Minerva(@NonNull Context context, @NonNull String str, PreloadMetricData preloadMetricData) throws RemoteException, UnrecognizedMarketplaceException, IllegalArgumentException, SecurityException, IOException {
        return getPreloadAssociateTag_Minerva(context, MaftMetricsFactory.getInstance(context), str, preloadMetricData);
    }

    @Override // com.amazon.appmanager.lib.PreloadManager
    @Nullable
    public String getPreloadAssociateTag_Minerva(@NonNull Context context, @NonNull String str) throws RemoteException, UnrecognizedMarketplaceException, IllegalArgumentException, SecurityException, IOException {
        return getPreloadAssociateTag_Minerva(context, MaftMetricsFactory.getInstance(context), str, null);
    }
}

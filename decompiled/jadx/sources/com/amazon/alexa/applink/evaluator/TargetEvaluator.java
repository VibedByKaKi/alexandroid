package com.amazon.alexa.applink.evaluator;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class TargetEvaluator {
    private static final String TAG = "TargetEvaluator";
    private final Context context;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.applink.evaluator.TargetEvaluator$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$applink$evaluator$TargetIdentifierType;

        static {
            int[] iArr = new int[TargetIdentifierType.values().length];
            $SwitchMap$com$amazon$alexa$applink$evaluator$TargetIdentifierType = iArr;
            try {
                iArr[TargetIdentifierType.URI_HTTP_SCHEME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$applink$evaluator$TargetIdentifierType[TargetIdentifierType.URI_CUSTOM_SCHEME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$applink$evaluator$TargetIdentifierType[TargetIdentifierType.URI_APP_IDENTIFIER_SCHEME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$applink$evaluator$TargetIdentifierType[TargetIdentifierType.URI_ANDROID_INTENT_SCHEME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public TargetEvaluator(@NonNull Context context) {
        this.context = context;
    }

    @Nullable
    private Intent getFallbackIntent(@NonNull Target target) {
        String catalogId = target.catalogId();
        String identifier = target.identifier();
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$applink$evaluator$TargetIdentifierType[target.targetIdentifierType().ordinal()];
        if (i == 1 || i == 2) {
            if (target.isMandatoryToLaunchTarget()) {
                Log.i(TAG, "isMandatoryToLaunchTarget is true. no fallback intent");
                return null;
            }
            Log.i(TAG, "set fallback intent");
            return newIntentFromUriString(identifier);
        }
        if (i != 4) {
            return null;
        }
        if (target.isMandatoryToLaunchTarget()) {
            Log.i(TAG, "isMandatoryToLaunchTarget is true. no fallback intent");
            return null;
        }
        Intent intentFromIntentSchemeString = getIntentFromIntentSchemeString(identifier);
        if (!TextUtils.isEmpty(catalogId) && intentFromIntentSchemeString != null) {
            Log.i(TAG, "set package to null for fallback intent");
            intentFromIntentSchemeString.setPackage(null);
        }
        return intentFromIntentSchemeString;
    }

    @NonNull
    private InstallStatus getInstallStatus(@NonNull Target target) {
        String catalogId = target.catalogId();
        target.catalogId();
        if (TextUtils.isEmpty(catalogId)) {
            return InstallStatus.UNKNOWN;
        }
        try {
            this.context.getPackageManager().getPackageInfo(catalogId, 0);
            return InstallStatus.INSTALLED;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i(TAG, "package not installed");
            return InstallStatus.NOT_INSTALLED;
        }
    }

    @Nullable
    private Intent getIntentFromIntentSchemeString(String str) {
        try {
            return Intent.parseUri(str, 1);
        } catch (URISyntaxException unused) {
            Log.e(TAG, "error parsing intent");
            return null;
        }
    }

    @Nullable
    private Intent getLaunchIntent(@NonNull Target target) {
        String catalogId = target.catalogId();
        String identifier = target.identifier();
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$applink$evaluator$TargetIdentifierType[target.targetIdentifierType().ordinal()];
        if (i == 1 || i == 2) {
            Intent newIntentFromUriString = newIntentFromUriString(identifier);
            if (TextUtils.isEmpty(catalogId)) {
                Log.i(TAG, "no package name specified.");
                return newIntentFromUriString;
            }
            Log.i(TAG, "set intent package name");
            newIntentFromUriString.setPackage(catalogId);
            return newIntentFromUriString;
        }
        if (i == 3) {
            return this.context.getPackageManager().getLaunchIntentForPackage(identifier);
        }
        if (i != 4) {
            Log.wtf(TAG, "some IdentifierType is not handled: " + target.targetIdentifierType().toString());
            return null;
        }
        Intent intentFromIntentSchemeString = getIntentFromIntentSchemeString(identifier);
        if (TextUtils.isEmpty(catalogId) || intentFromIntentSchemeString == null || !TextUtils.isEmpty(intentFromIntentSchemeString.getPackage())) {
            Log.i(TAG, "Not adding packageName to the parsed intent.");
            return intentFromIntentSchemeString;
        }
        Log.i(TAG, "add packageName to the parsed intent.");
        intentFromIntentSchemeString.setPackage(catalogId);
        return intentFromIntentSchemeString;
    }

    @NonNull
    private Intent newIntentFromUriString(@NonNull String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setFlags(268435456);
        intent.addFlags(2097152);
        intent.addFlags(67108864);
        return intent;
    }

    @VisibleForTesting
    public boolean canLaunchIntent(@Nullable Intent intent) {
        ActivityInfo activityInfo;
        if (intent == null) {
            return false;
        }
        ResolveInfo resolveActivity = this.context.getPackageManager().resolveActivity(intent, intent.getComponent() != null ? 0 : 65536);
        if (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null) {
            Log.i(TAG, "No activity available to handle the intent.");
            return false;
        }
        String str = activityInfo.permission;
        if (str == null) {
            return true;
        }
        boolean z = this.context.getPackageManager().checkPermission(str, this.context.getPackageName()) == 0;
        StringBuilder sb = new StringBuilder("permission: (");
        sb.append(str);
        sb.append(") is granted: ");
        sb.append(z);
        return z;
    }

    @NonNull
    public EvaluatedTargetState evaluate(@NonNull Target target) {
        boolean z;
        InstallStatus installStatus = getInstallStatus(target);
        Intent launchIntent = getLaunchIntent(target);
        Intent fallbackIntent = getFallbackIntent(target);
        boolean z2 = true;
        if (!canLaunchIntent(launchIntent)) {
            if (canLaunchIntent(fallbackIntent)) {
                z = true;
                z2 = false;
                launchIntent = fallbackIntent;
                return EvaluatedTargetState.create(target, launchIntent, installStatus, z2, z);
            }
            z2 = false;
            launchIntent = null;
        }
        z = z2;
        return EvaluatedTargetState.create(target, launchIntent, installStatus, z2, z);
    }

    @NonNull
    public List<EvaluatedTargetState> evaluateTargets(@NonNull List<Target> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Target> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(evaluate(it2.next()));
        }
        return arrayList;
    }
}

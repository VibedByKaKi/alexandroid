package com.amazon.alexa.client.alexaservice.features.launcher;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.alexaservice.base.application.permissions.PermissionsChecker;
import com.amazon.alexa.client.alexaservice.features.launcher.payload.IdentifierType;
import com.amazon.alexa.client.alexaservice.features.launcher.payload.Reasons;
import com.amazon.alexa.client.alexaservice.features.launcher.payload.Target;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public final class TargetEvaluator {
    public static final String BETA_APP_PACKAGE_NAME = "com.amazon.dee.app.beta";
    private static final String TAG = "TargetEvaluator";
    private final Context context;
    private final PackageManager packageManager;
    private final PermissionsChecker permissionsChecker;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.client.alexaservice.features.launcher.TargetEvaluator$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$client$alexaservice$features$launcher$payload$IdentifierType;

        static {
            int[] iArr = new int[IdentifierType.values().length];
            $SwitchMap$com$amazon$alexa$client$alexaservice$features$launcher$payload$IdentifierType = iArr;
            try {
                iArr[IdentifierType.URI_HTTP_SCHEME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$client$alexaservice$features$launcher$payload$IdentifierType[IdentifierType.URI_CUSTOM_SCHEME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$client$alexaservice$features$launcher$payload$IdentifierType[IdentifierType.URI_APP_IDENTIFIER_SCHEME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$client$alexaservice$features$launcher$payload$IdentifierType[IdentifierType.URI_ANDROID_INTENT_SCHEME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Inject
    public TargetEvaluator(PackageManager packageManager, PermissionsChecker permissionsChecker, Context context) {
        this.packageManager = packageManager;
        this.permissionsChecker = permissionsChecker;
        this.context = context;
    }

    @Nullable
    private Intent getFallbackIntent(Target target) {
        String catalogId = target.getCatalogId();
        String value = target.getIdentifier().getValue();
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$client$alexaservice$features$launcher$payload$IdentifierType[target.getIdentifierType().ordinal()];
        if (i == 1 || i == 2) {
            if (target.getLaunchConfig() == null || !Boolean.TRUE.equals(target.getLaunchConfig().isMandatoryToLaunchTarget())) {
                Log.i(TAG, "set fallback intent");
                return newIntentFromUriString(value);
            }
            Log.i(TAG, "isMandatoryToLaunchTarget is true. no fallback intent");
            return null;
        }
        if (i != 4) {
            return null;
        }
        if (target.getLaunchConfig() != null && Boolean.TRUE.equals(target.getLaunchConfig().isMandatoryToLaunchTarget())) {
            Log.i(TAG, "isMandatoryToLaunchTarget is true. no fallback intent");
            return null;
        }
        Intent intentFromIntentSchemeString = getIntentFromIntentSchemeString(value);
        if (catalogId != null && intentFromIntentSchemeString != null) {
            Log.i(TAG, "set package to null for fallback intent");
            intentFromIntentSchemeString.setPackage(null);
        }
        return intentFromIntentSchemeString;
    }

    private InstallStatus getInstallStatus(Target target) {
        String catalogId = target.getCatalogId();
        if (catalogId == null) {
            return InstallStatus.UNKNOWN;
        }
        try {
            this.packageManager.getPackageInfo(catalogId, 0);
            return InstallStatus.INSTALLED;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i(TAG, "package not installed:" + target.getCatalogId());
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
    private Intent getLaunchIntent(Target target) {
        String catalogId = target.getCatalogId();
        String value = target.getIdentifier().getValue();
        String packageName = this.context.getPackageName();
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$client$alexaservice$features$launcher$payload$IdentifierType[target.getIdentifierType().ordinal()];
        if (i == 1 || i == 2) {
            Intent newIntentFromUriString = newIntentFromUriString(value);
            if (catalogId != null) {
                Log.i(TAG, "set intent package name: ".concat(catalogId));
                newIntentFromUriString.setPackage(catalogId);
                return newIntentFromUriString;
            }
            if (packageName.equals("com.amazon.dee.app.beta") && isTargetAlexaUrl(value)) {
                newIntentFromUriString.setPackage(packageName);
                return newIntentFromUriString;
            }
            Log.i(TAG, "no package name specified.");
            return newIntentFromUriString;
        }
        if (i == 3) {
            return this.packageManager.getLaunchIntentForPackage(value);
        }
        if (i != 4) {
            Log.wtf(TAG, "some IdentifierType is not handled: " + target.getIdentifierType());
            return null;
        }
        Intent intentFromIntentSchemeString = getIntentFromIntentSchemeString(value);
        if (catalogId != null && intentFromIntentSchemeString != null && intentFromIntentSchemeString.getPackage() == null) {
            Log.i(TAG, "add packageName to the parsed intent.");
            intentFromIntentSchemeString.setPackage(catalogId);
        }
        return intentFromIntentSchemeString;
    }

    private boolean isTargetAlexaUrl(String str) {
        try {
            String host = new URI(str).getHost();
            if (host.startsWith("www.")) {
                host = host.substring(4);
            }
            return host.startsWith("alexa");
        } catch (Exception e) {
            Log.e(TAG, "Error parsing URL", e);
            return false;
        }
    }

    @NonNull
    private Intent newIntentFromUriString(String str) {
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
        ResolveInfo resolveActivity = this.packageManager.resolveActivity(intent, intent.getComponent() != null ? 0 : 65536);
        if (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null) {
            Log.i(TAG, "No activity available to handle the intent.");
            return false;
        }
        String str = activityInfo.permission;
        if (str == null) {
            return true;
        }
        boolean z = this.permissionsChecker.checkSelfPermission(this.context, str) == 0;
        StringBuilder sb = new StringBuilder("permission: (");
        sb.append(str);
        sb.append(") is granted: ");
        sb.append(z);
        return z;
    }

    public TargetState evaluate(Target target) {
        InstallStatus installStatus = getInstallStatus(target);
        Intent launchIntent = getLaunchIntent(target);
        Intent fallbackIntent = getFallbackIntent(target);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        if (!canLaunchIntent(launchIntent)) {
            if (canLaunchIntent(fallbackIntent)) {
                z = true;
                launchIntent = fallbackIntent;
            } else {
                launchIntent = null;
            }
            if (InstallStatus.INSTALLED.equals(installStatus)) {
                Log.i(TAG, "app exists, but identifier cannot be launched in that app.");
                arrayList.add(Reasons.INCOMPAT_VERSION_INSTALLED);
            } else if (InstallStatus.NOT_INSTALLED.equals(installStatus)) {
                Log.i(TAG, "app not installed.");
                arrayList.add(Reasons.NOT_INSTALLED);
            } else {
                Log.i(TAG, "app not specified.");
                arrayList.add(Reasons.NOT_INSTALLED);
            }
        }
        return TargetState.create(launchIntent, z, arrayList);
    }
}

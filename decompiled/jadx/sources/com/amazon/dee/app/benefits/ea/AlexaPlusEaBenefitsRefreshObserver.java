package com.amazon.dee.app.benefits.ea;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.benefits.api.BenefitsService;
import com.amazon.alexa.benefits.api.models.ForceBenefitsEntitlementRequest;
import com.amazon.alexa.benefits.api.models.ForceBenefitsRefreshCallback;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.dee.app.dependencies.ApplicationScope;
import dagger.Lazy;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ApplicationScope
/* loaded from: classes3.dex */
public final class AlexaPlusEaBenefitsRefreshObserver {

    @VisibleForTesting
    static final String ALEXA_PLUS_ENABLED_KEY = "alexa_plus_enabled";

    @VisibleForTesting
    static final int ENABLED_VALUE = 1;

    @VisibleForTesting
    static final String MOBILYTICS_OWNER_ID = "fe65dc6b-ce6f-4170-8d97-83a30dab896a";
    private static final String TAG = "AlexaPlusEaBenefitsRefreshObserver";
    private final Lazy<BenefitsService> benefitsService;
    private final ContentObserver observer = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: com.amazon.dee.app.benefits.ea.AlexaPlusEaBenefitsRefreshObserver.1
        @Override // android.database.ContentObserver
        public void onChange(boolean z, @Nullable Uri uri) {
            AlexaPlusEaBenefitsRefreshObserver.this.handleEnabledChanged();
        }
    };
    private final ContentResolver resolver;

    @Inject
    public AlexaPlusEaBenefitsRefreshObserver(@NonNull Context context, @NonNull Lazy<BenefitsService> lazy) {
        this.resolver = context.getContentResolver();
        this.benefitsService = lazy;
    }

    @VisibleForTesting
    public void forceBenefitsRefresh(@NonNull final String str) {
        try {
            this.benefitsService.get().forceBenefitsRefresh(new ForceBenefitsEntitlementRequest("fe65dc6b-ce6f-4170-8d97-83a30dab896a"), new ForceBenefitsRefreshCallback() { // from class: com.amazon.dee.app.benefits.ea.AlexaPlusEaBenefitsRefreshObserver.2
                @Override // com.amazon.alexa.benefits.api.models.ForceBenefitsRefreshCallback
                public void onFailure(Throwable th) {
                    Log.e(AlexaPlusEaBenefitsRefreshObserver.TAG, "forceBenefitsRefresh failed (reason=" + str + MarkdownConstants.RIGHT_PARENTHESIS, th);
                }

                @Override // com.amazon.alexa.benefits.api.models.ForceBenefitsRefreshCallback
                public void onSuccess() {
                    Log.i(AlexaPlusEaBenefitsRefreshObserver.TAG, "forceBenefitsRefresh succeeded (reason=" + str + MarkdownConstants.RIGHT_PARENTHESIS);
                }
            });
        } catch (RuntimeException e) {
            Log.e(TAG, "Could not force BMCL refresh (reason=" + str + MarkdownConstants.RIGHT_PARENTHESIS, e);
        }
    }

    @VisibleForTesting
    public void handleEnabledChanged() {
        int i = Settings.Secure.getInt(this.resolver, ALEXA_PLUS_ENABLED_KEY, 0);
        if (i != 1) {
            ParcelCompat$$ExternalSyntheticOutline0.m(i, "alexa_plus_enabled changed (value=", "); no refresh", TAG);
        } else {
            Log.i(TAG, "alexa_plus_enabled=1 (enabled); forcing BMCL refresh");
            forceBenefitsRefresh(ALEXA_PLUS_ENABLED_KEY);
        }
    }

    public void register() {
        this.resolver.registerContentObserver(Settings.Secure.getUriFor(ALEXA_PLUS_ENABLED_KEY), false, this.observer);
        Log.i(TAG, "Registered alexa_plus_enabled observer (key=alexa_plus_enabled)");
    }

    public void unregister() {
        this.resolver.unregisterContentObserver(this.observer);
        Log.i(TAG, "Unregistered alexa_plus_enabled observer");
    }
}

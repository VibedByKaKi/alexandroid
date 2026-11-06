package com.amazon.alexa.handsfree.audio.features;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.feature.consumer.DefaultFeatureFlagConsumer;
import com.amazon.alexa.feature.consumer.api.FeatureQuery;
import com.amazon.alexa.handsfree.devices.AMPDInformationProvider;
import com.amazon.alexa.handsfree.protocols.features.FeatureChecker;
import com.amazon.alexa.handsfree.protocols.features.HandsFreeComponent;
import com.amazon.alexa.handsfree.protocols.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ComponentEnablementResolver {
    private static final String TAG = "ComponentEnablementResolver";
    private final AMPDInformationProvider mAMPDInformationProvider;
    private final Context mContext;
    private final FeatureChecker mFeatureChecker;

    public ComponentEnablementResolver(Context context) {
        this(context, AMPDInformationProvider.getInstance(context), new FeatureCheckerImpl(new DefaultFeatureFlagConsumer(context).getFeatureQuery(), 0));
    }

    public boolean isComponentEnabled(@NonNull HandsFreeComponent handsFreeComponent) {
        for (String str : handsFreeComponent.getAlexaWeblabListByComponent()) {
            if (!isWeblabEnabled(str)) {
                Log.d(TAG, str + " is not enabled.");
                return false;
            }
        }
        Log.d(TAG, handsFreeComponent.name() + " is enabled.");
        return true;
    }

    public boolean isWeblabEnabled(@NonNull String str) {
        if (this.mAMPDInformationProvider.isHandsFreeCapable()) {
            return this.mFeatureChecker.isActive(str, false);
        }
        Log.d(TAG, str + " is not enabled as device information not found.");
        return false;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class FeatureCheckerImpl implements FeatureChecker {
        private final FeatureQuery mFeatureQuery;

        private FeatureCheckerImpl(FeatureQuery featureQuery) {
            this.mFeatureQuery = featureQuery;
        }

        @Override // com.amazon.alexa.handsfree.protocols.features.FeatureChecker
        public boolean getIsFeatureCheckerReady() {
            return false;
        }

        @Override // com.amazon.alexa.handsfree.protocols.features.FeatureChecker
        public boolean isActive(@NonNull String str, boolean z) {
            return this.mFeatureQuery.isActive(str);
        }

        public /* synthetic */ FeatureCheckerImpl(FeatureQuery featureQuery, int i) {
            this(featureQuery);
        }
    }

    @VisibleForTesting
    public ComponentEnablementResolver(Context context, AMPDInformationProvider aMPDInformationProvider, FeatureChecker featureChecker) {
        this.mContext = context;
        this.mAMPDInformationProvider = aMPDInformationProvider;
        this.mFeatureChecker = featureChecker;
    }
}

package com.amazon.alexa.handsfree.metrics.mobilytics;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.devices.DeviceTypeInformationProvider;
import com.amazon.alexa.handsfree.metrics.events.AMPDMetadataProvider;
import com.amazon.alexa.handsfree.metrics.utils.AttributionTagProvider;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfScope;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.enrollmenttype.EnrollmentTypeResolver;
import com.amazon.alexa.handsfree.protocols.utils.ApplicationInformationProvider;
import com.amazon.alexa.mobilytics.event.DefaultMobilyticsEvent;
import com.amazon.alexa.mobilytics.event.metadata.AMPDMetadata;
import com.amazon.alexa.mobilytics.event.metadata.EventMetadata;
import dagger.Lazy;
import java.util.ArrayList;
import java.util.Collection;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AhfScope
/* loaded from: classes17.dex */
public class MobilyticsMetadataProvider {
    private final String mAndroidId;
    private final ApplicationInformationProvider mApplicationInformationProvider;
    private final AttributionTagProvider mAttributionTagProvider;
    private final Context mContext;
    private final DeviceTypeInformationProvider mDeviceTypeInformationProvider;
    private final Lazy<EnrollmentTypeResolver> mEnrollmentTypeResolverLazy;

    @Inject
    public MobilyticsMetadataProvider(@NonNull Context context, @NonNull ApplicationInformationProvider applicationInformationProvider, @NonNull DeviceTypeInformationProvider deviceTypeInformationProvider, @NonNull Lazy<EnrollmentTypeResolver> lazy, @NonNull AttributionTagProvider attributionTagProvider, @NonNull String str) {
        this.mContext = context;
        this.mApplicationInformationProvider = applicationInformationProvider;
        this.mDeviceTypeInformationProvider = deviceTypeInformationProvider;
        this.mEnrollmentTypeResolverLazy = lazy;
        this.mAttributionTagProvider = attributionTagProvider;
        this.mAndroidId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public Collection<EventMetadata> getMobilyticsMetadata(@NonNull DefaultMobilyticsEvent defaultMobilyticsEvent) {
        ArrayList arrayList = new ArrayList();
        Integer dspAppBuildCode = this.mApplicationInformationProvider.getDspAppBuildCode();
        AMPDMetadata aMPDMetadata = defaultMobilyticsEvent instanceof AMPDMetadataProvider ? ((AMPDMetadataProvider) defaultMobilyticsEvent).getAMPDMetadata() : new AMPDMetadata();
        if (dspAppBuildCode != null) {
            aMPDMetadata.withDspApkVersion(dspAppBuildCode.toString());
        }
        aMPDMetadata.withDeviceType(this.mDeviceTypeInformationProvider.getDeviceInformationForCurrentDevice(this.mContext).getType());
        aMPDMetadata.withSpeakerVerificationType(this.mEnrollmentTypeResolverLazy.get().getSpeakerVerificationEnrollmentType().toString().replace("_", ""));
        String attributionTag = this.mAttributionTagProvider.getAttributionTag();
        if (!TextUtils.isEmpty(attributionTag)) {
            aMPDMetadata.withAttributionTag(attributionTag);
        }
        if (!TextUtils.isEmpty(this.mAndroidId)) {
            aMPDMetadata.withAndroidId(this.mAndroidId);
        }
        arrayList.add(aMPDMetadata);
        return arrayList;
    }
}

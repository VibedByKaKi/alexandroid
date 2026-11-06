package com.amazon.alexa.mobile.assistant.client.metrics;

import com.amazon.alexa.mobilytics.identity.MobilyticsDevice;
import com.amazon.alexa.mobilytics.identity.MobilyticsDeviceProvider;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/metrics/MobilyticsDeviceProviderImpl;", "Lcom/amazon/alexa/mobilytics/identity/MobilyticsDeviceProvider;", "appInformationProvider", "Lcom/amazon/alexa/mobile/assistant/client/metrics/AppInformationProvider;", "<init>", "(Lcom/amazon/alexa/mobile/assistant/client/metrics/AppInformationProvider;)V", "device", "Lcom/amazon/alexa/mobilytics/identity/MobilyticsDevice;", "addListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/alexa/mobilytics/identity/MobilyticsDeviceProvider$Listener;", "removeListener", "MobilyticsDeviceImpl", "metrics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class MobilyticsDeviceProviderImpl implements MobilyticsDeviceProvider {

    @NotNull
    private final AppInformationProvider appInformationProvider;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÂ\u0003J!\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/metrics/MobilyticsDeviceProviderImpl$MobilyticsDeviceImpl;", "Lcom/amazon/alexa/mobilytics/identity/MobilyticsDevice;", "deviceType", "", "deviceSerialNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "metrics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MobilyticsDeviceImpl implements MobilyticsDevice {

        @Nullable
        private final String deviceSerialNumber;

        @Nullable
        private final String deviceType;

        public MobilyticsDeviceImpl(@Nullable String str, @Nullable String str2) {
            this.deviceType = str;
            this.deviceSerialNumber = str2;
        }

        /* renamed from: component1, reason: from getter */
        private final String getDeviceType() {
            return this.deviceType;
        }

        /* renamed from: component2, reason: from getter */
        private final String getDeviceSerialNumber() {
            return this.deviceSerialNumber;
        }

        public static /* synthetic */ MobilyticsDeviceImpl copy$default(MobilyticsDeviceImpl mobilyticsDeviceImpl, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mobilyticsDeviceImpl.deviceType;
            }
            if ((i & 2) != 0) {
                str2 = mobilyticsDeviceImpl.deviceSerialNumber;
            }
            return mobilyticsDeviceImpl.copy(str, str2);
        }

        @NotNull
        public final MobilyticsDeviceImpl copy(@Nullable String deviceType, @Nullable String deviceSerialNumber) {
            return new MobilyticsDeviceImpl(deviceType, deviceSerialNumber);
        }

        @Override // com.amazon.alexa.mobilytics.identity.MobilyticsDevice
        @NotNull
        public String deviceSerialNumber() {
            String str = this.deviceSerialNumber;
            return (str == null || str.length() == 0) ? "Unknown" : this.deviceSerialNumber;
        }

        @Override // com.amazon.alexa.mobilytics.identity.MobilyticsDevice
        @NotNull
        public String deviceType() {
            String str = this.deviceType;
            return (str == null || str.length() == 0) ? "Unknown" : this.deviceType;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MobilyticsDeviceImpl)) {
                return false;
            }
            MobilyticsDeviceImpl mobilyticsDeviceImpl = (MobilyticsDeviceImpl) other;
            return Intrinsics.areEqual(this.deviceType, mobilyticsDeviceImpl.deviceType) && Intrinsics.areEqual(this.deviceSerialNumber, mobilyticsDeviceImpl.deviceSerialNumber);
        }

        public int hashCode() {
            String str = this.deviceType;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.deviceSerialNumber;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("MobilyticsDeviceImpl(deviceType=", this.deviceType, ", deviceSerialNumber=", this.deviceSerialNumber, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public MobilyticsDeviceProviderImpl(@NotNull AppInformationProvider appInformationProvider) {
        appInformationProvider.getClass();
        this.appInformationProvider = appInformationProvider;
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsDeviceProvider
    public void addListener(@NotNull MobilyticsDeviceProvider.Listener listener) {
        listener.getClass();
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsDeviceProvider
    @NotNull
    public MobilyticsDevice device() {
        return new MobilyticsDeviceImpl(this.appInformationProvider.getMetricsDeviceType(), this.appInformationProvider.getDeviceId());
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsDeviceProvider
    public void removeListener(@NotNull MobilyticsDeviceProvider.Listener listener) {
        listener.getClass();
    }
}

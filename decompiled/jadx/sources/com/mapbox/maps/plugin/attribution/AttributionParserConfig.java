package com.mapbox.maps.plugin.attribution;

import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\u0018\u00002\u00020\u0001BC\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/mapbox/maps/plugin/attribution/AttributionParserConfig;", "", "withImproveMap", "", "withCopyrightSign", "withTelemetryAttribution", "withMapboxAttribution", "withMapboxPrivacyPolicy", "withMapboxGeofencingConsent", "(ZZZZZZ)V", "getWithCopyrightSign", "()Z", "setWithCopyrightSign", "(Z)V", "getWithImproveMap", "setWithImproveMap", "getWithMapboxAttribution", "setWithMapboxAttribution", "getWithMapboxGeofencingConsent", "setWithMapboxGeofencingConsent", "getWithMapboxPrivacyPolicy", "setWithMapboxPrivacyPolicy", "getWithTelemetryAttribution", "setWithTelemetryAttribution", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class AttributionParserConfig {
    private boolean withCopyrightSign;
    private boolean withImproveMap;
    private boolean withMapboxAttribution;
    private boolean withMapboxGeofencingConsent;
    private boolean withMapboxPrivacyPolicy;
    private boolean withTelemetryAttribution;

    public /* synthetic */ AttributionParserConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? true : z4, (i & 16) != 0 ? true : z5, (i & 32) != 0 ? true : z6);
    }

    public final boolean getWithCopyrightSign() {
        return this.withCopyrightSign;
    }

    public final boolean getWithImproveMap() {
        return this.withImproveMap;
    }

    public final boolean getWithMapboxAttribution() {
        return this.withMapboxAttribution;
    }

    public final boolean getWithMapboxGeofencingConsent() {
        return this.withMapboxGeofencingConsent;
    }

    public final boolean getWithMapboxPrivacyPolicy() {
        return this.withMapboxPrivacyPolicy;
    }

    public final boolean getWithTelemetryAttribution() {
        return this.withTelemetryAttribution;
    }

    public final void setWithCopyrightSign(boolean z) {
        this.withCopyrightSign = z;
    }

    public final void setWithImproveMap(boolean z) {
        this.withImproveMap = z;
    }

    public final void setWithMapboxAttribution(boolean z) {
        this.withMapboxAttribution = z;
    }

    public final void setWithMapboxGeofencingConsent(boolean z) {
        this.withMapboxGeofencingConsent = z;
    }

    public final void setWithMapboxPrivacyPolicy(boolean z) {
        this.withMapboxPrivacyPolicy = z;
    }

    public final void setWithTelemetryAttribution(boolean z) {
        this.withTelemetryAttribution = z;
    }

    @JvmOverloads
    public AttributionParserConfig(boolean z) {
        this(z, false, false, false, false, false, 62, null);
    }

    @JvmOverloads
    public AttributionParserConfig(boolean z, boolean z2) {
        this(z, z2, false, false, false, false, 60, null);
    }

    @JvmOverloads
    public AttributionParserConfig(boolean z, boolean z2, boolean z3) {
        this(z, z2, z3, false, false, false, 56, null);
    }

    @JvmOverloads
    public AttributionParserConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this(z, z2, z3, z4, false, false, 48, null);
    }

    @JvmOverloads
    public AttributionParserConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this(z, z2, z3, z4, z5, false, 32, null);
    }

    @JvmOverloads
    public AttributionParserConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.withImproveMap = z;
        this.withCopyrightSign = z2;
        this.withTelemetryAttribution = z3;
        this.withMapboxAttribution = z4;
        this.withMapboxPrivacyPolicy = z5;
        this.withMapboxGeofencingConsent = z6;
    }

    @JvmOverloads
    public AttributionParserConfig() {
        this(false, false, false, false, false, false, 63, null);
    }
}

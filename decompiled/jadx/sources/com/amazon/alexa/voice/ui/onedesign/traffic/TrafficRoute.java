package com.amazon.alexa.voice.ui.onedesign.traffic;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.facebook.imageutils.JfifUtil;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class TrafficRoute implements TrafficRouteModel {
    private final int indicator;
    private final boolean primary;
    private final CharSequence subTitle;
    private final CharSequence title;

    public TrafficRoute(CharSequence charSequence, CharSequence charSequence2, boolean z, int i) {
        this.title = charSequence;
        this.subTitle = charSequence2;
        this.primary = z;
        this.indicator = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrafficRoute.class != obj.getClass()) {
            return false;
        }
        TrafficRoute trafficRoute = (TrafficRoute) obj;
        CharSequence charSequence = this.title;
        CharSequence charSequence2 = trafficRoute.title;
        if (charSequence == null ? charSequence2 != null : !charSequence.equals(charSequence2)) {
            return false;
        }
        CharSequence charSequence3 = this.subTitle;
        CharSequence charSequence4 = trafficRoute.subTitle;
        if (charSequence3 == null ? charSequence4 == null : charSequence3.equals(charSequence4)) {
            return this.primary == trafficRoute.primary && this.indicator == trafficRoute.indicator;
        }
        return false;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.traffic.TrafficRouteModel
    public int getIndicator() {
        return this.indicator;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.traffic.TrafficRouteModel
    public CharSequence getSubTitle() {
        return this.subTitle;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.traffic.TrafficRouteModel
    public CharSequence getTitle() {
        return this.title;
    }

    public int hashCode() {
        CharSequence charSequence = this.title;
        int hashCode = (JfifUtil.MARKER_EOI + (charSequence != null ? charSequence.hashCode() : 0)) * 31;
        CharSequence charSequence2 = this.subTitle;
        return ((((hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31) + (this.primary ? 1 : 0)) * 31) + this.indicator;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.traffic.TrafficRouteModel
    public boolean isPrimary() {
        return this.primary;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TrafficRoute{title=");
        sb.append((Object) this.title);
        sb.append(", subTitle=");
        sb.append((Object) this.subTitle);
        sb.append(", primary=");
        sb.append(this.primary);
        sb.append(", indicator=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.indicator, AbstractJsonLexerKt.END_OBJ);
    }
}

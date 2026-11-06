package com.amazon.coral.metrics.helper;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class Dimension {
    public final String instance;
    public final String metricClass;

    public Dimension(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.metricClass = str;
        this.instance = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Dimension)) {
            return false;
        }
        Dimension dimension = (Dimension) obj;
        return this.metricClass.equals(dimension.metricClass) && this.instance.equals(dimension.instance);
    }

    public int hashCode() {
        return this.instance.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(391, 23, this.metricClass);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dimension [metricClass=");
        sb.append(this.metricClass);
        sb.append(", instance=");
        return a$$ExternalSyntheticOutline0.m(sb, this.instance, MarkdownConstants.RIGHT_BRACKET);
    }
}

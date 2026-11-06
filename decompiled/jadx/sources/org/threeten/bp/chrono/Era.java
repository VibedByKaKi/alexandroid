package org.threeten.bp.chrono;

import java.util.Locale;
import org.threeten.bp.format.TextStyle;
import org.threeten.bp.temporal.TemporalAccessor;
import org.threeten.bp.temporal.TemporalAdjuster;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public interface Era extends TemporalAccessor, TemporalAdjuster {
    String getDisplayName(TextStyle textStyle, Locale locale);

    int getValue();
}

package org.joda.time.tz;

import com.amazon.dee.sdk.iotsoftap.Constants;
import java.util.Collections;
import java.util.Set;
import org.joda.time.DateTimeZone;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class UTCProvider implements Provider {
    private static final Set<String> AVAILABLE_IDS = Collections.singleton(Constants.UTC);

    @Override // org.joda.time.tz.Provider
    public Set<String> getAvailableIDs() {
        return AVAILABLE_IDS;
    }

    @Override // org.joda.time.tz.Provider
    public DateTimeZone getZone(String str) {
        if (Constants.UTC.equalsIgnoreCase(str)) {
            return DateTimeZone.UTC;
        }
        return null;
    }
}

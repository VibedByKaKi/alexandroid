package com.amazon.alexa.hho.navigation.transit.location;

import android.location.Location;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/location/LocationFilterProtocol;", "", "filter", "Landroid/location/Location;", "location", "impliedSpeedMps", "", "(Landroid/location/Location;)Ljava/lang/Double;", "reset", "", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface LocationFilterProtocol {
    @Nullable
    Location filter(@NotNull Location location);

    @Nullable
    Double impliedSpeedMps(@NotNull Location location);

    void reset();
}

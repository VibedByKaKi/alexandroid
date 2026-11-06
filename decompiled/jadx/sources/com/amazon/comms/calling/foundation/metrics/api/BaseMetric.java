package com.amazon.comms.calling.foundation.metrics.api;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.handsfree.metrics.caching.JsonFields;
import com.amazon.alexa.mobilytics.OwnerIdentifier;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010$\n\u0002\b\u0006\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ!\u0010\u0016\u001a\u00028\u00002\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012¢\u0006\u0002\u0010\u0017R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u000bR6\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00122\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0012@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/amazon/comms/calling/foundation/metrics/api/BaseMetric;", ExifInterface.GPS_DIRECTION_TRUE, "", "name", "", JsonFields.COMPONENT, "subComponent", "ownerIdentifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getComponent", "getSubComponent", "getOwnerIdentifier$annotations", "()V", "getOwnerIdentifier", "value", "", "customEntries", "getCustomEntries", "()Ljava/util/Map;", "setCustomEntries", "(Ljava/util/Map;)Ljava/lang/Object;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public class BaseMetric<T> {

    @NotNull
    private final String component;

    @NotNull
    private Map<String, ? extends Object> customEntries;

    @NotNull
    private final String name;

    @NotNull
    private final String ownerIdentifier;

    @Nullable
    private final String subComponent;

    public BaseMetric(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4) {
        ParcelCompat$$ExternalSyntheticOutline0.m(str, str2, str4);
        this.name = str;
        this.component = str2;
        this.subComponent = str3;
        this.customEntries = new HashMap();
        this.ownerIdentifier = str4;
    }

    @NotNull
    public final String getComponent() {
        return this.component;
    }

    @NotNull
    public final Map<String, Object> getCustomEntries() {
        return this.customEntries;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getOwnerIdentifier() {
        return this.ownerIdentifier;
    }

    @Nullable
    public final String getSubComponent() {
        return this.subComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T setCustomEntries(@Nullable Map<String, ? extends Object> customEntries) {
        if (customEntries == null) {
            customEntries = new HashMap<>();
        }
        this.customEntries = customEntries;
        return this;
    }

    public static /* synthetic */ void getOwnerIdentifier$annotations() {
    }

    public /* synthetic */ BaseMetric(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? OwnerIdentifier.ALEXA_COMMS_FACES : str4);
    }
}

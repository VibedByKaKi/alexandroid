package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.LensFacingCameraFilter;
import androidx.core.util.Preconditions;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final class CameraSelector {
    public static final int LENS_FACING_BACK = 1;

    @ExperimentalLensFacing
    public static final int LENS_FACING_EXTERNAL = 2;
    public static final int LENS_FACING_FRONT = 0;
    public static final int LENS_FACING_UNKNOWN = -1;

    @NonNull
    private final LinkedHashSet<CameraFilter> mCameraFilterSet;

    @Nullable
    private final String mPhysicalCameraId;

    @NonNull
    public static final CameraSelector DEFAULT_FRONT_CAMERA = new Builder().requireLensFacing(0).build();

    @NonNull
    public static final CameraSelector DEFAULT_BACK_CAMERA = new Builder().requireLensFacing(1).build();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Target({ElementType.TYPE, ElementType.TYPE_USE, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
    @OptIn(markerClass = {ExperimentalLensFacing.class})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface LensFacing {
    }

    public CameraSelector(@NonNull LinkedHashSet<CameraFilter> linkedHashSet, @Nullable String str) {
        this.mCameraFilterSet = linkedHashSet;
        this.mPhysicalCameraId = str;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public LinkedHashSet<CameraInternal> filter(@NonNull LinkedHashSet<CameraInternal> linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<CameraInternal> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getCameraInfo());
        }
        List<CameraInfo> filter = filter(arrayList);
        LinkedHashSet<CameraInternal> linkedHashSet2 = new LinkedHashSet<>();
        Iterator<CameraInternal> it3 = linkedHashSet.iterator();
        while (it3.hasNext()) {
            CameraInternal next = it3.next();
            if (filter.contains(next.getCameraInfo())) {
                linkedHashSet2.add(next);
            }
        }
        return linkedHashSet2;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public LinkedHashSet<CameraFilter> getCameraFilterSet() {
        return this.mCameraFilterSet;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Integer getLensFacing() {
        Iterator<CameraFilter> it2 = this.mCameraFilterSet.iterator();
        Integer num = null;
        while (it2.hasNext()) {
            CameraFilter next = it2.next();
            if (next instanceof LensFacingCameraFilter) {
                Integer valueOf = Integer.valueOf(((LensFacingCameraFilter) next).getLensFacing());
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    Single$$ExternalSyntheticBUOutline0.m$2("Multiple conflicting lens facing requirements exist.");
                    return null;
                }
            }
        }
        return num;
    }

    @Nullable
    public String getPhysicalCameraId() {
        return this.mPhysicalCameraId;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraInternal select(@NonNull LinkedHashSet<CameraInternal> linkedHashSet) {
        Iterator<CameraInternal> it2 = filter(linkedHashSet).iterator();
        if (it2.hasNext()) {
            return it2.next();
        }
        Single$$ExternalSyntheticBUOutline0.m$3("No available camera can be found");
        return null;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {

        @NonNull
        private final LinkedHashSet<CameraFilter> mCameraFilterSet;

        @Nullable
        private String mPhysicalCameraId;

        public Builder() {
            this.mCameraFilterSet = new LinkedHashSet<>();
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static Builder fromSelector(@NonNull CameraSelector cameraSelector) {
            return new Builder(cameraSelector.getCameraFilterSet());
        }

        @NonNull
        public Builder addCameraFilter(@NonNull CameraFilter cameraFilter) {
            this.mCameraFilterSet.add(cameraFilter);
            return this;
        }

        @NonNull
        public CameraSelector build() {
            return new CameraSelector(this.mCameraFilterSet, this.mPhysicalCameraId);
        }

        @NonNull
        public Builder requireLensFacing(int i) {
            Preconditions.checkState(i != -1, "The specified lens facing is invalid.");
            this.mCameraFilterSet.add(new LensFacingCameraFilter(i));
            return this;
        }

        @NonNull
        public Builder setPhysicalCameraId(@NonNull String str) {
            this.mPhysicalCameraId = str;
            return this;
        }

        private Builder(@NonNull LinkedHashSet<CameraFilter> linkedHashSet) {
            this.mCameraFilterSet = new LinkedHashSet<>(linkedHashSet);
        }
    }

    @NonNull
    public List<CameraInfo> filter(@NonNull List<CameraInfo> list) {
        List<CameraInfo> arrayList = new ArrayList<>(list);
        Iterator<CameraFilter> it2 = this.mCameraFilterSet.iterator();
        while (it2.hasNext()) {
            arrayList = it2.next().filter(Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }
}

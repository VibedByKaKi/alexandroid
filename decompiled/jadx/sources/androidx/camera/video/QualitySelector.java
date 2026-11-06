package androidx.camera.video;

import android.annotation.SuppressLint;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.FallbackStrategy;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final class QualitySelector {
    private static final String TAG = "QualitySelector";
    private final FallbackStrategy mFallbackStrategy;
    private final List<Quality> mPreferredQualityList;

    public QualitySelector(@NonNull List<Quality> list, @NonNull FallbackStrategy fallbackStrategy) {
        Preconditions.checkArgument((list.isEmpty() && fallbackStrategy == FallbackStrategy.NONE) ? false : true, "No preferred quality and fallback strategy.");
        this.mPreferredQualityList = Collections.unmodifiableList(new ArrayList(list));
        this.mFallbackStrategy = fallbackStrategy;
    }

    private void addByFallbackStrategy(@NonNull List<Quality> list, @NonNull Set<Quality> set) {
        if (list.isEmpty() || set.containsAll(list)) {
            return;
        }
        Logger.d(TAG, "Select quality by fallbackStrategy = " + this.mFallbackStrategy);
        FallbackStrategy fallbackStrategy = this.mFallbackStrategy;
        if (fallbackStrategy == FallbackStrategy.NONE) {
            return;
        }
        Preconditions.checkState(fallbackStrategy instanceof FallbackStrategy.RuleStrategy, "Currently only support type RuleStrategy");
        FallbackStrategy.RuleStrategy ruleStrategy = (FallbackStrategy.RuleStrategy) this.mFallbackStrategy;
        List<Quality> sortedQualities = Quality.getSortedQualities();
        Quality fallbackQuality = ruleStrategy.getFallbackQuality() == Quality.HIGHEST ? sortedQualities.get(0) : ruleStrategy.getFallbackQuality() == Quality.LOWEST ? (Quality) ErrorUtils$$ExternalSyntheticOutline0.m(sortedQualities, 1) : ruleStrategy.getFallbackQuality();
        int indexOf = sortedQualities.indexOf(fallbackQuality);
        Preconditions.checkState(indexOf != -1);
        ArrayList arrayList = new ArrayList();
        for (int i = indexOf - 1; i >= 0; i--) {
            Quality quality = sortedQualities.get(i);
            if (list.contains(quality)) {
                arrayList.add(quality);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = indexOf + 1; i2 < sortedQualities.size(); i2++) {
            Quality quality2 = sortedQualities.get(i2);
            if (list.contains(quality2)) {
                arrayList2.add(quality2);
            }
        }
        Logger.d(TAG, "sizeSortedQualities = " + sortedQualities + ", fallback quality = " + fallbackQuality + ", largerQualities = " + arrayList + ", smallerQualities = " + arrayList2);
        int fallbackRule = ruleStrategy.getFallbackRule();
        if (fallbackRule != 0) {
            if (fallbackRule == 1) {
                set.addAll(arrayList);
                set.addAll(arrayList2);
                return;
            }
            if (fallbackRule == 2) {
                set.addAll(arrayList);
                return;
            }
            if (fallbackRule == 3) {
                set.addAll(arrayList2);
                set.addAll(arrayList);
            } else if (fallbackRule == 4) {
                set.addAll(arrayList2);
            } else {
                Buffer$$ExternalSyntheticBUOutline0.m(this.mFallbackStrategy, "Unhandled fallback strategy: ");
            }
        }
    }

    private static void checkQualityConstantsOrThrow(@NonNull List<Quality> list) {
        for (Quality quality : list) {
            Preconditions.checkArgument(Quality.containsQuality(quality), "qualities contain invalid quality: " + quality);
        }
    }

    @NonNull
    public static QualitySelector from(@NonNull Quality quality, @NonNull FallbackStrategy fallbackStrategy) {
        Preconditions.checkNotNull(quality, "quality cannot be null");
        Preconditions.checkNotNull(fallbackStrategy, "fallbackStrategy cannot be null");
        checkQualityConstantsOrThrow(quality);
        return new QualitySelector(Collections.singletonList(quality), fallbackStrategy);
    }

    @NonNull
    public static QualitySelector fromOrderedList(@NonNull List<Quality> list, @NonNull FallbackStrategy fallbackStrategy) {
        Preconditions.checkNotNull(list, "qualities cannot be null");
        Preconditions.checkNotNull(fallbackStrategy, "fallbackStrategy cannot be null");
        Preconditions.checkArgument(!list.isEmpty(), "qualities cannot be empty");
        checkQualityConstantsOrThrow(list);
        return new QualitySelector(list, fallbackStrategy);
    }

    @NonNull
    private static Size getProfileVideoSize(@NonNull VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy) {
        EncoderProfilesProxy.VideoProfileProxy defaultVideoProfile = videoValidatedEncoderProfilesProxy.getDefaultVideoProfile();
        return new Size(defaultVideoProfile.getWidth(), defaultVideoProfile.getHeight());
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Map<Quality, Size> getQualityToResolutionMap(@NonNull VideoCapabilities videoCapabilities, @NonNull DynamicRange dynamicRange) {
        HashMap hashMap = new HashMap();
        for (Quality quality : videoCapabilities.getSupportedQualities(dynamicRange)) {
            VideoValidatedEncoderProfilesProxy profiles = videoCapabilities.getProfiles(quality, dynamicRange);
            Objects.requireNonNull(profiles);
            hashMap.put(quality, getProfileVideoSize(profiles));
        }
        return hashMap;
    }

    @Nullable
    public static Size getResolution(@NonNull CameraInfo cameraInfo, @NonNull Quality quality) {
        checkQualityConstantsOrThrow(quality);
        VideoValidatedEncoderProfilesProxy profiles = Recorder.getVideoCapabilities(cameraInfo).getProfiles(quality, DynamicRange.SDR);
        if (profiles != null) {
            return getProfileVideoSize(profiles);
        }
        return null;
    }

    @NonNull
    @Deprecated
    public static List<Quality> getSupportedQualities(@NonNull CameraInfo cameraInfo) {
        return Recorder.getVideoCapabilities(cameraInfo).getSupportedQualities(DynamicRange.SDR);
    }

    @Deprecated
    public static boolean isQualitySupported(@NonNull CameraInfo cameraInfo, @NonNull Quality quality) {
        return Recorder.getVideoCapabilities(cameraInfo).isQualitySupported(quality, DynamicRange.SDR);
    }

    @NonNull
    @SuppressLint({"UsesNonDefaultVisibleForTesting"})
    @VisibleForTesting(otherwise = 3)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public List<Quality> getPrioritizedQualities(@NonNull List<Quality> list) {
        if (list.isEmpty()) {
            Logger.w(TAG, "No supported quality on the device.");
            return new ArrayList();
        }
        Logger.d(TAG, "supportedQualities = " + list);
        Set<Quality> linkedHashSet = new LinkedHashSet<>();
        Iterator<Quality> it2 = this.mPreferredQualityList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Quality next = it2.next();
            if (next == Quality.HIGHEST) {
                linkedHashSet.addAll(list);
                break;
            }
            if (next == Quality.LOWEST) {
                ArrayList arrayList = new ArrayList(list);
                Collections.reverse(arrayList);
                linkedHashSet.addAll(arrayList);
                break;
            }
            if (list.contains(next)) {
                linkedHashSet.add(next);
            } else {
                Logger.w(TAG, "quality is not supported and will be ignored: " + next);
            }
        }
        addByFallbackStrategy(list, linkedHashSet);
        return new ArrayList(linkedHashSet);
    }

    @NonNull
    public String toString() {
        return "QualitySelector{preferredQualities=" + this.mPreferredQualityList + ", fallbackStrategy=" + this.mFallbackStrategy + StringSubstitutor.DEFAULT_VAR_END;
    }

    @NonNull
    public static QualitySelector from(@NonNull Quality quality) {
        return from(quality, FallbackStrategy.NONE);
    }

    @NonNull
    public static QualitySelector fromOrderedList(@NonNull List<Quality> list) {
        return fromOrderedList(list, FallbackStrategy.NONE);
    }

    private static void checkQualityConstantsOrThrow(@NonNull Quality quality) {
        Preconditions.checkArgument(Quality.containsQuality(quality), "Invalid quality: " + quality);
    }
}

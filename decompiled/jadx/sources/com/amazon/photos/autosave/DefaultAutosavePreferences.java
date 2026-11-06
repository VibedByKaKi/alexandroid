package com.amazon.photos.autosave;

import com.amazon.photos.autosave.model.MediaType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lcom/amazon/photos/autosave/DefaultAutosavePreferences;", "", "isAddToFamilyEnabled", "", "isAllFoldersEnabled", "isAllowedOnLowBattery", "isAllowedOnPowerSaverMode", "isAllowedOnlyWhileCharging", "isAutosaveAllowedOnMetered", "itemType", "Lcom/amazon/photos/autosave/model/MediaType;", "isAutosaveEnabled", "AndroidPhotosAutosave_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface DefaultAutosavePreferences {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean isAddToFamilyEnabled(@NotNull DefaultAutosavePreferences defaultAutosavePreferences) {
            return false;
        }

        public static boolean isAllFoldersEnabled(@NotNull DefaultAutosavePreferences defaultAutosavePreferences) {
            return false;
        }

        public static boolean isAllowedOnLowBattery(@NotNull DefaultAutosavePreferences defaultAutosavePreferences) {
            return false;
        }

        public static boolean isAllowedOnPowerSaverMode(@NotNull DefaultAutosavePreferences defaultAutosavePreferences) {
            return true;
        }

        public static boolean isAllowedOnlyWhileCharging(@NotNull DefaultAutosavePreferences defaultAutosavePreferences) {
            return false;
        }

        public static boolean isAutosaveAllowedOnMetered(@NotNull DefaultAutosavePreferences defaultAutosavePreferences, @NotNull MediaType mediaType) {
            mediaType.getClass();
            return false;
        }

        public static boolean isAutosaveEnabled(@NotNull DefaultAutosavePreferences defaultAutosavePreferences, @NotNull MediaType mediaType) {
            mediaType.getClass();
            return false;
        }
    }

    boolean isAddToFamilyEnabled();

    boolean isAllFoldersEnabled();

    boolean isAllowedOnLowBattery();

    boolean isAllowedOnPowerSaverMode();

    boolean isAllowedOnlyWhileCharging();

    boolean isAutosaveAllowedOnMetered(@NotNull MediaType itemType);

    boolean isAutosaveEnabled(@NotNull MediaType itemType);
}

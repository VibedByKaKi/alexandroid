package com.amazon.photos.uploader;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/photos/uploader/QueueConstraint;", "", "()V", "BlockInLowBattery", "BlockInPowerSavingMode", "RequiresChargingConstraint", "RequiresUnmeteredConnection", "Lcom/amazon/photos/uploader/QueueConstraint$BlockInLowBattery;", "Lcom/amazon/photos/uploader/QueueConstraint$BlockInPowerSavingMode;", "Lcom/amazon/photos/uploader/QueueConstraint$RequiresChargingConstraint;", "Lcom/amazon/photos/uploader/QueueConstraint$RequiresUnmeteredConnection;", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class QueueConstraint {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/amazon/photos/uploader/QueueConstraint$BlockInLowBattery;", "Lcom/amazon/photos/uploader/QueueConstraint;", "()V", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BlockInLowBattery extends QueueConstraint {

        @NotNull
        public static final BlockInLowBattery INSTANCE = new BlockInLowBattery();

        private BlockInLowBattery() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/amazon/photos/uploader/QueueConstraint$BlockInPowerSavingMode;", "Lcom/amazon/photos/uploader/QueueConstraint;", "()V", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BlockInPowerSavingMode extends QueueConstraint {

        @NotNull
        public static final BlockInPowerSavingMode INSTANCE = new BlockInPowerSavingMode();

        private BlockInPowerSavingMode() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/amazon/photos/uploader/QueueConstraint$RequiresChargingConstraint;", "Lcom/amazon/photos/uploader/QueueConstraint;", "()V", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RequiresChargingConstraint extends QueueConstraint {

        @NotNull
        public static final RequiresChargingConstraint INSTANCE = new RequiresChargingConstraint();

        private RequiresChargingConstraint() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/amazon/photos/uploader/QueueConstraint$RequiresUnmeteredConnection;", "Lcom/amazon/photos/uploader/QueueConstraint;", "()V", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RequiresUnmeteredConnection extends QueueConstraint {

        @NotNull
        public static final RequiresUnmeteredConnection INSTANCE = new RequiresUnmeteredConnection();

        private RequiresUnmeteredConnection() {
            super(null);
        }
    }

    public /* synthetic */ QueueConstraint(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private QueueConstraint() {
    }
}

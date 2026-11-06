package com.amazon.alexa.ra.chrome.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.chrome.ui.StableBambooChromeType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/TransitionalBambooChromeType;", "Lcom/amazon/alexa/ra/chrome/ui/BambooChromeType;", "destinationChromeType", "<init>", "(Lcom/amazon/alexa/ra/chrome/ui/BambooChromeType;)V", "getDestinationChromeType", "()Lcom/amazon/alexa/ra/chrome/ui/BambooChromeType;", "IdleToListening", "ListeningToIdle", "ListeningToProcessing", "ProcessingToIdle", "Lcom/amazon/alexa/ra/chrome/ui/PersonalityBambooChromeType;", "Lcom/amazon/alexa/ra/chrome/ui/TransitionalBambooChromeType$IdleToListening;", "Lcom/amazon/alexa/ra/chrome/ui/TransitionalBambooChromeType$ListeningToIdle;", "Lcom/amazon/alexa/ra/chrome/ui/TransitionalBambooChromeType$ListeningToProcessing;", "Lcom/amazon/alexa/ra/chrome/ui/TransitionalBambooChromeType$ProcessingToIdle;", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public abstract class TransitionalBambooChromeType implements BambooChromeType {
    public static final int $stable = 8;

    @NotNull
    private final BambooChromeType destinationChromeType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/TransitionalBambooChromeType$IdleToListening;", "Lcom/amazon/alexa/ra/chrome/ui/TransitionalBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IdleToListening extends TransitionalBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final IdleToListening INSTANCE = new IdleToListening();

        private IdleToListening() {
            super(StableBambooChromeType.Listening.INSTANCE, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/TransitionalBambooChromeType$ListeningToIdle;", "Lcom/amazon/alexa/ra/chrome/ui/TransitionalBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ListeningToIdle extends TransitionalBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final ListeningToIdle INSTANCE = new ListeningToIdle();

        private ListeningToIdle() {
            super(StableBambooChromeType.Idle.INSTANCE, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/TransitionalBambooChromeType$ListeningToProcessing;", "Lcom/amazon/alexa/ra/chrome/ui/TransitionalBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ListeningToProcessing extends TransitionalBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final ListeningToProcessing INSTANCE = new ListeningToProcessing();

        private ListeningToProcessing() {
            super(StableBambooChromeType.Processing.INSTANCE, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/TransitionalBambooChromeType$ProcessingToIdle;", "Lcom/amazon/alexa/ra/chrome/ui/TransitionalBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProcessingToIdle extends TransitionalBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final ProcessingToIdle INSTANCE = new ProcessingToIdle();

        private ProcessingToIdle() {
            super(StableBambooChromeType.Idle.INSTANCE, null);
        }
    }

    private TransitionalBambooChromeType(BambooChromeType bambooChromeType) {
        this.destinationChromeType = bambooChromeType;
    }

    @NotNull
    public final BambooChromeType getDestinationChromeType() {
        return this.destinationChromeType;
    }

    public /* synthetic */ TransitionalBambooChromeType(BambooChromeType bambooChromeType, DefaultConstructorMarker defaultConstructorMarker) {
        this(bambooChromeType);
    }
}

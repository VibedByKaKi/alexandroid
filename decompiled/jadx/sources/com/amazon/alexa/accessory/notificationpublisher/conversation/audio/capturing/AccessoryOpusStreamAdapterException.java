package com.amazon.alexa.accessory.notificationpublisher.conversation.audio.capturing;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0007\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/AccessoryOpusStreamAdapterException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "<init>", "(Ljava/lang/String;)V", "BufferOverflow", "NoRequestDelegate", "FormatMismatch", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/AccessoryOpusStreamAdapterException$BufferOverflow;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/AccessoryOpusStreamAdapterException$FormatMismatch;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/AccessoryOpusStreamAdapterException$NoRequestDelegate;", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class AccessoryOpusStreamAdapterException extends Exception {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/AccessoryOpusStreamAdapterException$BufferOverflow;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/AccessoryOpusStreamAdapterException;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BufferOverflow extends AccessoryOpusStreamAdapterException {

        @NotNull
        public static final BufferOverflow INSTANCE = new BufferOverflow();

        private BufferOverflow() {
            super("Buffered audio exceeded the cap before the socket started.", null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof BufferOverflow);
        }

        public int hashCode() {
            return -704520372;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "BufferOverflow";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/AccessoryOpusStreamAdapterException$FormatMismatch;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/AccessoryOpusStreamAdapterException;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FormatMismatch extends AccessoryOpusStreamAdapterException {

        @NotNull
        public static final FormatMismatch INSTANCE = new FormatMismatch();

        private FormatMismatch() {
            super("Accessory advertised an incompatible capture format.", null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof FormatMismatch);
        }

        public int hashCode() {
            return 612792783;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "FormatMismatch";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/AccessoryOpusStreamAdapterException$NoRequestDelegate;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/AccessoryOpusStreamAdapterException;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NoRequestDelegate extends AccessoryOpusStreamAdapterException {

        @NotNull
        public static final NoRequestDelegate INSTANCE = new NoRequestDelegate();

        private NoRequestDelegate() {
            super("No voice-streaming request delegate; cannot start capture.", null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof NoRequestDelegate);
        }

        public int hashCode() {
            return -545181175;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "NoRequestDelegate";
        }
    }

    public /* synthetic */ AccessoryOpusStreamAdapterException(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private AccessoryOpusStreamAdapterException(String str) {
        super(str);
    }
}

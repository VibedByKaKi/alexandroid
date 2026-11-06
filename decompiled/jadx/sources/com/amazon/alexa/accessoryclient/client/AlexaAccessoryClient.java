package com.amazon.alexa.accessoryclient.client;

import android.content.Context;
import com.amazon.alexa.accessory.metrics.AccessoryMetricsService;
import com.amazon.alexa.accessoryclient.client.accessories.Accessories;
import com.amazon.alexa.accessoryclient.client.accessories.ClientAccessories;
import com.amazon.alexa.accessoryclient.common.connection.BundleSink;
import com.amazon.alexa.accessoryclient.common.connection.BundleSource;
import com.amazon.alexa.accessoryclient.common.rxipc.RxIPCClient;
import com.amazon.alexa.mobilytics.event.Channels;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u000eX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0010X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/accessoryclient/client/AlexaAccessoryClient;", "Lcom/amazon/alexa/accessoryclient/client/AbstractAlexaAccessoryClient;", "context", "Landroid/content/Context;", "accessoryMetricsService", "Lcom/amazon/alexa/accessory/metrics/AccessoryMetricsService;", "pkg", "", "(Landroid/content/Context;Lcom/amazon/alexa/accessory/metrics/AccessoryMetricsService;Ljava/lang/String;)V", Channels.ACCESSORIES, "Lcom/amazon/alexa/accessoryclient/client/accessories/Accessories;", "getAccessories", "()Lcom/amazon/alexa/accessoryclient/client/accessories/Accessories;", "bundleSink", "Lcom/amazon/alexa/accessoryclient/common/connection/BundleSink;", "bundleSource", "Lcom/amazon/alexa/accessoryclient/common/connection/BundleSource;", "clientAccessories", "Lcom/amazon/alexa/accessoryclient/client/accessories/ClientAccessories;", "inputStreamSink", "getInputStreamSink", "()Lcom/amazon/alexa/accessoryclient/common/connection/BundleSink;", "outputStreamSource", "getOutputStreamSource", "()Lcom/amazon/alexa/accessoryclient/common/connection/BundleSource;", "Companion", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public class AlexaAccessoryClient extends AbstractAlexaAccessoryClient {

    @NotNull
    private static final String ACCESSORY_SERVICE_NAME = "com.amazon.alexa.accessoryservice.service.AlexaAccessoryService";
    private static final int MAJOR_VERSION = 1;
    private static final int MINOR_VERSION = 0;

    @NotNull
    private final Accessories accessories;

    @NotNull
    private final BundleSink bundleSink;

    @NotNull
    private final BundleSource bundleSource;

    @NotNull
    private final ClientAccessories clientAccessories;

    @NotNull
    private final BundleSink inputStreamSink;

    @NotNull
    private final BundleSource outputStreamSource;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public AlexaAccessoryClient(@NotNull Context context, @NotNull AccessoryMetricsService accessoryMetricsService, @NotNull String str) {
        super(context, accessoryMetricsService, str, ACCESSORY_SERVICE_NAME, 1, 0);
        context.getClass();
        accessoryMetricsService.getClass();
        str.getClass();
        RxIPCClient rxIPCClient = new RxIPCClient(null, 1, 0 == true ? 1 : 0);
        this.bundleSink = rxIPCClient;
        this.bundleSource = rxIPCClient;
        ClientAccessories clientAccessories = new ClientAccessories(context, rxIPCClient);
        this.clientAccessories = clientAccessories;
        this.accessories = clientAccessories;
        this.inputStreamSink = rxIPCClient;
        this.outputStreamSource = rxIPCClient;
    }

    @NotNull
    public final Accessories getAccessories() {
        return this.accessories;
    }

    @Override // com.amazon.alexa.accessoryclient.client.AbstractAlexaAccessoryClient
    @NotNull
    public BundleSink getInputStreamSink() {
        return this.inputStreamSink;
    }

    @Override // com.amazon.alexa.accessoryclient.client.AbstractAlexaAccessoryClient
    @NotNull
    public BundleSource getOutputStreamSource() {
        return this.outputStreamSource;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AlexaAccessoryClient(@NotNull Context context, @NotNull AccessoryMetricsService accessoryMetricsService) {
        this(context, accessoryMetricsService, null, 4, null);
        context.getClass();
        accessoryMetricsService.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AlexaAccessoryClient(android.content.Context r1, com.amazon.alexa.accessory.metrics.AccessoryMetricsService r2, java.lang.String r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto Lb
            com.amazon.alexa.accessory.metrics.NoOpMetricsService r2 = new com.amazon.alexa.accessory.metrics.NoOpMetricsService
            com.amazon.alexa.accessory.internal.util.Logger$Level r5 = com.amazon.alexa.accessory.internal.util.Logger.Level.VERBOSE
            r2.<init>(r5)
        Lb:
            r4 = r4 & 4
            if (r4 == 0) goto L16
            java.lang.String r3 = r1.getPackageName()
            r3.getClass()
        L16:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.accessoryclient.client.AlexaAccessoryClient.<init>(android.content.Context, com.amazon.alexa.accessory.metrics.AccessoryMetricsService, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AlexaAccessoryClient(@NotNull Context context) {
        this(context, null, null, 6, null);
        context.getClass();
    }
}

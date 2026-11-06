package com.amazon.alexa.accessoryclient.common.datatransfer;

import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/datatransfer/DefaultParcelFileDescriptorProvider;", "Lcom/amazon/alexa/accessoryclient/common/datatransfer/ParcelFileDescriptorProvider;", "()V", "createReliableSocketPair", "", "Lcom/amazon/alexa/accessoryclient/common/datatransfer/ParcelFileDescriptorWrapper;", "()[Lcom/amazon/alexa/accessoryclient/common/datatransfer/ParcelFileDescriptorWrapper;", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultParcelFileDescriptorProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultParcelFileDescriptorProvider.kt\ncom/amazon/alexa/accessoryclient/common/datatransfer/DefaultParcelFileDescriptorProvider\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,27:1\n11335#2:28\n11670#2,3:29\n37#3,2:32\n*S KotlinDebug\n*F\n+ 1 DefaultParcelFileDescriptorProvider.kt\ncom/amazon/alexa/accessoryclient/common/datatransfer/DefaultParcelFileDescriptorProvider\n*L\n23#1:28\n23#1:29,3\n25#1:32,2\n*E\n"})
/* loaded from: classes16.dex */
public final class DefaultParcelFileDescriptorProvider implements ParcelFileDescriptorProvider {
    @Override // com.amazon.alexa.accessoryclient.common.datatransfer.ParcelFileDescriptorProvider
    @NotNull
    public ParcelFileDescriptorWrapper[] createReliableSocketPair() throws IOException {
        ParcelFileDescriptor[] createReliableSocketPair = ParcelFileDescriptor.createReliableSocketPair();
        createReliableSocketPair.getClass();
        ArrayList arrayList = new ArrayList(createReliableSocketPair.length);
        for (ParcelFileDescriptor parcelFileDescriptor : createReliableSocketPair) {
            arrayList.add(new DefaultParcelFileDescriptorWrapper(parcelFileDescriptor));
        }
        return (ParcelFileDescriptorWrapper[]) arrayList.toArray(new ParcelFileDescriptorWrapper[0]);
    }
}

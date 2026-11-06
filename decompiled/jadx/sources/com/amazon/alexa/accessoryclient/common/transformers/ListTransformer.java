package com.amazon.alexa.accessoryclient.common.transformers;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/transformers/ListTransformer;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "", "subTransformer", "(Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;)V", "LIST_KEY", "", "fromBundle", "bundle", "Landroid/os/Bundle;", "toBundle", "ts", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nListTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListTransformer.kt\ncom/amazon/alexa/accessoryclient/common/transformers/ListTransformer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,23:1\n1549#2:24\n1620#2,3:25\n1549#2:28\n1620#2,3:29\n*S KotlinDebug\n*F\n+ 1 ListTransformer.kt\ncom/amazon/alexa/accessoryclient/common/transformers/ListTransformer\n*L\n13#1:24\n13#1:25,3\n21#1:28\n21#1:29,3\n*E\n"})
/* loaded from: classes16.dex */
public final class ListTransformer<T> implements BundleTransformer<List<? extends T>> {

    @NotNull
    private final String LIST_KEY;

    @NotNull
    private final BundleTransformer<T> subTransformer;

    public ListTransformer(@NotNull BundleTransformer<T> bundleTransformer) {
        bundleTransformer.getClass();
        this.subTransformer = bundleTransformer;
        this.LIST_KEY = "LIST_KEY";
    }

    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    public List<T> fromBundle(@NotNull Bundle bundle) {
        bundle.getClass();
        Iterable parcelableArrayList = bundle.getParcelableArrayList(this.LIST_KEY);
        if (parcelableArrayList == null) {
            parcelableArrayList = Collections.EMPTY_LIST;
        }
        parcelableArrayList.getClass();
        Iterable<Bundle> iterable = parcelableArrayList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (Bundle bundle2 : iterable) {
            BundleTransformer<T> bundleTransformer = this.subTransformer;
            bundle2.getClass();
            arrayList.add(bundleTransformer.fromBundle(bundle2));
        }
        return arrayList;
    }

    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    public Bundle toBundle(@NotNull List<? extends T> ts) {
        ts.getClass();
        Bundle bundle = new Bundle();
        String str = this.LIST_KEY;
        List<? extends T> list = ts;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(this.subTransformer.toBundle(it2.next()));
        }
        bundle.putParcelableArrayList(str, new ArrayList<>(arrayList));
        return bundle;
    }
}

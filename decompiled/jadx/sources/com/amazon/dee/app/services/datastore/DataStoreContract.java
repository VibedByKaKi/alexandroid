package com.amazon.dee.app.services.datastore;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/amazon/dee/app/services/datastore/DataStoreContract;", "", "<init>", "()V", "DataItem", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DataStoreContract {

    @NotNull
    public static final DataStoreContract INSTANCE = new DataStoreContract();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/amazon/dee/app/services/datastore/DataStoreContract$DataItem;", "", "<init>", "()V", "TABLE_NAME", "", "COLUMN_NAME_KEY", "COLUMN_NAME_VALUE", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DataItem {

        @NotNull
        public static final String COLUMN_NAME_KEY = "key";

        @NotNull
        public static final String COLUMN_NAME_VALUE = "value";

        @NotNull
        public static final DataItem INSTANCE = new DataItem();

        @NotNull
        public static final String TABLE_NAME = "DataItem";

        private DataItem() {
        }
    }

    private DataStoreContract() {
    }
}

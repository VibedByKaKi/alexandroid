package com.google.i18n.phonenumbers;

import com.google.i18n.phonenumbers.MetadataManager;
import com.google.i18n.phonenumbers.Phonemetadata;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class SingleFileMetadataSourceImpl implements MetadataSource {
    private final MetadataLoader metadataLoader;
    private final String phoneNumberMetadataFileName;
    private final AtomicReference<MetadataManager.SingleFileMetadataMaps> phoneNumberMetadataRef;

    public SingleFileMetadataSourceImpl(String str, MetadataLoader metadataLoader) {
        this.phoneNumberMetadataRef = new AtomicReference<>();
        this.phoneNumberMetadataFileName = str;
        this.metadataLoader = metadataLoader;
    }

    @Override // com.google.i18n.phonenumbers.MetadataSource
    public Phonemetadata.PhoneMetadata getMetadataForNonGeographicalRegion(int i) {
        return MetadataManager.getSingleFileMetadataMaps(this.phoneNumberMetadataRef, this.phoneNumberMetadataFileName, this.metadataLoader).get(i);
    }

    @Override // com.google.i18n.phonenumbers.MetadataSource
    public Phonemetadata.PhoneMetadata getMetadataForRegion(String str) {
        return MetadataManager.getSingleFileMetadataMaps(this.phoneNumberMetadataRef, this.phoneNumberMetadataFileName, this.metadataLoader).get(str);
    }

    public SingleFileMetadataSourceImpl(MetadataLoader metadataLoader) {
        this("/com/google/i18n/phonenumbers/data/SingleFilePhoneNumberMetadataProto", metadataLoader);
    }
}

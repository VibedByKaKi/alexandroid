package com.amazon.alexa.featureservice.repo.mapper;

import com.amazon.alexa.featureservice.remote.model.FeatureResponseMetaData;
import com.amazon.alexa.featureservice.repo.model.Feature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class FeatureResponseCollectionMapper implements RemoteMapper<List<Feature>, List<FeatureResponseMetaData>>, DatabaseMapper<List<Feature>, List<com.amazon.alexa.featureservice.database.entity.Feature>> {
    FeatureResponseDataMapper featureResponseDataMapper;

    @Inject
    public FeatureResponseCollectionMapper(FeatureResponseDataMapper featureResponseDataMapper) {
        this.featureResponseDataMapper = featureResponseDataMapper;
    }

    @Override // com.amazon.alexa.featureservice.repo.mapper.DatabaseMapper
    public List<Feature> fromDatabaseModel(List<com.amazon.alexa.featureservice.database.entity.Feature> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<com.amazon.alexa.featureservice.database.entity.Feature> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(this.featureResponseDataMapper.fromDatabaseModel(it2.next()));
        }
        return arrayList;
    }

    @Override // com.amazon.alexa.featureservice.repo.mapper.RemoteMapper
    public List<Feature> fromRemoteModel(List<FeatureResponseMetaData> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<FeatureResponseMetaData> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(this.featureResponseDataMapper.fromRemoteModel(it2.next()));
        }
        return arrayList;
    }

    public FeatureResponseDataMapper getFeatureDataMapper() {
        return this.featureResponseDataMapper;
    }

    @Override // com.amazon.alexa.featureservice.repo.mapper.DatabaseMapper
    public List<com.amazon.alexa.featureservice.database.entity.Feature> toDatabaseModel(List<Feature> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Feature> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(this.featureResponseDataMapper.toDatabaseModel(it2.next()));
        }
        return arrayList;
    }

    @Override // com.amazon.alexa.featureservice.repo.mapper.RemoteMapper
    public List<FeatureResponseMetaData> toRemoteModel(List<Feature> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Feature> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(this.featureResponseDataMapper.toRemoteModel(it2.next()));
        }
        return arrayList;
    }
}

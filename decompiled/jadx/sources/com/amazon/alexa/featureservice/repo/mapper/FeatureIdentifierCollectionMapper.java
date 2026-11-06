package com.amazon.alexa.featureservice.repo.mapper;

import com.amazon.alexa.featureservice.remote.model.FeatureIdentifierData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class FeatureIdentifierCollectionMapper implements RemoteMapper<List<String>, List<FeatureIdentifierData>> {
    FeatureIdentifierDataMapper featureIdentifierDataMapper;

    @Inject
    public FeatureIdentifierCollectionMapper(FeatureIdentifierDataMapper featureIdentifierDataMapper) {
        this.featureIdentifierDataMapper = featureIdentifierDataMapper;
    }

    @Override // com.amazon.alexa.featureservice.repo.mapper.RemoteMapper
    public List<String> fromRemoteModel(List<FeatureIdentifierData> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<FeatureIdentifierData> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(this.featureIdentifierDataMapper.fromRemoteModel(it2.next()));
        }
        return arrayList;
    }

    public FeatureIdentifierDataMapper getFeatureDataMapper() {
        return this.featureIdentifierDataMapper;
    }

    @Override // com.amazon.alexa.featureservice.repo.mapper.RemoteMapper
    public List<FeatureIdentifierData> toRemoteModel(List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(this.featureIdentifierDataMapper.toRemoteModel(it2.next()));
        }
        return arrayList;
    }
}

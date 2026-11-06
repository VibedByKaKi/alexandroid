package com.amazon.alexa.viewprovider.api.event.personalization;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class PersonalizationData {
    private int index;
    private String modelVersion;
    private String section;
    private int totalNumberOfItems;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class PersonalizationDataBuilder {
        private int index;
        private String modelVersion;
        private String section;
        private int totalNumberOfItems;

        public PersonalizationData build() {
            PersonalizationData personalizationData = new PersonalizationData();
            personalizationData.index = this.index;
            personalizationData.section = this.section;
            personalizationData.modelVersion = this.modelVersion;
            personalizationData.totalNumberOfItems = this.totalNumberOfItems;
            return personalizationData;
        }

        public PersonalizationDataBuilder withIndex(int i) {
            this.index = i;
            return this;
        }

        public PersonalizationDataBuilder withModelVersion(String str) {
            this.modelVersion = str;
            return this;
        }

        public PersonalizationDataBuilder withSection(String str) {
            this.section = str;
            return this;
        }

        public PersonalizationDataBuilder withTotalNumberOfItems(int i) {
            this.totalNumberOfItems = i;
            return this;
        }
    }

    public int getIndex() {
        return this.index;
    }

    public String getModelVersion() {
        return this.modelVersion;
    }

    public String getSection() {
        return this.section;
    }

    public int getTotalNumberOfItems() {
        return this.totalNumberOfItems;
    }
}
